package Java_Script_Executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformScrollToTopOfPage {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver	driver=new ChromeDriver();
		  //Maximize window	
		  driver.manage().window().maximize();
		  
		  //  //Set the Script Timeout to 20 seconds
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  ////Launching the Site.	
		 driver.get("https://www.selenium.dev/");
		 WebElement element = driver.findElement(By.xpath("//h2[text()='News']"));
		 
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true)",element);
		

	}

}
