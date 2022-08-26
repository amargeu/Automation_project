package WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchEmptyFirefox
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckoDriver.exe");
		new FirefoxDriver();
		
		
	}

}
