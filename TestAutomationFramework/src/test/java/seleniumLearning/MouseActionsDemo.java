package seleniumLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDemo {
	// Mouse Actions
	// 1. Mouse hover 	- moveToElement(element)
	// 2. right click 	- contextClick(element)
	// 3. double click	- doubleClick(element)
	// 4. drag and drop	-
	
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
//		// 1. Mouse hover 	- moveToElement(element)
//		driver.get("https://demo.opencart.com/");
//		
//		WebElement desktop=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
//		WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
//		
//		Actions act = new Actions(driver);
//		act.moveToElement(desktop).moveToElement(mac).build().perform();		
//		mac.click();
		
//		// 2. right click 	- contextClick(element)
//		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
//		
//		WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
//		
//		Actions act = new Actions(driver);
//		act.contextClick(button).build().perform();
//		
//		//Click on copy and alert
//		WebElement copy = driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']"));
//		copy.click();
//		
//		driver.switchTo().alert().accept();
		
//		// 3. double click - doubleClick(element)
//		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
//		
//		driver.switchTo().frame("iframeResult");
//		
//		WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
//		WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
//		
//		box1.clear();
//		box1.sendKeys("Welcome");
//		
//		WebElement copytextbtn = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
//		
//		Actions act = new Actions(driver);
//		act.doubleClick(copytextbtn).build().perform();
//		
//		//compare the values in box1 and box 2
//		
//		String text = box2.getAttribute("value");
//
//		if (text.equalsIgnoreCase("Welcome"))
//		{
//			System.out.println("Text Copied Successfully ...");
//		}else
//		{
//			System.out.println("Couldn't copy the Text ...");
//		}

		// 4. drag and drop	- dragAndDrop(source_element , target_element)
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement rome = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement itly = driver.findElement(By.xpath("//div[@id='box106']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(rome, itly).build().perform();
				
	}

}
