package com.SpartaGlobal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class LoginPage extends QASite{

    @FindBy(id = "log")
    WebElement usernameField;

    @FindBy(id = "pwd")
    WebElement passwordField;

    @FindBy(id = "rememberme")
    WebElement rememberMe;

    @FindBy(id = "login")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"ajax_loginform\"]/p[1]/strong")
    WebElement errorResponse;

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    public void fillInUsername(String username)
    {
        usernameField.sendKeys(username);
    }

    public void fillInPassword(String password)
    {
        passwordField.sendKeys(password);
    }

    public void clickRememberMe()
    {
        rememberMe.click();
    }

    public void clickLoginButton()
    {
        loginButton.click();
    }

    public String errorMessage()
    {
        return errorResponse.getText();
    }

}
