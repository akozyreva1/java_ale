package ru.stqa.pft.address.test;


import org.testng.annotations.Test;

public class DeleteKotaktTest extends TestCasew {
    @Test

    public void DeleteKotaktTest ()
    {
        app.getGroupHelper().selectgroup();
        app.getGroupHelper().submintGroupModification();
        app.getGroupHelper().selectgrouptdelete();
        CloseWind();
    }

    private void CloseWind() {
        wd.switchTo().alert().accept();
    }
}