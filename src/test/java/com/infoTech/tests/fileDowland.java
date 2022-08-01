package com.infoTech.tests;

import com.infoTech.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class fileDowland extends TestBase {
    @Test
    public void dosyaVarmiYokmu() {
        //bir dosyanin var olup olmadigini kontrol etmek icin
        //bulunan klasorun yolunu(path)verir
        System.out.println(System.getProperty("user.dir"));//=>/Users/m/Desktop/IJ/infoTechTestNG_2

        //Kullanici ana klasorune ulasmak icin
        System.out.println(System.getProperty("user.home")); //=>/Users/m

        String kullaniciDosyaYolu = System.getProperty("user.dir");
        //=>/Users/m/Desktop/IJ/infoTechTestNG_2
        System.out.println("Kullanici Dosya Yolu => " + kullaniciDosyaYolu);


        //aradigimiz dosyanin yolunu yaziyoruz(pom u ariyoruz var mi yok mu)
        String pomXmlDosyaYolu = kullaniciDosyaYolu + "/pom.xml";//kendimiz manuel olarak yazdik.
        boolean varMI = Files.exists(Paths.get(pomXmlDosyaYolu));
        System.out.println(varMI);
        Assert.assertTrue(varMI);
    }
}


