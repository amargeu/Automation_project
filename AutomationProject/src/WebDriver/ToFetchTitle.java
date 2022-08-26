package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchTitle 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver	driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String expectedTitle="Facebook";
	String actualTitle=driver.getTitle();
	System.out.println(actualTitle);
	if(actualTitle.contains(expectedTitle))
	{
		System.out.println("pass: the title of webpage is verified");
	}
	else
		System.out.println("Fail: title of webpage is not verified");
	}

}
