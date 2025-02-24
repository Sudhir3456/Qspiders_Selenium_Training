package WindowHandales;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartTheProduct {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement searcTextField = driver.findElement(By.name("q"));
		searcTextField.sendKeys("iPhone", Keys.ENTER);

		String parID = driver.getWindowHandle();
		System.out.println(parID);
 
		List<WebElement> alliPhone = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		
		for (WebElement iPhone : alliPhone) {
			
			iPhone.click();
			
		}

		String pinkiphoneTitle = "Apple iPhone 15 (Pink, 128 GB)";

		String instaWindowID = null;

		Set<String> pinkiphoneID = driver.getWindowHandles();
		for (String winID : pinkiphoneID) {
			driver.switchTo().window(winID);
			
			if (driver.getTitle().contains(pinkiphoneTitle)) {
				
				instaWindowID = winID; 
				WebElement addToCardButton = driver.findElement(By.xpath("//button[text()='Add to cart']"));
				addToCardButton.click();
				System.out.println("Product Add Sucessfully....");
				break;

			}
		}

		driver.switchTo().window(parID);
		System.out.println("Switch Back Into Parent Window....");
		WebElement cartButton = driver.findElement(By.xpath("//span[text()='Cart']"));
		cartButton.click();


	}

}
