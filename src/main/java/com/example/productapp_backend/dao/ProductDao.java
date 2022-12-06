package com.example.productapp_backend.dao;

import com.example.productapp_backend.model.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository <Products,Integer> {
}
