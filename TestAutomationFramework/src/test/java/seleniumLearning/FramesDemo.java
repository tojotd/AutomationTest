package seleniumLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		//Enter text on Frame1, so focus to Frame1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
		//Back to parent Page
		driver.switchTo().defaultContent();
				
		//Enter text in the second frame
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
		//Back to parent Page
		driver.switchTo().defaultContent();
		
		//Enter text in the Third frame
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Inner Frame Text");		
		//Go to inner iframe (ie inside frame 3
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='AB7Lab Id5V1']")).click();	
		//Back to parent Page
		driver.switchTo().defaultContent();
		
		//Enter text of Frame 5 and clcik on a link in that moves to an inner frame, check the logo there.
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);		
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("I  am in Frame5");	
		//Click on the link
		driver.findElement(By.linkText("https://a9t9.com")).click();
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='Ui.Vision by a9t9 software - Image-Driven Automation']"));
		System.out.println("Logo Visibility is : "+logo.isDisplayed());
	}
}
