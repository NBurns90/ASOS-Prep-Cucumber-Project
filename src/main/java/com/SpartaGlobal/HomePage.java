package com.SpartaGlobal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class HomePage extends QASite {

    @FindBy(className = "account_icon")
    WebElement accountIcon;

    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    public void goToAccountPage()
    {
        accountIcon.click();
    }

}
