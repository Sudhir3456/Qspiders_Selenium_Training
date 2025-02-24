package DropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("sb_form_q")).sendKeys("Selenium");
		
		List<WebElement> allAutoSuggestDropDown = driver.findElements(By.xpath("//li[@class='sa_sg ']//span"));

		for (WebElement listitem : allAutoSuggestDropDown) {
			
			if (listitem.getText().contains("download"))
			{
				
				listitem.click();
				break;
			}
			
		}
		
		
	}

}
