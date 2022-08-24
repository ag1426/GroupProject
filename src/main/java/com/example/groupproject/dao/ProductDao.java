package com.example.groupproject.dao;

import com.example.groupproject.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends CrudRepository<Product, String> {
}
