package com.raktimtech.tests;

import com.raktimtech.config.owner.FrameworkOwnerconfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RunnerWithOwner {

    public static void main(String[] args) {

       FrameworkOwnerconfig config = ConfigFactory.create(FrameworkOwnerconfig.class) ;
        System.out.println(config.browser());

        System.out.println(config.browser().name());

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver() ;

        driver.manage().timeouts().implicitlyWait(config.timeout() , config.value())  ;
        boolean flag = config.takesscreenshot() ;
        if(flag)
        {
            //write the sreenshot code here
        }

        config.favtools().forEach(System.out::println);



    }
}
