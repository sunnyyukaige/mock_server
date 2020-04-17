package com.farfetch.fe.mock.utils;

import java.io.*;
import java.util.Properties;


public class ConfigUtil {

    private static Properties properties;
    private static InputStream inputStream;

    private static String CURRENT_PATH = System.getProperty("user.dir");
    public static String CURRENT_MAIN_RESOURCES = CURRENT_PATH + "/src/main/resources/";
    public static String CURRENT_TEST_RESOURCES = CURRENT_PATH + "/src/test/resources/";

    static {
        properties = new Properties();
        try {
            inputStream = new BufferedInputStream(new FileInputStream(CURRENT_MAIN_RESOURCES + "wiremock.properties"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static String read(String configKey) {
        try {
            properties.load(inputStream);
            return properties.getProperty(configKey);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
