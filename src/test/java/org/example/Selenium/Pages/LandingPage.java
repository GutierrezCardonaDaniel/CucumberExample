package org.example.Selenium.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LandingPage {

    private WebDriver driver;

    WebDriverWait wait;
    @FindBy (css = "input[name='username']")
    private WebElement userTextBox;
    @FindBy (css = "input[name='password']")
    private WebElement passwordTextBox;
    @FindBy (css = "button[type='submit']")
    private WebElement loginBtn;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void login(){
        wait.until(ExpectedConditions.visibilityOf(userTextBox));
        userTextBox.sendKeys("Admin");
        wait.until(ExpectedConditions.visibilityOf(passwordTextBox));
        passwordTextBox.sendKeys("admin123");
        loginBtn.click();
    }

    public void invalidLogin(){
        wait.until(ExpectedConditions.visibilityOf(userTextBox));
        userTextBox.sendKeys("fdfgv");
        wait.until(ExpectedConditions.visibilityOf(passwordTextBox));
        passwordTextBox.sendKeys("admin123");
        loginBtn.click();
    }
}
