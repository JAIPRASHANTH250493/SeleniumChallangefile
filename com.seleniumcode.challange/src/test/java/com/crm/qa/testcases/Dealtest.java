package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Dealpage;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;

public class Dealtest extends TestBase{
	
Loginpage login;
	
	Homepage Home;
	
	Dealpage dealtest;
	
	public Dealtest() {
		super();
		
	}

	@BeforeMethod
	public void setup(){
		
		initialization();
		
		login=new Loginpage();
		
		dealtest=new Dealpage();
		
		Home =login.login("jaiprashanth2504@gmail.com", "J@i250493");
		
		
		Dealpage dealtest=Home.deal();
	}
	
	@Test
	public void newdeal() {
		
		dealtest.checkbox();
	}
	}
