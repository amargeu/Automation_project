package WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetDimension 
{
	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		Dimension dim=driver.manage().window().getSize();
		System.out.println(dim);
		int width=dim.getWidth();
		int height=dim.getHeight();
		
		System.out.println("the width of webpage is:"+width);
		System.out.println("the height of webpage is:"+height);
		
		driver.quit();
	}

}
