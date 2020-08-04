package ru.stqa.pft.address.test;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.address.aappmanager.Applicationmanager;


public class TestCasew {

    protected final Applicationmanager app = new Applicationmanager (BrowserType.CHROME);

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
    }


    @AfterMethod
    public void tearDown() throws Exception {
        app.stop();
    }
}


