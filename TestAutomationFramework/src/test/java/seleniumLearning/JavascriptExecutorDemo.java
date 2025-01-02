package seleniumLearning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavascriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
//		driver.get("https://testautomationpractice.blogspot.com/");
//		
//		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
//		
//		//passing text into input box ,  alternate of sendKeys
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].setAttribute('value', 'John')", name);
//		
//		//selecting the radio button
//		WebElement rdmale = driver.findElement(By.xpath("//input[@id='male']"));
//		js.executeScript("arguments[0].click()", rdmale);
		
		//Scroll bar handling using JavascriptExecutor
				
		driver.get("https://demo.nopcommerce.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
//		// 1. scroll down page by pixel number
//		js.executeScript("window.scrollBy(0,1000)","");
//		System.out.println(js.executeScript("return window.pageYOffset;"));
		
//		// 2. scroll page till element is visible
//		WebElement ele = driver.findElement(By.xpath("//strong[text()='News']"));
//		js.executeScript("arguments[0].scrollIntoView();", ele);
//		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		// 3. scroll page till the end of page
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		//back to scroll up
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//Zoom
		js.executeScript("document.body.style.zoom='50%'");
		Thread.sleep(3000);
		js.executeScript("document.body.style.zoom='80%'");
		
		
		
	}

}
