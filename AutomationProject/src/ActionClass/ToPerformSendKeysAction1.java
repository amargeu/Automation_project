package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformSendKeysAction1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		WebElement id = driver.findElement(By.id("username"));
		id.sendKeys("trainee");
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("trainee");
	
		
		Actions action=new Actions(driver);
		Thread.sleep(3000);
		action.sendKeys(password,Keys.ENTER).perform();
		

	}

}
