package Practice_ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformRightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//navigate the main url
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		//inspect the element
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		//perform action on webElement
		Actions action = new Actions(driver);
		//contextClick method is used to perform rightclick action
		action.contextClick(rightclick).perform();
		

	}

}
