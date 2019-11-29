package com.cumulus.pages.defects;

import com.cumulus.constants.Constants;
import com.cumulus.pages.BaseLogic;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FleetDetailsSectionPage extends BaseLogic {

    public FleetDetailsSectionPage(WebDriver driver) {
        super(driver);
    }

    private final static Logger logger = Logger.getLogger(FleetDetailsSectionPage.class);

    @FindBy(xpath = "//input[@placeholder='Please, choose defect type']")
    private WebElement defectTypeDropDown;


    @FindBy(xpath = "//input[@placeholder='Please choose driver']")
    private WebElement driverAutoComplete;

    @FindBy(xpath = "//input[@placeholder='Please choose fleet number']")
    private WebElement fleetAutoComplete;

    @FindBy(xpath = Constants.DROP_DOWN_ITEMS_XPATH)
    private List<WebElement> defectTypeDropdownItems;

    @FindBy(css = "[type='number']")
    private WebElement mileageInput;

    @FindBy(linkText = "NEXT")
    private WebElement nextButton;

    public void chooseDefectType() throws InterruptedException {
        // Clicks on 'Defect Type' dropdown
        clickWhenReady(defectTypeDropDown);
        // Selects first element in above DropDown
        selectFirstElementFromDropDown(defectTypeDropdownItems);
    }

    public void selectDriver() throws InterruptedException {
        selectFirstElementInAutoComplete(driverAutoComplete);
    }

    public void selectFleetNumber() throws InterruptedException {
        selectFirstElementInAutoComplete(fleetAutoComplete);
    }

    public void typeMileage(String mileage) throws InterruptedException {
        clickWhenReady(mileageInput);
        sendText(mileageInput, mileage);
    }

    public void clickNextButton() throws InterruptedException {
        clickWhenReady(nextButton);
    }


}
