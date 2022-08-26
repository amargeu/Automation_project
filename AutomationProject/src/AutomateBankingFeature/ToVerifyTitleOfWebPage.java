package AutomateBankingFeature;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTitleOfWebPage {

	public static void main(String[] args) throws InterruptedException
	{
		String ExpectedText="Welcome To Manager's Page of Guru99 Bank";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr432204");
		driver.findElement(By.name("password")).sendKeys("Yzuhave");
		
		//driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		Thread.sleep(2000);
		
		String actualtext = driver.findElement(By.xpath("//marquee[@class='heading3']")).getText();
		if(actualtext.contains(ExpectedText))
		{
			System.out.println("pass: Login is verified");
		}
		else
			System.out.println("Fail: Login is not Verified");
		
	
		

	}

}
