package seleniumLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {

		//Explicit wait demo
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Declaration
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		//Use
		WebElement userName = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));		
		//WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		userName.sendKeys("Admin");
		
		WebElement password = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));		
		password.sendKeys("admin123");

		WebElement login = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Login ']")));
		login.click();
		
		driver.close();
		
	}

}
