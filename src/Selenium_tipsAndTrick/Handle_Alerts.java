package Selenium_tipsAndTrick;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Alerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		Thread.sleep(2000);

		// 1)
		// Alert alert=driver.switchTo().alert();
		// alert.accept();

		// 2)
		// WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		// Alert alert1=mywait.until(ExpectedConditions.alertIsPresent());
		// alert1.accept();
		
		//3)
		JavascriptExecutor js=(JavascriptExecutor)driver;
		try {
			js.executeScript("window.alert=function{};");

		} catch (Exception e) {
 		}
 		

	}

}
