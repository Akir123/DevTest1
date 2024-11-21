package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.entity.Product;
import com.example.repo.ProductRepository;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository repo;

    @PostMapping("/product")
    public String saveProduct(@ModelAttribute("product") Product p, Model model) {
        p = repo.save(p);

        if (p.getPid() != null) {
            model.addAttribute("msg", "Product Saved");
        }
        return "index"; // Return the name of the view template without the file extension
    }

    @GetMapping("/")
    public String loadForm(Model model) {
        model.addAttribute("product", new Product());
        return "index";
    }

    // Uncomment this method if you intend to use it
    //@GetMapping("/products")
    //public String getAllProducts(Model model) {
    //    List<Product> list = repo.findAll();
    //    model.addAttribute("products", list);
    //    return "data";
    //}
}