package Popups;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {



		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/alert");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.findElement(By.id("buttonAlert2")).click();
		
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		a.accept();
		
	}

}
