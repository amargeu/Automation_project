package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyOverlappingIssue {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("file:///C:/Users/Computer/Desktop/demowebpage.html");
		   
		   Rectangle usernameRect = driver.findElement(By.id("id1")).getRect();
		   Rectangle passwordRect = driver.findElement(By.id("id2")).getRect();

		  int usernameEndY = usernameRect.getY()+usernameRect.getHeight();
		  int passwordStartY = passwordRect.getY();
		  
		  int space=passwordStartY-usernameEndY;
		  System.out.println("space is: "+space);
		  
		  
		  System.out.println("the usernameEndY:"+usernameEndY);
		  System.out.println("THE PASSWORD StartX:"+passwordStartY);
		  
		  if(usernameEndY<=passwordStartY)
			  System.out.println("Pass: there is no overlapping");
		  else
			  System.out.println("Fail: there is overlapping");
		                    
	driver.quit();	                    

	}

}
