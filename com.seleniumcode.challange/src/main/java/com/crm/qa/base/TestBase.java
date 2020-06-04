package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;



import com.crm.qa.utilities.Eventfire;
import com.crm.qa.utilities.Extentreportpack;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	Logger log=Logger.getLogger(TestBase.class);
	
	
	public static Extentreportpack pack;
	public static EventFiringWebDriver eventfire;
	
	public static Eventfire eventfiringclass;

	public TestBase() {

		prop=new Properties();

		try {
			FileInputStream ip=new FileInputStream("C:\\Users\\New\\Desktop\\seleniummaven\\com.seleniumcode.challange\\src\\main\\java\\com\\qa\\qa\\config\\config.properties");

			prop.load(ip);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		catch(Exception e) {

			e.printStackTrace();
		}
	}

	public static void initialization() {

		

			System.setProperty("webdriver.chrome.driver","C:\\Users\\New\\Desktop\\chromedriver.exe");

			driver=new ChromeDriver();
		
			eventfire=new EventFiringWebDriver(driver);
			eventfiringclass=new Eventfire();
			
			eventfire.register(eventfiringclass);
			
			driver=eventfire;
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		pack=new Extentreportpack();
		
		pack.listner();
		
		driver.get("https://ui.freecrm.com/");
		
	}

}
