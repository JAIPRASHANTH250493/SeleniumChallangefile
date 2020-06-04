package com.crm.qa.testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excelsheet {

	
	@Test
	public void excel() throws IOException {
		
		FileInputStream file =new FileInputStream("D:\\SAMPLESHEET.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=  workbook.getSheet("jaisheet");
		
	int lastrow=sheet.getLastRowNum();
	
	int lastcolumn=sheet.getRow(0).getLastCellNum();
	
	System.out.println(lastrow);
	
	for(int i=0;i<lastrow;i++) {
		
		for(int j=0;j<lastcolumn;j++) {
			
			String value=sheet.getRow(i).getCell(j).toString();
			
			System.out.print(value);
		}
		System.out.println("...............................");
	}
	}
}
