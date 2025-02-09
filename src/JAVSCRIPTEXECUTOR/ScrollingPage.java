package JAVSCRIPTEXECUTOR;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
 
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/en/demo");
		driver.manage().window().maximize();		
		JavascriptExecutor js=(JavascriptExecutor)driver;

		
	/*	//1)scroll down page by pixel number
		js.executeScript("window.ScrollBy(0,1500)","");
		System.out.println(js.executeScript("return window.pageYOffset;")); //
		*/
		
	/*	//2) scroll the page till element is visible 
		WebElement ele=driver.findElement(By.xpath("//strong[normalize-space()='community poll']"));
		js.executeScript("window.ScrollInvtoView();",ele);
		System.out.println(js.executeScript("return window.pageYOffset;")); //2103.428466796796875
		*/

		//3) scroll the page till end of the page
		js.executeScript("window.ScrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;")); //2103.428466796796875

		
		Thread.sleep(5000);
		//scrolling up to initial position 
		
	}

}
