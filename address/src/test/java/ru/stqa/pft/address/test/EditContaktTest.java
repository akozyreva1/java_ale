package ru.stqa.pft.address.test;

import org.testng.annotations.Test;

public class EditContaktTest extends TestCasew {
    @Test
    public void EditContaktTest()
    {
        app.getKontatEdit().EditKontakt();
        app.getKontatEdit().Update();
        app.getKontatEdit().KnopkaHome();
        }

    }
