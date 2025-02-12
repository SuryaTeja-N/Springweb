package com.springwebtest.springwebtest.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springwebtest.springwebtest.model.product;

@Service
public class productservice {
    // let make a list of dummy products
    List<product> products = new ArrayList<>( Arrays.asList(
            new product(1, "p1", 100),
            new product(2, "p2", 200),
            new product(3, "p3", 300)));

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
        return new product(69, "dummy product", 169);
    }

    public void addProduct(product p) {
        products.add(p);
    }

    public void updateproduct(product p) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == p.getProdId()) {
                products.set(i, p);
                return;
            }
        }
    }

    public void deleteproduct(int prodId) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prodId) {
                products.remove(i);
                return;
            }
        }
    }
}
