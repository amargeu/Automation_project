package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathVerifyErrorMsg 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("dsaf");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		String actualText = driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']")).getText();
		String expectedText = "Username or Password is invalid";
		if(actualText.contains(expectedText))
		{
		System.out.println("Pass: The error message is verified");
		}
		else System.out.println("Fail: The error message is not verified");
}
}