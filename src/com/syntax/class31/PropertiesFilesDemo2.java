package com.syntax.class31;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFilesDemo2 {
    public static void main(String[] args) throws IOException {

        //first step is locating the file that we want to read.
        String path="C:\\Users\\hassa\\OneDrive\\Desktop\\Batch12/Config.properties";
        //reading the file from outside intelliJ (I copied the file and put in another place)

        //navigating to that location
        FileInputStream fileInputStream = new FileInputStream(path);

        //That special class which knows how to read the " .properties" file
        Properties properties = new Properties();

        //loading all the data from the file to the Properties object
        properties.load(fileInputStream);

        //now we can get the data from that file
        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));
        //we use .get() method like in maps to get the value from the key we passed

    }
}
