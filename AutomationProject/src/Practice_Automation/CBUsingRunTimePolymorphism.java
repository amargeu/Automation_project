package Practice_Automation;

import org.openqa.selenium.WebDriver;

public class CBUsingRunTimePolymorphism 
{
		public void launch(WebDriver driver,String expectedTitle)
		{
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com");
			String actualTitle = driver.getTitle();
			System.out.println("actual title: "+actualTitle);
		
		}
		
	

}
