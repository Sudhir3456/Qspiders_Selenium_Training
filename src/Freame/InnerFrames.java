package Freame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerFrames {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.switchTo().frame("iframeResult"); // switch to outer iframe
		
 		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Iframe Example']"))); // switch to inner iframe

		System.out.println("Text present insidethe inner frame:"+ driver.findElement(By.tagName("h1")).getText());
		
		driver.switchTo().parentFrame();  //go to parent frame /outer frame
		
		String outterText = driver.findElement(By.xpath("//p[text()='You can use the height and width attributes to specify the size of the iframe:']")).getText();

		System.out.println(outterText);
		
		
		
	}

}
