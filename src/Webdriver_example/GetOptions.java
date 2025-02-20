package Webdriver_example;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Hi/Desktop/DropDown.html");
		Thread.sleep(2000);

		// identify the DropDown
		WebElement dropDown = driver.findElement(By.id("dropdown"));

		Select s = new Select(dropDown);
		List<WebElement> allOptions = s.getOptions();

		List<String> uniqueOptions = new ArrayList<>();

		  // Copy the options in the set
			for (int i = 0; i < allOptions.size(); i++) {

				String optionText = allOptions.get(i).getText();

				boolean isDuplicate = false;
				// check if the option text is already in theuniqueOptions
				for (int j = 0; j < uniqueOptions.size(); j++) {

					if (uniqueOptions.get(j).equals(optionText)) {
						isDuplicate = true;
						break;
					}
				}
				// if not a Duplicate/equals then, add to the uniqueOptions list and print
				if (!isDuplicate) {
					uniqueOptions.add(optionText);
					System.out.println(optionText);
				}

			}
               driver.close();
		}
	}
