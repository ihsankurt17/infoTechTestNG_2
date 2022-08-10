package com.infoTech.tests;

import com.infoTech.pages.GooglePage;
import com.infoTech.utilities.TestBase;
import org.testng.annotations.Test;

public class GoogleTest extends TestBase {

    @Test
    public void aramaTesti() {

        GooglePage page = new GooglePage(driver);
        driver.get("https://google.com");
        page.guvenlikDuvari.click();
        page.searchBox.sendKeys("page'e selam olsun");

    }
}
