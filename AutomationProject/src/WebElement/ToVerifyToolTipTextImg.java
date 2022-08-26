package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyToolTipTextImg 
{
	public static void main(String[] args) {
	String expectedToolTipText="Flipkart";
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	String actualToolTipText=driver.findElement(By.xpath("//img[@title='Flipkart']")).getAttribute("alt");
	//String actualToolTipText=driver.findElement(By.className("_2xm1JU")).getAttribute("alt");
	System.out.println("actual alternate text of img: "+actualToolTipText);
	
	if(actualToolTipText.contains(expectedToolTipText))
		System.out.println("pass:  alt ToolTip text img is verified");
	else
		System.out.println("Fail: alt ToolTip text img is not verified");
	
	driver.quit();

	}
}
