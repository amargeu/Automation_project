package WebDriver;

import org.openqa.selenium.WebDriver;

public class CBUsingRunTimePoly 
{
	public void launch(WebDriver driver,String expectedTitle)
	{
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String actualTitle = driver.getTitle();
		if(actualTitle.contains(expectedTitle))
			System.out.println("pass: title is verified");
		else
			System.out.println("fail: title is not verified");
		
		driver.quit();
	}

}
