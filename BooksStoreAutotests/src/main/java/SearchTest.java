import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {

    private WebDriver driver;

    @Before
    public void preparationForTest() {

        System.out.println("0. подключаем хром драйвер");
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        System.out.println("1. создаем хром драйвер");
        driver = new ChromeDriver();

        System.out.println("2. открываем тестовую страницу");
        driver.get("http://it-ebooks.info/");
    }

    @Test
    public void testBookSearchJava() throws InterruptedException {

        driver.findElement(By.id("q")).clear();
        System.out.println("3. передеаем поисковый параметр");
        driver.findElement(By.id("q")).sendKeys("Java");

        Thread.sleep(1000);
        System.out.println("4. нажимаем энтер");
        driver.findElement(By.id("q")).sendKeys(Keys.ENTER);



        driver.findElement(By.xpath("//div[@class='swiper-slide']/article[5]")).click();



        driver.findElement(By.xpath("//ul[@id='activity-status-dropdown']//a[@href='#/work-control/status/49483/-999/773/on_break']")).click();

        Assert.assertNotNull(driver.findElement(By.className("gsc-result-info-container")));
        System.out.println("5. проверяем результат");

    }

    @Test
    public void testBookSearchJavaCSharp() throws InterruptedException {

        driver.findElement(By.id("q")).clear();
        driver.findElement(By.id("q")).sendKeys("C#");

        Thread.sleep(3000);

        driver.findElement(By.id("q")).sendKeys(Keys.ENTER);

        Assert.assertNotNull(driver.findElement(By.className("gsc-result-info-container")));

    }

    @After
    public void afterTest() {

        driver.close();

    }
}
