
package Locators;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import java.util.List;

import org.openqa.selenium.*;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://demo.opencart.com/");
		 driver.manage().window().maximize();
		 
		 //name
		// driver.findElement(By.name("search")).sendKeys("Mac");
		 
		 //id 
		 // boolean logoDisplaystatus=driver.findElement(By.id("logo")).isDisplayed();
		 // System.out.println(logoDisplaystatus); 
		
		
		//linktext & partiallink text
		 
		// driver.findElement(By.linkText("Tablets")).click();
		 //  driver.findElement(By.partialLinkText("Software")).click();
		 
		 
		//classname 	
		//  List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
		//  System.out.print("total number of header links :"+headerLinks);
		   
		 
		//tagname
		 List<WebElement> Links=driver.findElements(By.tagName("a"));
		 System.out.print(" total number of links :"+Links.size());
		 
		 
		 	   
      
		 
		 
		 
		 
	}

}
