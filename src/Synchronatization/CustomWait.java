package Synchronatization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/products_page/16");

		while (true) {
			try {
				WebElement checkDelivery = driver.findElement(By.id("Check delivery"));
				break;

			} catch (Exception e) {
				Thread.sleep(200);

			}

		}

	}

}
