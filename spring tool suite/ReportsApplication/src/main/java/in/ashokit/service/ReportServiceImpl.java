package in.ashokit.service;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import in.ashokit.entity.CitizenPlan;
import in.ashokit.repo.CitizenPlanRepository;
import in.ashokit.request.SearchRequest;
import in.ashokit.utils.EmailUtils;
import in.ashokit.utils.ExcelGenerator;
import in.ashokit.utils.PdfGenerator;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private CitizenPlanRepository planRepo;

    @Autowired
    private ExcelGenerator excelGenerator;

    @Autowired
    private PdfGenerator pdfGenerator;

    @Autowired
    private EmailUtils emailUtils;

    @Override
    public List<String> getPlanNames() {
        return planRepo.getPlanNames();
    }

    @Override
    public List<String> getPlanStatus() {
        return planRepo.getPlanStatus();
    }

    @Override
    public List<CitizenPlan> search(SearchRequest request) {
        CitizenPlan entity = new CitizenPlan();

        if (request.getPlanName() != null && !request.getPlanName().isEmpty()) {
            entity.setPlanName(request.getPlanName());
        }

        if (request.getPlanStatus() != null && !request.getPlanStatus().isEmpty()) {
            entity.setPlanStatus(request.getPlanStatus());
        }

        if (request.getGender() != null && !request.getGender().isEmpty()) {
            entity.setGender(request.getGender());
        }

        if (request.getStartDate() != null && !request.getStartDate().isEmpty()) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.parse(request.getStartDate(), formatter);
            entity.setPlanStartDate(localDate);
        }

        if (request.getEndDate() != null && !request.getEndDate().isEmpty()) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.parse(request.getEndDate(), formatter);
            entity.setPlanEndDate(localDate);
        }

        return planRepo.findAll(Example.of(entity));
    }

    @Override
    public boolean exportExcel(HttpServletResponse response) throws Exception {
    	File f = new File("Plans.xls");
        // Generate the Excel file and save it to a byte array
       List<CitizenPlan> plans = planRepo.findAll();
        excelGenerator.generate(response, plans);
        String subject = "Test Mail Subject";
        String body = "<h1>Test Mail Body</h1>";
        String to = "akir47231@gmail.com";
        
        emailUtils.sendEmail(subject, body, to, f);
        return true;
    }

    @Override
    public boolean exportPdf(HttpServletResponse response) throws Exception {
        List<CitizenPlan> plans = planRepo.findAll();
        pdfGenerator.generate(response, plans);
        return true;
    }
}
