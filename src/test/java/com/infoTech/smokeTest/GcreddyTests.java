package com.infoTech.smokeTest;

import com.infoTech.pages.GcreddyPage;
import com.infoTech.utilities.ConfigurationReader;
import com.infoTech.utilities.TestBase;
import org.testng.annotations.Test;

public class GcreddyTests extends TestBase {

    @Test
    public void giris(){
        driver.get(ConfigurationReader.getProperty("gcreddy_link"));
        GcreddyPage gPage=new GcreddyPage(driver);
        gPage.grcreddy_username.sendKeys(ConfigurationReader.getProperty("gcreddy_userName"));
        gPage.grcreddy_password.sendKeys(ConfigurationReader.getProperty("gcreddy_passWord"));
        gPage.grcreddy_login.click();
    }
}
