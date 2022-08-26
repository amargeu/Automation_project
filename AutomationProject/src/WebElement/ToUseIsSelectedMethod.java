package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseIsSelectedMethod
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//option[text()='Jun']"));
		
		if(element.isSelected()) 
		{
		System.out.println("Pass: The month of June is selected by default");
		}
		else
			System.out.println("Fail: The month of June is not selected by default");


}
}
