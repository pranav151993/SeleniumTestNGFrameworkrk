package com.Testcase;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Resources.BaseClass;

import PageObjectModel.RegesterPageObjectes;

public class RegisterTestCases extends BaseClass{
	
	

	@Test
	public void Verifyvalidregistration() throws IOException {
		
		Initializedriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		RegesterPageObjectes rpo = new RegesterPageObjectes(driver);
		
		rpo.ClickOnRegisterabc().click();  
		rpo.SelectGenderacb().click();
		rpo.EnterFirstNamepqr().sendKeys("test");
		rpo.EnterLastNameplk().sendKeys("test123");
		rpo.EnterEmailwed().sendKeys(email);
		rpo.EnterPassword().sendKeys("pass123");
		rpo.ConfirmPassword().sendKeys("pass123");
		rpo.ClickONSubmit().click();
		
		String expectedText="Your registration completed";
		
		String ActualText = rpo.Successtest().getText();
		
		SoftAssert sa=new SoftAssert();
		 
		  sa.assertEquals(ActualText, expectedText);
		 
		  sa.assertAll();
	}
		  @Test
			public void VerifyInvalidregistration() throws IOException {
				
				Initializedriver();
				
				driver.get("https://demowebshop.tricentis.com/");
				
				RegesterPageObjectes rpo = new RegesterPageObjectes(driver);
				
				rpo.ClickOnRegisterabc().click();  
				rpo.SelectGenderacb().click();
				rpo.EnterFirstNamepqr().sendKeys("test");
				rpo.EnterLastNameplk().sendKeys("test123");
				rpo.EnterEmailwed().sendKeys("abc1706549956405@gmail.com");
				rpo.EnterPassword().sendKeys("pass123");
				rpo.ConfirmPassword().sendKeys("pass123");
				rpo.ClickONSubmit().click();
				
				String expectedText="The specified email already exists";
				
				String ActualText = rpo.Invalidregistration().getText();
				
				SoftAssert sa=new SoftAssert();
				 
				  sa.assertEquals(ActualText, expectedText);
				 
				  sa.assertAll();
				
				
		
	}
}
