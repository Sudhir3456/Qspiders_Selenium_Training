package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) throws AWTException {


		

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 
		//Con.. mode  of the WebPage
  		Robot r = new Robot();
  		 
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_N);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_N);
		
		r.keyPress(KeyEvent.VK_F);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_C);
		r.keyPress(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_B);
		r.keyPress(KeyEvent.VK_O);
		r.keyPress(KeyEvent.VK_O);
		r.keyPress(KeyEvent.VK_K);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		for (int i = 0; i <28; i++) {
			
			r.keyPress(KeyEvent.VK_TAB);

			
		}

		
		
		




		
		
	}

}
