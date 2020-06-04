package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Loginpage extends TestBase {



	@FindBy(name="email")
	public WebElement email;



	@FindBy(name="password")
	public WebElement password;


	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]")
	public WebElement submit;

	@FindBy(xpath="//*[@id=\"ui\"]/div/div/div[1]/a")
	public WebElement forgotpasswrd;

	public Loginpage() {

		PageFactory.initElements(driver, this);
	}


	public String loginpagetitle() {

		return driver.getTitle();
	}


	public boolean fogpasswrd() {

		return forgotpasswrd.isEnabled();

	}

	public Homepage login(String un,String pwd) {

		email.sendKeys(un);

		password.sendKeys(pwd);
		submit.click();
		
		return new Homepage();
		
		
	}
}
