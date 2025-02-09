package Selenium_tipsAndTrick;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Switch_IFrames {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://ui.vision/demo/webtest/frames/");
		Thread.sleep(3000);

		// 1) //you got Exception here
		// WebElement iframeElement =
		// driver.findElement(By.xpath("//frame[@='frame_2.html']"));
		// driver.switchTo().frame(iframeElement);
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("ram");

		// 2) Using explicit wait
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(20));
		mywait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("frame[@src='frame_1.html']")));
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("testing");
 
	}

}
