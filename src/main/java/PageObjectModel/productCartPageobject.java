package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productCartPageobject {

	
	public WebDriver driver;
	
	
	private By EnterComputer=By.xpath("//input[@id='small-searchterms']");
	private By Search=By.xpath("//input[@value='Search']");
	private By ProductTitle=By.xpath("//h2[@class='product-title']/a");
	private By ActualPrice=By.xpath("//span[@class='price actual-price']");
	private By Processor=By.xpath("(//input[@type='radio'])[1]");
	private By AddtoCart=By.xpath("//input[@value='Add to cart']");
	private By AddtoCart2=By.xpath("//input[@value='Add to cart']");
	private By CartMassage= By.xpath("//p[@class='content']");
	private By CloseCartMassage= By.xpath("//span[@class='close']");
	private By ClickOnShoppingCart= By.xpath("//span[@class='cart-label'][1]");
	private By Productpriceordertotal = By.xpath("//span[@class='product-price order-total']/Strong");
	
	public productCartPageobject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		  this.driver=driver;
	}

	public WebElement EnterComputer() {
    return driver.findElement(EnterComputer);
		}
	
	public WebElement Search() {
	return driver.findElement(Search);
		}
	
	public List<WebElement> ProductTitle() {
    return driver.findElements(ProductTitle);
		}
	
	public List<WebElement> ActualPrice() {
	    return driver.findElements(ActualPrice);
		}
	public WebElement Processor() {
	    return driver.findElement(Processor);
		}
	
	public List<WebElement> AddtoCart() {
	    return driver.findElements(AddtoCart);
		}
	
	public WebElement CartMassage() {
	    return driver.findElement(CartMassage);
		}
	
	public WebElement CloseCartMassage() {
	    return driver.findElement(CloseCartMassage);
		}
	
	public WebElement ClickOnShoppingCart() {
	    return driver.findElement(ClickOnShoppingCart);
		}
	public WebElement Productpriceordertotal() {
	    return driver.findElement(Productpriceordertotal);
		}
	public WebElement AddtoCart2() {
	    return driver.findElement(AddtoCart2);
		}
	
}
