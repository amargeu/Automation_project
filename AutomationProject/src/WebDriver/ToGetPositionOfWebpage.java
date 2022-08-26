package WebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPositionOfWebpage 
{
	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		Point point= driver.manage().window().getPosition();
		System.out.println(point);
		
		 int startX=point.getX();
		 int startY=point.getY();
		 System.out.println("start X is:"+startX);
		 System.out.println("start Y is:"+startY);
		 
		
	}

}
