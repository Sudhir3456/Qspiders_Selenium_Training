package FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();

		// single file upload
		/*
		 * driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(
		 * "C:\\Users\\Hi\\newman.html");
		 * 
		 * if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals(
		 * "newman.html")) { System.out.println("File is sucessfully uploaded"); } else
		 * { System.out.println("File is not uploaded");
		 * 
		 * } //System.out.println("File is not uploaded");
		 * 
		 */

		// multipal file upload
		String file1 = "C:\\Automation\\automationFiles\\Test1.text";
		String file2 = "C:\\Automation\\automationFiles\\Test2.text";

		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1 + "\n" + file2);
		int noOffilesUploaded = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();

		// validation 1 - Number of files
		if (noOffilesUploaded == 2) {
			System.out.println("File is sucessfully uploaded");

		} else {
			System.out.println("File are not sucessfully uploaded");

		}

		/// validate files names
		/*
		 * if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().
		 * equals("file1.txt")) &&
		 * driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals(
		 * "file1.txt").getText().equals("file2.txt")); {
		 * 
		 * System.out.println("File is sucessfully uploaded");
		 * 
		 * } else { System.out.println("File are not sucessfully uploaded");
		 * 
		 * }
		 * 
		 */
	}

}
