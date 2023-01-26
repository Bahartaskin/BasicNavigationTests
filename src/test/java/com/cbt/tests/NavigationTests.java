package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class NavigationTests {

    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://google.com");

        String googleTitleChrome = driver.getTitle();

        driver.get("https://etsy.com");

        String etsyTitleChrome = driver.getTitle();

        driver.navigate().back();

        String googleTitleChrome2 = driver.getTitle();

        StringUtility.verifyEquals(googleTitleChrome,googleTitleChrome2);

        driver.navigate().forward();

        String etsyTitleChrome2 = driver.getTitle();

        StringUtility.verifyEquals(etsyTitleChrome,etsyTitleChrome2);


        driver.close();


        System.out.println("------------------------------------------------------------");



        WebDriver driver3 = BrowserFactory.getDriver("edge");
        driver3.manage().window().maximize();
        driver3.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver3.get("https://google.com");

        String googleTitleEdge = driver3.getTitle();

        driver3.get("https://etsy.com");

        String etsyTitleEdge = driver3.getTitle();

        driver3.navigate().back();

        String googleTitleEdge2 = driver3.getTitle();

        StringUtility.verifyEquals(googleTitleEdge,googleTitleEdge2);

        driver3.navigate().forward();

        String etsyTitleEdge2 = driver3.getTitle();

        StringUtility.verifyEquals(etsyTitleEdge,etsyTitleEdge2);

        driver3.close();


        System.out.println("------------------------------------------------------------");


        WebDriver driver2 = BrowserFactory.getDriver("firefox");
        driver2.manage().window().maximize();
        driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver2.get("https://google.com");

        String googleTitleFirefox = driver2.getTitle();

        driver2.get("https://etsy.com");

        String etsyTitleFirefox = driver2.getTitle();

        driver2.navigate().back();

        String googleTitleFirefox2 = driver2.getTitle();

        StringUtility.verifyEquals(googleTitleFirefox,googleTitleFirefox2);

        driver2.navigate().forward();

        String etsyTitleFirefox2 = driver2.getTitle();

        StringUtility.verifyEquals(etsyTitleFirefox,etsyTitleFirefox2);

        driver2.close();



    }

}
