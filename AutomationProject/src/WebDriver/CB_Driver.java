package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CB_Driver {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		CBUsingRunTimePoly test=new CBUsingRunTimePoly();
		
		test.launch(new ChromeDriver(),"Google");
		System.out.println("pass:ChromeDriver is verified");
		
		test.launch(new FirefoxDriver(),"Google");
		System.out.println("pass:Firefox Driver is verified");
		
		test.launch(new EdgeDriver(),"Google");
		System.out.println("pass:EdgeDriver is verified");
	

	}

}
