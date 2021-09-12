package com.example.controller;

import com.example.ProductRepository;
import com.example.pojo.Products;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * This is Product controller class this class handle business operation product
 * table related.
 * */

@RestController
public class ProductController {
private ProductRepository productRepository;

@GetMapping("/products")
public List<Products> getProductAll(){
    return productRepository.findAll();
   }
}
