package com.germanheinz.servicesproducts.service;

import com.germanheinz.servicesproducts.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product findById(Long id);

}
