package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class CreateLeadPage extends LeafTapsWrappers {
	
	public CreateLeadPage(RemoteWebDriver driver,ExtentTest test){
		this.driver = driver;
		 this.test = test;
		if(!verifyTitle("Create Lead | opentaps CRM")){
			reportStep("This is not Create Lead Page", "FAIL");
		}		
	}
	
	
	public CreateLeadPage enterCompanyName(String cName) {
		enterById("createLeadForm_companyName", cName); 
		return this; 
	}
	
	
	public CreateLeadPage enterFirstName(String foreName) {
		enterById("createLeadForm_firstName", foreName);
		return this; 
	}
	
	
	public CreateLeadPage enterLastName(String surName) {
		enterById("createLeadForm_lastName", surName);
		return this; 
	}
	
	
	public ViewLeadPage clickCreateLead() {
		clickByClassName("smallSubmit"); 
		return new ViewLeadPage(driver, test); 
	}
	
	
	
	
	
	
	

}
