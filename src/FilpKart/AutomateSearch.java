package FilpKart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateSearch {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		WebElement searcTextField = driver.findElement(By.name("q"));
		searcTextField.sendKeys("shoes");
		Thread.sleep(200);
		List<WebElement> allShoues = driver.findElements(By.className("_1sFryS"));
		System.out.println(allShoues);

		for (int i = 0; i < allShoues.size(); i++) {
			for (int j = 0; i < allShoues.size(); j++) {
				System.out.println(allShoues.get(i).getText());
				break;
			}
		}
	}

}
