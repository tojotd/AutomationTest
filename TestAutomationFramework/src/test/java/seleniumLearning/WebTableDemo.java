package seleniumLearning;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Find the total number of rows
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Number of Rows : "+rows);
		
		//Find the total number of colomns
		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();
		System.out.println("Number of Columns : "+cols);
		
		//Display the element on 5th row and column 1
		System.out.println("Specific Item on 5th ror and 1st col : "+driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText());
		
		//Display all the books written by Mukesh
		for (int i=2;i<=rows;i++)
		{
			for(int j=1;j<=cols;j++)
			{
				String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
				if(author.equalsIgnoreCase("Mukesh"))
					System.out.println("Book : "+ driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText()+ "written by "+author);
			}
		}
						
	}
}
