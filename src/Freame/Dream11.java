package Freame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dream11.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// way 1---driver.switchTo().frame(0);

		// driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Iframe
		// Example']")));

		driver.findElement(By.id("regEmail")).sendKeys("1234567898");

		// if we want to Jump into parent window

		driver.switchTo().parentFrame();

		// if driver control inside ifreame inside ifreame then used to switchto parent win

		driver.switchTo().defaultContent();

	}

}
