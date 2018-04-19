package junit_test;

import java.util.List;

public class UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public List getAllUsers(){
        return getUserDao().getAllUsers();
    }
}
