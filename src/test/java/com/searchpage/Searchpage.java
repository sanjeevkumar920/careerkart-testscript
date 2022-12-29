package com.searchpage;

import com.TestNGListenerConcept.Base;
import com.TestNGListenerConcept.CustomListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;
@Listeners(CustomListener.class)
public class Searchpage extends Base {
    WebDriver driver;
    @BeforeMethod
    public void invokeBrowser() {
        System.setProperty("webdriver.chrome.driver", "/home/sanjeev/Downloads/gc/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

        driver.navigate().to("https://careerkarts.com/search");
    }

     @Test(description = "College Card Verify")
    public void  Collegecard()throws Exception{
         driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[1]/td")).click();
         Thread.sleep(2000);

         System.out.println("******College Card is present and working*******");

        // Thread.sleep(4000);


     }
     @Test(description = "College Card view more button Verify")
    public void Collegecardviewmore()throws Exception
     {
         driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_GridView1_LinkButton1_0\"]")).click();
         Thread.sleep(2000);
         System.out.println("******College Card view more button  is present and working*******");
     }

    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
}
