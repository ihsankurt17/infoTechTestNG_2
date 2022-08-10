package com.infoTech.tests;

import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

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

    @Test
    public void table() throws InterruptedException {
        girisSayfasi();
        Thread.sleep(3000);
        //tbody kismindaki verileri almak icin kullaniyoruz
        WebElement tbody = driver.findElement(By.xpath("//tbody"));
        System.out.println(tbody.getText());
        System.out.println("=================================================");
        //Tum basliklari almak icin
        List<WebElement> baslik = driver.findElements(By.xpath("//thead/tr/th"));
        for (WebElement basliklar : baslik) {
            System.out.println(basliklar.getText());
        }
    }

    @Test
    public void tumSatirlari() throws InterruptedException {
        girisSayfasi();
        Thread.sleep(3000);
        //tum satirlari yazdirmak icin
        List<WebElement> tumSatirlar = driver.findElements(By.xpath("//tbody/tr"));
        for (WebElement satirlar : tumSatirlar) {
            System.out.println(satirlar.getText());
        }
    }

    @Test
    public void tumHucreler() throws InterruptedException {
        girisSayfasi();
        Thread.sleep(3000);
        //hucreleri yazdirmak icin
        List<WebElement> tumHucreler = driver.findElements(By.xpath("//tbody/tr/td"));
        for (WebElement hucreler : tumHucreler) {
            System.out.println(hucreler.getText());
        }
         /*
        "//" ile "/" slash arasindaki fark
        -Eger tek slash "/" eklerseniz basamk basamk gideriz.o webelementin childe manasina gelir
            ornek://tbody/tr[2]/td[3]
        -eger cift "//" slash eklerseniz ,bu childe olabilir onun torunu,yada torununun torunu.
            ornek: //tbody//td[3]
         */
    }

    @Test
    public void tumSutun() throws InterruptedException {
        girisSayfasi();
        Thread.sleep(3000);
        List<WebElement> tumSutun = driver.findElements(By.xpath("//tbody//td[3]"));
        for (WebElement sutun : tumSutun) {
            System.out.println(sutun.getText());
        }
        /*

        thead  => Table head =? tablonun en ust kismi
        tbody  => table body => tablonun govde kismi
        tr => table row => tablodaki satir
        td=> table data => tablodaki veri

*/
    }

    //Istenilen Hucreleri yazdir methodu ile yazdirma. (x,y) simetrisi gibi, bu istenilen satir ve stun yazdirmak icin kullanilir.
    public void hucreYazdir(int satir, int sutun) {
        String xpathDegerim = "//tbody/tr[" + satir + "]/td[" + sutun + "]";
        //tbody/tr[  6  ]/td[  5  ]
        WebElement hucre = driver.findElement(By.xpath(xpathDegerim));
        System.out.println(hucre.getText());
    }

    @Test
    public void calistir() throws InterruptedException {
        girisSayfasi();
        Thread.sleep(3000);
        hucreYazdir(5, 1);
        hucreYazdir(9, 2);
        hucreYazdir(12, 4);
        hucreYazdir(15, 6);
    }
    /*

1.https://demo.guru99.com/test/web-table-element.php sayfasina gidiniz

2-Tbody'nin icerisinde kac satir var,satir sayisiniz ekrana yazdiriniz

   tbody/tr -> findElements

3-ucuncu satirdaki verileri ekrana yazdiriniz

   tbody/tr[3]

 */

    @Test
    public void ornek() throws InterruptedException {
        girisSayfasi();
        List<WebElement> tumSatirlar = driver.findElements(By.xpath("//tbody/tr"));
        System.out.println("Tabloda " + tumSatirlar.size() + " tane satir vardir");

        WebElement ucuncuSatir = driver.findElement(By.xpath("//tbody/tr[3]"));
        System.out.println(ucuncuSatir.getText());
    }
}


