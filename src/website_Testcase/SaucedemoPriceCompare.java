package website_Testcase;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SaucedemoPriceCompare {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/inventory.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement userTextField = driver.findElement(By.id("user-name"));
		userTextField.sendKeys("standard_user");

		WebElement passTextField = driver.findElement(By.id("password"));
		passTextField.sendKeys("secret_sauce");

		WebElement clickButton = driver.findElement(By.id("login-button"));
		clickButton.click();

		List<WebElement> beforeFilterallPrice = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

		List<Double> beforeFilterallPriceList = new ArrayList<Double>();
		for (WebElement p : beforeFilterallPrice) {

			beforeFilterallPriceList.add(Double.valueOf(p.getText().replace("$", "")));

		}

		// filter the price fromthe dropdown

		Select dropdown = new Select(driver.findElement(By.className("product_sort_container")));
		dropdown.selectByVisibleText("Price (low to high)");

		// after filter capture the prices
		List<WebElement> afterFilterallPrice = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
		List<Double> afterFilterallPriceList = new ArrayList<Double>();
		for (WebElement p : afterFilterallPrice) {

			afterFilterallPriceList.add(Double.valueOf(p.getText().replace("$", "")));

		}

		Collections.sort(beforeFilterallPriceList); // it will sort the values in the list
		//Collections.reverse(beforeFilterallPriceList); // list will get sorted in the form of decending order


		if (beforeFilterallPriceList.equals(afterFilterallPriceList)) {

			System.out.println("Test Passed...");

		} else {
			System.out.println("Test Field...");

		}

	}

}
