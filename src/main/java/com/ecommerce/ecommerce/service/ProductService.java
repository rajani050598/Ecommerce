package com.ecommerce.ecommerce.service;
import com.ecommerce.ecommerce.Repo.ProductRepo;
import com.ecommerce.ecommerce.model.Order;
import com.ecommerce.ecommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;
    public List<Product> getallproducts(){

        return productRepo.findAll();
    }

    public Product getproductById(Long Id){
        Optional<Product> optionalProduct = productRepo.findById(Id);
        Product product=null;
        Order order=null;
       if(optionalProduct.isPresent()) product=optionalProduct.get();
        return  product;
    }
    public String addProduct(Product product){
        productRepo.save(product);
        return "added";
    }
    public String deleteById(Long Id){
        productRepo.deleteById(Id);
        return "deleted";
    }
}
