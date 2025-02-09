package PopupsYT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HnadleAuthenticatedPopup {

	public static void main(String[] args) {
 
		WebDriver driver=new ChromeDriver();
		
		//driver.get("http://the-internet.herokuapp.cam/basic_auth");
		
		//syntax:
		//https://username:password@the-internet.herokuapp.com/basic_auth
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		
	}

}
