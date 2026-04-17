package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaring the webElements
	@FindBy(name="user_name") private WebElement usernameTF;
	@FindBy(name="user_password") private WebElement passwordTF;
	@FindBy(id="submitButton") private WebElement LoginButton;
    
	//Initialize the webElements
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	//Public getters
	public WebElement getUsernameTF() {
		return usernameTF;
	}
	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	//Utilizing the webElements
	public void loginToApplication(String UN, String PWD)
	{
		getUsernameTF().sendKeys(UN);
		getPasswordTF().sendKeys(PWD);
		getLoginButton().click();
	}
	
	
	
}
