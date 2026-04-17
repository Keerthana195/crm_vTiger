package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import pomClasses.CreatingNewLeadPage;
import pomClasses.HomePage;
import pomClasses.LeadsOption;

public class TC_003 extends BaseClass {
	@Test(groups= {"Regression"})
	public void LE_003() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.toClickOnLeads();
		LeadsOption lo = new LeadsOption(driver);
	    lo.toClickOnPlusIcon();
	    String lname= eutil.getDataFromExcel("Leads", 7, 1);
	    String company= eutil.getDataFromExcel("Leads", 7, 2);
	    String mobile= eutil.getDataFromExcel("Leads", 7, 3);
	    String email= eutil.getDataFromExcel("Leads", 7, 4);
	    String city= eutil.getDataFromExcel("Leads", 7, 5);
	    String state= eutil.getDataFromExcel("Leads", 7, 6);
	    String country= eutil.getDataFromExcel("Leads", 7, 7);
	    CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
	    cnlp.creatNewlead(lname,company,mobile,email,city,state,country);
	    
	}

}
