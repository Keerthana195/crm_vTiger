package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.manager.SeleniumManagerOutput;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class CreatingNewLeadPage {
	@FindBy(name="firstname") private WebElement firstNameTF;
	@FindBy(name="lastname") private WebElement lastNameTF;
	@FindBy(name="company") private WebElement companyTF;
	@FindBy(name="designation") private WebElement titleTF;
	@FindBy(name="leadsource") private WebElement leadSourceTF;
	@FindBy(name="noofemployees") private WebElement noOfEmpTF;
	@FindBy(name="mobile") private WebElement mobileTF;
	@FindBy(name="email") private WebElement emailTF;
	@FindBy(name="country") private WebElement countryTF;
	@FindBy(name="city") private WebElement cityTF;
	@FindBy(name="state") private WebElement saveButton;
	@FindBy(xpath="//input[@title='Save [Alt+S]']") private WebElement stateTF;
	
	public CreatingNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getFirstNameTF() {
		return firstNameTF;
	}

	public WebElement getLastNameTF() {
		return lastNameTF;
	}

	public WebElement getCompanyTF() {
		return companyTF;
	}

	public WebElement getTitleTF() {
		return titleTF;
	}

	public WebElement getLeadSourceTF() {
		return leadSourceTF;
	}

	public WebElement getNoOfEmpTF() {
		return noOfEmpTF;
	}

	public WebElement getMobileTF() {
		return mobileTF;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getCountryTF() {
		return countryTF;
	}

	public WebElement getCityTF() {
		return cityTF;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getStateTF() {
		return stateTF;
	}

	/**
	 * This is a business library to create new lead
	 * @param fname
	 * @param lname
	 * @param company
	 */
	public void creatNewlead(String fname, String lname, String company) {
		getFirstNameTF().sendKeys(fname);
		getLastNameTF().sendKeys(lname);
		getCompanyTF().sendKeys(company);
		getSaveButton().click();
		
	}
	
	/**
	 *  This is a business library to create new lead
	 * @param lname
	 * @param company
	 * @param title
	 * @param leadSource
	 * @param noOfEmp
	 */
	public void creatNewlead(String lname, String company, String title, String leadSource, String noOfEmp) {
		getLastNameTF().sendKeys(lname);
		getCompanyTF().sendKeys(company);
		getTitleTF().sendKeys(title);
		new SeleniumUtility().selectOptionByValue(getLeadSourceTF(), leadSource);
		getNoOfEmpTF().sendKeys(noOfEmp);
		getSaveButton().click();
	}
	
	/**
	 *  This is a business library to create new lead
	 * @param lname
	 * @param company
	 * @param mobile
	 * @param email
	 * @param city
	 * @param state
	 * @param country
	 */
	public void creatNewlead(String lname, String company, String mobile, String email, String city, String state, String country)
	{
		getLastNameTF().sendKeys(lname);
		getCompanyTF().sendKeys(company);
		getMobileTF().sendKeys(mobile);
		getEmailTF().sendKeys(email);
		getCityTF().sendKeys(city);
		getStateTF().sendKeys(state);
		getCountryTF().sendKeys(country);
		getSaveButton().click();
		
	}
}
