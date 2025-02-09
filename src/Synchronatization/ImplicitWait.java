package Synchronatization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		
		
		//Implicit wait is type of Dynmic wait becz its wait if element is fonded then its excute next line
		//Implicit Wait is Global wait its apply all over the  script & all findElement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
		
		
	}

}
