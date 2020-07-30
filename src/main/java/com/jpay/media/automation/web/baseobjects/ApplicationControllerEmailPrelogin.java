package com.jpay.media.automation.web.baseobjects;

import org.openqa.selenium.WebDriver;

import com.jpay.media.automation.web.emailprelogin.pagesobjects.PreloginAvailabilityPricingPage;
import com.jpay.media.automation.web.emailprelogin.pagesobjects.PreloginHomeFooterPage;
import com.jpay.media.automation.web.emailprelogin.pagesobjects.PreloginHomeHeaderPage;
import com.jpay.media.automation.web.emailprelogin.pagesobjects.PreloginHomeMiddlePage;
import com.jpay.media.automation.web.emailprelogin.pagesobjects.PreloginStateSelectPage;

public class ApplicationControllerEmailPrelogin {

	public WebDriver driver;
	private PreloginHomeHeaderPage homeHeader;
	private PreloginHomeMiddlePage homeMiddle;
	private PreloginHomeFooterPage homeFooter;
	private PreloginStateSelectPage stateSelect;
	
	private PreloginAvailabilityPricingPage availabilityPricing;
	
	
	
	public ApplicationControllerEmailPrelogin(WebDriver driver) {
		this.driver=driver;
		
		homeHeader = new PreloginHomeHeaderPage(getDriver());
		homeMiddle = new PreloginHomeMiddlePage(getDriver());
		homeFooter = new PreloginHomeFooterPage(getDriver());
		availabilityPricing = new PreloginAvailabilityPricingPage(getDriver());
		stateSelect = new PreloginStateSelectPage(getDriver());
		
	}
	
	
	public WebDriver getDriver(){
		return driver;
	}
	
	public PreloginHomeHeaderPage homeHeader() {

		return homeHeader;
	}
	
	public PreloginHomeMiddlePage homeMiddle() {

		return homeMiddle;
	}
	
	public PreloginHomeFooterPage homeFooter() {

		return homeFooter;
	}
	
	public PreloginAvailabilityPricingPage availabilityPricing() {

		return availabilityPricing;
	}
	public PreloginStateSelectPage stateSelect() {

		return stateSelect;
	}
	


}