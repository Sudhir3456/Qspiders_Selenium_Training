package FilpKart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortProductOnPrice {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement searcTextField = driver.findElement(By.name("q"));
		searcTextField.sendKeys("iPhone", Keys.ENTER);
		
		List<WebElement> allPrice = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
		 
		int count = 1;
		if (allPrice.size()!=0) {
			
			for (int i = 0; i < allPrice.size()-1; i++) {
				
				WebElement element = allPrice.get(i);
				String amount = element.getText();
				int amont = Integer.parseInt(amount.replaceAll("[^0-9]", "").toString());
				//System.out.println(amont);
				if (amont <= 56999) {
					
					System.out.println("Lowest Price--->"+amont);
					element.click();
					
				}
				
			}
			
		}
		
		
		
	}

}

	
	

