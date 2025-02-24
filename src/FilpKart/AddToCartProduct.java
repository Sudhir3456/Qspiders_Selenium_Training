package FilpKart;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartProduct {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement searcTextField = driver.findElement(By.name("q"));
		searcTextField.sendKeys("iPhone", Keys.ENTER);

		String parID = driver.getWindowHandle();
		System.out.println(parID);

		WebElement blackiphone = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']"));
		blackiphone.click();
		WebElement pinkiphone = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Pink, 128 GB)']"));
		pinkiphone.click();

		Set<String> allwindsessionID = driver.getWindowHandles();
		System.out.println(allwindsessionID);

		for (String winId : allwindsessionID) {

			driver.switchTo().window(winId);
			if (driver.getTitle().contains("Apple iPhone 15 (Pink, 128 GB)")) {

				driver.findElement(By.xpath("//button[text()='GO TO CART']")).click();
				break;

			}

		}

		try {
			driver.findElement(By.xpath("//button[text()='GO TO CART']")).click();

		} catch (Exception e) {
			driver.findElement(By.xpath("//button[text()='Pay with EMI']")).click();
		}
		Thread.sleep(4000);
		driver.switchTo().window(parID);
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		driver.quit();

	}

}
