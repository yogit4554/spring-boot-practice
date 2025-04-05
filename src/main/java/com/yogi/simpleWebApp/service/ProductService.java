package com.yogi.simpleWebApp.service;

import com.yogi.simpleWebApp.model.Product;
import com.yogi.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {
    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101,"Iphone",50000),
//            new Product(102,"Canon Camera", 70000),
//            new Product(103,"Shure Mic",10000)));

    public List<Product> getProducts(){
        return repo.findAll();
    }


    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(null);
    }

    public Product addProduct(Product product) {
        repo.save(product);
        return product;
    }

    public Product updateProduct(int prodId, Product product) {
        repo.save(product);
        return product;
    }

    public Product deleteProduct(int prodId) {
        Product p = repo.findById(prodId).orElse(null);
        if (p != null) {
            repo.deleteById(prodId);
        }
        return p;
    }
}
