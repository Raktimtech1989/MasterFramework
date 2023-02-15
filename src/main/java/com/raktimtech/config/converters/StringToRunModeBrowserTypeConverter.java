package com.raktimtech.config.converters;

import com.raktimtech.enums.BrowserType;
import com.raktimtech.enums.RunModeBrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class StringToRunModeBrowserTypeConverter implements Converter<RunModeBrowserType> {


    @Override
    public RunModeBrowserType convert(Method method, String runMode) {
        return RunModeBrowserType.valueOf(runMode.toUpperCase()) ;
    }
}
