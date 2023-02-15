package com.raktimtech.config;

import com.raktimtech.config.converters.StringToBrowserTypeConverter;
import com.raktimtech.config.converters.StringToURLConverter;
import com.raktimtech.enums.BrowserRemoteModeType;
import com.raktimtech.enums.BrowserType;
import com.raktimtech.enums.RunModeBrowserType;
import org.aeonbits.owner.Config ;

import java.net.URL;


@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties" ,
        "system:env" ,
        "file:${user.dir}/src/test/resources/Frameworkconfig.properties"
})
public interface Frameworkconfig extends Config{

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser() ;

    @Key("runModeBrowser")
    RunModeBrowserType browserRunMode();

    @Key("browserRemoteMode")
    BrowserRemoteModeType browserRemoteMode() ;

      @ConverterClass(StringToURLConverter.class)
      URL seleniumGridURL();

      @ConverterClass(StringToURLConverter.class)
      URL selenoidURL() ;



}
