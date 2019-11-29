import com.dao.UserDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserSystemAnnotationTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("/spring-application.xml");
        UserDAO userRepo = context.getBean("userRepo23", UserDAO.class);
        System.out.println(userRepo.getAllUsers());
    }
}