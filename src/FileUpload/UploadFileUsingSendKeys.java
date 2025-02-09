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
import org.openqa.selenium.interactions.Actions;

public class UploadFileUsingSendKeys {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement uploadButton = driver.findElement(By.id("uploadFile"));
		uploadButton.click();
		// uploadButton.sendKeys("C:\\Users\\Hi\\Desktop\\sudhirRessume1.docx");
		// //SocketException
		Thread.sleep(2000);
		driver.close();

		// We can upload file using Sendkeys only if attributs type --> type='file' is
		// aviable

		Actions act = new Actions(driver);
		act.moveToElement(uploadButton).click().perform();

		Robot rb = new Robot();
		rb.delay(200);

		StringSelection str = new StringSelection("C:\\Users\\Hi\\Desktop\\sudhirRessume1.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		
		//CTRL+C
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(200);

		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(200);

		//ENTER
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

	}

}
