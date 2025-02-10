package Locators;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XpathDemo {

	public static void main(String[] args) {
 
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		
		//Xpath with single attribute
		//driver.findElement(By.xpath("//input[@placeholder='Search]")).sendKeys("Tshirts");
		
		
		//Xpath with multiple attributes
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Tshirts");
		
		//Xpath with 'and' 'or' operator
	//	driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("Tshirts");
	//	driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("Tshirts");

		//Xpath with text() - inner text
		//driver.findElement(By.xpath("//*[text()='macbook']")).click();		
		
	//	boolean displaystatus=driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
	//	System.out.println(displaystatus);
		
	//	String value=driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
	//	System.out.print(value);
		
		//Xpath with contains()
		//search
		
	//	driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendkeys("Tshirts");
		
		//Xpath with strat-with()
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Tshirts");
		
		
		//chianed xpath 
		boolean status=driver.findElement(By.xpath("//div[@id='logo')/a/img")).isDisplayed();
		System.out.print(status);
		
		
		
	}

}
