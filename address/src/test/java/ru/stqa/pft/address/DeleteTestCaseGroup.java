package ru.stqa.pft.address;

import org.testng.annotations.Test;


public class DeleteTestCaseGroup extends TestCasew{

  @Test
  public void DeleteTestGroup() {

   gotoGroupPage();
    selectgroup();
    selectgrouptdelete();
    gotoGroupPage();
  }
}
