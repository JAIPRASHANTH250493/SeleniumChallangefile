package com.crm.qa.base;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.crm.qa.utilities.Eventfire;
import com.crm.qa.utilities.Extentreportpack;

public class TestBase2 {

	public static EventFiringWebDriver eventfire;
	
	public static Eventfire eventfiringclass;
	
	public static WebDriver driver;
	
	public static Logger log=Logger.getLogger(TestBase2.class);

	public static Extentreportpack pack;
	
	
	public static void initialization2(){
		
	log.info("launching the chrome");
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\New\\Desktop\\chromedriver.exe");

		driver=new ChromeDriver();
	
		eventfire=new EventFiringWebDriver(driver);
		eventfiringclass=new Eventfire();
		
		eventfire.register(eventfiringclass);
		
		driver=eventfire;
		
		
	driver.manage().window().maximize();
	
	driver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);
	
	driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	
	
	
	driver.manage().deleteAllCookies();
	pack=new Extentreportpack();
	
	pack.listner();

	
	driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
}
	
}
