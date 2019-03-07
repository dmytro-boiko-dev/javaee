import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BooksTest {

    @Test
    public void searchTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://it-ebooks.info/");
        driver.findElement(By.id("q"));
        driver.findElement(By.id("q")).sendKeys("Ruby On Rails");
        Thread.sleep(2000);
        driver.findElement(By.id("q")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        Assert.assertNotNull(driver.findElement(By.className("gsc-result-info-container")));

    }

    @Test
    public void searchAnotherTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://it-ebooks.info/");
        driver.findElement(By.id("q"));
        driver.findElement(By.id("q")).sendKeys("Ruby On Rails");
        Thread.sleep(2000);
        driver.findElement(By.id("q")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        Assert.assertNotNull(driver.findElement(By.className("gsc-orderby-container")));
    }
}
