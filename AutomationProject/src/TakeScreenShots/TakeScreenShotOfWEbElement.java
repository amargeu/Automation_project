package TakeScreenShots;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShotOfWEbElement
{
	public static void main(String[] args) throws IOException {
		
	
	     Date date=new Date();
	     String systemDate = date.toString().replace(" ","_").replace(":","_");
	     
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver	driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.get("https://demo.actitime.com/login.do");
		 
		 //no need to downcast TakeScreenshot because WebElement interface extends TakeScreenShot
		/* WebElement element = driver.findElement(By.xpath("//div[text()='Login ']"));
		File source = element.getScreenshotAs(OutputType.FILE);*/
		 
		 
		File source = driver.findElement(By.xpath("//div[text()='Login ']")).getScreenshotAs(OutputType.FILE);
		 File destination=new File("./screenShot/errorshot"+systemDate+".png");
		 Files.copy(source,destination);
		 
		 driver.quit();

}
}