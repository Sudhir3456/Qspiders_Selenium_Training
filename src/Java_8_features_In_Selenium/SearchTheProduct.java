package Java_8_features_In_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTheProduct {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demowebshop.tricentis.com/books");

		WebElement searchTextArea = driver.findElement(By.id("small-searchterms"));
		searchTextArea.sendKeys("Science");

		WebElement searchButton = driver.findElement(By.xpath("//input[@class='button-1 search-box-button']"));
		searchButton.click();
	 }

}
