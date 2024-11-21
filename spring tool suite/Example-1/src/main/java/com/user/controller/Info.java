package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.user.service.Personal;

@Controller
public class Info {

@Autowired
private Personal personal;
	
	@GetMapping("/Wow")
	public String getDetails(Model model) {
		model.addAttribute("adis", personal.getAdi());
		model.addAttribute("mayuras", personal.getMayur());
		model.addAttribute("susantas", personal.getSusanta());
		
		return "Wow";
	}
}
