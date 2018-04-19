package com;

import com.dao.UserRepository;
import com.models.UsersEntity;
import com.services.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/spring-application-test.xml")
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void userServiceFindAll(){
        List<UsersEntity> allUsers = userService.getAllUsers();
        Assert.assertNotNull(allUsers);
    }

    @Test
    public void userRepositoryFindAll(){
        List<UsersEntity> usersEntities = userRepository.findByName("name1");
        Assert.assertNotNull(usersEntities);
    }

    @Test
    public void userNamedQuery(){
        List<UsersEntity> allUsersAlias = userRepository.findAllUsersAlias();
        Assert.assertNotNull(allUsersAlias);
    }
}
