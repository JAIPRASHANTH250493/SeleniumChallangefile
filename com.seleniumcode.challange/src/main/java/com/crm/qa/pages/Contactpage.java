package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Contactpage  extends TestBase{

	
	public Contactpage() {
		
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@class=\"ui header item mb5 light-black\"]//div")
	public WebElement heading;
	
	
	@FindBy(xpath="//tr//td[contains(text(),'prashanth7107 RG')]//preceding::input[@name='id']")
	
	public WebElement checkbox;
	
	public String title() {
		
		return heading.getText();
		
	}
	
public void  checkboxes() {
		
checkbox.click();
		
	}
}


