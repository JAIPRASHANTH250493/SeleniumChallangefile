package com.crm.qa.utilities;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import com.aventstack.extentreports.reporter.configuration.ExtentHtmlReporterConfiguration;
import com.aventstack.extentreports.reporter.configuration.Theme;





public class Extentreportpack{
	
	ExtentHtmlReporter htmlreport;
	ExtentReports report;
	ExtentTest test;

	@Test
	public void listner(){
		htmlreport=new ExtentHtmlReporter("com.seleniumcode.challange/scrennshots"+"report.html");
		htmlreport.config().setReportName("samplereport");
		htmlreport.config().setReportName("jaiprashanth report");
		htmlreport.config().setTheme(Theme.DARK);
		
		
		report=new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("my info", "listen to class");
		report.getStats();
		
		report.createTest("logs of all classes");
		
		report.flush();
	}

	
}
