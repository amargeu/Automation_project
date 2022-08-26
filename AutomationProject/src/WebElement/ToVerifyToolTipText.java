package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyToolTipText {

	public static void main(String[] args)
	{
		String expectedToolTipText="Do not select if this computer is shared";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		String actualToolTipText=driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
		System.out.println(actualToolTipText);
		
		if(actualToolTipText.contains(expectedToolTipText))
			System.out.println("pass: ToolTip text is verified");
		else
			System.out.println("Fail: ToolTip text is not verified");
		
		driver.quit();

	}

}
