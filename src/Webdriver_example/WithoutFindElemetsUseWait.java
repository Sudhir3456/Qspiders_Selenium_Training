package Webdriver_example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WithoutFindElemetsUseWait {

	public static void main(String[] args) {


		WebDriver driver= new ChromeDriver();
		driver.get("");
		
		
		//Implict Wait Syntax 
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement checkDelivery = driver.findElement(By.id("Check delivery"));

		
		//Explicit wait Syntax
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(checkDelivery));
		
		//now we can perform the Actions
		
	
		
		
		
	}

}
