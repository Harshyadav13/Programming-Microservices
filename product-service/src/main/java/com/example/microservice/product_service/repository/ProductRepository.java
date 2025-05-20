package com.example.microservice.product_service.repository;

import com.example.microservice.product_service.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
    // You can define custom queries here if needed
}
