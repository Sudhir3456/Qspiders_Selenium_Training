package DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDatePicker {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.findElement(By.id("departon")).click();
		
		Select year_drp=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		year_drp.selectByVisibleText("2025");
		
		
		Select mounth_drp=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		mounth_drp.selectByVisibleText("Oct");
		
		String date="20";
		List<WebElement> allDates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td"));
		for (WebElement ele : allDates) {

			String dt = ele.getText();

			if (dt.contains(date)) {
				ele.click();
				break;
			}
		}
		
	}

}
