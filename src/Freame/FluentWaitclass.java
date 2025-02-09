package Freame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.netty.handler.timeout.TimeoutException;

public class FluentWaitclass {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dream11.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		FluentWait fw =new FluentWait(driver);
		fw.withTimeout(Duration.ofSeconds(20));
		fw.pollingEvery(Duration.ofSeconds(2));
		fw.ignoring(TimeoutException.class);
		fw.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(""))));
		
		
	}

}
