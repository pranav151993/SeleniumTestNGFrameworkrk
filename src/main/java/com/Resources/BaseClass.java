package com.Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public WebDriver driver ;
	
	public static String email=generateRandomEmailID();

	public void Initializedriver() throws IOException {
		
		//Read the file
		FileInputStream fis = new FileInputStream("C:\\Users\\pranav.awate\\Neweclipsworkplace\\24jan2024seleniumTestNgFramework\\src\\main\\java\\com\\Resources\\data.properties");
		
		//access the contetnt inside properties file
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String browsername=prop.getProperty("browser");
		
		if (browsername.equalsIgnoreCase("chrome")){
			
			    driver = new ChromeDriver();
		}
			else if (browsername.equalsIgnoreCase("firefox")) {
				 driver = new FirefoxDriver();
				
			}
			
			else if (browsername.equalsIgnoreCase("edge"))
			{
				 driver = new EdgeDriver();	
				
			}
		
			else {
				System.out.println("please choose valid browser");
				}
		
	}
	
	

public static String generateRandomEmailID() {
	 
	  return "abc"+System.currentTimeMillis()+"@gmail.com";
}
}
