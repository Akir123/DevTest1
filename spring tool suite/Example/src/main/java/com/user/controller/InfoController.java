package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.user.service.InfoService;

@Controller
public class InfoController {

    @Autowired
    private InfoService infoService;

    @GetMapping("/info")
    public String showInfo(Model model) {
        model.addAttribute("users", infoService.getUsers());
        model.addAttribute("products", infoService.getProducts());
        model.addAttribute("orders", infoService.getOrders());
        return "info";
    }
}

