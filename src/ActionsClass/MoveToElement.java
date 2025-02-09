package ActionsClass;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {



		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//ideentify the WebEle
		WebElement moveMouseCursor = driver.findElement(By.xpath("//a[text(0='Paytm for custumer']"));
		
		//Create the Object of actions Class
		Actions a =new Actions(driver);
		
		//use the method
		a.moveToElement(moveMouseCursor).perform();
		
		//Right click 
		a.contextClick().perform();
		
		
		//Right Click on partiCular WebElement
		a.contextClick(moveMouseCursor).perform();
		//or
		//a.contextClick(driver.findElement(By.xpath("//a[text(0='Paytm for custumer']"))).perform();

		
	}

}
