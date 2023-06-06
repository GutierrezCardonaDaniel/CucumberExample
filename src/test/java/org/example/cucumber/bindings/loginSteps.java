package org.example.cucumber.bindings;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Selenium.DriverFactory;
import org.example.Selenium.Pages.LandingPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class loginSteps {
    WebDriver driver;

    @Given("I am in the landing page using {string}")
    public void iAmInTheLandingPageUsingChrome(String browser) {
        driver = DriverFactory.getDriver(browser);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("I login into the application using admin credentials")
    public void iLoginIntoTheApplicationUsingAdminCredentials() {
        LandingPage landingPage = new LandingPage(driver);
        landingPage.login();
    }

    @Then("I should get to the admin dashboard page")
    public void iShouldGetToTheAdminDashboardPage() {
        Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", driver.getCurrentUrl());
    }

    @AfterTest
    public void quitDriver() {
        driver.quit();
    }

    @When("I login with invalid credentials")
    public void iLoginWithInvalidCredentials() {
        LandingPage landingPage = new LandingPage(driver);
        landingPage.invalidLogin();
    }

    @Then("Login fails")
    public void loginFails() {
        Assert.assertNotEquals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", driver.getCurrentUrl());
    }
}
