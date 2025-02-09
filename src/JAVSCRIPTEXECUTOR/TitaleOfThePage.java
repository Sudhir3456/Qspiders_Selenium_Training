package JAVSCRIPTEXECUTOR;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitaleOfThePage {

	public static void main(String[] args) {
 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/demo");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

	}

}
