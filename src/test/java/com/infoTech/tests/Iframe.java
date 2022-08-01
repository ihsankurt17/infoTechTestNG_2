package com.infoTech.tests;

import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Iframe extends TestBase {
    @Test
    public void IframeTest1() {
        driver.get("https://the-internet.herokuapp.com/iframe");

        //1-index ile gecis yapmiyorum
        //index her zaman 0 ile baslar
        //eger birden fazla kutucuk olsaydi o zaman ona gore index yazardik
        //WebDriver yazi = driver.switchTo().frame(0);
        driver.switchTo().frame(0);

        //paragraf kisminin WebElementini aldim.
        //WebElement paragraf=driver.findElement(By.id("tinymce"));
        //paragraf.click();//eger xpath alirsak click e gerek kalmaz.
        WebElement paragraf = driver.findElement(By.xpath("//p"));
        paragraf.clear();
        paragraf.sendKeys("index ile selamlar");


    }

    @Test
    public void IframeTest2() {
        driver.get("https://the-internet.herokuapp.com/iframe");

        //iframedeki ya id yada name olacak body veya diger yerlerdeki olmaz.
        driver.switchTo().frame("mce_0_ifr");

        //sonra yazilacak yerin locateri bulunur
        WebElement paragrafim = driver.findElement(By.xpath("//body[@id='tinymce']"));
        paragrafim.clear();
        paragrafim.sendKeys("id or name  ile selamlama");

    }

    @Test
    public void IframeTest3() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/iframe");
        //iframe'in elementini buluyoruz
        WebElement iframe_locater = driver.findElement(By.id("mce_0_ifr"));
        //buldugumuz webelementle asagida gecis yapiyoruz "IFRAME" gecis yaptik
        driver.switchTo().frame(iframe_locater);
        Thread.sleep(3000);

        //BU WebElementte paragraf kismina veri gondermek icin bulduk
        //yazi yazilacak yerin locateri
        WebElement paragrafim = driver.findElement(By.xpath("//body[@id='tinymce']"));
        paragrafim.clear();
        paragrafim.sendKeys("id ve value ile selamlama");
    }

    @Test
    public void IframeTest4_iframedenCikisYapmak() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/iframe");
        //1-index ile gecis yapmiyorum
        //index her zaman 0 ile baslar
        //eger birden fazla kutucuk olsaydi o zaman ona gore index yazardik
        //WebDriver yazi = driver.switchTo().frame(0);
        driver.switchTo().frame(0);

        //paragraf kisminin WebElementini aldim.
        //WebElement paragraf=driver.findElement(By.id("tinymce"));
        //paragraf.click();//eger xpath alirsak click e gerek kalmaz.
        WebElement paragraf = driver.findElement(By.xpath("//p"));
        paragraf.clear();
        paragraf.sendKeys("index ile selamlar");
        Thread.sleep(3000);

        //iframeden cikis yapmak ve diger yerlere tiklamak.
        driver.switchTo().defaultContent();
        WebElement button_selenium = driver.findElement(By.partialLinkText("Elemental Selenium"));
        button_selenium.click();

    }
}
