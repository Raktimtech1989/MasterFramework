package com.raktimtech.tests;

import com.raktimtech.config.Frameworkconfig;
import com.raktimtech.config.factory.ConfigFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigCache;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {

    //local , remote(selenium , selenoid , browserstack) : chrome , firefox

    @Test
    public  void testLogin()
    {
      //  Frameworkconfig config =  ConfigFactory.create(Frameworkconfig.class) ;
        //Frameworkconfig config = ConfigCache.getOrCreate(Frameworkconfig.class) ;
       System.out.println(ConfigFactory.getConfig().browser());
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver() ;
        driver.get("https://google.co.in");
        driver.quit();
    }
}
