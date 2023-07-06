package com.example.SpringWebTelusko3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @GetMapping("/products")
    public List<Product> getAllProducts()
    {
        return service.getAllProducts();
    }
    @GetMapping("/products/{name}")
    public Product getProduct(@PathVariable String name)
    {
        return service.getProduct(name);
    }
}
