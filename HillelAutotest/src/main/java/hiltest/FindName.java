package hiltest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindName {

    public WebDriver driver;

    @Before
    public void start(){

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void registration() throws InterruptedException {
         driver.get("https://user-data.hillel.it/");
        driver.findElement(By.cssSelector(".log_out")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".registration")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("first_name")).sendKeys("Alena1", Keys.TAB);
        Thread.sleep(1000);
        driver.findElement(By.id("last_name")).sendKeys("Afanas1", Keys.TAB);
        Thread.sleep(1000);
        driver.findElement(By.id("field_work_phone")).sendKeys("54321", Keys.TAB);
        Thread.sleep(1000);
        driver.findElement(By.id("field_phone")).sendKeys("380931234568", Keys.TAB);
        Thread.sleep(1000);
        driver.findElement(By.id("field_email")).sendKeys("alenatest1@test.com", Keys.TAB);
        Thread.sleep(1000);
        driver.findElement(By.id("field_password")).sendKeys("Test123456");
        Thread.sleep(1000);
        driver.findElement(By.id("female")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("position")).sendKeys("manager", Keys.chord("manager"));
        driver.findElement(By.id("button_account")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
//        driver.navigate().back();
        Thread.sleep(1000);
    }

    @Test
    public void firstTest() throws InterruptedException {

//        driver.navigate().to("https://user-data.hillel.it/");
        driver.navigate().to("https://user-data.hillel.it/html/registration.html");
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("alenatest1@test.com", Keys.TAB);
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("Test123456");
        Thread.sleep(1000);
        driver.findElement(By.className("login_button")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("employees")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("first_name")).sendKeys("Alena1");
        Thread.sleep(1000);
        driver.findElement(By.id("last_name")).sendKeys("Afanas1");
        Thread.sleep(1000);
        driver.findElement(By.id("position")).sendKeys("manager", Keys.chord("manager"));
        Thread.sleep(1000);
        driver.findElement(By.id("mobile_phone")).sendKeys("380931234568");
        Thread.sleep(1000);
        driver.findElement(By.id("gender")).sendKeys("female", Keys.chord("female"));
        Thread.sleep(1000);
        driver.findElement(By.id("search")).click();
        Thread.sleep(1000);

        String actualText = driver.findElement(By.xpath("//table[@id='table']//td[.='Alena1']")).getText();

        String expectedText = "Alena1";
        Assert.assertEquals("Wrong text", expectedText, actualText);
    }
}
