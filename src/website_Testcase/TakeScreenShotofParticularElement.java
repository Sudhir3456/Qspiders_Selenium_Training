package website_Testcase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShotofParticularElement {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement loginButton = driver.findElement(By.name("login"));

		// Use of getScreenshoatAs()
		File src = loginButton.getScreenshotAs(OutputType.FILE);

		// create new File
		File dest = new File(".\\ScreenShot\\loginbtn.png");

		// copy the file from src to desc
		Files.copy(src, dest);

	}

}
