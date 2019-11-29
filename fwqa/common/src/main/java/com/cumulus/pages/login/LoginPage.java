package com.cumulus.pages.login;

import com.cumulus.pages.BaseLogic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseLogic {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "identification")
    private WebElement loginInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(linkText = "SIGN IN")
    private WebElement signInButton;

    public void loginToPlatform(String userEmail, String userPassword) throws InterruptedException {
        clickWhenReady(loginInput);
        sendText(loginInput, userEmail);
        clickWhenReady(passwordInput);
        sendText(passwordInput, userPassword);
        clickWhenReady(signInButton);
    }
}

