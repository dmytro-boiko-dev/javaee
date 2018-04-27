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

//    new: save and update
    public List<UsersEntity> saveUser(UsersEntity usersEntity){
        return userDAO.saveNewUserEntity(usersEntity);
    }

    public List<UsersEntity> updateUser(UsersEntity usersEntity){
        return userDAO.updateNewUserEntity(usersEntity);
    }

}
