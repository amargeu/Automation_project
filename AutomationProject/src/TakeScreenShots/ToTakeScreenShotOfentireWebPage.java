package TakeScreenShots;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ToTakeScreenShotOfentireWebPage {

	public static void main(String[] args) throws IOException 
	{
		     Date date=new Date();
		     String systemDate = date.toString().replace(" ","_").replace(":","_");
			 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			 WebDriver	driver=new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			  
			 driver.get("https://www.google.com/search?q=download+apache+poi&oq=&aqs=chrome.1.35i39i362l8.4630778j0j7&sourceid=chrome&ie=UTF-8");
			 
			 TakesScreenshot ts=(TakesScreenshot)driver;
			 File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("./screenShot/errorshot"+systemDate+".png");
			Files.copy(source, destination);
			driver.quit();
			
			 

	}

}
