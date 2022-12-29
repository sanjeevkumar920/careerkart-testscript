package com.TestNGListenerConcept;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Base {


   public static WebDriver driver;
    public static void initialization()
    {
        System.setProperty("webdriver.chrome.driver", "/home/sanjeev/Downloads/gc/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);


        //driver.get("https://careerkarts.com");


    }
  public void failed(String testMethodName){

      File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     try{
         FileUtils.copyFile(scrFile,new File("/home/sanjeev/IdeaProjects/cktest/screenshots/"+testMethodName+"-"+".jpeg"));
     }
       catch (IOException e) {
         e.printStackTrace();
       }
  }

}
