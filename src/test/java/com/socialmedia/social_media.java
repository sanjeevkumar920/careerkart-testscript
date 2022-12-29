package com.socialmedia;

import com.TestNGListenerConcept.Base;
import com.TestNGListenerConcept.CustomListener;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
@Listeners(CustomListener.class)
public class social_media extends Base {
    WebDriver driver;


    @BeforeClass
    public void invokeBrowser() {
        System.setProperty("webdriver.chrome.driver", "/home/sanjeev/Downloads/gc/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);


    }

    @Test(priority = 1,description = "Verify Social Media Links and Titles on Home Page")
    public void verifyTitle() throws Exception {
        driver.navigate().to("https://careerkarts.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000)");
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/form/div[3]/div/footer/div/div[2]/div/div/div[2]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/form/div[3]/div/footer/div/div[2]/div/div/div[2]/ul/li[2]/a/i")).click();
        driver.findElement(By.xpath("/html/body/form/div[3]/div/footer/div/div[2]/div/div/div[2]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("/html/body/form/div[3]/div/footer/div/div[2]/div/div/div[2]/ul/li[4]/a/i")).click();

        driver.findElement(By.xpath("/html/body/form/div[3]/div/footer/div/div[2]/div/div/div[2]/ul/li[5]/a/i")).click();
        Thread.sleep(1000);
        //driver.close();
        //System.out.println(driver.getTitle());
        String handle = driver.getWindowHandle();

        String title = driver.switchTo().window(handle).getCurrentUrl();
        System.out.println(title);

        // It will return the parent window name as a String
        String parent = driver.getWindowHandle();

// This will return the number of windows opened by Webdriver and will return Set of St//rings
        Set<String> s1 = driver.getWindowHandles();

// Now we will iterate using Iterator
        Iterator<String> I1 = s1.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();

// Here we will compare if parent window is not equal to child window then we            will close

            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);

                System.out.println(driver.switchTo().window(child_window).getTitle());
                Thread.sleep(1000);
                System.out.println(driver.switchTo().window(child_window).getCurrentUrl());
                driver.close();
            }


        }

    }


    @Test(priority = 2,description = "Verify Social Media Links and Titles on ContactUs Page")
    public void contactUsPage() throws Exception {
        invokeBrowser();
            driver.navigate().to("https://careerkarts.com/contact");
           // JavascriptExecutor js = (JavascriptExecutor) driver;
            //js.executeScript("window.scrollBy(0,5000)");
            Thread.sleep(4000);
            driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div[3]/div/div/div[1]/section/ul[1]/li[1]/a/i")).click();
            driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div[3]/div/div/div[1]/section/ul[1]/li[2]/a/i")).click();
            driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div[3]/div/div/div[1]/section/ul[1]/li[3]/a/i")).click();
            driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div[3]/div/div/div[1]/section/ul[1]/li[4]/a/i")).click();
            driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div[3]/div/div/div[1]/section/ul[1]/li[5]/a/i")).click();
        Thread.sleep(1000);

            //driver.close();
            //System.out.println(driver.getTitle());
            String handle = driver.getWindowHandle();

            String title = driver.switchTo().window(handle).getCurrentUrl();
            System.out.println(title);

            // It will return the parent window name as a String
            String parent = driver.getWindowHandle();

// This will return the number of windows opened by Webdriver and will return Set of St//rings
            Set<String> s1 = driver.getWindowHandles();

// Now we will iterate using Iterator
            Iterator<String> I1 = s1.iterator();

            while (I1.hasNext()) {

                String child_window = I1.next();

// Here we will compare if parent window is not equal to child window then we            will close

                if (!parent.equals(child_window)) {
                    driver.switchTo().window(child_window);

                    System.out.println(driver.switchTo().window(child_window).getTitle());
                    System.out.println(driver.switchTo().window(child_window).getCurrentUrl());
                    driver.close();
                }


            }


        }





    @AfterMethod
    public void closeBrowser() {
        driver.quit();

    }

}
