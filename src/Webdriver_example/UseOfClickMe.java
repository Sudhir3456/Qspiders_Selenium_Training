package Webdriver_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfClickMe {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://Facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("login")).click();
		
		
		
		
	}

}
