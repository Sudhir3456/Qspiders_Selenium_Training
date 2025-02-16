package Webdriver_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOnFaceBook {

	public static void main(String[] args) throws InterruptedException {

		   WebDriver driver=new ChromeDriver();
           driver.get("https://www.facebook.com/login");
           driver.manage().window().maximize();
           
           WebElement emailTextField=driver.findElement(By.id("email"));
           Thread.sleep(2000);           
           emailTextField.sendKeys("abc@@gmail.com");
           
           WebElement passwordTextField=driver.findElement(By.id("pass"));
           Thread.sleep(2000);           
           passwordTextField.sendKeys("abc123");
           
            WebElement clickButton=driver.findElement(By.name("login"));

           clickButton.click();
		
		
		
		
		
		
	}

}
