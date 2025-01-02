package testNGlearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondTest {
	WebDriver driver;
	
	@Test(priority =1)
	void openapp()
	{
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
	}
	@Test(priority=2)
	void login()
	{		
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		userName.sendKeys("Admin");	
		WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys("Admin");	
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
	}
	@Test(priority=3)
	void logout()
	{
		driver.quit();
	}
}
