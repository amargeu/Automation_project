package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnAutoSuggestion {

	public static void main(String[] args) throws InterruptedException
	{
		String expectedSuggestion="wordpress";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("word");
		Thread.sleep(2000);
		List<WebElement> autosuggestion = driver.findElements(By.xpath("//span[text()='word']"));
		
		for(WebElement suggestion:autosuggestion)
		{
			String actualSuggestion=suggestion.getText();
			System.out.println(actualSuggestion);
			if(actualSuggestion.equals(expectedSuggestion))
			{
			suggestion.click();
			break;
			}
		}
		
		

	}

}
