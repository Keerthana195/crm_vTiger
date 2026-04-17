package com.section3.frameworks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;

public class WritingDataToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		FileInputStream fis = new FileInputStream("‪C:\\Users\\Keerthana\\OneDrive\\Desktop\\TestData.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.crSheet("Cars");
//		Row r = sh.createRow(2);
//		Row r = sh.getRow(2);
//		Cell c = r.createCell(3);
//		c.setCellValue("Hyundai");
//		FileOutputStream fos = new FileOutputStream("‪C:\\Users\\Keerthana\\OneDrive\\Desktop\\TestData.xlsx");
//		wb.write(fos);
		ExcelUtility eutil = new ExcelUtility();
		eutil.writeDataToExcel("Cars", 2, 3, "Volvo");
		

	}

}
