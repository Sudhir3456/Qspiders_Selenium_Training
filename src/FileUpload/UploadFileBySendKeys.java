package FileUpload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileBySendKeys {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Using sendkeys() ---> if attribute is file type

		WebElement uploadButton = driver.findElement(By.id("uploadFile"));
		uploadButton.click();
		uploadButton.sendKeys("C:\\SeleniumPractice\\sample,pdf");
		
		//using  Robot Class Methods
		WebElement uploadButton1 = driver.findElement(By.id("uploadFile"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", uploadButton1);  //click actions on the button
		
		Robot rb = new Robot();
		rb.delay(200);
		
		//put the path to file in a clipboard
		StringSelection str = new StringSelection("C:\\Users\\Hi\\Desktop\\sudhirRessume1.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		//Contr+V
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		//Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		
		
		
	
		
		
		
	}

}
