package com.infoTech.tests;

import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JsAlert extends TestBase {
    @Test
    public void clickForJsAlert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement clik = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        clik.click();
        String alertMesaji = driver.switchTo().alert().getText();
        System.out.println("alertMesaji = " + alertMesaji);
        Thread.sleep(3000);

        //bir alertten nasil kurtulabilirz.asagidaki bilgi yeterli
        driver.switchTo().alert().accept();
        Assert.assertTrue(driver.findElement(By.id("result")).isDisplayed(), "You not successfully clicked an alert");


    }

    @Test
    public void clickForJsConfirm() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement clik = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        clik.click();

        //red etmek icin
        driver.switchTo().alert().dismiss();

//    kabul etmek icin
//    driver.switchTo().alert().accept();
//    boolean basarilimi=driver.findElement(By.id("result")).isDisplayed();
//    System.out.println("basarilimi = " + basarilimi);
//    Assert.assertTrue(basarilimi,"basarisiz");
    }

    @Test
    public void jSConfirmSend() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement button = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        button.click();

        String mesaj = driver.switchTo().alert().getText();
        System.out.println("mesaj = " + mesaj);
        //js alertte inspect yapamiyoruz. direk bu sekilde icine veri gonderiyoruz.
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("merhaba TestNG");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();


    }
}
