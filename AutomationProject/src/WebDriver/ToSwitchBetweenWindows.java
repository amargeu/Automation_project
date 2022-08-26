package WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchBetweenWindows {

	public static void main(String[] args) throws InterruptedException 
	{
 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://demo.actitime.com/login.do");
		 String parentWindowId = driver.getWindowHandle();
		 System.out.println(parentWindowId);
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allWindowIDs=driver.getWindowHandles();
		System.out.println(allWindowIDs);
		
		for(String window:allWindowIDs)
		{
			driver.switchTo().window(window);
			if(!window.equals(parentWindowId))
			{
				driver.findElement(By.linkText("Try Free")).click();
			break;
			}
		}
		
		

	}

}
