package website_Testcase;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {


		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement searchBOX = driver.findElement(By.id("twotabsearchtextbox"));
		searchBOX.sendKeys("IPHONE",Keys.ENTER);
		
		String parID = driver.getWindowHandle();
		System.out.println(parID);
 
		List<WebElement> alliPhone = driver.findElements(By.xpath("//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal']"));
		
		for (WebElement iPhone : alliPhone) {
			
			iPhone.click();
			
		}
	}
}

