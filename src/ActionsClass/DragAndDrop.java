package ActionsClass;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.qspiders.com/ui/dragDrop/drag/ToCoorect?");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement drag = driver.findElement(By.xpath(""));
		
		WebElement drop = driver.findElement(By.xpath(""));
		
		Actions a =new Actions(driver);
		
		a.dragAndDrop(drag, drop).perform();

		
		
		
		
	}

}
