package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Contactdatadrivern extends TestBase{
	
	public Contactdatadrivern() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id=\"main-nav\"]//a[3]")
	public WebElement contactlink;
	
	
	@FindBy(xpath="//a[@href=\"/contacts/new\"]")
	public WebElement newbutton;
	
	
	public void contactbutton() {
		
		contactlink.click();
	}
	
	public Newpage addnew() {
		
		newbutton.click();
		
		return new Newpage();
	}

}
