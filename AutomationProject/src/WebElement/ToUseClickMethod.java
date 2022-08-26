package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClickMethod {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromeDriver.exe");
	ChromeDriver driver	=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.selenium.dev/");
	driver.findElement(By.linkText("About Selenium")).click();
	

	}

}
