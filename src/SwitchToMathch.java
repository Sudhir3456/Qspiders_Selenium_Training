import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMathch {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.theschool-management.com/");
		
	    String winID = driver.getWindowHandle();

		WebElement loginButton = driver.findElement(By.xpath("//span[text()='Login to demo']"));
		loginButton.click();
		driver.switchTo().activeElement();
		
		WebElement userName = driver.findElement(By.id("user_login"));
		//driver.switchTo().activeElement();

		String winId1 = driver.getWindowHandle();
		System.out.println(winId1);  
 
		Set<String> allwinId = driver.getWindowHandles();
		
		for(String id:allwinId)
		{
			driver.switchTo().window(id);
			System.out.println(id);
		}
		
	  driver.switchTo().window(winId1);
	  
	  WebElement homelink = driver.findElement(By.xpath("//a[text()='Home']"));
	  homelink.click();
	  
      driver.switchTo().activeElement().sendKeys("abcddd");

	  WebElement admissionlink = driver.findElement(By.xpath("//a[text()='Online Admission']"));
	  admissionlink.click();
		 
	  Set<String> allwind = driver.getWindowHandles();
	  
	  System.out.println(allwind);
	  
	//  WebElement stuName = driver.findElement(By.name("name"));
	//  stuName.sendKeys("Sudhir");


	}
 
}
