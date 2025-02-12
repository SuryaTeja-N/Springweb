package com.springwebtest.springwebtest.controller;

import java.util.List;

import com.springwebtest.springwebtest.model.product;
import com.springwebtest.springwebtest.service.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
public class productcontroller {
    
    @Autowired
    productservice service;

    @GetMapping("/products")
    public List<product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/product/{prodId}")
    public product getProductbyID(@PathVariable("prodId") int prodId) {
        return service.getProduct(prodId);
    }
    
    @PostMapping("/addproduct")
    public void addProduct(@RequestBody product p) {
        service.addProduct(p);
    }
    
    @PutMapping("/updateproduct")
    public void updateproduct(@RequestBody product p){
        service.updateproduct(p);
    }
    
    @DeleteMapping("/deleteproduct/{prodId}")
    public void deleteproduct(@PathVariable("prodId") int prodId) {
        service.deleteproduct(prodId);
    }
}
