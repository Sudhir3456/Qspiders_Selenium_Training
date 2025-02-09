package Synchronatization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.netty.handler.timeout.TimeoutException;

 class FluentWait1 {

	public static void main(String[] args) throws InterruptedException {
 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/products_page/16");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		FluentWait fw = new FluentWait(driver);
		fw.wait(2000);
		fw.pollingEvery(Duration.ofSeconds(20));
		fw.ignoring(TimeoutException.class);
		fw.until(ExpectedConditions.elementToBeClickable(By.id("check")));
		driver.findElement(By.id("check"));

		
		
		
	 
		
		
		
		
	}

}
