package com.springwebtest.springwebtest.controller;

import java.util.List;

import com.springwebtest.springwebtest.model.product;
import com.springwebtest.springwebtest.service.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productcontroller {
    
    @Autowired
    productservice service;

    @RequestMapping("/products")
    public List<product> getProducts() {
        return service.getProducts();
    }

    @RequestMapping("/product/{prodId}")
    public product getProductbyID(@PathVariable("prodId") int prodId) {
        return service.getProduct(prodId);
    }
}
