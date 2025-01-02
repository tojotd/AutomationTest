package testNGlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXLSdata;

public class MyFirstTestFW extends BaseTest{
	
	@Test(dataProviderClass=ReadXLSdata.class, dataProvider="bvttest")
	public void loginZoho(String username, String password) throws InterruptedException
	{
		
		//click on Sign In
		WebElement signin = driver.findElement(By.xpath("//*[contains(@class,'login')][1]"));
		signin.click();
		
		//Enter email 
		Thread.sleep(2000);
		driver.findElement(By.id("login_id")).sendKeys(username);
		
		//Click on Next
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nextbtn\"]/span")).click();
		
//		//Enter Password
//		Thread.sleep(2000);
//		driver.findElement(By.id("password")).sendKeys(password);
//		
//		System.out.println("Test Script");
		
//		//Click on Sign In Button
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"nextbtn\"]/span")).click();	
	}

}
