package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseCssShortcuts {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		String text = driver.findElement(By.cssSelector("td.header")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a#loginButton")).click();
		
		

	}

}
