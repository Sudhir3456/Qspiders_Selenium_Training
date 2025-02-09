package JAVSCRIPTEXECUTOR;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTheWebPage {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// scroll the page till end of the page
		js.executeScript("window.ScrollBy(0,document.body.scrollHeight)");
		
		//js.executeScript("window.ScrollBy(0, -document.body.scrollHeight)");


		System.out.println();

	}

}
