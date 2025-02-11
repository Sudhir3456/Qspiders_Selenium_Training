package Webdriver_example;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UseOfGetRectMetod {

	public static void main(String[] args) throws InterruptedException {
 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
	    driver.get("https://www.linkedin.com/feed/");
	    
	    WebElement emailTextField = driver.findElement(By.name("email"));
		
		Rectangle rectangle=emailTextField.getRect();
		
		int emailtfHight=rectangle.getHeight();
		System.out.println("emailtfHight");                                           
		
		
		
		
	}
	

}
