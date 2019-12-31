package com.restapimysql.controller;

import com.restapimysql.entity.User;
import com.restapimysql.entity.request.UserVO;
import com.restapimysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(path = "/users")
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping(path = "/add")
    public String addUser(@RequestBody UserVO userVO) {
        User user = new User();
        user.setName(userVO.getName());
        user.setEmail(userVO.getEmail());
        userRepository.save(user);

        return "Saved";
    }
}
