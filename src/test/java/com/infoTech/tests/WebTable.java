package com.infoTech.tests;

import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WebTable extends TestBase {


//    @Test  //=> bunun yerine daha kullanisli bir method yazacagiz.
//    public void table(){
//        driver.get("https://demo.guru99.com/test/web-table-element.php");
//    }
@Test
    public void girisSayfasi() throws InterruptedException {
        driver.get("https://demo.guru99.com/test/web-table-element.php");
        WebElement guvenDuvari = driver.findElement(By.xpath("(//*[.='Accept All'])[4]"));
        Thread.sleep(6000);
         guvenDuvari.click();
    }

//    @Test
//    public void table() throws InterruptedException {
//        girisSayfasi();
//        Thread.sleep(4000);
//
//    }
}
