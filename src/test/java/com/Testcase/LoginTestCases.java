package com.Testcase;

import java.io.IOException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.Resources.BaseClass;
import PageObjectModel.LoginPageObjects;

public class LoginTestCases extends BaseClass {

@Test(dependsOnMethods="Verifyvalidregistration")
public void verifyValidLogin() throws IOException, InterruptedException {

  Initializedriver();

  driver.get("https://demowebshop.tricentis.com/");
 
  LoginPageObjects lpo=new LoginPageObjects(driver);
 
  lpo.clickOnlogIn().click();
 
  lpo.enterEmail().sendKeys(email);  //abc123@gmail.cpm
 
  lpo.enterPassword().sendKeys("pass123");
 
  lpo.clickSubmit().click();
 
  Thread.sleep(2000);

  String expectedText = "Log out";

  String actualText = lpo.logOutText().getText();

  SoftAssert sa = new SoftAssert();

  sa.assertEquals(actualText, expectedText);

  sa.assertAll();
  
}

@Test
public void verifyInValidLogin() throws IOException {

  Initializedriver();

  driver.get("https://demowebshop.tricentis.com/");
 
  LoginPageObjects lpo=new LoginPageObjects(driver);
 
  lpo.clickOnlogIn().click();
 
  lpo.enterEmail().sendKeys(email);  //abc123@gmail.cpm
 
  lpo.enterPassword().sendKeys("pass12"); //entered invalid password for testing
 
  lpo.clickSubmit().click();

  String expectedText = "Login was unsuccessful. Please correct the errors and try again.";

  String actualText = lpo.invalidCredientialsText().getText();

  SoftAssert sa = new SoftAssert();

  sa.assertEquals(actualText, expectedText);

  sa.assertAll();
}
}