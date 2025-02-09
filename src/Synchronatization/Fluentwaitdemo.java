package Synchronatization;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.netty.handler.timeout.TimeoutException;
import io.netty.util.Timeout;

public class Fluentwaitdemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/products_page/16");

		// Fluent wait declaration
		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

		FluentWait fw = new FluentWait(driver);
		fw.wait(2000);
		fw.pollingEvery(Duration.ofSeconds(20));
		fw.ignoring(TimeoutException.class);
		fw.until(ExpectedConditions.elementToBeClickable(By.id("check")));
		driver.findElement(By.id("check"));

	}

}
