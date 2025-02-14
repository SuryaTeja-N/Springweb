package com.springwebtest.springwebtest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springwebtest.springwebtest.model.product;

@Repository
public interface productrepo extends JpaRepository<product, Integer> {
    
}
