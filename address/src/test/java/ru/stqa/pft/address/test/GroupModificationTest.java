package ru.stqa.pft.address.test;

import org.testng.annotations.Test;
import ru.stqa.pft.address.module.Groupdata;

public class GroupModificationTest extends TestCasew {
    @Test

    public void GroupModification() {

        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectgroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().filGroupform(new Groupdata("test1", "test", "test10"));
        app.getGroupHelper().submintGroupModification();
        app.getGroupHelper().returnToGroup();
    }
}
