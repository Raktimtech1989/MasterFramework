package com.raktimtech.tests;

import com.raktimtech.config.owner.TryWithResources;
import com.raktimtech.enums.ConfigProperties;

public class TryWithResourceRunner {

    public static void main(String[] args) {
       String browser =  TryWithResources.get(ConfigProperties.BROWSER) ;
        System.out.println("BROWSER NAME IS  "  + browser);

    }
}
