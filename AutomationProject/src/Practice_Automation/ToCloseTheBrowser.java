package Practice_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseTheBrowser {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.actitime.com/login.do");
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("actiTIME Inc.")).click();
	   
	    Thread.sleep(2000);
	    
	  // driver.close();//CLOSE MAIN URL OR PARENT WINDOW
	    driver.quit();
	 
	
		

	}

}
