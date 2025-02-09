package Java_8_features_In_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://demowebshop.tricentis.com/");

		List<WebElement> links = driver.findElements(By.tagName("a")); // Here is List is collection

		System.out.println(links.size());

		// Printing linkTexts using for..each loop(Before Java8)

		for (WebElement link : links) {

			System.out.println(link.getText());

		}
		// Printing linkTexts using lambda expression

		links.forEach(link -> System.out.println(link.getText()));

		// Processing elements using stream -> filter

		long workingLinks = links.stream().filter(link -> link.getAttribute("href") != null).count();

		System.out.println("Working link:" + workingLinks);

		driver.close();

	}

}
