package WindowHandales;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveEle {

	public static void main(String[] args) {

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();	
		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demo.theschool-management.com/");
			
		    String winID = driver.getWindowHandle();

			WebElement loginButton = driver.findElement(By.xpath("//span[text()='Login to demo']"));
			loginButton.click();
			driver.switchTo().activeElement();
			
			//WebElement userName = driver.findElement(By.id("user_login"));
			//driver.switchTo().activeElement();
			
			driver.findElement(By.name("log")).sendKeys("aaaaa");


	}

}
