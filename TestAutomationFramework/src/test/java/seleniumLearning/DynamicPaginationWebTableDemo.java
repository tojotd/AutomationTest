package seleniumLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationWebTableDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		int rows = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
		int cols = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr[1]//td")).size();
		
		//Pagination
		int totalpages=driver.findElements(By.xpath("//ul[@id='pagination']/li")).size();
		
		for (int p=1;p<=totalpages;p++)
		{
			if(p>1)
			{
				driver.findElement(By.xpath("//ul[@id='pagination']/li["+p+"]")).click();
				Thread.sleep(3000);
			}
			
			//Read all data
			for (int r=1;r<=rows;r++)
			{	
				for(int c=1;c<=cols;c++)
				{
					String data = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td["+c+"]")).getText();
					System.out.print(data+"\t");
				}
				System.out.println();
			}			
		}
			
	}
}
