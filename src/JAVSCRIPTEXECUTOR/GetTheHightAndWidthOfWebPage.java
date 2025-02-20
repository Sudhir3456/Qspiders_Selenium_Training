package JAVSCRIPTEXECUTOR;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheHightAndWidthOfWebPage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String hight = js.executeScript("return window.innerHeight;").toString();
		System.out.println(hight);
		
		String widhth = js.executeScript("return window.innerHeight;").toString();
		System.out.println(widhth);
	}

}
