package PopUP.AuthentificationPopUP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAuthentificationPopUp 
{
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//driver.get("http://the-internet.herokuapp.com/basic_auth");
	driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
