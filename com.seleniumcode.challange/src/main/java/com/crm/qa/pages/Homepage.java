package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Homepage extends TestBase {


	public Homepage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class=\"right menu\"]//span[@class=\"user-display\"]")

	public WebElement userlog;
	

	@FindBy(xpath="//div[@id=\"main-nav\"]//a[3]")

	public WebElement contacts;
	
	

	@FindBy(xpath="//div[@id=\"main-nav\"]//a[5]")

	public WebElement deals;
	
	

	@FindBy(xpath="//div[@id=\"main-nav\"]//a[6]")

	public WebElement tasklink;
	
	
	public void userlog() {
		
		String ulog=userlog.getText();
		
		System.out.println(ulog);
	}
	
public Contactpage contacts() {
		
		contacts.click();
		
		return new Contactpage();
	}
	
public Dealpage deal() {
	
	deals.click();
	
	return new Dealpage();
}

public Taskpage task() {
	
	tasklink.click();
	
	return new Taskpage();
}
	
	
}
