package com.cumulus.pages.defects;

import com.cumulus.constants.Constants;
import com.cumulus.pages.BaseLogic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ComponentrySectionPage extends BaseLogic {

    public ComponentrySectionPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@placeholder='Please, choose type']")
    private WebElement typeDropDonw;

    @FindBy(xpath = "//input[@placeholder='Please, choose component']")
    private WebElement componentDropDonw;

    @FindBy(xpath = "//input[@placeholder='Please, choose subtype']")
    private WebElement subtypeDropDonw;

    @FindBy(xpath = "//input[@placeholder='Please, choose position']")
    private WebElement positionDropDonw;

    @FindBy(xpath = Constants.DROP_DOWN_ITEMS_XPATH)
    private List<WebElement> dropdownItems;

    @FindBy(linkText = "NEXT")
    private WebElement nextButton;

    public void selectType() throws InterruptedException {
        clickWhenReady(typeDropDonw);
        selectFirstElementFromDropDown(dropdownItems);
    }

    public void selectSubType() throws InterruptedException {
        clickWhenReady(subtypeDropDonw);
        selectFirstElementFromDropDown(dropdownItems);
    }

    public void selectComponent() throws InterruptedException {
        clickWhenReady(componentDropDonw);
        selectFirstElementFromDropDown(dropdownItems);
    }

    public void selectPosition() throws InterruptedException {
        clickWhenReady(positionDropDonw);
        selectFirstElementFromDropDown(dropdownItems);
    }

    public void clickNextButton() throws InterruptedException {
        clickWhenReady(nextButton);
    }
}
