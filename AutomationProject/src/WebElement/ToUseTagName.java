package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseTagName {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromeDriver.exe");
		WebDriver driver	=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Computer/Desktop/demoPage.html");
		driver.findElement(By.tagName("input")).clear();;
		
		driver.findElement(By.tagName("input")).sendKeys("qspider");
	

	}

}
