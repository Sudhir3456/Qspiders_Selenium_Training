package FilpKart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllIphoneBasedonConditions5 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		WebElement searcTextField = driver.findElement(By.name("q"));
		searcTextField.sendKeys("iPhone", Keys.ENTER);

		List<WebElement> alliphone = driver.findElements(By.className("KzDlHZ"));
		// System.out.println(alliphone);

		List<WebElement> alliphonePrice = driver.findElements(By.className("Nx9bqj"));
		// System.out.println(alliphonePrice);
		

		for (int i = 0; i < alliphone.size(); i++) 
		{
			for (int j = 0; i < alliphonePrice.size(); j++) 
			{
			  System.out.println(alliphone.get(i).getText()+"=======>"+alliphonePrice.get(j).getText());
			  if(alliphone.isEmpty() || alliphonePrice.isEmpty())
			  {
				  System.out.println("List are empty== no element ");
				  return;
			  }
			}
		}
	}
		
		

	}


