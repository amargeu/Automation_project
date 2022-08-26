package Practice_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowHandle {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	String windowId1 = driver.getWindowHandle();	
	System.out.println(windowId1);
	
	WebDriver driver1=new ChromeDriver();
	driver1.manage().window().maximize();
	driver1.get("https://www.facebook.com");
	String windowId2 = driver1.getWindowHandle();
	System.out.println(windowId2);
		
	driver.quit();	

	}
	

}
