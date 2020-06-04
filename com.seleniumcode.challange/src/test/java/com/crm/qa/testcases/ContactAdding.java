package com.crm.qa.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Contactdatadrivern;
import com.crm.qa.pages.Loginpage;
import com.crm.qa.pages.Newpage;

public class ContactAdding extends TestBase {

	Loginpage login;
	
	Contactdatadrivern ct;
	
	ContactAdding(){
		
		super();
	}
	
	@BeforeClass
	public void setupmethod() {
		
		initialization();
		
		login=new Loginpage();
		
		login.login("jaiprashanth2504@gmail.com", "J@i250493");		
	}
	
	
	@Test
	public void contactbuttonclick() {
		
		ct=new Contactdatadrivern();
		ct.contactbutton();
	}
	
	@Test
	public Newpage newbuttonclick() {
		
		
		 ct.addnew();
		return new Newpage();
	}
	
	
	
	
	
	
	
	
	
	
	
}
