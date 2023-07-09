package com.ecommerce.ecommerce.controller;

import com.ecommerce.ecommerce.model.Address;
import com.ecommerce.ecommerce.model.Category;
import com.ecommerce.ecommerce.model.Product;
import com.ecommerce.ecommerce.service.AddressService;
import com.ecommerce.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/product")
public class ProductController {
    @Autowired
   ProductService productService;
    @GetMapping("getAll")
    public List<Product> getAllproduct(){
        return  productService.getallproducts();

    }
    @GetMapping("getbyid/{Id}")
    public Product getproductById(@PathVariable Long Id){
        return productService.getproductById(Id);

    }
    @PostMapping("addproduct")
    public  String addproduct(@RequestBody Product product){
        return productService.addProduct(product);
    }
    @DeleteMapping("delete/{Id}")
    public String deleteById(@PathVariable Long Id){
        return productService.deleteById(Id);
    }


}
