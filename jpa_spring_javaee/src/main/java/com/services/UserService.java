package com.services;

import com.dao.UserDAO;
import com.models.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public List<UsersEntity> getAllUsers(){
        return userDAO.getAllUsers();
    }
}
