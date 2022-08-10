package com.infoTech.tests;

import com.infoTech.pages.AmazonPage;
import com.infoTech.utilities.TestBase;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class AmazonTest extends TestBase {
    @Test
    public void amazonArama(){
        driver.get("https://amazon.com");
        AmazonPage apage=new AmazonPage(driver);
        apage.amazonArama.sendKeys("Baby stroller "+ Keys.ENTER);

    }
}
