package com.ecommerce.ecommerce.Repo;

import com.ecommerce.ecommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class ProductRepo {
    @Autowired
    Map<Integer, Product> products;
    public  Map<Integer, Product> getallproducts(){
        return products;

    }
}
