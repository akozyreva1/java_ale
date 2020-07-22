package ru.stqa.pft.address.aappmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper {
    private FirefoxDriver wd;
    public NavigationHelper (FirefoxDriver wd){
        this. wd=wd;

    }

    public NavigationHelper() {

    }

    public void gotoGroupPage() {
        wd.findElement(By.linkText("groups")).click();
    }
}
