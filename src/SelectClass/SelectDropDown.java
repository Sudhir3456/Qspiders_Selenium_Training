package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement dropCountryEle=driver.findElement(By.xpath("//select[@id='country']"));
		Select dropCountry=new Select(dropCountryEle);
		
		//select option from the drop down down
		
		//dropCountry.selectByVisibleText("France");
		//dropCountry.selectByValue("japan");
		//dropCountry.selectByIndex(2);
		
		
		//Capture the options from the dropdown
		List<WebElement>options=dropCountry.getOptions();
		System.out.print("Number of options in a drop down:"+options.size());
		
		//Capture the options from the dropdown
	/*	for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		*/
		
	//enhanced for loop
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		
	}

}
