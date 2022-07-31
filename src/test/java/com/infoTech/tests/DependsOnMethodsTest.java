package com.infoTech.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DependsOnMethodsTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void googleArama() {
        driver.get("http://google.com");
    }

    @Test(dependsOnMethods = "googleArama")
    public void facebookArama() {
        driver.get("http://facebook.com");
    }

    @Test(dependsOnMethods = "facebookArama")
    public void amazonArama() {
        driver.get("http://amazon.com");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}