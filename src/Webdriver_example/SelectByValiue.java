package Webdriver_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValiue {

	public static void main(String[] args) throws InterruptedException {

   
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");

		// identify the DropDown
		//WebElement DatedropDown = driver.findElement(By.id("day"));
		
		Select s= new Select(driver.findElement(By.id("day")));
		
		for(int i=0; i<12; i++)
		{
			s.selectByIndex(i);
			Thread.sleep(2000);
			
		}
		
		
		
		
	}

}
