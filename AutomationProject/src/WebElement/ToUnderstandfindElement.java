package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandfindElement {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromeDriver.exe");
		ChromeDriver driver	=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Computer/Desktop/demoPage.html");
		driver.findElement(By.id("id")).sendKeys("ABC");
		

	}

}
