package Practice_Automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchWindow 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		String parentWindowId = driver.getWindowHandle();
		
		System.out.println("parentWindowId: "+parentWindowId);
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		System.out.println("allWindowIds:"+allWindowIds);
		
		for(String windowId:allWindowIds)
		{
			System.out.println("before switch"+windowId);
			driver.switchTo().window(windowId);
			
			if(!windowId.equals(parentWindowId))
			{
				System.out.println(windowId);
				driver.findElement(By.linkText("Try Free")).click();
			break;
			}
		}
		
		
	}

}
