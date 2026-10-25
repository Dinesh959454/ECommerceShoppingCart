package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

    @GetMapping("/")
    public String home() {
        return "E-Commerce Shopping Cart API is running!";
    }
}

