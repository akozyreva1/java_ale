package ru.stqa.pft.address.aappmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KontatEdit {
    FirefoxDriver wd;
    public KontatEdit  (FirefoxDriver wd){
        this. wd=wd;
    }


    public void EditKontakt() {
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys("chdtestovichdchd");
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys("testtestovichdtestovichdt");
        }


    public void KlikKontakt() { wd.findElement(By.xpath ("//img[@alt='Edit']")).click();}

    public void Update () {wd.findElement(By.name("update")).click();}

    public void KnopkaHome() { wd.findElement(By.linkText("home page")).click();
    }
    public void selectkontaktdelete() {
        wd.findElement(By.xpath("//input[@value='Delete']")).click();
    }
}


