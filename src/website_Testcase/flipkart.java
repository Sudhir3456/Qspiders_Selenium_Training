package website_Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/account/login?ret=/");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		
		WebElement emailtestField = driver.findElement(By.xpath("//input[@class=\"r4vIwl BV+Dqf\"]"));
		emailtestField.sendKeys("sydrd21@gmail.com");
		Thread.sleep(2000);

		WebElement liginbtn =driver.findElement(By.xpath("//button[text()='Request OTP']"));
		liginbtn.submit();	

		//button[text()='Request OTP']
		//WebElement liginbtn =driver.findElement(By.xpath("//span[text()='Login']"));
		//liginbtn.submit();	
	    // driver.findElement(By.xpath("//span[text()='Login']")).submit();

	}

}
