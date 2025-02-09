package website_Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntstatestCase {

	public static void main(String[] args) throws InterruptedException {

             WebDriver driver= new ChromeDriver();
             driver.manage().window().maximize();
             
             driver.get("https://www.instagram.com/accounts/login/?hl=en");
 
             Thread.sleep(2000);
             WebElement userTextFeld = driver.findElement(By.name("username"));
             userTextFeld.sendKeys("Sudhir");
             Thread.sleep(2000);
             WebElement passwordrTextFeld = driver.findElement(By.name("password"));
             passwordrTextFeld.sendKeys("Sudhir@123");
             Thread.sleep(2000);
             WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
             loginButton.click();
	}

}
