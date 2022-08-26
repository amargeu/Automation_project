package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTagName
{
	public static void main(String[] args)
	{
		String expectedUsernametagname="input";
        String expectedpasswordtagname="input";
        String expectedCheckboxtagname="input";
        String expectedLoginbuttontagname="div";
		
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	
	String actualUsernameTagNmae =driver.findElement(By.id("username")).getTagName();
	String actualPasswordTagname = driver.findElement(By.name("pwd")).getTagName();
    String actualCheckboxTagname = driver.findElement(By.id("keepLoggedInCheckBox")).getTagName();
	String actualLoginButtonTagName = driver.findElement(By.xpath("//div[text()='Login ']")).getTagName();
	
	System.out.println("username tagname: "+actualUsernameTagNmae);
	System.out.println("password tagname:"+actualPasswordTagname);
	System.out.println("checkbox tagname:"+actualCheckboxTagname);
	System.out.println("login button: "+actualLoginButtonTagName);
	
	if(actualLoginButtonTagName.equals(expectedLoginbuttontagname))
		driver.findElement(By.id("username")).sendKeys("admin");

	if(actualPasswordTagname.equals(expectedpasswordtagname))
		driver.findElement(By.name("pwd")).sendKeys("manager");
	
	if(actualCheckboxTagname.equals(expectedCheckboxtagname))
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
	
	if(actualLoginButtonTagName.equals(expectedLoginbuttontagname))
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	else
		System.out.println("Fail: tag name are not matching");
	
	driver.quit();
	
	}
}
