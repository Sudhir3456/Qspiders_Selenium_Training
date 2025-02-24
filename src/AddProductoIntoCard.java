import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddProductoIntoCard {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demowebshop.tricentis.com/search?q=computer&pagesize=12");

		WebElement searchBox = driver.findElement(By.id("small-searchterms"));

		searchBox.sendKeys("Computer");

		WebElement SearchButton = driver.findElement(By.xpath("//input[@type='submit']"));

		SearchButton.click();

	}

}
