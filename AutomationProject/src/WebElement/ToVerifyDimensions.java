package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyDimensions 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   
		   driver.get("file:///C:/Users/Computer/Desktop/demowebpage.html");
		   
		     Dimension UsernameDimension = driver.findElement(By.id("id1")).getSize();
		     Dimension PasswordDimension = driver.findElement(By.id("id2")).getSize();
		     
		     int UsernameHieght = UsernameDimension.getHeight();
		     int UsernameWidth = UsernameDimension.getWidth();
		     
		    int PwHeight= PasswordDimension.getHeight();
		    int pwWidth=PasswordDimension.getWidth();
		    
		    System.out.println("Username height:"+UsernameHieght);
		    System.out.println("username width:"+UsernameWidth);
		    System.out.println("password height:"+PwHeight);
		    System.out.println("password width:"+pwWidth);
		    
		    System.out.println("=====================================");
		    
		    if(UsernameHieght==PwHeight && UsernameWidth==pwWidth)
		    	System.out.println("pass: un and pw text field of same dimension");
		    else
		    	System.out.println("Fail: un and pw text field of not same in dimension");
		    
		    
		     
		   
		   
		   
	}

}
