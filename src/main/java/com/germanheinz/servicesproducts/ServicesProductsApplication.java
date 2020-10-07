package com.germanheinz.servicesproducts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@RibbonClient(name = "services-products")
@SpringBootApplication
public class ServicesProductsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicesProductsApplication.class, args);
    }

}
