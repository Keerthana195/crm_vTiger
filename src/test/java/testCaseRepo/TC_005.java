package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import pomClasses.ContactsOption;
import pomClasses.CreatingNewContactsPage;
import pomClasses.HomePage;

public class TC_005 extends BaseClass{
	@Test(groups= {"Smoke"})
	public void CON_002() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.toClickOnContact();
		ContactsOption co = new ContactsOption(driver);
		co.clickOnCreateContact();
		String lname = eutil.getDataFromExcel("Contacts", 4, 1);
	    String department = eutil.getDataFromExcel("Contacts", 4, 2);
	    String email = eutil.getDataFromExcel("Contacts", 4, 3);
	    String mobile = eutil.getDataFromExcel("Contacts", 4, 4);
	    CreatingNewContactsPage cncp = new CreatingNewContactsPage(driver);
		cncp.creatNewContact(lname,department,email,mobile);
	}

}
