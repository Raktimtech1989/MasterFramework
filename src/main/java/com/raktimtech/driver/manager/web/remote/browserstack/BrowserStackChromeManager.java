package com.raktimtech.driver.manager.web.remote.browserstack;

import com.raktimtech.config.factory.BrowserStackConfigFactory;
import com.raktimtech.config.factory.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class BrowserStackChromeManager {

    private BrowserStackChromeManager() {}

    public static WebDriver getDriver()
    {
        DesiredCapabilities capabilities = new DesiredCapabilities() ;
        capabilities.setCapability("browser" , "chrome");
        capabilities.setCapability("browser_version" , "latest");
        capabilities.setCapability("os" , "windows");
        capabilities.setCapability("os_version" , "10");
        return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackURL() , capabilities) ;
    }
}
