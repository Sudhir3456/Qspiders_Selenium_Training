package DropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSugg {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		Thread.sleep(2000);
		
		List<WebElement> allAutoSuggestDropDown = driver.findElements(By.xpath("//div[@class='eIPGRd']//span"));

		for (WebElement listitem : allAutoSuggestDropDown) {
			
			if (listitem.getText().contains("download"))
			{
				
				listitem.click();
				break;
			}
			
		}
		
		
	}

		
		
		
	}


