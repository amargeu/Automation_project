package activeElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetActiveElement {

	public static void main(String[] args)
	{
		String expectedTagName = "input";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
	String actualActiveTagNam =driver.switchTo().activeElement().getTagName();
		
 System.out.println(actualActiveTagNam);
 
 if(actualActiveTagNam.equals(expectedTagName))
	 System.out.println("pass: tag name is verified");
 else
	 System.out.println("fail: tag name is not verified");
	}

}
