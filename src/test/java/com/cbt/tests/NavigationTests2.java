package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NavigationTests2 {


    @Test
    public void navigationTest_Chrome(){

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://google.com");

        String googleTitle = driver.getTitle();

        driver.get("https://etsy.com");

        String etsyTitle = driver.getTitle();

        driver.navigate().back();

        String googleTitle2 = driver.getTitle();

        StringUtility.verifyEquals(googleTitle,googleTitle2);

        driver.navigate().forward();

        String etsyTitle2 = driver.getTitle();

        StringUtility.verifyEquals(etsyTitle,etsyTitle2);


        driver.close();


    }

    @Test
    public void navigationTest_Firefox(){

        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://google.com");

        String googleTitle = driver.getTitle();

        driver.get("https://etsy.com");

        String etsyTitle = driver.getTitle();

        driver.navigate().back();

        String googleTitle2 = driver.getTitle();

        StringUtility.verifyEquals(googleTitle,googleTitle2);

        driver.navigate().forward();

        String etsyTitle2 = driver.getTitle();

        StringUtility.verifyEquals(etsyTitle,etsyTitle2);

        driver.close();

    }

    @Test
    public void navigationTest_Edge(){


        WebDriver driver = BrowserFactory.getDriver("edge");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://google.com");

        String googleTitle = driver.getTitle();

        driver.get("https://etsy.com");

        String etsyTitle = driver.getTitle();

        driver.navigate().back();

        String googleTitle2 = driver.getTitle();

        StringUtility.verifyEquals(googleTitle,googleTitle2);

        driver.navigate().forward();

        String etsyTitle2 = driver.getTitle();

        StringUtility.verifyEquals(etsyTitle,etsyTitle2);

        driver.close();

    }

}
