package com.yogi.simpleWebApp.repository;

import com.yogi.simpleWebApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    // This interface will automatically provide CRUD operations for the Product entity
    // No need to implement any methods, Spring Data JPA will handle it for you
}
