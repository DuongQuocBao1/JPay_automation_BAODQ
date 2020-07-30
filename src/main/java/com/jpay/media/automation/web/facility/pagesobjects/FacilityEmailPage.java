package com.jpay.media.automation.web.facility.pagesobjects;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;
import org.bouncycastle.util.encoders.Translator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.jpay.media.automation.web.baseobjects.BasePageObject;
import com.jpay.media.automation.web.utilities.Log;

public class FacilityEmailPage extends BasePageObject {

	/************************************************************************************************
	 ******************************************* CONSTRUCTOR*****************************************
	 ************************************************************************************************/

	public FacilityEmailPage(WebDriver driver) {
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

	// Mail Tab Link
	@FindBy(xpath = "(//div[@class='siteMasterHeaderClass']//a[contains(text(),'Mail')])[1]")
	private WebElement linkMail;

	// Word filter system Link
	@FindBy(xpath = "(//a[contains(text(),'Word Filter System')])[1]")
	private WebElement wordFilterSystemLink;

	// Mail Search Link
	@FindBy(xpath = "(//a[contains(text(),'Search')])[1]")
	private WebElement searchMail;
	
	// Word add input box
	@FindBy(xpath = "//*[@id='ctl00_MainContent_LetterMailSummary_lblNoResult']")
	private WebElement letterSearchFailureMessage;

	// Mail Auditing Link
	@FindBy(xpath = "(//*[contains(text(),'Mail Auditing')])[1]")
	private WebElement linkMailAuditing;

	// Mail Graphical report Link
	@FindBy(xpath = "(//*[contains(text(),'Mail Graphical Reports')])[1]")
	private WebElement linkMailGraphical;

	// Inbound Mail Operational Link
	@FindBy(xpath = "(//*[contains(text(),'Inbound Mail Operational Report')])[1]")
	private WebElement linkInboundMailOperational;

	// Mail Operational Link
	@FindBy(xpath = "(//a[contains(text(),'Mail Operational Report')])[1]")
	private WebElement linkMailOperational;

	// Stamp Usage Report Link
	@FindBy(xpath = "(//*[contains(text(),'Stamp Usage Report')])[1]")
	private WebElement linkStampUsage;

	// Suspend Videogram Inmate Link
	@FindBy(xpath = "(//*[contains(text(),'Suspend Videogram Inmate')])[1]")
	private WebElement linkSuspendVideogramInmate;

	// Restricted Videogram Customers Link
	@FindBy(xpath = "(//*[contains(text(),'Restricted Videogram Customers')])[1]")
	private WebElement linkRestrictedVideogramCustomers;

	// +Add Link
	@FindBy(xpath = "(//a[contains(text(),'+ Add')])[1]")
	private WebElement addLink;

	// Word Search Link
	@FindBy(xpath = "//a[contains(text(),'+ Add')]/following-sibling::a[contains(text(),'Search')]")
	private WebElement wordSearchLink;

	// Word add input box
	@FindBy(xpath = "//input[@id='ctl00_MainContent_addWord']")
	private WebElement wordAddInputBox;

	// Word add button
	@FindBy(xpath = "//input[@id='ctl00_MainContent_btn_addword']")
	private WebElement wordAddButton;

	// Word add confirmation text
	@FindBy(xpath = "//span[@id='ctl00_MainContent_lblResultMessage']")
	private WebElement wordAddConText;

	// Search Word input box
	@FindBy(xpath = "//input[@id='ctl00_MainContent_searchstring']")
	private WebElement wordSearchInputBox;

	// Search date verification text
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lbl_createdDate']")
	private WebElement searchedLetterDate;

	// Search Word go button
	@FindBy(xpath = "//input[@id='ctl00_MainContent_btnSubmit']")
	private WebElement wordSearchGoButton;

	// Deactivate checkbox
	@FindBy(xpath = "//input[@id='ctl00_MainContent_MyDataGridSearchDictionary_ctl01_CheckAllDelete']")
	private WebElement deactivateCheckbox;

	// Deactivate Button
	@FindBy(xpath = "//input[@id='ctl00_MainContent_btnDeleteAll']")
	private WebElement deactivateButton;

	// Search Combo box
	@FindBy(xpath = ".//select[@id='ctl00_MainContent_ddlsearchOptionLevel1']")
	private WebElement searchComboBox;
	
	// Search Sub-category Combo box
	@FindBy(xpath = ".//select[@id='ctl00_MainContent_ddlsearchOptionLevel2']")
	private WebElement searchSubCategoryComboBox;

	// Enter Search Content
	@FindBy(xpath = ".//input[@id='ctl00_MainContent_tbSearch']")
	private WebElement searchContent;

	// Search go Button
	@FindBy(xpath = ".//input[@id='ctl00_MainContent_btnGo']")
	private WebElement goButton;
	
	// Search show older messages checkbox
	@FindBy(xpath = ".//input[@id='ctl00_MainContent_cbShowOlderMails']")
	private WebElement searchShowOlderMsgCheckbox;

	// View Link
	@FindBy(xpath = "(//a[contains(text(),'View')])[1]")
	private WebElement viewLink;

	// Letter Status
	@FindBy(xpath = ".//span[@id='ctl00_MainContent_lbl_titleheader']")
	private WebElement letterStatus;

	// Letter Approve Button
	@FindBy(xpath = ".//a[@id='ctl00_MainContent_lnk_Approve']")
	private WebElement letterApproveButton;

	// Letter Send to Security Button
	@FindBy(xpath = ".//a[@id='ctl00_MainContent_lnk_Security']")
	private WebElement letterSendToSecurityButton;

	// Letter Return to Customer Button
	@FindBy(xpath = ".//a[@id='ctl00_MainContent_lnk_Return']")
	private WebElement letterReturnToCustomerButton;

	// Letter Send To Cencored Button
	@FindBy(xpath = ".//a[@id='ctl00_MainContent_lnk_Censore']")
	private WebElement letterSendToCencoredButton;

	// Letter Send Reason selection
	@FindBy(xpath = ".//select[@id='ctl00_MainContent_securitystatus']")
	private WebElement selectReason;

	// Letter Send Reason selection options
	@FindAll({ @FindBy(xpath = ".//select[@id='ctl00_MainContent_securitystatus']/option") })
	private List<WebElement> selectReasonOptions;

	// Type Comment
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lettercomment']")
	private WebElement typeComment;

	// Letter Send to Security Button
	@FindBy(xpath = ".//input[@id='ctl00_MainContent_btn_security']")
	private WebElement sendToSecurityButton;

	// First Attachment Discard checkbox
	@FindBy(xpath = ".//input[@id='ctl00_MainContent_attachmentDataList_ctl01_AttachmentCheckBox']")
	private WebElement firstAttaDiscardcheckbox;

	// Second Attachment Discard checkbox
	@FindBy(xpath = ".//input[@id='ctl00_MainContent_attachmentDataList_ctl02_AttachmentCheckBox']")
	private WebElement secondAttaDiscardcheckbox;

	// First Photo Attachment
	@FindBy(xpath = ".//input[@id='ctl00_MainContent_attachmentDataList_ctl01_AttachmentImage']")
	private WebElement firstPhotoAttachment;

	// Photo Attachment close button
	@FindBy(xpath = ".//input[@id='ctl00_MainContent_CancelImageButton']")
	private WebElement photoAttachmentCloseButton;

	// Second Photo Attachment
	@FindBy(xpath = ".//input[@id='ctl00_MainContent_attachmentDataList_ctl02_AttachmentImage']")
	private WebElement secondPhotoAttachment;

	// Discard Image Button
	@FindBy(xpath = ".//input[@id='ctl00_MainContent_btnDelete']")
	private WebElement discardImageButton;

	// Discard message Content Button
	@FindBy(xpath = ".//a[@id='ctl00_MainContent_lnkRemoveContent']")
	private WebElement discardMsgContentButton;

	// Discard message Content success text
	@FindBy(xpath = "(.//span[@id='ctl00_MainContent_lbl_letter']/span)[1]")
	private WebElement discardMsgContentSuccessText;

	// View letter from all location
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lnkAllPermLocs']")
	private WebElement viewLetterAllLocationLink;
	
	// Select Mail Auditing Mail Type
	@FindBy(xpath = ".//select[@id='ctl00_MainContent_ddlMailType']")
	private WebElement selectMailAudMailType;
	
	// Mail Auditing From Date Input
	@FindBy(xpath = ".//input[@id='ctl00_MainContent_fromdate']")
	private WebElement mailAuditingMailFromDateInput;
	
	// Mail Auditing To Date Input
	@FindBy(xpath = ".//input[@id='ctl00_MainContent_todate']")
	private WebElement mailAuditingMailToDateInput;
	
	// Mail Auditing Generate Button
	@FindBy(xpath = ".//input[@id='ctl00_MainContent_btnSubmit2']")
	private WebElement mailAuditingGenerateButton;
	
	// Select Mail Auditing Page to show
	@FindBy(xpath = ".//select[@id='ctl00_MainContent_ps']")
	private WebElement selectMailAudPageToShow;
	
	// Mail Auditing Go Button
	@FindBy(xpath = ".//input[@id='ctl00_MainContent_Button1']")
	private WebElement mailAuditingGoButton;
	
	// Mail Auditing No of actions text
	@FindBy(xpath = ".//div[@id='ctl00_MainContent_pMailAuditingGrid']//td[contains(text(),'# of Actions')]")
	private WebElement mailAuditingNoOfActionsText;

	// Mail Graphical Reports archived data checkbox
	@FindBy(xpath = ".//input[@id='ctl00_MainContent_cbShouldUseArchive']")
	private WebElement mailGraphicalReportArchivedDataCheckbox;

	// Mail Graphical Reports Show Reports button
	@FindBy(xpath = ".//input[@id='ctl00_MainContent_btnShowGraphs']")
	private WebElement mailGraphicalReportsShowGraphsButton;

	// Mail Graphical View Report for printing text
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lnkViewPrint']")
	private WebElement mailGraphicalViewReportPrintingText;

	// Inbound mail operational report from date input
	@FindBy(xpath = ".//input[@id='ctl00_MainContent_uclDatesSelection_tbFromDate']")
	private WebElement inboundMailOperationalReportFromInput;

	// Inbound mail operational report to date input
	@FindBy(xpath = ".//input[@id='ctl00_MainContent_uclDatesSelection_tbToDate']")
	private WebElement inboundMailOperationalReportToInput;

	//  Inbound mail operational report archived data checkbox
	@FindBy(xpath = ".//input[@id='ctl00_MainContent_cbShouldUseArchive']")
	private WebElement inboundMailOperationalReportArchivedDataCheckbox;

	//  Inbound mail operational report view button
	@FindBy(xpath = ".//input[@id='ctl00_MainContent_btnView']")
	private WebElement inboundMailOperationalViewButton;

	// Inbound mail operational No of letters text
	@FindBy(xpath = ".//div[@id='ctl00_MainContent_p_Report']//td[contains(text(),'# Of Letters')]")
	private WebElement inboundMailOperationalNoOfLettersText;

	//  Inbound mail operational letters export to file button
	@FindBy(xpath = ".//input[@id='ctl00_MainContent_btnExport']")
	private WebElement inboundMailOperationalLetterExportFileButton;
	
	//  Stamps usage created date
	@FindBy(xpath = ".//a[@id='ctl00_MainContent_dgMailReport_ctl04_lnkCreatedDate']")
	private WebElement stampsUsageCreatedDateButton;

	//  Stamp usage report archived data checkbox
	@FindBy(xpath = ".//input[@id='ctl00_MainContent_cbIncludeArchive']")
	private WebElement stampUsageReportArchivedDataCheckbox;
	
	// Suspend Videogram Inmate Message
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lblInfo']/b")
	private WebElement suspendVideogramInmateMsg;

	// Suspend Videogram Inmate Id Input
	@FindBy(xpath = "//*[@id='ctl00_MainContent_txtInmateID']")
	private WebElement suspendVideogramInmateIdInput;

	// Suspend Videogram View Inmate Details Button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_btnViewInmateDetails']")
	private WebElement suspendVideogramViewInmateDetailsButton;

	// Suspend Videogram Inmate Id
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lblInmateID']")
	private WebElement suspendVideogramInmateId;

	// Suspend Videogram Inmate name
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lblInmateName']")
	private WebElement suspendVideogramInmateName;

	// Suspend Videogram Inmate Location
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lblLocation']")
	private WebElement suspendVideogramInmateLocation;

	// Suspend Videogram Inmate Housing
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lblHousing']")
	private WebElement suspendVideogramInmateHouse;

	// Suspend Videogram Inmate Status
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lblStatus']")
	private WebElement suspendVideogramInmateStatus;

	// Suspend Videogram Suspend date input
	@FindBy(xpath = "//*[@id='ctl00_MainContent_txtVideogramSuspendDate']")
	private WebElement susVideogramSuspendDateInput;
	
	// Suspend Videogram Cancel button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_btnCancel']")
	private WebElement suspendVideogramCancelButton;
	
	// Suspend Videogram Cancel button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_btnInsertNew']")
	private WebElement suspendVideogramSuspendUpdateButton;
	
	// Suspend Videogram Update message
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lbl_Success']")
	private WebElement suspendVideogramUpdateSuccessMsg;
	
	// Suspend Videogram Edit button after suspend
	@FindBy(xpath = "//table[@id='ctl00_MainContent_dgSuspendedInmates']//tr[2]//*[contains(text(),'Edit')]")
	private WebElement susVideogramEditButtonAfterSus;
	
	// Suspend Videogram Update Button after suspend
	@FindBy(xpath = "//table[@id='ctl00_MainContent_dgSuspendedInmates']//tr[2]//*[contains(text(),'Update')]")
	private WebElement susVideogramUpdateButtonAfterSus;
	
	// Suspend Videogram Update message
	@FindBy(xpath = "//table[@id='ctl00_MainContent_dgSuspendedInmates']//tr[2]//*[contains(text(),'Cancel')]")
	private WebElement susVideogramCancelAfterSus;
	
	// Suspend Videogram Update message
	@FindBy(xpath = "//table[@id='ctl00_MainContent_dgSuspendedInmates']//tr[2]//*[contains(text(),'Remove')]")
	private WebElement susVideogramRemoveButtonAfterSus;

	// Restricted Videogram Add Button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lnkAddUsers']")
	private WebElement restVideogramAddButton;

	// Restricted Videogram Search Button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lnkSearchUsers']")
	private WebElement restVideogramSearchButton;
	
	// Restricted Videogram Account id to block input
	@FindBy(xpath = "//*[@id='ctl00_MainContent_tbNewRestrictedUser']")
	private WebElement restVideogramAccIdToBlockInput;

	// Restricted Videogram Add Customer Button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_btnInsert']")
	private WebElement restVideogramAddCustomerButton;

	// Restricted Videogram Suspend date input
	@FindBy(xpath = "//*[@id='ctl00_MainContent_txtVideogramSuspendDate']")
	private WebElement restVideogramSusDateInput;

	// Restricted Videogram Update Message
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lblMessage']")
	private WebElement restricedVideogramActionUpdateMsg;

	// Restricted Videogram Delete Button
	@FindBy(xpath = "//table//tr//td[contains(text(),'Delete')]//following::td//a[contains(text(),'Delete')]")
	private WebElement restVideogramDeleteButton;

	// Restricted Videogram Account to search input
	@FindBy(xpath = "//*[@id='ctl00_MainContent_tbIDToSearch']")
	private WebElement restVideogramAccIdToSearchInput;

	// Restricted Videogram Go Button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_btnSubmit']")
	private WebElement restVideogramGoButton;
	
	// Select Letter Delivery Summary Months
	@FindBy(xpath = ".//select[@id='ctl00_MainContent_cmbxMonths']")
	private WebElement selectLetterDeliverySummaryMonths;

	// Inbound Requires Aproval Link
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lnkMailBucketInRequiresApproval']")
	private WebElement inboundRequiresApprovalLink;

	// Inbound Requires Aproval Letter count
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lblPendingApproval2In']")
	private WebElement inboundRequiresApprovalLetterCount;
	
	// Inbound Photo Approval Letter count
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lblPhotoApprovalCount']")
	private WebElement inboundPhotoApprovalLetterCount;
	
	// Inbound Photo Approval Link
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lnkMailBucketPhotoApprovalInbound']")
	private WebElement inboundPhotoApprovalLink;
	
	// Inbound Video Requires Approval Link
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lnkMailBucketInRequiresApprovalWithVideos']")
	private WebElement InboundVideoRequiresApprovalLink;
	
	// Inbound Video Requires Approval Letter count
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lblPendingApproval2InWithVideos']")
	private WebElement InboundVideoRequiresApprovalLetterCount;

	// Inbound Ready To Print or Release Letter count
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lblPendingPrint2In']")
	private WebElement inboundReadyToPrintLetterCount;

	// Inbound Ready To Print or Release Link
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lnkMailBucketInReadyToPrintOrRelease']")
	private WebElement inboundReadyToPrintLink;

	// Inbound Printed Link
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lnkMailBucketInPrinted']")
	private WebElement inboundPrintedLink;

	// Inbound Printed Letter count
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lblPrinted2In']")
	private WebElement inboundPrintedLetterCount;

	// Inbound Released Bucket Link
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lnkMailBucketInReleased']")
	private WebElement inboundReleasedBucketLink;

	// Inbound Released Bucket Letter Count
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lblReleasedIn']")
	private WebElement inboundReleasedBucketLetterCount;

	// Inbound Sent to Security Bucket Link
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lnkMailBucketInSentToSecurity']")
	private WebElement inboundSentToSecurityLink;

	// Inbound Sent to Security Bucket Letter Count
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lblSentToSecurity2In']")
	private WebElement inboundSentToSecurityLetterCount;

	// Inbound Returned To Customer Link
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lnkMailBucketInReturnedToCustomer']")
	private WebElement inboundReturnedToCustomerLink;

	// Inbound Returned To Customer Letter Count
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lblReturnedToSender2In']")
	private WebElement inboundReturnedToCustomerLetterCount;

	// Inbound Censored Link
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lnkMailBucketInCensored']")
	private WebElement inboundCensoredLink;

	// Inbound Censored Letter Count
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lblCensored2In']")
	private WebElement inboundCensoredLetterCount;

	// Inbound Released Video Link
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lnkMailBucketInReleasedWithVideos']")
	private WebElement inboundReleasedVideoLink;

	// Inbound Released Video Letter Count
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lblReleased2InWithVideos']")
	private WebElement inboundReleasedVideoLetterCount;
	
	// Outbound Requires Approval link
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lnkMailBucketOutRequiresApproval']")
	private WebElement outboundRequiresApprovalLink;
	
	// Outbound Requires Approval Letter Count
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lblPendingApproval2Out']")
	private WebElement outboundRequiresApprovalLetterCount;
	
	// Outbound Photo Approval Approval link
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lnkMailBucketPhotoApprovalOutbound']")
	private WebElement outboundPhotoApprovalLink;
	
	// Outbound Photo Approval Approval Letter Count
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lblOutboundPhotoApprovalCnt']")
	private WebElement outboundPhotoApprovalLetterCount;
	
	// Outbound Video Requires Approval link
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lnkMailBucketOutRequiresApprovalWithVideos']")
	private WebElement outboundVideoRequiresApprovalLink;
	
	// Outbound Video Requires Approval Letter Count
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lblPendingApproval2OutWithVideos']")
	private WebElement outboundVideoRequiresApprovalLetterCount;
	
	// Outbound Ready to print/release Letter Count
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lblPendingReleasedOut']")
	private WebElement outboundReadyToPrintLetterCount;
	
	// Outbound Ready to print/release link
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lnkMailBucketOutReadyToRelease']")
	private WebElement outboundReadyToPrintLink;
	
	// Outbound Released Letter Count
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lblReleasedOut']")
	private WebElement outboundReleasedBucketLetterCount;
	
	// Outbound Released Link
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lnkMailBucketOutReleased']")
	private WebElement outboundReleasedBucketLink;
	
	// Outbound Sent to security Link
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lnkMailBucketOutSentToSecurity']")
	private WebElement outboundSentToSecurityLink;
	
	// Outbound Sent to security Letter Count
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lblSentToSecurity2Out']")
	private WebElement outboundSentToSecurityLetterCount;
	
	// Outbound Censored Letter Count
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lblCensored2Out']")
	private WebElement outboundCensoredLetterCount;
	
	// Outbound Censored Link
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lnkMailBucketOutCensored']")
	private WebElement outboundCensoredLink;
	
	// Outbound Pending Printed Items Link
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lnkMailBucketOutPendingPrintItems']")
	private WebElement outboundPendingPrintingItemsLink;
	
	// Outbound Pending Printed Items Letter Count
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lblPendingPrintItemsOut']")
	private WebElement outboundPendingPrintingItemsLetterCount;
	
	// Outbound Printed Items Link
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lnkMailBucketOutPrintedItems']")
	private WebElement outboundPrintedItemsLink;
	
	// Outbound Printed Items Letter Count
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lblPrintedItemsOut']")
	private WebElement outboundPrintedItemsLetterCount;
	
	// Outbound Released Video Link
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lnkMailBucketOutReleasedWithVideos']")
	private WebElement outboundReleasedVideoLink;
	
	// Outbound Released Video Letter Count
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_lblReleased2OutWithVideos']")
	private WebElement outboundReleasedVideoLetterCount;

	// Select Number Of Pages Of Letters To Show1
	@FindBy(xpath = ".//select[@id='ctl00_MainContent_Ps']")
	private WebElement selectNumberOfPagesOfLettersToShow1;
	
	// Select Number Of Pages Of Letters To Show1
	@FindBy(xpath = ".//select[@id='ctl00_MainContent_ps']")
	private WebElement selectNumberOfPagesOfLettersToShow2;
	
	// Number Of Pages Of Letters To Show GO Button
	@FindBy(xpath = ".//input[@id='ctl00_MainContent_Button1']")
	private WebElement numberOfPagesOfLettersToShowGoButton;
	
	// Number Of Pages Of Letters To Show Last Page Button
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_Lastbutton']")
	private WebElement numberOfPagesOfLettersToShowLastPageButton;
	
	// Number Of Pages Of Letters To Show First Page Button
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_Firstbutton']")
	private WebElement numberOfPagesOfLettersToShowFirstPageButton;
	
	// Main Button to go to different email Home Buckets
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_MailSmallNavbar1_bMain']")
	private WebElement mainButton;
	
	// Home page back button
    @FindBy(xpath = "(//table//*[contains(text(),'Back')])[1]")
	private WebElement backButton;

	// Customer Information Text
	@FindBy(xpath = "(.//*[@id='ctl00_MainContent_CustomerInformation_dlCustomer']//td/font)[1]")
	private WebElement customerInformationText;

	// Inmate Information Text
	@FindBy(xpath = "(.//*[@id='ctl00_MainContent_InmateInformation_dlInmate']//td/font)[1]")
	private WebElement inmateInformationText;

	// Mail Search Free text Search radio button
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_rbFreeTextSearch']")
	private WebElement freeTextSearchRadioButton;

	// Mail Search Free text Search INPUT
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_tbFreeText']")
	private WebElement mailSearchFreetextInput;

	// Mail Search Free text Search A PHRASE CHECKBOX
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_cbSearchPhrase']")
	private WebElement mailSearchAPhraseCheckbox;

	// Mail Search Free text Search go button
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_btnFreeTextGo']")
	private WebElement mailFreeTextSearchGoButton;

	// Mail Search Free text Search go button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_MailIDsMail_pnlMailsReceived']//table[1]//font//b")
	private WebElement mailFreeTextSearchLetterReceivedText;

	// Mail Search Free text Search go button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_MailIDsMail_pnlMailsSend']//table[1]//font//b")
	private WebElement mailFreeTextSearchLetterSentText;

	// Letter Received View button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_MailIDsMail_dgMailReceived_ctl03_hlView']")
	private WebElement letterReceivedViewButton;

	// Letter Search Repair Videogram lnik
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lnkRepairVideogram']")
	private WebElement repairVideogramLink;

	// Letter Search Download Videogram lnik
	@FindBy(xpath = "//*[@id='ctl00_MainContent_buttonLinkDownloadId']")
	private WebElement downloadVideogramLink;

	// Letter Approve lnik
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lnk_Approve']")
	private WebElement letterApproveLink;

	// Letter Print lnik
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lnkPrintLetter']")
	private WebElement letterPrintLink;

	// Snap'n send icon
	@FindBy(xpath = "//*[@id='ctl00_MainContent_LetterMailSummary_dgLetterMailSummary_ctl03_imgAttachment']")
	private WebElement snapNSendIcon;

	// Inmate Name
	@FindBy(xpath = "//*[@id='ctl00_MainContent_sRecipientName']")
	private WebElement searchInmateName;

	// Inmate id
	@FindBy(xpath = "//*[@id='ctl00_MainContent_sInmateID']")
	private WebElement searchInmateId;

	// Customer Name
	@FindBy(xpath = "//*[@id='ctl00_MainContent_sSenderFLName']")
	private WebElement searchCustomerName;

	// Customer id
	@FindBy(xpath = "//*[@id='ctl00_MainContent_sSenderAccountID']")
	private WebElement searchCustomerId;

	// Snap'n send text verify
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lbl_letter']")
	private WebElement searchSnapNSendText;

	// Letter status update message
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lblLetterSent']")
	private WebElement statusUpdateMsg;
	
	// Select Sort By
	@FindBy(xpath = ".//select[@id='ctl00_MainContent_sortDropDownList']")
	private WebElement selectSortBy;

	// First Attachment link
	@FindBy(xpath = "//*[@id='ctl00_MainContent_attachmentDataList_ctl01_AttachmentImage']")
	private WebElement firstAttachmentLink;

	// Discard Selected Button 
	@FindBy(xpath = "//*[@id='ctl00_MainContent_discardButtonID']")
	private WebElement discardSelectedButton;

	// Approve Selected Button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_approve_selectedid']")
	private WebElement approveSelectedButton;

	// Approve/Disapprove/Sent to security popup message
	@FindBy(xpath = ".//span[@id='ctl00_MainContent_lblPopMessageText']")
	private WebElement appDisAppSentSecurityPopupMsg;

	// Approve/Disapprove/Sent to security popup cancel button
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_btnCancelModalPopup']")
	private WebElement appDisAppSentSecurityPopupCancelButton;

	// Approve/Disapprove/Sent to security popup yes button
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_btnYes']")
	private WebElement appDisAppSentSecurityPopupYesButton;
	
	// Select Sent To Security Reason
	@FindBy(xpath = ".//select[@id='ctl00_MainContent_securitystatus']")
	private WebElement sentToSecurityReason;

	// Second Attachment link
	@FindBy(xpath = "//*[@id='ctl00_MainContent_attachmentDataList_ctl02_AttachmentImage']")
	private WebElement secondAttachmentLink;

	// Translet Email link
	@FindBy(xpath = "//*[@id='ctl00_MainContent_LinkButtonTranslate']")
	private WebElement transletEmailLink;

	// Translet Email link
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lbl_letter']")
	private WebElement emailMessageContent;
	
	


	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	/************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD***********************
	 ************************************************************************************************/

	
	
	
	
	/****************************************    LETTER  SEARCH  METHODS   *************************************************
	 *************************************************************************************************************************/
	


	public void searchByLetterId() {
		selectElementByVisibleText(searchComboBox, "Letter ID");
	}
	
	public void searchLetterBy(String category) {
		logging("Searching Letter By : "+category);
		selectElementByVisibleText(searchComboBox, category);
	}
	
	public void searchLetterBySubCategory(String subCategory) {
		logging("Searching Letter By Sub-Category : "+subCategory);
		selectElementByVisibleText(searchSubCategoryComboBox, subCategory);
	}

	public void clickSearchGoButton() {

		logging("Clicking on : " + goButton.getAttribute("value"));
		goButton.click();
	}

	public void enterSearchContent(String content) {

		setText(searchContent, content);
	}

	public void enterSearchContent() {

		String content;
		Date d=new Date();
		SimpleDateFormat  formatetter=new SimpleDateFormat ("MM/dd/yyyy");
		content = formatetter.format(d);
		setText(searchContent, content);
	}

	public void checkShowOlderMessageCheckbox(){
		
		logging("Checking on Show Older Message checkbox.");
		if (!searchShowOlderMsgCheckbox.isSelected()) {
			pressSpace(searchShowOlderMsgCheckbox);
		}
		
	}
	
	public void clickSearchViewButton() {

		click(viewLink);
	}

	public void verifyLetterStatus(String status) {

		assertionText("Letter Status :: ", letterStatus, status);
	}

	public void verifyEmailMessageContent(String emailContent) {

		pause(2000);
		assertionText("Email :: ", emailMessageContent, emailContent);
	}

	public void verifyTransletedEmailMessageContent(String emailContent,String englishContent) {

		pause(2000);
		/*String []split=emailContent.split(" ");
		int size=split.length;
		String last= split[size-1];
		String toTranslate=englishContent.concat(" ").concat(last);*/
		logging("Spanish :: "+emailContent);
		logging("English :: "+emailMessageContent.getText());
		assertTrue(isElementDisplayed(emailMessageContent));
		//assertionText("Email :: ", emailMessageContent, englishContent);
	}

	public boolean isInboundOutboundBuckectExpected(WebElement element){
		
		int count = Integer.parseInt(element.getText());
		if (count ==0 || count >0) {
			
			return true;
		}
		return false;
	}

	public void verifyInboundRequiresApprovalLetterCount(){
		
		logging("Inbound Requires Approval Letter Count 0 or greater than 0 : "+isInboundOutboundBuckectExpected(inboundRequiresApprovalLetterCount));
		logging("Inbound Requires Approval Letter Count : "+inboundRequiresApprovalLetterCount.getText());
		assertTrue(isInboundOutboundBuckectExpected(inboundRequiresApprovalLetterCount));
	}

	public void verifyInboundPhotoApprovalLetterCount(){
		
		logging("Inbound Photo Approval Letter Count 0 or greater than 0 : "+isInboundOutboundBuckectExpected(inboundPhotoApprovalLetterCount));
		logging("Inbound Photo Approval Letter Count : "+inboundPhotoApprovalLetterCount.getText());
		assertTrue(isInboundOutboundBuckectExpected(inboundPhotoApprovalLetterCount));
	}

	public void verifyInboundVideoRequiresApprovalLetterCount(){
		
		logging("Inbound VideoRequires Approval Letter Count 0 or greater than 0 : "+isInboundOutboundBuckectExpected(InboundVideoRequiresApprovalLetterCount));
		logging("Inbound VideoRequires Approval Letter Count : "+InboundVideoRequiresApprovalLetterCount.getText());
		assertTrue(isInboundOutboundBuckectExpected(InboundVideoRequiresApprovalLetterCount));
	}

	public void verifyInboundReadyToPrintOrReleaseApprovalLetterCount(){
		
		logging("Inbound ReadyToPrintOrRelease  Letter Count 0 or greater than 0 : "+isInboundOutboundBuckectExpected(inboundReadyToPrintLetterCount));
		logging("Inbound ReadyToPrintOrRelease  Letter Count : "+inboundReadyToPrintLetterCount.getText());
		assertTrue(isInboundOutboundBuckectExpected(inboundReadyToPrintLetterCount));
	}

	public void verifyInboundPrintedLetterCount(){
		
		logging("Inbound Printed Letter Count 0 or greater than 0 : "+isInboundOutboundBuckectExpected(inboundPrintedLetterCount));
		logging("Inbound Printed Letter Count : "+inboundPrintedLetterCount.getText());
		assertTrue(isInboundOutboundBuckectExpected(inboundPrintedLetterCount));
	}

	public void verifyInboundReleasedLetterCount(){
		
		logging("Inbound Released Letter Count 0 or greater than 0 : "+isInboundOutboundBuckectExpected(inboundReleasedBucketLetterCount));
		logging("Inbound Released Letter Count : "+inboundReleasedBucketLetterCount.getText());
		assertTrue(isInboundOutboundBuckectExpected(inboundReleasedBucketLetterCount));
	}

	public void verifyInboundSentToSecurityLetterCount(){
		
		logging("Inbound SentToSecurity Letter Count 0 or greater than 0 : "+isInboundOutboundBuckectExpected(inboundSentToSecurityLetterCount));
		logging("Inbound SentToSecurity Letter Count : "+inboundSentToSecurityLetterCount.getText());
		assertTrue(isInboundOutboundBuckectExpected(inboundSentToSecurityLetterCount));
	}

	public void verifyInboundReturnedToCustomerLetterCount(){
		
		logging("Inbound ReturnedToCustomer  Letter Count 0 or greater than 0 : "+isInboundOutboundBuckectExpected(inboundReturnedToCustomerLetterCount));
		logging("Inbound ReturnedToCustomer  Letter Count : "+inboundReturnedToCustomerLetterCount.getText());
		assertTrue(isInboundOutboundBuckectExpected(inboundReturnedToCustomerLetterCount));
	}

	public void verifyInboundCensoredLetterCount(){
		
		logging("Inbound Censored Letter Count 0 or greater than 0 : "+isInboundOutboundBuckectExpected(inboundCensoredLetterCount));
		logging("Inbound Censored Letter Count : "+inboundCensoredLetterCount.getText());
		assertTrue(isInboundOutboundBuckectExpected(inboundCensoredLetterCount));
	}

	public void verifyInboundReleasedVideoLetterCount(){
		
		logging("Inbound ReleasedVideo Letter Count 0 or greater than 0 : "+isInboundOutboundBuckectExpected(inboundReleasedVideoLetterCount));
		logging("Inbound ReleasedVideo Letter Count : "+inboundReleasedVideoLetterCount.getText());
		assertTrue(isInboundOutboundBuckectExpected(inboundReleasedVideoLetterCount));
	}

	public void verifyOutboundRequiresApprovalLetterCount(){
		
		logging("Outbound Requires Approval Letter Count 0 or greater than 0 : "+isInboundOutboundBuckectExpected(outboundRequiresApprovalLetterCount));
		logging("Outbound Requires Approval Letter Count : "+outboundRequiresApprovalLetterCount.getText());
		assertTrue(isInboundOutboundBuckectExpected(outboundRequiresApprovalLetterCount));
	}

	public void verifyOutboundPhotoApprovalLetterCount(){
		
		logging("Outbound Photo Approval Letter Count 0 or greater than 0 : "+isInboundOutboundBuckectExpected(outboundPhotoApprovalLetterCount));
		logging("Outbound Photo Approval Letter Count : "+outboundPhotoApprovalLetterCount.getText());
		assertTrue(isInboundOutboundBuckectExpected(outboundPhotoApprovalLetterCount));
	}

	public void verifyOutboundVideoRequiresApprovalLetterCount(){
		
		logging("Outbound VideoRequires Approval Letter Count 0 or greater than 0 : "+isInboundOutboundBuckectExpected(outboundVideoRequiresApprovalLetterCount));
		logging("Outbound VideoRequires Approval Letter Count : "+outboundVideoRequiresApprovalLetterCount.getText());
		assertTrue(isInboundOutboundBuckectExpected(outboundVideoRequiresApprovalLetterCount));
	}

	public void verifyOutboundReadyToPrintOrReleaseApprovalLetterCount(){
		
		logging("Outbound ReadyToPrintOrRelease  Letter Count 0 or greater than 0 : "+isInboundOutboundBuckectExpected(outboundReadyToPrintLetterCount));
		logging("Outbound ReadyToPrintOrRelease  Letter Count : "+outboundReadyToPrintLetterCount.getText());
		assertTrue(isInboundOutboundBuckectExpected(outboundReadyToPrintLetterCount));
	}

	public void verifyOutboundReleasedLetterCount(){
		
		logging("Outbound Released Letter Count 0 or greater than 0 : "+isInboundOutboundBuckectExpected(outboundReleasedBucketLetterCount));
		logging("Outbound Released Letter Count : "+outboundReleasedBucketLetterCount.getText());
		assertTrue(isInboundOutboundBuckectExpected(outboundReleasedBucketLetterCount));
	}

	public void verifyOutboundSentToSecurityLetterCount(){
		
		logging("Outbound SentToSecurity Letter Count 0 or greater than 0 : "+isInboundOutboundBuckectExpected(outboundSentToSecurityLetterCount));
		logging("Outbound SentToSecurity Letter Count : "+outboundSentToSecurityLetterCount.getText());
		assertTrue(isInboundOutboundBuckectExpected(outboundSentToSecurityLetterCount));
	}

	public void verifyOutboundCensoredLetterCount(){
		
		logging("Outbound Censored Letter Count 0 or greater than 0 : "+isInboundOutboundBuckectExpected(outboundCensoredLetterCount));
		logging("Outbound Censored Letter Count : "+outboundCensoredLetterCount.getText());
		assertTrue(isInboundOutboundBuckectExpected(outboundCensoredLetterCount));
	}

	public void verifyOutboundPendingPrintItemsLetterCount(){
		
		logging("Outbound Print Letter Count 0 or greater than 0 : "+isInboundOutboundBuckectExpected(outboundPendingPrintingItemsLetterCount));
		logging("Outbound Print Letter Count : "+outboundPendingPrintingItemsLetterCount.getText());
		assertTrue(isInboundOutboundBuckectExpected(outboundPendingPrintingItemsLetterCount));
	}

	public void verifyOutboundPrintedItemsLetterCount(){
		
		logging("Outbound PrintedItems  Letter Count 0 or greater than 0 : "+isInboundOutboundBuckectExpected(outboundPrintedItemsLetterCount));
		logging("Outbound PrintedItems  Letter Count : "+outboundPrintedItemsLetterCount.getText());
		assertTrue(isInboundOutboundBuckectExpected(outboundPrintedItemsLetterCount));
	}

	public void verifyOutboundReleasedVideoLetterCount(){
		
		logging("Outbound ReleasedVideo Letter Count 0 or greater than 0 : "+isInboundOutboundBuckectExpected(outboundReleasedVideoLetterCount));
		logging("Outbound ReleasedVideo Letter Count : "+outboundReleasedVideoLetterCount.getText());
		assertTrue(isInboundOutboundBuckectExpected(outboundReleasedVideoLetterCount));
	}
	
	public void verifyLetterSearchFailureMessage(String message) {

		assertionText("Letter Search Failure Message :: ", letterSearchFailureMessage, message);
	}

	public void clickLetterApproveButton() {

		click(letterApproveButton);
		pause(3000);
	}

	public void clickLetterSendToSecurityButton() {

		click(letterSendToSecurityButton);
	}

	public void clickLetterReturnToCustomerButton() {

		click(letterReturnToCustomerButton);
	}

	public void clickLetterSendToCensoredButton() {

		click(letterSendToCencoredButton);
	}
	
	public void clickLetterPrintButton(){
		
		click(letterPrintLink);
	}
	
	public void clickTransletEmailButton(){
		
		click(transletEmailLink);
	}

	public void selectReason() {

		pause(1000);
		List<WebElement> selectReasonOption = getDriver()
				.findElements(By.xpath(".//select[@id='ctl00_MainContent_securitystatus']/option"));
		int size = selectReasonOption.size();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(size);
		if (randomInt==size) {
			randomInt=size-1;
		}
		Log.info(">>>><<<<<   " + randomInt);
		selectElementByIndex(selectReason, randomInt);
		logging("Reason Selected : " + selectReasonOption.get(randomInt).getText());

	}

	public void enterComment(String comment) {

		setText(typeComment, comment);
	}

	public void clickSendToSecurityButton() {

		logging("Clicking on : " + sendToSecurityButton.getAttribute("value"));
		sendToSecurityButton.click();

	}

	public void clickSendToCensoredButton() {

		logging("Clicking on : " + sendToSecurityButton.getAttribute("value"));
		sendToSecurityButton.click();

	}

	public void clickReturnedToCustomerButton() {

		logging("Clicking on : " + sendToSecurityButton.getAttribute("value"));
		sendToSecurityButton.click();

	}

	public void check1stCheckbox() {

		logging("Checking checkbox of 1st attached immage");
		pressSpace(firstAttaDiscardcheckbox);
	}

	public void check2stCheckbox() {

		logging("Checking checkbox of 2st attached immage");
		pressSpace(secondAttaDiscardcheckbox);
	}
	
	public void click1stPhotoAttachment() {

		logging("Clicking on 1st Photo attachment.");
		firstPhotoAttachment.click();
	}
	
	public void click2ndPhotoAttachment() {

		logging("Clicking on 2nd Photo attachment.");
		secondPhotoAttachment.click();
	}
	
	public void clickPhotoAttachmentCloseButton() {

		logging("Clicking on Photo attachment Close Button.");
		wait.until(ExpectedConditions.visibilityOf(photoAttachmentCloseButton));
		photoAttachmentCloseButton.click();
		pause(1000);
	}

	public void clickDiscardImageButton() {

		logging("Click on : " + discardImageButton.getAttribute("value"));
		wait.until(ExpectedConditions.visibilityOf(discardImageButton));
		discardImageButton.click();
	}

	public void clickDiscardMsgContentLink() {

		click(discardMsgContentButton);
	}

	public void verifyDiscardMsgContentSuccessText(String text) {

		assertionText(discardMsgContentSuccessText, text);
	}

	public void verifyPrepaidStampsStatusByLetterId(String letterid, String text) {

		String xpathText = "JPMSL" + letterid;
		WebElement element = getDriver()
				.findElement(By.xpath("(//td[contains(text(),'" + xpathText + "')]//following::span)[1]"));
		assertionText("Prepaid Stamps Status of Letter id - " + letterid + " :: ", element, text);

	}

	public void clickViewLinkFromReleasedByLetterId(String letterid) {

		String xpathText = "JPMSL" + letterid;
		WebElement element = getDriver()
				.findElement(By.xpath("(//td[contains(text(),'" + xpathText + "')]//following::a)[1]"));
		logging("Clicking on : " + element.getText() + " -link of Letter id - " + letterid);
		element.click();
	}

	public boolean isLetterSearchResultPresent(String letterId){
		
		try {
			WebElement element = getDriver().findElement(By.xpath("//*[@id='ctl00_MainContent_LetterMailSummary_dgLetterMailSummary']"
					+ "//tr[2]//td[contains(text(),'"+letterId+"')]"));
			return element.isDisplayed();
			
		} catch (Exception e) {
			
		}
		
		return false;
	}
	
	public void verifyLetterSearchResultPresent(String letterId){
		
		pause(1000);
		logging("Searched Letter is Present : "+isLetterSearchResultPresent(letterId));
		assertTrue(isLetterSearchResultPresent(letterId));
	}
	
	public void verifyLetterSearchResultAbsent(String letterId){
		
		logging("Searched Letter is Absent : "+!isLetterSearchResultPresent(letterId));
		assertTrue(!isLetterSearchResultPresent(letterId));
	}
	
	public void verifySearchedLetterStatusPresent(){
		
		logging("Letter Status is Present : "+isElementDisplayed(letterStatus));
		logging("Letter Status is : "+letterStatus.getText());
		assertTrue(isElementDisplayed(letterStatus));
	}
	
	public void verifySearchedLetterStatusAbsent(){
		
		logging("Letter Status is Absent : "+!isElementDisplayed(letterStatus));
		assertTrue(!isElementDisplayed(letterStatus));
	}
	
	public void verifySearchedLetterInmateNamePresent(){
		
		WebElement element = getDriver().findElement(By.xpath(".//*[@id='ctl00_MainContent_sRecipientName']"));
		logging("Inmate Name is Present : "+isElementDisplayed(element));
		logging("Inmate Name is : "+element.getText());
		assertTrue(isElementDisplayed(element));
	}
	
	public void verifySearchedLetterInmateName(String inmateName){
		
		WebElement element = getDriver().findElement(By.xpath(".//*[@id='ctl00_MainContent_sRecipientName']"));
		assertionText("InmateName :: ", element, inmateName);
	}
	
	public void verifySearchedLetterDatePresent(){
		
		WebElement element = getDriver().findElement(By.xpath(".//*[@id='ctl00_MainContent_lbl_createdDate']"));
		logging("Letter Date is Present : "+isElementDisplayed(element));
		logging("Letter Date is : "+element.getText());
		assertTrue(isElementDisplayed(element));
	}
	
	public void verifySearchedLetterInmateHousingPresent(){
		
		WebElement element = getDriver().findElement(By.xpath(".//*[@id='ctl00_MainContent_sInmateHousing']"));
		logging("Inmate Housing is Present : "+isElementDisplayed(element));
		logging("Inmate Housing is : "+element.getText());
		assertTrue(isElementDisplayed(element));
	}
	
	public void verifySearchedLetterInmateHousing(String inmateHousing){
		
		WebElement element = getDriver().findElement(By.xpath(".//*[@id='ctl00_MainContent_sInmateHousing']"));
		assertionText("InmateHousing :: ", element, inmateHousing);
	}
	
	public void verifySearchedLetterInmateIdPresent(){
		
		WebElement element = getDriver().findElement(By.xpath(".//*[@id='ctl00_MainContent_sInmateID']"));
		logging("Inmate ID is Present : "+isElementDisplayed(element));
		logging("Inmate ID is : "+element.getText());
		assertTrue(isElementDisplayed(element));
	}
	
	public void verifySearchedLetterInmateId(String inmateId){
		
		WebElement element = getDriver().findElement(By.xpath(".//*[@id='ctl00_MainContent_sInmateID']"));
		assertionText("InmateID :: ", element, inmateId);
	}
	
	public void verifySearchedLetterDate(String date){
		
		String actDate=searchedLetterDate.getText().split(" ")[0];
		assertionText("Searched Date : ", actDate, date);
	}
	
	public void verifySearchedLetterDate(){
		String content;
		Date d=new Date();
		SimpleDateFormat  formatetter=new SimpleDateFormat ("MM/dd/yyyy");
		
		content = formatetter.format(d);
		String actDate=searchedLetterDate.getText().split(" ")[0];
		assertionText("Searched Date : ", actDate, content);
	}
	
	
	public void verifyCustomerInformationText(String text){
		
		assertionText(customerInformationText, text);
	}
	
	public void verifyCustomerInformationNamePresent(){
		
		WebElement element = getDriver().findElement(By.xpath("(.//*[contains(text(),'Name')]//following::td/font)[1]"));
		logging("Customer Name is Present : "+isElementDisplayed(element));
		logging("Customer Name is : "+element.getText());
		assertTrue(isElementDisplayed(element));
	}
	
	public void verifySearchedLetterCustomerName(String custName){
		
		WebElement element = getDriver().findElement(By.xpath(".//*[@id='ctl00_MainContent_sSenderFLName']"));
		assertionText("CustomerName :: ", element, custName);
	}
	
	public void verifySearchedLetterCustomerId(String custId){
		
		WebElement element = getDriver().findElement(By.xpath(".//*[@id='ctl00_MainContent_sSenderAccountID']"));
		assertionText("CustomerID :: ", element, custId);
	}
	
	public void verifyCustomerInformationMemberSincePresent(){
		
		WebElement element = getDriver().findElement(By.xpath("(.//*[contains(text(),'Member Since:')]//following::td/font)[1]"));
		logging("Member Since is Present : "+isElementDisplayed(element));
		logging("Member Since is : "+element.getText());
		assertTrue(isElementDisplayed(element));
	}
	
	public void verifyInmateInformationText(String text){
		
		assertionText(inmateInformationText, text);
	}
	
	public void verifyInmateInformationInmateIdPresent(){
		
		WebElement element = getDriver().findElement(By.xpath("(.//*[contains(text(),'Inmate ID')]//following::td/font)[1]"));
		logging("Inmate ID is Present : "+isElementDisplayed(element));
		logging("Inmate ID is : "+element.getText());
		assertTrue(isElementDisplayed(element));
	}
	
	public void verifyInmateInformationLocationPresent(){
		
		WebElement element = getDriver().findElement(By.xpath("(.//*[contains(text(),'Location:')]//following::td/font)[1]"));
		logging("Inmate Location is Present : "+isElementDisplayed(element));
		logging("Inmate Location is : "+element.getText());
		assertTrue(isElementDisplayed(element));
	}
	
	public void verifyParentLetterIdLetterIdPresent(){
		
		WebElement element = getDriver().findElement(By.xpath("//*[@id='ctl00_MainContent_lbl_letternumber']"));
		logging("Letter ID is Present : "+isElementDisplayed(element));
		logging("Letter ID is : "+element.getText());
		assertTrue(isElementDisplayed(element));
	}
		
	public void clickMailSearchFreeTextRadioButton(){
		
		logging("Clicking on : Free Text Search Radio Button.");
		freeTextSearchRadioButton.click();
	}
	
    public void enterMailSearchFreeText(String text){
	
	   setText(mailSearchFreetextInput, text);
    }
	

	public void checkMailSearchAPhraseCheckbox(){
		
		logging("Checking on Search A Phrase checkbox.");
		if (!mailSearchAPhraseCheckbox.isSelected()) {
			pressSpace(mailSearchAPhraseCheckbox);
		}
		
	}
	
    public void clickMailFreeTextSearchGoButton(){
	
	logging("Clicking on : "+mailFreeTextSearchGoButton.getAttribute("value"));
	mailFreeTextSearchGoButton.click();
    }

	public void verifyFreeTextSearchLetterReceivedText(String text) {

		assertionText(mailFreeTextSearchLetterReceivedText, text);
	}

	public void verifyFreeTextSearchLetterSentText(String text) {

		assertionText(mailFreeTextSearchLetterSentText, text);
	}

	public void clickLetterReceivedViewButton() {

		click(letterReceivedViewButton);
	}
	
	public boolean isSearchedContentPresent(String text){
		
		WebElement element = getDriver().findElement(By.xpath(".//*[@id='ctl00_MainContent_lbl_letter']"));
		String actText = element.getText().toUpperCase();
		String expText = text.toUpperCase();
		if (actText.contains(expText)) {
			return true;
		}
		return false;
	}
	
	public void verifySearchedContentPresentInLetter(String text){
		
		logging("Searched Content - '"+text+"' Present In Letter : "+isSearchedContentPresent(text));
		assertTrue(isSearchedContentPresent(text));
	}
	
	public void clickRepairVideogramLink(){
		
		click(repairVideogramLink);
	}
	
	public void clickDownloadVideogramLink(){
		
		click(downloadVideogramLink);
	}
	
	public void verifySnapNSendIconPresent(){
		
		logging("Snap'N Send Icon is Present : "+isElementDisplayed(snapNSendIcon));
		assertTrue(isElementDisplayed(snapNSendIcon));
	}
	
	public void verifySearchInmateName(String name) {

		assertionText("Inmate name :: ",searchInmateName, name);
	}
	
	public void verifySearchInmateId(String id) {

		assertionText("Inmate id :: ",searchInmateId, id);
	}
	
	public void verifySearchCustomerName(String name) {

		assertionText("Customer name :: ",searchCustomerName, name);
	}
	
	public void verifySearchCustomerId(String id) {

		assertionText("Customer id :: ",searchCustomerId, id);
	}
	
	public void verifySearchSnapNSendText(String text) {

		assertionText(searchSnapNSendText, text);
	}
	
	public void verifyLetterStatusUpdateMsg(String msg) {

		assertionText("Update Message :: ",statusUpdateMsg, msg);
	}

	
	
	
	
	
	/****************************************    LETTER  SEARCH  METHODS   *************************************************
	 *************************************************************************************************************************/
	
	
	
	
	
	
	/****************************************    WORD  FILTER SYSTEMS  METHODS   *************************************************
	 *************************************************************************************************************************/
	

	public void clickWordAddLink() {

		click(addLink);
	}

	public void enterFlagWord(String word) {

		setText(wordAddInputBox, word);
	}

	public void clickWordAddButton() {

		logging("Clicking on : " + wordAddButton.getAttribute("value"));
		wordAddButton.click();
	}

	public void verifyWordAddSuccessMsg(String status) {

		assertionText(wordAddConText, status);
	}

	public void clickWordSearchLink() {

		click(wordSearchLink);
	}

	public void enterFlagWordToSearch(String word) {

		setText(wordSearchInputBox, word);
	}

	public void clickWordSearchGoButton() {

		logging("Clicking on : " + wordSearchGoButton.getAttribute("value"));
		wordSearchGoButton.click();
	}

	public void checkDeactivateCheckbox() {

		logging("Checking on : Deactivate");
		pressSpace(deactivateCheckbox);
	}

	public void clickDeactivateButton() {

		logging("Clicking on : " + deactivateButton.getAttribute("value"));
		deactivateButton.click();
	}
	
	
	/****************************************    WORD  FILTER SYSTEMS  METHODS   *************************************************
	 *************************************************************************************************************************/
	
	
	
	
	
	
	/****************************************    MAIL  AUDITING  REPORT  METHODS   *************************************************
	 *************************************************************************************************************************/

	
	public void clickMailAuditingLink() {

		click(linkMailAuditing);
	}

	public void selectMailAuditingMailType() {

		List<WebElement>element = getDriver().findElements(By.xpath(".//select[@id='ctl00_MainContent_ddlMailType']/option"));
		int size = element.size();
		System.out.println();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(size);
		if (randomInt == size) {
			randomInt = size - 1;
		}
		Log.info(">>>>><<<<<<  " + randomInt);
		selectElementByIndex(selectMailAudMailType, randomInt);
		// selectElementByIndex(creditCard, randomInt);
		logging("Mail Type Selected : " + element.get(randomInt).getText());
	}
	
	
	public void searchMailAuditingMailFromToDate(){
		
		String toDate="";
		String fromDate="";
		
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		toDate=dateFormat.format(date);
		
		String[]splitToDate=toDate.split("/");
		int fromYear = Integer.parseInt(splitToDate[2])-2;
		fromDate = splitToDate[0]+"/"+splitToDate[1]+"/"+Integer.toString(fromYear);
		
		setText(mailAuditingMailFromDateInput, fromDate);
		setText(mailAuditingMailToDateInput, toDate);
		
	}
	
	public void clickMailAuditingGenerateButton() {

		logging("Clicking on : "+mailAuditingGenerateButton.getAttribute("value"));
		jsClick(mailAuditingGenerateButton);
	}
	
	public void selectMailAuditingPageToShow() {

		pause(1000);
		List<WebElement>element = getDriver().findElements(By.xpath(".//select[@id='ctl00_MainContent_ps']/option"));
		int size = element.size();
		System.out.println();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(size);
		if (randomInt == size) {
			randomInt = size - 1;
		}
		Log.info(">>>>><<<<<<  " + randomInt);
		selectElementByIndex(selectMailAudPageToShow, randomInt);
		// selectElementByIndex(creditCard, randomInt);
		logging("Mail Type Selected : " + element.get(randomInt).getText());
	}
	
	public void clickMailAuditingGoButton() {

		logging("Clicking on : "+mailAuditingGoButton.getAttribute("value"));
		mailAuditingGoButton.click();
	}
	
	public void verifyMailAuditingNoOfActionsText(String text) {

		assertionText(mailAuditingNoOfActionsText, text);
	}
	
	public boolean isMailAuditingActionsNoDisplayed(){
		
		try {
			
			WebElement element = getDriver().findElement(By.xpath(".//*[@id='ctl00_MainContent_dgViewMailAuditing_ctl03_lblTotal']"));
			if (element.isDisplayed()) {
				
				int totalNumber = Integer.parseInt(element.getText());
				logging("Total number of actions : "+totalNumber);
				return true;
			}
			
		} catch (Exception e) {
			
		}
		return false;
	}
	
	public void verifyMailAuditingTotalNumberOfActions(){
		
		logging("Total Number of Actions is Present : "+isMailAuditingActionsNoDisplayed());
		assertTrue(isMailAuditingActionsNoDisplayed());
	}
	
	

	/****************************************    MAIL  AUDITING  REPORT  METHODS    *************************************************
	 *************************************************************************************************************************/
	
	
	
	
	
	
	/****************************************    MAIL  GRAPHICAL  REPORT  METHODS   *************************************************
	 *************************************************************************************************************************/
	
	

	public void clickMailGraphicalReportsLink() {

		click(linkMailGraphical);
	}
	
	public void checkMailGraphicalReportIncludeArchivedData() {

		logging("Checking on Include Archived Data.");
		pressSpace(mailGraphicalReportArchivedDataCheckbox);
	}
	
	
	public void clickMailGraphicalReportsShowButton() {

		logging("Clicking on : "+mailGraphicalReportsShowGraphsButton.getAttribute("value"));
		mailGraphicalReportsShowGraphsButton.click();
	}
	
	public void verifyMailGraphicalViewReportPrintingText(String text) {

		assertionText(mailGraphicalViewReportPrintingText, text);
	}
	
	
	

	/****************************************    MAIL  GRAPHICAL  REPORT  METHODS   *************************************************
	 *************************************************************************************************************************/
	
	
	
	
	
	
	/****************************************    INBOUND  MAIL  OPERATIONAL  REPORT  METHODS   **********************************
	 *************************************************************************************************************************/



	public void clickInboundMailOperationalReportLink() {

		click(linkInboundMailOperational);
	}

	
	public void searchInboundMailOperationalReportFromToDate(){
		
		String toDate="";
		String fromDate="";
		
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		toDate=dateFormat.format(date);
		
		String[]splitToDate=toDate.split("/");
		int fromYear = Integer.parseInt(splitToDate[2])-2;
		fromDate = splitToDate[0]+"/"+splitToDate[1]+"/"+Integer.toString(fromYear);
		
		setText(inboundMailOperationalReportFromInput, fromDate);
		setText(inboundMailOperationalReportToInput, toDate);
		
	}
	
	public void checkInboundMailOperationalArchivedData() {

		logging("Checking on Include Archived Data.");
		pressSpace(inboundMailOperationalReportArchivedDataCheckbox);
	}
	
	public void clickInboundMailOperationalViewButton() {

		logging("Clicking on : "+inboundMailOperationalViewButton.getAttribute("value"));
		inboundMailOperationalViewButton.click();
	}
	
	public void verifyInboundMailOperationalNoOfLettersText(String text) {

		assertionText(inboundMailOperationalNoOfLettersText, text);
	}
	
	
	public boolean isInboundMailOperationalLeterNoDisplayed(){
		
		try {
			
			WebElement element = getDriver().findElement(By.xpath(".//td[contains(text(),'# Of Letters')]/following::td[3]"));
			if (element.isDisplayed()) {
				
				int totalNumber = Integer.parseInt(element.getText());
				logging("Total number of Letters : "+totalNumber);
				return true;
			}
			
		} catch (Exception e) {
			
		}
		return false;
	}
	
	public void verifyInboundMailOperationalTotalNumberOfLetters(){
		
		logging("Total Number of Letters is Present : "+isInboundMailOperationalLeterNoDisplayed());
		assertTrue(isInboundMailOperationalLeterNoDisplayed());
	}
	
	
	public void clickInboundMailOperationalLetterExportFileButton() {

		logging("Clicking on : "+inboundMailOperationalLetterExportFileButton.getAttribute("value"));
		inboundMailOperationalLetterExportFileButton.click();
	}
	
	
	
	/****************************************    INBOUND  MAIL  OPERATIONAL  REPORT  METHODS   ***********************************
	 *************************************************************************************************************************/


	
	
	
	
	
	/****************************************    MAIL  OPERATIONAL  REPORT  METHODS   **********************************
	 *************************************************************************************************************************/


	public void clickMailOperationalReportLink() {

		click(linkMailOperational);
	}

	public void searchMailOperationalReportFromToDate(){
		
		String toDate="";
		String fromDate="";
		
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		toDate=dateFormat.format(date);
		
		String[]splitToDate=toDate.split("/");
		int fromYear = Integer.parseInt(splitToDate[2])-2;
		fromDate = splitToDate[0]+"/"+splitToDate[1]+"/"+Integer.toString(fromYear);
		
		setText(inboundMailOperationalReportFromInput, fromDate);
		setText(inboundMailOperationalReportToInput, toDate);
		
	}
	
	public void checkMailOperationalArchivedData() {

		logging("Checking on Include Archived Data.");
		pressSpace(inboundMailOperationalReportArchivedDataCheckbox);
	}
	
	public void clickMailOperationalViewButton() {

		logging("Clicking on : "+inboundMailOperationalViewButton.getAttribute("value"));
		inboundMailOperationalViewButton.click();
	}
	
	public boolean isMailOperationalElementDisplayed(WebElement element){
		
		try {
			
				return element.isDisplayed();
		} catch (Exception e) {
			
		}
		return false;
	}
	
	public void verifyMailOperationalTotalInboundLettersText(){
		WebElement element=getDriver().findElement(By.xpath("//*[@id='ctl00_MainContent_dgPermlocs']/tbody/tr[1]/td[3]"));
		assertionText(element, "Inbound Letters");
	}
	
	public void verifyMailOperationalTotalInboundLetters(){
		WebElement element=getDriver().findElement(By.xpath("//*[@id='ctl00_MainContent_dgPermlocs']/tbody/tr[2]/td[3]"));
		logging("Total Number of Inbound Letters is Present : "+isMailOperationalElementDisplayed(element));
		logging("Total Number of Inbound Letters : "+element.getText());
		assertTrue(isMailOperationalElementDisplayed(element));
	}
	
	public void verifyMailOperationalInboundLettersValueText(){
		WebElement element=getDriver().findElement(By.xpath("//*[@id='ctl00_MainContent_dgPermlocs']/tbody/tr[1]/td[4]"));
		assertionText(element, "$ value");
	}	
	
	public void verifyMailOperationalInboundLettersValue(){
		WebElement element=getDriver().findElement(By.xpath("//*[@id='ctl00_MainContent_dgPermlocs']/tbody/tr[2]/td[4]"));
		logging("Inbound Letters Value is Present : "+isMailOperationalElementDisplayed(element));
		logging("Inbound Letters Value : "+element.getText());
		assertTrue(isMailOperationalElementDisplayed(element));
	}
	
	public void verifyMailOperationalTotalInboundPostageBoughtText(){
		WebElement element=getDriver().findElement(By.xpath("//*[@id='ctl00_MainContent_dgPermlocs']/tbody/tr[1]/td[5]"));
		assertionText(element, "Inbound Postage Bought");
	}
	
	public void verifyMailOperationalTotalInboundPostageBought(){
		WebElement element=getDriver().findElement(By.xpath("//*[@id='ctl00_MainContent_dgPermlocs']/tbody/tr[2]/td[5]"));
		logging("Inbound Postage Bought is Present : "+isMailOperationalElementDisplayed(element));
		logging("Inbound  Postage Bought : "+element.getText());
		assertTrue(isMailOperationalElementDisplayed(element));
	}
	
	public void verifyMailOperationalTotalOutboundLettersText(){
		WebElement element=getDriver().findElement(By.xpath("//*[@id='ctl00_MainContent_dgPermlocs']/tbody/tr[1]/td[7]"));
		assertionText(element, "Outbound Letters");
	}
	
	public void verifyMailOperationalTotalOutboundLetters(){
		WebElement element=getDriver().findElement(By.xpath("//*[@id='ctl00_MainContent_dgPermlocs']/tbody/tr[2]/td[7]"));
		logging("Total Number of Outbound Letters is Present : "+isMailOperationalElementDisplayed(element));
		logging("Total Number of Outbound Letters : "+element.getText());
		assertTrue(isMailOperationalElementDisplayed(element));
	}
	
	
	public void verifyMailOperationalOutboundLettersValueText(){
		WebElement element=getDriver().findElement(By.xpath("//*[@id='ctl00_MainContent_dgPermlocs']/tbody/tr[1]/td[8]"));
		assertionText(element, "$ value");
	}
	
	public void verifyMailOperationalOutboundLettersValue(){
		WebElement element=getDriver().findElement(By.xpath("//*[@id='ctl00_MainContent_dgPermlocs']/tbody/tr[2]/td[8]"));
		logging("Outbound Letters Value is Present : "+isMailOperationalElementDisplayed(element));
		logging("Outbound Letters Value : "+element.getText());
		assertTrue(isMailOperationalElementDisplayed(element));
	}
	
	
	public void verifyMailOperationalTotalOutboundPostageBoughtText(){
		WebElement element=getDriver().findElement(By.xpath("//*[@id='ctl00_MainContent_dgPermlocs']/tbody/tr[1]/td[9]"));
		assertionText(element, "Outbound Postage Bought");
	}
	
	public void verifyMailOperationalTotalOutboundPostageBought(){
		WebElement element=getDriver().findElement(By.xpath("//*[@id='ctl00_MainContent_dgPermlocs']/tbody/tr[2]/td[9]"));
		logging("Outbound Postage Bought is Present : "+isMailOperationalElementDisplayed(element));
		logging("Outbound  Postage Bought : "+element.getText());
		assertTrue(isMailOperationalElementDisplayed(element));
	}
	
	
	public void clickMailOperationalExportFileButton() {

		logging("Clicking on : "+inboundMailOperationalLetterExportFileButton.getAttribute("value"));
		inboundMailOperationalLetterExportFileButton.click();
	}
	
	
	
	
	/****************************************    MAIL  OPERATIONAL  REPORT  METHODS   ***********************************
	 *************************************************************************************************************************/


	
	
	

	
	/****************************************    STAMP USAGE  REPORT  METHODS   **********************************
	 *************************************************************************************************************************/



	public void clickStampUsageReportLink() {

		click(linkStampUsage);
	}

	public void searchStampUsageReportFromToDate(){
		
		String toDate="";
		String fromDate="";
		
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		toDate=dateFormat.format(date);
		
		String[]splitToDate=toDate.split("/");
		int fromYear = Integer.parseInt(splitToDate[2])-2;
		fromDate = splitToDate[0]+"/"+splitToDate[1]+"/"+Integer.toString(fromYear);
		
		setText(inboundMailOperationalReportFromInput, fromDate);
		setText(inboundMailOperationalReportToInput, toDate);
		
	}
	
	public void checkStampUsageReportArchivedData() {

		logging("Checking on Include Archived Data.");
		pressSpace(stampUsageReportArchivedDataCheckbox);
	}
	
	public void clickStampUsageReportViewButton() {

		logging("Clicking on : "+inboundMailOperationalViewButton.getAttribute("value"));
		inboundMailOperationalViewButton.click();
	}
	
	public boolean isStampUsageReportElementDisplayed(WebElement element){
		
		try {
			
				return element.isDisplayed();
		} catch (Exception e) {
			
		}
		return false;
	}
	
	public void verifyStampUsageNumOfTextPagesText(){
		WebElement element=getDriver().findElement(By.xpath("//*[@id='ctl00_MainContent_dgMailReport']/tbody/tr[1]/td[2]"));
		assertionText(element, "Num Of Text Pages");
	}
	
	public void verifyStampUsageNumOfTextPages(){
		WebElement element=getDriver().findElement(By.xpath("//*[@id='ctl00_MainContent_dgMailReport']/tbody/tr[2]/td[2]"));
		logging("Number Of Text Pages is Present : "+isStampUsageReportElementDisplayed(element));
		logging("Number Of Text Pages : "+element.getText());
		assertTrue(isStampUsageReportElementDisplayed(element));
	}
	
	public void verifyStampUsageNumOfAttachmentsText(){
		WebElement element=getDriver().findElement(By.xpath("//*[@id='ctl00_MainContent_dgMailReport']/tbody/tr[1]/td[3]"));
		assertionText(element, "Num Of Attachments");
	}	
	
	public void verifyStampUsageNumOfAttachments(){
		WebElement element=getDriver().findElement(By.xpath("//*[@id='ctl00_MainContent_dgMailReport']/tbody/tr[2]/td[3]"));
		logging("Num Of Attachments is Present : "+isStampUsageReportElementDisplayed(element));
		logging("Num Of Attachments : "+element.getText());
		assertTrue(isStampUsageReportElementDisplayed(element));
	}
	
	public void verifyStampUsageNumOfStampsText(){
		WebElement element=getDriver().findElement(By.xpath("//*[@id='ctl00_MainContent_dgMailReport']/tbody/tr[1]/td[4]"));
		assertionText(element, "Num of Stamps");
	}
	
	public void verifyStampUsageNumOfStamps(){
		WebElement element=getDriver().findElement(By.xpath("//*[@id='ctl00_MainContent_dgMailReport']/tbody/tr[2]/td[4]"));
		logging("Num of Stamps is Present : "+isStampUsageReportElementDisplayed(element));
		logging("Num of Stamps : "+element.getText());
		assertTrue(isStampUsageReportElementDisplayed(element));
	}
	
	
	public void clickStampUsageCreatedDateButton() {

		logging("Clicking on : "+stampsUsageCreatedDateButton.getAttribute("value"));
		stampsUsageCreatedDateButton.click();
	}
	
	
	public void verifyStampsUsageSenderNameText(){
		WebElement element=getDriver().findElement(By.xpath("//*[@id='ctl00_MainContent_dgDays']/tbody/tr[1]/td[2]"));
		assertionText(element, "Sender Name");
	}
	
	public void verifyStampsUsageSenderName(){
		WebElement element=getDriver().findElement(By.xpath("//*[@id='ctl00_MainContent_dgDays']/tbody/tr[3]/td[2]"));
		logging("Sender Name is Present : "+isStampUsageReportElementDisplayed(element));
		logging("Sender Name : "+element.getText());
		assertTrue(isStampUsageReportElementDisplayed(element));
	}
	
	
	
	
	public void verifyStampsUsageEmailText(){
		WebElement element=getDriver().findElement(By.xpath("//*[@id='ctl00_MainContent_dgDays']/tbody/tr[1]/td[3]"));
		assertionText(element, "Email");
	}
	
	public void verifyStampsUsageEmail(){
		WebElement element=getDriver().findElement(By.xpath("//*[@id='ctl00_MainContent_dgDays']/tbody/tr[3]/td[3]"));
		logging("Email is Present : "+isStampUsageReportElementDisplayed(element));
		logging("Email : "+element.getText());
		assertTrue(isStampUsageReportElementDisplayed(element));
	}
	
	
	
	/****************************************    STAMP  USAGE  REPORT  METHODS   ***********************************
	 *************************************************************************************************************************/
	
	
	
	
	
	
	/****************************************    SUSPEND  VIDEOGRAM  METHODS   ***********************************
	 *************************************************************************************************************************/
	

	public void clickSuspendVideogramInmateLink() {

		click(linkSuspendVideogramInmate);
	}
	
	
	public void verifySuspendVideogramInmateMsg(String text) {

		assertionText(suspendVideogramInmateMsg, text);
	}
	
	public void enterSuspendVideogramInmateId(String inmateId){
		
		setText(suspendVideogramInmateIdInput, inmateId);
	}

	public void clickSuspendVideogramViewInmateDetails() {

		logging("Clicking on : "+suspendVideogramViewInmateDetailsButton.getAttribute("value"));
		suspendVideogramViewInmateDetailsButton.click();
	}
	
	public void verifySuspendVideogramInmateId(String inmateId) {

		assertionText(suspendVideogramInmateId, inmateId);
	}
	
	public void verifySuspendVideogramInmateName(String name) {

		assertionText(suspendVideogramInmateName, name);
	}
	
	public void verifySuspendVideogramInmateLocation(String location) {

		assertionText(suspendVideogramInmateLocation, location);
	}
	
	public void verifySuspendVideogramInmateHousing(String house) {

		assertionText(suspendVideogramInmateHouse, house);
	}
	
	public void verifySuspendVideogramInmateStatus(String status) {

		assertionText(suspendVideogramInmateStatus, status);
	}
	
	public void enterCurrentSusVideogramSuspendDate(){
		
		String toDate="";
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		toDate=dateFormat.format(date);
		setText(susVideogramSuspendDateInput, toDate);
		
	}
	
	public void clickSuspendVideogramCancelSusDateButton() {

		logging("Clicking on : "+suspendVideogramCancelButton.getAttribute("value"));
		suspendVideogramCancelButton.click();
	}
	
	public void clickSusVideogramUpdateSusDateButton() {

		logging("Clicking on : "+suspendVideogramSuspendUpdateButton.getAttribute("value"));
		suspendVideogramSuspendUpdateButton.click();
	}
	
	
	public void verifySusVideogramUpdateSuccessMsg(String msg) {

		assertionText(suspendVideogramUpdateSuccessMsg, msg);
	}
	

	public void clickSusVideogramEditButtonAfterSus() {

		click(susVideogramEditButtonAfterSus);
	}
	

	public void clickSusVideogramUpdateButtonAfterSus() {

		click(susVideogramUpdateButtonAfterSus);
	}
	

	public void clickSuspVideogramCancelButtonSus() {

		click(susVideogramCancelAfterSus);
	}
	

	public void clickSusVideogramRemoveButtonSus() {

		click(susVideogramRemoveButtonAfterSus);
	}
	
	
	public boolean isAddedSusVideogramInmateVisible(String inmateId){
		
		try {
			
			WebElement element = getDriver().findElement(By.xpath("//table[@id='ctl00_MainContent_dgSuspendedInmates']"
					+ "//tr[2]/td[contains(text(),'"+inmateId+"')]"));
			return element.isDisplayed();
			
		} catch (Exception e) {
		}
		
		return false;
		
	}
	
	public void verifyAddedSusVideogramInmateVisible(String inmateId){
		
		logging("Added Suspend Videogram Inmate Id : "+inmateId);
		logging("Added Suspend Videogram Inmate Id Present : "+isAddedSusVideogramInmateVisible(inmateId));
		assertTrue(isAddedSusVideogramInmateVisible(inmateId));
		
	}
	
	
	public void verifyDeletedSusVideogramInmateNotVisible(String inmateId){
		
		logging("Deleted Suspend Videogram Inmate Id : "+inmateId);
		logging("Deleted Suspend Videogram Inmate Id Absent : "+!isAddedSusVideogramInmateVisible(inmateId));
		assertTrue(!isAddedSusVideogramInmateVisible(inmateId));
		
	}
	
	/****************************************    SUSPEND  VIDEOGRAM  METHODS   ***********************************
	 *************************************************************************************************************************/


	
	
	
	
	/****************************************    RESTRICTED VIDEOGRAM CUSTOMERS  METHODS   ***********************************
	 *************************************************************************************************************************/
	

	public void clickRestrictedVideogramCustomersLink() {

		click(linkRestrictedVideogramCustomers);
	}
	
	public void clickRestVideogramAddButton() {

		click(restVideogramAddButton);
	}
	
	public void clickRestVideogramSearchButton() {

		click(restVideogramSearchButton);
	}

	public void clickRestVideogramAddCustomerButton() {

		click(restVideogramAddCustomerButton);
	}

	public void clickRestVideogramSearchGoButton() {

		logging("Clicking on : "+restVideogramGoButton.getAttribute("value"));
		restVideogramGoButton.click();
	}
	
	public void enterCurrRestrictedVideogramSuspendDate(){
		
		String toDate="";
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		toDate=dateFormat.format(date);
		setText(restVideogramSusDateInput, toDate);
		
	}
	
	public void enterRestVideogramAccIdToBlock(String accountId){
	
		setText(restVideogramAccIdToBlockInput, accountId);
	}
	
	public void verifyRestricedVideogramActionUpdateMsg(String status) {

		assertionText(restricedVideogramActionUpdateMsg, status);
	}

	public void clickRestVideogramDeleteButton() {

		click(restVideogramDeleteButton);
	}
	
	public void enterRestVideogramAccIdToSearch(String accountId){
	
		setText(restVideogramAccIdToSearchInput, accountId);
	}
	
	public boolean isSearchedRestVideogramAccVisible(String accountId){
		
		try {
			
			WebElement element = getDriver().findElement(By.xpath("//table[@id='ctl00_MainContent_dgSearchResults']"
					+ "//tr[2]/td[contains(text(),'"+accountId+"')]"));
			return element.isDisplayed();
			
		} catch (Exception e) {
		}
		
		return false;
		
	}
	
	public void verifySearchedRestVideogramAccVisible(String accountId){
		
		logging("Searched Restricted Videogram Account Id : "+accountId);
		logging("Searched Restricted Videogram Account Present : "+isSearchedRestVideogramAccVisible(accountId));
		assertTrue(isSearchedRestVideogramAccVisible(accountId));
		
	}
	
	/****************************************    RESTRICTED VIDEOGRAM CUSTOMERS  METHODS   ***********************************
	 *************************************************************************************************************************/


	
	
	
	
	/****************************************    EMAIL  HOMEPAGE  METHODS   **************************************************
	 *************************************************************************************************************************/
	


	public void clickMailTabLink() {

		click(linkMail);
	}

	public void clickSearchButton() {

		click(searchMail);
	}

	public void clickWordFilterSysButton() {

		click(wordFilterSystemLink);
	}

	public void selectLetterDeliveryMonths(String monNum){
		
		logging("Selecting Number of Past Months : "+monNum);
		selectElementByVisibleText(selectLetterDeliverySummaryMonths, monNum);
	}
	
	public void selectSortBy(String sort){
		
		logging("Selecting Sort By : "+sort);
		selectElementByVisibleText(selectSortBy, sort);
		pause(1000);
	}
	
	public void selectRandomSentToSecurityReason(){
		
		List<WebElement> element= getDriver().findElements(By.xpath(".//select[@id='ctl00_MainContent_securitystatus']//option"));
		int size = element.size();
		Random randomGenerator = new Random();
		int randomReason = randomGenerator.nextInt(size);
		if (randomReason==size) {
			randomReason=size-1;
		}
		if (element.get(randomReason).getText().contentEquals("<SEND TO SECURITY>")) {
			
			randomReason=randomReason+1;
		}
		Log.info(">>>><<<<<   " + randomReason);
		selectElementByIndex(sentToSecurityReason, randomReason);
		logging("Reason Selected : " + element.get(randomReason).getText());
		
	}
	
	public void click1StImageAttachmentLink() {

		logging("Clicking on : 1St Image Attachment");
		firstAttachmentLink.click();
	}
	
	public void click2ndImageAttachmentLink() {

		logging("Clicking on : 2nd Image Attachment");
		secondAttachmentLink.click();
	}
	
	public void clickDiscardSelectedButton() {

		logging("Clicking on : "+discardSelectedButton.getAttribute("value"));
		discardSelectedButton.click();
	}
	
	public void clickApproveSelectedButton() {

		logging("Clicking on : "+approveSelectedButton.getAttribute("value"));
		approveSelectedButton.click();
	}
	
	public void verifyImageApproveDiscardSecurityPopupMsg(String msg){
		
		assertionText("Popup Message :: ", appDisAppSentSecurityPopupMsg, msg);
	}
	
	public void clickImageApproveDiscardSecurityPopupCancelButton() {

		logging("Clicking on : "+appDisAppSentSecurityPopupCancelButton.getAttribute("value"));
		appDisAppSentSecurityPopupCancelButton.click();
		pause(1000);
	}
	
	public void clickImageApproveDiscardSecurityPopupYesButton() {

		logging("Clicking on : "+appDisAppSentSecurityPopupYesButton.getAttribute("value"));
		appDisAppSentSecurityPopupYesButton.click();
		pause(3000);
	}
	
	
	public void clickInboundRequiresApprovalBucket() {

		click(inboundRequiresApprovalLink);
	}
	
	public void clickInboundPhotoApprovalBucket() {

		click(inboundPhotoApprovalLink);
	}
	
	public void clickInboundVideoRequiresApprovalBucket() {

		click(InboundVideoRequiresApprovalLink);
	}
	
	public void clickInboundReadyToPrintBucket() {

		click(inboundReadyToPrintLink);
	}
	
	public void clickInboundPrintedBucket() {

		click(inboundPrintedLink);
	}
	
	public void clickInboundReleasedBucket() {

		click(inboundReleasedBucketLink);
	}
	
	public void clickInboundSentToSecurityBucket() {

		click(inboundSentToSecurityLink);
	}
	
	public void clickInboundReturnedToCustomerBucket() {

		click(inboundReturnedToCustomerLink);
	}
	
	public void clickInboundCensoredBucket() {

		click(inboundCensoredLink);
	}
	
	public void clickInboundReleasedVideoBucket() {

		click(inboundReleasedVideoLink);
	}
	
	public void clickOutboundRequiresApprovalBucket() {

		click(outboundRequiresApprovalLink);
	}
	
	public void clickOutboundPhotoApprovalBucket() {

		click(outboundPhotoApprovalLink);
	}
	
	public void clickOutboundVideoRequiresApprovalBucket() {

		click(outboundVideoRequiresApprovalLink);
	}
	
	public void clickOutboundReadyToPrintBucket() {

		click(outboundReadyToPrintLink);
	}
	
	public void clickOutboundReleasedBucket() {

		click(outboundReleasedBucketLink);
	}
	
	public void clickOutboundSentToSecurityBucket() {

		click(outboundSentToSecurityLink);
	}
	
	public void clickOutboundCensoredBucket() {

		click(outboundCensoredLink);
	}
	
	public void clickOutboundCPendingPrintingItemsBucket() {

		click(outboundPendingPrintingItemsLink);
	}
	
	public void clickOutboundPrintedItemsBucket() {

		click(outboundPrintedItemsLink);
	}
	public void clickOutboundReleasedVideoBucket() {

		click(outboundReleasedVideoLink);
	}
	
	public void clickViewLetterFromAllLocationLink() {

		click(viewLetterAllLocationLink);
	}

	public void selectNumberOfPagesOfLettersToShow1(String pageNum){
		
		logging("Selecting Number of Pages To Show : "+pageNum);
		selectElementByVisibleText(selectNumberOfPagesOfLettersToShow1, pageNum);
	}

	public void selectNumberOfPagesOfLettersToShow2(String pageNum){
		
		logging("Selecting Number of Pages To Show : "+pageNum);
		selectElementByVisibleText(selectNumberOfPagesOfLettersToShow2, pageNum);
	}
	
	public void clickNumberOfPagesOfLettersToShowGoButton() {

		click(numberOfPagesOfLettersToShowGoButton);
	}
	
	public void clickNumberOfPagesOfLettersToShowLastPageButton() {

		jsScrollElementToView(numberOfPagesOfLettersToShowLastPageButton);
		click(numberOfPagesOfLettersToShowLastPageButton);
	}
	
	public void clickNumberOfPagesOfLettersToShowFirstPageButton() {
		jsScrollElementToView(numberOfPagesOfLettersToShowFirstPageButton);
		click(numberOfPagesOfLettersToShowFirstPageButton);
	}
	
	public void clickEmailMainButton() {

		click(mainButton);
	}
	
	
	public void clickEmailBackButton() {

		click(backButton);
	}
	
	/****************************************     EMAIL  HOMEPAGE  METHODS    ************************************************
	 *************************************************************************************************************************/


	

	
	
	
	
	/****************************************    SUPPORT TICKETS DELIVERY ELEMENTS AND  METHODS   **************************************************
	 *************************************************************************************************************************/
	
	
	
	//Support Ticket Delivery link 
	@FindBy(xpath = "(//a[contains(text(),'Support Tickets Delivery')])[1]")
	private WebElement supportTicketDeliveryLink;
	
	//Inbound Support header Text 
	@FindBy(xpath = "//*[@id='ctl00_MainContent_Label1']")
	private WebElement stdInboundSupportText;
	
	//Outbound Support header Text  
	@FindBy(xpath = "//*[@id='ctl00_MainContent_Label2']")
	private WebElement stdOutboundSupportText;
	
	//Inbound Support Requires approval link 
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lnkMailBucketInRequiresApproval']")
	private WebElement stdInboundRequiresApprovalLink;
	
	//Outbound Support Requires approval link 
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lnkMailBucketOutRequiresApproval']")
	private WebElement stdOutboundRequiresApprovalLink;
	
	//Inbound Support Ready to print or release link
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lnkMailBucketInReadyToPrintOrRelease']")
	private WebElement stdInboundPrintReleaseLink;
	
	//Outbound Support Ready to print or release link
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lnkMailBucketOutReadyToRelease']")
	private WebElement stdOutboundPrintReleaseLink;
	
	//Inbound Support Printed Link
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lnkMailBucketInPrinted']")
	private WebElement stdInboundPrintedLink;
	
	//Inbound Support Released Link
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lnkMailBucketInReleased']")
	private WebElement stdInboundReleasedLink;
	
	//Outbound Support Released Link
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lnkMailBucketOutReleased']")
	private WebElement stdOutboundReleasedLink;
	
	//Inbound Support Sent to security link
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lnkMailBucketInSentToSecurity']")
	private WebElement stdInboundSentToSecurityLink;
	
	//Outbound Support Sent to security link
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lnkMailBucketOutSentToSecurity']")
	private WebElement stdOutboundSentToSecurityLink;
	
	//Inbound Support Censored Link 
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lnkMailBucketInCensored']")
	private WebElement stdInboundCensoredLink;
	
	//Outbound Support Censored Link 
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lnkMailBucketOutCensored']")
	private WebElement stdOutboundCensoredLink;
	
	//Inbound-Outbound Support Header Title Text
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lbl_titleheader']")
	private WebElement stdInOutboundTitleHeaderText;

	
	
	//-------------------------------------------------------------------------------------------------------------------------------------------//

	public void clickSupportTicketsDeliveryLink(){
		
		click(supportTicketDeliveryLink);
	}
	
	public void verifySTDInboundSupportText(String inboundSupportText){
		
		assertionText(stdInboundSupportText, inboundSupportText);
	}
	
	public void verifySTDOutboundSupportText(String outboundSupportText){
		
		assertionText(stdOutboundSupportText, outboundSupportText);
	}

	public void clickSTDInboundRequiresApprovalLink(){
		
		click(stdInboundRequiresApprovalLink);
	}
	

	public void clickSTDOutboundRequiresApprovalLink(){
		
		click(stdOutboundRequiresApprovalLink);
	}
	
	
	public void verifySTDInOutboundTitleHeaderText(String titleHeaderText){
		
		assertionText("TitleHeader :: ",stdInOutboundTitleHeaderText, titleHeaderText);
	}

	public void clickSTDInboundPrintReleaseLink(){
		
		click(stdInboundPrintReleaseLink);
	}

	public void clickSTDOutboundPrintReleaseLink(){
		
		click(stdOutboundPrintReleaseLink);
	}
	
	public void clickSTDInboundPrintedLink(){
		
		click(stdInboundPrintedLink);
	}
	
	public void clickSTDInboundReleasedLink(){
		
		click(stdInboundReleasedLink);
	}
	
	public void clickSTDOutboundReleasedLink(){
		
		click(stdOutboundReleasedLink);
	}
	
	public void clickSTDInboundSentToSecurityLink(){
		
		click(stdInboundSentToSecurityLink);
	}
	
	public void clickSTDOutboundSentToSecurityLink(){
		
		click(stdOutboundSentToSecurityLink);
	}
	
	public void clickSTDInboundCensoredLink(){
		
		click(stdInboundCensoredLink);
	}
	
	public void clickSTDOutboundCensoredLink(){
		
		click(stdOutboundCensoredLink);
	}
	
	
	
	/****************************************   SUPPORT TICKETS DELIVERY ELEMENTS AND  METHODS   ************************************************
	 *************************************************************************************************************************/



	

	
	
	
	
	/****************************************    In mail/Out mail Discarded Material ELEMENTS AND  METHODS   ****************************
	 *************************************************************************************************************************/
	
	
	
	
	
	//In mail discarded material link 
	@FindBy(xpath = "(//*[contains(text(),'In Mail Discarded Material')])[1]")
	private WebElement inMailDiscardedMaterialLink;
	
	//Out mail discarded material link 
	@FindBy(xpath = "(//*[contains(text(),'Out Mail Discarded Material')])[1]")
	private WebElement outMailDiscardedMaterialLink;
	
	//In/Out mail Title Header Text 
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lbl_titleheader']")
	private WebElement iOMDMTitleHeaderText;
	
	//In/Out mail discarded material select month
	@FindBy(xpath = "//select[@id='ctl00_MainContent_cmbxMonths']")
	private WebElement iOMDMSelectDiscardedMaterialPastMonths;
	
	//In/Out mail discarded material Search Total Result
	@FindBy(xpath = "//*[@id='ctl00_MainContent_dgViewGroupByPermloc']//tr[2]")
	private WebElement iOMDMTotalDiscardedMaterialsSearchResult;
	
	//In/Out mail discarded material Search Total view button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_dgViewGroupByPermloc_ctl02_lnkViewGroupBy']")
	private WebElement iOMDMTotalDiscardedMaterialsViewButton;
	
	//In/Out mail discarded material Search Result
	@FindBy(xpath = "//*[@id='ctl00_MainContent_ViewDiscardedAttachmentsDataGrid']//tr[2]")
	private WebElement iOMDMDiscardedMaterialsResult;
	
	//In/Out mail discarded material Search View Button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_ViewDiscardedAttachmentsDataGrid']//tr[2]//a[contains(text(),'View')]")
	private WebElement iOMDMDiscardedMaterialsViewButton;
	
	//In/Out mail discarded material Searched Letter id
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lbl_letternumber']")
	private WebElement iOMDMSearchedLetterId;
	
	
	
	
	
	
	//----------------------------------------------------------------------------------------------------------------------------//

	
	
	public void clickInMailDiscardedMaterialLink(){
		
		click(inMailDiscardedMaterialLink);
	}
	
	public void clickOutMailDiscardedMaterialLink(){
		
		click(outMailDiscardedMaterialLink);
	}
	
	public void verifyIOMDMTitleHeaderText(String titleHeaderText){
		
		assertionText("TitleHeader :: ", iOMDMTitleHeaderText, titleHeaderText);
	}
	
	public void selectIOMDMPastMonth(String pastMonth){
		
		logging("Selecting Past Month : "+pastMonth);
		selectElementByVisibleText(iOMDMSelectDiscardedMaterialPastMonths, pastMonth);
	}
	
	public void verifyIOMDMTotalSearchResultPresent(){
		
		logging("Total Searched Result is Present : "+isElementDisplayed(iOMDMTotalDiscardedMaterialsSearchResult));
		assertTrue(isElementDisplayed(iOMDMTotalDiscardedMaterialsSearchResult));
	}

	public void clickIOMDMTotalSearchedViewButton(){
		
		click(iOMDMTotalDiscardedMaterialsViewButton);
	}
	
	public void verifyIOMDMSearchResultPresent(){
		
		logging("Searched Result is Present : "+isElementDisplayed(iOMDMDiscardedMaterialsResult));
		assertTrue(isElementDisplayed(iOMDMDiscardedMaterialsResult));
	}

	public void clickIOMDMSearchedViewButton(){
		
		click(iOMDMDiscardedMaterialsViewButton);
	}
	
	public void verifyIOMDMSearchedLetterIdPresent(){
		
		logging("Searched Letter Id is Present : "+isElementDisplayed(iOMDMSearchedLetterId));
		assertTrue(isElementDisplayed(iOMDMSearchedLetterId));
	}

	
	
	
	
	/****************************************   In mail/Out mail Discarded Material ELEMENTS AND  METHODS   *****************************
	 *************************************************************************************************************************/


	

	
	
	
	
	/****************************************    In mail/Out mail Discarded Material ELEMENTS AND  METHODS   ****************************
	 *************************************************************************************************************************/
	
	
	
	//Recover Deleted Letters link 
	@FindBy(xpath = "(//*[contains(text(),'Recover Deleted Letters')])[1]")
	private WebElement recoverDeletedLettersLink;
	
	//Recover Deleted Letters Title Header Text
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lblRecoverHeaders']")
	private WebElement rdlTitleHeaderText;
	
	//Insert Recover Deleted Letters Letter id input
	@FindBy(xpath = "//*[@id='ctl00_MainContent_tbLetterID']")
	private WebElement rdlInsertLetterIdInput;
	
	//Recover Deleted Letters 
	@FindBy(xpath = "//*[@id='ctl00_MainContent_btnRecoverLetters']")
	private WebElement rdlRecoverLetterButton;
	
	//Recover Deleted Letters searched invalid letter id unsuccessful message
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lblMessage']")
	private WebElement rdlUnsuccessMessage;
	
	//Recover Deleted Letters searched result present
	@FindBy(xpath = "//*[@id='ctl00_MainContent_dgDeletedLetters']//tr[2]")
	private WebElement rdlSearchedResult;
	
	//Recover Deleted Letters verify letter id
	@FindBy(xpath = "//*[@id='ctl00_MainContent_dgDeletedLetters_ctl03_lblLetterID']")
	private WebElement rdlLetterIdVerify;
	
	//Recover Deleted Letters searched result present
	@FindBy(xpath = "//*[@id='ctl00_MainContent_dgDeletedLetters_ctl03_lblAccountID']")
	private WebElement rdlAccountIdVerify;
	
	//Recover Deleted Letters Recover Link
	@FindBy(xpath = "//*[@id='ctl00_MainContent_dgDeletedLetters_ctl03_lnkRecover']")
	private WebElement rdlRecoverLink;
	
	
	
	
	//----------------------------------------------------------------------------------------------------------------------------//

	
	
	public void clickRecoverDeletedLettersLink(){
		
		click(recoverDeletedLettersLink);
	}
	
	public void clickRDLRecoverLetterButton(){
		
		logging("Clicking on : "+rdlRecoverLetterButton.getText());
		rdlRecoverLetterButton.click();
	}
	
	public void verifyRDLTitleHeaderText(String titleHeaderText){
		
		assertionText("TitleHeader :: ", rdlTitleHeaderText, titleHeaderText);
	}
	
	public void enterRDLLetterId(String letterId){
		
		setText(rdlInsertLetterIdInput, letterId);
	}
	
	public void verifyRDLSearchResultPresent(){
		
		logging("Recover Deleted Letters Searched Result is Present : "+isElementDisplayed(rdlSearchedResult));
		assertTrue(isElementDisplayed(rdlSearchedResult));
	}

	public void verifyRDLUnsuccessSearchedMessage(String msg){
		
		assertionText("Error Message :: ", rdlUnsuccessMessage, msg);
	}
	
	public void verifyRDLAccountIdPresent(){
		
		logging("Account ID is Present : "+isElementDisplayed(rdlAccountIdVerify));
		logging("Account ID is : "+rdlAccountIdVerify.getText());
		assertTrue(isElementDisplayed(rdlAccountIdVerify));
	}

	public void verifyRDLRecoverLinkPresent(){
		
		logging("Recover Link is Present : "+isElementDisplayed(rdlRecoverLink));
		assertTrue(isElementDisplayed(rdlRecoverLink));
	}

	public void verifyRDLLetterId(String letterId){
		
		assertionText("Letter ID :: ", rdlLetterIdVerify, letterId);
	}
	
	
	
	/****************************************   In mail/Out mail Discarded Material ELEMENTS AND  METHODS   *****************************
	 *************************************************************************************************************************/


	

	
	
	
	
	/****************************************    RESTRICTED DOMAIN ELEMENTS AND  METHODS   ****************************
	 *************************************************************************************************************************/
	
	
	
	//Restricted Domain link 
	@FindBy(xpath = "(//*[contains(text(),'Restricted Domain')])[1]")
	private WebElement restrictedDomainLink;
	
	//Restricted Domain first delete Checkbox
	@FindBy(xpath = "//*[@id='ctl00_MainContent_dgRestrictedDomain_ctl02_cbDeleteDomain']")
	private WebElement rdFirstDeleteCheckbox;
	
	//Restricted Domain delete Button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_btnDelete']")
	private WebElement rdDeleteButton;
	
	//Restricted Domain delete/add domain message
	@FindBy(xpath = "//*[@id='ctl00_MainContent_lblErrorMessage']")
	private WebElement rdDeleteAddDomainMessage;
	
	//Restricted Domain add domain name insert input
	@FindBy(xpath = "//*[@id='ctl00_MainContent_tbDomain']")
	private WebElement rdInsertDomainNameInput;
	
	//Restricted Domain add domain Button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_btn_block']")
	private WebElement rdAddDomainButton;
	
	
	
	//----------------------------------------------------------------------------------------------------------------------------//

	
	public void clickRestrictedDomainLink(){
		
		click(restrictedDomainLink);
	}

	public void clickRDDeleteFirstCheckBox(String domainName){
		
		logging("Checking on first domain delete checkbox.");
		pressSpace(rdFirstDeleteCheckbox);
	}

	public void clickRDDeleteCheckBoxByDomain(String domainName){
		
		WebElement element = getDriver().findElement(By.xpath(".//*[contains(text(),'"+domainName+"')]/following::input[1]"));
		logging("Checking on delete checkbox of - "+domainName);
		pressSpace(element);
	}
	
	public String getDeletedDomainName(){
		
		return getDriver().findElement(By.xpath(".//span[@id='ctl00_MainContent_dgRestrictedDomain_ctl02_lblDomain']")).getText();
	}
	
	public boolean isRestrictedDomainPresent(String domainName){
		
		try {
			WebElement element = getDriver().findElement(By.xpath(".//*[contains(text(),'"+domainName+"')]"));
			return element.isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public void verifyRestrictedDomainPresentInList(String domainName){
		
		logging("Restricted Domain - '"+domainName+"' is Present : "+isRestrictedDomainPresent(domainName));
		assertTrue(isRestrictedDomainPresent(domainName));
	}
	
	public void verifyRestrictedDomainAbsentInList(String domainName){
		
		logging("Restricted Domain - '"+domainName+"' is Absent : "+!isRestrictedDomainPresent(domainName));
		assertTrue(!isRestrictedDomainPresent(domainName));
	}
	
	public void clickRDDeleteButton(){
		
		jsScrollElementToView(rdDeleteButton);
		logging("Clicking on : "+rdDeleteButton.getAttribute("value"));
		rdDeleteButton.click();
	}
	
	public void verifyRDAddDeleteDomainMessage(String message){	
		
		jsScrollElementToView(rdDeleteAddDomainMessage);
		assertionText(rdDeleteAddDomainMessage, message);
	}
	
	public void enterRDAddDomainName(String domainName){
		
		setText(rdInsertDomainNameInput, domainName);
	}
	
	public void clickRDAddDomainButton(){
		
		logging("Clicking on : "+rdAddDomainButton.getAttribute("value"));
		rdAddDomainButton.click();
	}
	
	public void prerequisiteRDAddDomain(String domainName){
		
		if (!isRestrictedDomainPresent(domainName)) {
			rdInsertDomainNameInput.sendKeys(domainName);
			rdAddDomainButton.click();
		}
				
	}
	
	
	/****************************************   RESTRICTED DOMAIN ELEMENTS AND  METHODS   *****************************
	 *************************************************************************************************************************/
	
	
	
	

	
	
	
	

}
