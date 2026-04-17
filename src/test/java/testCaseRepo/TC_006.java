package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import pomClasses.ContactsOption;
import pomClasses.CreatingNewContactsPage;
import pomClasses.HomePage;

public class TC_006 extends BaseClass{
	@Test(groups= {"System"})
	public void CON_002() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.toClickOnContact();
		ContactsOption co = new ContactsOption(driver);
		co.clickOnCreateContact();
		String lname = eutil.getDataFromExcel("Contacts", 7, 1);
	    String title = eutil.getDataFromExcel("Contacts", 7, 2);
	    String email = eutil.getDataFromExcel("Contacts", 7, 3);
	    String mailingCity = eutil.getDataFromExcel("Contacts", 7, 4);
	    String mailingState = eutil.getDataFromExcel("Contacts", 7, 5);
	    String mailingCountry = eutil.getDataFromExcel("Contacts", 7, 6);
	    CreatingNewContactsPage cncp = new CreatingNewContactsPage(driver);
		cncp.creatNewContact(lname,title,email,mailingCity,mailingState,mailingCountry);
	}

}


