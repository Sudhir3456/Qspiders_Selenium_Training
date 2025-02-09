package JAVSCRIPTEXECUTOR;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlashTheWebPage {

	public static void main(String[] args) {



		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement element = driver.findElement(By.xpath("//button[text()='START']"));
         
        String bgcolor = element.getCssValue("backgroundColor");
        
        for (int i = 0; i < 50; i++) {
        	js.executeScript("arguments[0].style.backgroundColor ='#000000'", element);
        	
        	try {
        		Thread.sleep(20);
				
			} catch (Exception e) {

			}
        	js.executeScript("arguments[0].style.backgroundColor ='"+bgcolor+"'", element);

		}
		
		
	}

}
