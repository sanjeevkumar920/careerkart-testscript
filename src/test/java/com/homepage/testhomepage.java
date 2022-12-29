
package com.homepage;

import com.TestNGListenerConcept.Base;
import com.TestNGListenerConcept.CustomListener;
import org.testng.Assert;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;
import com.TestNGListenerConcept.Base;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
@Listeners(CustomListener.class)
public class testhomepage extends Base {
  //  WebDriver driver=null;


    @BeforeClass
    public static void invokeBrowser() {
        System.setProperty("webdriver.chrome.driver", "/home/sanjeev/Downloads/gc/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

        driver.navigate().to("https://careerkarts.com");
    }



    @Test(priority = 1,description = "LOGO Verify")
    public void Logo()throws Exception {
        String homepagetitle = driver.getTitle();
        System.out.println("Home Page Url =:" + driver.getCurrentUrl());
        System.out.println("Homepage Title=:" + homepagetitle);
        driver.findElement(By.id("HyperLink1")).click();
        String logoUrl = driver.getTitle();
        if (logoUrl.length() == 0 || logoUrl.isEmpty())
            System.out.println("Test is fail");
        else
            System.out.println("LinkPage TitleIs =:" + logoUrl);
        String logoLinkPageTitle = driver.getTitle();
        System.out.println("Check the logo link page Title=:" + logoLinkPageTitle);

        if (homepagetitle.equals(logoLinkPageTitle))
            System.out.println("Link is working ***********************Test is Pass***********************");
        else
            System.out.println("title is not Match ********************Test is Fail***********************");
        driver.getCurrentUrl();
        System.out.println("Logo LinkPage Url=:" + driver.getCurrentUrl());
        Thread.sleep(4000);
    }

      @Test(priority = 2,description = "LogIN PopUP Verify")
      public void LogINPopUp()throws Exception{
        invokeBrowser();
        driver.findElement(By.xpath("/html/body/form/div[3]/div/header/div[1]/div/div/div/div")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("/html/body/form/div[5]/div/div/div/div/div[1]/span")).click();
          System.out.println("******LogIn Popup present*******");
          Thread.sleep(4000);

      }





   @AfterMethod
    public void closeBrowser(){
        driver.close();
    }





   }







