package DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticDatePicker {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String year = "2026";
		String month = "Jan";   
		String date = "15";

		WebElement dateText = driver.findElement(By.xpath("//span[@class='dateText']"));
		dateText.click();
		int i = 1;
		while (i <= 20) {

			String monthYear = driver
					.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[2]"))
					.getText();
			System.out.println(monthYear);

			String arr[] = monthYear.split(" ");
			String mon = arr[0];
			String yr = arr[1];

			System.out.println(mon);
			System.out.print(yr);

			if (mon.contains(month) && yr.contains(year)) {

				System.out.println("mounth is selected..");
				break;
			} else
				driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]"))
						.click();
			i++;

		}

		// Date selections
		List<WebElement> allDates = driver
				.findElements(By.xpath("//div[@class='DayTiles__CalendarDaysBlock-sc-1xum02u-0 isgDNj']"));
		for (WebElement ele : allDates) {

			String dt = ele.getText();

			if (dt.contains(date)) {
				ele.click();
				break;
			}
		}

	}

}
