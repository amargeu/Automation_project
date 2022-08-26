package WebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TonavigateToSubURL {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com/");//main url
		 Thread.sleep(3000);
		 driver.navigate().to("https://www.facebook.com/");//suburl
		 Thread.sleep(3000);
		 
		URL url= new URL("https://www.instagram.com");//suburl
		
		driver.navigate().to(url);
		 

	}

}
