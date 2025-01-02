package seleniumLearning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Alert_Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
//		//Normal Alert - Only OK : accept
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
//		driver.switchTo().alert().accept();		
//		System.out.println(" Result : "+driver.findElement(By.xpath("//p[text()='You successfully clicked an alert']")).getText());
		
//		//Alert Confirm - OK : accept or Cancel :dismiss
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//		driver.switchTo().alert().dismiss();		
//		System.out.println(" Result : "+driver.findElement(By.xpath("//p[text()='You clicked: Cancel']")).getText());
		
//		//Alert with Prompt - OK : accept or Cancel :dismiss (Enter a text in prompt
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
//		driver.switchTo().alert().sendKeys("Welcome");	
//		driver.switchTo().alert().accept();
//		System.out.println(" Result : "+driver.findElement(By.xpath("//p[text()='You entered: Welcome']")).getText());
		
//		//Another way
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
//		Alert myalert=driver.switchTo().alert();		
//		myalert.sendKeys("Welcome");	
//		myalert.accept();
//		System.out.println(" Result : "+driver.findElement(By.xpath("//p[text()='You entered: Welcome']")).getText());		
		
		//Using explicit wait		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert myalert = mywait.until(ExpectedConditions.alertIsPresent());
		myalert.sendKeys("Happy waiting");
		myalert.accept();
		System.out.println(" Result : "+driver.findElement(By.xpath("//p[text()='You entered: Happy waiting']")).getText());
		
	}

}
