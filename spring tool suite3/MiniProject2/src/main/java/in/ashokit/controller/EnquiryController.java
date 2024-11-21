package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.DashboardResponse;
import in.ashokit.binding.EnquiryForm;
import in.ashokit.binding.EnquirySearchCriteria;
import in.ashokit.entity.StudentEnquiryEntity;
import in.ashokit.service.EnquiryService;
import jakarta.servlet.http.HttpSession;

@Controller
public class EnquiryController {
    @Autowired
    private EnquiryService enquiryService;

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "Index";
    }

    @GetMapping("/dashboard")
    public String dashboardPage(Model model, HttpSession session) {
        Integer userId = (Integer) session.getAttribute("userId");
        DashboardResponse dashboardData = enquiryService.getDashboardData(userId);
        model.addAttribute("dashboardData", dashboardData);
        return "dashboard";
    }

    @GetMapping("/addEnquiry")
    public String addEnquiryPage(Model model) {
        // get courses for dropdown
        List<String> course = enquiryService.getCourses();
        // get enq status for dropdown
        List<String> status = enquiryService.getEnquiryStatus();
        // create binding class obj
        EnquiryForm formObj = new EnquiryForm();
        // set data in model obj
        model.addAttribute("courseName", course);
        model.addAttribute("statusName", status);
        model.addAttribute("formObj", formObj);
        return "addEnquiry";
    }

    @PostMapping("/addEnquiry")
    public String addEnquiry(@ModelAttribute("formObj") EnquiryForm formObj, Model model, HttpSession session) {
        System.out.println(formObj);
        boolean status = enquiryService.saveEnquiry(formObj);
        if (status) {
            model.addAttribute("succMsg", "Enquiry Added");
        } else {
            model.addAttribute("errMsg", "Problem Occurred");
        }
        return "addEnquiry";
    }

    @GetMapping("/viewEnquiry")
    public String viewEnquiryPage(Model model) {
        initForm(model);
        List<StudentEnquiryEntity> enquiry = enquiryService.getEnquiry();
        model.addAttribute("enquiry", enquiry);
        return "viewEnquiry";
    }

    private void initForm(Model model) {
        // get courses for dropdown
        List<String> course = enquiryService.getCourses();
        // get enquirystatus for dropdown
        List<String> status = enquiryService.getEnquiryStatus();
        // create binding class obj
        EnquiryForm formObj = new EnquiryForm();
        // set data in model obj
        model.addAttribute("courseName", course);
        model.addAttribute("statusName", status);
        model.addAttribute("formObj", formObj);
    }

    @GetMapping("/filter-enquiry")
    public String getFilteredEnquiry(String course, String mode, String statusName, Model model, HttpSession session) {
        EnquirySearchCriteria criteria = new EnquirySearchCriteria();
        criteria.setCourseName(course);
        criteria.setClassMode(mode);
        criteria.setStatusName(statusName);

        Integer userId = (Integer) session.getAttribute("userId");
        List<StudentEnquiryEntity> filteredEnqs = enquiryService.getFilteredEnqs(criteria, userId);
        model.addAttribute("viewEnquiry", filteredEnqs);
        return "Filter-Enquiry-Page";
    }
}
