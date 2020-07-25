package ru.stqa.pft.address.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.address.aappmanager.Applicationmanager;

public class TestCasew {

    protected final Applicationmanager app = new Applicationmanager();
    protected WebDriver wd;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
    }


    @AfterMethod
    public void tearDown() throws Exception {
        app.stop();
    }
}


