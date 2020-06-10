package com.restapimysql.controller;

import com.restapimysql.entity.User;
import com.restapimysql.entity.request.UserVO;
import com.restapimysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping(path = "/delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id) {

        userRepository.deleteById(id);

        return "Deleted user with id: " + id;
    }

    @PostMapping(path = "/update")
    public String updateUser(@RequestBody UserVO userVO) {
        Optional<User> user = userRepository.findById(userVO.getId()); // bug logic
//         User user = userRepository.findById(userVO.getId()).get(); // correct logic

//        if (user.isPresent()){
//            user.get().setName(userVO.getName());
//            user.get().setEmail(userVO.getEmail());
//        } else {
//            return "No user with id: " + userVO.getId();
//        }

        // TODO: wrong
        User newUser = new User();
        newUser.setName(user.get().getName());
        newUser.setEmail(user.get().getEmail());

        // TODO: correct
//        user.setName(userVO.getName());
//        user.setEmail(userVO.getEmail());

        userRepository.save(newUser);
//        userRepository.save(user);

        return "Updated user with id: " + userVO.getId();
    }

}
