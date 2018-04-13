package com.SpartaGlobal.Tests;

import com.SpartaGlobal.HomePage;
import com.SpartaGlobal.LoginPage;
import com.SpartaGlobal.MyAccountPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;

public class LoginStepDefinitions {

    WebDriver driver = null;
    LoginPage loginPage;
    HomePage homePage;
    MyAccountPage myAccountPage;

    @Before
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        myAccountPage = new MyAccountPage(driver);
    }

    @Given("^User is on store\\.demoqa\\.com$")
    public void user_is_on_store_demoqa_com() throws Throwable
    {
        driver.get("http://store.demoqa.com");
    }

    @When("^User clicks on MyAccount link$")
    public void userClicksOnMyAccountLink() throws Throwable
    {
        homePage.goToAccountPage();
    }

    @And("^User logs in using an invalid username and valid password$")
    public void userLogsInUsingAnInvalidUsernameAndValidPassword() throws Throwable
    {
        loginPage.fillInUsername("TestUserName420");
        loginPage.fillInPassword("Password");
        loginPage.clickLoginButton();
    }

    @Then("^User is shown invalid login message$")
    public void userIsShownInvalidLoginMessage() throws Throwable
    {
        assertEquals("ERROR", loginPage.errorMessage());
    }

    @And("^User clicks on the Log in link in the side menu$")
    public void userClicksOnTheLogInLinkInTheSideMenu() throws Throwable {
        myAccountPage.clickLoginButton();
    }

    @Then("^User is taken to Login Page$")
    public void userIsTakenToLoginPage() throws Throwable {
        assertEquals("http://store.demoqa.com/wp-login.php", driver.getCurrentUrl());
    }

    @After
    public void tearDown()
    {
        driver.close();
    }

}
