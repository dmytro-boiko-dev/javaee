package com.cumulus.pages.defects;

import com.cumulus.pages.BaseLogic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotesSectionPage extends BaseLogic {

    public NotesSectionPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='estimated-time']")
    private WebElement estimatedInput;

    @FindBy(xpath = "//input[@id='running-card-number']")
    private WebElement runningCrdInput;

    @FindBy(xpath = "//input[@id='duty-number']")
    private WebElement dutynumberInput;

    @FindBy(xpath = "//input[@id='road-number']")
    private WebElement roadNumberInput;

    @FindBy(linkText = "NEXT")
    private WebElement nextButton;

    public void enterEstimatedValue(String estimatedValue) throws InterruptedException {
        clickWhenReady(estimatedInput);
        sendText(estimatedInput, estimatedValue);
    }

    public void enterRunningCard(String runningCard) throws InterruptedException {
        clickWhenReady(runningCrdInput);
        sendText(runningCrdInput, runningCard);
    }

    public void enterDutyNumber(String dutyNumber) throws InterruptedException {
        clickWhenReady(dutynumberInput);
        sendText(dutynumberInput, dutyNumber);
    }

    public void enterRoadNumber(String roadNumer) throws InterruptedException {
        clickWhenReady(roadNumberInput);
        sendText(roadNumberInput, roadNumer);
    }

    public void clickNextButton() throws InterruptedException {
        clickWhenReady(nextButton);
    }
}
