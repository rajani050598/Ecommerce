package com.ecommerce.ecommerce.controller;
import com.ecommerce.ecommerce.model.Address;
import com.ecommerce.ecommerce.model.User;
import com.ecommerce.ecommerce.service.AddressService;
import com.ecommerce.ecommerce.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    Userservice userservice;
    @GetMapping("getAll")
    public List<User> getAlluser(){
        return  userservice.getallusers();

    }
    @GetMapping("getbyid/{Id}")
    public User getuserById(@PathVariable Long Id){
        return userservice.getusertById(Id);

    }
    @PostMapping("adduser")
    public  String addUser(@RequestBody User user){
        return userservice.addUser(user);
    }
    @DeleteMapping("delete/{Id}")
    public String deleteById(@PathVariable Long Id){
        return userservice.deleteById(Id);
    }

}
