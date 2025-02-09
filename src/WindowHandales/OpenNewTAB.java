package WindowHandales;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTAB {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("First Page Title :"+ driver.getTitle());
		
		//open new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		System.out.println("Secand Page Title :"+ driver.getTitle());


		//Get WindowHandles if all wintdow or Tab
		Set<String> allTabHandles = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>();
		
		handles.addAll(allTabHandles);
		driver.close();
		driver.switchTo().window(handles.get(0)); //switch to google
		System.out.println("First Page Title :"+ driver.getTitle());

		
	}

}
