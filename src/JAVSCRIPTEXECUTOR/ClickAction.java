package JAVSCRIPTEXECUTOR;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAction {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//JavascriptExecutor js=driver;

		//clicking on element - alternate of click()
		WebElement rediobtn=driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()", rediobtn);
		
		
		
		
		
		
		
	}

}
