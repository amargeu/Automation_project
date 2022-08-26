package WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindow {

	public static void main(String[] args) throws InterruptedException
	{
		//how to start and where to start
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 //lauching empty chrome driver
		 WebDriver driver=new ChromeDriver();
		 //maximize the window
		 driver.manage().window().maximize();
		 //navigte the demo.actitime.com
		 driver.get("https://demo.actitime.com/login.do");
		 //fetch parent windowId
		 String parentWindowId = driver.getWindowHandle();
		 System.out.println(parentWindowId);
		 Thread.sleep(2000);
		 //click on actitime inc link
		 driver.findElement(By.linkText("actiTIME Inc.")).click();
		 //fetch all the window IDs
		Set<String> allWindowIDs=driver.getWindowHandles();
		System.out.println(allWindowIDs);
		//iterate the allwindows Id 
		for(String win:allWindowIDs)
		{
			//switch the window
			driver.switchTo().window(win);
			if(!win.equals(parentWindowId))
			{
				//click on Try free link after switching window
				driver.findElement(By.linkText("Try Free")).click();
			break;
			}
		}
		//again switch the window
		driver.switchTo().window(parentWindowId);
		//click on ckeck box present in parent window
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		

	}

}
