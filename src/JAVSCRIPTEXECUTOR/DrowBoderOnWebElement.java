package JAVSCRIPTEXECUTOR;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DrowBoderOnWebElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement guiTextEle = driver.findElement(By.xpath("//a[text()='GUI Elements']"));
		
		Thread.sleep(2000);
		
		js.executeAsyncScript("arguments[0].style.border = '3px splid red'", guiTextEle);
		//js.executeAsyncScript("arguments[0].style.border = '3px solid red'", guiTextEle);


	}

}
