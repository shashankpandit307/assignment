package com.testData.payment;

import java.io.FileInputStream;
import java.io.FileOutputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib<XSSFCell> {
	//@author Shashank 
	 
	
			String ePath = "C:\\Users\\VIKAS\\Desktop\\TestData.xls";
			
			/**
			 * its use to read the data from Excel Sheet (testScriptData.xlsx)based on the arguments
			 * @param SheetName
			 * @param rowNum
			 * @param colNum
			 * @return
			 * @throws Throwable
			 */
			
			public String getExcelData(String sheetName,int rowNum,int colNum) throws Throwable{
			
				FileInputStream fis = new FileInputStream(ePath);
				Workbook wb = WorkbookFactory.create(fis);
				Sheet sh = wb.getSheet(sheetName);
				Row row = sh.getRow(rowNum);
				Cell cel = row.getCell(colNum);
				String data = cel.getStringCellValue().toString();
				return data;
			}
			
			/**
			 * Write data back to excel Work Book based on the argument
			 * @param sheetName
			 * @param rowNum
			 * @param colNum
			 * @param data
			 * @throws Throwable
			 */
			
			public void setExcelData(String sheetName,int rowNum,int colNum,String data) throws Throwable{
				
				FileInputStream fis = new FileInputStream(ePath);
				Workbook wb = WorkbookFactory.create(fis);
				Sheet sh = (Sheet) wb.getSheet(sheetName);
				Row row = sh.getRow(rowNum);
				Cell cel = row.getCell(colNum);
				cel.setCellValue(data);
				FileOutputStream fos = new FileOutputStream(ePath);
				wb.write(fos);
				wb.close();
			}
}
