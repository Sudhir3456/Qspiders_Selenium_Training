import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoguru99 {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.guru99.com/V1/html/Managerhomepage.php");
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
 
		//clicking on element - alternate of click()
		WebElement rediobtn=driver.findElement(By.xpath("//a[text()='Log out']"));
		js.executeScript("arguments[0].click()", rediobtn);
		
		//lp.clickLogout();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();// close logout alert
		driver.switchTo().defaultContent();
		//lp.clickLogout();
		
		
	}

}
