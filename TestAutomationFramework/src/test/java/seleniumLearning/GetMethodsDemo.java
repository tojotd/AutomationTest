package seleniumLearning;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		//****GET MEthods***** - we can access these methods through webDriver instances
		//get method
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//getTitle
		System.out.println(driver.getTitle());		
		//getCurrentUrl
		System.out.println(driver.getCurrentUrl());
		//getPageSource
		//System.out.println(driver.getPageSource());
		//getWindowHandle
		System.out.println(driver.getWindowHandle());
		
		//getWindowHandles - //for that open one more window
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(2000);
		
		Set<String> windowIDs=driver.getWindowHandles();
		System.out.println(windowIDs);
		
		//driver.close(); close the single browser window wherever the driver is focused 
		//driver.close();
		
		//driver.quit(); close all the browser window
		driver.quit();

	}

}
