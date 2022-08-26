package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyIsEnableElement {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromeDriver.exe");
		WebDriver driver	=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://github.com/signup");
		Thread.sleep(4000);
		driver.findElement(By.id("email")).sendKeys("singhamardeep111@gmail.com");
		Thread.sleep(2000);
		boolean enable = driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).isEnabled();
		
		if(enable)
			System.out.println("pass: enable is verified");
		else
			System.out.println("Fail: enable is not verified");
	}

}
