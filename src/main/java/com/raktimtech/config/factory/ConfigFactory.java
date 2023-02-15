package com.raktimtech.config.factory;

import com.raktimtech.config.Frameworkconfig;
import org.aeonbits.owner.ConfigCache;

public final class ConfigFactory {

    private ConfigFactory() {}

    public static Frameworkconfig getConfig()
    {
        return ConfigCache.getOrCreate(Frameworkconfig.class) ;
    }
}
