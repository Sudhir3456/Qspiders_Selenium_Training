package Webdriver_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deSelectByIndex {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiselect?sublist");
		Thread.sleep(5000);


		// identify the DropDown
		WebElement MultiSelectdropDown = driver.findElement(By.id("select-multiple-native"));
		
		Select s= new Select(MultiSelectdropDown);
		
		// select the options
		for (int i = 0; i <3; i++) {
			s.selectByIndex(i);
			Thread.sleep(2000);

		}

		// Deselect the options
		for (int i = 0; i <3; i++) {
			s.deselectByIndex(i);
			Thread.sleep(2000);

		}
		
		
		//s.deselectByValue("Running Shoes");   We Can select Only One Option
		
		
	}

}
