package Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class INCOGNITO {

	public static void main(String[] args) {


		ChromeOptions o = new ChromeOptions();
		o.addArguments("--INCOGNITO");
		
		WebDriver driver = new ChromeDriver(o);
		driver.get("https://www.facebook.com/");
		
		
		
	}

}
