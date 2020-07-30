package com.jpay.media.automation.web.staging.pagesobjects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.jpay.media.automation.web.baseobjects.BasePageObject;

public class StagingSupportOutboundMailPage extends BasePageObject {

	/************************************************************************************************
	 ******************************************* CONSTRUCTOR*****************************************
	 ************************************************************************************************/

	public StagingSupportOutboundMailPage(WebDriver driver) {
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

	
	// UnhandledInmateIssuesLink
	@FindBy(xpath = ".//*[contains(text(),'Unhandled Inmates Issues')]")
	private WebElement unhandledInmateIssuesLink;
	
	// HandledInmateIssuesLink
	@FindBy(xpath = ".//*[contains(text(),'Handled Inmates Issues')]")
	private WebElement handledInmateIssuesLink;
	
	// newSupportTicketLink
	@FindBy(xpath = "(//*[contains(text(),'New Support Ticket')])[1]")
	private WebElement newSupportTicketLink;

	// Lookup Account Link
	@FindBy(xpath = "(//*[contains(text(),'Lookup Account')])[1]")
	private WebElement lookupAccountLink;

	// New Support Ticket Text
	@FindBy(xpath = "(//u[contains(text(),'New Support Ticket')])[1]")
	private WebElement newSupportTicketText;

	// Select Support Ticket Facility
	@FindBy(xpath = "//select[@id='ddlFacilities']")
	private WebElement selectSupportFacility;

	// Support Inmate id text box
	@FindBy(xpath = "//input[@id='tbInmateID']")
	private WebElement enterSupportTicketInmateId;

	// Support LocateInmateButton... button
	@FindBy(xpath = "//input[contains(@id,'btnView')]")
	private WebElement locateInmateButton;

	// Support ticket message input box
	@FindBy(xpath = "//*[@id='tbReply']")
	private WebElement supportMessageInputbox;
	
	// Support ticket message input box
	@FindBy(xpath = "//*[@id='Allow_Reply']")
	private WebElement allowInmateToReplyCheckbox;

	// Support Send ticket Button
	@FindBy(xpath = "//input[@id='btnSend']")
	private WebElement sendSupportTicketButton;

	// Support Ticket Success Message
	@FindBy(xpath = "//span[@id='lblMailWasSent']")
	private WebElement supportTicketSuccessMessage;
	
	// Select Search star coverstaion By
	@FindBy(xpath = "//select[@id='FilterControl_searchfilter']")
	private WebElement selectSearchStartConversationBy;
	
	// Unhandled Inmate issues agency select
	@FindBy(xpath = "//select[@id='FilterControl_ddlFacilities']")
	private WebElement selectUnhandledInmateIssuesAgency;
	
	// Unhandled Inmate issues inmateid input 
	@FindBy(xpath = "//input[@id='FilterControl_tbSearchString']")
	private WebElement unhandledInmateIssuesInmateIdInput;
	
	// Unhandled Inmate isuues From Date input
	@FindBy(xpath = "//input[@id='FilterControl_txtFromDate']")
	private WebElement unhandledInmateIssuesFromDateInput;
	
	// Unhandled Inmate isuues To Date input
	@FindBy(xpath = "//input[@id='FilterControl_txtToDate']")
	private WebElement unhandledInmateIssuesToDateInput;
	
	// Unhandled Inmate isuues Search go button
	@FindBy(xpath = "//input[@id='btnSubmit']")
	private WebElement unhandledInmateIssuesGoButton;
	
	// Unhandled Inmate isuues Search Reply button
	@FindBy(xpath = "//a[@id='dgMails_ctl03_Linkbutton2']")
	private WebElement unhandledInmateIssuesReplyLink;
	
	// Unhandled Inmate isuues Search Reply button
	@FindBy(xpath = "//a[@id='dgMails_ctl03_lnkDelete']")
	private WebElement unhandledInmateIssuesDeleteLink;
	
	// Unhandled Inmate isuues Inmate Name Verify
	@FindBy(xpath = "//*[@id='lblName']")
	private WebElement unhandledIssuesInmateNameText;
	
	// Unhandled Inmate isuues Inmate ID Verify
	@FindBy(xpath = "//*[@id='lblInmateID']")
	private WebElement unhandledIssuesInmateIDText;

	// Unhandled Inmate isuues Letter ID Verify
	@FindBy(xpath = "//*[@id='lblLetterID']")
	private WebElement unhandledIssuesLetterIDText;
	
	// Unhandled Inmate isuues Letter Content Verify
	@FindBy(xpath = "//*[@id='tbLetter']")
	private WebElement unhandledIssuesLetterContentText;
	
	// Unhandled Inmate isuues Reply Inputbox
	@FindBy(xpath = "//*[@id='tbReply']")
	private WebElement unhandledIssuesReplyInput;
	
	// Unhandled Inmate isuues SendReply button
	@FindBy(xpath = "//*[@id='btnSend']")
	private WebElement unhandledIssuesSendReplyButton;
	
	// Unhandled Inmate isuues Delete button
	@FindBy(xpath = "//*[@id='btnDelete']")
	private WebElement unhandledIssuesDeleteButton;
	
	// Unhandled Inmate isuues Back button
	@FindBy(xpath = "//*[contains(text(),'<<BACK')]")
	private WebElement unhandledIssuesBackButton;

	
	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	/************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD***********************
	 ************************************************************************************************/

	
	
	public void clickUnhandledInmatesIssuesLink() {

		click(unhandledInmateIssuesLink);
	}
	
	public void clickHandledInmatesIssuesLink() {

		click(handledInmateIssuesLink);
	}
	
	public void clickNewSupportTicketLink() {

		click(newSupportTicketLink);
	}


	public void verifyNewSupportTicketText(String text) {

		assertionText(newSupportTicketText, text);
	}


	public void selectSupportTicketsFacility(String Facility) {

		logging("Selecting Facility :  " + Facility);
		selectElementByVisibleText(selectSupportFacility, Facility);
	}

	public void enterSupportTicketInmateId(String inmateId) {

		setText(enterSupportTicketInmateId, inmateId);

	}

	public void clickSuppTicketLocateInmateButton() {

		logging("Clicking on : " + locateInmateButton.getAttribute("value"));
		locateInmateButton.click();
	}


	public void enterSupportTicketMessage(String message) {

		setText(supportMessageInputbox, message);

	}

	public void clickSendSupportTicketButton() {

		logging("Clicking on : " + sendSupportTicketButton.getAttribute("value"));
		sendSupportTicketButton.click();
	}

	public void checkAllowInmateToReplybox() {

		logging("Checking on AllowInmateToReplySupportTicket checkbox");
		if (!allowInmateToReplyCheckbox.isSelected()) {
			pressSpace(allowInmateToReplyCheckbox);
		}
	}

	public void verifySupportTicketSuccessMsg(String msg) {

		assertionText(supportTicketSuccessMessage, msg);
	}
	
	public void selectSearchStartConversationByInmateid(){
		
		logging("Selecting Conversation By : Inmate ID");
		selectElementByVisibleText(selectSearchStartConversationBy, "Inmate ID");
	}
	
	public void selectUnhandledInmateIssuesAgency(String agency){
		
		logging("Agency selected : "+agency);
		selectElementByVisibleText(selectUnhandledInmateIssuesAgency, agency);
	}
	
	public void clickSuppUnhandledIssuesGoButton() {

		logging("Clicking on : " + unhandledInmateIssuesGoButton.getAttribute("value"));
		pause(1000);
		jsClick(unhandledInmateIssuesGoButton);
	}
	
	public void searchUnhandledIssuesByEnterFromToDate(){
		
		String toDate="";
		String fromDate="";
		
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		toDate=dateFormat.format(date);
		
		String[]splitToDate=toDate.split("/");
		int fromYear = Integer.parseInt(splitToDate[2])-3;
		fromDate = splitToDate[0]+"/"+splitToDate[1]+"/"+Integer.toString(fromYear);
		
		setText(unhandledInmateIssuesFromDateInput, fromDate);
		setText(unhandledInmateIssuesToDateInput, toDate);
		
	}
	
	public String getInmateName(){
		WebElement element1=getDriver().findElement(By.xpath(".//div[@id='pnlMails']//table//tr[2]/td[4]"));
		WebElement element2=getDriver().findElement(By.xpath(".//div[@id='pnlMails']//table//tr[2]/td[5]"));
		String name=getText(element1)+" "+getText(element2);
		return name;
		
	}
	
	public String getInmateId(){
		WebElement element1=getDriver().findElement(By.xpath(".//div[@id='pnlMails']//table//tr[2]/td[6]"));
		String id=getText(element1);
		return id;
		
	}
	
	public String getLetterId(){
		WebElement element1=getDriver().findElement(By.xpath(".//div[@id='pnlMails']//table//tr[2]/td[7]"));
		String id=getText(element1);
		return id;
		
	}
	
	
	public String getLetterContent(){
		WebElement element1=getDriver().findElement(By.xpath(".//div[@id='pnlMails']//table//tr[2]/td[9]"));
		String content=getText(element1);
		return content;
		
	}
	

	public void clickUnhandledInmatesIssuesReplyButton() {

		click(unhandledInmateIssuesReplyLink);
	}
	
	public void clickUnhandledInmatesIssuesReplyButton(String letterId) {

		WebElement element = getDriver().findElement(By.xpath("(.//div[@id='pnlMails']//table"
				+ "//tr/td[contains(text(),'"+letterId+"')]//following::td/a)[1]"));
		click(element);
	}
	
	public void clickUnhandledInmatesIssuesDeleteButton() {

		click(unhandledInmateIssuesDeleteLink);
	}
	
	public void clickUnhandledInmatesIssuesDeleteButton(String letterId) {

		WebElement element = getDriver().findElement(By.xpath("(.//div[@id='pnlMails']//table"
				+ "//tr/td[contains(text(),'"+letterId+"')]//following::td/a)[2]"));
		click(element);
	}
	
	public void verifyUnhandledIssuesInmateName(String name) {

		assertionText("Inmate name :: ",unhandledIssuesInmateNameText, name);
	}
	
	public void verifyUnhandledIssuesInmateId(String id) {

		assertionText("Inmate id :: ",unhandledIssuesInmateIDText, id);
	}
	
	public void verifyUnhandledIssuesLetterId(String letterId) {

		assertionText("Letter id :: ",unhandledIssuesLetterIDText, letterId);
	}
	
	public void verifyUnhandledIssuesLetterContent(String content) {

		assertionText("Letter content :: ",unhandledIssuesLetterContentText, content);
	}
	
	public void clickUnhandledIssuesSendReplyButton() {

		logging("Clicking on : " + unhandledIssuesSendReplyButton.getAttribute("value"));
		unhandledIssuesSendReplyButton.click();
	}
	
	public void clickUnhandledIssuesDeleteButton() {

		logging("Clicking on : " + unhandledIssuesDeleteButton.getAttribute("value"));
		unhandledIssuesDeleteButton.click();
	}
	
	public void enterReplyUnhandledInmateIssue(String reply){
		
		setText(unhandledIssuesReplyInput, reply);
	}
	
	public void clickUnhandledIssuesBackButton() {

		click(unhandledIssuesBackButton);
	}
	
	public boolean isUnhandledIssuesLetterPresent(String letterId){
		
		try {
			WebElement element=getDriver().findElement(By.xpath(".//div[@id='pnlMails']//table//tr/td[contains(text(),'"+letterId+"')]"));
			return element.isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public void verifyUnhandledIssuesLetterPresent(String letterId){
		
		logging("Letter - "+letterId+" is Present : "+isUnhandledIssuesLetterPresent(letterId));
		assertTrue(isUnhandledIssuesLetterPresent(letterId));
	}
	
	public void verifyUnhandledIssuesLetterAbsent(String letterId){
		
		logging("Letter - "+letterId+" is Absent : "+!isUnhandledIssuesLetterPresent(letterId));
		assertTrue(!isUnhandledIssuesLetterPresent(letterId));
	}
	
	
	
	public boolean isHandledIssuesLetterPresent(String letterId){
		
		try {
			WebElement element=getDriver().findElement(By.xpath(".//div[@id='SupportTicketsHistory_pDG']//table"
					+ "//tr/td[contains(text(),'"+letterId+"')]"));
			System.out.println(element.isDisplayed());
			return element.isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public void verifyHandledIssuesLetterPresent(String letterId){
		
		pause(1000);
		logging("Letter - "+letterId+" is Present : "+isHandledIssuesLetterPresent(letterId));
		assertTrue(isHandledIssuesLetterPresent(letterId));
	}
	
	public void verifyHandledIssuesLetterAbsent(String letterId){
		pause(1000);
		logging("Letter - "+letterId+" is Absent : "+!isHandledIssuesLetterPresent(letterId));
		assertTrue(!isHandledIssuesLetterPresent(letterId));
	}
	
	public void enterUnhandledIssuesInmateId(String message) {

		setText(unhandledInmateIssuesInmateIdInput, message);

	}
	

}
