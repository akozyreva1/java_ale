package ru.stqa.pft.address.aappmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.address.module.Groupdata;

public class GroupHelper {

    private FirefoxDriver wd;
    public GroupHelper (FirefoxDriver wd){
        this. wd=wd;
    }

    public GroupHelper() {

    }

    public void returnToGroup() {
        wd.findElement(By.linkText("group page")).click();
    }

    public void submintGroupCreation() {
        wd.findElement(By.name("submit")).click();
    }

    public void filGroupform(Groupdata groupdata) {
        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys(groupdata.getName());
        wd.findElement(By.name("group_header")).click();
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys(groupdata.getHeader());
        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys(groupdata.getFooter());
    }

    public void initGroupCreation() {
        wd.findElement(By.name("new")).click();
    }

    public void selectgrouptdelete() {
      wd.findElement(By.name("delete")).click();
    }

    public void selectgroup() {
      wd.findElement(By.name("selected[]")).click();
    }

    public void initGroupModification() {
        wd.findElement(By.name("edit")).click();
    }

    public void submintGroupModification() {
        wd.findElement(By.name ("update")).click();
    }
}

