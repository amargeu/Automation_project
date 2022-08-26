package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPageSource
{
	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://facebook.com/");
		 
		String source= driver.getPageSource();
		System.out.println(source);
		 
		 driver.quit();
		
	}

}
