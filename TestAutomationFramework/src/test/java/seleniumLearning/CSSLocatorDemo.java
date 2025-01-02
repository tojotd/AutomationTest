package seleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocatorDemo {

	public static void  main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		// css Selector with ID  #id name
		driver.findElement(By.cssSelector("#APjFqb")).clear();
		driver.findElement(By.cssSelector("#APjFqb")).sendKeys("Testing Selenium");
		driver.findElement(By.cssSelector("#APjFqb")).sendKeys(Keys.ENTER);
		
		WebElement el = driver.findElement(By.xpath("//h3[normalize-space()='Selenium']"));
		el.click();
		
		//css Select with class  .class name
		List<WebElement> elList = driver.findElements(By.cssSelector(".navbar-nav.mr-4.mb-2.mb-lg-0.ps-4.ps-lg-2"));
		
		for( WebElement ell : elList)
		{
			System.out.println(ell.getText());
		}
		
		Thread.sleep(3000);
		
		driver.quit();

		
	}
}
