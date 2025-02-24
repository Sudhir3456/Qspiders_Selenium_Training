package Webdriver_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccountOnFacebook {

	public static void main(String[] args) throws InterruptedException {
		

              WebDriver driver=new ChromeDriver();
              driver.manage().window().maximize();
              
              driver.get("https://www.facebook.com/reg");
              driver.manage().window().maximize();
              
              WebElement firstTextField=driver.findElement(By.name("firstname"));
              Thread.sleep(1000);
              firstTextField.sendKeys("Ram");
              
              WebElement lastTextField=driver.findElement(By.name("lastname"));
              Thread.sleep(1000);
              firstTextField.sendKeys("Kumar");
              
              WebElement reg_email=driver.findElement(By.name("reg_email__"));
              Thread.sleep(3000);
              reg_email.sendKeys("sy6841007#gmail.com");
              
            
              
              WebElement reg_pass=driver.findElement(By.name("reg_passwd__"));
              Thread.sleep(1000);
              reg_pass.sendKeys("sy6841007#gmail.com");
              

		
		
		
		
		
		
		
	}

}
