package com.infoTech.tests;

import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class fileUplod extends TestBase {
    @Test
    public void dosyaYuklemek() throws InterruptedException {

        //*******bilgisayardan internet sitesine dosya yukleme**********//
        /*
        Selenium,windows,mac gibi isletim sistemlerine erisemez.Bu yuzden manuel olarak dosya secimi yapamaz.
        Bu engeli asmak icin bilgisayarimizdaki dosya yolunu(Path) kullanarak yukleme islemi gerceklestirir
         */
        driver.get("http://the-internet.herokuapp.com/upload");
        WebElement dosyaSecmeButonu = driver.findElement(By.id("file-upload"));
        dosyaSecmeButonu.sendKeys("/Users/m/Desktop/InfoArsiv/image.png");
        Thread.sleep(3000);
        WebElement upload = driver.findElement(By.id("file-submit"));
        upload.submit();
        WebElement fileUploaded = driver.findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploaded.isDisplayed(), "yuklenmedi");
    }

    //******* internet sitesinden  bilgisayara dosya yukleme**********//
    @Test
    public void fileDownload() throws IOException, InterruptedException {

        driver.get("http://the-internet.herokuapp.com/download");
        WebElement resimIndir = driver.findElement(By.partialLinkText("beauty.jpg"));
        resimIndir.click();
        Thread.sleep(6000);

        //dosyanin istenilen yere indigini dogrulamak
        boolean indi_mi = Files.exists(Paths.get("/Users/m/Downloads/beauty.jpg"));
        Assert.assertTrue(indi_mi, "inmemis");
        Thread.sleep(5000);
        System.out.println("indi_mi = " + indi_mi);

        //dosyayi bilgisayardan(indigi yerden) silmek.
        boolean sil = Files.deleteIfExists(Paths.get("/Users/m/Downloads/beauty.jpg"));
        Assert.assertTrue(sil, "silinmedi");
        System.out.println("sil = " + sil);


    }
}
