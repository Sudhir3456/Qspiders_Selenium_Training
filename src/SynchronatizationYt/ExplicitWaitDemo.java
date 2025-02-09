package SynchronatizationYt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) throws InterruptedException {
 
		
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
 		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Thread.sleep(3000);  //pause the execution
		
		WebElement txtusername=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		txtusername.sendKeys("Admin");
		
		WebElement txtpassword=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		txtpassword.sendKeys("admin123");
		
		WebElement txtlb=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='orangehrm-login-slot-wrapper']")));
		//driver.findElement(By.xpath("//input[@placeholder='Username']")));
		//txtlb.submit();
		
		
		//sol1
				//txtlb.click();
				
				//sol2
				//btnContinue.submit();
				
				//sol3
				//Actions act=new Actions(driver);
				//act.moveToElement(txtlb).click().perform();
				
				//sol4
				//JavascriptExecutor js=(JavascriptExecutor) driver;
				//js.executeAsyncScript("arguments[0].click();",btnContinue);
				
				//sol5
				//txtlb.sendKeys(Keys.RETURN);
				
				//sol6
			WebDriverWait mywait1 =new WebDriverWait(driver, Duration.ofSeconds(10));
		    mywait1.until(ExpectedConditions.elementToBeClickable(txtlb)).click();
	 
		//driver.close();
		
		
	}

}
