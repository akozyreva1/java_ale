package ru.stqa.pft.address.test;

import org.testng.annotations.Test;
import ru.stqa.pft.address.module.Groupdata;

public class GroupCreationTestw extends TestCasew {


    @Test
    public void testGroupCreation() throws Exception {

        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().filGroupform(new Groupdata("test1", "test", "test10"));
        app.getGroupHelper().submintGroupCreation();
        app.getGroupHelper().returnToGroup();
    }

}
