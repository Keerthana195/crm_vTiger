package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import pomClasses.ContactsOption;
import pomClasses.CreatingNewContactsPage;
import pomClasses.HomePage;

public class TC_004 extends BaseClass {
	@Test(groups= {"Smoke","System"})
	public void CON_001() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.toClickOnContact();
		ContactsOption co = new ContactsOption(driver);
		co.clickOnCreateContact();
		String fname = eutil.getDataFromExcel("Contacts", 1, 1);
	    String lname = eutil.getDataFromExcel("Contacts", 1, 2);
	    String title = eutil.getDataFromExcel("Contacts", 1, 3);
		CreatingNewContactsPage cncp = new CreatingNewContactsPage(driver);
		cncp.creatNewContact(fname, lname, title);
		
	}

}
