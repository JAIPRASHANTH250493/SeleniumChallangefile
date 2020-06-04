package com.crm.qa.pages;

import java.awt.print.Pageable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Newpage extends TestBase {

	public Newpage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")
	public WebElement newbutton;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/input")
	public WebElement firstname;
	
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div/div/input")
	public WebElement Lastname;
	
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
	public WebElement save;
	
public void newbutton() {
		
		newbutton.click();
		
	}
	
	public void first_name(String name) {
		
		firstname.sendKeys(name);
		
	}
	public void lastname(String name1){
		Lastname.sendKeys(name1);
	}
	
	public void savebutton() {
		save.click();
	}
}
