package com.raktimtech.driver.web.remote;

import com.raktimtech.driver.manager.web.remote.seleniumgrid.SeleniumGridChromeManager;
import com.raktimtech.driver.manager.web.remote.seleniumgrid.SeleniumGridFirefoxManager;
import com.raktimtech.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class SeleniumGrdFactory {

    private SeleniumGrdFactory() {}

    public static WebDriver getDriver(BrowserType browserType)
    {
        return browserType == BrowserType.CHROME ? SeleniumGridChromeManager.getDriver(): SeleniumGridFirefoxManager.getDriver() ;
    }
}
