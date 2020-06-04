package com.crm.qa.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.crm.qa.base.TestBase2;

public class Retrylogic  extends TestBase2 implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult result) {
		int i=1;
		
	
		return false;
	}

	

}
