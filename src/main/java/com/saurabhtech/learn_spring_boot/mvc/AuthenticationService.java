package com.saurabhtech.learn_spring_boot.mvc;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password){
        boolean isValidUsername = username.equalsIgnoreCase("in28min");
        boolean isValidPassword = password.equalsIgnoreCase("dummy");
        return  isValidUsername && isValidPassword;
    }
}
