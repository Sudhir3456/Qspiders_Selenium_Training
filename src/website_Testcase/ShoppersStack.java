package website_Testcase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ShoppersStack {

 
	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));

		TakesScreenshot t = (TakesScreenshot) driver;

		// Use of getScreenshoatAs()
		File src = t.getScreenshotAs(OutputType.FILE);
		// create new File
		File dest = new File(".\\ScreenShot\\shoppersstack.png");
		// copy the file from src to desc
		Files.copy(src, dest);
 		
 
		
	}

}
