package Webdriver_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfgetTagNameMethod {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		 driver.get("https://www.facebook.com/r.php");
		 
		 WebElement dayDropDown = driver.findElement(By.id("day"));
		
		 String DropDownTagName = dayDropDown.getTagName();
		 
		System.out.println("DropDownTagName");
		
		if (DropDownTagName.equalsIgnoreCase("Select")) {
			
			
		} else {

		}
		
	}

}
/*


This method is used to styling information or css properties of trageted ele.

this is method is used css peroperties name like background color , color , fornt family etc. as input in string foredm and its retruns the values assoaciated with the that propertites in string format.

in the properties having no any value in sach case its return empty
		
		note:_
		!. Color is is a selenium class through which we can conveterted in rgba to hexa decimal 
		
		2.  formString(String rgb)    is a static method of color class which retruns the ibject of color class obj
		
		asHax() is the method of Color Class( non static Method0)

which 

return the hexa vale of supply reb value
		
		its always best practics the compare the value in hex code format as camparing in rgb
		rgba is a primary color through which any color can be created  loest value ( 0 0 0 )  White   (255 255 255) black


Properties Name
font-weight thin

600 






















*/
