package WindowHandales;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosedSpecificWindow {

	public static void main(String[] args) {

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
		String instaWindowID = "";

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
				
		String ShoppingTitle = "Shopping Cart | Flipkart.com";
		String cartPageWindowID = null;
		
		Set<String> allWindID = driver.getWindowHandles();
		
		for (String winID1 : allWindID) {
			driver.switchTo().window(winID1);

			if (driver.getTitle().contains(ShoppingTitle)) {
				
				cartPageWindowID=winID1;
				break;
				 
			}

		}

		///Close all the window except cart window
		for (String winID1 : allWindID) {

			if (!winID1.equals(allWindID)) {
				driver.switchTo().window(winID1);
				driver.close();
			}

		}
		//Switch Back To Cart Page
		driver.switchTo().window(cartPageWindowID);
		System.out.println("Switched to Cart window..");
		
		
		
	}

}
