package ru.stqa.pft.address.test;

import org.testng.annotations.Test;
import ru.stqa.pft.address.module.GroupKontact;

public class ContactTescCreation extends TestCasew {

  @Test
  public void testKontactTestCase () throws Exception {
    app.getContactHelper().addcontact();
    app.getContactHelper().InputContact(new GroupKontact( "bibiobioo", "biobio", "bio", "tbio","24234342","bio@mail.ru" ));
    app.getGroupHelper().submintGroupCreation();

  }
}

