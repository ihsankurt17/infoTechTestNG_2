package com.infoTech.tests;

import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonKayitSayfasi extends TestBase {
    @Test
    public void amazonKayitSayfasi() throws InterruptedException {
        driver.get("https://amazon.com");
        Thread.sleep(3000);
        WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
        Actions actions = new Actions(driver);
        actions.moveToElement(accountList).perform();
        WebElement startHere = driver.findElement(By.partialLinkText("Start here."));
        startHere.click();
        Assert.assertEquals(driver.getTitle(),"Amazon Registration");
    }

    @Test(dependsOnMethods = "amazonKayitSayfasi")
    public void bilgiler() {
        WebElement customer_name = driver.findElement(By.id("ap_customer_name"));
        customer_name.sendKeys("emre");
        WebElement ap_email=driver.findElement(By.id("ap_email"));
        ap_email.sendKeys("emreInfo@gmail.com");
        driver.findElement(By.id("ap_password")).sendKeys("222222");
        driver.findElement(By.id("ap_password_check")).sendKeys("222222");
        driver.findElement(By.id("continue")).click();

    }
}
