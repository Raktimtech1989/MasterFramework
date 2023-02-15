package com.raktimtech.config;

import com.raktimtech.config.converters.StringToBrowserTypeConverter;
import com.raktimtech.enums.BrowserType;
import org.aeonbits.owner.Config ;


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

}
