package com.germanheinz.servicesproducts.controller;

import com.germanheinz.servicesproducts.entity.Product;
import com.germanheinz.servicesproducts.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
    public Product getById(@PathVariable("id") Long id) { return productService.findById(id); }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Product save(@RequestBody Product product){
        return productService.save(product);
    }
    @PutMapping("edit/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Product edit(@RequestBody Product product, @PathVariable Long id){
        Product productFound = productService.findById(id);

        product.setName(productFound.getName());
        product.setPrice(productFound.getPrice());

        return productService.save(productFound);

    }
    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        productService.delete(id);
    }

}
