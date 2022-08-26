package Java_Script_Executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnDisableElement {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver	driver=new ChromeDriver();
		  //Maximize window	
		  driver.manage().window().maximize();
		  
		  //  //Set the Script Timeout to 20 seconds
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  ////Launching the Site.	
		  driver.get("https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html");
		  
		  driver.findElement(By.xpath("//a[text()=' jdk-8u202-linux-arm32-vfp-hflt.tar.gz']")).click();
		  
		  //Creating the JavascriptExecutor interface object by Type casting
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  
		  //Perform Click on LOGIN button using JavascriptExecutor
		  
		  js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//a[text()='Download jdk-8u202-linux-arm32-vfp-hflt.tar.gz']")));

	}

}
