package WebDriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToMaximizeScreen {

	public static void main(String[] args) throws InterruptedException 
	{

		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
//		Options manage=driver.manage();
//		Window window=manage.window();
//		window.maximize();

		 driver.manage().window().maximize();
		 
		driver.get("https://www.google.com/");
		
		
		 
	}


}
