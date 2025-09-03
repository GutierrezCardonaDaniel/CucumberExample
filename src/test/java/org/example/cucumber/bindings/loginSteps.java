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
    LandingPage landingPage;

    @Given("user is in the landing page using {string}")
    public void userIsInTheLandingPageUsing(String browser) {
        driver = DriverFactory.getDriver(browser);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        landingPage = new LandingPage(driver);
    }

    @When("user logs into the application using admin credentials")
    public void userLoginIntoTheApplicationUsingAdminCredentials() {   ;
        landingPage.login();
    }

    @Then("user should get to the admin dashboard page")
    public void userShouldGetToTheAdminDashboardPage() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index23423");
    }

    @AfterTest
    public void quitDriver() {
        driver.quit();
    }

    @When("user logs in with invalid credentials")
    public void userLoginWithInvalidCredentials() {
        landingPage.invalidLogin();
    }

    @Then("login fails")
    public void loginFails() {
        Assert.assertTrue(landingPage.isErrorMessageDisplayed());
    }
}