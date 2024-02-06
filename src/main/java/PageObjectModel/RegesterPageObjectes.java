package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegesterPageObjectes {
	
	public WebDriver driver;
	
	private By Register = By.xpath("//a[@class='ico-register']");
	
	private By Gender = By.xpath("//input[@value='M']");
	
	private By FirstName = By.xpath("//input[@id='FirstName']");
	
	private By LastName = By.xpath("//input[@id='LastName']");
	private By Email = By.xpath("//input[@id='Email']");
	private By Password = By.xpath("//input[@id='Password']");
	private By ConfirmPassword = By.xpath("//input[@id='ConfirmPassword']");
	private By RegisterButton = By.xpath("//input[@id='register-button']");
	private By registertionCompletedText= By.xpath("//div[@class='result']");
	private By Invalidregistration= By.xpath("//div[@class='validation-summary-errors']");

               {
	
	}
	public RegesterPageObjectes(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}
	public WebElement ClickOnRegisterabc() {
		return driver.findElement(Register);	
	}
	public WebElement SelectGenderacb() {
		return driver.findElement(Gender);	
	}
	public WebElement EnterFirstNamepqr() {
		return driver.findElement(FirstName );	
	}
	public WebElement EnterLastNameplk() {
		return driver.findElement(LastName);	
	}
	public WebElement EnterEmailwed() {
		return driver.findElement(Email);	
	}
	public WebElement EnterPassword() {
		return driver.findElement(Password);	
	}
	public WebElement ConfirmPassword() {
		return driver.findElement(ConfirmPassword);	
	}
	public WebElement ClickONSubmit() {
		return driver.findElement(RegisterButton);	
	}
	
	public WebElement Successtest() {
		return driver.findElement(registertionCompletedText);	
	}
	public WebElement Invalidregistration() {
		return driver.findElement(Invalidregistration);	
	}
	
	
	
}
