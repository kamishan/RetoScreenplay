package com.demoqa.automation.utils;

import java.io.IOException;
import java.util.Properties;
import java.io.FileReader;

public class SpecialMethods {

    public static Properties properties;

    public static void waitFor(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void configProperties(){
        properties = new Properties();
        try {
            properties.load(new FileReader("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
