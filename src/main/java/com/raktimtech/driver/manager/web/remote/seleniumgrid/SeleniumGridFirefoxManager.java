package com.raktimtech.driver.manager.web.remote.seleniumgrid;

import com.raktimtech.config.factory.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SeleniumGridFirefoxManager {

    private SeleniumGridFirefoxManager() {}

    public static WebDriver getDriver()
    {
        DesiredCapabilities capabilities = new DesiredCapabilities() ;
        capabilities.setBrowserName(BrowserType.FIREFOX);
        return new RemoteWebDriver(ConfigFactory.getConfig().seleniumGridURL() , capabilities) ;
    }
}
