package in.ashokit.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.CitizenPlan;
import in.ashokit.repo.CitizenPlanRepository;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    private CitizenPlanRepository repo;

    @Override
    public void run(ApplicationArguments args) throws Exception {
    	repo.deleteAll();
        // cash plan data
        CitizenPlan c1 = new CitizenPlan();
        c1.setCitizenName("aditya");
        c1.setGender("male");
        c1.setPlanName("cash");
        c1.setPlanStatus("approved");
        c1.setPlanStartDate(LocalDate.now());
        c1.setPlanEndDate(LocalDate.now().plusMonths(6));
        c1.setBenefitAmt(5000.00);

        CitizenPlan c2 = new CitizenPlan();
        c2.setCitizenName("ashu");
        c2.setGender("female");
        c2.setPlanName("food");
        c2.setPlanStatus("denied");
        c2.setDenialReason("rental income");

        CitizenPlan c3 = new CitizenPlan();
        c3.setCitizenName("mayur");
        c3.setGender("male");
        c3.setPlanName("cash");
        c3.setPlanStatus("terminated");
        c3.setPlanStartDate(LocalDate.now().minusMonths(4));
        c3.setPlanEndDate(LocalDate.now().plusMonths(6));
        c3.setBenefitAmt(5000.00);
        c3.setDenialReason("employed");

        CitizenPlan c4 = new CitizenPlan();
        c4.setCitizenName("darshan");
        c4.setGender("male");
        c4.setPlanName("food");
        c4.setPlanStatus("approved");
        c4.setPlanStartDate(LocalDate.now());
        c4.setPlanEndDate(LocalDate.now().plusMonths(6));
        c4.setBenefitAmt(4000.00);

        CitizenPlan c5 = new CitizenPlan();
        c5.setCitizenName("madan");
        c5.setGender("male");
        c5.setPlanName("cash");
        c5.setPlanStatus("denied");
        c5.setDenialReason("rental income");

        CitizenPlan c6 = new CitizenPlan();
        c6.setCitizenName("smita");
        c6.setGender("female");
        c6.setPlanName("food");
        c6.setPlanStatus("terminated");
        c6.setPlanStartDate(LocalDate.now().minusMonths(4));
        c6.setPlanEndDate(LocalDate.now().plusMonths(6));
        c6.setBenefitAmt(8000.00);
        c6.setDenialReason("employed");

        // medical plan data
        CitizenPlan c7 = new CitizenPlan();
        c7.setCitizenName("rohan");
        c7.setGender("male");
        c7.setPlanName("employment");
        c7.setPlanStatus("approved");
        c7.setPlanStartDate(LocalDate.now());
        c7.setPlanEndDate(LocalDate.now().plusMonths(6));
        c7.setBenefitAmt(5000.00);

        CitizenPlan c8 = new CitizenPlan();
        c8.setCitizenName("ashiya");
        c8.setGender("female");
        c8.setPlanName("medical");
        c8.setPlanStatus("denied");
        c8.setDenialReason("rental income");

        CitizenPlan c9 = new CitizenPlan();
        c9.setCitizenName("mrunal");
        c9.setGender("male");
        c9.setPlanName("employment");
        c9.setPlanStatus("terminated");
        c9.setPlanStartDate(LocalDate.now().minusMonths(4));
        c9.setPlanEndDate(LocalDate.now().plusMonths(6));
        c9.setBenefitAmt(5000.00);
        c9.setDenialReason("employed");

        CitizenPlan c10 = new CitizenPlan();
        c10.setCitizenName("chetan");
        c10.setGender("male");
        c10.setPlanName("medical");
        c10.setPlanStatus("denied");

        CitizenPlan c11 = new CitizenPlan();
        c11.setCitizenName("mohan");
        c11.setGender("male");
        c11.setPlanName("employment");
        c11.setPlanStatus("denied");
        c11.setDenialReason("property income");

        CitizenPlan c12 = new CitizenPlan();
        c12.setCitizenName("avika");
        c12.setGender("female");
        c12.setPlanName("medical");
        c12.setPlanStatus("terminated");
        c12.setPlanStartDate(LocalDate.now().minusMonths(4));
        c12.setPlanEndDate(LocalDate.now().plusMonths(6));
        c12.setBenefitAmt(9000.00);
        c12.setTerminationRsnl("Govt Job");  // Assuming the correct setter method

        List<CitizenPlan> list = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12);
        repo.saveAll(list);
    }
}
