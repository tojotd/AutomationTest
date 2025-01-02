package seleniumLearning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckBox_Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> checkboxs = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
//		//Select all check boxes
//		for (WebElement el:checkboxs) 
//		{
//			el.click();
//		}
		
//		//Select the first 3 checkbox
//		for(int i=0; i<3;i++)
//		{
//			checkboxs.get(i).click();
//		}
		
		//Select the last 4 checkboxes
		int val = checkboxs.size()-4;
		for(int i=val; i<checkboxs.size();i++)
		{
			checkboxs.get(i).click();
		}
		
		Thread.sleep(5);
		//In case if the check boxes are already selected
		for(int i=0; i<checkboxs.size();i++)
		{
			if(! checkboxs.get(i).isSelected())
			checkboxs.get(i).click();
		}
			
		Thread.sleep(5);
		driver.close();
		
	}

}
