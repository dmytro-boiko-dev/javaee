package resource_test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ResourceTest {
    public static void main(String[] args) throws IOException {
        InputStream resourceAsStream = ResourceTest.class.getClassLoader()
                .getResourceAsStream("user.properties"); //absolute path

        //create container for properties
        Properties properties = new Properties();
        properties.load(resourceAsStream);

        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("password"));


        //load properties file without loader
        resourceAsStream = ResourceTest.class
                .getResourceAsStream("/user.properties"); //absolute path

        properties = new Properties();
        properties.load(resourceAsStream);

        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("password"));

    }
}
