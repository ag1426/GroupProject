package com.example.groupproject.services;

import com.example.groupproject.dao.ProductDao;
import com.example.groupproject.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {


    @Autowired
    private ProductDao productDao;

    public List<Product> getAllProduct(){
        List<Product> productList = new ArrayList<>();
       Iterable<Product> products = productDao.findAll();
       products.forEach(e->{
           productList.add(e);
       });
       return productList;

    }


}
