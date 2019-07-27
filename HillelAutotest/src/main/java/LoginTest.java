import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public WebDriver driver;


    @Before
    public void start(){
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("http://testing-ground.scraping.pro/login");

    }

    @Test
    public void loginTest(){
        driver.findElement(By.id("usr")).sendKeys("admin");
        driver.findElement(By.id("pwd")).sendKeys("12345");
        driver.findElement(By.id("pwd")).sendKeys(Keys.ENTER);

        Assert.assertNotNull(driver.findElement(By.className("success")));
    }
}
