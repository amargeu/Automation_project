package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyLocation {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   
		   driver.get("file:///C:/Users/Computer/Desktop/demowebpage.html");
		   
		     Point UsernameLocation = driver.findElement(By.id("id1")).getLocation();
		     Point PasswordLocation = driver.findElement(By.id("id2")).getLocation();
		     
		     int UsernameStartX= UsernameLocation.getX();
		     int passwordSartX = PasswordLocation.getY();
		     
		    
		    
		    System.out.println("Username startX:"+UsernameStartX);
		    
		    System.out.println("password startX:"+passwordSartX);
		   
		    
		    System.out.println("=====================================");
		    
		    if(UsernameStartX==passwordSartX)
		    	System.out.println("pass: allingnment verified");
		    else
		    	System.out.println("Fail: allingnment is not verified");
		    
		    driver.quit();


	}

}
