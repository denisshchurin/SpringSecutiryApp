package com.denis.springsecurityapp.validator;

import com.denis.springsecurityapp.model.User;
import com.denis.springsecurityapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Validator for {@link com.denis.springsecurityapp.model.User} class,
 * implements {@link Validator} interface.
 *
 * @author Denis Shchurin
 * @version 1.0
 */

public class UserValidator implements Validator {

    @Autowired
    private UserService userService;

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {

    }
}
