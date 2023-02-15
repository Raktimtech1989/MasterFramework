package com.raktimtech.driver.web.local;

import com.raktimtech.driver.manager.web.local.ChromeManager;
import com.raktimtech.driver.manager.web.local.FirefoxManager;
import com.raktimtech.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class LocalDriverFactory {

    private LocalDriverFactory() {} ;


    public static WebDriver getDriver(BrowserType browserType)
    {
        /*WebDriver driver = null;

        //cmd + option + m -> shortcut for extract a method from if conditions
        if(isBrowserChrome())
        {
            driver = ChromeManager.getDriver();
        }
        else
        {
            driver = FirefoxManager.getDriver();
        }
        return driver;*/

        //customizing the above codes as following
        return isBrowserChrome(browserType) ? ChromeManager.getDriver() : FirefoxManager.getDriver();
    }

    private static boolean isBrowserChrome(BrowserType browsertYPE) {
        //return ConfigFactory.getConfig().browser() == BrowserType.CHROME

        return browsertYPE == BrowserType.CHROME ;
    }
}
