package PtracticeWebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ToPerformKeyBoardSimulation {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		   WebDriver driver= new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		   
		   driver.get("https://demo.actitime.com/login.do");
		   
		   driver.findElement(By.id("username")).sendKeys("trainee");
		   driver.findElement(By.id("username")).sendKeys(Keys.CONTROL,"a");
		   Thread.sleep(2000);
		   driver.findElement(By.id("username")).sendKeys(Keys.CONTROL,"c");
		   Thread.sleep(2000);
		   driver.findElement(By.name("pwd")).sendKeys(Keys.CONTROL,"v");
		   Thread.sleep(2000);
		   driver.findElement(By.name("pwd")).sendKeys(Keys.ENTER);
		   
		   
		   

	}

}
