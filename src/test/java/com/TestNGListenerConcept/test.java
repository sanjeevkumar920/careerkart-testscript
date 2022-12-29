package com.TestNGListenerConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class test {
    WebDriver driver;


  ///  @BeforeClass
    public void invokeBrowser() {
        System.setProperty("webdriver.chrome.driver", "/home/sanjeev/Downloads/gc/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

        driver.navigate().to("https://careerkarts.com");
    }


   // @Test
    public void searchbarverify()
    {
        driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div[1]/div[1]/div[1]/div[1]/div/div/div/div/div/div/a/span")).click();

    }

}
