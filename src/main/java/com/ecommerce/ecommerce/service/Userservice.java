package com.ecommerce.ecommerce.service;

import com.ecommerce.ecommerce.Repo.UserRepo;

import com.ecommerce.ecommerce.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Userservice {
    @Autowired
    UserRepo userRepo;
    public List<User> getallusers(){

        return userRepo.findAll();
    }

    public User getusertById(Long Id){
        Optional<User> optionalUser = userRepo.findById(Id);
        User user=null;

        if(optionalUser.isPresent()) user=optionalUser.get();
        return  user;
    }
    public String addUser(User user){
        userRepo.save(user);
        return "added";
    }
    public String deleteById(Long Id){
        userRepo.deleteById(Id);
        return "deleted";
    }
}
