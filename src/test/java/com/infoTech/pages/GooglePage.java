package com.infoTech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
    //Burasi her locater aldigimiz sayfa icin sabittir. ilk basta bunlar yapilir.
    //Bos bir webdriver degiskeni olusturuyoruz
    WebDriver driver;

    //Constructor olusturuyoruz ,1 tane parametresi var
    public GooglePage(WebDriver driver) {
         /*
        parametre olarak gelen driver nesnesini bu class'ta olusturdugumuz driver nesnemize esitledik.
        Bu sekilde yeniden bos bir driver olusturmak yerine zaten halihazirdaki kullandigimiz driver'i bu
        nesneye esitlemis olacagiz.
         */
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[.='Accept all']")
    public WebElement guvenlikDuvari;

    @FindBy(name="q")
    public WebElement searchBox;


}
