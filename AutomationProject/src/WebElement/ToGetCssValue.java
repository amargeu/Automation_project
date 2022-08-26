package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetCssValue {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		 String LoginButtonColor = driver.findElement(By.xpath("//div[text()='Login ']")).getCssValue("border-top-color");
		 System.out.println("the login button color is: "+LoginButtonColor);

		 driver.quit();
	}

}
