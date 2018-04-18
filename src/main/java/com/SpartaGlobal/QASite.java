package com.SpartaGlobal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class QASite {

    public WebDriver driver;

    public QASite(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void homePage() {
        HomePage homePage = new HomePage(driver);
    }

    public void loginPage() {
        LoginPage loginPage = new LoginPage(driver);
    }

    public void myAccountPage() {
        MyAccountPage myAccountPage = new MyAccountPage(driver);
    }
}
