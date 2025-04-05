package com.yogi.simpleWebApp.controller;


import com.yogi.simpleWebApp.model.Product;
import com.yogi.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Provider;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        System.out.println("Product is: "+product);
        return service.addProduct(product);
    }

    @PutMapping("/products/{prodId}")
    public Product updateProduct(@PathVariable int prodId, @RequestBody Product product){
        System.out.println("Product is: "+product);
        return service.updateProduct(prodId, product);
    }

    @DeleteMapping("/products/{prodId}")
    public Product deleteProduct(@PathVariable int prodId){
        return service.deleteProduct(prodId);
    }
}
