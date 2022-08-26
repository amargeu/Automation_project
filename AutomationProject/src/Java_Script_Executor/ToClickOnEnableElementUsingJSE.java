package Java_Script_Executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnEnableElementUsingJSE {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver	driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  driver.get("https://demo.actitime.com/login.do");
		  
		  driver.findElement(By.id("username")).sendKeys("admin");
		  
		  driver.findElement(By.name("pwd")).sendKeys("manager");
		  
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//div[text()='Login '] ")));
		 // Thread.sleep(2000);
		 // js.executeScript("alert('Welcome to manager page of actitime');"); 
		  
		  Thread.sleep(3000);
		  
	      js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//a[text()='Logout']")));
		 // js.executeScript("alert('Thank you you are Succesfully Logout');"); 
		   

	}

}
