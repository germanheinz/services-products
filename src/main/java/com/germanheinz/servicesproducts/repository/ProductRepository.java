package com.germanheinz.servicesproducts.repository;

import com.germanheinz.servicesproducts.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
