package OpenCartAppTestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

	public static void main(String[] args) {

          WebDriver driver=new ChromeDriver();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
          
          driver.get("https://tutorialsninja.com/demo/");
          driver.manage().window().maximize();
          
          
         WebElement clkAccbtn = driver.findElement(By.xpath("//span[normalize-space()='My Account']"));
         clkAccbtn.click();
          
         WebElement InkRegister= driver.findElement(By.xpath("//a[normalize-space()='Register']"));
         InkRegister.click();
         
         WebElement txtFirstname=driver.findElement(By.xpath("//input[@id='input-firstname']"));
         txtFirstname.sendKeys("fghvhvhvkhjv");
         
         WebElement txtLastname=driver.findElement(By.xpath("//input[@id='input-lastname']"));
         txtLastname.sendKeys("fghvhvhvkhjv");
         
         WebElement txtEmail=driver.findElement(By.xpath("//input[@id='input-email']"));
         txtEmail.sendKeys("sbhbhbh@gmail.com");
         
         WebElement txtTelephone=driver.findElement(By.xpath("//input[@id='input-telephone']"));
         txtTelephone.sendKeys("9876543210");
         
         WebElement txtPassword=driver.findElement(By.xpath("//input[@id='input-password']"));
         txtPassword.sendKeys("00999900");
         
         WebElement txtConfirmPassword=driver.findElement(By.xpath("//input[@id='input-confirm']"));
         txtConfirmPassword.sendKeys("00999900");
         
         WebElement chkdpolicy=driver.findElement(By.xpath("//input[@name='agree']"));
         chkdpolicy.click();
         
         WebElement btnContinue=driver.findElement(By.xpath("//input[@value='Continue']"));
         btnContinue.submit();
         
         WebElement msgConfirmation=driver.findElement(By.xpath("//h1[normalize-space()='Your Account Has Been Created!']"));
         msgConfirmation.isDisplayed();
         
     
    
		
		
	}

}
