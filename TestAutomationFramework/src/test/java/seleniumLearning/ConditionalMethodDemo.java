package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethodDemo {

	public static void main(String[] args) {

		//***CONDITIONAL Methods**** - access these commands through WebElement
		// isDisplayed  isEnabled  isSelected
		//return boolean values true / false		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//isDisplayed
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(logo.isDisplayed());
		
		//isEnabled
		System.out.println(driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled());
		
		//isSelected
		WebElement ml_rd_btn = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement fml_rd_btn = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("Before Selection :");
		System.out.println("Male radio button Selected status :"+ml_rd_btn.isSelected());
		System.out.println("Female radio button Selected status :"+fml_rd_btn.isSelected());
		
		System.out.println("After Selecting male radio btn :");
		ml_rd_btn.click();
		System.out.println("Male radio button Selected status :"+ml_rd_btn.isSelected());
		System.out.println("Female radio button Selected status :"+fml_rd_btn.isSelected());
		
		System.out.println("After Selecting Female radio btn :");
		fml_rd_btn.click();
		System.out.println("Male radio button Selected status :"+ml_rd_btn.isSelected());
		System.out.println("Female radio button Selected status :"+fml_rd_btn.isSelected());
		
	}

}
