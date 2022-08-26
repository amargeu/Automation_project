package AutomateBankingFeature;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToValidateLoginFeature {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr432204");
		driver.findElement(By.name("password")).sendKeys("Yzuhave");
		
		//driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		

	}

}
