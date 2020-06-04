package com.crm.qa.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.base.TestBase2;
import com.crm.qa.pages.FixeddepositPage;

public class Fixed_deposit_Test extends TestBase2{

	int row;

	FileInputStream file;

	XSSFWorkbook workbook;

	XSSFSheet sheet;

	Logger log=Logger.getLogger(Fixed_deposit_Test.class);

	FixeddepositPage fd;

	public Fixed_deposit_Test(){

		System.out.println("contructor is called");

	}

	@BeforeTest
	public void setpmethod() {
		
		System.out.println("starting  ini method");
		initialization2();
		log.info("just a messgae");
		
	}


	@Test
	public void exceldatadriven() throws IOException {

log.warn("jus a waringmessgae");
		System.out.println("..loadinf files..............");

		file =new FileInputStream("D:\\SAMPLESHEET2.xlsx");

		workbook=new XSSFWorkbook(file);

		sheet=  workbook.getSheet("FD");

		int row=sheet.getLastRowNum();
	}

	@Test
	public void readingformexcel() throws InterruptedException{

		log.warn("jus a warning ");
		fd=new	FixeddepositPage();

		int row=sheet.getLastRowNum();

		for(int i=1;i<=row;i++) {

			int principleamount=	(int)sheet.getRow(i).getCell(0).getNumericCellValue();
			int rate=(int)	sheet.getRow(i).getCell(1).getNumericCellValue();
			int period=(int)sheet.getRow(i).getCell(2).getNumericCellValue();
			String interestSI=sheet.getRow(i).getCell(3).getStringCellValue();

			System.out.println(principleamount+"  "+rate+"  "+period+"  "+interestSI);



			fd.principlemethod(String.valueOf(principleamount));
			fd.interestmethod(String.valueOf(rate));
			fd.periodmethod(String.valueOf(period));


			Select s=new Select(fd.tenurePeriod);

			s.selectByIndex(2);

			Select s1=new Select(fd.frequency);
			s1.selectByIndex(0);	
			
			fd.calulatemethod();
			
			Thread.sleep(3000);
			
			fd.clearmethod();
		}
	}
	
	@Test
	public void  sample() {
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void sample2() {
		
		driver.get("https://www.ebay.com/");
		
		Assert.assertEquals(false, true);
	}


}
