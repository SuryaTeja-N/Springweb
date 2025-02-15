package com.springwebtest.springwebtest.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.springwebtest.springwebtest.model.product;
import com.springwebtest.springwebtest.repo.productrepo;

@Service
public class productservice {

    // let make a list of dummy products
    // List<product> products = new ArrayList<>( Arrays.asList(
    //         new product(1, "p1", 100),
    //         new product(2, "p2", 200),
    //         new product(3, "p3", 300)));

    // now we have created a repository lets use that instead of dummy data
    @Autowired
    productrepo repo;

    public List<product> getProducts() {
        return repo.findAll();
    }

    public product getProduct(int prodId) {
        // need to get the product by prodId (not using stream)
        // for (product p : products) {
        //     if (p.getProdId() == prodId) {
        //         return p;
        //     }
        // }
        // return new product(69, "dummy product", 169);
        return repo.findById(prodId).orElse(null);
    }

    public void addProduct(product p) {
        // products.add(p);
        repo.save(p);
    }

    public void updateproduct(product p) {
        // for (int i = 0; i < products.size(); i++) {
        //     if (products.get(i).getProdId() == p.getProdId()) {
        //         products.set(i, p);
        //         return;
        //     }
        // }
        repo.save(p);
    }

    public void deleteproduct(int prodId) {
        // for (int i = 0; i < products.size(); i++) {
        //     if (products.get(i).getProdId() == prodId) {
        //         products.remove(i);
        //         return;
        //     }
        // }
        repo.deleteById(prodId);
    }
}
