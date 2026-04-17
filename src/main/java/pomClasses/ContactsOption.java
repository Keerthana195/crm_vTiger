package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This a POM class for contacts web page
 * @version 26-03-27
 * @author Keerthana
 */
public class ContactsOption {
	@FindBy(xpath = "//img[@title='Create Contact...']") private WebElement createNewContact;
	public ContactsOption(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getCreateNewContact() {
		return createNewContact;
	}
	
	/**
	 * This is a business library to click on CreateNewContacts icon
	 */
	public void clickOnCreateContact() {
		getCreateNewContact().click();
	}

}
