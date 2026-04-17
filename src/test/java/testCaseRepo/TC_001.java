package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import pomClasses.CreatingNewLeadPage;
import pomClasses.HomePage;
import pomClasses.LeadsOption;


@Listeners(genericUtility.ListenersImplementation.class)
public class TC_001 extends BaseClass {
	
	int i =1;
	@Test(groups= {"Regression","System"}, retryAnalyzer = genericUtility.RetryAnalyzerImplementation.class)
	public void LE_001() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.toClickOnLeads();
		LeadsOption lo = new LeadsOption(driver);
	    lo.toClickOnPlusIcon();
	    if(i<=3) {
	    	i++;
	    	Assert.fail();
	    }
	    String fname = eutil.getDataFromExcel("Leads", 1, 1);
	    String lname = eutil.getDataFromExcel("Leads", 1, 2);
	    String company = eutil.getDataFromExcel("Leads", 1, 3);
	    CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
	    cnlp.creatNewlead(fname, lname, company);
	}
	
	
	
}
