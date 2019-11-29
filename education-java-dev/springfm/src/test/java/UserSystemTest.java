import com.dao.UserDAO;
import com.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserSystemTest {
    public static void main(String[] args) {
//        UserService userService = new UserService();
//        List allUsers = userService.getAllUsers();
//        System.out.println(allUsers);

        ApplicationContext context = new ClassPathXmlApplicationContext("/spring-application.xml");
        UserDAO userRepo = context.getBean("userRepo23", UserDAO.class);
        System.out.println(userRepo.getAllUsers());
//
//        UserService userService = context.getBean("userService", UserService.class);
//        System.out.println(userService.hashCode());
//        System.out.println(userService.getAllUsers());

        UserDAO userRepo1 = context.getBean("userRepo23", UserDAO.class);
        System.out.println(userRepo1.hashCode());

        userRepo1 = context.getBean("userRepo23", UserDAO.class);
        System.out.println(userRepo1.hashCode());


        UserService userService2 = context.getBean("userService2", UserService.class);
        System.out.println(userService2.getAllUsers());

        UserService userService3 = context.getBean("userService3", UserService.class);
        System.out.println(userService3.getAllUsers());

    }
}