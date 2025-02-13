package Webdriver_example;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotOfParticularElement {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");

		// ParticularElementScreenshot

		WebElement paratha = driver.findElement(By.xpath("//img[@alt='restaurants curated for paratha']"));

		File src = paratha.getScreenshotAs(OutputType.FILE);

		File dest = new File(".\\ScreenShot\\swigypage.png");

		// FileUtils.copyfile(src, dest);

		Files.copy(src, dest);

	}

}
