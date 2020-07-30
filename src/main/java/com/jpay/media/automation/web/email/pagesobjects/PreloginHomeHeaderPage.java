package com.jpay.media.automation.web.email.pagesobjects;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.jpay.media.automation.web.baseobjects.BasePageObject;
import com.jpay.media.automation.web.utilities.Log;

public class PreloginHomeHeaderPage extends BasePageObject{

	public PreloginHomeHeaderPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}


	
	/**********************************************
	 * CONSTRUCTOR****************************************
	 **************************************************************************************************
	 **************************************************************************************************/

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/


	// JPay logo link
	@FindBy(xpath = ".//*[@title='JPay.com']")
	private WebElement jpayLogoLink;
	
	// JPay Twitter link
	@FindBy(xpath = ".//*[@title='JPay on Twitter']")
	private WebElement jpayTwitterLink;
	
	// JPay Facebook link
	@FindBy(xpath = ".//*[@title='JPay on Facebook']")
	private WebElement jpayFacebookLink;
	
	// Inmate Search link
	@FindBy(xpath = ".//*[@id='newHeader_inmateSearchHyperLink']")
	private WebElement inmateSearchLink;
	
	// Prison Search link
	@FindBy(xpath = ".//*[@id='newHeader_HyperLink2']")
	private WebElement prisonSearchLink;
	
	// Help link
	@FindBy(xpath = ".//*[@id='newHeader_HyperLink3']")
	private WebElement helpLink;

	// LogIn Link
	@FindBy(xpath = "//*[@id='newHeader_TopRightNavButton_lnkLogin']")
	private WebElement loginLink;

	// LogIn Button
	@FindBy(xpath = "//*[@id='newHeader_TopRightNavButton_lnkLogin']/div")
	private WebElement loginButton;

	// LogIn Box
	@FindBy(xpath = "//*[@class='loginbox']")
	private WebElement loginBox;

	// Inmate Search Box
	@FindBy(xpath = "//*[@class='find-inmate-form-login']")
	private WebElement inmateSearchBox;

	// Prison Search availability and pricing text
	@FindBy(xpath = "//*[@class='pavail_title_container']/h1")
	private WebElement availabilityPricingText;

	// Prison Search Facility lookup text
	@FindBy(xpath = "//*[@class='pavail_content_text']/h2")
	private WebElement facilityLookupText;

	// Prison Search Facility lookup details text
	@FindBy(xpath = "//*[@class='pavail_content_text']/p")
	private WebElement facilityLookupDetailsText;

	// Jpay Facebook Box
	@FindBy(xpath = "//*[@id='newHeader_sidebarFacebook']")
	private WebElement jpayFacebookBox;

	// Jpay Facebook Box Jpay logo button
	@FindBy(xpath = "//*[@class='_1dro _2ph- clearfix']//a//img")
	private WebElement jpayFacebookBoxJpayLogo;

	// Jpay Facebook Box Jpay Text
	@FindBy(xpath = "//*[@class='_1dro _2ph- clearfix']//a[contains(text(),'JPay')]")
	private WebElement jpayFacebookBoxJpayText;

	// Jpay Facebook Box Like Page
	@FindBy(xpath = "//*[@class='_1dro _2ph- clearfix']//a[contains(text(),'Like Page')]")
	private WebElement jpayFacebookBoxLikePage;

	// Download Jpay App Box
	@FindBy(xpath = "//*[@class='mobile-app-ad']")
	private WebElement downloadJpayAppBox;

	// Download Jpay App Box DOWNLOAD text
	@FindBy(xpath = "//*[@class='mobile-app-ad']/h1")
	private WebElement downloadJpayAppBoxDownloadText;
	
	// Download Jpay App Box Smartphone Text
	@FindBy(xpath = "(//*[@class='mobile-app-ad']/div)[1]")
	private WebElement downloadJpayAppBoxSmartphoneText;
	
	// Download Jpay App Store Button
	@FindBy(xpath = ".//*[@class='mobile-app-ad']//img[@alt='Apple App Store']")
	private WebElement downloadJpayAppStoreButton;
	
	// Download Jpay Google Play Store Button
	@FindBy(xpath = ".//*[@class='mobile-app-ad']//img[@alt='Google Play Store']")
	private WebElement downloadJpayGooglePlayButton;
	

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	/************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD***********************
	 ************************************************************************************************/
	
	
	public void clickHeaderJPayLogoLink(){
		
		logging("Clicking on : JPay logo link.");
		jpayLogoLink.click();
	}
	
	public void verifyJPayLogoLink(){
		
		logging("JPay logo is a link : "+isElementaLink(getTagname(jpayLogoLink)));
		assertTrue(isElementaLink(getTagname(jpayLogoLink)));
	}
	
	public void verifyJPayLogoPresent(){
		
		logging("JPay logo Link is Present : "+isElementDisplayed(jpayLogoLink));
		assertTrue(isElementDisplayed(jpayLogoLink));
	}
	
	public void clickHeaderJPayTwitterLink(){
		
		logging("Clicking on : JPay Twitter link.");
		jpayTwitterLink.click();
	}
	
	public void verifyHeaderJPayTwitterPresent(){
		
		logging("JPay Twitter Link is Present : "+isElementDisplayed(jpayTwitterLink));
		assertTrue(isElementDisplayed(jpayTwitterLink));
	}
	
	public void verifyJPayTwitterLink(){
		
		logging("JPay Twitter is a link : "+isElementaLink(getTagname(jpayTwitterLink)));
		assertTrue(isElementaLink(getTagname(jpayTwitterLink)));
	}
	
	public void clickHeaderJPayFacebookLink(){
		
		logging("Clicking on : JPay Facebook link.");
		jpayFacebookLink.click();
	}
	
	public void verifyJPayFacebookLink(){
		
		logging("JPay Facebook is a link : "+isElementaLink(getTagname(jpayFacebookLink)));
		assertTrue(isElementaLink(getTagname(jpayFacebookLink)));
	}
	
	public void verifyHeaderJPayFacerbookPresent(){
		
		logging("JPay Facebook Link is Present : "+isElementDisplayed(jpayFacebookLink));
		assertTrue(isElementDisplayed(jpayFacebookLink));
	}
	
	public void clickHeaderInmateSearchLink(){
		
		click(inmateSearchLink);
	}
	
	public void verifyInmateSearchLink(){
		
		logging("Inmate Search is a link : "+isElementaLink(getTagname(inmateSearchLink)));
		assertTrue(isElementaLink(getTagname(inmateSearchLink)));
	}
	
	public void verifyHeaderInmateSearchPresent(){
		
		logging("Inmate Search Link is Present : "+isElementDisplayed(inmateSearchLink));
		assertTrue(isElementDisplayed(inmateSearchLink));
	}
	
	public void clickHeaderPrisonSearchLink(){
		
		click(prisonSearchLink);
	}
	
	public void verifyPrisonSearchLink(){
		
		logging("Prison Search is a link : "+isElementaLink(getTagname(prisonSearchLink)));
		assertTrue(isElementaLink(getTagname(prisonSearchLink)));
	}
	
	public void verifyHeaderPrisonSearchPresent(){
		
		logging("Prison Search Link is Present : "+isElementDisplayed(prisonSearchLink));
		assertTrue(isElementDisplayed(prisonSearchLink));
	}
	
	public void verifyStateList(List<String> list){
		
		for (String state : list) {
			
			WebElement element = getDriver().findElement(By.xpath(".//*[@id='AvailabilityAndPricing1_treeViewAll']//"
					+ "td[1]//a//following::td[1]//a[contains(text(),'"+state+"')]"));
			logging(state+" - is present in the state prison list : "+isElementDisplayed(element));
			assertTrue(isElementDisplayed(element));
			
		}
	}
	
	public boolean isStatePresentInMap(WebElement element,String state){
		
		if (element.getAttribute("title").contentEquals(state)) {
			
			return true;
		} else
			return false;
	}
	
	public void verifyStateMapList(List<String> list,String colorCode){
		
		for (String state : list) {
			
			WebElement element = getDriver().findElement(By.xpath(".//map[@id='AvailabilityAndPricing1_UsImageMap1_usmap']//area[@title='"+state+"']"));
			
			logging(state+" - is present in the State Prison Map : "+isStatePresentInMap(element,state));
			assertTrue(isStatePresentInMap(element,state));
			assertionText(state+" -Color ", getTextColor(element), colorCode);
			
		}
	}
	
	public void clickHelpLink(){
		
		click(helpLink);
	}
	
	public void verifyHelpLink(){
		
		logging("Help is a link : "+isElementaLink(getTagname(helpLink)));
		assertTrue(isElementaLink(getTagname(helpLink)));
	}
	
	public void verifyHelpLinkPresent(){
		
		logging("Help Link is Present : "+isElementDisplayed(helpLink));
		assertTrue(isElementDisplayed(helpLink));
	}
	
	public void clickLoginLink(){
		
		logging("Clicking on : Login");
		loginButton.click();
	}
	
	public void verifyLoginLink(){
		
		logging("Login is a link : "+isElementaLink(getTagname(loginLink)));
		assertTrue(isElementaLink(getTagname(loginLink)));
	}
	
	public void verifyHeaderLoginLinkPresent(){
		
		logging("Login Link is Present : "+isElementDisplayed(loginLink));
		assertTrue(isElementDisplayed(loginLink));
	}
	
	public void verifyHeaderLoginLinkAbsent(){
		
		logging("Login Link is Absent : "+ !isElementDisplayed(loginLink));
		assertTrue(!isElementDisplayed(loginLink));
	}
	
	public void verifyLoginBoxPresent(){
		
		logging("Login Box is present : "+isElementDisplayed(loginBox));
		assertTrue(isElementDisplayed(loginBox));
	}
	
	public void verifyInmateSearchBoxPresent(){
		
		logging("Inmate Search Box is present : "+isElementDisplayed(inmateSearchBox));
		assertTrue(isElementDisplayed(inmateSearchBox));
	}
	
	public void verifyPrisonSearchAvailabilityPricingText(String text){
		
		assertionText(availabilityPricingText, text);
	}
	
	public void verifyPrisonSearchFacilityLookupText(String text){
		
		assertionText(facilityLookupText, text);
	}
	
	public void verifyPrisonSearchFacilityLookupDetailsText(String text){
		
		assertionText(facilityLookupDetailsText.getText().trim(), text);
	}
	
	public void verifyJpayFacebookBoxPresent(){
		
		logging("JPay Facebook Box is present : "+isElementDisplayed(jpayFacebookBox));
		assertTrue(isElementDisplayed(jpayFacebookBox));
	}
	
	public void verifyDownloadJpayAppBoxPresent(){
		
		logging("Download JPay App Box is present : "+isElementDisplayed(downloadJpayAppBox));
		assertTrue(isElementDisplayed(downloadJpayAppBox));
	}
	
	public void verifyJPayAppBoxDownloadText(String text){
		
		assertionText(downloadJpayAppBoxDownloadText.getText().trim(), text);
	}
	
	public void verifyJPayAppBoxSmartphoneText(String text){
		
		assertionText(downloadJpayAppBoxSmartphoneText.getText().trim(), text);
	}
	
	public void clickDownloadJpayAppStoreButton(){
		
		logging("Clicking on : Download on the App Store");
		downloadJpayAppStoreButton.click();
	}
	
	public void clickDownloadJpayGooglePlayButton(){
		
		logging("Clicking on : Get It On Google Play");
		downloadJpayGooglePlayButton.click();
	}
	
	public void clickJpayFacebookBoxJpayLogoButton(){
		
		getDriver().switchTo().frame("newHeader_FacebookFrame");
		logging("Clicking on : FacebookBoxJpayLogoButton");
		jpayFacebookBoxJpayLogo.click();
		getDriver().switchTo().defaultContent();
	}
	
	public void clickJpayFacebookBoxJpayTextButton(){
		
		getDriver().switchTo().frame("newHeader_FacebookFrame");
		logging("Clicking on : FacebookBoxJpayTextButton");
		jpayFacebookBoxJpayText.click();
		getDriver().switchTo().defaultContent();
	}
	
	public void clickJpayFacebookBoxJpayLikePageButton(){
		
		getDriver().switchTo().frame("newHeader_FacebookFrame");
		logging("Clicking on : FacebookBoxJpayLikePageButton");
		jpayFacebookBoxLikePage.click();
		getDriver().switchTo().defaultContent();
	}
	
}
