package com.section3.frameworks;


	import java.io.FileInputStream;
	import java.io.IOException;

	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.DataFormatter;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;
     
	public class FetchingDataFromExcelFile {

		public static void main(String[] args) throws EncryptedDocumentException, IOException   {
//			FileInputStream fis = new FileInputStream("C:\\Users\\Keerthana\\OneDrive\\Desktop\\TestData.xlsx");
//			Workbook wb = WorkbookFactory.create(fis);
//			Sheet sh = wb.getSheet("Actors");
//			Row r = sh.getRow(2);
//			Cell c = r.getCell(3);
//			DataFormatter df = new DataFormatter();
//			String value = df.formatCellValue(c);
//			System.out.println(value);
//			String value = c.getStringCellValue();
//			System.out.println(value);
//			Cell c1 = wb.getSheet("Cartoons").getRow(2).getCell(3);
//			String v1 = c1.getStringCellValue();
//			System.out.println(v1);
			ExcelUtility eutil = new ExcelUtility();
			String value1 = eutil.getDataFromExcel("Actors", 2, 1);
			String value2 = eutil.getDataFromExcel("Cartoons", 2, 4);
			System.out.println(value1);
			System.out.println(value2);
			
			
			

		}

	}



