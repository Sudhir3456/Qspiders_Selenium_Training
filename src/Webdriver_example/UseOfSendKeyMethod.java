package Webdriver_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfSendKeyMethod {

	public static void main(String[] args) {

           WebDriver driver=new ChromeDriver();
           driver.get(null);
           driver.manage().window().maximize();
           
           WebElement emailTextField=driver.findElement(By.id("Email"));
           
           emailTextField.sendKeys("abc@@gmail.com");
           
           WebElement passwordTextField=driver.findElement(By.id("Password"));

           passwordTextField.sendKeys("abc123");
		
           WebElement clickButton=driver.findElement(By.id("login"));

           clickButton.click();
		
	}

}
