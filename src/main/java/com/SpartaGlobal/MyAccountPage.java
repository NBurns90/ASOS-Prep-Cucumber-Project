package com.SpartaGlobal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class MyAccountPage extends QASite {

    @FindBy(linkText = "Log in")
    WebElement loginButton;

    public MyAccountPage(WebDriver driver)
    {
        super(driver);
    }

    public void clickLoginButton()
    {
        loginButton.click();
    }



}
