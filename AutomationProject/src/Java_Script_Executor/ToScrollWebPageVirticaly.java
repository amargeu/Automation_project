package Java_Script_Executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollWebPageVirticaly {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver	driver=new ChromeDriver();
		  //Maximize window	
		  driver.manage().window().maximize();
		  
		  //  //Set the Script Timeout to 20 seconds
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  ////Launching the Site.	
		 driver.get("https://www.selenium.dev/");
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollTo(0,300)");
		 Thread.sleep(3000);
		 js.executeScript("window.scrollTo(0,300)");
		 Thread.sleep(4000);
		 js.executeScript("window.scrollTo(0,-300)");
		

	}

}
