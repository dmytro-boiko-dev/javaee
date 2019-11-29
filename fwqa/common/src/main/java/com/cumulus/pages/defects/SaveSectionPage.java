package com.cumulus.pages.defects;

import com.cumulus.pages.BaseLogic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SaveSectionPage extends BaseLogic {

    public SaveSectionPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "FINISH")
    private WebElement finishButton;

    public void clickFinishButton() throws InterruptedException {
        clickWhenReady(finishButton);
    }
}
