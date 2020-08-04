package ru.stqa.pft.address.aappmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.address.module.GroupKontact;

public class ContactHelper {

    WebDriver wd;
    public ContactHelper (WebDriver wd){
        this. wd=wd;

    }

    public void InputContact(GroupKontact groupKontact) {
        vfn(groupKontact.getFirstname());
        vmn(groupKontact.getMiddlename());
        vln(groupKontact.getLastname());
        vaddress(groupKontact.getAddress());
        vtel(groupKontact.getTelef());
        vmail(groupKontact.getMail());
    }

    public void vmail(String mail) {
        wd.findElement(By.name("email")).click();
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys(mail);
    }

    public void vtel(String telef) {
        wd.findElement(By.name("mobile")).click();
        wd.findElement(By.name("mobile")).clear();
        wd.findElement(By.name("mobile")).sendKeys(telef);
    }

    public void vaddress(String address) {
        wd.findElement(By.name("address")).click();
        wd.findElement(By.name("address")).click();
        wd.findElement(By.name("address")).clear();
        wd.findElement(By.name("address")).sendKeys(address);
    }

    public void vln(String lastname) {
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(lastname);
    }

    public void vmn(String middlename) {
        wd.findElement(By.name("middlename")).click();
        wd.findElement(By.name("middlename")).clear();
        wd.findElement(By.name("middlename")).sendKeys(middlename);
    }

    public void vfn(String firstname) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(firstname);
    }

    public void addcontact() {
        wd.findElement(By.linkText("add new")).click();
    }
}
