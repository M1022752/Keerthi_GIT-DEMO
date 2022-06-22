package com.webdriver.java.testcases;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatingDataExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream("C://Selenium//Newdata.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Datasheet");
		
		for (int i=0; i<5; i++)
		{
			XSSFRow currentRow=sheet.createRow(i);
			for (int j=0; j<=3; j++)
			{
			  currentRow.createCell(j).setCellValue("Keerthi");
			}
		}
		
		workbook.write(file);
		workbook.close();
		System.out.println("File is successfully created");
	}

}
