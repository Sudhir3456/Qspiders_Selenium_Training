 package website_Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrmlive {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);


		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		Thread.sleep(2000);
		
		WebElement pwdTextField = driver.findElement(By.name("password"));
		pwdTextField.sendKeys("admin123");
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.xpath(" //button[contains(.,'Login')]"));
		loginButton.click();
		Thread.sleep(2000);
		WebElement profileOption = driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));
		profileOption.click();
		Thread.sleep(2000);
		WebElement logoutLink = driver.findElement(By.linkText("Logout"));
		logoutLink.click();

		
		 //Lunch the app Without facth the locator of password field by using Keys Enum
		//driver.findElement(By.name("username")).sendKeys("Admin", Keys.TAB, "admin123", Keys.TAB, Keys.ENTER) ;
		
		
	}

}
