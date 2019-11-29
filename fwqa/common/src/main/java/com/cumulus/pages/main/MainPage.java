package com.cumulus.pages.main;

import com.cumulus.pages.BaseLogic;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BaseLogic {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    private final static Logger logger = Logger.getLogger(MainPage.class);

    @FindBy(linkText = "Defects")
    private WebElement defectsMenu;

    @FindBy(linkText = "Workshop")
    private WebElement workshopMenu;

    @FindBy(linkText = "Purchase Orders")
    private WebElement purchaseOrder;

    public void openDefectsMenu() throws InterruptedException {
        clickWhenReady(defectsMenu);
    }

    public void openWorkshopMenu() throws InterruptedException {
        clickWhenReady(workshopMenu);
    }

    public void openPurchaseOrdersMenu() throws InterruptedException {
        clickWhenReady(purchaseOrder);
    }
}
