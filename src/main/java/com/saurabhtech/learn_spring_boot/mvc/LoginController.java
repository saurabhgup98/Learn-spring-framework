package com.saurabhtech.learn_spring_boot.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/web-mvc")
public class LoginController {

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping("/login")
    public String goToLoginPage(){
        return "login";
    }

    @PostMapping("/welcome")
    public String goToWelcomePage(@RequestParam String name, String password, ModelMap modelMap){
        modelMap.put("name",name);
        modelMap.put("pass",password);
        if (authenticationService.authenticate(name,password)){
            return "welcome";
        }
        modelMap.put("errorMsg","Invalid Credentials");
        return "login";
    }
}
