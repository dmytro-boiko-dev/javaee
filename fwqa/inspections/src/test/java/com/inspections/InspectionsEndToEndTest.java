package com.inspections;

import com.cumulus.constants.Constants;
import com.cumulus.driver.DriverManager;
import com.cumulus.pages.login.LoginPage;
import com.cumulus.prepearing.QueriesExecutor;
import com.cumulus.spring.BaseTest;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InspectionsEndToEndTest extends BaseTest {

    @Autowired
    private QueriesExecutor queriesExecutor;

    private LoginPage loginPage;

    @BeforeClass
    public void start() {
        WebDriver driver = DriverManager.setDriver();
        loginPage = new LoginPage(driver);

        driver.get(Constants.BASE_INSPECTIONS_URL);
    }

    @AfterClass
    public void close() {
        DriverManager.closeDriver();
    }

    @Test
    public void test() throws InterruptedException {
        final String userName = "freesup",
                password = "obscure";
        loginPage.loginToPlatform(userName, password);
        // TODO: remove this sleep
        Thread.sleep(5000);
    }
}
