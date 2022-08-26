package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyEndLocation {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("file:///C:/Users/Computer/Desktop/demowebpage.html");
		   
		   Rectangle usernameRect = driver.findElement(By.id("id1")).getRect();
		   Rectangle passwordRect = driver.findElement(By.id("id2")).getRect();
		   
		  int usernameStartX = usernameRect.getX();
		 int passwordStartX = passwordRect.getX();
		 
		 int usernameWidth = usernameRect.getWidth();
		int passwordWidth = passwordRect.getWidth();
		
		int usernameEndX = usernameStartX+usernameWidth;
		int passwordEndX=passwordStartX+passwordWidth;
		
		if(usernameEndX==passwordEndX)
			System.out.println("pass: usernameEndx and passwordEndX is verified");
		else
			System.out.println("Fail: usernameEndx and passwordEndX is not verified");
		   
		 driver.quit();  
	

	}

}
