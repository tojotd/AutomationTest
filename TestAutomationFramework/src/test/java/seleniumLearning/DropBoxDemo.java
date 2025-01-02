package seleniumLearning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropBoxDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement dropcountry = driver.findElement(By.xpath("//select[@id='country']"));
		
//		//Select element ByVisibleText 
//		Select drpbox = new Select(dropcountry);
//		drpboxsel.selectByVisibleText("France");	
		
//		//Select ByValue
//		Select drpbox = new Select(dropcountry);
//		drpbox.selectByValue("uk");

////		//Select ByIndex
//		Select drpbox = new Select(dropcountry);
//		drpbox.selectByIndex(6);
		
		//Cpture all the options from dropdown
		Select drpbox = new Select(dropcountry);
		List <WebElement> options = drpbox.getOptions();
		System.out.println("Number of options : " +options.size());
		
		//Printing options
		for (WebElement el: options)
		{
			System.out.println(el.getText());
		}		
	}
}
