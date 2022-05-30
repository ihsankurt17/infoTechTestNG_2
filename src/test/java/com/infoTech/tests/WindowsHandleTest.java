package com.infoTech.tests;

import com.infoTech.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowsHandleTest extends TestBase {
    @Test
    public void windowHandle() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/windows");
        String handle=driver.getWindowHandle();
        System.out.println(handle);

        driver.findElement(By.partialLinkText("Click Here")).click();
        Set<String>tumElementler=driver.getWindowHandles();

        for (String w:tumElementler){
            System.out.println(w);
        }

Object []array=(Object[]) tumElementler.toArray();
        String sonSayfaHandle=array[array.length-1].toString();
        System.out.println("son sayfa handle:"+sonSayfaHandle);
        Thread.sleep(3000);
        driver.switchTo().window(handle);



    }
}
