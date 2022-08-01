package com.infoTech.tests;

import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dragAndDrop extends TestBase {
    @Test
    public void dragAnsDrops() {
        driver.get("https://demoqa.com/droppable");

        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement dropHere = driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
        action.dragAndDrop(drag, dropHere).perform();

        //Assert etmek icin
        //gerceklesen testin sonucu
        String actuelTest = driver.findElement(By.xpath("(//*[.='Dropped!'])[2]")).getText();
        System.out.println("actuelTest = " + actuelTest);

        //Benim bekledigim testin sonucu bu olmali
        Assert.assertEquals(actuelTest, "Dropped!");


    }

}
