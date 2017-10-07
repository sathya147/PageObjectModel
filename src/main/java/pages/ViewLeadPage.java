package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class ViewLeadPage extends LeafTapsWrappers {
	
	public ViewLeadPage(RemoteWebDriver driver,ExtentTest test){
		this.driver = driver;
		 this.test = test;
		if(!verifyTitle("View Lead | opentaps CRM")){
			reportStep("This is not View Lead Page", "FAIL");
		}		
	}
	
	
	public ViewLeadPage verifyForeName(String foreName) {
		verifyTextById("viewLead_firstName_sp", foreName); 
		return this; 
	}
	
	
	
	
	
	
	

}
