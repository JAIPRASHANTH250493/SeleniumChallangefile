package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Contactpage;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;

public class Contacttest extends TestBase {

	Loginpage login;
	
	Homepage home;
	
	Contactpage contact;
	public Contacttest(){
		
		super();
	}
	
	@BeforeMethod
	public void verifytitle() {
		initialization();
		
		login=new Loginpage();
		
		login.login("jaiprashanth2504@gmail.com", "J@i250493");
		
		
		/*
		 * String titleofcontact= contact.title();
		 * 
		 * System.out.println(titleofcontact);
		 */
	}
	
	@Test
	public void tilte() {
		
		home.contacts();
		
		contact.checkboxes();

	}
	
}
