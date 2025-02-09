package Webdriver_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTheDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");

		// identify the DropDown
		WebElement DatedropDown = driver.findElement(By.id("day"));
		WebElement MounthdropDown = driver.findElement(By.id("month"));
		WebElement YeardropDown = driver.findElement(By.id("year"));


		// create the Object of Select Class
		Thread.sleep(2000);

		Select selectDate = new Select(DatedropDown);
		selectDate.selectByIndex(16);
		Thread.sleep(2000);

		Select selectMounth = new Select(MounthdropDown);
		selectMounth.selectByIndex(7);


		Select selectYear = new Select(YeardropDown);
		selectYear.selectByIndex(21);

 
		
	}

}
