package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyLeadsPage extends LeafTapsWrappers {
	
	public MyLeadsPage(RemoteWebDriver driver,ExtentTest test){
		this.driver = driver;
		 this.test = test;
		if(!verifyTitle("My Leads | opentaps CRM")){
			reportStep("This is not MyLeads Page", "FAIL");
		}		
	}
	
		
	//Click "Merge Leads" from 'Shortcuts' on the left 
	public MergeLeadsPage clickMergeLeads() {
		clickByLinkNoSnap("Merge Leads");
		return new MergeLeadsPage(driver, test); 
	}
	
	
		
	

}
