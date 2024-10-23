package com.spring.tutorial.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;

        if (user.getUsername() == null || user.getUsername().isEmpty()) {
            errors.rejectValue("username", "username.empty", "Kullanıcı adı boş olamaz.");
        }

        if (user.getEmail() == null || user.getEmail().isEmpty()) {
            errors.rejectValue("email", "email.empty", "E-posta boş olamaz.");
        }
        System.out.println(errors);
    }
}
