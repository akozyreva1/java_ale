package ru.stqa.pft.address.test;

import org.testng.annotations.Test;


public class DeleteTestCaseGroup extends TestCasew {

  @Test
  public void DeleteTestGroup() {

   app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectgroup();
    app.getGroupHelper().selectgrouptdelete();
    app.getNavigationHelper().gotoGroupPage();
  }
}
