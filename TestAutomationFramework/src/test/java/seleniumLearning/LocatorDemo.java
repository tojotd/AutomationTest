package seleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		//driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");

		//Thread.sleep(5000);

		System.out.println(driver.getTitle());
		
		WebElement SearchBoxEle = driver.findElement(By.name("q"));
		SearchBoxEle.clear();
		SearchBoxEle.sendKeys("Selenium");	
		SearchBoxEle.sendKeys(Keys.ENTER);
		
		//WebElement SearchBtnEle = driver.findElement(By.name("btnK"));		
		//SearchBtnEle.click();
					
		Thread.sleep(2000);
		
		//Find the number of all links in the site
		List<WebElement> AllLinks=driver.findElements(By.tagName("a"));
		System.out.println("Number of links :"+AllLinks.size());
		
		//Find all the images in the page
		List<WebElement> ImgList = driver.findElements(By.tagName("img"));
		System.out.println("Number of Images :"+ImgList.size());						
		
		//Find a list of items after searching on Google
		List<WebElement> list1 = driver.findElements(By.className("MjjYud"));
		System.out.println("Number of WebElements using a className : " + list1.size());
		for (WebElement el : list1)
		{
			System.out.println("Item : "+el.getText());
		}
		
		//Use linkText locator / partialLinkText
		driver.findElement(By.linkText("WebDriver")).click();
		
		//Close the driver
		driver.close();

	}

}
