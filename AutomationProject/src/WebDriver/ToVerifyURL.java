package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyURL
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String expectedURL="facebook";
		String actualURL=driver.getCurrentUrl();
		System.out.println(actualURL);
		
		if(actualURL.contains(expectedURL))
			System.out.println("pass: URL is verified");
		else
			System.out.println("fail: URL is not verified");
		
		
	}

}
