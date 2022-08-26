package WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetSizeOfWebpage {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		// driver.get("https://www.google.com/");
		 
		Dimension predim=driver.manage().window().getSize();
		System.out.println(predim);
		
		Thread.sleep(3000);
		Dimension dim=new Dimension(100, 300);
		driver.manage().window().setSize(dim);
		 Dimension postdim=driver.manage().window().getSize();
		System.out.println(postdim);
		
		//driver.quit();
		

	}

}
