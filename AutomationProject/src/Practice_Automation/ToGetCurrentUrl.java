package Practice_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetCurrentUrl {

	public static void main(String[] args)
	{
		String expectedUrl="facebook";
		//set the driver executable path
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//launch  the  browser 
		 WebDriver driver = new ChromeDriver();
		 //navigate to the main url
		 driver.get("https://www.facebook.com/");
		//to get current url 
		String ActualUrl = driver.getCurrentUrl();
		System.out.println(ActualUrl);
		//verification of Url
		if(ActualUrl.contains(expectedUrl))
			System.out.println("PASS:URL is verified");
		else
			System.out.println("Fail: url is not verified");
		
		driver.close();
		

	}

}
