package Select_Class;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToGetAllSelectedOption {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver	driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  driver.get("https://demoqa.com/select-menu/");
		  WebElement element = driver.findElement(By.id("cars"));
		  
		  Select select=new Select(element);
		  
		  select.selectByVisibleText("Volvo");
		  select.selectByVisibleText("Audi");
		  select.selectByVisibleText("Saab");
		  
		 List<WebElement> allSelectOption = select.getAllSelectedOptions();
		 for(WebElement option:allSelectOption)
		 {
			 System.out.println(option.getText());
		 }
		 
		 System.out.println("=============================");
		 System.out.println(select.getFirstSelectedOption().getText());
		  
		  

	}

}
