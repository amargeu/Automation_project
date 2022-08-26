package PopUP.NotificationPopUP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class ToAvoidNotificationInFireFox {

	public static void main(String[] args) 
	{
		FirefoxOptions option = new FirefoxOptions();
		//go to the mozilla firefox and about:config---->Accept Risk----->dom.webnotifications.enabled
		option.addPreference("dom.webnotifications.enabled", false);
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver(option);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.yatra.com/");
		
		
		

	}

}
