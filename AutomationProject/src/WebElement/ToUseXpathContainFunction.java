package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathContainFunction 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		   
		   Thread.sleep(2000);
		   driver.findElement(By.id("email")).sendKeys("singhamardeep874@gmail.com");
		   Thread.sleep(2000);
		   
		   boolean enabled=driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).isEnabled();
		   if(enabled)
			   System.out.println("Pass: the button is enabled");
		   else
			   System.out.println("Fail: the button is not enabled");
		   
		
	}

}
