package seleniumLearning;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshotDemo {
	
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.nopcommerce.com");
		
		// 1. Full page screen shot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshot\\fullpage1.png");
		sourcefile.renameTo(targetfile);
		
		//2. Specific area screen shot
		WebElement featureproducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File sourcefile1=featureproducts.getScreenshotAs(OutputType.FILE);
		File targetfile1=new File(System.getProperty("user.dir")+"\\screenshot\\featureproducts1.png");
		sourcefile1.renameTo(targetfile1);
		
		//3. Web element screenshot
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourcefile2=logo.getScreenshotAs(OutputType.FILE);
		File targetfile2=new File(System.getProperty("user.dir")+"\\screenshot\\logo1.png");
		sourcefile2.renameTo(targetfile2);
		
	}

}
