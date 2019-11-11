package com.fitg.teleport;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        TeleportProperties properties = null;

        try {
            properties = new TeleportProperties();
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println( "Hello World! " + properties.getPropertyValue("url") );
        }
    }
}
