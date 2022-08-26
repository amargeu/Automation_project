package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathTextFunction {

	public static void main(String[] args)
	{
		String expectedText="Please identify yourself";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		String actualText = driver.findElement(By.xpath("//td[text()='Please identify yourself']")).getText();
		System.out.println("The text is :"+actualText);
		
if(actualText.contains(expectedText))
{
	System.out.println("pass: text is verified");
}
else
{
	System.out.println("fail: text is not verified");
}

driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
	}

}
