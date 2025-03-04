package com.ecommerce.controller;

import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller // ✅ Changed to @Controller for Thymeleaf
@RequestMapping("/products") // Base path for product-related actions
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    // ✅ Display all products on Thymeleaf page
    @GetMapping("/")
    public String showProducts(Model model) {
        List<Product> products = productRepository.findAll();
        model.addAttribute("products", products);
        return "index"; // Must match Thymeleaf template file name
    }

    // ✅ Get all products (API endpoint)
    @GetMapping("/api")
    @ResponseBody
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // ✅ Add a product (API endpoint)
    @PostMapping("/api")
    @ResponseBody
    public Product addProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    // ✅ Delete a product (API endpoint)
    @DeleteMapping("/api/{id}")
    @ResponseBody
    public void deleteProduct(@PathVariable Long id) {
        productRepository.deleteById(id);
    }
}
