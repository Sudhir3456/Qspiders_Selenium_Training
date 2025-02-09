package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// get(url)
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login ");
		driver.manage().window().maximize();

		// isDisplayed() c
		// WebElement logo=driver.findElement(By.xpath("//input[@id='gender-male']"));
		// System.out.println("Display status of logo: "+logo.isDisplayed());

		// isSelected

		WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male]"));
		WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female]"));

		System.out.println("Before Selection");
		System.out.println(male_rd.isSelected());// false
		System.out.println(female_rd.isSelected());// false

		System.out.println("After selection");
		male_rd.click();

		System.out.println("Before Selection");
		System.out.println(male_rd.isSelected());// true
		System.out.println(female_rd.isSelected());// false

		boolean newslettersstatus = driver.findElement(By.xpath("//input[id='Newsletter']")).isSelected();
		System.out.print("News letter chekbox status :" + newslettersstatus);

		// isEnabled()

		boolean status = driver.findElement(By.xpath("//input[@id='gender-male']")).isEnabled();
		System.out.println(status);

	}

}
