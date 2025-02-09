package JAVSCRIPTEXECUTOR;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScroolTillTheWebElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// 2) scroll the page till element is visible
		// WebElement ele = driver.findElement(By.xpath("//strong[normalize-space()='community poll']"));
		WebElement ele = driver.findElement(By.id("singleFileInput"));
		js.executeScript("window.ScrollInvtoView();", ele);
		System.out.println(js.executeScript("return window.pageYOffset;")); // 2103.428466796796875

	}

}
