package com.himanshu.SpringSecurity.service;

import com.himanshu.SpringSecurity.model.Users;
import com.himanshu.SpringSecurity.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo repo;
    public Users register (Users user){
           return repo.save(user);
    }
}
