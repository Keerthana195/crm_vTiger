package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class CreatingNewContactsPage {
	@FindBy(name="firstname") private WebElement firstNameTF;
	@FindBy(name="lastname") private WebElement lastNameTF;
	@FindBy(name="title") private WebElement titleTF;
	@FindBy(name="department") private WebElement departmentTF;
	@FindBy(name="email") private WebElement emailTF;
	@FindBy(name="mobile") private WebElement mobileTF;
	@FindBy(name="mailingcity") private WebElement mailCityTF;
	@FindBy(name="mailingstate") private WebElement mailStateTF;
	@FindBy(name="mailingcountry") private WebElement mailCountryTF;
	@FindBy(xpath="//input[@title='Save [Alt+S]']") private WebElement saveButton;
	
	public CreatingNewContactsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getFirstNameTF() {
		return firstNameTF;
	}

	public WebElement getLastNameTF() {
		return lastNameTF;
	}

	public WebElement getTitleTF() {
		return titleTF;
	}

	public WebElement getDepartmentTF() {
		return departmentTF;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getMobileTF() {
		return mobileTF;
	}

	public WebElement getMailCityTF() {
		return mailCityTF;
	}

	public WebElement getMailStateTF() {
		return mailStateTF;
	}

	public WebElement getMailCountryTF() {
		return mailCountryTF;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	/**
	 * This is a business library to create new contact
	 * @param fname
	 * @param lname
	 * @param title
	 */
	
	public void creatNewContact(String fname, String lname, String title) {
		getFirstNameTF().sendKeys(fname);
		getLastNameTF().sendKeys(lname);
		getTitleTF().sendKeys(title);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create new contact
	 * @param lname
	 * @param department
	 * @param email
	 * @param mobile
	 */
	public void creatNewContact(String lname, String department, String email, String mobile) {
		getLastNameTF().sendKeys(lname);
		getDepartmentTF().sendKeys(department);
		getEmailTF().sendKeys(email);
		getMobileTF().sendKeys(mobile);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create new contact
	 * @param lname
	 * @param title
	 * @param email
	 * @param mailCity
	 * @param mailState
	 * @param mailCountry
	 */
	public void creatNewContact(String lname, String title, String email, String mailCity, String mailState, String mailCountry) 
	{
		getLastNameTF().sendKeys(lname);
		getTitleTF().sendKeys(title);
		getEmailTF().sendKeys(email);
		getMailCityTF().sendKeys(mailCity);
		getMailStateTF().sendKeys(mailState);
		getMailCountryTF().sendKeys(mailCountry);
	}
	
}
