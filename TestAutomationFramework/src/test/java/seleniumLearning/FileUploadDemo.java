package seleniumLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
//		//adding single file
//		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Tojo\\test1.txt");		
//		System.out.println(driver.findElements(By.xpath("//ul[@id='fileList']/li")).size());
		
		//uploading multiple files
		String file1 = "C:\\\\Tojo\\\\test1.txt";
		String file2 = "C:\\\\Tojo\\\\test2.txt";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);		
		int numberoffilesuploaded=driver.findElements(By.xpath("//ul[@id='fileList']/li")).size();

		System.out.println(numberoffilesuploaded);
		
		if (numberoffilesuploaded==2)
		{
			System.out.println("All files arre uploaded");
		}else
		{
			System.out.println("Files not uploaded");
		}
		
		
	}	
}
