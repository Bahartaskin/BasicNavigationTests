package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory2 {

    //Different approach from Kamuran, awesome classmate

    public static WebDriver getDriver(String browser){

        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("windows")&&browser.equalsIgnoreCase("safari")){
            return null;
        } else if (os.contains("mac")&&browser.equalsIgnoreCase("edge")) {
            return null;
        } else {

            switch (browser.toLowerCase()){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    return new ChromeDriver();
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    return new FirefoxDriver();
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    return new EdgeDriver();
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    return new SafariDriver();
                default:
                    throw new NoSuchContextException("Invalid browser type : " + browser);
            }

        }



    }

}
