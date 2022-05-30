package com.infoTech.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class SoftAssertTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void amazonArama() {
        driver.get("http://amazon.com");
        String title = driver.getTitle();
        System.out.println("titile:"+title);
        SoftAssert sortAssert = new SoftAssert();
        //  Assert.assertEquals();
        // Assert.assertTrue();
        //Assert.assertFalse();

        sortAssert.assertTrue(title.contains("Amazon"));
        sortAssert.assertEquals("online", title);
        sortAssert.assertFalse(title.contains("Car"));
        //yukaridki tum testleri,izin dogru olup olmadigini assert(dogrulamasini)yapiyoruz.
       sortAssert.assertAll();
    }

}
