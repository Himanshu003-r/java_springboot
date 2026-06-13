package com.himanshu.SpringSecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String serverUp(HttpServletRequest request){
        return "Server is running on 8080" + request.getSession().getId();
    }
}
