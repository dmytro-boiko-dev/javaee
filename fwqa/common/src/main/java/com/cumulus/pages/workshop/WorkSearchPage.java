package com.cumulus.pages.workshop;

import com.cumulus.pages.BaseLogic;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorkSearchPage extends BaseLogic {

    public WorkSearchPage(WebDriver driver) {
        super(driver);
    }

    private final static Logger logger = Logger.getLogger(WorkSearchPage.class);

    @FindBy(xpath = "//i[@class='mdi mdi-dots-horizontal']")
    private WebElement threeDotMenu;

    @FindBy(xpath = "//div[@class='card-editor__inner card-editor__inner_is_animate ember-view']/div[3]/a[2]")
    private WebElement selectWorkSearch;

    @FindBy(xpath = "//div[@class='ember-view']/main/div[1]/div[1]/div[1]/a[@href='#']")
    private WebElement wateringCan;

    @FindBy(xpath = "//div[@class='filter__link'][1]")
    private WebElement dropdownFilter;

    @FindBy(xpath = "//div[@class='filters__controls filters__controls_is_display']/div//ul/li[3]")
    private WebElement noJobCards;

    @FindBy(xpath = "//div[1]/div[3]/ul[@class='result__content']/li[1]/ul[@class='collection z-depth-1']/li[1]/div[1]")
    private WebElement selectFirstWork;

    @FindBy(xpath = "//ul[@class='collection z-depth-1']/li[1]/div[2]/div[@class='ember-view'][1]/section[1]/div[2]/div[2]/div/label")
    private WebElement operatorAssignment;

    @FindBy(xpath = "//section[1]//div[@class='col l12 m12 s12']/p[1]")
    private WebElement assignToMe;

    @FindBy(xpath = "//ul[@class='collection z-depth-1']/li[1]/div[2]/div[@class='ember-view']/section[2]/div[@class='ember-view'][1]/div/div[2]/div/label")
    private WebElement jobcardAssignment;

    @FindBy(xpath = "//span[.='Create new jobcard']")
    private WebElement createNewJobcard;

    @FindBy(xpath = "//input[@placeholder='Please, choose jobcard style']")
    private WebElement selectJobcardStyle;

    @FindBy(xpath = "//section[2]/div[@class='ember-view']/div/div[4]/div//ul/li[1]")
    private WebElement selectFirstStyle;

    @FindBy(xpath = "//textarea[@class='ember-text-area ember-view']")
    private WebElement textArea;

    @FindBy(xpath = "//ul[@class='collection z-depth-1']/li[1]/div[2]/div[@class='ember-view'][1]/section[3]/div[@class='ember-view']/div/div[2]/div/label")
    private WebElement buyAssignment;

    @FindBy(xpath = "//input[@placeholder='Please, choose Bay']")
    private WebElement chooseBuy;

    @FindBy(xpath = "//section[3]/div[@class='ember-view']/div/div[3]/p/div//ul/li[1]")
    private WebElement selectFirstBuy;

    @FindBy(xpath = "//ul[@class='collection z-depth-1']/li[1]/div[3]/a[3]")
    private WebElement clickAssign;

    public void worksearchAndAssignWork() throws InterruptedException {
        clickWhenReady(threeDotMenu);
        clickWhenReady(selectWorkSearch);
        clickWhenReady(wateringCan);
        clickWhenReady(dropdownFilter);
        clickWhenReady(noJobCards);
        clickWhenReady(selectFirstWork);
        clickWhenReady(operatorAssignment);
        clickWhenReady(assignToMe);
        clickWhenReady(jobcardAssignment);
        clickWhenReady(createNewJobcard);
        clickWhenReady(selectJobcardStyle);
        clickWhenReady(selectFirstStyle);
        sendText(textArea, "Freeway Fleet Systems");
        clickWhenReady(buyAssignment);
        clickWhenReady(chooseBuy);
        clickWhenReady(selectFirstBuy);
        clickWhenReady(clickAssign);
    }
}
