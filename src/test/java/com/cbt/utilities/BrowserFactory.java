package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    public static WebDriver getDriver(String browser) {

        if (System.getProperty("os.name").contains("Windows")) {
            if (browser.equalsIgnoreCase("safari")) {
                browser = null;
            }
        } else if (System.getProperty("os.name").contains("Mac")) {
            if (browser.equalsIgnoreCase("edge")) {
                browser = null;
            }
        }

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        } else if (browser.equalsIgnoreCase("safari")){
            WebDriverManager.safaridriver().setup();
            return new SafariDriver();
        }else{
            System.out.println("Given browser type does not exist/or is not currently supported");
            System.out.println("Driver = null");
            return null;
        }

    }

}
