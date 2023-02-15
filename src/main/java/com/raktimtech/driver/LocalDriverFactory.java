package com.raktimtech.driver;

import com.raktimtech.config.factory.ConfigFactory;
import com.raktimtech.driver.manager.ChromeManager;
import com.raktimtech.driver.manager.FirefoxManager;
import com.raktimtech.enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class LocalDriverFactory {

    private LocalDriverFactory() {} ;


    public static WebDriver getDriver()
    {
        WebDriver driver = null;

        //cmd + option + m -> shortcut for extract a method from if conditions
        if(isBrowserChrome())
        {
            driver = ChromeManager.getDriver();
            driver.get("https://google.co.in");
        }
        else
        {
            driver = FirefoxManager.getDriver();
            driver.get("https://google.co.in") ;

        }
        return driver;
    }

    private static boolean isBrowserChrome() {
        return ConfigFactory.getConfig().browser() == BrowserType.CHROME;
    }
}
