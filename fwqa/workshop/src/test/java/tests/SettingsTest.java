package tests;

import com.cumulus.driver.DriverManager;
import com.cumulus.pages.login.LoginPage;
import com.cumulus.pages.settings.SettingsPage;
import com.cumulus.utils.reporting.AllureListener;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.cumulus.constants.Constants.BASE_WORKSHOP_URL;

@Listeners(AllureListener.class)
public class SettingsTest {

    private LoginPage loginPage;
    private SettingsPage settingsPage;

    @BeforeClass
    public void start() {
        WebDriver driver = DriverManager.setDriver();
        loginPage = new LoginPage(driver);
        settingsPage = new SettingsPage(driver);
        driver.get(BASE_WORKSHOP_URL);
    }

    @AfterClass
    public void close(){
        DriverManager.closeDriver();
    }

    @Test
    public void settingsTest() throws InterruptedException {
        loginPage.loginToPlatform("freesup", "obscure");
        settingsPageTest();
    }

    @Step("Settings page - test sign and pin-code")
    private void settingsPageTest() throws InterruptedException {
        settingsPage.signatureAndPinTest();

    }
}
