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

public class FacilityAdminPage extends BasePageObject {

	/************************************************************************************************
	 ******************************************* CONSTRUCTOR*****************************************
	 ************************************************************************************************/

	public FacilityAdminPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	/***********************************************
	 * CONSTRUCTOR****************************************
	 **************************************************************************************************
	 **************************************************************************************************/

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	// Admin Tab Link
	@FindBy(xpath = ".//div[@class='siteMasterHeaderClass']//td//*[contains(text(),'Admin')]")
	private WebElement linkAdmin;


	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	/************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD***********************
	 ************************************************************************************************/

	public void clickAdminLink() {

		click(linkAdmin);
	}

	
	

	/*****************************************   Handle Inmate Account ELEMENTS AND METHODS ******************************
	 *************************************************************************************************************************/

	// Handle Inmate Account link
	@FindBy(xpath = ".//div[@class='siteMasterLeftNavClass']//td//*[contains(text(),'Handle Inmate Account')]")
	private WebElement linkHandleInmateAccount;

	// INSERT INMATE ID INPUT
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_tbInmateID']")
	private WebElement insertInmateIdInput;

	// View Inmate Account Details Button
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_btnView']")
	private WebElement handleInmAccViewInmateAccButton;

	// Inmate id verify
	@FindBy(xpath = "//*[@id='ctl00_MainContent_dgAcctDetails']//tbody//tr[2]//td[1]")
	private WebElement handleInmateAccInmateId;

	// Inmate account status verify
	@FindBy(xpath = "//*[@id='ctl00_MainContent_dgAcctDetails_ctl02_lblStatus']")
	private WebElement handleInmateAccStatus;

	// HIA Actions Text
	@FindBy(xpath = "(//*[@id='ctl00_MainContent_pAcctDetails']//b)[1]")
	private WebElement hiaActionsText;

	// HIA Details Text
	@FindBy(xpath = "(//*[@id='ctl00_MainContent_pAcctDetails']//b)[2]")
	private WebElement hiaDetailsText;

	// HIA Edit Button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_dgInmateKioskPermissions']//tr[2]//a[contains(text(),'Edit')]")
	private WebElement hiaEditButton;

	// HIA Update Button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_dgInmateKioskPermissions']//tr[2]//a[contains(text(),'Update')]")
	private WebElement hiaUpdateButton;

	// HIA Cancel Button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_dgInmateKioskPermissions']//tr[2]//a[contains(text(),'Cancel')]")
	private WebElement hiaCancelButton;
	
	// HIA Details Account History Button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lnkAccountHistory']")
	private WebElement hiaDetailsAccountHistoryButton;
	
	// HIA Details Letters Sent Received History Button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lnkLettersSentReceivedHistory']")
	private WebElement hiaDetailsLettersSentReceivedHistoryButton;
	
	// HIA Details [Printed Items History]  Button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lnkPrintedItemsHistory']")
	private WebElement hiaDetailsPrintedItemsHistoryButton;
	
	// HIA Details [Purchases History] Button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lnkStampPurchaseHistory']")
	private WebElement hiaDetailsPurchasesHistoryButton;
	
	// HIA Details [Kiosk Session History] Button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_LnkSessionHistory']")
	private WebElement hiaDetailsKioskSessionHistoryButton;
	
	// HIA Details [Invitations History] Button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lnkSentPendingInvitations']")
	private WebElement hiaDetailsInvitationsHistoryButton;
	
	// HIA Details [Commissary Carts History] Button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lnkInmateShoppingCarts']")
	private WebElement hiaDetailsCommissaryCartsHistoryButton;
	
	// HIA Details Account Details Link Page verify
	@FindBy(xpath = "(.//div[@id='ctl00_MainContent_pSearchInmate']//following::span[contains(text(),'Page')])[1]")
	private WebElement hiaDetailsPageVerifyText;
	
	// HIA Back button
	@FindBy(xpath = "(.//div[@id='ctl00_MainContent_pSearchInmate']//following::a[contains(text(),'Back')])[1]")
	private WebElement hiaDetailsBackButton;
	
	// HIA Kiosk session Export to file button
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_uclInmateSessionHistory_btnExport']")
	private WebElement kioskSessionExportToFileButton;
	
	// HIA Actions Suspend Account Button
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lnkSuspend']")
	private WebElement hiaActionsSuspendAccountButton;
	
	// HIA Actions Activate Account Button
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lnkActivate']")
	private WebElement hiaActionsActivateAccountButton;
	
	// HIA Actions Suspend/Activate Account reason input
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_tbReason']")
	private WebElement hiaActionsSusActiAccountinput;
	
	// HIA Actions Suspend/Activate Account end date input
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_tbSuspendUntilDate']")
	private WebElement hisSuspendEndDateInput;
	
	// HIA Actions Suspend/Activate Confirm button
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_btnConfirmRequiredComment']")
	private WebElement hisSuspActiConfirmButton;
	
	// HIA Actions Suspend Confirm message
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lblSuspended']")
	private WebElement hisActionsSuspendConfirmMsg;
	
	// HIA Actions Activate Confirm message
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lblActivate']")
	private WebElement hisActionsActivateConfirmMsg;
	
	// HIA Inbound mail enabled
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_dgInmateKioskPermissions_ctl02_cbInboundMailEnabledE']")
	private WebElement hiaInboundMailEnabledCheckbox;
	
	// HIA Inbound mail enabled
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_dgInmateKioskPermissions_ctl02_cbOutboundMailEnabledE']")
	private WebElement hiaOutboundMailEnabledCheckbox;
	
	// HIA Actions SuCCESSFULL Confirm message
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lblSuspended']")
	private WebElement hiaActionsSuccessfullMsg;
	
	

	// ------------------------------------------------------------------------------------------------------------------------//

	
	
	
	
	
	public void clickHandleInmateAccountLink() {

		click(linkHandleInmateAccount);
	}

	public void enterHIAInsertInmateId(String inmateId) {

		setText(insertInmateIdInput, inmateId);
	}

	public void clickHIAViewInmateAccountDetailsButton() {

		logging("Clicking on : " + handleInmAccViewInmateAccButton.getAttribute("value"));
		handleInmAccViewInmateAccButton.click();
	}
	
	public boolean isHIAInameIdSearchedResultPresent(){
		
		try {
			
			return getDriver().findElement(By.xpath("//*[@id='ctl00_MainContent_dgAcctDetails']/tbody/tr[2]")).isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public void verifyHIAInameIdSearchedResultPresent(){
		
		logging("Search Result is present : "+isHIAInameIdSearchedResultPresent());
		assertTrue(isHIAInameIdSearchedResultPresent());
	}
	
	public void verifyHIAInameId(String inmateId){
		
		assertionText("Inmate Id :: ",handleInmateAccInmateId, inmateId);
	}
	
	public void verifyHIAInameAccountStatus(String status){
		
		assertionText("Account Status :: ",handleInmateAccStatus, status);
	}
	
	public void verifyHIAActionsText(String text){
		
		assertionText(hiaActionsText, text);
	}
	
	public void verifyHIADetailsText(String text){
		
		assertionText(hiaDetailsText, text);
	}
	
	public void clickHIAEditButton() {

		click(hiaEditButton);
	}
	
	public void clickHIAUpdateButton() {

		click(hiaUpdateButton);
	}
	
	public void clickHIACancelButton() {

		click(hiaCancelButton);
	}
	
	public void clickHIADetailsAccountHistoryButton() {

		click(hiaDetailsAccountHistoryButton);
	}
	
	public void clickHIADetailsLetterSentReceivedButton() {

		click(hiaDetailsLettersSentReceivedHistoryButton);
	}
	
	public void clickHIADetailsPrintedItemsHistoryButton() {

		click(hiaDetailsPrintedItemsHistoryButton);
	}
	
	public void clickHIADetailsPurchasesHistoryButton() {

		click(hiaDetailsPurchasesHistoryButton);
	}
	
	public void clickHIADetailsKioskSessionHistoryButton() {

		click(hiaDetailsKioskSessionHistoryButton);
	}
	
	public void clickHIADetailsInvitationsHistoryButton() {

		click(hiaDetailsInvitationsHistoryButton);
	}
	
	public void clickHIADetailsCommissaryCartsHistoryButton() {

		click(hiaDetailsCommissaryCartsHistoryButton);
	}

	public void clickHIADetailsBackButton() {

		click(hiaDetailsBackButton);
	}
	
	public void verifyHIADetailsPageVerifyTextPresent(){
		
		logging("Details Page Varifications Text is Present : "+isElementDisplayed(hiaDetailsPageVerifyText));
		logging("Details Page Varifications Text is : "+hiaDetailsPageVerifyText.getText());
		assertTrue(isElementDisplayed(hiaDetailsPageVerifyText));
	}

	public void clickHIAKioskSessionExportToFileButton() {

		logging("Clicking on : "+kioskSessionExportToFileButton.getAttribute("value"));
		kioskSessionExportToFileButton.click();
	}
	
	public void clickHIAActionsSuspendAccountButton() {

		click(hiaActionsSuspendAccountButton);
	}
	
	public void clickHIAActionsActivateAccountButton() {

		click(hiaActionsActivateAccountButton);
	}
	
	public void enterHIAActionsSusActiReason(String reason){
		
		setText(hiaActionsSusActiAccountinput, reason);
	}
	
    public void enterHIAActionsSuspendEndDate(){
		
		try {
			String curDate="";
			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
			Date date = new Date();
			curDate=dateFormat.format(date);
			
			setText(hisSuspendEndDateInput, curDate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    
	public void clickHIAActionsSuspActiConfirmButton() {

		logging("Clicking on : "+hisSuspActiConfirmButton.getAttribute("value"));
		hisSuspActiConfirmButton.click();
	}
	
	public void verifyHISActionsSuspendConfirmMessage(String date){
		
		String text = "Account successfully suspended until "+date;
		assertionText(hisActionsSuspendConfirmMsg, text);
	}
	
	public void verifyHISActionsActivateConfirmMessage(String text){
		
		assertionText(hisActionsActivateConfirmMsg, text);
	}
	
	public String getCurrDate(){
		
		String curDate="";
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		curDate=dateFormat.format(date);
		return curDate;
	}
	
	public void checkHIAInboundMailEnabledCheckbox(){
		
		logging("Checking on InboundMailEnabled Checkbox");
		if (!hiaInboundMailEnabledCheckbox.isSelected()) {
			pressSpace(hiaInboundMailEnabledCheckbox);
		}
	}
	
	public void checkHIAOutboundMailEnabledCheckbox(){
		
		logging("Checking on OutboundMailEnabled Checkbox");
		if (!hiaOutboundMailEnabledCheckbox.isSelected()) {
			pressSpace(hiaOutboundMailEnabledCheckbox);
		}
	}
	
	public void uncheckHIAInboundMailEnabledCheckbox(){
		
		logging("Un-Checking on InboundMailEnabled Checkbox");
		if (hiaInboundMailEnabledCheckbox.isSelected()) {
			pressSpace(hiaInboundMailEnabledCheckbox);
		}
	}
	
	public void uncheckHIAOutboundMailEnabledCheckbox(){
		
		logging("Un-Checking on OutboundMailEnabled Checkbox");
		if (hiaOutboundMailEnabledCheckbox.isSelected()) {
			pressSpace(hiaOutboundMailEnabledCheckbox);
		}
	}
	
	public void verifyHIAActionsSuccessfullMessage(String text){
		
		assertionText("UpdateSuccessMessage :: ",hiaActionsSuccessfullMsg, text);
	}
	
	public void verifyHIAActionsSuccessfullMessage(){
		
		logging("Successfull Message is Present :: "+isElementDisplayed(hiaActionsSuccessfullMsg));
		logging("Action Perform Successfull Message is : "+getText(hiaActionsSuccessfullMsg));
		assertTrue(isElementDisplayed(hiaActionsSuccessfullMsg));
	}
	
	
	
	

	/***************************************** Handle Inmate Account ELEMENTS AND METHODS *****************************
	 *************************************************************************************************************************/
	
	
	
	
	
	
	
	

	/*****************************************   Inmate Announcement ELEMENTS AND METHODS ******************************
	 *************************************************************************************************************************/


	// Inmate Announcement link
	@FindBy(xpath = ".//div[@class='siteMasterLeftNavClass']//td//*[contains(text(),'Inmate Announcement')]")
	private WebElement linkInmateAnnouncement;

	// Send an inmate Announcement link
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lnkSendAnnouncement']")
	private WebElement sendAnInmateAnnouncementButton;

	// view previous inmate Announcements link
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lnkViewPreviousInmateAnnouncements']")
	private WebElement viewPreviousInmateAnnouncementButton;

	// Inmate Announcement send Inmate announcement fill out verify text
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lblInstructions']")
	private WebElement sendInmateAnnouncementFillVerifyText;

	// Inmate Announcement Facility Staff members checkbox
	@FindBy(xpath = "//*[@id='ctl00_MainContent_cbCCFacilityStaff']")
	private WebElement iaFacilityStaffMembersCheckbox;

	// Inmate Announcement source button
	@FindBy(xpath = "//*[@id='cke_15_label']")
	private WebElement iaSourceButton;

	// Inmate Announcement Facility Staff Members Email input
	@FindBy(xpath = "//*[@id='ctl00_MainContent_tbCCFacilityEmails']")
	private WebElement iaFacilityStaffMembersEmailInput;

	// Inmate Announcement write announcement input
	@FindBy(xpath = "//*[@id='cke_1_contents']/textarea")
	private WebElement iaWriteAnnouncementInput;
	
	// Inmate Announcement PREVIEW BUTTON
	@FindBy(xpath = "//*[@id='ctl00_MainContent_btnPreview']")
	private WebElement iaPreviewButton;
	
	// Inmate Announcement Back BUTTON
	@FindBy(xpath = "//*[@id='ctl00_MainContent_ButtonBack']")
	private WebElement iaBackButton;
	
	// Inmate Announcement Send Announcement BUTTON
	@FindBy(xpath = "//*[@id='ctl00_MainContent_btnSend']")
	private WebElement iaSendAnnouncementButton;
	
	// Inmate Announcement Announcement Preview message
	@FindBy(xpath = "//*[@id='ctl00_MainContent_Label2']")
	private WebElement iaAnnouncementPreviewMessage;
	
	// Inmate Announcement Announcement Success message
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lblResult']")
	private WebElement iaAnnouncementSentSuccessMessage;
	
	// Inmate Announcement Inmate radio button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_rbSendInmate']")
	private WebElement iaInmateRadioButton;
	
	// Inmate Announcement Facility radio button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_rbSendFacility']")
	private WebElement iaFacilityRadioButton;
	
	// Inmate Announcement insert inmate id input
	@FindBy(xpath = "//*[@id='ctl00_MainContent_tbInmateID']")
	private WebElement iaInsertInmateIdInput;
	
	// Inmate Announcement check inmate button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_btnCheckInmate']")
	private WebElement iaCheckInmateButton;
	
	// Inmate Announcement verify inmate info
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lblInmateStatus']")
	private WebElement iaInmateInfoText;
	
	// Inmate Announcement AnnouncementStatusCheckFromDate
	@FindBy(xpath = "//*[@id='ctl00_MainContent_txtFromDate']")
	private WebElement iaAnnouncementStatusCheckFromDate;
	
	// Inmate Announcement AnnouncementStatusCheckToDate
	@FindBy(xpath = "//*[@id='ctl00_MainContent_txtToDate']")
	private WebElement iaAnnouncementStatusCheckToDate;
	
	// Inmate Announcement AnnouncementStatus ViewAnnouncement button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_btnView']")
	private WebElement iaViewAnnouncementButton;
	
	// Inmate Announcement Add Date button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_btnAddDate']")
	private WebElement iaAddDateButton;
	
	// Inmate Announcement Add Inmate Name button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_btnAddInmateName']")
	private WebElement iaAddInmateNameButton;
	
	// Inmate Announcement Facilities name verification
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lblLocatons']")
	private WebElement iaFacilityName;
	
	// Inmate Announcement Housing name verification
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lblHousing']")
	private WebElement iaHousingName;
	
	// Inmate Announcement Housing Input
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_txtHousing']")
	private WebElement iaHousingInput;
	
	// Inmate Announcement Empty letter Error message
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lblErrorMessage']")
	private WebElement iaEmptyLetterErrorMsg;
	
	// Inmate Announcement Empty Inmate id Error message
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_rfvInmateID']")
	private WebElement iaEmptyInmateIdErrorMsg;
	
	// Inmate Announcement Empty Facility Staff Member Error message
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lblErrorMessage']")
	private WebElement iaEmptyStaffEmailErrorMsg;
	
	

	// ------------------------------------------------------------------------------------------------------------------------//

	
	

	public void clickInmateAnnouncementLink() {

		click(linkInmateAnnouncement);
	}

	public void clickIASendAnInmateAnnouncementLink() {

		click(sendAnInmateAnnouncementButton);
	}

	public void clickIAViewPreviousInmateAnnouncementLink() {

		click(viewPreviousInmateAnnouncementButton);
	}
	
	public void verifyIASendInmateAnnFillOutVerifyText(String text){
		
		assertionText(sendInmateAnnouncementFillVerifyText, text);
	}
	
	public void enterIAHousing(String house) {

		setText(iaHousingInput, house);
	}
	
	public void checkIAFacilityStaffMembersCheckbox(){
		
		logging("Checking on CC Facility Staff Members Checkbox");
		pressSpace(iaFacilityStaffMembersCheckbox);
	}

	public void clickIASourceLink() {

		click(iaSourceButton);
	}

	public void writeIAInmateAnnouncement(String announcement) {

		setText(iaWriteAnnouncementInput, announcement);
	}

	public void enterIAFacilityStaffMembersEmail(String facilityStaffEmail) {

		setText(iaFacilityStaffMembersEmailInput, facilityStaffEmail);
	}

	public void clickIAPreviewButton() {

		logging("Clicking on : "+iaPreviewButton.getAttribute("value"));
		iaPreviewButton.click();
	}
	

	public void clickIABackButton() {

		logging("Clicking on : "+iaBackButton.getAttribute("value"));
		iaBackButton.click();
	}
	
	public void clickIASendAnnouncementButton() {

		logging("Clicking on : "+iaSendAnnouncementButton.getAttribute("value"));
		iaSendAnnouncementButton.click();
	}
	
	public void verifyIAAnnouncementPreviewMessage(String previewMessage){
		
		assertionText(iaAnnouncementPreviewMessage, previewMessage);
	}
	
	public void verifyIAFacilitiesName(String facility){
		
		assertionText("Facility :: ",iaFacilityName, facility);
	}
	
	public void verifyIAHousingName(String house){
		
		assertionText("House :: ",iaHousingName, house);
	}
	
	public void verifyIAEmptyLetterErrorMsg(String errorMsg){
		
		assertionText(iaEmptyLetterErrorMsg, errorMsg);
	}
	
	public void verifyIAEmptyInmateIdErrorMsg(String errorMsg){
		
		assertionText(iaEmptyInmateIdErrorMsg, errorMsg);
	}
	
	public void verifyIAEmptyStaffEmailErrorMsg(String errorMsg){
		
		assertionText(iaEmptyStaffEmailErrorMsg, errorMsg);
	}

	public void verifyIAAnnouncementSentSuccessMessage(){
		
		String announcementRequestNo = iaAnnouncementSentSuccessMessage.getText().split(" ")[1].
				substring(3, iaAnnouncementSentSuccessMessage.getText().split(" ")[1].length());
		String successMessage = "Request No."+announcementRequestNo+" has been successfully queued.";
		assertionText(iaAnnouncementSentSuccessMessage, successMessage);
	}
	
	public String getAnnouncementRequestNo(){
		
		String announcementRequestNo = iaAnnouncementSentSuccessMessage.getText().split(" ")[1].
				substring(3, iaAnnouncementSentSuccessMessage.getText().split(" ")[1].length());
		return announcementRequestNo;
	}
	
	public void clickIAInmateRadioButton(){
		
		logging("Clicking on : Inmate radio button.");
		iaInmateRadioButton.click();
	}
	
	public void clickIAFacilityRadioButton(){
		
		if (!iaFacilityRadioButton.getAttribute("checked").contentEquals("checked")) {
			logging("clicking on : "+iaFacilityRadioButton.getAttribute("value"));
			iaFacilityRadioButton.click();
		}
	}

	public void enterIAInsertInmateId(String inmateId) {

		setText(iaInsertInmateIdInput, inmateId);
	}

	public void clickIACheckInmateButton() {

		logging("Clicking on : "+iaCheckInmateButton.getAttribute("value"));
		iaCheckInmateButton.click();
	}
	
	public void verifyIAInmateInfoTextPresent(){
		
		logging("Inmate Information text is Present : "+isElementDisplayed(iaInmateInfoText));
		logging("Inmate Information text is : "+iaInmateInfoText.getText());
		assertTrue(isElementDisplayed(iaInmateInfoText));
	}
	
    public void enterIAAnnouncementStatusCheckFromToDate(){
		
		String curDate="";
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		curDate=dateFormat.format(date);
		
		setText(iaAnnouncementStatusCheckFromDate, curDate);
		setText(iaAnnouncementStatusCheckToDate, curDate);
		
	}

	public void clickIAViewAnnouncementButton() {

		logging("Clicking on : "+iaViewAnnouncementButton.getAttribute("value"));
		iaViewAnnouncementButton.click();
	}
	
	public void verifyIAAnnouncementStatusResultPresent(String announcementReqNo){
		
		WebElement element = getDriver().findElement(By.xpath(".//*[@id='ctl00_MainContent_pPreviousAnnouncements']"
				+ "/table//tr//span[contains(text(),'"+announcementReqNo+"')]"));
		logging("Announcement Status Result is Present for Announcement no.- "+announcementReqNo+" : "+ isElementDisplayed(element));
		assertTrue(isElementDisplayed(element));
	}
	
	public void verifyIAAnnouncementStatus(String announcementReqNo,String status){
		
		WebElement element = getDriver().findElement(By.xpath(".//span[contains(text(),'"+announcementReqNo+"')]//following::span[1]"));
		assertionText("Status for Announcement no. - "+announcementReqNo+" :: ", element, status);
	}

	public void clickIAAddDateButton() {

		logging("Clicking on : "+iaAddDateButton.getAttribute("value"));
		iaAddDateButton.click();
	}

	public void clickIAAddInmateNameButton() {

		logging("Clicking on : "+iaAddInmateNameButton.getAttribute("value"));
		iaAddInmateNameButton.click();
	}
    
	

	/***************************************** Inmate Announcement ELEMENTS AND METHODS *****************************
	 *************************************************************************************************************************/
	
	
	
	
	
	

	/*****************************************   SHOW INMATE ACL ELEMENTS AND METHODS ******************************
	 *************************************************************************************************************************/


	// Show Inmate ACL link
	@FindBy(xpath = ".//div[@class='siteMasterLeftNavClass']//td//*[contains(text(),'Show Inmate ACL')]")
	private WebElement linkShowInmateACL;

	// Show Inmate ACL insert inmate id input
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_tbInmateID']")
	private WebElement insertSIAInmateIdInput;

	// Show Inmate's ACL list button
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_btnShowDG']")
	private WebElement siaShowInmateACLListButton;
	
	// Show Inmate's ACL First customer id
	@FindBy(xpath = "(.//*[@id='ctl00_MainContent_dgOptInList']//tr[2]//td)[1]")
	private WebElement siaShowInmateACLCustomerId;
	
	// Show Inmate's ACL First Inmate name
	@FindBy(xpath = "(.//*[@id='ctl00_MainContent_dgOptInList']//tr[2]//td)[2]")
	private WebElement siaShowInmateACLCustomerName;
	
	// Show Inmate's ACL Customer name verify
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_AddOptInForbiddenList_lblCustomerName']")
	private WebElement siaVerifyCustomerName;
	
	// Show Inmate's ACL Inmate id verify
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_AddOptInForbiddenList_lblInmateID']")
	private WebElement siaVerifyInmateId;
	
	// Show Inmate's ACL First inmate forbidden list add button
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_dgOptInList_ctl02_lnkAddToInmateForbidden']")
	private WebElement siaInmateForbiddenListButton;
	
	// Show Inmate's ACL First General forbidden list add button
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_dgOptInList_ctl02_lnkAddToGeneralForbidden']")
	private WebElement siaGeneralForbiddenListButton;
	
	// Show Inmate's ACL enter comment input
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_AddOptInForbiddenList_lettercomment']")
	private WebElement siaEnterCommentInput;
	
	// Show Inmate's ACL enter comment input
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_AddOptInForbiddenList_btn_addToForbidenList']")
	private WebElement siaAddButton;
	
	// Show Inmate's ACL add Account success message
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lblAddOk']")
	private WebElement siaAddAccountSuccessmsg;

	
	

	// ------------------------------------------------------------------------------------------------------------------------//

	
	public void clickShowInmateACLLink(){
		
		click(linkShowInmateACL);
	}
	
	public void enterSIAInmateId(String inmateId){
		
		setText(insertSIAInmateIdInput, inmateId);
	}
	
	public void clickSIAShowInmateACLListButton(){
		
		logging("Clicking on : "+getTextByValue(siaShowInmateACLListButton));
		siaShowInmateACLListButton.click();
	}
	
	public String getSIAGetFirstCustomerId(){
		
		return siaShowInmateACLCustomerId.getText();
	}
	
	public String getSIAGetFirstCustomerName(){
		
		return siaShowInmateACLCustomerName.getText();
	}
	
	public void clickSIAAddInmateForbiddenListButton(){
		
		click(siaInmateForbiddenListButton);
	}
	
	
	public void clickSIAAddInmateForbiddenListButton(String accountName){
		
		WebElement element = getDriver().findElement(By.xpath("(.//a[contains(text(),'"+accountName+"')]//following::a[contains(text(),'Add')])[1]"));
		logging("Clicking on : "+getText(element)+" Button of - "+accountName);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	public void clickSIAAddGeneralForbiddenListButton(){
		
		click(siaGeneralForbiddenListButton);
	}
	
	public void verifySIACustomerName(String name){
		
		assertionText("Name : ", siaVerifyCustomerName, name);
	}
	
	public void verifySIAInmateId(String id){
		
		assertionText("Inmate Id : ", siaVerifyInmateId, id);
	}
	
	public void enterSIAComment(String comment){
		
		setText(siaEnterCommentInput, comment);
	}
	
	public void clickSIAAddButton(){

		logging("Clicking on : "+getTextByValue(siaAddButton));
		siaAddButton.click();
	}
	
	public void verifySIACustomerPresentInInmateForbiddenList(String customerId){
		
		WebElement element = getDriver().findElement(By.xpath(".//table[@id='ctl00_MainContent_dgInmateForbiddenList']"
				+ "//tr[2]//td[contains(text(),'"+customerId+"')]"));
		logging("Customer Present in the Inmate Forbidden List : "+isElementDisplayed(element));
		assertTrue(isElementDisplayed(element));
	}
	
	public void verifySIAInmatePresentInInmateForbiddenList(String accountName){
		
		WebElement element = getDriver().findElement(By.xpath(".//table[@id='ctl00_MainContent_dgInmateForbiddenList']"
				+ "//tr//td//span[contains(text(),'"+accountName+"')]"));
		logging("Inmate - "+accountName+" Present in the Inmate Forbidden List : "+isElementDisplayed(element));
		assertTrue(isElementDisplayed(element));
	}
	
	public boolean isSIAInmateAbsentInInmateForbiddenList(String accountName){
		
		try {
			WebElement element = getDriver().findElement(By.xpath(".//table[@id='ctl00_MainContent_dgInmateForbiddenList']"
					+ "//tr//td//span[contains(text(),'"+accountName+"')]"));
			return element.isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
		
	}
	
	public void verifySIAInmateAbsentInInmateForbiddenList(String accountName){
		
		logging("Inmate - "+accountName+" Absent in the Inmate Forbidden List : "+!isSIAInmateAbsentInInmateForbiddenList(accountName));
		assertTrue(!isSIAInmateAbsentInInmateForbiddenList(accountName));
	}
	
	public void verifySIACustomerPresentInOptInList(String customerId){
		
		WebElement element = getDriver().findElement(By.xpath(".//table[@id='ctl00_MainContent_dgOptInList']"
				+ "//tr[2]//td[contains(text(),'"+customerId+"')]"));
		logging("Customer Present in the Inmate Forbidden List : "+isElementDisplayed(element));
		assertTrue(isElementDisplayed(element));
	}
	
	public void verifySIACustomerPresentInGeneralForbiddenList(String customerId){
		
		WebElement element = getDriver().findElement(By.xpath(".//table[@id='ctl00_MainContent_dgGeneralForbiddenList']"
				+ "//tr[2]//td[contains(text(),'"+customerId+"')]"));
		logging("Customer Present in the General Forbidden List : "+isElementDisplayed(element));
		assertTrue(isElementDisplayed(element));
	}
	
	public void clickSIAInmateForbiddenDeleteButton(String customerId){
		
		WebElement element = getDriver().findElement(By.xpath(".//table[@id='ctl00_MainContent_dgInmateForbiddenList']"
				+ "//tr//td[contains(text(),'"+customerId+"')]//following::td[3]"));
		click(element);
	}
	
	public void clickSIAInmateForbiddenDeleteButtonByaccountName(String inmateName){
		
		WebElement element = getDriver().findElement(By.xpath("(.//table[@id='ctl00_MainContent_dgInmateForbiddenList']"
				+ "//tr//following::span[contains(text(),'"+inmateName+"')]//following::a)[1]"));
		click(element);
	}
	
	public void verifySIAAddAccountSuccessMessage(String customerId){
		
		String expText="Account #"+customerId+" added to the forbidden list";
		assertionText(siaAddAccountSuccessmsg, expText);
	}

	

	/*****************************************     SHOW INMATE ACL ELEMENTS AND METHODS     *****************************
	 *************************************************************************************************************************/

	
	
	
	
	

	/*****************************************   OPT-IN FORBIDDEN LIST ELEMENTS AND METHODS ******************************
	 *************************************************************************************************************************/


	// Opt-in Forbidden link
	@FindBy(xpath = ".//div[@class='siteMasterLeftNavClass']//td//*[contains(text(),'Opt-In Forbidden List')]")
	private WebElement linkOptInForbiddenList;

	// Opt-in Forbidden link
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_dgList_ctl02_lblAccountID']")
	private WebElement optInForbiddenListVerifyAccountId;

	

	// ------------------------------------------------------------------------------------------------------------------------//

	public void clickOptInForbiddenListLink(){
		
		click(linkOptInForbiddenList);
	}

	
	public void verifyOIFLAccountId(String id){
		
		WebElement element = getDriver().findElement(By.xpath(".//table[@id='ctl00_MainContent_dgList']"
				+ "//tr//following::*[contains(text(),'"+id+"')]"));
		assertionText(element, id);
	}
	
	
	public void clickOIFLDeleteButton(String id){
		
		WebElement element = getDriver().findElement(By.xpath(".//table[@id='ctl00_MainContent_dgList']"
				+ "//tr//following::*[contains(text(),'"+id+"')]//following::td[4]//a"));
		click(element);	
	}



	/*****************************************     OPT-IN FORBIDDEN LIST ELEMENTS AND METHODS     *****************************
	 *************************************************************************************************************************/
	

	
	
	

	/*****************************************   OPTOUT EMAILS ELEMENTS AND METHODS ******************************
	 *************************************************************************************************************************/


	// Optout Emails link
	@FindBy(xpath = ".//div[@class='siteMasterLeftNavClass']//td//*[contains(text(),'Optout Emails')]")
	private WebElement linkOptoutEmails;
	
	// Optout Emails Title Header Text
	@FindBy(xpath = "//*[@id='ctl00_MainContent_p_helpdeskmsg']")
	private WebElement oeTitleHeaderText;
	
	// Optout Emails enter email address to search input
	@FindBy(xpath = "//*[@id='ctl00_MainContent_tbSearch']")
	private WebElement oeEnterEmailAddressSearchInput;
	
	// Optout Emails go button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_btnSubmit']")
	private WebElement oeGoButton;
	
	// Optout Emails Block button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_dgOptoutAddress_ctl03_lnkActive']")
	private WebElement oeBlockButton;
	
	// Optout Emails UnBlock button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_dgOptoutAddress_ctl03_lnkActive']")
	private WebElement oeUnblockButton;
	
	// Optout Emails Block/Unblock success message
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lbllnkActiveSuccess']")
	private WebElement oeBlockUnblockSuccessMsg;
	
	// Optout Emails BlockEmail Link
	@FindBy(xpath = "//*[@id='ctl00_MainContent_hlBlockAddress']")
	private WebElement oeBlockEmailLink;
	
	// Optout Emails enter email address to Block input
	@FindBy(xpath = "//*[@id='ctl00_MainContent_tbDataID']")
	private WebElement oeEnterEmailAddressBlockInput;
	
	// Optout Emails Block Email button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_btnBlock']")
	private WebElement oeBlockEmailButton;
	
	// Optout Emails Block success message
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lblSuccess']")
	private WebElement oeBlockSuccessMsg;
	
	// Optout Emails Blocked exist error message
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lblDataAlreadyExists']")
	private WebElement oeBlockedExisterrorMsg;
	
	// Optout Emails Search BlockedEmail Link
	@FindBy(xpath = "//*[@id='ctl00_MainContent_hlSearchBlockedData']")
	private WebElement oeSearchBlockedEmailLink;
	
	// Optout Emails Block success message
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lblSuccess']")
	private WebElement oeBlockedSuccessMsg;
	
	

	// ------------------------------------------------------------------------------------------------------------------------//

	public void clickOptoutEmailsLink(){
		
		click(linkOptoutEmails);
	}
	
	public void verifyOETitleHeaderText(String text){
		
		assertionText(oeTitleHeaderText, text);	
	}
	
	public void enterOEEmailAddressToSearch(String email){
		
		setText(oeEnterEmailAddressSearchInput, email);	
	}
	
	public void clickOEGoButton(){
		
		logging("Clicking on : "+oeGoButton.getText());
		oeGoButton.click();
	}
	
	public void clickOEBlockButton(){
		
		click(oeBlockButton);
	}
	
	public void clickOEUnblockButton(){
		
		click(oeUnblockButton);
	}
	
	public void verifyOEBlockUnblockSuccessMessage(String msg){
		
		assertionText(oeBlockUnblockSuccessMsg, msg);	
	}
	
	public void clickOEBlockEmailLink(){
		
		click(oeBlockEmailLink);
	}
	
	public void clickOESearchBlockedEmailLink(){
		
		click(oeSearchBlockedEmailLink);
	}
	
	public void enterOEEmailAddressToBlock(String email){
		
		setText(oeEnterEmailAddressBlockInput, email);	
	}
	
	public void clickOEBlockEmailButton(){
		
		logging("Clicking on : "+oeBlockEmailButton.getText());
		oeBlockEmailButton.click();
	}
	
	public void verifyOEBlockedSuccessMessage(String msg){
		
		assertionText(oeBlockedSuccessMsg, msg);	
	}
	
	public void verifyOEBlockedExistErrorMessage(String msg){
		
		assertionText(oeBlockedExisterrorMsg, msg);	
	}
	

	/*****************************************    OPTOUT EMAILS ELEMENTS AND METHODS     *****************************
	 *************************************************************************************************************************/
	

}
