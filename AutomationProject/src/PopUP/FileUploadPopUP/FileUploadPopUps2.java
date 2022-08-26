package PopUP.FileUploadPopUP;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUps2 {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//span[text()='Select WORD files']")).click();
		Runtime.getRuntime().exec("./AutoIt/FileUpload1.exe");
		
		

	}

}
