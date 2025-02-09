package KeywordActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://www.opencart.com/");
		
		//selenium4.x
		//driver.switchTo().newWindow(WindowType.TAB); //opens new tab
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://oranghrm.com/");
		
	}

}
