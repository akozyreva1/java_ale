package ru.stqa.pft.address.test;

import org.testng.annotations.Test;

public class DeleteKotaktTest extends TestCasew {
    @Test

    public void DeleteKotaktTest () {

        app.getGroupHelper().selectgroup();
        app.getKontatEdit().KlikKontakt();
        app.getKontatEdit().selectkontaktdelete();


    }


}