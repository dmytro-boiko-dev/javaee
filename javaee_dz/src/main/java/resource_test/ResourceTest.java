package resource_test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ResourceTest {
    public static void main(String[] args) throws IOException {

        //connecting properties file
        //prop. file should be only in resources directory
        InputStream resourceAsStream = ResourceTest.class.getClassLoader().
                getResourceAsStream("user.properties");

        //this is container for a input stream; calls Properties
        Properties properties = new Properties();
        properties.load(resourceAsStream);  //upload stream to properties

        System.out.println("username: " + properties.getProperty("username"));
        System.out.println("password: " + properties.getProperty("password"));

    }
}
