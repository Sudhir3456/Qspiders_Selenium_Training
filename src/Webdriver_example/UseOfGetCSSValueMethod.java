package Webdriver_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetCSSValueMethod {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// driver.get("https://www.facebook.com/");

		// WebElement loginButton = driver.findElement(By.name("login"));

		// String Background = loginButton.getCssValue("background-color"); //it return
		// in the form of RGBA format in chrome in mozila browser grt RGB

		// converted into hexadecimal code

		driver.get("https://www.malicha.com/");
		WebElement loginButton = driver.findElement(By.name("login"));
		String BackgroundofButoon = loginButton.getCssValue("background-color");
		String TextColorOfButoon = loginButton.getCssValue("text-color");


		//String hashCode = Color.FormString
		
		//one default capacity of click() method is to scroll Static Page till the Element and click on that/element.  <-----  Note
		
		
		
	}

}
