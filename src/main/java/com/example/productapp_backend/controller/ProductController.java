package com.example.productapp_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @PostMapping("/")
    public String Homepage(){
        return "welcome to product page";
    }
    @PostMapping("add")
    public String Productadd(){
        return "welcome to product add page";
    }
    @PostMapping("search")
    public String Productsearch(){
        return "welcome to product search page";
    }
    @PostMapping("edit")
    public String Productedit(){
        return "welcome to product edit page";
    }
}
