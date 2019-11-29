package tests;

import com.cumulus.driver.DriverManager;
import com.cumulus.pages.login.LoginPage;
import com.cumulus.pages.main.MainPage;
import com.cumulus.pages.workshop.WorkSearchPage;
import com.cumulus.utils.reporting.AllureListener;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.cumulus.constants.Constants.BASE_WORKSHOP_URL;

@Listeners(AllureListener.class)
public class WorkSearchTest {

    private LoginPage loginPage;
    private MainPage mainPage;
    private WorkSearchPage workSearchPage;

    @BeforeClass
    public void start() {
        WebDriver driver = DriverManager.setDriver();
        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);
        workSearchPage = new WorkSearchPage(driver);

        driver.get(BASE_WORKSHOP_URL);
    }

    public void close() {
        DriverManager.closeDriver();
    }

    @Test
    public void workSearchTest() throws InterruptedException {
        loginPage.loginToPlatform("freesup", "obscure");
        mainPage.openWorkshopMenu();
        testWorkSearchPage();
    }

    @Step("WorkSearch -> filtering")
    private void testWorkSearchPage() throws InterruptedException {
        workSearchPage.worksearchAndAssignWork();

    }
}
