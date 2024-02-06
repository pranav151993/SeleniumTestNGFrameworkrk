package com.Testcase;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Resources.BaseClass;

import PageObjectModel.productCartPageobject;

public class productCartTestCases extends BaseClass {

	@Test
	public void VerifyProductPrice() throws IOException, InterruptedException {
	
		 Initializedriver();

		  driver.get("https://demowebshop.tricentis.com/");
	
	
		  productCartPageobject pcp=new productCartPageobject(driver);
		  
		  pcp.EnterComputer().sendKeys("Computer");
		  
		  pcp.Search().click();
		  
		
		  List<WebElement>
		  product=pcp.ProductTitle();
		  
		  List<WebElement>
		  price=pcp.ActualPrice();
		  
		  List<WebElement>
			 cart=pcp.AddtoCart();
		  
		  String pricebeforeCart="";
		  
		for (int i = 0; i < product.size(); i++) {

			   if (product.get(i).getText().equalsIgnoreCase("Simple Computer")) {

			   
				pricebeforeCart=price.get(i).getText();
			    cart.get(i).click();
			     break;

			   }

			  }
			 
			  System.out.println(pricebeforeCart);

			  Thread.sleep(2000);
			  pcp.Processor().click();
			 
			  pcp.AddtoCart2().click();
			  
		     Thread.sleep(3000);
			  String expectedText="The product has been added to your shopping cart";				
				String ActualText = pcp.CartMassage().getText();		
				  SoftAssert sa=new SoftAssert();
				  sa.assertEquals(ActualText, expectedText);
				  sa.assertAll();
				  
				  pcp.CloseCartMassage().click();
				  pcp.ClickOnShoppingCart().click();
				  
				String FinalPrice= "";
				FinalPrice=pcp.Productpriceordertotal().getText();
				System.out.println(FinalPrice);
				
				int a = Integer.parseInt(pricebeforeCart);
                int b = Integer.parseInt(FinalPrice);
				
				int ExpectedValue = a;
				int ActualValue = b;
				
				SoftAssert xy=new SoftAssert();
				  xy.assertEquals(ActualValue, ExpectedValue);
				  xy.assertAll();
				
				
}
	
}
