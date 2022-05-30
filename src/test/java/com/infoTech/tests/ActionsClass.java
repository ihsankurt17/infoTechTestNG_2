package com.infoTech.tests;

import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class ActionsClass extends TestBase {
    @Test
    public void rightClick() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement element=driver.findElement(By.id("hot-spot"));

        Actions actions=new Actions(driver);
        Thread.sleep(5000);
        actions.contextClick(element).perform();
    }
@Test
    public void doubleClick_Method() throws InterruptedException {
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
    WebElement guvenlikDuvar=driver.findElement(By.xpath("//*[.='Consent']"));
    Thread.sleep(3000);
    guvenlikDuvar.click();
        WebElement double_Click=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
    Actions actions=new Actions(driver);
        actions.doubleClick(double_Click).perform();

}
@Test
public void mouse() throws InterruptedException {
    driver.get("http://amazon.com");
    Thread.sleep(3000);
    Actions actions=new Actions(driver);
    WebElement sign= driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
    Thread.sleep(3000);
    actions.moveToElement(sign).perform();
}
}
