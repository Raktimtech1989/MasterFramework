package com.raktimtech.driver;

import com.raktimtech.config.factory.ConfigFactory;
import com.raktimtech.enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    static WebDriver driver = null ;
    public static void initDriver()
    {
        driver = LocalDriverFactory.getDriver() ;
    }

    public static void quitDriver()
    {
        driver.quit();
    }

}
