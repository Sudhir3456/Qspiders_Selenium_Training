package FilpKart;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllPriceWithoutAnyUnwantedChar {

	public static void main(String[] args) {

   
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("https://www.flipkart.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebElement searcTextField = driver.findElement(By.name("q"));
			searcTextField.sendKeys("iPhone", Keys.ENTER);
			
			List<WebElement> allPrice = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
			Map<WebElement, Integer> map = new HashMap<>();
			for (WebElement price : allPrice) {
				
				String priceText = price.getText();
				System.out.println(priceText.replaceAll("[₹,]+", ""));
				
				 
				
			}

			 
			
			
		}

	}

	


