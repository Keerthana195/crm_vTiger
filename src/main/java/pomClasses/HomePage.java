package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class HomePage {
	@FindBy(xpath="//td[@class='tabUnSelected']/a[text()='Leads']") private WebElement leadsMenu;
	@FindBy(xpath="//a[text()='Contacts']") private WebElement contactMenu;
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']") private WebElement accountsIcon;
	@FindBy(xpath="//a[text()='Sign Out']") private WebElement signOut;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public WebElement getLeadsMenu() {
		return leadsMenu;
	}
	public WebElement getContactMenu() {
		return contactMenu;
	}
	public WebElement getAccountsIcon() {
		return accountsIcon;
	}
	public WebElement getSignOut() {
		return signOut;
	}
	
	/**
	 * This is a business library to click on leads menu
	 */
	public void toClickOnLeads() {
		getLeadsMenu().click();
	}
	/**
	 * This is a business library to click on contacts menu
	 */
	public void toClickOnContact() {
		getContactMenu().click();
	}
	/**
	 * This is a business library to click on accountsIcon menu
	 */
	public void toClickOnAccount() {
		getAccountsIcon().click();
	}
	/**
	 * This is a business library to click on Signout menu
	 */
	public void toHoverOnSignOut(WebDriver driver) {
		SeleniumUtility sutil =new SeleniumUtility();
		sutil.mouseHovering(driver, getAccountsIcon());
		getSignOut().click();
		
	}

}
