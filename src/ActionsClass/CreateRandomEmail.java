package ActionsClass;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateRandomEmail {

	static String emailid = " ";

	public static void main(String[] args) {

		Random r = new Random();
		int randomNumber = r.nextInt(100);
		System.out.println(randomNumber);
		
	
		
		String randomEmail="sudhir"+randomNumber+"@gmail.com";
		
		System.out.println(randomEmail);
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();

		//Use of sendKeys
 		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTextField = driver.findElement(By.id("email"));
		emailTextField.sendKeys("randomEmail");
				
		
		//CSS Lucator Syntax ----> tagname[Attribute='attrributvalue']
		//driver.findElement(By.cssSelector("input[id='idvhh']"));
		  

	}

}
