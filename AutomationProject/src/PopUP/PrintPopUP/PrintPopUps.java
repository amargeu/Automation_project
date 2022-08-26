package PopUP.PrintPopUP;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintPopUps 
{
	public static void main(String[] args) throws AWTException, IOException {

	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.get("C:\\Users\\Computer\\Desktop/demoAutoIt1.html");
	driver.findElement(By.xpath("//button[text()='Print']")).click();
	driver.switchTo().alert().accept();
	/*Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);*/
	
	Runtime.getRuntime().exec("./AutoIt/Print.exe");
	}
}
