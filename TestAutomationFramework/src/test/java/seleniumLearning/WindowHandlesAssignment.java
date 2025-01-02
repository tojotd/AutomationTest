package seleniumLearning;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesAssignment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		searchbox.sendKeys("Selenium");
		
		WebElement searchbutton = driver.findElement(By.xpath("//input[@type='submit']"));
		searchbutton.click();

		List<WebElement> links = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']"));

		for( WebElement el : links)
		{
			System.out.println(el.getText());
			driver.findElement(By.linkText(el.getText())).click();				
		}
		
		Set<String> windowsids = driver.getWindowHandles();		
		List<String> windowslistids = new ArrayList<String>(windowsids); 
		
		for( String strids: windowslistids)
		{
			String title = driver.switchTo().window(strids).getTitle();
			System.out.println(title);
			
			if(title.equals("Selenium in biology - Wikipedia") || title.equals("Selenium disulfide - Wikipedia"))
			{
				driver.close();
				System.out.println("Closed : "+title);
			}
						
		}
		
		
	}

}
