package tests;

import com.cumulus.driver.DriverManager;
import com.cumulus.pages.login.LoginPage;
import com.cumulus.pages.main.MainPage;
import com.cumulus.pages.workshop.KanbanPage;
import com.cumulus.utils.reporting.AllureListener;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.cumulus.constants.Constants.BASE_WORKSHOP_URL;

@Listeners(AllureListener.class)
public class WorkshopTest {

    private KanbanPage kanbanPage;
    private LoginPage loginPage;
    private MainPage mainPage;

    @BeforeClass
    public void start() {
        WebDriver driver = DriverManager.setDriver();
        kanbanPage = new KanbanPage(driver);
        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);

        driver.get(BASE_WORKSHOP_URL);
    }

    public void close() {
        DriverManager.closeDriver();
    }

    @Test
    public void workshopTest() throws InterruptedException {
        loginPage.loginToPlatform("freesup", "obscure");
        mainPage.openWorkshopMenu();
        testKanbanPage();
    }

    @Step("Kanban -> ToDo tab step")
    private void testKanbanPage() throws InterruptedException {
        kanbanPage.selectQuickBegin();
        kanbanPage.selectAddOperator();
        kanbanPage.uploadPhoto();
        kanbanPage.editLabour();
    }
}
