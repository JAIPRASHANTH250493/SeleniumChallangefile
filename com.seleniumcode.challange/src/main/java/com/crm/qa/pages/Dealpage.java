package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Dealpage extends TestBase {

	
	public Dealpage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
@FindBy(xpath="//tr//td[contains(text(),\"new deal\")]//preceding::td//inpu")
public WebElement checkbox;

public void checkbox() {
	
	checkbox.click();
}
}
