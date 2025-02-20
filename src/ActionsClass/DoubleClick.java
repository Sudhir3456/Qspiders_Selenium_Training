package ActionsClass;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// ideentify the WebEle
		WebElement moveMouseCursor = driver.findElement(By.xpath("//a[text(0='Paytm for custumer']"));
		Actions a = new Actions(driver);

		// DobuleClick
		//a.doubleClick().perform();

		a.doubleClick(moveMouseCursor).perform();

	}

}
