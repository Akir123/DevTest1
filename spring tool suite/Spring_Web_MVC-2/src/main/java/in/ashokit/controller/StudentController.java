package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.Student;
import in.ashokit.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/")
public String loadIndexPage(Model model) {
		
		formInitBinding(model);
	
		return "index";
	}

	private void formInitBinding(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("courses", service.getCourses());
		model.addAttribute("prefTimings", service.getTimings());
	}
	
	@PostMapping("/save")
public String handleSubmit(Student s, Model model) {
		
		System.out.println(s);
		model.addAttribute("msg", "Data Saved !!!");
		
		formInitBinding(model);
	
	return "index";
	}
}
