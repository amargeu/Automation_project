package WebDriver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetFullScreen 
{
	public static void main(String[] args) throws InterruptedException {
		
	
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 
	 driver.manage().window().fullscreen();
	 driver.get("https://www.google.com/");
		
	
	
	}
}
