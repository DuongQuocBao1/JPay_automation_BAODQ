package com.jpay.media.automation.web.baseobjects;

import org.openqa.selenium.WebDriver;

import com.jpay.media.automation.web.facility.pagesobjects.FacilityAdminPage;
import com.jpay.media.automation.web.facility.pagesobjects.FacilityCommunicationsPage;
import com.jpay.media.automation.web.facility.pagesobjects.FacilityEmailPage;
import com.jpay.media.automation.web.facility.pagesobjects.FacilityHomePage;
import com.jpay.media.automation.web.facility.pagesobjects.FacilityIntelPage;
import com.jpay.media.automation.web.facility.pagesobjects.FacilityLoginPage;




public class ApplicationControllerFacility {

	private WebDriver driver;
	private FacilityLoginPage facilityLogin;
	private FacilityHomePage facilityHome;
	private FacilityCommunicationsPage facilityCommunications;
	private FacilityEmailPage facilityEmail;
	private FacilityAdminPage facilityAdmin;
	private FacilityIntelPage facilityIntel;


	public ApplicationControllerFacility(WebDriver driver) {
		this.driver = driver;
		
		
		facilityLogin = new FacilityLoginPage(getDriver());
		facilityHome = new FacilityHomePage(getDriver());
		facilityCommunications = new FacilityCommunicationsPage(getDriver());
		facilityEmail = new FacilityEmailPage(getDriver());
		facilityAdmin = new FacilityAdminPage(getDriver());
		facilityIntel = new FacilityIntelPage(getDriver());

	}

	public WebDriver getDriver() {
		return driver;
	}
	
	public FacilityLoginPage facilityLogin() {
		return facilityLogin;
	}
	
	public FacilityHomePage facilityHome() {
		return facilityHome;
	}
	
	public FacilityCommunicationsPage facilityCommunications() {
		return facilityCommunications;
	}
	
	public FacilityEmailPage facilityEmail() {
		return facilityEmail;
	}
	
	public FacilityAdminPage facilityAdmin() {
		return facilityAdmin;
	}
	
	public FacilityIntelPage facilityIntel() {
		return facilityIntel;
	}

}