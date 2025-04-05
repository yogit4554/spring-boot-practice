package com.yogi.simpleWebApp.controller;


import com.yogi.simpleWebApp.model.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.Provider;
import java.util.List;

@RestController
public class ProductController {

    @RequestMapping("/products")
    public List<Product>getProduct(){
        return Provider.Service.getProducts();
    }
}
