package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyHomePage extends LeafTapsWrappers {
	
	public MyHomePage(RemoteWebDriver driver,ExtentTest test){
		this.driver = driver;
		 this.test = test;
		if(!verifyTitle("My Home | opentaps CRM")){
			reportStep("This is not MyHome Page", "FAIL");
		}		
	}
	
	//click "Leads" tab on top
	public MyLeadsPage clickLeadsTab() {
		clickByLinkNoSnap("Leads"); 
		return new MyLeadsPage(driver, test); 
	}
	
	//Click "Create Lead" from 'Shortcuts' on the left 
	public CreateLeadPage clickCreateLead() {
		clickByLinkNoSnap("Create Lead");
		return new CreateLeadPage(driver, test); 
	}
	
	
	
	
	
	
	

}
