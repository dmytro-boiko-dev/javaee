import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BooksTest {

    @Test
    public void testBooksSearch() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://it-ebooks.info/");

        System.out.println(driver.getTitle());


        driver.findElement(By.id("q"));
        driver.findElement(By.id("q")).clear();
        driver.findElement(By.id("q")).sendKeys("Ruby On Rails");
//        driver.wait(1000);
        Thread.sleep(2000);
        driver.findElement(By.id("q")).sendKeys(Keys.RETURN);
        Thread.sleep(3000);

        Assert.assertNotNull(driver.findElement(By.className("gsc-result-info-container")));

        driver.quit();
    }

    @Test
    public void testBooksSearchNew() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://it-ebooks.info/");
        driver.findElement(By.id("q"));
        driver.findElement(By.id("q")).sendKeys("Java");
        driver.findElement(By.id("q")).sendKeys(Keys.RETURN);
        Thread.sleep(3000);
        Assert.assertNotNull(driver.findElement(By.className("gsc-adBlock")));
        driver.quit();
    }
}
