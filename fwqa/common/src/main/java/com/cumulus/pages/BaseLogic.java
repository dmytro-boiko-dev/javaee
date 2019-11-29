package com.cumulus.pages;

import com.cumulus.utils.waiters.WebDriverWaitHelper;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * This class contains basic actions for working with elements and
 * can be useful for all cumulus.pages objects
 */
public class BaseLogic {

    public WebDriver driver;
    private WebDriverWait wait;

    public BaseLogic(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = WebDriverWaitHelper.generateWaits(driver, 40, 40, 1);
    }

    /**
     * Waits until web-element is visible on a page
     *
     * @param element the web-element, which should be visible
     * @return the passed element will be returned
     */
    public WebElement waitForVisible(WebElement element) throws InterruptedException {
        waitForJSToBeLoaded();
        wait.until(ExpectedConditions.visibilityOf(element));
        highlightElement(element);

        return element;
    }

    /**
     * Waits until all web-elements in list are visible
     *
     * @param elements the list of web-elements
     * @return the same list of elements will be returned
     */
    public List<WebElement> waitForVisible(List<WebElement> elements) throws InterruptedException {
        waitForJSToBeLoaded();
        for (WebElement element : elements) {
            wait.until(ExpectedConditions.visibilityOf(element));
        }

        return elements;
    }

    /**
     * Clicks a web-element after it becomes visible
     *
     * @param element a web-element
     * @return the passed element will be returned
     */
    public WebElement clickWhenReady(WebElement element) throws InterruptedException {
        waitForVisible(element);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

        return element;
    }

    /**
     * Sends keys to a web-element after it becomes clear and visible
     *
     * @param element a web-element
     * @param text    a text to send
     * @return the passed element will be returned
     */
    public WebElement sendText(WebElement element, String text) throws InterruptedException {
        waitForVisible(element);
        element.clear();
        element.sendKeys(text);
        for (String inputText = element.getAttribute("value"); inputText.length() != text.length(); ) {
            element.clear();
            element.sendKeys(text);
            inputText = element.getAttribute("value");
        }

        return element;
    }

    /**
     * Performs click on WebElement with JavaScriptExecutor
     *
     * @param element - a web-element
     */
    public void clickOnElementWithJSExecutor(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public List<WebElement> waitForListVisible(List<WebElement> list) throws InterruptedException {
        waitForJSToBeLoaded();
        wait.until(ExpectedConditions.visibilityOfAllElements(list));
        return list;
    }


    /**
     * Waits until web-element will have passed selected state
     *
     * @param element   the web-element which should have passed selected state
     * @param stateToBe state that web-element should have
     * @return passed web-element
     */
    public WebElement waitForElementSelectedStateToBe(WebElement element, boolean stateToBe) throws InterruptedException {
        waitForJSToBeLoaded();
        wait.until(ExpectedConditions.elementSelectionStateToBe(element, stateToBe));
        return element;
    }

    /**
     * Performs highlighting of incoming WebElement
     *
     * @param element - a web-element
     */
    private void highlightElement(WebElement element) {
        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor) driver).executeScript("element = arguments[0];" +
                    "original_style = element.getAttribute('style');" +
                    "element.setAttribute('style', original_style + \"; background: lightblue; border: 3px dashed black;\");" +
                    "setTimeout(function(){" +
                    "element.setAttribute('style', original_style);" +
                    "}, 60);", element);
        }
    }

    /**
     * Waits until all JavaScript code is executed in a page
     */
    private void waitForJSToBeLoaded() throws InterruptedException {
        wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
        // TODO: Create real waiter which will wait when all web elements will be in DOM
        Thread.sleep(1500);
    }

    public void selectValueFromDropDownByText(String option, String xpath) {
        // Get all of the options
        List<WebElement> options = driver.findElements(By.xpath(xpath));
        // Loop through the options and select the one that matches
        for (WebElement opt : options) {
            if (opt.getText().equals(option)) {
                opt.click();
                return;
            }
        }
        throw new NoSuchElementException("Can't find " + option + " in dropdown");
    }

    public void selectFirstElementInAutoComplete(WebElement autoComplete) throws InterruptedException {
        clickWhenReady(autoComplete);
        autoComplete.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void selectFirstElementFromDropDown(List<WebElement> dropdownElements) throws InterruptedException {
        // Clicks on first Element in Dropdown ones
        clickWhenReady(dropdownElements.get(0));
    }

    public void waitForJQueryToBeLoaded() {
        wait.until(webDriver -> (Long) ((JavascriptExecutor) driver).executeScript("return jQuery.active") == 0);
    }

    public void checkDropdownByIndexGeneral(WebElement selectWE) throws InterruptedException {
        Select select = new Select(selectWE);
        clickWhenReady(selectWE);
        waitForListVisible(select.getOptions());
        clickWhenReady(selectWE);
        select.getFirstSelectedOption().getText().equals(select.getOptions().get(0).getText());
    }
}


