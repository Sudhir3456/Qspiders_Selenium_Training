package JAVSCRIPTEXECUTOR;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTextByIdinTextField {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//JavascriptExecutor js=driver;
		
		//passing the text into inputbox - alternate of sendkey()
		js.executeScript("document.getElementById('email').value='sudhir'");
		
	}

}
