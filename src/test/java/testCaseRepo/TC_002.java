package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import pomClasses.CreatingNewLeadPage;
import pomClasses.HomePage;
import pomClasses.LeadsOption;

public class TC_002 extends BaseClass {
	@Test(groups= {"Smoke"})
	public void LE_002() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.toClickOnLeads();
		LeadsOption lo = new LeadsOption(driver);
	    lo.toClickOnPlusIcon();
	    String lname= eutil.getDataFromExcel("Leads", 4, 1);
	    String company= eutil.getDataFromExcel("Leads", 4, 2);
	    String title= eutil.getDataFromExcel("Leads", 4, 3);
	    String leadSource= eutil.getDataFromExcel("Leads", 4, 4);
	    String noOfEmp= eutil.getDataFromExcel("Leads", 4, 5);
	    CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
	    cnlp.creatNewlead(lname,company,title,leadSource,noOfEmp);
	    
	}

}
