package com.jpay.media.automation.web.staging.pagesobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jpay.media.automation.web.baseobjects.BasePageObject;

public class StagingHomePage extends BasePageObject{

	
	/************************************************************************************************
	 ******************************************* CONSTRUCTOR*****************************************
	 ************************************************************************************************/

	public StagingHomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	/***********************************************CONSTRUCTOR****************************************
	 **************************************************************************************************
	 **************************************************************************************************/

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	
	// Administration
	@FindBy(xpath = "//*[contains(text(),'ADMINISTRATION')]")
	private WebElement linkAdministration;
	
	// Transfers
	@FindBy(xpath = "//*[contains(text(),'TRANSFERS')]")
	private WebElement linkTransfers;

	// Reporting
	@FindBy(xpath = "//*[contains(text(),'REPORTING')]")
	private WebElement linkReportings;

	// Facility System
	@FindBy(xpath = "//*[contains(text(),'FACILITY SYSTEM')]")
	private WebElement linkFacilitySystem;
	
	// SUPPORT OUTBOUND MAIL
	@FindBy(xpath = "//*[contains(text(),'SUPPORT OUTBOUND MAIL')]")
	private WebElement linkSupportOutboundMail;

	// VIDEO VISITS
	@FindBy(xpath = "//*[contains(text(),'VIDEO VISITS')]")
	private WebElement linkVideoVisits;

	// PREPAID
	@FindBy(xpath = "//*[contains(text(),'PREPAID')]")
	private WebElement linkPrepaid;
	
	// MEDIA
	@FindBy(xpath = "//*[contains(text(),'MEDIA')]")
	private WebElement linkMedia;


	// MONEY ORDERS
	@FindBy(xpath = "//*[contains(text(),'MONEY ORDERS')]")
	private WebElement linkMoneyOrders;
	
	// Sign Out Button
	@FindBy(xpath = "//a[contains(text(),'Sign Out')]")
	private WebElement signoutButton;




	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	/************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD***********************
	 ************************************************************************************************/



	public void clickAdministration() {

		pause(1000);
		jsScrollElementToView(linkAdministration);
		click(linkAdministration);
	}
	
	public void clickReporting() {

		click(linkReportings);
	}
	
	public void clickTransfers() {

		click(linkTransfers);
	}
	
	public void clickFacilitySystem() {

		click(linkFacilitySystem);
	}
	
	public void clickSupportOutboundMail() {

		click(linkSupportOutboundMail);
	}
	
	public void clickVideoVisits() {

		click(linkVideoVisits);
	}
	
	public void clickPrepaid() {

		click(linkPrepaid);
	}
	
	public void clickMedia() {

		click(linkMedia);
	}
	
	public void clickMoneyOrders() {

		click(linkMoneyOrders);
	}
	
	public void clickSignOutButton() {
		pause(1000);
		jsScrollElementToView(signoutButton);
		click(signoutButton);
	}
	
	
	


}




