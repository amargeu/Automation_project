package activeElement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPassValueToActiveTag {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		 driver.switchTo().activeElement().sendKeys("Facebook");
		 driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	
		

	}

}
