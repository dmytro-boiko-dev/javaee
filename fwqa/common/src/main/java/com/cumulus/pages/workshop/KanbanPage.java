package com.cumulus.pages.workshop;

import com.cumulus.pages.BaseLogic;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KanbanPage extends BaseLogic {

    public KanbanPage(WebDriver driver) {
        super(driver);
    }

    private final static Logger logger = Logger.getLogger(KanbanPage.class);

    @FindBy(xpath = "//article[@class='card appearing card_box-shadow_none grey lighten-3 ember-view'][2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/li[2]")
    private WebElement quickBegin;

    @FindBy(xpath = "//article[2]/div[1]/div/div[2]/div/div[2]//div[@class='card__content_collapse js-card-content-collapse']/div[@class='ember-view']/p[1]/a[@class='card__icon-wrapper js-card-icon-wrapper']/i[@class='mdi mdi-dots-vertical card__icon waves-effect waves-blue js-mdi-dots-vertical circle']")
    private WebElement threeDotMenu;

    @FindBy(xpath = "//article[1]/div[3]/a[1]")
    private WebElement addOperator;

    @FindBy(xpath = "//input[@placeholder='Choose operator']")
    private WebElement chooseOperator;

    @FindBy(xpath = "//article[1]/div[2]/div[@class='autocomplete__footer right-align']/a[2]")
    private WebElement invite;

    @FindBy(xpath = "//article[1]/div[1]/div/div[2]//div[@class='card__content']/div[2]/p[2]/div/div/a[@href='javascript:void(0)']/input[@type='file']")
    private WebElement fileUpload;

    // EDIT BLOCK
    @FindBy(xpath = "//article[1]/div[@class='card__footer card__footer-now ember-view']/a[3]")
    private WebElement openEdit;

    @FindBy(xpath = "//input[@placeholder='Please, choose type']")
    private WebElement chooseType;

    @FindBy(xpath = "//div[@id='typeId']/div[@class='dropdown ember-view']//li[1]")
    private WebElement firstType;

    @FindBy(xpath = "//input[@placeholder='Please, choose subtype']")
    private WebElement chooseSubType;

    @FindBy(xpath = "//div[@id='subTypeId']/div[@class='dropdown ember-view']//li[1]")
    private WebElement firstSubType;

    @FindBy(xpath = "//input[@placeholder='Please, choose component']")
    private WebElement chooseComponent;

    @FindBy(xpath = "//div[@id='componentId']/div[@class='dropdown ember-view']//li[1]")
    private WebElement firstComponent;

    @FindBy(xpath = "//input[@placeholder='Please, choose first reason']")
    private WebElement chooseFirstReason;

    @FindBy(xpath = "//div[@id='firstReasonId']/div[@class='dropdown ember-view']//li[1]")
    private WebElement firstReason;

    @FindBy(xpath = "//input[@placeholder='Please, choose second reason']")
    private WebElement chooseSecondReason;

    @FindBy(xpath = "//div[@id='secondReasonId']/div[@class='dropdown ember-view']//li[1]")
    private WebElement secondReason;

    @FindBy(xpath = "//input[@placeholder='Please, choose critical level']")
    private WebElement chooseCriticalLevel;

    @FindBy(xpath = "//div[2]/div/p/div[@class='dropdown ember-view']//ul/li[1]")
    private WebElement firstCriticalLevel;

    @FindBy(xpath = "//input[@placeholder='Please, choose task']")
    private WebElement chooseTask;

    @FindBy(xpath = "//div[@id='taskId']/div[@class='dropdown ember-view']//li[1]")
    private WebElement firstTask;

    @FindBy(xpath = "//div[@id='labourDescription']//textarea")
    private WebElement textArea;

    @FindBy(xpath = "//div[@class='row']/div/a[2]")
    private WebElement buttonUpdate;

    public void selectQuickBegin() throws InterruptedException {
        clickWhenReady(threeDotMenu);
        clickWhenReady(quickBegin);
    }

    public void selectAddOperator() throws InterruptedException {
        clickWhenReady(addOperator);
        clickWhenReady(chooseOperator);
        chooseOperator.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
        clickWhenReady(invite);
    }

    public void uploadPhoto() {
        String filePath = System.getProperty("user.dir");
        String file = "\\src\\main\\resources\\bus.png";
        fileUpload.sendKeys(filePath + file);
    }

    public void editLabour() throws InterruptedException {
        clickWhenReady(openEdit);
        clickWhenReady(chooseType);
        clickWhenReady(firstType);
        clickWhenReady(chooseSubType);
        clickWhenReady(firstSubType);
        clickWhenReady(chooseComponent);
        clickWhenReady(firstComponent);
        clickWhenReady(chooseFirstReason);
        clickWhenReady(firstReason);
        clickWhenReady(chooseSecondReason);
        clickWhenReady(secondReason);
        clickWhenReady(chooseCriticalLevel);
        clickWhenReady(firstCriticalLevel);
        clickWhenReady(chooseTask);
        clickWhenReady(firstTask);
        String description = "Have a good evening guys ;]";
        sendText(textArea, description);
        clickWhenReady(buttonUpdate);
    }
}
