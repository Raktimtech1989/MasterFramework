package com.raktimtech.config.converters;

import com.raktimtech.enums.BrowserRemoteModeType;
import com.raktimtech.enums.RunModeBrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToBrowserRemoteModeTypeConverter implements Converter<BrowserRemoteModeType> {


    @Override
    public BrowserRemoteModeType convert(Method method, String remoteMode) {
        return BrowserRemoteModeType.valueOf(remoteMode.toUpperCase()) ;
    }
}
