package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static FileReader fr;
	public static Properties prop = new Properties();
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException
	{
		if (driver==null)
		{
			fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
			prop.load(fr);			
		}
		
		if (prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			
			//System.setProperty("webdriver.chrome.driver","C:\\auto_learn\\TestAutomationFramework\\src\\test\\resources\\driver\\chromedriver.exe");			
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			driver.get(prop.getProperty("testurl"));
			Thread.sleep(2000);
		}
		if (prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.**********.driver","*************\\firefoxdriver.exe");		
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("testurl"));
			Thread.sleep(2000);
		}
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
		System.out.println("Test Completed and closing the browser");
	}

}
