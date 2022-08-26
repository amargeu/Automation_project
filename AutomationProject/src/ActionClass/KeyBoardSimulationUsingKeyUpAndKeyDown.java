package ActionClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardSimulationUsingKeyUpAndKeyDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		Actions action=new Actions(driver);
		//press on control button
		action.keyDown(Keys.CONTROL).perform();
		///click on all the link
		List<WebElement> allLinks = driver.findElements(By.xpath("//a[@class='nav-link']"));
		
		for( WebElement link:allLinks)
		{
			link.click();
		}
		//to navigate all the link
		action.keyUp(Keys.CONTROL).perform();
		
		
		 
		 

	}

}
