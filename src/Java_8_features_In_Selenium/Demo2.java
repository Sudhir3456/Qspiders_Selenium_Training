package Java_8_features_In_Selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");// driver.navigate().to("https://www.flipkart.com/");

		Set<String> windowIds = driver.getWindowHandles(); // Here using Set collection

		for (String windowid : windowIds) {
			driver.switchTo().window(windowid);
			System.out.println(driver.getTitle()); // System.out.println(driver.getCurrentUrl());
		}

		// Print the titles using lambda expression
		windowIds.forEach(winid -> System.out.println(driver.switchTo().window(winid).getTitle()));

		driver.quit();
	}

} 
