package KeywordActions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpentheLinkInNewTab {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerece.com/");
		
		WebElement regLink=driver.findElement(By.xpath("//a[normalize-space()=Register']"));
		
		
		Actions act=new Actions(driver);
		
		
		//Control+Reglink
		act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();
		
		//Switching to registration page 
		List<String> ids=new ArrayList<String>(driver.getWindowHandles());
		
		//Regisration
		driver.switchTo().window(ids.get(1)); //switch to registrtion
		driver.findElement(By.xpath("//input[@id='FirstNAME']")).sendKeys("John KENEDY");
		
		//home page
		driver.switchTo().window(ids.get(0)); //switch to registrtion
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("TShirts");
		

		
	}

}
