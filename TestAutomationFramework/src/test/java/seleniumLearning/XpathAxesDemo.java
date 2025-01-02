//java program for Xpath Axes Demo

//self
//parent
//child
//ancestor
//descendant
//following
//preceding
//following-sibling
//preceding-sibling

package seleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesDemo {
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
		
		//Self : Select the current Node or //self
		String selfText = driver.findElement(By.xpath("//*[contains(text(),'LKP Securities')]/self::a")).getText();
		System.out.println("Self : " + selfText);  //LKP Securities
		
		//Parent : Select the Parent of the current node only one
		String parentText = driver.findElement(By.xpath("//a[contains(text(),'LKP Securities')]/parent::td")).getText();
		System.out.println("Parent : "+parentText );  //LKP Securities
		
		//Ancestor (PArent GrandPArent etc)
		String ancestorText = driver.findElement(By.xpath("//a[contains(text(),'LKP Securities')]/ancestor::tr")).getText();
		System.out.println("Ancestor : "+ancestorText );
		
		//Descendant - select all children of the current node
		List<WebElement> eleList = driver.findElements(By.xpath("//a[contains(text(),'LKP Securities')]/ancestor::tr/descendant::*"));
		System.out.println("Number of Children : "+eleList.size());
		
		System.out.println("Children :");
		for (WebElement ele: eleList)
		{
			System.out.println(ele.getText());
		}
		
		
	}
}
