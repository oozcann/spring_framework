package com.spring.tutorial.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    private UserValidator userValidator;
    @Autowired
    BindingResult bindingResult;
    @PostMapping("/register")
    public BindingResult register(User user, BindingResult bindingResult) {

        userValidator.validate(user, bindingResult);

        return bindingResult;
    }
}
