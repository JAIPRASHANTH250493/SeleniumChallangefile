package com.crm.qa.testcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;

public class Homepagetest extends TestBase{

	Loginpage login;
	
	Homepage home;
	
	public Homepagetest(){
		
		super();
	}
	
	@BeforeClass
	public void setup() {
		
		initialization();
		login=new Loginpage();
		
	home=login.login("jaiprashanth2504@gmail.com", "J@i250493");	
	}
	
	@Test(priority=-1)
	public void verrifytitle() {
		
	home.userlog();
	
	}
	@Test(priority=0)
	public void contacttest() {
		
	home.contacts();
	
	}
	
	@Test(priority=1)
	public void dealstest() {
		
		home.deal();
	}
	
	@Test(priority=2)
	public void taskttest() {
		
		home.task();
	}
}
