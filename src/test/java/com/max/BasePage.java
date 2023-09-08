package com.max;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver){this.driver = driver;}
    protected void enterTextByXPath(String xpath, String text) {
        driver.findElement(By.xpath(xpath)).sendKeys(text);
    }
    protected void clickByXPath(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }
    protected boolean isElementPresentByXPath(String xpath) {
        return !driver.findElements(By.xpath(xpath)).isEmpty();
    }
    protected void waitForElementByXPath(String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }
}
