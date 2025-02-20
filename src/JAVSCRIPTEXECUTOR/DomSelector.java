package JAVSCRIPTEXECUTOR;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DomSelector {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;

        js.executeScript("document.getElementById('')");
		js.executeScript("document.getElementById('email').value='sudhir'");
		js.executeScript("document.getElementsByTagName('email').value='sudhir'");
		js.executeScript("document.getElementsByClassName('email').value='sudhir'");
		js.executeScript("document.QuerySelector('#email,.className,tagName').value='sudhir'");
		js.executeScript("document.QuerySelectorAll('#email',.className,tagName).value='sudhir'");



		
	}

}
