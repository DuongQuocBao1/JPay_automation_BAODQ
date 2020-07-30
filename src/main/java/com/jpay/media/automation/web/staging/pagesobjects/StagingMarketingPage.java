package com.jpay.media.automation.web.staging.pagesobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jpay.media.automation.web.baseobjects.BasePageObject;

public class StagingMarketingPage extends BasePageObject {

	/************************************************************************************************
	 ******************************************* CONSTRUCTOR*****************************************
	 ************************************************************************************************/

	public StagingMarketingPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	/************************************************ CONSTRUCTOR****************************************
	 **************************************************************************************************
	 **************************************************************************************************/

	
	
	
	
	
	
	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	// Marketing Link
	@FindBy(xpath = "(//*[contains(text(),'MARKETING')])[1]")
	private WebElement marketingLink;

	// Notifications: Create New Link
	@FindBy(xpath = "(//*[contains(text(),'Notifications: Create New')])[1]")
	private WebElement notificationsCreateNewLink;

	// Notifications: Drafted Link
	@FindBy(xpath = "(//*[contains(text(),'Notifications: Drafted')])[1]")
	private WebElement notificationsDraftedLink;

	// Notifications: Sent Link
	@FindBy(xpath = "(//*[contains(text(),'Notifications: Sent')])[1]")
	private WebElement notificationsSentLink;

	// Notifications: Search Link
	@FindBy(xpath = "(//*[contains(text(),'Notifications: Search')])[1]")
	private WebElement notificationsSearchLink;

	// Select Notifications category
	@FindBy(xpath = "//select[@id='dropDownCategory']")
	private WebElement selectNotificationsCategory;

	// Select Notifications phone
	@FindBy(xpath = "//select[@id='dropDownPhone']")
	private WebElement selectNotificationsPhone;

	// Notifications Source Button
	@FindBy(xpath = "(//*[contains(text(),'Source')])[1]")
	private WebElement notificationsSourceButton;

	// Notifications Message Input
	@FindBy(xpath = "//*[@id='cke_1_contents']/textarea")
	private WebElement notificationsMessageInput;

	// Notifications Draft Button
	@FindBy(xpath = "//*[@id='DraftButton']")
	private WebElement notificationsDraftButton;

	// Notifications Send Now button
	@FindBy(xpath = "//*[@id='SendButton']")
	private WebElement notificationsSendNowButton;

	// Notifications Delete button
	@FindBy(xpath = "//*[@id='DeleteButton']")
	private WebElement notificationsDeleteButton;

	// Notifications Send confirmation message verify
	@FindBy(xpath = "(//*[@id='lblMail']//span)[1]")
	private WebElement notificationsSendConfirmMessage;

	// Notifications Send confirmation message Id
	@FindBy(xpath = "(//*[@id='lblMail']//span)[4]")
	private WebElement notificationsSendConfirmId;

	// Notifications Back button
	@FindBy(xpath = "//*[@id='BackButton']")
	private WebElement notificationsBackButton;

	// Notifications Last Page button
	@FindBy(xpath = "//*[@id='ctl02_btnLastPage']")
	private WebElement notificationsLastPageButton;

	// Notifications viewSentNoticationINformationMsg
	@FindBy(xpath = "//*[@id='flexBoxInstructions2']")
	private WebElement viewSentNoticationINformationMsg;

	// Notifications Searched notifications message id
	@FindBy(xpath = "//*[@id='gridResults_DraftGridView_ctl02_lblMessageId']")
	private WebElement searchedNotificationsMessageId;

	// Notifications Searched notifications created by
	@FindBy(xpath = "//*[@id='gridResults_DraftGridView_ctl02_lblCreatedBy']")
	private WebElement searchedNotificationsCreatedBy;

	// Notifications Searched notifications view button
	@FindBy(xpath = "//*[@id='gridResults_DraftGridView_ctl02_btnViewEdit']")
	private WebElement searchedNotificationsViewButton;

	// Notifications Searched notifications message
	@FindBy(xpath = "//*[@id='lblInstructions']")
	private WebElement searchNotificationMsg;

	// Notifications Searched  message id input
	@FindBy(xpath = "//*[@id='txtBoxMessageId']")
	private WebElement searchNotificationMessageIdInput;

	// Notifications Search  button
	@FindBy(xpath = "//*[@id='btnSearch']")
	private WebElement notificationsSearchButton;

	
	



	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	
	
	
	/************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD***********************
	 ************************************************************************************************/


	
	public void clickMarketingLink(){
		
		click(marketingLink);
	}
	
	public void clickNotificationsCreateNewLink(){
		
		click(notificationsCreateNewLink);
	}
	
	public void clickNotificationsDraftedLink(){
		
		click(notificationsDraftedLink);
	}
	
	public void clickNotificationsSentLink(){
		
		click(notificationsSentLink);
	}
	
	public void clickNotificationsSearchLink(){
		
		click(notificationsSearchLink);
	}
	
	public void selectNotificationCategory(String category){
		
		logging("Selecting Notification Category : "+category);
		selectElementByVisibleText(selectNotificationsCategory, category);
	}
	
	public void selectNotificationSendToPhoneType(String phoneType){
		
		logging("Selecting Notification Phone Type : "+phoneType);
		selectElementByVisibleText(selectNotificationsPhone, phoneType);
	}
	
	public void clickNotificationsSourceButton(){
		
		click(notificationsSourceButton);
	}
	
	public void enterNotificationsMessage(String message){
		
		setText(notificationsMessageInput, message);
	}
	
	public void clickNotificationsDraftButton(){
		
		logging("Clicking on : "+ notificationsDraftButton.getAttribute("value"));
		notificationsDraftButton.click();
	}
	
	public void clickNotificationsSendNowButton(){
		
		logging("Clicking on : "+ notificationsSendNowButton.getAttribute("value"));
		notificationsSendNowButton.click();
	}
	
	public void clickNotificationsDeleteButton(){
		
		logging("Clicking on : "+ notificationsDeleteButton.getAttribute("value"));
		notificationsDeleteButton.click();
	}
	
	public void checkNotificationsUserWithInmatesFrom(String agency){
		
		logging("Checking User With Inmates From : "+agency);
		WebElement element = getDriver().findElement(By.xpath("//*[contains(text(),'"+agency+"')]/preceding::input[1]"));
		pressSpace(element);
	}
	
	public void verifyNotificationSendConfirmMessage(String message){
		
		assertionText("Confirmation Message ::", notificationsSendConfirmMessage, message);
	}
	
	public void verifyNotificationSendConfirmMessageIdPresent(){
		
		logging("Notification Send Confirm MessageId Present : "+isElementDisplayed(notificationsSendConfirmId));
		logging("Notification Send Confirm MessageId  : "+notificationsSendConfirmId.getText().split(" ")[2]);
		assertTrue(isElementDisplayed(notificationsSendConfirmId));
	}
	
	public String getNotificationsMessageId(){
		
		String id = notificationsSendConfirmId.getText().split(" ")[2]; 
		logging("Notification Send Confirm MessageId  : "+id);
		return id;
	}
	
	public void clickNotificationsBackButton(){
		
		logging("Clicking on : "+ notificationsBackButton.getAttribute("value"));
		notificationsBackButton.click();
	}
	
	public void clickNotificationsLastPageButton(){
		
		if (notificationsLastPageButton.isEnabled()) {
			logging("Clicking on : " + notificationsLastPageButton.getAttribute("value"));
			notificationsLastPageButton.click();
		}
	}
	
	public void verifyNotificationIsPresent(String notificationNumber){
		
		WebElement element = getDriver().findElement(By.xpath(".//*[@id='ctl02_DraftGridView']//span[contains(text(),'"+notificationNumber+"')]"));
		logging("Notification - "+notificationNumber+" is Present : "+isElementDisplayed(element));
		assertTrue(isElementDisplayed(element));
	}
	
	public void clickNotificationsViewEditButton(String notificationNumber){
		
		WebElement element = getDriver().findElement(By.xpath(".//*[@id='ctl02_DraftGridView']//span[contains(text(),'"+notificationNumber+"')]/following::input[1]"));
		logging("Clicking on : " + element.getAttribute("value"));
		element.click();
		pause(1000);
	}
	
	public void verifyViewSentNotificationInformationMsg(String msg){
		
		assertionText("Message :: ", viewSentNoticationINformationMsg.getText().trim(), msg);
	}
	
	public void verifySearchNotificationMsg(String msg){
		
		assertionText("Message :: ", searchNotificationMsg, msg);
	}
	
	public void enterSearchNotificationMessageId(String msgId){
		
		setText(searchNotificationMessageIdInput, msgId);
	}
	
	public void verifyNotificationsMessageId(String msgId){
		
		String id = notificationsSendConfirmId.getText().split(" ")[2]; 
		assertionText("Message ID :: ", id, msgId);
	}
	
	public void verifySearchedNotificationsMessageId(String msgId){
		
		assertionText("Message ID :: ", searchedNotificationsMessageId, msgId);
	}
	
	public void verifySearchedNotificationsCreatedBy(String createdBy){
		
		assertionText("Notification Created By :: ", searchedNotificationsCreatedBy, createdBy);
	}
	
	public void clickSearchedNotificationsViewButton(){
		
		logging("Clicking on : " + searchedNotificationsViewButton.getAttribute("value"));
		searchedNotificationsViewButton.click();
	}
	
	public void clickNotificationsSearchButton(){
		
		logging("Clicking on : " + notificationsSearchButton.getAttribute("value"));
		notificationsSearchButton.click();
		pause(1000);
	}
	
	
	
}
