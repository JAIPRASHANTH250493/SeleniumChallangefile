package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase2;

public class FixeddepositPage extends TestBase2{

	public FixeddepositPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id="principal")
	public WebElement principle;

	@FindBy(id="interest")
	public WebElement interestrate ;

	@FindBy(id="tenure")
	public WebElement tenure ;


	@FindBy(id="tenurePeriod")
	public WebElement tenurePeriod ;

	@FindBy(id="frequency")
	public WebElement frequency ;

	@FindBy(xpath="//div[@class=\"CTR PT15\"]//a[1]")
	public WebElement calculate;

	@FindBy(xpath="//div[@class=\"CTR PT15\"]//a[2]")
	public WebElement clear;


	public void principlemethod(String rupees) {

		principle.sendKeys(rupees);
	}

	public void interestmethod(String interestis) {

		interestrate.sendKeys(interestis);
	}

	public void periodmethod(String tenures) {

		tenure.sendKeys(tenures);
	}


	public void frequencymethod(String frequ) {

		frequency.sendKeys(frequ);
	}

	public void calulatemethod() {

		calculate.click();
	}

	public void clearmethod() {

		clear.click();
	}	
}
