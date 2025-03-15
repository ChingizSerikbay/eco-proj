package com.telusko.ecom_proj.service;

import com.telusko.ecom_proj.model.Product;
import com.telusko.ecom_proj.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProducts() {

        return productRepo.findAll();
    }


    public Product getProductById(int id) {

        Product product = productRepo.findById(id).get();
        System.out.println(product);
        return product;
    }
}
