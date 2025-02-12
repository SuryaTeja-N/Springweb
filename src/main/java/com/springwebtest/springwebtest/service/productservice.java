package com.springwebtest.springwebtest.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springwebtest.springwebtest.model.product;

@Service
public class productservice {
    // let make a list of dummy products
    List<product> products = Arrays.asList(
            new product(1, "p1", 100),
            new product(2, "p2", 200),
            new product(3, "p3", 300));

    public List<product> getProducts() {
        return products;
    }

    public product getProduct(int prodId) {
        // need to get the product by prodId (not using stream)
        for (product p : products) {
            if (p.getProdId() == prodId) {
                return p;
            }
        }
        return null;
    }
}
