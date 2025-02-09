package demoapps_qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementTextF {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		 WebElement nameTextfield=driver.findElement(By.xpath("//input[@id='name']"));
		 nameTextfield.sendKeys("Sudhir Kumar ");
		
		 WebElement emailTextfield= driver.findElement(By.id("email"));
		 emailTextfield.sendKeys("Sudhir Kumar ");
		 
		 WebElement passwordTextfield= driver.findElement(By.id("password"));
		 passwordTextfield.sendKeys("Sudhir@01008");
		
	      WebElement rigisterbtn= driver.findElement(By.xpath("//input[@type='submit']"));
		  rigisterbtn.click();
		
		
		
		
		
		
		
		
	}

}
