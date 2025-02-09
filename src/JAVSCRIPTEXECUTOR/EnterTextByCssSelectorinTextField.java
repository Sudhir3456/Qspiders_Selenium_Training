package JAVSCRIPTEXECUTOR;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTextByCssSelectorinTextField {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//JavascriptExecutor js=driver;
		
		//passing the text into inputbox - alternate of sendkey()
		//js.executeScript("arguments[0].setAttribute('value','John')", inputbox);
		
		//js.executeScript("return document.queryselrctor("\input[]\").value='sudhir';");

		
		
		
		
	}

}
