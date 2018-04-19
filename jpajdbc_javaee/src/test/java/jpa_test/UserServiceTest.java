package jpa_test;

import com.models.User;
import junit_test.UserDao;
import junit_test.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class UserServiceTest {

    List<Integer> integerList;
    @Before
    public void init(){
        this.integerList = Arrays.asList(1, 2, 3, 4);
    }

    @Test
    public void userServiceTest(){
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
        UserDao userDao = mock(UserDao.class);
        when(userDao.getAllUsers()).thenReturn(integerList);

        UserService userService = mock(UserService.class);
        when(userService.getUserDao()).thenReturn(userDao);

        Assert.assertArrayEquals(userService.getUserDao().getAllUsers().toArray(),
                integerList.toArray());

    }


    @Test
    public void testUserServiceAsSpy(){
        UserService userService = new UserService();
        UserService spy = spy(userService);

        UserDao userDAOMock = mock(UserDao.class);
        when(userDAOMock.getAllUsers()).thenReturn(integerList);

        when(spy.getUserDao()).thenReturn(userDAOMock);
        List allUsers = spy.getAllUsers();

        Assert.assertArrayEquals(allUsers.toArray(), integerList.toArray());

    }
}
