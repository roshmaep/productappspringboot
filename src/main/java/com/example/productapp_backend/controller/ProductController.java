package com.example.productapp_backend.controller;

import com.example.productapp_backend.dao.ProductDao;
import com.example.productapp_backend.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProductController {
    @Autowired
    private ProductDao dao;
    @CrossOrigin(origins = "*")

    @PostMapping(path = "add",consumes = "application/json",produces = "application/json")
    public Map<String,String> ProductAdd(@RequestBody Products p){
        System.out.println(p.getBrand().toString());
        System.out.println(p.getDistributor().toString());
        System.out.println(p.getExpdate().toString());
        System.out.println(p.getMandate().toString());
        System.out.println(p.getPrice().toString());
        System.out.println(p.getProductname().toString());
        System.out.println(p.getSellername().toString());
        System.out.println(p.getProductcode());
        dao.save(p);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }
@CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List <Products> ProductView()
    {
        return (List<Products>) dao.findAll();
    }

}
