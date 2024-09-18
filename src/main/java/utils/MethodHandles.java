package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class MethodHandles {

    protected WebDriver driver;

    WebDriverWait wait;

    Actions actions;
    static ExtentReports extent;
    static ExtentTest test;

    public MethodHandles(WebDriver driver) {
        this.driver = driver;
    }


    private WebElement webElement(By locator) {
        return driver.findElement(locator);
    }

    private void explicitWait(By locator, int time) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOf(webElement(locator)),
                ExpectedConditions.visibilityOfElementLocated(locator),
                ExpectedConditions.presenceOfElementLocated(locator),
                ExpectedConditions.elementToBeClickable(locator)
        ));
    }

    protected void invisibleOfElement(By locator, int time) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.and(
                ExpectedConditions.invisibilityOf(webElement(locator)),
                ExpectedConditions.invisibilityOfElementLocated(locator)
        ));
    }

    protected void click(By locator, int time) {
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                setSteps();
                addBorderToElement(driver, webElement(locator));
                webElement(locator).click();
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected void clear(By locator, int time) {
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                setSteps();
                addBorderToElement(driver, webElement(locator));
                webElement(locator).clear();
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected void submit(By locator, int time) {
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                setSteps();
                addBorderToElement(driver, webElement(locator));
                webElement(locator).submit();
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected void sendKeys(By locator, int time, String text) {
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                setSteps();
                addBorderToElement(driver, webElement(locator));
                webElement(locator).sendKeys(text);
                break;
            } catch (StaleElementReferenceException e) {

            }
        }

    }

    protected String getText(By locator, int time) {
        String text = null;
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                setSteps();
                addBorderToElement(driver, webElement(locator));
                text = webElement(locator).getText();
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
        return text;
    }

    protected boolean isDisplayed(By locator, int time) {
        boolean flag = false;
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                setSteps();
                addBorderToElement(driver, webElement(locator));
                flag = webElement(locator).isDisplayed();
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
        return flag;
    }

    protected boolean isSelected(By locator, int time) {
        boolean flag = false;
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                setSteps();
                addBorderToElement(driver, webElement(locator));
                flag = webElement(locator).isSelected();
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
        return flag;
    }

    protected boolean isEnabled(By locator, int time) {
        boolean flag = false;
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                setSteps();
                addBorderToElement(driver, webElement(locator));
                flag = webElement(locator).isEnabled();
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
        return flag;
    }

    protected void clickWithActions(By locator, int time) {
        actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                actions.click(webElement(locator)).build().perform();
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected void doubleClick(By locator, int time) {
        actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                actions.doubleClick(webElement(locator)).build().perform();
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected void contextClick(By locator, int time) {
        actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                actions.contextClick(webElement(locator)).build().perform();
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected void dragAndDrop(By src, By target, int time) {
        actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(src, time);
                explicitWait(target, time);
                actions.dragAndDrop(webElement(src), webElement(target)).build().perform();
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected void release(By locator, int time) {
        actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                actions.release(webElement(locator)).build().perform();
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    protected void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    protected void sendKeysAlert(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

    protected String getTextAlert() {
        return driver.switchTo().alert().getText();
    }

    protected void switchToFrame(String nameOrID) {
        driver.switchTo().frame(nameOrID);
    }

    protected void switchToFrame(WebElement element) {
        driver.switchTo().frame(element);
    }

    protected void switchToParent() {
        driver.switchTo().parentFrame();
    }

    protected void release() {
        actions = new Actions(driver);
        actions.release().build().perform();
    }

    protected String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    protected String getTitle() {
        return driver.getTitle();
    }

    private static String getMethodName() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        if (stackTraceElements.length >= 2) {
            if (stackTraceElements.length >= 4)
                return stackTraceElements[4].getMethodName();
            return stackTraceElements[2].getMethodName();
        } else {
            return "Unknown";
        }
    }

    private void setSteps() {
        test.info(getMethodName());
    }

    private static void addBorderToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border = '5px solid red';", element);
    }

    public static void myAssertEquals(String actual, String expected) {
        test.info(MarkupHelper.createLabel("------------------- Ends of Steps -------------------", ExtentColor.TEAL));

        test.info(MarkupHelper.createLabel("------------------- actual Result -------------------", ExtentColor.TEAL));
        test.info(actual);

        test.info(MarkupHelper.createLabel("------------------- expected Result  -------------------", ExtentColor.TEAL));
        test.info(expected);

        assertEquals(actual, expected);
    }
}
