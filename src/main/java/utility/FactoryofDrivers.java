package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Controlling or initializing the drivers like (chromedriver, firefox drivers, etc)//

public class FactoryofDrivers {

	private static WebDriver driver;
	
	public static WebDriver getDriver()
	{
		if (driver==null)
		{
			WebDriverManager.chromedriver().setup(); //Set up the chromedriver
			driver=new ChromeDriver(); //launching the broswer
			driver.manage().window().maximize(); // maximizing the browser window
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		return driver;
	}
	
	
	public static void quitdriver()
	{
		if(driver!=null)
		{
			driver.quit();  // Closes the browser
			driver=null; // Frees memory for GC and resets singleton
		}
	}
	

	}


