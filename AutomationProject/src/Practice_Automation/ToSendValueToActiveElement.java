package Practice_Automation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSendValueToActiveElement {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		  WebElement activeElement = driver.switchTo().activeElement();
		  activeElement.sendKeys("facebook");
		  activeElement.sendKeys(Keys.ENTER);
		  
		
	

	}

}
