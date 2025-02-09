package FilpKart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllValuesFromList {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		WebElement searcTextField = driver.findElement(By.name("q"));
		searcTextField.sendKeys("iPhone", Keys.ENTER);

		List<WebElement> alliphone = driver.findElements(By.className("KzDlHZ"));
		// System.out.println(alliphone);

	 

		String ExpectedIphoneName = "Apple iPhone 15 (Pink, 128 GB)";
		boolean found = false;
		
		for(WebElement iphone:alliphone)
		{
			
			String iphone_list=iphone.getText();
			boolean status =iphone.getText().contains(ExpectedIphoneName);
			System.out.println(status);
			if (status==true) {
				iphone.click();
				
			} else {
				System.out.println("ExpectedIphoneName");

			}

			
			
		}

	}

}
