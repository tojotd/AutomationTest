package seleniumLearning;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesDemo {

	public static void main(String[] args) throws InterruptedException {
		// WindowHandles Demo
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
		//Open another window
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(2000);
		

//		//***Approach 1
//		Set<String> windowids = driver.getWindowHandles();
//		
//		//Convert set to list, because Set dosen't have index concept to use the get(index)
//		List<String> windowlists = new ArrayList<String>(windowids);
//		String parentid = windowlists.get(0);
//		String childid = windowlists.get(1);
//				
//		System.out.println("Title before Changing the Window  :  "+driver.getTitle());		
//		//Change the window and check Title
//		driver.switchTo().window(childid);
//		System.out.println("Title After Changing the Window  :  "+driver.getTitle());
		
		//***Approach 2
		Set<String> windowids = driver.getWindowHandles();		
		//Convert set to list, because Set dosen't have index concept to use the get(index)
		List<String> windowlists = new ArrayList<String>(windowids);		
		for( String winid:windowlists)
		{
			String title = driver.switchTo().window(winid).getTitle();
			System.out.println(title);			
			if(title.equalsIgnoreCase("Human Resources Management Software | OrangeHRM"))
			{
				driver.close();
			}			
		}
		
	}
}
