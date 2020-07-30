package com.jpay.media.automation.web.facility.pagesobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jpay.media.automation.web.baseobjects.BasePageObject;

public class FacilityHomePage extends BasePageObject{

	
	/************************************************************************************************
	 ******************************************* CONSTRUCTOR*****************************************
	 ************************************************************************************************/

	public FacilityHomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	/***********************************************CONSTRUCTOR****************************************
	 **************************************************************************************************
	 **************************************************************************************************/

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	// Facility System
	@FindBy(xpath = "//span[@id='ctl00_Header_MenuRepeater_ctl00_lblFacility']/b")
	private WebElement facilitySystem;
	
	// Admini Link
	@FindBy(xpath = "//a[contains(text(),'Admin')]")
	private WebElement linkAdmin;
	
	// Supervision Link
	@FindBy(xpath = "//*[contains(text(),'Supervision')]")
	private WebElement linkSupervision;

	// Money
	@FindBy(xpath = "//*[contains(text(),'Money')]")
	private WebElement linkMoney;

	// Communications
	@FindBy(xpath = "//*[contains(text(),'Communications')]")
	private WebElement linkCommunications;
	
	// Mail	
	@FindBy(xpath = "//*[contains(text(),'Mail')]")
	private WebElement linkMail;

	// Video
	@FindBy(xpath = "//*[contains(text(),'Video')]")
	private WebElement linkVideo;

	// Phone
	@FindBy(xpath = "//*[contains(text(),'Phone')]")
	private WebElement linkPhone;
	
	// Release
	@FindBy(xpath = "//*[contains(text(),'Release')]")
	private WebElement linkRelease;


	// Cards	
	@FindBy(xpath = "//*[contains(text(),'Cards')]")
	private WebElement linkCards;
	
	// Sign Out Button
	@FindBy(xpath = "//*[contains(text(),'Sign Out')]")
	private WebElement signoutButton;

	

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	/************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD***********************
	 ************************************************************************************************/



	public void verifyFacilitySystem(String text) {

		assertionText(facilitySystem, text);
	}

	
	public void clickSignOutButton() {

		pause(500);
		click(signoutButton);
		
			try {
				if (getDriver().findElement(By.xpath(".//*[contains(text(),'Error Page')]")).isDisplayed()) {
				
					pause(500);
					jsClick(signoutButton);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	

	public boolean isTabLinkVisible(String linkText){
		
		try {
			
			WebElement element = getDriver().findElement(By.xpath("//*[contains(text(),'"+linkText+"')]"));
			boolean visible = element.isDisplayed();
			return visible;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public void verifyFacilityHeaderTabPresent(String linkText){
		logging("Facility Header Tab - " +linkText+" - is Present : "+isTabLinkVisible(linkText));
		assertTrue(isTabLinkVisible(linkText));
	}
	
	public void verifyFacilityHeaderTabAbsent(String linkText){
		logging("Facility Header Tab - " +linkText+" - is Absent : "+!isTabLinkVisible(linkText));
		assertTrue(!isTabLinkVisible(linkText));
	}
	

	


}
