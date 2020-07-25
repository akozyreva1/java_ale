package ru.stqa.pft.address.aappmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KontatEdit {
    FirefoxDriver wd;
    public KontatEdit  (FirefoxDriver wd){
        this. wd=wd;
    }


    public void EditKontakt() {
        wd.findElement(By.xpath("(//img[@alt='Edit'])[4]")).click();
               wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys("chdtestovichdchd");
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys("testtestovichdtestovichdt");
        }
    public void Update () {
    wd.findElement(By.name("update")).click();

    }

    public void KnopkaHome() {
        wd.findElement(By.linkText("home page")).click();
    }
    }


