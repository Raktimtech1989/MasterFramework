package com.raktimtech.config.owner;

import com.raktimtech.config.converters.StringToBrowserTypeConverter;
import com.raktimtech.enums.BrowserType;
import com.raktimtech.enums.BrowserTypeOwner;
import org.aeonbits.owner.Config;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Config.Sources(value = "file:${user.dir}/src/test/resources/FrameworkOwnerconfig.properties")
public interface FrameworkOwnerconfig extends Config{

    @DefaultValue("CHROME")
    BrowserTypeOwner browser() ;

    Long timeout() ;
    boolean takesscreenshot() ;
    List<String> favtools() ;
    TimeUnit value() ;
}
