package JAVSCRIPTEXECUTOR;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTittleOfThePage {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//Title of the page
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);
		
		
		
		
		
		
	}

}
