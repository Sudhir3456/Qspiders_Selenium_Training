package Webdriver_example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfSummmit {

	public static void main(String[] args) {
 
		///if visual text is aviable then go for ui text   
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement searcTextField = driver.findElement(By.name("q"));
		searcTextField.sendKeys("iPhone");
		
		
 		
		
		
	}

}
// when ever we used unsoppertedopertationexception if use used summit button it is javaexceptions

