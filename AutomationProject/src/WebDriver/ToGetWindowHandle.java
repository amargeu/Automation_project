package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.google.com");
		 String windowID1=driver.getWindowHandle();
		 System.out.println(windowID1);
		 
		/* String windowID2=driver.getWindowHandle();//gererate same window id
		 System.out.println(windowID2);*/ 
		 
		 Thread.sleep(2000);
         WebDriver driver1=new ChromeDriver();
		 driver1.manage().window().maximize();
		 
		 driver1.get("https://www.facebook.com");
		 String windowID2=driver1.getWindowHandle();
		 System.out.println(windowID2);///generate different window id
		 
		 

	}

}
