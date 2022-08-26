package PtracticeWebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToVerifyErrorMsg {

		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			   WebDriver driver= new ChromeDriver();
			   driver.manage().window().maximize();
			   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			   
			   driver.get("https://www.flipkart.com/");
			   
			   
			   driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7017952685");
			   driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("amargeu");
			   Thread.sleep(3000);
			   
			  // driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys(Keys.ENTER);
			   driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
			   
			   
			   

		}

	

}