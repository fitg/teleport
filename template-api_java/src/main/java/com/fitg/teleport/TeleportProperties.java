package com.fitg.teleport;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class TeleportProperties {
    String result = "";
    InputStream inputStream;
    Properties properties = new Properties();

    public String getPropertyValue(String key) { return this.properties.getProperty(key); }

    public TeleportProperties() throws java.io.IOException {

        try {
            String propFileName = "config.properties";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                properties.load(inputStream);

            } else {
                throw new IOException("property file '" + propFileName + "' not found in the classpath");
            }

        } catch (IOException e) {
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }
    }
}
