package Synchronatization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/products_page/16");
		
		WebElement checkDelivery = driver.findElement(By.id("Check delivery"));
		checkDelivery.sendKeys("21343");
		
		//Create the Object of WebDriverWait Class 
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(45));
		
		//apply the Condition
		w.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
		driver.findElement(By.id("Check")).click();

   
		
	}

}
