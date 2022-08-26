package WebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetPositionOfWebpage {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		Point position= driver.manage().window().getPosition();
		
		System.out.println(position);//defaullt cordinate
		System.out.println("the  X is:"+position.getX());
		System.out.println("the  Y is:"+position.getY());
		
		System.out.println("============================================");
		Thread.sleep(2000);
		Point point1=new Point(100, 100);
		driver.manage().window().setPosition(point1);
		
		Point position1= driver.manage().window().getPosition();
		System.out.println(position1);
		System.out.println("the new X is:"+position1.getX());
		System.out.println("the new Y is:"+position1.getY());
		
		System.out.println("================================================");
		Thread.sleep(2000);
		Point point2=new Point(-40, -50);
		driver.manage().window().setPosition(point2);
		
		Point position2= driver.manage().window().getPosition();
		System.out.println(position2);
		System.out.println("the new X is:"+position2.getX());
		System.out.println("the new Y is:"+position2.getY());
		

	}

}
