package genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import pomClasses.HomePage;
import pomClasses.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver sDriver;
	public PropertiesUtility putil = new PropertiesUtility();
	public SeleniumUtility sutil = new SeleniumUtility();
	public ExcelUtility eutil = new ExcelUtility();
	
	@BeforeSuite(alwaysRun=true)
	public void bsConfig() {
		System.out.println("Creating DB connection");
	}
	@Parameters("browser")
	@BeforeClass(alwaysRun=true)
	public void bcConfig(@Optional("Chrome") String BROWSER) throws IOException {
		if(BROWSER.equals("Chrome"))
			driver = new ChromeDriver();
		else if(BROWSER.equals("Edge"))
			driver = new EdgeDriver();
		else if(BROWSER.equals("Firefox"))
			driver = new FirefoxDriver();
		else
		driver = new ChromeDriver();
		
		sDriver = driver;
		String URL = putil.getDataFromProperties("url");
		sutil.accesssApplication(driver, URL);
		sutil.maximizeWindow(driver);
		sutil.implicitWait(driver, 15);
		System.out.println("Browser launched successfully");
	}
	@BeforeMethod(alwaysRun=true)
	public void bmConfig() throws IOException {
		String UN = putil.getDataFromProperties("username");
		String PWD = putil.getDataFromProperties("password");
		LoginPage lp = new LoginPage(driver);
		lp.loginToApplication(UN, PWD);
		System.out.println("Login done successfully");
	}
	@AfterMethod(alwaysRun=true)
	public void amConfig() {
		HomePage hp = new HomePage(driver);
		hp.getSignOut();
		System.out.println("logout done successfully");
	}
	@AfterClass(alwaysRun=true)
	public void acConfig() {
		driver.quit();
		System.out.println("Browser closed successfully");
	}
	@AfterSuite(alwaysRun=true)
	public void asConfig() {
		System.out.println("DB connection closed");
	}
}
