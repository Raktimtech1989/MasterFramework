package com.raktimtech.config.owner;

import com.raktimtech.enums.ConfigProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public final class TryWithResources {

    private static Properties properties = new Properties();
    private static final Map<String,String> CONFIGMAP = new HashMap<String,String>() ;

    private TryWithResources(){} ;

    /*
    static class for avoiding explicit file call multiple times
     */
    static
    {
       try(FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/Frameworkconfig.properties"))
       {
           properties.load(fis);
           for(Map.Entry<Object , Object> entry : properties.entrySet())
           {
                 CONFIGMAP.put(String.valueOf(entry.getKey())  , String.valueOf(entry.getValue()).trim()) ;
           }
       }
       catch(IOException e)
       {
           e.printStackTrace();
           System.exit(0);
       }
    }

    public static String get(ConfigProperties key)  {
        if (Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key.name().toLowerCase()))) {
            throw new RuntimeException("Property name " + key + " is not found. Please check config.properties");
        }
        return CONFIGMAP.get(key.name().toLowerCase());
    }


}
