package com.ecommerce.ecommerce.service;

import com.ecommerce.ecommerce.Repo.OrderRepo;
import com.ecommerce.ecommerce.model.Address;
import com.ecommerce.ecommerce.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    OrderRepo orderRepo;

    public List<Order> getAllorders(){
        return  orderRepo.findAll();
    }
    public Order getorderById(Long Id){
        Optional<Order> optionalOrder = orderRepo.findById(Id);
        Order order=null;
       if(optionalOrder.isPresent()) order=optionalOrder.get();
        return  order;
    }
    public String addOrder(Order order){
        orderRepo.save(order);
        return "added";
    }
    public String deleteById(Long Id){
        orderRepo.deleteById(Id);
        return "deleted";
    }
}
