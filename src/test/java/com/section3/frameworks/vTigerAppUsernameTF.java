package com.section3.frameworks;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.ExcelUtility;
import genericUtility.PropertiesUtility;
import genericUtility.SeleniumUtility;
import pomClasses.CreatingNewLeadPage;
import pomClasses.HomePage;
import pomClasses.LeadsOption;
import pomClasses.LoginPage;


public class vTigerAppUsernameTF {

    
	@FindBy(name="user_name") WebElement usernameTF;

    public vTigerAppUsernameTF(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public static void main(String[] args) throws IOException, InterruptedException {

        SeleniumUtility sutil = new SeleniumUtility();
        PropertiesUtility putil = new PropertiesUtility();
        ExcelUtility eutil = new ExcelUtility();
        String URL = putil.getDataFromProperties("url");
        String UN = putil.getDataFromProperties("username");
        String PWD = putil.getDataFromProperties("password");
        WebDriver driver = new ChromeDriver();
        sutil.accesssApplication(driver, URL);
        sutil.maximizeWindow(driver);
        sutil.implicitWait(driver, 15);
//        vTigerAppUsernameTF p = new vTigerAppUsernameTF(driver);
//        p.usernameTF.sendKeys(UN);
//        Thread.sleep(2000);
//        driver.navigate().refresh();
//        Thread.sleep(2000);
//        p.usernameTF.sendKeys(UN);
        LoginPage lp = new LoginPage(driver);
        lp.loginToApplication(UN, PWD);
        HomePage hp = new HomePage(driver);
        
        hp.toClickOnLeads();
        LeadsOption lo = new LeadsOption(driver);
        lo.toClickOnPlusIcon();
        String fname = eutil.getDataFromExcel("Leads", 1, 1);
        String lname = eutil.getDataFromExcel("Leads", 1, 2);
        String company = eutil.getDataFromExcel("Leads", 1, 3);
        CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
        cnlp.creatNewlead(fname, lname, company);
        hp.toHoverOnSignOut(driver);
        driver.quit();
        
        
        
    }
}
