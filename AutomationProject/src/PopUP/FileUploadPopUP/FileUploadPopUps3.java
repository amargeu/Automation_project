package PopUP.FileUploadPopUP;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopUps3 {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://mail.google.com/mail/");
//		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
//		Runtime.getRuntime().exec("./AutoIt/FileUpload.exe");
		driver.findElement(By.id("identifierId")).sendKeys("singhamardeep874@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();		
		
		
		
		

	}

}
