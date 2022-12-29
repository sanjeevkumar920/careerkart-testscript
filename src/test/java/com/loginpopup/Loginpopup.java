package com.loginpopup;


import com.TestNGListenerConcept.Base;
import com.TestNGListenerConcept.CustomListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
@Listeners(CustomListener.class)
public class Loginpopup extends Base {


    @BeforeMethod
    public void invokeBrowser() {
        System.setProperty("webdriver.chrome.driver", "/home/sanjeev/Downloads/gc/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

        // driver.navigate().to("https://careerkarts.com");
    }

    @Test(description = "Verify Login PopUp ON HomePage")
    public void loginHomePage() throws Exception {
        driver.navigate().to("https://careerkarts.com");
        driver.findElement(By.xpath("/html/body/form/div[3]/div/header/div[1]/div/div/div/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/form/div[5]/div/div/div/div/div[1]/span")).click();
        System.out.println("******LogIn Popup present*******");

    }

    @Test(groups = "College Profile",description = "Verify Write a Review Button")
     public void loginWriteReviewbtn()throws Exception{
        driver.navigate().to("https://careerkarts.com/college/ipem");
        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ListView1_reviewBtn_0\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/form/div[5]/div/div/div/div/div[1]/span")).click();
        System.out.println("******LogIn Popup present*******");

    }
    @Test(groups = "College Profile",description = "Verify Download Brochure Button")
    public void logindownBrochurbtn()throws Exception{
        driver.navigate().to("https://careerkarts.com/college/ipem");
        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ListView1_brochureBtn_0\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/form/div[5]/div/div/div/div/div[1]/span")).click();
        System.out.println("******LogIn Popup present*******");

    }

    @Test(groups = "College Profile",description = "Verify Ask Button")
    public void loginAskbtn()throws Exception{
        driver.navigate().to("https://careerkarts.com/college/ipem");
        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_askBtn\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/form/div[5]/div/div/div/div/div[1]/span")).click();
        System.out.println("******LogIn Popup present*******");

    }
    @Test(groups = "College Profile",description = "Verify Contact Button")
    public void loginContactbtn()throws Exception{
        driver.navigate().to("https://careerkarts.com/college/ipem");
        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ListView4_showContactBtn_0\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/form/div[5]/div/div/div/div/div[1]/span")).click();
        System.out.println("******LogIn Popup present*******");

    }

    @Test(groups = "Sample Paper",description = "Verify Sample Paper pdf download login PopUp")
    public void samplePaperLoingPupUp()
    {

        driver.navigate().to("https://careerkarts.com/sample-papers/up-board/10/english/2018-2019");
        driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div/div/a[2]/div")).click();
       driver.findElement(By.xpath("/html/body/form/div[5]/div/div/div/div/div[1]/span")).click();

    }

   @AfterMethod
    public void closeBrowser() {
        driver.close();
    }

}