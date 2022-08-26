package Drop_down_Handle_without_Select_Class_;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleDropDownWithoutSelectClass 
{
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  WebDriver	driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.get("https://demoqa.com/select-menu/");
	  
	  driver.findElement(By.xpath("//div[text()='Select Option']")).click();
	  
	 Actions action=new Actions(driver);
	 Thread.sleep(2000);
	 action.moveToElement(driver.findElement(By.xpath("//div[text()='Group 1, option 2']"))).click().perform();
	  
	  
	  
	  
	}
	
}
