package tests;

import com.cumulus.driver.DriverManager;
import com.cumulus.pages.login.LoginPage;
import com.cumulus.pages.main.MainPage;
import com.cumulus.pages.workshop.PurchaseOrdersPage;
import com.cumulus.prepearing.QueriesExecutor;
import com.cumulus.spring.BaseTest;
import com.cumulus.utils.reporting.AllureListener;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.cumulus.constants.Constants.BASE_WORKSHOP_URL;

@Listeners(AllureListener.class)
public class PurchaseOrdersTest extends BaseTest {

    private LoginPage loginPage;
    private MainPage mainPage;
    private PurchaseOrdersPage purchaseOrdersPage;

    @Autowired
    private QueriesExecutor executeQueries;

    @BeforeClass
    public void start() {
        WebDriver driver = DriverManager.setDriver();
        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);
        purchaseOrdersPage = new PurchaseOrdersPage(driver);
        driver.get(BASE_WORKSHOP_URL);
    }

    @AfterClass
    public void close() {
        DriverManager.closeDriver();
    }

    @Test
    public void purchaseOrdersTest() throws InterruptedException {
        loginPage.loginToPlatform("freesup", "obscure");
        mainPage.openPurchaseOrdersMenu();
        testPurchaseOrdersPage();
    }

    @Step("Purchase Orders -> new order")
    private void testPurchaseOrdersPage() throws InterruptedException {

        purchaseOrdersPage.newOrderCreation();
        purchaseOrdersPage.editSpecialInstructions();
        purchaseOrdersPage.addCostCenterItem();
//        purchaseOrdersPage.addVehicleItem();

        // procedure for adding new jobCard to database
//        executeQueries.execute();
//        Thread.sleep(3000);
//        purchaseOrdersPage.addJobcardItem();
//        purchaseOrdersPage.deleteItem();
    }
}
