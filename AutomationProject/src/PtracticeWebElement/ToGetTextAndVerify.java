package PtracticeWebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTextAndVerify {

	public static void main(String[] args) 
	{
		String expectedText = "Please identify";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		String text = driver.findElement(By.id("headerContainer")).getText();
		System.out.println("Header text: "+text);
		//verification of text
		if(text.contains(expectedText))
			System.out.println("pass: text is verified");
		else
			System.out.println("Fail: text is not verified");
		
		

	}

}
