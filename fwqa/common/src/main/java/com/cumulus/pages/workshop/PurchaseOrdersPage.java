package com.cumulus.pages.workshop;

import com.cumulus.pages.BaseLogic;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchaseOrdersPage extends BaseLogic {

    public PurchaseOrdersPage(WebDriver driver) {
        super(driver);
    }

    private final static Logger logger = Logger.getLogger(PurchaseOrdersPage.class);

    @FindBy(xpath = "//div[@class='ember-view']/main/div[3]/a/i")
    private WebElement addNewOrder;

    @FindBy(xpath = "//input[@id='requisitionNo']")
    private WebElement requisitionNumber;

    @FindBy(xpath = "//div[@class='container container-custom container_width_full no-padding']/div[7]/div[@class='col s12 valign-wrapper']/div[@class='autocomplete-order-new ember-view']//input[@placeholder='...']")
    private WebElement supplier;

    @FindBy(xpath = "//textarea[@placeholder='Special Instructions...']")
    private WebElement specialInstructions;

    @FindBy(xpath = "//div[@class='container container-custom container_width_full no-padding']/div[13]/div/a[@href='#']")
    private WebElement buttonCreate;

    @FindBy(xpath = "//div[@class='grid_col_1']/div[1]//i")
    private WebElement editSpecialInstructions;

    @FindBy(xpath = "//textarea[@placeholder='Type to specify new special instructions']")
    private WebElement inputSpecialInstructions;

    @FindBy(xpath = "//div[@class='grid_col_1']/div[1]//a[@href='#!']")
    private WebElement buttonSubmit;

    @FindBy(xpath = "//div[@class='ember-view']/a[@href='#']/i[@class='mdi mdi-plus']")
    private WebElement addNewItem;

    @FindBy(xpath = "//div[@class='container container-custom no-padding']/div[3]/div[@class='result__content']/div[2]/h5[@class='result__item-title']")
    private WebElement selectFirstElement;

    @FindBy(xpath = "//div[@class='container container-custom no-padding']/div[3]/div[@class='result__content']/div[2]/div[2]/a[2]")
    private WebElement costCenter;

    @FindBy(xpath = "//input[@placeholder='Type to choose Cost Center']")
    private WebElement chooseCostCenter;

    @FindBy(xpath = "//input[@placeholder='First Reason']")
    private WebElement firstReason;

    @FindBy(xpath = "//div[@class='card-panel']/div[2]/div[@class='dropdown ember-view']//ul/li[1]")
    private WebElement selectFirstReason;

    @FindBy(xpath = "//div[@class='card-panel']/div[3]/div[@class='dropdown ember-view']//ul/li[1]")
    private WebElement selectFirstReasonForVehicle;

    @FindBy(xpath = "//main/div[1]/div[3]/div[@class='card-panel']/div[4]/div[@class='dropdown ember-view']//ul/li[1]")
    private WebElement selectFirstReasonForJobCard;

    @FindBy(xpath = "//input[@placeholder='Second Reason']")
    private WebElement secondReason;

    @FindBy(xpath = "//div[@class='card-panel']/div[3]/div[@class='dropdown ember-view']//ul/li[1]")
    private WebElement selectSecondReason;

    @FindBy(xpath = "//div[@class='card-panel']/div[4]/div[@class='dropdown ember-view']//ul/li[1]")
    private WebElement selectSecondReasonForVehicle;

    @FindBy(xpath = "//main/div[1]/div[3]/div[@class='card-panel']/div[5]/div[@class='dropdown ember-view']//ul/li[1]")
    private WebElement selectSecondReasonForJobCard;

    @FindBy(xpath = "//input[@placeholder='Type to choose Operator']")
    private WebElement chooseOperator;

    @FindBy(xpath = "//div[@class='ember-view']/main/div[2]/div/a[@href='#']")
    private WebElement submitOnCostCenter;

    @FindBy(xpath = "//input[@id='quantity']")
    private WebElement enterQuantity;

    @FindBy(xpath = "//div[@class='result__content']/div[2]/div[2]/a[3]")
    private WebElement vehicle;

    @FindBy(xpath = "//input[@placeholder='Please choose fleet number']")
    private WebElement chooseFleetNumber;

    @FindBy(xpath = "//div[@class='result__content']/div[2]/div[2]/a[4]")
    private WebElement jobCard;

    @FindBy(xpath = "//main/div[1]/div[3]/div[@class='card-panel']/div[2]/div[@class='dropdown ember-view']/input[@placeholder='Job Card']")
    private WebElement selectJobCardDropdown;

    @FindBy(xpath = "//main/div[1]/div[3]/div[@class='card-panel']/div[2]/div[@class='dropdown ember-view']//ul/li[1]")
    private WebElement selectFirstJobCard;

    @FindBy(xpath = "//div[@id='line-items']/ul/li[1]")
    private WebElement selectItemToDelete;

    @FindBy(xpath = "//main/div/div[2]/div[2]/a[@href='!#']")
    private WebElement deleteItemButton;

    @FindBy(xpath = "//textarea[@placeholder='Specify deleting reason']")
    private WebElement deletingReason;

    public void newOrderCreation() throws InterruptedException {
        clickWhenReady(addNewOrder);
        Thread.sleep(1000);
        sendText(requisitionNumber, "123");
        Thread.sleep(1000);
        supplier.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
        Thread.sleep(1000);
        sendText(specialInstructions, "freesup autotest");
        Thread.sleep(1000);
        clickWhenReady(buttonCreate);
    }

    public void editSpecialInstructions() throws InterruptedException {
        clickWhenReady(editSpecialInstructions);
        sendText(inputSpecialInstructions, "autotest");
        clickWhenReady(buttonSubmit);
    }

    public void addCostCenterItem() throws InterruptedException {
        clickWhenReady(addNewItem);
        Thread.sleep(2000);
        clickWhenReady(selectFirstElement);
        clickWhenReady(costCenter);
        chooseCostCenter.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
        Thread.sleep(1000);
        clickWhenReady(firstReason);
        Thread.sleep(1000);
        clickWhenReady(selectFirstReason);
        Thread.sleep(1000);
        clickWhenReady(secondReason);
        clickWhenReady(selectSecondReason);
        chooseOperator.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
        sendText(enterQuantity, "2");
        clickWhenReady(submitOnCostCenter);
    }

    public void addVehicleItem() throws InterruptedException {
        clickWhenReady(addNewItem);
        clickWhenReady(selectFirstElement);
        clickWhenReady(vehicle);
        Thread.sleep(1000);
        chooseFleetNumber.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
        clickWhenReady(firstReason);
        Thread.sleep(1000);
        clickWhenReady(selectFirstReasonForVehicle);
        Thread.sleep(1000);
        clickWhenReady(secondReason);
        Thread.sleep(1000);
        clickWhenReady(selectSecondReasonForVehicle);
        Thread.sleep(1000);
        chooseOperator.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
        sendText(enterQuantity, "2");
        clickWhenReady(submitOnCostCenter);
    }

    public void addJobcardItem() throws InterruptedException {
        clickWhenReady(addNewItem);
        clickWhenReady(selectFirstElement);
        clickWhenReady(jobCard);
        chooseFleetNumber.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
        clickWhenReady(chooseFleetNumber);
        sendText(chooseFleetNumber, "E912 DRD");
        chooseFleetNumber.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
        clickWhenReady(selectJobCardDropdown);
        clickWhenReady(selectFirstJobCard);
        Thread.sleep(1000);
        clickWhenReady(firstReason);
        Thread.sleep(1000);
        clickWhenReady(selectFirstReasonForJobCard);
        Thread.sleep(1000);
        clickWhenReady(secondReason);
        Thread.sleep(1000);
        clickWhenReady(selectSecondReasonForJobCard);
        Thread.sleep(1000);
        chooseOperator.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
        sendText(enterQuantity, "2");
        clickWhenReady(submitOnCostCenter);
    }

    public void deleteItem() throws InterruptedException {
        clickWhenReady(selectItemToDelete);
        clickWhenReady(deleteItemButton);
        sendText(deletingReason, "autotest delete");
        clickWhenReady(deleteItemButton);

    }
}