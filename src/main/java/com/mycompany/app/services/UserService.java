package com.mycompany.app.services;

import java.util.Optional;

import com.mycompany.app.daos.UserDAO;
import com.mycompany.app.models.User;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserService {
    private final UserDAO userDao;
    public boolean isValidUsername(String username){
        return username.matches("^(?=[a-zA-Z0-9._]{8,20}$)(?!.*[_.]{2})[^_.].*[^_.]$");
    }
    public boolean isUniqueUsername(String username){
        Optional<User> userOpt = userDao.findByUsername(username);

        return userOpt.isEmpty();
    }
}
