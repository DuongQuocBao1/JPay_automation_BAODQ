package com.jpay.media.automation.web.baseobjects;

import org.openqa.selenium.WebDriver;

import com.jpay.media.automation.web.staging.pagesobjects.StagingAdminCommunicationsSettingsPage;
import com.jpay.media.automation.web.staging.pagesobjects.StagingAdminInmateAccountManagementPage;
import com.jpay.media.automation.web.staging.pagesobjects.StagingAdminKioskWifiManagementPage;
import com.jpay.media.automation.web.staging.pagesobjects.StagingAdministrationPage;
import com.jpay.media.automation.web.staging.pagesobjects.StagingHomePage;
import com.jpay.media.automation.web.staging.pagesobjects.StagingLoginPage;
import com.jpay.media.automation.web.staging.pagesobjects.StagingMarketingPage;
import com.jpay.media.automation.web.staging.pagesobjects.StagingSupportOutboundMailPage;
import com.jpay.media.automation.web.staging.pagesobjects.StagingTransfersPage;




public class ApplicationControllerStaging {

	private WebDriver driver;
	private StagingLoginPage stagingLogin;
	private StagingHomePage stagingHome;
	private StagingAdministrationPage stagingAdmin;
	private StagingTransfersPage stagingTransfers;
	private StagingSupportOutboundMailPage supportOutboundMail;
	private StagingMarketingPage stagingMarketing;
	private StagingAdminKioskWifiManagementPage stagingAdminKioskWifiManagement;
	private StagingAdminCommunicationsSettingsPage stagingAdminCommunicationsSettingsPage;
	private StagingAdminInmateAccountManagementPage stagingAdminInmateAccountManagementPage;
	
	public ApplicationControllerStaging(WebDriver driver) {
		this.driver = driver;
		
		
		stagingLogin = new StagingLoginPage(getDriver());
		stagingHome = new StagingHomePage(getDriver());
		stagingAdmin = new StagingAdministrationPage(getDriver());
		stagingTransfers = new StagingTransfersPage(getDriver());
		supportOutboundMail = new StagingSupportOutboundMailPage(getDriver());
		stagingMarketing = new StagingMarketingPage(getDriver());
		stagingAdminKioskWifiManagement = new StagingAdminKioskWifiManagementPage(getDriver());
		stagingAdminCommunicationsSettingsPage = new StagingAdminCommunicationsSettingsPage(getDriver());
		stagingAdminInmateAccountManagementPage = new StagingAdminInmateAccountManagementPage(getDriver());
		
		
		
	}

	public WebDriver getDriver() {
		
		return driver;
	}
	
	public StagingLoginPage stagingLogin(){
		
		return stagingLogin;
	}
	
    public StagingHomePage stagingHome(){
		
		return stagingHome;
	}
    
    public StagingAdministrationPage stagingAdmin(){
    	
    	return stagingAdmin;
    }
    
    public StagingTransfersPage stagingTransfers(){
    	
    	return stagingTransfers;
    }
    
   public StagingSupportOutboundMailPage supportOutboundMail(){
    	
    	return supportOutboundMail;
    }
   
   public StagingMarketingPage stagingMarketing(){
    	
    	return stagingMarketing;
    }
   
   public StagingAdminKioskWifiManagementPage stagingAdminKioskWifiManagement(){
   	
   	return stagingAdminKioskWifiManagement;
   }
   
   public StagingAdminCommunicationsSettingsPage stagingAdminCommunicationsSettings(){
   	
   	return stagingAdminCommunicationsSettingsPage;
   }
   
   public StagingAdminInmateAccountManagementPage stagingAdminInmateAccountManagement(){
   	
   	return stagingAdminInmateAccountManagementPage;
   }




   
}