package com.section3.frameworks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;

public class FetchingMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		FileInputStream fis = new FileInputStream("C:\\\\Users\\\\Keerthana\\\\OneDrive\\\\Desktop\\\\TestData.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet("Birds");
//		DataFormatter df = new DataFormatter();
		// fetching single row data
//		Row r = sh.getRow(1);
//		for(int i=0; i<sh.getLastRowNum();i++) {
//			Cell c = r.getCell(i);
//			String v1 = df.formatCellValue(c);
//			System.out.println(v1);
//		}
//		for(int i=1;i<=sh.getLastRowNum();i++) {
//			Row r = sh.getRow(i);
//			for(int j=0; j<r.getLastCellNum();j++) {
//				Cell c = r.getCell(j);
//				String v2 = df.formatCellValue(c);
//				System.out.print(v2+" ");
//			}
//			System.out.println();
//		}
		ExcelUtility eutil = new ExcelUtility();
		List<String> value1 = eutil.getMultipleDataFromExcel("Birds", 1, 0);
		System.out.println(value1);
		
		

	}

}
