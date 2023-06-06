package org.example.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DriverFactory {

    private static final Supplier<WebDriver> getChrome =  () -> WebDriverManager.chromedriver().create();
    private static final Supplier<WebDriver> getFireFox =  () -> WebDriverManager.firefoxdriver().create();

    private static final Map<String, Supplier<WebDriver>> drivers = new HashMap<>();
    static {
        drivers.put("chrome", getChrome);
        drivers.put("firefox", getFireFox);
    }

    public static WebDriver getDriver(String browser){
        return drivers.get(browser).get();
    }
}
