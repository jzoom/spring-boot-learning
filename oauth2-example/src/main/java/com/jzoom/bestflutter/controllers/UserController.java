package com.jzoom.bestflutter.controllers;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Component
@RestController
public class UserController {

    @ResponseBody
    @RequestMapping("/user")
    public Principal user(Principal user){

        return user;
    }

}
