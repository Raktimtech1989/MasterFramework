package com.raktimtech.driver;

import com.raktimtech.config.factory.ConfigFactory;
import com.raktimtech.driver.web.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public class Driver {

    static WebDriver driver = null ;
    public static void initDriver()
    {
        driver = LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser()) ;
        driver.get("https://google.co.in") ;
    }

    public static void quitDriver()
    {
        driver.quit();
    }

}
