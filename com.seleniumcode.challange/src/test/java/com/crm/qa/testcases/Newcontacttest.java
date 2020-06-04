package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;
import com.crm.qa.pages.Newpage;

public class Newcontacttest extends TestBase{
	
	Loginpage login;
	
	Homepage home;
	
	Newpage newpage;
public Newcontacttest() {
	
	super();
}

@BeforeTest
public void setupmethod(){
	
	initialization();
	
	login =new Loginpage();
	
	login.login("jaiprashanth2504@gmail.com", "J@i250493");
	
	home=new Homepage();
	
	home.contacts();
	
	System.out.println(".....................new button clicked......................................................");
}

@Test
public void addingnewcontact(){

	System.out.println("......................new contactadding....................................................");
	newpage=new Newpage();
	
	newpage.newbutton();
	
	newpage.first_name("cruise");
	
	newpage.lastname("chirsto");
}


@Test
public void savebutton1() {
	
	newpage.savebutton();
	
	System.out.println(".....................saved..................................................................");
}
}








