package Freame;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeInsideSheddowRoot {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.switchTo().frame("pact"); // switch to iframe

		JavascriptExecutor jes = (JavascriptExecutor) driver;

		WebElement ele = (WebElement) jes
				.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")");

		String js = "arguments[0].setAttribute('value', 'Green Masala Tea')";

		jes.executeScript(js, ele);

	}

}
