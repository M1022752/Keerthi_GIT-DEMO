
package com.webdriver.java.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class WorkingWithExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("C://Selenium//Empdata.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");//providing sheet name
		//XSSFSheet sheet=workbook.getSheetAt(0); //providing sheet name
		
		int rowcount=sheet.getLastRowNum(); //Give/returns the row count
		int colcount=sheet.getRow(0).getLastCellNum(); //Returns the cell/column count
		
		for (int i=0; i<=rowcount; i++) //increment the rows
		{
			XSSFRow currentrow=sheet.getRow(i); //focused on entire current row
			for (int j=0; j<colcount; j++) //increment the columns/cells on each row
			{
				String value=currentrow.getCell(j).toString(); //read the value from the cell
				System.out.print(" "+value);
			}
			System.out.println();
			
			}	

	}

}
