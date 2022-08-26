package Practice_ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDragAndDrop {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//navigate the main url
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		//switch the driver control to the frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		WebElement source = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
		 WebElement destination = driver.findElement(By.id("trash"));
		Actions action=new Actions(driver);
		action.dragAndDrop(source, destination).perform();
		
		
		

	}

}
