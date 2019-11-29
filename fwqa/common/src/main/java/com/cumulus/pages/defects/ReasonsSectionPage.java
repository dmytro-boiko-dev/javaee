package com.cumulus.pages.defects;

import com.cumulus.constants.Constants;
import com.cumulus.pages.BaseLogic;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ReasonsSectionPage extends BaseLogic {

    public ReasonsSectionPage(WebDriver driver) {
        super(driver);
    }

    private final static Logger logger = Logger.getLogger(ReasonsSectionPage.class);

    @FindBy(xpath = "//input[@placeholder='Please, choose first reason']")
    private WebElement firstReasonDropDpwn;

    @FindBy(xpath = "//input[@placeholder='Please, choose second reason']")
    private WebElement secondReasonDropDown;

    @FindBy(xpath = "//input[@placeholder='Please, choose critical level']")
    private WebElement criticalityDropDown;

    @FindBy(xpath = "//input[@placeholder='Please, choose task']")
    private WebElement taskDropDown;

    @FindBy(xpath = Constants.DROP_DOWN_ITEMS_XPATH)
    private List<WebElement> dropdownElements;

    @FindBy(linkText = "NEXT")
    private WebElement nextButton;

    public void selectFirstReason() throws InterruptedException {
        clickWhenReady(firstReasonDropDpwn);
        selectFirstElementFromDropDown(dropdownElements);
    }

    public void selectSecondReason() throws InterruptedException {
        clickWhenReady(secondReasonDropDown);
        selectFirstElementFromDropDown(dropdownElements);
    }

    public void selectCriticality() throws InterruptedException {
        clickWhenReady(criticalityDropDown);
        selectFirstElementFromDropDown(dropdownElements);
    }

    public void selectTask() throws InterruptedException {
        clickWhenReady(taskDropDown);
        selectFirstElementFromDropDown(dropdownElements);
    }

    public void clickNextButton() throws InterruptedException {
        clickWhenReady(nextButton);
    }
}
