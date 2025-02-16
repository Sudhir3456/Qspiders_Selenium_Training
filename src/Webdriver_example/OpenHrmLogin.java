package Webdriver_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenHrmLogin {

	public static void main(String[] args) throws InterruptedException {

       WebDriver driver=new ChromeDriver();
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       driver.manage().window().maximize();
       
       Thread.sleep(5000);
       
      // WebElement username= driver.findElement(By.xpath("//input[@placeholder='Username']"));
       WebElement username= driver.findElement(By.name("username"));
       username.sendKeys("Admin");
       Thread.sleep(5000);

      // WebElement password= driver.findElement(By.xpath("//input[@placeholder='Password']"));
       WebElement password= driver.findElement(By.name("password"));
       password.sendKeys("admin123");
       Thread.sleep(5000);

       
      // WebElement button= driver.findElement(By.xpath("//div[@class='orangehrm-login-slot-wrapper']"));
       WebElement button= driver.findElement(By.xpath("//button[contains(.,'Login')"));
       username.click();
       
       
       
        
   
	}

}
