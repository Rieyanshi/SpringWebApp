package com.example.SpringWebTelusko3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductDB db ;
   // public void addProduct(Product p) {
     //      db.save(p);
      //}
    public List<Product> getAllProducts() {
       List<Product> allP = db.findAll();
       return allP;
    }

    public Product getProduct(String name) {

        return db.findByName(name);
    }
}
