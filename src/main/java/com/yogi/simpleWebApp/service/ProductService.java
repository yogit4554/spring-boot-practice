package com.yogi.simpleWebApp.service;

import com.yogi.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"Iphone",50000),
            new Product(102,"Canon Camera", 70000),
            new Product(103,"Shure Mic",10000)));

    public List<Product> getProducts(){
        return products;
    }


    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst()
                .orElse(new Product(100,"No Item",0));
    }

    public Product addProduct(Product product) {
        products.add(product);
        return product;
    }

    public Product updateProduct(int prodId, Product product) {
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            if (p.getProdId() == prodId) {
                products.set(i, product);
                return product;
            }
        }
        return null;
    }

    public Product deleteProduct(int prodId) {
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            if (p.getProdId() == prodId) {
                products.remove(i);
                return p;
            }
        }
        return null;
    }
}
