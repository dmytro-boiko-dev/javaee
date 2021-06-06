package hiltest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTest {
    public WebDriver driver;

    @Before
    public void start(){
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://user-data.hillel.it/html/registration.html");

    }

    @Test
    public void loginTest(){
        driver.findElement(By.className("registration")).click();




        driver.findElement(By.id("first_name")).sendKeys("FirstName");
        driver.findElement(By.id("last_name")).sendKeys("LastName");
        driver.findElement(By.id("male")).click();

        driver.findElement(By.id("button_account")).click();

        //Assert.assertNotNull(driver.findElement(By.className("success")));
    }
}
