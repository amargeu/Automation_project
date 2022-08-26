package PopUP.ChildBrowserPopUP;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleChildBrowser
{
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	String parentWindowId= driver.getWindowHandle();
	System.out.println(parentWindowId);
	
	driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
	Set<String> allwindowIds = driver.getWindowHandles();
	for(String window:allwindowIds)
	{
		driver.switchTo().window(window);
		if(!window.equals(parentWindowId))
		{
			driver.close();
			break;
		}
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		
		
	}
	
	
	}
}
