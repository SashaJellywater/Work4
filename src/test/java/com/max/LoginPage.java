package com.max;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        enterTextByXPath("//input[@name='login']", username);
        enterTextByXPath("//input[@name='password']", password);
        clickByXPath("//button[contains(text(),'Войти')]");
    }

    public boolean isErrorMessageDisplayed() {
        return isElementPresentByXPath("//ul[@class='error-messages']");
    }

}
