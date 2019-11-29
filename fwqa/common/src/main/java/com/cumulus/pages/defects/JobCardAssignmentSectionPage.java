package com.cumulus.pages.defects;

import com.cumulus.constants.Constants;
import com.cumulus.pages.BaseLogic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class JobCardAssignmentSectionPage extends BaseLogic {

    public JobCardAssignmentSectionPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@placeholder='Please, choose jobcard type']")
    private WebElement jobCardAssignmentDropDown;

    @FindBy(xpath = "//input[@placeholder='Please, choose jobcard style']")
    private WebElement jobCardStyleDropDown;

    @FindBy(linkText = "NEXT")
    private WebElement nextButton;

    @FindBy(xpath = Constants.DROP_DOWN_ITEMS_XPATH)
    private List<WebElement> dropdownItems;

    public void chooseJobCardAssignment(String jobCardAssignment) throws InterruptedException {
        clickWhenReady(jobCardAssignmentDropDown);
        selectValueFromDropDownByText(jobCardAssignment, Constants.DROP_DOWN_ITEMS_XPATH);
    }

    public void chooseJobCardStyle() throws InterruptedException {
        clickWhenReady(jobCardStyleDropDown);
        selectFirstElementFromDropDown(dropdownItems);
    }

    public void clickNextButton() throws InterruptedException {
        clickWhenReady(nextButton);
    }
}
