package Practice_Automation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchWindows 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
	     Set<String> allwindowIDS = driver.getWindowHandles();
	     System.out.println(allwindowIDS);
	     
	     for(String window:allwindowIDS)
	     {
	    	 driver.switchTo().window(window);
	    	 if(!window.equals(parentWindow))
	    	 {
	    		 driver.findElement(By.linkText("Try Free")).click();
	    	 break;
	    	 }
	    	 
	     }
	    
	    
		
		
		
		
		
	}

}
