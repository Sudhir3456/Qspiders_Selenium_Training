package FileUpload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileUsingRobotClass {

	public static void main(String[] args) throws AWTException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.grammarly.com/plagiarism-checker");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement uploadButton = driver.findElement(By.xpath("//span[normalize-space()='Upload a file']"));
		uploadButton.click();

		Robot rb = new Robot();
		rb.delay(200);
		
		StringSelection str = new StringSelection("C:\\Users\\Hi\\Desktop\\sudhirRessume1.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		
		


	}

}
