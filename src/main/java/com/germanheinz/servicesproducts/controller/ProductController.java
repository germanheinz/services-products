package com.germanheinz.servicesproducts.controller;

import com.germanheinz.servicesproducts.entity.Product;
import com.germanheinz.servicesproducts.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/findAll")
    public List<Product> getAllProducts(){
        return productService.findAll();
    }

    @GetMapping("/find/{id}")
    public Product getById(@PathVariable("id") Long id){
        return productService.findById(id);
    }

}
