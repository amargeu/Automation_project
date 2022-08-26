package PtracticeWebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClearMethod {

	public static void main(String[] args) 
	{
		String expectedText = "Please identify";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("amar");
		
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("qspider");
		
		

	}

}
