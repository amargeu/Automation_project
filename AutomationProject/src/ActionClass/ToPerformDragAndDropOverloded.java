package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDragAndDropOverloded {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//navigate the main url
		driver.get("https://jqueryui.com/draggable");
		//because only one frame is there
		driver.switchTo().frame(0);
		WebElement dragDropElement = driver.findElement(By.xpath("//p[text()='Drag me around']"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(dragDropElement,50,50).perform();
		Thread.sleep(2000);
		action.dragAndDropBy(dragDropElement,-50, 0).perform();
		
		
		
		
	
	}

}
