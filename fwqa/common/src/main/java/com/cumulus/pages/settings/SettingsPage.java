package com.cumulus.pages.settings;

import com.cumulus.pages.BaseLogic;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SettingsPage extends BaseLogic {

    public SettingsPage(WebDriver driver) {
        super(driver);
    }

    private final static Logger logger = Logger.getLogger(SettingsPage.class);

    @FindBy(xpath = "//body/div[@class='ember-view']//nav/ul[1]/li[3]/a[@href='javacript:void(0);']")
    private WebElement userMenu;

    @FindBy(xpath = "//ul[@id='dropdown-user-menu']//a[@href='#/user/40']")
    private WebElement settings;

    @FindBy(xpath = "//input[@id='user-current-password']")
    private WebElement currentPassword;

    @FindBy(xpath = "//div[@id='signature']/div[@class='ember-view']//div[@class='left']/button")
    private WebElement updateSignature;

    @FindBy(xpath = "//canvas[@id='canvas']")
    private WebElement clickOnSignatureField;

    @FindBy(xpath = "//input[@id='keypad']")
    private WebElement enterPin;

    @FindBy(xpath = "//div[@class='keypad top']")
    private WebElement keyPad;

    @FindBy(xpath = "//div[@class='drawing-component-wrapper drawing-component_display_true']/div/footer/button[2]")
    private WebElement saveSignature;

    @FindBy(xpath = "//button[@class='btn waves-effect waves-teat']")
    private WebElement buttonSubmit;

    public void signatureAndPinTest() throws InterruptedException {

        String one = "1";

        clickWhenReady(userMenu);
        clickWhenReady(settings);
        sendText(currentPassword, "obscure");
        clickWhenReady(updateSignature);
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.clickAndHold(clickOnSignatureField).perform();
        actions.moveByOffset(150, 150).perform();
        clickWhenReady(saveSignature);

        clickWhenReady(enterPin);

        List<WebElement> elements = keyPad.findElements(By.xpath("//div[@class='keypad top']/button"));
        elements.forEach(element -> {
            if (element.getText().equals(one)) {
                try {
                    clickWhenReady(element);
                    clickWhenReady(element);
                    clickWhenReady(element);
                    clickWhenReady(element);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        clickWhenReady(buttonSubmit);
    }
}
