package com.raktimtech.driver.manager;

import com.raktimtech.config.factory.ConfigFactory;
import com.raktimtech.enums.BrowserRemoteModeType;
import org.openqa.selenium.WebDriver;

public final class RemoteDriverFactory {

    private RemoteDriverFactory() {}

    public static WebDriver getDriver()
    {
        if(ConfigFactory.getConfig().browserRemoteMode()== BrowserRemoteModeType.SELENIUM)
        {
             //selenium grid remote execution code
        }
        else if(ConfigFactory.getConfig().browserRemoteMode()== BrowserRemoteModeType.DOCKER)
        {
            //docker remote execution
        }

        return null;
    }


}
