package com.section3.frameworks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import genericUtility.PropertiesUtility;

public class WritingData {

	public static void main(String[] args) throws IOException {
//		FileInputStream fis = new FileInputStream("C:\\Users\\Keerthana\\OneDrive\\Desktop\\TestData.properties");
//		Properties prop = new Properties();
//		prop.load(fis);
//		prop.setProperty("mobile", "1234567890");
//		FileOutputStream fos = new FileOutputStream("C:\\Users\\Keerthana\\OneDrive\\Desktop\\TestData.properties");
//		prop.store(fos, "moblie number updated");
		PropertiesUtility putil = new PropertiesUtility();
		putil.writDataToProperties("name", "robin", "name updated");
		
		
		
	}

}
