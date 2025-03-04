package com.ecommerce.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @PostMapping("/checkout")
    public String checkout() {
        return "Payment processed successfully!";
    }
}
