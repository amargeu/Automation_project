package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformKeyBoardSimulation
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromeDriver.exe");
		ChromeDriver driver	=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("trainee");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(Keys.CONTROL,"a");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(Keys.CONTROL,"c");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(Keys.CONTROL,"v");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(Keys.ENTER);
		
	}

}
