import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autotest {

    public WebDriver driver;


    @Before
    public void start(){
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        driver = new ChromeDriver();
        System.out.println("Created driver;");
        driver.get("http://it-ebooks.info/");

        System.out.println("Page opened;");
    }

    @Test
    public void textBookSearch() throws InterruptedException {

        driver.findElement(By.id("q")).clear();

        System.out.println("Search field found;");
        driver.findElement(By.id("q")).sendKeys("Java");

        driver.findElement(By.id("q")).sendKeys(Keys.ENTER);

        System.out.println("Search results page opened;");
        Assert.assertNotNull(driver.findElement(By.className("gsc-result-info-container")));
    }

    @Test
    public void openProductPage(){

        System.out.println("Second test ran");
        driver.findElement(By.linkText("Cracking Codes with Python")).click();
        System.out.println("Second test Ok");
    }

    @Test
    public void openSomePage(){

        System.out.println("Second test ran");
        driver.findElement(By.linkText("Practical Machine Learning with Python")).click();
        System.out.println("Second test Ok");
    }

    @After
    public void close(){
        driver.close();
        System.out.println("Window closed;");
    }

}
