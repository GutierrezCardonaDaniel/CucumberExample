package org.example.Selenium;

import org.example.Selenium.Pages.LandingPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AutomationTests
{
    WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = DriverFactory.getDriver("firefox");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test
    public void login()
    {
        LandingPage landingPage = new LandingPage(driver);
        landingPage.login();
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
    }

    @AfterTest
    public void quit(){
        driver.quit();
    }
}
