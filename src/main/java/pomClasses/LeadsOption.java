package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This a POM class for Leads web page
 * @version 26-03-27
 * @author Keerthana
 */
public class LeadsOption {
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']") private WebElement plusIcon;
	public LeadsOption(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getPlusIcon() {
		return plusIcon;
	}
	
	/**
	 * This is a business library to click on PlusIcon menu
	 */
	public void toClickOnPlusIcon() {
		getPlusIcon().click();
	}

}
