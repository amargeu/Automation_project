package Practice_Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToImplicitWait {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://github.com/signup?source=login");
		
		driver.findElement(By.id("email")).sendKeys("singhamardeep001@gmail.com");
		WebElement continuebutton = driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(continuebutton)).click();
		
		driver.findElement(By.id("password")).sendKeys("Amargeu@123");
		WebElement continuebutton1 = driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
		WebDriverWait wait1=new WebDriverWait(driver,20);
		wait1.until(ExpectedConditions.elementToBeClickable(continuebutton1)).click();
		
	
		
		
	

	}

}
