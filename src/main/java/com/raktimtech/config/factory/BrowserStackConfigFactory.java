package com.raktimtech.config.factory;

import com.raktimtech.config.Frameworkconfig;
import com.raktimtech.config.owner.BrowserStackConfig;
import org.aeonbits.owner.ConfigCache;

public final class BrowserStackConfigFactory {

    private BrowserStackConfigFactory() {}

    public static BrowserStackConfig getConfig()
    {
        return ConfigCache.getOrCreate(BrowserStackConfig.class) ;
    }
}
