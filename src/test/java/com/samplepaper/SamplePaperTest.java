package com.samplepaper;

import com.TestNGListenerConcept.Base;
import com.TestNGListenerConcept.CustomListener;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListener.class)
public class SamplePaperTest extends Base {




    @Test(groups = "Sample Paper",description = "Verify Sample Paper pdf download login PopUp")
    public void SamplepaPaperPDF()
    {
    initialization();
        driver.navigate().to("https://careerkarts.com/sample-papers/up-board/10/english/2018-2019");
        driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div/div/a[2]/div")).click();
        driver.findElement(By.xpath("/html/body/form/div[5]/div/div/div/div/div[1]/span")).click();

    }
}
