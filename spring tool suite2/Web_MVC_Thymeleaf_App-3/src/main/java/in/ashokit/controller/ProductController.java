package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import in.ashokit.entity.ProductEntity;
import in.ashokit.service.ProductService;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public String getList(Model model) {
        List<ProductEntity> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "list";
    }

    @GetMapping("/new")
    public String createProductForm(Model model) {
        model.addAttribute("product", new ProductEntity());
        return "create";
    }

    @PostMapping
    public String createProduct(@ModelAttribute ProductEntity productEntity) {
        productService.saveProduct(productEntity);
        return "redirect:/products";
    }

    @GetMapping("/edit/{id}")
    public String editProductForm(@PathVariable Long id, Model model) {
        ProductEntity productEntity = productService.getProductById(id);
        model.addAttribute("productEntity", productEntity);
        return "edit";
    }

    @PostMapping("/{id}")
    public String updateProduct(@PathVariable Integer id, @ModelAttribute ProductEntity productEntity) {
        productEntity.setId(id);
        productService.saveProduct(productEntity);
        return "redirect:/products";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProductById(id);
        return "redirect:/products";
    }
}
