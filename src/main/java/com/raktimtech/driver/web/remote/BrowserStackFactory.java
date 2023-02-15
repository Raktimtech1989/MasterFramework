package com.raktimtech.driver.web.remote;

import com.raktimtech.driver.manager.web.remote.browserstack.BrowserStackChromeManager;
import com.raktimtech.driver.manager.web.remote.browserstack.BrowserStackFirefoxManager;
import com.raktimtech.driver.manager.web.remote.selenoid.SelenoidChromeManager;
import com.raktimtech.driver.manager.web.remote.selenoid.SelenoidFirefoxManager;
import com.raktimtech.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class BrowserStackFactory {

    private BrowserStackFactory() {}

    public static WebDriver getDriver(BrowserType browserType)
    {
        return browserType == BrowserType.CHROME ? BrowserStackChromeManager.getDriver(): BrowserStackFirefoxManager.getDriver() ;

    }
}
