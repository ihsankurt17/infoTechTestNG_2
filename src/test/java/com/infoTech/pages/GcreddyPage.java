package com.infoTech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class GcreddyPage {
    WebDriver driver;
    public GcreddyPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (name = "username")
    public WebElement grcreddy_username;
    @FindBy(name = "password")
    public WebElement grcreddy_password;
    @FindBy(id = "tdb1")
    public WebElement grcreddy_login;
}
