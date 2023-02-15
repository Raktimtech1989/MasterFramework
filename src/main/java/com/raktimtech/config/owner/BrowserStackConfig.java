package com.raktimtech.config.owner;

import com.raktimtech.config.converters.StringToURLConverter;
import org.aeonbits.owner.Config;

import java.net.URL;

public interface BrowserStackConfig extends Config {

    String username() ;
    String key() ;

    @DefaultValue("https://${username}:${key}@hub-cloud.browserstack.com/wd/hub" )
    @ConverterClass(StringToURLConverter.class)
    URL browserStackURL() ;
}
