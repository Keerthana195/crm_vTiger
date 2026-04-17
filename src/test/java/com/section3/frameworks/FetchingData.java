package com.section3.frameworks;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class FetchingData {

	public static void main(String[] args) throws IOException {
		PropertiesUtility putil = new PropertiesUtility();
		String URL = putil.getDataFromProperties("url");
		String UN = putil.getDataFromProperties("username");
		String PWD = putil.getDataFromProperties("password");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(URL);
		driver.findElement(By.name("username")).sendKeys(UN,Keys.TAB,PWD,Keys.ENTER);

	}

}
