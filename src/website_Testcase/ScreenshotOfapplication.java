package website_Testcase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotOfapplication {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		
		//explicit typeCasting
		TakesScreenshot take=(TakesScreenshot) driver;
		
		//Use of getScreenshoatAs()
		File src = take.getScreenshotAs(OutputType.FILE);
		
		//create new File
		
		File dest=new File(".\\ScreenShot\\flipkart.png");
		
		//copy the file from src to desc
		
		Files.copy(src, dest);
		
		
		
		
		
	}

}
