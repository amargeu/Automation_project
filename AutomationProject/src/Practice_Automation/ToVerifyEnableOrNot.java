package Practice_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyEnableOrNot 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://github.com/signup?source=login");
		
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("singhamardeep004@gmail.com");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
		boolean enabled = button.isEnabled();
		if(enabled)
			System.out.println("pass: button is enabled");
		else
			System.out.println("Fail: button is disabled");
		
		driver.quit();
		
		
		
	}

}
