package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTest {

	public static void main(String[] args) throws InterruptedException 
	{

		//System.setProperty("webdriver.chrome.driver","C:\\auto_learn\\TestAutomationFramework\\src\\test\\resources\\driver\\chromedriver.exe");		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.zoho.com/");
		Thread.sleep(2000);
		
		//click on Sign In
		WebElement signin = driver.findElement(By.xpath("//*[contains(@class,'login')][1]"));
		signin.click();
		
		//Enter email 
		Thread.sleep(2000);
		driver.findElement(By.id("login_id")).sendKeys("tojotd@gmail.com");
		
		//Click on Next
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nextbtn\"]/span")).click();
		
		//Enter Password
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("ZohoTest11*");
		
		//Click on Sign In Button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nextbtn\"]/span")).click();		
	
	}

}
