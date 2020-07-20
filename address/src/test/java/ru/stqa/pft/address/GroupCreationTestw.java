package ru.stqa.pft.address;

import org.testng.annotations.Test;

public class GroupCreationTestw extends TestCasew {


    @Test
    public void testGroupCreation() throws Exception {

        gotoGroupPage();
        initGroupCreation();
        filGroupform(new Groupdata("test1", "test", "test10"));
        submintGroupCreation();
        returnToGroup();
    }

}
