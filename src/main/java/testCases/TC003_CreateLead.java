package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC003_CreateLead extends LeafTapsWrappers {

	@BeforeClass
	public void testDetails(){
	
		testCaseName = "TC003_CreateLead";
		testDescription = "Creating Lead";
		category = "Smoke";
		authors = "SatSur";
		browserName = "chrome";
		dataSheetName = "TC003";
		
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String UName, String Pwd, String LgdUser, String CompName, String ForeName, String SurName){
		new LoginPage(driver, test)
		.enterUserName(UName)
		.enterPassword(Pwd)
		.clickLogin()
		.verifyLoginName(LgdUser)
		.clickCRMSFALink()
		.clickCreateLead()
		.enterCompanyName(CompName)
		.enterFirstName(ForeName)
		.enterLastName(SurName)
		.clickCreateLead()
		.verifyForeName(ForeName); 
		
		
	}
}
