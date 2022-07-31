package com.infoTech.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    //abstract class'lardan nesne olusturamayiz
    //diger class'lardan miras almak icin bu sekilde olusturduk
    //private    => sadece ayni class
    //defoult    => ayni paket icinde
    //protected  => ayni paket + child class'larda
    //public     => her yerde

    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterClass
    public void tearDown() {
        //driver.quit();
    }
}
