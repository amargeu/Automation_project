package AutomateBankingFeature;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyErrorMessage 
{
	   /* *//**
	     * SS1: Enter valid userid & password 
	     *      Expected: Login successful home page shown 
	     * SS2: Enter invalid userid & valid password 
	     * SS3: Enter valid userid & invalid password 
	     * SS4: Enter invalid userid & invalid password 
	     *      Expected: A pop-up “User or Password is not valid” is shown
	 * @throws InterruptedException 
	 
	     */
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.get("https://www.demo.guru99.com/V4/");
	driver.findElement(By.name("uid")).sendKeys("mngr432204");
	driver.findElement(By.name("password")).sendKeys("Yzuhave");
	driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("alert('you are Succesfully Login')");
	
	driver.switchTo().alert().accept();
	
	driver.findElement(By.xpath("//a[text()='Log out']")).click();
	
	driver.switchTo().alert().accept();
	
	Thread.sleep(3000);
	
	driver.findElement(By.name("uid")).sendKeys("mngr4322");
	driver.findElement(By.name("password")).sendKeys("Yzuhave");
	driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	
	
	

	}
}
