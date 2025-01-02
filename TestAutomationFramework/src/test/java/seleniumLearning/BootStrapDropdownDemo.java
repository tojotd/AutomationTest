package seleniumLearning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropdownDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
//		//Select single element
//		driver.findElement(By.xpath("//input[@value ='Java']")).click();
		
		//Capture all options
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println("Number of Options : "+options.size());
		
		//Select certain elements
		for(WebElement el:options)
		{
			if( el.getText().equalsIgnoreCase("Python") || el.getText().equalsIgnoreCase("") || el.getText().equalsIgnoreCase("Oracle") )
			{
				el.click();
			}
		}
	}
}
