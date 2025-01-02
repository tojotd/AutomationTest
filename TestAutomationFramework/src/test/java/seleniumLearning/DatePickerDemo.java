package seleniumLearning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	static void selectFutureDate(WebDriver driver, String year,String month,String day)
	{
		//Select month & Year
		while(true)
		{			
			//Current year and month		
			String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();		
			String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	
			if(currentmonth.equals(month) && currentyear.equals(year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		//Select date
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td/a"));
		for(WebElement dt:alldates)
		{
			if(dt.getText().equals(day))
			{
				dt.click();
				break;
			}
		}
	}
	
	static void selectPastDate(WebDriver driver, String year,String month,String day)
	{
		//Select month & Year
		while(true)
		{			
			//Current year and month		
			String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();		
			String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	
			if(currentmonth.equals(month) && currentyear.equals(year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		
		//Select date
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td/a"));
		for(WebElement dt:alldates)
		{
			if(dt.getText().equals(day))
			{
				dt.click();
				break;
			}
		}
	}
	
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//Select a particular date
		//for that assign the expected date to Strings
		String year="2026";
		String month="June";
		String day = "22";
		
		//selectFutureDate(driver,year,month,day);
		
		selectPastDate(driver,"2023","April","8");
		
		
	}

}
