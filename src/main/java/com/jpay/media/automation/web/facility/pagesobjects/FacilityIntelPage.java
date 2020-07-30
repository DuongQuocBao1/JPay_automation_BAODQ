package com.jpay.media.automation.web.facility.pagesobjects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.jpay.media.automation.web.baseobjects.BasePageObject;

public class FacilityIntelPage extends BasePageObject{

	
	/************************************************************************************************
	 ******************************************* CONSTRUCTOR*****************************************
	 ************************************************************************************************/

	public FacilityIntelPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	/***********************************************CONSTRUCTOR****************************************
	 **************************************************************************************************
	 **************************************************************************************************/

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	
	// Intel Link
	@FindBy(xpath = "//a[contains(text(),'Intel')]")
	private WebElement linkIntel;
	
	

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	/************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD***********************
	 ************************************************************************************************/


	public void clickIntelLink() {

		click(linkIntel);
	}
	

	/************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD***********************
	 ************************************************************************************************/
	
	
	
	
	
	
	
	
	/***********************************  SEARCH ELEMENT AND METHOD  ********************************
	 *************************************************************************************************/

	
	// Search Link QA
	@FindBy(xpath = "//*[@ href='Search.aspx?section=8']")
	private WebElement searchLink;
	
	// All Search Checkbox
	@FindBy(xpath = "//*[@id='ctl00_MainContent_checkboxAll']")
	private WebElement sAllCheckbox;
	
	// Mail Search Checkbox
	@FindBy(xpath = "//*[@id='ctl00_MainContent_cblProducts_1']")
	private WebElement sMailCheckbox;
	
	// OutMail Search Checkbox
	@FindBy(xpath = "//*[@id='ctl00_MainContent_cblProducts_2']")
	private WebElement sOutMailCheckbox;
	
	// Select Search By
	@FindBy(xpath = "//select[@id='ctl00_MainContent_ddlsearchby']")
	private WebElement sSelectSearchBy;
	
	// Select search filter by
	@FindBy(xpath = "//select[@id='ctl00_MainContent_ddlsearchfilter']")
	private WebElement sSelectSearchFilterBy;
	
	// Select search Result type
	@FindBy(xpath = "//select[@id='ctl00_MainContent_ddlExportType']")
	private WebElement sSelectSearchResultType;
	
	// Enter Search string input
	@FindBy(xpath = "//*[@id='ctl00_MainContent_searchstring']")
	private WebElement sSearchStringInput;
	
	// Search search button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_btnSubmit']")
	private WebElement sSearchButton;
	
	// Search Show Older Records Checkbox
	@FindBy(xpath = "//*[@id='ctl00_MainContent_cbShowOlderTransfers']")
	private WebElement sShowOlderRecordsCheckbox;
	
	// Search Money Search Inmate id
	@FindBy(xpath = "//*[@id='ctl00_MainContent_dgvMoney_ctl02_lnkBtnInmateSearchInmateIdMoney']")
	private WebElement sMoneySearchInmateId;
	
	// Search Money Search Recipient name
	@FindBy(xpath = "//*[@id='ctl00_MainContent_dgvMoney_ctl02_lnkBtnInmateSearchCustomerNameMoney']")
	private WebElement sMoneySearchRecipientName;
	
	// Search Money Search Agency
	@FindBy(xpath = "(//*[@id='ctl00_MainContent_dgvMoney']//tr[2]//td[3])[1]")
	private WebElement sMoneySearchAgency;
	
	// Search Money Search Facility Location
	@FindBy(xpath = "(//*[@id='ctl00_MainContent_dgvMoney']//tr[2]//td[4])[1]")
	private WebElement sMoneySearchFacilityLocation;

	// Search InMail Search Inmate id By Inmate
	@FindBy(xpath = "//*[@id='ctl00_MainContent_dgvInmateSearchResults_ctl02_lnkBtnMailInInmateId']")
	private WebElement sInmailSearchInmateIdByInmate;

	// Search InMail Search Recipient name By Inmate
	@FindBy(xpath = "//*[@id='ctl00_MainContent_dgvInmateSearchResults_ctl02_lnkBtnInmateSearchCustomerNameIn']")
	private WebElement sInmailSearchInmateNameByInmate;
	
	// Search InMail Search Agency By Inmate
	@FindBy(xpath = "(//*[@id='ctl00_MainContent_dgvInmateSearchResults']//tr[2]//td[4])[1]")
	private WebElement sInmailSearchAgencyByInmate;
	
	// Search InMail Search Facility Location By Inmate
	@FindBy(xpath = "(//*[@id='ctl00_MainContent_dgvInmateSearchResults']//tr[2]//td[5])[1]")
	private WebElement sInmailSearchFacilityLocationByInmate;
	
	// Search InMail Search Total Letters sent By Inmate
	@FindBy(xpath = "(//*[@id='ctl00_MainContent_dgvInmateSearchResults']//tr[2]//td[6])[1]")
	private WebElement sInmailTotalLettersSentByInmate;
	
	// Search InMail Search Num of Unique Senders By Inmate
	@FindBy(xpath = "(//*[@id='ctl00_MainContent_dgvInmateSearchResults']//tr[2]//td[7])[1]")
	private WebElement sInmailSearchNumOfUniqueSendersByInmate;

	// Search InMail Search Customer id By Customer
	@FindBy(xpath = "//*[@id='ctl00_MainContent_dgvSenderDetails_ctl02_lnkBtnViewSenderDetailsId']")
	private WebElement sInmailSearchCustomerIdByCustomer;

	// Search InMail Search Customer name By Customer
	@FindBy(xpath = "//*[@id='ctl00_MainContent_dgvSenderDetails_ctl02_lnkBtnViewSenderDetailsName']")
	private WebElement sInmailSearchCustomerNameByCustomer;
	
	// Search InMail Search Total Letters sent By Customer
	@FindBy(xpath = "//*[@id='ctl00_MainContent_dgvSenderDetails_ctl02_lblSenderDetailTotal']")
	private WebElement sInmailTotalLettersSentByCustomer;

	// Search OutMail Search Inmate id By Inmate
	@FindBy(xpath = "//*[@id='ctl00_MainContent_dgvInmateSearchResultsRecipient_ctl02_lnkBtnMailOutInmateId']")
	private WebElement sOutmailSearchInmateIdByInmate;

	// Search OutMail Search Inmate name By Inmate
	@FindBy(xpath = "//*[@id='ctl00_MainContent_dgvInmateSearchResultsRecipient_ctl02_lnkBtnInmateSearchGridRecipientName']")
	private WebElement sOutmailSearchInmateNameByInmate;
	
	// Search OutMail Search Agency By Inmate
	@FindBy(xpath = "(//*[@id='ctl00_MainContent_dgvInmateSearchResultsRecipient']//tr[2]//td[4])[1]")
	private WebElement sOutmailSearchAgencyByInmate;
	
	// Search OutMail Search Facility Location By Inmate
	@FindBy(xpath = "(//*[@id='ctl00_MainContent_dgvInmateSearchResultsRecipient']//tr[2]//td[5])[1]")
	private WebElement sOutmailSearchFacilityLocationByInmate;
	
	// Search OutMail Search Total Letters sent By Inmate
	@FindBy(xpath = "(//*[@id='ctl00_MainContent_dgvInmateSearchResultsRecipient']//tr[2]//td[6])[1]")
	private WebElement sOutmailTotalLettersSentByInmate;
	
	// Search OutMail Search Num of Unique Senders By Inmate
	@FindBy(xpath = "(//*[@id='ctl00_MainContent_dgvInmateSearchResultsRecipient']//tr[2]//td[7])[1]")
	private WebElement sOutmailSearchNumOfUniqueSendersByInmate;

	// Search OutMail Search Customer id By Customer
	@FindBy(xpath = "//*[@id='ctl00_MainContent_dgvRecipientDetails_ctl02_lnkBtnViewRecipientDetailsId']")
	private WebElement sOutmailSearchCustomerIdByCustomer;

	// Search OutMail Search Customer name By Customer
	@FindBy(xpath = "//*[@id='ctl00_MainContent_dgvRecipientDetails_ctl02_lnkBtnViewRecipientDetailsName']")
	private WebElement sOutmailSearchCustomerNameByCustomer;
	
	// Search OutMail Search Total Letters sent By Customer
	@FindBy(xpath = "//*[@id='ctl00_MainContent_dgvRecipientDetails_ctl02_lnkBtnViewRecipientDetailsName']//following::td[1]")
	private WebElement sOutmailTotalLettersSentByCustomer;
	
	// Search InMail Search View Button By Customer
	@FindBy(xpath = "//*[@id='ctl00_MainContent_dgvSenderDetails_ctl02_lnkBtnViewIn']")
	private WebElement sInmailViewButtonByCustomer;
	
	// Search OutMail Search View Button By Customer
	@FindBy(xpath = "//*[@id='ctl00_MainContent_dgvRecipientDetails_ctl02_lnkBtnViewOut']")
	private WebElement sOutmailViewButtonByCustomer;
	
	// Search enter to date input for print
	@FindBy(xpath = "//*[@id='ctl00_MainContent_txtExportTo']")
	private WebElement sToDateInputs;
	
	// Search enter From date input for print
	@FindBy(xpath = "//*[@id='ctl00_MainContent_txtExportFrom']")
	private WebElement sFromDateInputs;
	
	// Search Export Button to print
	@FindBy(xpath = "//*[@id='ctl00_MainContent_btnExport']")
	private WebElement sExportButtonToPrint;
	
	// Search Outmail Search Result By Customer verify
	@FindBy(xpath = "//*[@id='ctl00_MainContent_RecordCountRecipient']")
	private WebElement sOutmailSearchResultByCustomer;
	
	// Search Inmail Search Result By Customer verify
	@FindBy(xpath = "//*[@id='ctl00_MainContent_RecordCount']")
	private WebElement sInmailSearchResultByCustomer;
	
	// Search Error Message
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_Requiredfieldvalidator4']//font")
	private WebElement sErrorMessage;

	
	
	//*************************************************************************************************//

	
	

	public void clickSearchLink(String env) {

        	click(searchLink);
	}
	
	public void checkSAllCheckbox(){
		
		logging("Checking on : All checkbox.");
		pressSpace(sAllCheckbox);
	}
	
	public void checkSMailCheckbox(){
		
		logging("Checking on : Mail checkbox.");
		pressSpace(sMailCheckbox);
	}
	
	public void checkSOutMailCheckbox(){
		
		logging("Checking on : OutMail checkbox.");
		pressSpace(sOutMailCheckbox);
	}
	
	public void selectSSearchBy(String by){
		
		logging("Searching By : "+by);
		selectElementByVisibleText(sSelectSearchBy, by);
	}
	
	public void selectSSearchFilterBy(String filter){
		
		logging("Searching Filter By : "+filter);
		selectElementByVisibleText(sSelectSearchFilterBy, filter);
	}
	
	public void selectSResultTypes(String type){
		
		logging("Selecting Result types : "+type);
		selectElementByVisibleText(sSelectSearchResultType, type);
	}
	
	public void enterSSearchString(String string){
		
		setText(sSearchStringInput, string);
	}

	public void clickSSearchButton() {

		logging("Clicking on : Search ");
		sSearchButton.click();
	}
	
	public void checkSShowOlderRecordsCheckbox(){
		
		logging("Checking on : ShowOlderRecords checkbox.");
		pressSpace(sShowOlderRecordsCheckbox);
	}
	
	
	//-------------------Money---------------------------------//
	
	public void verifySMoneySearchInmateId(String inmateid){
		
		if (isElementDisplayed(sMoneySearchInmateId)) {
			WebElement element =getDriver().findElement(By.xpath(".//*[@id='ctl00_MainContent_dgvMoney']//tr//a[contains(text(),'"+inmateid+"')]"));
			assertionText("Money Search Inmate Id :: ", element, inmateid);
		} else {

			logging("Money Search Inmate Id :: No Results to Show.");
		}
		
	}
	
	public void verifySMoneySearchRecipientName(String name){
		
		if (isElementDisplayed(sMoneySearchRecipientName)) {
			WebElement element =getDriver().findElement(By.xpath(".//*[@id='ctl00_MainContent_dgvMoney']//tr//a[contains(text(),'"+name+"')]"));
			assertionText("Money Search RecipientName :: ", element, name);
		} else {

			logging("Money Search RecipientName :: No Results to Show.");
		}
		
	}
	
	public void verifySMoneySearchAgency(String inmateid,String agency){
		
		if (isElementDisplayed(sMoneySearchAgency)) {
			WebElement element =getDriver().findElement(By.xpath(".//*[@id='ctl00_MainContent_dgvMoney']//tr//a[contains(text(),'"+inmateid+"')]/following::td[2]"));
			assertionText("Money Search Agency :: ", element, agency);
		} else {

			logging("Money Search Agency :: No Results to Show.");
		}
		
	}
	
	public void verifySMoneySearchAgency(String agency){
		
		if (isElementDisplayed(sMoneySearchAgency)) {
			
			assertionText("Money Search Agency :: ", sMoneySearchAgency, agency);
		} else {

			logging("Money Search Agency :: No Results to Show.");
		}
		
	}
	
	public void verifySMoneySearchFacilityLocation(String inmateid,String location){
		
		if (isElementDisplayed(sMoneySearchFacilityLocation)) {
			WebElement element =getDriver().findElement(By.xpath(".//*[@id='ctl00_MainContent_dgvMoney']//tr//a[contains(text(),'"+inmateid+"')]/following::td[3]"));
			assertionText("Money Search FacilityLocation :: ", element, location);
		} else {

			logging("Money Search FacilityLocation :: No Results to Show.");
		}
		
	}
	
	public void verifySMoneySearchFacilityLocation(String location){
		
		if (isElementDisplayed(sMoneySearchFacilityLocation)) {
			
			assertionText("Money Search FacilityLocation :: ", sMoneySearchFacilityLocation, location);
		} else {

			logging("Money Search FacilityLocation :: No Results to Show.");
		}
		
	}
	
	
	//-------------------In Mail By Inmate-------------------------------//
	
	
	public void verifySInMailSearchInmateIdByInmate(String inmateid){
		
		if (isElementDisplayed(sInmailSearchInmateIdByInmate)) {
			
			assertionText("In Mail Search Inmate Id :: ", sInmailSearchInmateIdByInmate, inmateid);
		} else {

			logging("In Mail Search Inmate Id :: No Results to Show.");
		}
		
	}
	
	public void verifySInMailSearchInmateNameByInmate(String name){
		
		if (isElementDisplayed(sInmailSearchInmateNameByInmate)) {
			
			assertionText("In Mail Search InmateName :: ", sInmailSearchInmateNameByInmate, name);
		} else {

			logging("In Mail Search InmateName :: No Results to Show.");
		}
		
	}
	
	public void verifySInmailSearchAgencyByInmate(String agency){
		
		if (isElementDisplayed(sInmailSearchAgencyByInmate)) {
			
			assertionText("In Mail Search Agency :: ", sInmailSearchAgencyByInmate, agency);
		} else {

			logging("In Mail Search Agency :: No Results to Show.");
		}
		
	}
	
	public void verifySInmailSearchFacilityLocationByInmate(String location){
		
		if (isElementDisplayed(sInmailSearchFacilityLocationByInmate)) {
			
			assertionText("In Mail Search FacilityLocation :: ", sInmailSearchFacilityLocationByInmate, location);
		} else {

			logging("In Mail Search FacilityLocation :: No Results to Show.");
		}
		
	}
	
	public void verifySInMailSearchTotalLettersSentByInmate(){
		
		try {
			pause(2000);
			logging("InMail Search Total Letters Sent is Present : "+isElementDisplayed(sInmailTotalLettersSentByInmate));
			logging("InMail Search Total Letters : "+sInmailTotalLettersSentByInmate.getText());
			assertTrue(isElementDisplayed(sInmailTotalLettersSentByInmate));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void verifySInMailSearchNumOfUniqueSendersByInmate(){
		
		try {
			logging("InMail Search Num of Unique Seender is Present : "+isElementDisplayed(sInmailSearchNumOfUniqueSendersByInmate));
			logging("InMail Search Num of Unique Seender : "+sInmailSearchNumOfUniqueSendersByInmate.getText());
			assertTrue(isElementDisplayed(sInmailSearchNumOfUniqueSendersByInmate));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	//-------------------In Mail By Customer-------------------------------//
	

	public void verifySInMailSearchCustomerIdByCustomer(String customerId){
		
		if (isElementDisplayed(sInmailSearchCustomerIdByCustomer)) {
			WebElement element =getDriver().findElement(By.xpath(".//*[@id='ctl00_MainContent_dgvSenderDetails']//tr//a[contains(text(),'"+customerId+"')]"));
			assertionText("In Mail Search CustomerId :: ", element, customerId);
		} else {

			logging("In Mail Search CustomerId :: No Results to Show.");
		}
		
	}
	
	public void verifySInMailSearchCustomerNameByCustomer(String name){
		WebElement element = null;
		String newString = name.split(" ")[0]+"  "+name.split(" ")[1];
		if (isElementDisplayed(sInmailSearchCustomerNameByCustomer)) {
			try {
				if (getDriver().findElement(By.xpath(".//*[@id='ctl00_MainContent_dgvSenderDetails']//tr//a[contains(text(),'"+name+"')]")).isDisplayed()) {
					element =getDriver().findElement(By.xpath(".//*[@id='ctl00_MainContent_dgvSenderDetails']//tr//a[contains(text(),'"+name+"')]"));
				} 
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (getDriver().findElement(By.xpath(".//*[@id='ctl00_MainContent_dgvSenderDetails']//tr//a[contains(text(),'"+newString+"')]")).isDisplayed()) {
					element =getDriver().findElement(By.xpath(".//*[@id='ctl00_MainContent_dgvSenderDetails']//tr//a[contains(text(),'"+newString +"')]"));
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(element.getText());
			assertionText("In Mail Search CustomerName :: ", element, name);
		} else {

			logging("In Mail Search CustomerName :: No Results to Show.");
		}
		
	}
	
	public void verifySInMailSearchTotalLettersSentByCustomer(){
		try {
			wait.until(ExpectedConditions.visibilityOf(sInmailTotalLettersSentByCustomer));
			logging("InMail Search Total Letters Sent is Present : "+isElementDisplayed(sInmailTotalLettersSentByCustomer));
			logging("InMail Search Total Letters : "+sInmailTotalLettersSentByCustomer.getText());
			assertTrue(isElementDisplayed(sInmailTotalLettersSentByCustomer));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public void verifySInMailSearchTotalLettersSentByCustomer(String customerId){
		WebElement element =getDriver().findElement(By.xpath(".//*[@id='ctl00_MainContent_dgvSenderDetails']//tr//a[contains(text(),'"+customerId+"')]/following::td[2]"));
		logging("InMail Search Total Letters Sent is Present : "+isElementDisplayed(element));
		logging("InMail Search Total Letters : "+element.getText());
		assertTrue(isElementDisplayed(element));
	}

	
	
	//-------------------Out Mail By Inmate-------------------------------//
	


	public void verifySOutMailSearchInmateIdByInmate(String inmateid){
		
		if (isElementDisplayed(sOutmailSearchInmateIdByInmate)) {
			
			assertionText("Out Mail Search Inmate Id :: ", sOutmailSearchInmateIdByInmate, inmateid);
		} else {

			logging("Out Mail Search Inmate Id :: No Results to Show.");
		}
		
	}
		
	public void verifySOutmailSearchRecipientNameByInmate(String name){
		
		if (isElementDisplayed(sOutmailSearchInmateNameByInmate)) {
			
			assertionText("Out Mail Search RecipientName :: ", sOutmailSearchInmateNameByInmate, name);
		} else {

			logging("Out Mail Search RecipientName :: No Results to Show.");
		}
		
	}
	
	public void verifySOutMailSearchAgencyByInmate(String agency){
		
		if (isElementDisplayed(sOutmailSearchAgencyByInmate)) {
			
			assertionText("Out Mail Search Agency :: ", sOutmailSearchAgencyByInmate, agency);
		} else {

			logging("Out Mail Search Agency :: No Results to Show.");
		}
		
	}
	
	public void verifySOutMailSearchFacilityLocationByInmate(String location){
		
		if (isElementDisplayed(sOutmailSearchFacilityLocationByInmate)) {
			
			assertionText("Out Mail Search FacilityLocation :: ", sOutmailSearchFacilityLocationByInmate, location);
		} else {

			logging("Out Mail Search FacilityLocation :: No Results to Show.");
		}
		
	}
	
	public void verifySOutMailSearchTotalLettersSentByInmate(){
		
		try {
			pause(2000);
			logging("OutMail Search Total Letters Sent is Present : "+isElementDisplayed(sOutmailTotalLettersSentByInmate));
			logging("OutMail Search Total Letters : "+sOutmailTotalLettersSentByInmate.getText());
			assertTrue(isElementDisplayed(sOutmailTotalLettersSentByInmate));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void verifySOutMailSearchNumOfUniqueSendersByInmate(){
		
		logging("OutMail Search Num of Unique Seender is Present : "+isElementDisplayed(sOutmailSearchNumOfUniqueSendersByInmate));
		logging("OutMail Search Num of Unique Seender : "+sOutmailSearchNumOfUniqueSendersByInmate.getText());
		assertTrue(isElementDisplayed(sOutmailSearchNumOfUniqueSendersByInmate));
	}
	
	public void ClickSInMailViewButtonByCustomer(){
		
		click(sInmailViewButtonByCustomer);
	}
	
	
	public void verifySInMailSearchResultByCustomerPresent(){
		
		logging("InMail Search Result is Present : "+isElementDisplayed(sInmailSearchResultByCustomer));
		logging("InMail Search Result : "+sInmailSearchResultByCustomer.getText());
		assertTrue(isElementDisplayed(sInmailSearchResultByCustomer));
	}

	
	//-------------------Out Mail By Customer-------------------------------//
	
	
	public void verifySOutMailSearchCustomerIdByCustomer(String customerId){
		
		
		if (isElementDisplayed(sOutmailSearchCustomerIdByCustomer)) {
			if (getDriver().findElement(By.xpath(".//*[@id='ctl00_MainContent_dgvRecipientDetails']//tr//a[contains(text(),'"+customerId+"')]")).isDisplayed()) {
				WebElement element =getDriver().findElement(By.xpath(".//*[@id='ctl00_MainContent_dgvRecipientDetails']//tr//a[contains(text(),'"+customerId+"')]"));
			
			assertionText("Out Mail Search CustomerId :: ", element, customerId);
		} else 

			logging("Out Mail Search CustomerId :: No Results to Show.");
		
		
	}
	}
	public void verifySOutMailSearchCustomerNameByCustomer(String name){
		
		WebElement element = null ;
		String newString = name.split(" ")[0]+"  "+name.split(" ")[1];
		if (isElementDisplayed(sOutmailSearchCustomerNameByCustomer)) {
			try {
				if (getDriver().findElement(By.xpath(".//*[@id='ctl00_MainContent_dgvRecipientDetails']//tr//a[contains(text(),'"+name+"')]")).isDisplayed()) {
					element =getDriver().findElement(By.xpath(".//*[@id='ctl00_MainContent_dgvRecipientDetails']//tr//a[contains(text(),'"+name+"')]"));
				} 
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (getDriver().findElement(By.xpath(".//*[@id='ctl00_MainContent_dgvRecipientDetails']//tr//a[contains(text(),'"+newString+"')]")).isDisplayed()) {
					element =getDriver().findElement(By.xpath(".//*[@id='ctl00_MainContent_dgvRecipientDetails']//tr//a[contains(text(),'"+newString+"')]"));
				} 
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			assertionText("Out Mail Search CustomerName :: ", element, name);
		} else {

			logging("Out Mail Search CustomerName :: No Results to Show.");
		}
		
	}
	
	public void verifySOutMailSearchTotalLettersSentByCustomer(){
		
		try {
			logging("OutMail Search Total Letters Sent is Present : "+isElementDisplayed(sOutmailTotalLettersSentByCustomer));
			logging("OutMail Search Total Letters : "+sOutmailTotalLettersSentByCustomer.getText());
			assertTrue(isElementDisplayed(sOutmailTotalLettersSentByCustomer));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void ClickSOutMailViewButtonByCustomer(){
		
		click(sOutmailViewButtonByCustomer);
	}
	
	public void verifySOutMailSearchResultByCustomerPresent(){
		
		logging("OutMail Search Result is Present : "+isElementDisplayed(sOutmailSearchResultByCustomer));
		logging("OutMail Search Result : "+sOutmailSearchResultByCustomer.getText());
		assertTrue(isElementDisplayed(sOutmailSearchResultByCustomer));
	}

	public void enterSDatesToPrintReport(){
		
		String toDate="";
		String fromDate="";
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		toDate=dateFormat.format(date);
		
		fromDate=toDate.split("/")[0]+"/"+toDate.split("/")[1]+"/"+Integer.toString(Integer.parseInt(toDate.split("/")[2])-3);
		setText(sFromDateInputs, fromDate);
		setText(sToDateInputs, toDate);
		
	}
	
	public void clickSExportButton(){
		
		logging("Clicking on : Export");
		click(sExportButtonToPrint);
	}
	
	public void verifySSearchErrorMessage(String msg){
		
		assertionText("Error Message ::", sErrorMessage, msg);
	}
	

	/***********************************  SEARCH ELEMENT AND METHOD  ********************************
	 *************************************************************************************************/

	
	
	
	
	
	
	/******************************  INMATE FILTER SYSTEM ELEMENT AND METHOD  **************************
	 *************************************************************************************************/

	
	// Inmate Filter System Link
	@FindBy(xpath = "//*[@href='BlockingInmates.aspx']")
	private WebElement inmateFilterSystemLink;
	
	// Inmate Filter System Header Text
	@FindBy(xpath = "(//*[@id='ctl00_MainContent_lbl_headertitle']//b)[1]")
	private WebElement inmateFilterSystemHeaderText;
	
	// Inmate Filter System Add Link
	@FindBy(xpath = "//a[@id='ctl00_MainContent_Linkbutton2']")
	private WebElement ifsAddLink;
	
	// Inmate Filter System Search Link
	@FindBy(xpath = "//a[@id='ctl00_MainContent_Linkbutton3']")
	private WebElement ifsSearchLink;
	
	// Inmate Filter System Add Inmate Button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_btn_block']")
	private WebElement ifsAddInmateButton;
	
	// Inmate Filter System Add Inmate Back Button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_pMoneyWatchList']/following::table//a")
	private WebElement ifsAddInmateBackButton;
	
	// Inmate Filter System Empty Inmate Id Error message
	@FindBy(xpath = "//*[@id='ctl00_MainContent_Requiredfieldvalidator_inmateID']//font")
	private WebElement ifsEmptyInmateIdErrorMessage;
	
	// Inmate Filter System Empty Inmate Name Error message
	@FindBy(xpath = "//*[@id='ctl00_MainContent_Requiredfieldvalidator_inmateLN']//font")
	private WebElement ifsEmptyInmateNameErrorMessage;
	
	// Inmate Filter System Enter Inmate id input
	@FindBy(xpath = "//*[@id='ctl00_MainContent_InmateID']")
	private WebElement ifsInmateIdInput;
	
	// Inmate Filter System Enter Inmate name input
	@FindBy(xpath = "//*[@id='ctl00_MainContent_InmateLN']")
	private WebElement ifsInmateNameInput;
	
	// Inmate Filter System Mail Watch List Enable Checkbox
	@FindBy(xpath = "//*[@id='ctl00_MainContent_cbMailWatchEnable']")
	private WebElement ifsMailWatchListEnableCheckbox;
	
	// Inmate Filter System Money Watch List Enable Checkbox
	@FindBy(xpath = "//*[@id='ctl00_MainContent_cbMoneyWatchEnable']")
	private WebElement ifsMoneyWatchListEnableCheckbox;
	
	// Inmate Filter System Mail Watch List Reason input
	@FindBy(xpath = "//*[@id='ctl00_MainContent_reason']")
	private WebElement ifsMailWatchListReasonInput;
	
	// Inmate Filter System Money Watch List Reason input
	@FindBy(xpath = "//*[@id='ctl00_MainContent_tbWatchMoneyReason']")
	private WebElement ifsMoneyWatchListReasonInput;
	
	// Inmate Filter System Add Success Message
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lbl_displaymessage']")
	private WebElement ifsAddSuccessMessage;
	
	// Inmate Filter System Select Search By
	@FindBy(xpath = "//*[@id='ctl00_MainContent_searchfilter']")
	private WebElement ifsSearchBy;
	
	// Inmate Filter System Search staring input
	@FindBy(xpath = "//*[@id='ctl00_MainContent_searchstring']")
	private WebElement ifsSearchStringInput;
	
	// Inmate Filter System Search Go Button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_btnSubmit']")
	private WebElement ifsSearchGoButton;
	
	// Inmate Filter System Search Record found text verify
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_RecordCountDictionary']//font")
	private WebElement ifsRecordFoundText;
	
	// Inmate Filter System Empty Search Error message
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_Requiredfieldvalidator4']//font")
	private WebElement ifsEmptySearchErrorMsg;
	
	// Inmate Filter System Search Inmate name verify
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_MyDataGridSearchDictionary']//tr[2]/td[1]")
	private WebElement ifsSearchInmateName;
	
	// Inmate Filter System Search Inmate id verify
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_MyDataGridSearchDictionary']//tr[2]/td[2]")
	private WebElement ifsSearchInmateId;
	
	// Inmate Filter System Search Mail Watch list status
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_MyDataGridSearchDictionary']//tr[2]/td[3]//a")
	private WebElement ifsSearchMailWatchListStatus;
	
	// Inmate Filter System Search Money Watch list status
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_MyDataGridSearchDictionary']//tr[2]/td[5]//a")
	private WebElement ifsSearchMoneyWatchListStatus;
	
	// Inmate Filter System Search Mail Watch list status reason input
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_MyDataList_ViewUniqueInmate_ctl00_reason']")
	private WebElement sfsMailWatchListStatusReason;
	
	// Inmate Filter System Search Mail Watch list inactive radio button
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_MyDataList_ViewUniqueInmate_ctl00_chb_status_1']")
	private WebElement sfsMailWatchListInactiveRadioButon;
	
	// Inmate Filter System Search Mail Watch list update status button
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_MyDataList_ViewUniqueInmate_ctl00_Button2']")
	private WebElement sfsMailWatchListUpdateStatusButton;
	
	// Inmate Filter System Search Money Watch list status reason input
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_dlMoneyUpdate_ctl00_tbWatchMoneyUpdateReason']")
	private WebElement sfsMoneyWatchListStatusReason;
	
	// Inmate Filter System Search Money Watch list inactive radio button
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_dlMoneyUpdate_ctl00_rblWatchMoneyUpdateStatus_1']")
	private WebElement sfsMoneyWatchListInactiveRadioButon;
	
	// Inmate Filter System Search Mail Watch list update status button
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_dlMoneyUpdate_ctl00_btnWatchMoneyUpdate']")
	private WebElement sfsMoneyWatchListUpdateStatusButton;
	
	// Inmate Filter System Destination mail bucket select
	@FindBy(xpath = ".//select[@id='ctl00_MainContent_ddlDestinationBucket']")
	private WebElement sfsSelectDestinationMailBucket;
	
	
	
	
	//*************************************************************************************************//

	
	

	public void clickInmateFilterSystemLink() {

		click(inmateFilterSystemLink);
	}
	
	public void verifyInmateFilterSystemHeaderText(String text){
		
		assertionText("Header Text :: ", inmateFilterSystemHeaderText, text);
	}
	
	public void clickIFSAddLink() {

		click(ifsAddLink);
	}
	
	public void clickIFSSearchLink() {

		click(ifsSearchLink);
	}
	
	public void clickIFSAddInmateButton() {

		logging("Clicking on : "+ifsAddInmateButton.getAttribute("value")); 
		ifsAddInmateButton.click();;
	}
	
	public void clickIFSAddInmateBackButton() {

		logging("Clicking on : "+ifsAddInmateBackButton.getAttribute("value")); 
		ifsAddInmateBackButton.click();;
	}
	
	public void verifyIFSEmptyInmateIdErrorMessage(String text){
		
		assertionText("EmptyInmateId :: ", ifsEmptyInmateIdErrorMessage, text);
	}
	
	public void verifyIFSEmptyInmateNameErrorMessage(String text){
		
		assertionText("EmptyInmateName :: ", ifsEmptyInmateNameErrorMessage, text);
	}
	
	public void enterIFSInmateID(String inmateId){
		
		setText(ifsInmateIdInput, inmateId);
	}
	
	public void enterIFSInmateName(String inmateName){
		
		setText(ifsInmateNameInput, inmateName);
	}
	
	public void selectIFSDestinationMailBucket(String mailBucket){
		
		logging("Selecting MailBucket : "+ mailBucket);
		selectElementByVisibleText(ifsSelectDestinationMailBucket, mailBucket);
	}
	
	public void checkIFSMailWatchListEnable(){
		
		logging("Checking on : MailWatchListEnable checkbox.");
		pressSpace(ifsMailWatchListEnableCheckbox);
		
	}
	
	public void checkIFSMoneyWatchListEnable(){
		
		logging("Checking on : MoneyWatchListEnable checkbox.");
		pressSpace(ifsMoneyWatchListEnableCheckbox);
		
	}
	
	public void enterIFSMailWatchListReason(String reason){
		
		setText(ifsMailWatchListReasonInput, reason);
	}
	
	public void enterIFSMoneyWatchListReason(String reason){
		
		setText(ifsMoneyWatchListReasonInput, reason);
	}
	
	public void verifyIFSAddSuccessMessage(String text){
		
		assertionText("AddSuccessMessage :: ", ifsAddSuccessMessage, text);
	}
	
	public void selectIFSSearchBy(String searchBy){
		
		logging("Searching By : "+searchBy);
		selectElementByVisibleText(ifsSearchBy, searchBy);
	}
	
	public void enterIFSSearchString(String string){
		
		setText(ifsSearchStringInput, string);
	}
	
	public void clickIFSSearchGoButton() {

		logging("Clicking on : "+ifsSearchGoButton.getAttribute("value")); 
		ifsSearchGoButton.click();;
	}
	
	public void verifyIFSSearchRecordFoundText(String text){
		
		assertionText("RecordFoundText :: ", ifsRecordFoundText, text);
	}
	
	public void verifyIFSEmptySearchErrorMsg(String text){
		
		assertionText("EmptySearchErrorMsg :: ", ifsEmptySearchErrorMsg, text);
	}
	
	public void verifyIFSSearchInmateName(String text){
		
		assertionText("InmateName :: ", ifsSearchInmateName, text);
	}
	
	public void verifyIFSSearchInmateId(String text){
		
		assertionText("InmateId :: ", ifsSearchInmateId, text);
	}
	
	public void verifyIFSSearchMailWatchListStatus(String text){
		
		assertionText("MailWatchListStatus :: ", ifsSearchMailWatchListStatus, text);
	}
	
	public void verifyIFSSearchMoneyWatchListStatus(String text){
		
		assertionText("MoneyWatchListStatus :: ", ifsSearchMoneyWatchListStatus, text);
	}
	
	public void clickIFSSearchMailWatchListStatus(){
		
		click(ifsSearchMailWatchListStatus);
	}
	
	public void clickIFSSearchMoneyWatchListStatus(){
		
		click(ifsSearchMoneyWatchListStatus);
	}
	
	public void enterIFSSearchMailWatchListStatusReason(String reason){
		
		setText(ifsMailWatchListStatusReason, reason);
	}
	
	public void enterIFSSearchMoneyWatchListStatusReason(String reason){
		
		setText(ifsMoneyWatchListStatusReason, reason);
	}
	
	public void clickIFSSearchMailWatchListInactiveRadioButton(){
		
		logging("Clicking on : Inactive radio button of Mail watch list.");
		click(ifsMailWatchListInactiveRadioButon);
	}
	
	public void clickIFSSearchMoneyWatchListInactiveRadioButton(){
		
		logging("Clicking on : Inactive radio button of Money watch list.");
		ifsMoneyWatchListInactiveRadioButon.click();
	}
	
	public void clickIFSSearchMailWatchListStatusUpdateButton() {

		logging("Clicking on : "+ifsMailWatchListUpdateStatusButton.getAttribute("value")); 
		ifsMailWatchListUpdateStatusButton.click();;
	}
	
	
	public void clickIFSSearchMoneyWatchListStatusUpdateButton() {

		logging("Clicking on : "+ifsMoneyWatchListUpdateStatusButton.getAttribute("value")); 
		ifsMoneyWatchListUpdateStatusButton.click();;
	}
	
	
	
	


	/*******************************  INMATE FILTER SYSTEM ELEMENT AND METHOD  **************************
	 *************************************************************************************************/

	
	
	
	
	
	
	
	/******************************  SENDER FILTER SYSTEM ELEMENT AND METHOD  **************************
	 *************************************************************************************************/

	
	// SENDER Filter System Link
	@FindBy(xpath = "//*[@href='BlockingSenders.aspx']")
	private WebElement senderFilterSystemLink;
	
	// SENDER Filter System Header Text
	@FindBy(xpath = "(//*[@id='ctl00_MainContent_lbl_headertitle']//b)[1]")
	private WebElement senderFilterSystemHeaderText;
	
	// SENDER Filter System Add Link
	@FindBy(xpath = "//a[@id='ctl00_MainContent_Linkbutton2']")
	private WebElement sfsAddLink;
	
	// SENDER Filter System Search Link
	@FindBy(xpath = "//a[@id='ctl00_MainContent_Linkbutton3']")
	private WebElement sfsSearchLink;
	
	// Sender Filter System Add Customer Button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_btn_block']")
	private WebElement sfsAddCustomerButton;
	
	// Sender Filter System Empty Account Id Error message
	@FindBy(xpath = "//*[@id='ctl00_MainContent_Requiredfieldvalidator_inmateID']//font")
	private WebElement sfsEmptyAccountIdErrorMessage;
	
	// Sender Filter System Empty Last Name Error message
	@FindBy(xpath = "//*[@id='ctl00_MainContent_Requiredfieldvalidator_inmateLN']//font")
	private WebElement sfsEmptyLastNameErrorMessage;
	
	// Sender Filter System Enter Account id input
	@FindBy(xpath = "//*[@id='ctl00_MainContent_InmateID']")
	private WebElement sfsAccountIdInput;
	
	// Sender Filter System Enter Inmate name input
	@FindBy(xpath = "//*[@id='ctl00_MainContent_InmateLN']")
	private WebElement sfsLastNameInput;
	
	// Sender Filter System Mail Watch List Enable Checkbox
	@FindBy(xpath = "//*[@id='ctl00_MainContent_cbMailWatchEnable']")
	private WebElement sfsMailWatchListEnableCheckbox;
	
	// Sender Filter System Money Watch List Enable Checkbox
	@FindBy(xpath = "//*[@id='ctl00_MainContent_cbMoneyWatchEnable']")
	private WebElement sfsMoneyWatchListEnableCheckbox;
	
	// Sender Filter System Mail Watch List Reason input
	@FindBy(xpath = "//*[@id='ctl00_MainContent_reason']")
	private WebElement sfsMailWatchListReasonInput;
	
	// Sender Filter System Money Watch List Reason input
	@FindBy(xpath = "//*[@id='ctl00_MainContent_tbWatchMoneyReason']")
	private WebElement sfsMoneyWatchListReasonInput;
	
	// Sender Filter System Add Success Message
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lbl_displaymessage']")
	private WebElement sfsAddSuccessMessage;
	
	// Sender Filter System Select Search By
	@FindBy(xpath = "//*[@id='ctl00_MainContent_searchfilter']")
	private WebElement sfsSearchBy;
	
	// Sender Filter System Search staring input
	@FindBy(xpath = "//*[@id='ctl00_MainContent_searchstring']")
	private WebElement sfsSearchStringInput;
	
	// Sender Filter System Search Go Button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_btnSubmit']")
	private WebElement sfsSearchGoButton;
	
	// Sender Filter System Search Record found text verify
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_RecordCountDictionary']//font")
	private WebElement sfsRecordFoundText;
	
	// Sender Filter System Empty Search Error message
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_Requiredfieldvalidator4']//font")
	private WebElement sfsEmptySearchErrorMsg;
	
	// Sender Filter System Search Last name verify
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_MyDataGridSearchDictionary']//tr[2]/td[1]")
	private WebElement sfsSearchLastName;
	
	// Sender Filter System Search Account id verify
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_MyDataGridSearchDictionary']//tr[2]/td[2]")
	private WebElement sfsSearchAccountId;
	
	// Sender Filter System Search Mail Watch list status
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_MyDataGridSearchDictionary']//tr[2]/td[3]//a")
	private WebElement sfsSearchMailWatchListStatus;
	
	// Sender Filter System Search Money Watch list status
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_MyDataGridSearchDictionary']//tr[2]/td[5]//a")
	private WebElement sfsSearchMoneyWatchListStatus;
	
	// Sender Filter System Search Mail Watch list status reason input
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_MyDataList_ViewUniqueInmate_ctl00_reason']")
	private WebElement ifsMailWatchListStatusReason;
	
	// Sender Filter System Search Mail Watch list inactive radio button
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_MyDataList_ViewUniqueInmate_ctl00_chb_status_0']")
	private WebElement ifsMailWatchListInactiveRadioButon;
	
	// Sender Filter System Search Mail Watch list update status button
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_MyDataList_ViewUniqueInmate_ctl00_Button2']")
	private WebElement ifsMailWatchListUpdateStatusButton;
	
	// Sender Filter System Search Money Watch list status reason input
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_dlMoneyUpdate_ctl00_tbWatchMoneyUpdateReason']")
	private WebElement ifsMoneyWatchListStatusReason;
	
	// Sender Filter System Search Money Watch list inactive radio button
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_dlMoneyUpdate_ctl00_rblWatchMoneyUpdateStatus_1']")
	private WebElement ifsMoneyWatchListInactiveRadioButon;
	
	// Sender Filter System Search Mail Watch list update status button
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_dlMoneyUpdate_ctl00_btnWatchMoneyUpdate']")
	private WebElement ifsMoneyWatchListUpdateStatusButton;
	
	// Sender Filter System Destination mail bucket select
	@FindBy(xpath = ".//select[@id='ctl00_MainContent_ddlDestinationBucket']")
	private WebElement ifsSelectDestinationMailBucket;
	
	
	
	
	//*************************************************************************************************//

	
	

	public void clickSenderFilterSystemLink() {

		click(senderFilterSystemLink);
	}
	
	public void verifySenderFilterSystemHeaderText(String text){
		
		assertionText("Header Text :: ", senderFilterSystemHeaderText, text);
	}
	
	public void clickSFSAddLink() {

		click(sfsAddLink);
	}
	
	public void clickSFSSearchLink() {

		click(sfsSearchLink);
	}
	
	public void clickSFSAddCustomerButton() {

		logging("Clicking on : "+sfsAddCustomerButton.getAttribute("value")); 
		sfsAddCustomerButton.click();;
	}
	
	public void verifySFSEmptyAccountIdErrorMessage(String text){
		
		assertionText("EmptyAccountId :: ", sfsEmptyAccountIdErrorMessage, text);
	}
	
	public void verifySFSEmptyLastNameErrorMessage(String text){
		
		assertionText("EmptyLastName :: ", sfsEmptyLastNameErrorMessage, text);
	}
	
	public void enterSFSAccountID(String accountId){
		
		setText(sfsAccountIdInput, accountId);
	}
	
	public void enterSFSLastName(String lastName){
		
		setText(sfsLastNameInput, lastName);
	}

	public void checkSFSMailWatchListEnable(){
		
		logging("Checking on : MailWatchListEnable checkbox.");
		pressSpace(sfsMailWatchListEnableCheckbox);
		
	}
	
	public void checkSFSMoneyWatchListEnable(){
		
		logging("Checking on : MoneyWatchListEnable checkbox.");
		pressSpace(sfsMoneyWatchListEnableCheckbox);
		
	}
	
	public void enterSFSMailWatchListReason(String reason){
		
		setText(sfsMailWatchListReasonInput, reason);
	}
	
	public void enterSFSMoneyWatchListReason(String reason){
		
		setText(sfsMoneyWatchListReasonInput, reason);
	}
	
	public void verifySFSAddSuccessMessage(String text){
		
		assertionText("AddSuccessMessage :: ", ifsAddSuccessMessage, text);
	}
	
	public void selectSFSSearchBy(String searchBy){
		
		logging("Searching By : "+searchBy);
		selectElementByVisibleText(sfsSearchBy, searchBy);
	}
	
	public void enterSFSSearchString(String string){
		
		setText(sfsSearchStringInput, string);
	}
	
	public void clickSFSSearchGoButton() {

		logging("Clicking on : "+sfsSearchGoButton.getAttribute("value")); 
		sfsSearchGoButton.click();;
	}
	
	public void verifySFSSearchRecordFoundText(String text){
		
		assertionText("RecordFoundText :: ", sfsRecordFoundText, text);
	}
	
	public void verifySFSEmptySearchErrorMsg(String text){
		
		assertionText("EmptySearchErrorMsg :: ",sfsEmptySearchErrorMsg, text);
	}
	
	public void verifySFSSearchLastName(String text){
		
		assertionText("LastName :: ", sfsSearchLastName, text);
	}
	
	public void verifySFSSearchAccountId(String text){
		
		assertionText("AccountId :: ", sfsSearchAccountId, text);
	}
	
	public void verifySFSSearchMailWatchListStatus(String text){
		pause(1000);
		assertionText("MailWatchListStatus :: ", sfsSearchMailWatchListStatus, text);
	}
	
	public void verifySFSSearchMoneyWatchListStatus(String text){
		pause(1000);
		assertionText("MoneyWatchListStatus :: ", sfsSearchMoneyWatchListStatus, text);
	}
	
	public void clickSFSSearchMailWatchListStatus(){
		
		click(sfsSearchMailWatchListStatus);
	}
	
	public void clickSFSSearchMoneyWatchListStatus(){
		
		click(sfsSearchMoneyWatchListStatus);
	}
	
	public void enterSFSSearchMailWatchListStatusReason(String reason){
		
		setText(sfsMailWatchListStatusReason, reason);
	}
	
	public void enterSFSSearchMoneyWatchListStatusReason(String reason){
		
		setText(sfsMoneyWatchListStatusReason, reason);
	}
	
	public void clickSFSSearchMailWatchListInactiveRadioButton(){
		
		logging("Clicking on : Inactive radio button of Mail watch list.");
		click(sfsMailWatchListInactiveRadioButon);
	}
	
	public void clickSFSSearchMoneyWatchListInactiveRadioButton(){
		
		logging("Clicking on : Inactive radio button of Money watch list.");
		sfsMoneyWatchListInactiveRadioButon.click();
	}
	
	public void clickSFSSearchMailWatchListStatusUpdateButton() {

		logging("Clicking on : "+sfsMailWatchListUpdateStatusButton.getAttribute("value")); 
		sfsMailWatchListUpdateStatusButton.click();;
	}
	
	
	public void clickSFSSearchMoneyWatchListStatusUpdateButton() {

		logging("Clicking on : "+sfsMoneyWatchListUpdateStatusButton.getAttribute("value")); 
		sfsMoneyWatchListUpdateStatusButton.click();;
	}
	
	
	
	
	


	/*******************************  Sender FILTER SYSTEM ELEMENT AND METHOD  **************************
	 *************************************************************************************************/
	



	
	



}
