package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAutoSuggestion {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("word");
		Thread.sleep(2000);
		List<WebElement> autosuggestion = driver.findElements(By.xpath("//span[text()='word']"));
		
		System.out.println("the no. of auto suggestion:"+autosuggestion.size());
		for(WebElement suggestion:autosuggestion)
		{
			System.out.println(suggestion.getText());
		}
		
		

	}

}
