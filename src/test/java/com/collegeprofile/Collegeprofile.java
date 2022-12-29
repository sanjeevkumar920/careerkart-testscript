package com.collegeprofile;
import com.TestNGListenerConcept.Base;
import com.TestNGListenerConcept.CustomListener;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

@Listeners(CustomListener.class)
public class Collegeprofile extends Base {
    @Test(groups = "College Profile",description = "College Profile Card PopUp Cross Button Verify")
    public void collegeProfileCard()throws Exception {
        initialization();
        driver.navigate().to("https://careerkarts.com/college/ipem");
        driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[4]/div/div[2]/div[2]/a[1]/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[4]/div/div[2]/div[2]/div[1]/div/div/div[1]/button")).click();
        System.out.println("******View Course PopUP is present Cross Button is Working*******");


    }
    @Test(groups = "College Profile",description = "College Profile Card PopUp Close Button Verify")
    public void collegeviewPopUp()throws Exception
    {
        initialization();
        driver.navigate().to("https://careerkarts.com/college/ipem");
        driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[4]/div/div[2]/div[2]/a[1]/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[4]/div/div[2]/div[2]/div[1]/div/div/div[3]/button")).click();
        System.out.println("******View Course PopUP is present Close Button is Working*******");

    }

    @Test(groups = "College Profile",description ="Verify Download button and Brochure")
    public void downloadBrochure()throws Exception {
         initialization();
        driver.navigate().to("https://careerkarts.com/college/ipem");
        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ListView1_brochureBtn_0\"]")).click();
        Thread.sleep(2000);
       // driver.findElement(By.xpath("/html/body/form/div[5]/div/div/div/div/div[1]/span")).click();
        System.out.println("******LogIn Popup present*******");
        driver.findElement(By.xpath("//*[@id=\"txtEmailID\"]")).sendKeys("sanjeev@assertitsolutions.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("sssss");
         Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"loginBtn\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ListView1_brochureBtn_0\"]")).click();
        System.out.println("******Brochure is Download*******");
    }


    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
}
