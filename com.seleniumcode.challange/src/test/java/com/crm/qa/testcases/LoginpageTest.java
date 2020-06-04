package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;

public class LoginpageTest extends TestBase {

	Loginpage login;

	LoginpageTest(){

		super();
	}


	@BeforeMethod
	public void setup() {

		initialization();

		login=new Loginpage();
	}


	@Test(priority=0)
	public void logintitle() {

		String title=	login.loginpagetitle();

		System.out.println(title);
	}

	@Test(priority=1)
	public Homepage logincredentials() {

		login.login("jaiprashanth2504@gmail.com", "J@i250493");
        return new Homepage();
	}

	@AfterMethod
	public void teardown() {

		String title2=	driver.getTitle();
		System.out.println(title2);

		
	}

}
