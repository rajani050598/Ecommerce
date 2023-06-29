package com.ecommerce.ecommerce.controller;

import com.ecommerce.ecommerce.model.Category;
import com.ecommerce.ecommerce.model.Product;
import com.ecommerce.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api")
public class ProductController {
    @Autowired
    ProductService productService;

    //get all products
    @GetMapping("products")
    public Map<Integer, Product> getpruducts(){
        return productService.getallproducts();
    }

    //get all products below a particular price range
    @GetMapping("products/prices/{price}")
    public List<Product> getProductsBelowPrice(@PathVariable Double price){
        return  productService.getproductsbelowrange(price);

    }
    //get all products belonging to a particular category
    @GetMapping("products/category/{category}")
    public List<Product> getproductsByCategory(@PathVariable Category category)
    {
        return productService.getProductsByCategory(category);
    }

    //add products
    @PostMapping("products")
    public  String addproducts(@RequestBody List<Product> products)
    {
        return  productService.addproducts(products);
    }
    //remove a particular product based on product id

    @DeleteMapping("products/delete/{proId}")
    public String deleteproductById(@PathVariable Integer proId){
        return productService.deleteproductById(proId);
    }

    //update price of products based on some discount
    @PutMapping("products/discount/{percentagediscount}")
    public String updateProductByDiscount(@PathVariable Integer percentagediscount)
    {
        return productService.updateProductByDiscount(percentagediscount);
    }

}
