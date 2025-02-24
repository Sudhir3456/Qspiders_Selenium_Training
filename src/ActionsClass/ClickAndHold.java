package ActionsClass;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.qspiders.com/ui/clickHold/?sublist=0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement circle = driver.findElement(By.xpath("circle"));

		Actions a = new Actions(driver);

		a.clickAndHold(circle).perform();
		Thread.sleep(200);

		a.release().perform();
	}

}
