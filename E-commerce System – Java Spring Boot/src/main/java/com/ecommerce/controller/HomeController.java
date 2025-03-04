package com.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.util.Arrays;
import com.ecommerce.model.Product;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        List<Product> products = Arrays.asList(
                new Product(1L, "Laptop", "High-performance laptop", 999.99, 10),
                new Product(2L, "Smartphone", "Latest model smartphone", 699.99, 15));
        model.addAttribute("products", products);
        return "index"; // This should match index.html in templates folder
    }
}
