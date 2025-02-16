package Webdriver_example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {

	public static void main(String[] args) {



		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Hi/Desktop/DropDown.html");
 
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// identify the DropDown
		WebElement dropDown = driver.findElement(By.id("dropdown"));
		
		Select s= new Select(dropDown);
		
		WebElement allOptions = s.getWrappedElement();
		
		
	}

}
