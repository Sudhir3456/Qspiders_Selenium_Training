package website_Testcase;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,250)", "");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scroll down till the bottom of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		List<WebElement> allScoialIcon = driver.findElements(By.xpath("//div[@class='sc-elhb8j-7 jBOGYb']"));

		for (WebElement scoialicon : allScoialIcon) {

			scoialicon.click();

		}

		//String instaTitle = "Zomato (@zomato) • Instagram photos and videos";
		String instaTitle = "Page couldn't load • Instagram";

		String instaWindowID = null;

		Set<String> allwinID = driver.getWindowHandles();
		for (String winID : allwinID) {
			driver.switchTo().window(winID);
			if (driver.getTitle().contains(instaTitle)) {
				
				instaWindowID = winID; 
				break;

			}
		}

		//close all windows
		for (String winID : allwinID) {
			if (!winID.equals(instaWindowID)) {
				
			driver.switchTo().window(winID);
			driver.close();
			}
		}
	
		//Switch back to intsta
		driver.switchTo().window(instaWindowID);
		WebElement loginButton = driver.findElement(By.xpath("//span[text()='Log in']"));
		loginButton.click();
		
	}
}