import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
    public static int a = 1;
    public static int b = 3;
    public static int c = 9;
    public static int d = 27;

    public static void main(String[] args) {


        int result = a + b + c + d;

        System.out.println(result);

//        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("http://it-ebooks.info/");
//
//        System.out.println(driver.getTitle());
//
//
//        driver.findElement(By.id("q"));
//        driver.findElement(By.id("q")).clear();
//        driver.findElement(By.id("q")).sendKeys("Ruby On Rails");
////        driver.wait(1000);
//        Thread.sleep(2000);
//        driver.findElement(By.id("q")).sendKeys(Keys.RETURN);
//        Thread.sleep(3000);
//
//
//        driver.quit();
    }
}
