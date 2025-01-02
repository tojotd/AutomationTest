package seleniumLearning;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkDemo {
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://www.deadlinkcity.com");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("Number of links : "+links.size());
		int numberofbrokenlink=0;
		for(WebElement linkelement:links) 
		{
			String hrefattval=linkelement.getAttribute("href");
			if(hrefattval==null || hrefattval.isEmpty() )
			{
				System.out.println("href attribute value is null or empty. so not able to check");
				continue;
			}
			
			//Hit to server
			try {
				URL linkurl = new URL(hrefattval); //convert the string to url link
				HttpURLConnection conn = (HttpURLConnection) linkurl.openConnection(); //open connection to the conn object
				conn.connect(); //connect to server and send request to server
				
				if(conn.getResponseCode()>=400) {
					System.out.println("Broken Link");
					numberofbrokenlink++;
				}else
				{
					System.out.println("Not a Broken Link");
				}
				
				
			} catch (Exception e) {				
				e.printStackTrace();
			} 
		}
		System.out.println("Number of broken link : "+numberofbrokenlink);				
	}
}
