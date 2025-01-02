package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
		//driver.get("http://www.google.com/");
		
//		//Xpath with Single attribute
//		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("T-Shirt");
		
//		//Xpath with multiple attribute
//		driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Mobile");
		
//		//Xpath with and or sample
//		driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("Shoes");
//		driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search111']")).sendKeys("Shoes");
		
//		//Xpath with inner text
//		driver.findElement(By.xpath("//a[text()='MacBook']")).click();
		
//		//Xpath with inner text
//		boolean bl = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();	
//		System.out.println(bl);
//		System.out.println(driver.findElement(By.xpath("//h3[text()='Featured']")).getText());
		
//		//Xpath with contains
//		driver.findElement(By.xpath("//*[contains(@name,'arch')]")).sendKeys("Cycle");
		
//		//Xpath with starts-with
//		driver.findElement(By.xpath("//*[starts-with(@name,'sea')]")).sendKeys("Java");
		
		//Chained Xpath
		boolean blele = driver.findElement(By.xpath("//div[@class='image']/a/img")).isDisplayed();
		System.out.println(blele);
		driver.findElement(By.xpath("//div[@class='image']/a/img")).click();
		
	}

}
