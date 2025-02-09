package JAVSCRIPTEXECUTOR;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshTheWebPage {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//JavascriptExecutor js=driver;

		//Refresh the web page
		js.executeScript("history.go(0)");
		
		
		
	}

}
