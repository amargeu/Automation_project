package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyErrorMessage {

	public static void main(String[] args) throws InterruptedException
	{
		String expectedErrormsg="Username or Password is invalid. Please try again.";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("ahgjd");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.name("pwd")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		String actualErrormsg=driver.findElement(By.className("errormsg")).getText();
		
		if(actualErrormsg.equals(expectedErrormsg))
			System.out.println("pass: error msg is verified");
		else
			System.out.println("Fail: error msg is not verified");
		

	}

}
