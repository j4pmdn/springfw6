package com.hdoan.simpleWebApp.repository;

import com.hdoan.simpleWebApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
