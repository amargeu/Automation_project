package Java_Script_Executor;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.JavascriptExecutor;
	public class ToUseExecuteAsyScript
	{
	   public static void main(String[] args) 
	   {
	      System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.tutorialspoint.com/index.htm");
	      //get current system time
	      long s = System.currentTimeMillis();
	      // Javascript executor
	      JavascriptExecutor j = (JavascriptExecutor)driver;
	      //executeAsyncScript method to set timeout
	      j.executeAsyncScript ("window.setTimeout(arguments[arguments.length − 1], 800)");
	      long elapsedTime=System.currentTimeMillis()-s;
	      System.out.println("Time Elapsed is: "+(elapsedTime));
	      driver.quit();
	   }
	

}
