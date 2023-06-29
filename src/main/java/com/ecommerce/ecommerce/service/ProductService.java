package com.ecommerce.ecommerce.service;

import com.ecommerce.ecommerce.Repo.ProductRepo;
import com.ecommerce.ecommerce.model.Category;
import com.ecommerce.ecommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ProductService {
    @Autowired
  ProductRepo productRepo;
    public Map<Integer, Product> getallproducts(){
        return productRepo.getallproducts();
    }
    public List<Product> getproductsbelowrange(Double price){
        List<Product> priceFilteredProducts = new ArrayList<>();
        Map<Integer, Product> productList = getallproducts();
        for(Integer id : productList.keySet()){
            if(productList.get(id).getProductPrice()<=price)
                priceFilteredProducts.add(productList.get(id));
        }
        return  priceFilteredProducts;

    }
    public String addproducts(List<Product> products){
        Map<Integer, Product> productList = getallproducts();
        for(Product product : products){
            productList.put(product.getProductId(),product);
        }
        return "products are added";
    }
   public List<Product> getProductsByCategory(Category category){
       List<Product> pructsbycategory = new ArrayList<>();
       Map<Integer, Product> productList = getallproducts();
       for(Integer id :productList.keySet()){
           if(productList.get(id).getProductCategory().equals(category))
               pructsbycategory.add(productList.get(id));
       }
       return pructsbycategory;
   }

    public String deleteproductById(Integer proId){
        Map<Integer, Product> productList = getallproducts();
        Product product = productList.get(proId);
        if(product!=null){
            productList.remove(proId);
            return proId + " removed!!!";
        }
        else {
            return proId + " not found!!!";
        }
    }
    public String updateProductByDiscount(Integer percentagediscount){
        Map<Integer, Product> productList = getallproducts();
        for(Integer id : productList.keySet()){
            Double actualprice = productList.get(id).getProductPrice();
            Double updatedprice = actualprice*(1-(percentagediscount/(100.0)));
            productList.get(id).setProductPrice(updatedprice);
        }
        return "price updated";
    }
}
