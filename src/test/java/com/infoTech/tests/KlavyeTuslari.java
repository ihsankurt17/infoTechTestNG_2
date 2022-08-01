package com.infoTech.tests;

import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KlavyeTuslari extends TestBase {
    @Test
    public void asagiYukari() throws InterruptedException {
        driver.get("https://amazon.com");
        Actions action = new Actions(driver);

        //Asagi inmek istiyorsak
        action.sendKeys(Keys.PAGE_DOWN).perform();

        //Yeterli gelmez ise bir daha yazilabilir
        action.sendKeys(Keys.PAGE_DOWN).perform();
        action.sendKeys(Keys.PAGE_DOWN).perform();

        //sayfanin sonuna(en asagisina) gitmek istiyorsak
        action.sendKeys(Keys.END).perform();
        Thread.sleep(2000);

        //sayfanin yukarisina gitmek istiyorsak
        action.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(3000);

        //Saga gitmek istersek
        action.sendKeys(Keys.ARROW_RIGHT);

        //Sola gitmek istersek
        action.sendKeys(Keys.ARROW_LEFT);

    }

    @Test
    public void kucukBuyukYazma() throws InterruptedException {
        driver.get("http://google.com");
        //google guvenlik duvari
        WebElement guvenlikDuvari = driver.findElement(By.xpath("//*[.='Accept all']"));
        Thread.sleep(3000);
        guvenlikDuvari.click();

        WebElement arama = driver.findElement(By.name("q"));
        Actions actions = new Actions(driver);
        Thread.sleep(3000);

        //Mause ile arama kutusuna tikla
        actions.moveToElement(arama).click()
                .keyDown(Keys.SHIFT).sendKeys("mErHaBa")//shift tusuna bastim ve yazimi gonderdim
                .keyUp(Keys.SHIFT).sendKeys(" nasilsiniz"+Keys.ENTER)//shift tusundan elimi kaldirdim ve yazimi gonderdim
                .perform();

    }
}
