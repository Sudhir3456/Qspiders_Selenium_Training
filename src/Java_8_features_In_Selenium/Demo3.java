package Java_8_features_In_Selenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://demowebshop.tricentis.com/");
		WebElement bookLink = driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Books']"));
		bookLink.click();
		
		
		Select sortbydrp = new Select(driver.findElement(By.id("products-orderby")));
		sortbydrp.selectByVisibleText("Name: A to Z");

		List<WebElement> product_items = driver.findElements(By.xpath("//h2[@class='product-title']"));

		List<String> beforesort = product_items.stream().map(item -> item.getText()).collect(Collectors.toList());
		List<String> aftersort = product_items.stream().map(item -> item.getText()).sorted()
				.collect(Collectors.toList());

		System.out.println(beforesort);
		System.out.println(aftersort);

		if (beforesort.equals(aftersort))
			System.out.println("products displayed in Sorted Order");
		else
			System.out.println("products displayed in NOT Sorted Order");

		driver.quit();
	}

}
 