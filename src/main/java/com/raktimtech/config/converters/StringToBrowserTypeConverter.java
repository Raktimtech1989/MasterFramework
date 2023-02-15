package com.raktimtech.config.converters;

import com.raktimtech.enums.BrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class StringToBrowserTypeConverter implements Converter<BrowserType> {


    @Override
    public BrowserType convert(Method method, String browserName) {

        Map<String , BrowserType> stringBrowserTypeMap = new HashMap<String,BrowserType>() ;
        stringBrowserTypeMap.put("CHROME" , BrowserType.CHROME) ;
        stringBrowserTypeMap.put("FIREFOX" , BrowserType.FIREFOX);
        return stringBrowserTypeMap.getOrDefault(browserName.toUpperCase() , BrowserType.CHROME) ;
    }
}
