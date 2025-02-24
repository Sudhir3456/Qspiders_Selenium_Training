package Popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentications_Popup {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		//syntax--> https://user:password@URL
		
		//driver.get("https://admin:admin@");
		
		
	}

}
