package com.jpay.media.automation.web.email.pagesobjects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.jpay.media.automation.web.baseobjects.BasePageObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.Log;

public class EmailPage extends BasePageObject {

	/************************************************************************************************
	 ******************************************* CONSTRUCTOR*****************************************
	 ************************************************************************************************/

	public EmailPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	/**********************************************
	 * CONSTRUCTOR****************************************
	 *************************************************************************************************
	 *************************************************************************************************/

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	// Inbox link
	@FindBy(xpath = "//a[contains(text(),'Inbox')]")
	private WebElement linkInbox;

	// Compose link
	@FindBy(xpath = "//a[contains(text(),'Compose')]")
	private WebElement linkCompose;

	// Sent Link
	@FindBy(xpath = "//a[contains(text(),'Sent')]")
	private WebElement linkSent;

	// Buy Stamps Link
	@FindBy(xpath = "//a[contains(text(),'Buy Stamps')]")
	private WebElement linkBuyStamps;

	// Transfer Stamps Link
	@FindBy(xpath = "//a[contains(text(),'Transfer Stamps')]")
	private WebElement linkTransferStamps;

	// Transaction History Link
	@FindBy(xpath = "//a[contains(text(),'Transaction History')]")
	private WebElement linkTransactionHistory;

	// Cancel Button
	@FindBy(xpath = ".//input[@id='btnCancel']")
	private WebElement cancelButton;

	// Send Button
	@FindBy(xpath = ".//input[@id='btnContinue']")
	private WebElement sendButton;

	// Back Button
	@FindBy(xpath = ".//input[@id='btnBack']")
	private WebElement backButton;

	// Attach ECard Button
	@FindBy(xpath = ".//input[@id='imgBtnEcard']")
	private WebElement attachECardButton;

	// Attach Image Button
	@FindBy(xpath = ".//input[@id='imgBtnAttachment']")
	private WebElement attachImageButton;

	// Email Message Body
	@FindBy(xpath = ".//*[@id='message']")
	private WebElement messageBody;

	// Pre-Paid CheckBox
	@FindBy(xpath = ".//input[@id='cbSelfAddressed']")
	private WebElement prepaidCheckbox;

	// Preview Button
	@FindBy(xpath = ".//input[@id='bPreview2']")
	private WebElement previewButton;

	// Warning Message
	@FindBy(xpath = "//*[@id='lblDisclaimer']")
	private WebElement warnMessage;

	// Send Continue Button
	@FindBy(xpath = "//*[@id='btnSendLetter']")
	private WebElement sendContinueButton;

	// Send Confirmation message
	@FindBy(xpath = "//*[@id='p_confirmation']//h2")
	private WebElement sendConfirmMsg;

	// Stamps Used Text
	@FindBy(xpath = "//*[@id='lblPrevAmount']")
	private WebElement stampsUsed;

	// Email Content Required Text Bottom
	@FindBy(xpath = "(//span[@id='commentRequired'])[1]")
	private WebElement emailContentRequiredTextBottom;

	// Email Content Required Text Bottom
	@FindBy(xpath = "(//div[@id='pWriteLetter']/span)[1]")
	private WebElement emailContentRequiredTextTop;

	// Ecard select dropdown
	@FindBy(xpath = "//select[@id='ddlCategories2']")
	private WebElement selectEcard;

	// Ecard selection dropdown
	@FindAll({ @FindBy(xpath = "//select[@id='ddlCategories2']/option") })
	private List<WebElement> ecardSelection;

	// Ecard List
	@FindAll({ @FindBy(xpath = "//table[@id='ecardsTableId']//tbody//tr//td//a[contains(text(),'Attach')]") })
	private List<WebElement> ecardList;

	// Remove Link Attach page
	@FindBy(xpath = "(.//*[@id='dgAttachment']//a)[1]")
	private WebElement removeLinkAttach;

	// Remove Link Main page
	@FindBy(xpath = "(.//*[@id='UpdatePanelAttachments']//a)[1]")
	private WebElement removeLinkMain;

	// Autosave Text
	@FindBy(xpath = "//span[@id='lblDraftMessage']")
	private WebElement autosaveText;

	// Choose File Button
	@FindBy(xpath = "//input[@id='fuAttachment']")
	private WebElement chooseFileButton;

	// Attach Button
	@FindBy(xpath = "//*[@id='btnAttach']")
	private WebElement attachButton;

	// Wrong file error message
	@FindBy(xpath = "//*[@id='lblErrorAttachment']")
	private WebElement attachWrongFileErrMsg;

	// Email Link
	@FindBy(xpath = "(.//a[contains(text(),'Email')])[1]")
	private WebElement linkEmail;

	// Email Link
	@FindBy(xpath = "(.//a[contains(text(),'Home')])[1]")
	private WebElement linkHome;
	
	// Next Link
	@FindBy(xpath = "//a[@id='LinkbuttonArrowNext']")
	private WebElement nextLink;

	// Last Link
	@FindBy(xpath = "//a[@id='LinkbuttonArrowLast']")
	private WebElement lastLink;

	// First Link
	@FindBy(xpath = "//a[@id='LinkbuttonArrowFirst']")
	private WebElement firstLink;

	// Previous Link
	@FindBy(xpath = "//a[@id='LinkbuttonArrowPrev']")
	private WebElement prevLink;

	// First Inmate name link(Sent letter)
	@FindBy(xpath = "//*[@id='TransferHistory_Grid_ctl03_lblsRecipientName']")
	private WebElement nameLinkSentPage1;

	// First Inmate name link(Sent letter)
	@FindBy(xpath = "//*[@id='TransferHistory_Grid_ctl04_lblsRecipientName']")
	private WebElement nameLinkSentPage2;
	
	// First Sent Date 
	@FindBy(xpath = "(//*[@id='TransferHistory_Grid']//tbody/tr//td[3])[1]")
	private WebElement sentDate;
	
	// First Inmate name link(Inbox letter)
	@FindBy(xpath = "//*[@id='Mails_Grid_ctl03_lblFrom']")
	private WebElement nameLinkInboxPageFirst;
	
	// 2nd Inmate name link(Inbox letter)
	@FindBy(xpath = "//*[@id='Mails_Grid_ctl04_lblFrom']")
	private WebElement nameLinkInboxPage2nd;

	// Delete Button Read Page
	@FindBy(xpath = "//input[@id='ButtonDelete']")
	private WebElement deleteButtonReadPage;
	
	// Repay Button Read Page
	@FindBy(xpath = "//input[@id='ButtonReply']")
	private WebElement replayButtonReadPage;
	
	// Delete Button Inbox Page
	@FindBy(xpath = "//input[@id='imgBtnDelete']")
	private WebElement deleteButtonInboxPage;

	// Email Indbox checkbox
	@FindBy(xpath = "//input[@id='Mails_Grid_ctl03_chkMail']")
	private WebElement inboxEmailCheckBox;
	
	// Compose Button
	@FindBy(xpath = "//input[@id='btnSendLetter']")
	private WebElement composeButton;
	
	// prepaid Free Response Text
	@FindBy(xpath = "//*[@id='PanelIncludePrePaidCheckBox']//b")
	private WebElement prepaidFreeResponseText;
	
	// Buy stamps link
	@FindBy(xpath = ".//a[contains(text(),'Buy Stamps')]")
	private WebElement buyStamps;
	
	// Stamp Balance link
	@FindBy(xpath = ".//a[contains(text(),'Stamp Balance')]")
	private WebElement stampBalance;
	
	// Less stamps send email error message
	@FindBy(xpath = "//*[@id='l_Error1']")
	private WebElement lessStampsErrorMsg;
	
	// Attach Video Button
	@FindBy(xpath = ".//input[@id='videoAttachBtn']")
	private WebElement attachVideoButton;
	
	// Image or Ecrad attachment1 link of inbox and sent page
	@FindBy(xpath = ".//a[@id='dgAttachments_ctl02_lnkAttachments']")
	private WebElement inmgEcardAttachmentLink1;
	
	// Image or Ecrad attachment2 link of inbox and sent page
	@FindBy(xpath = ".//a[@id='dgAttachments_ctl03_lnkAttachments']")
	private WebElement inmgEcardAttachmentLink2;
	
	// Image or Ecrad Close attachment button
	@FindBy(xpath = ".//input[@id='btnCloseAttachment']")
	private WebElement closeAttachmentButton;
	
	// Small font size buton
	@FindBy(xpath = "//*[@id='ImageSmallText']")
	private WebElement smallTextFontSize;
	
	// Medium font size buton
	@FindBy(xpath = "//*[@id='ImageMediumText']")
	private WebElement mediumTextFontSize;
	
	// Big font size buton
	@FindBy(xpath = "//*[@id='ImageBigText']")
	private WebElement bigTextFontSize;
	
	// Email Requires stamps message
	@FindBy(xpath = "//*[@id='lblStampRequired']")
	private WebElement emailRequiresStampMessage;
	
	// Attachment Requires stamps message
	@FindBy(xpath = "//*[@id='lblAttachStampCost']")
	private WebElement attachmentRequiresStampMessage;
	
	// Prepaid checkbox message
	@FindBy(xpath = "//*[@id='PanelIncludePrePaidCheckBox']//label")
	private WebElement prepaidCheckboxMessage;
	
	// Inbox Read-Delete message
	@FindBy(xpath = "//*[@id='lbl_msgstatus']")
	private WebElement inboxReadDeleteMessage;

	//Sent LetterHistory message
	@FindBy(xpath = "//*[@id='lbl_msgstatus']")
	private WebElement sentLetterHistoryMessage;

	//Sent MessageHistory message
	@FindBy(xpath = "//*[@id='lbl_pleaseAllow']")
	private WebElement sentMessageAppearMessage;

	// BuyStamps StampRemaining message
	@FindBy(xpath = "//*[@id='lblNumOfStamps']")
	private WebElement buyStampsStampRemainingMessage;

	// TransactionHistory StampRemaining message
	@FindBy(xpath = "//*[@id='lbl_CurrentPostage']")
	private WebElement transactionHistoryStampRemainingMessage;

	//48Hour Email Confirm message
	@FindBy(xpath = "(//*[@id='p_confirmation']//p)[1]")
	private WebElement hourEmailConfirmMessage;

	//Thank you Email Confirm message
	@FindBy(xpath = "(//*[@id='p_confirmation']//p)[2]")
	private WebElement thankYouEmailConfirmMessage;

	//fIRST LETTER CONFIRMATION NUMBER
	@FindBy(xpath = "(//*[@id='TransferHistory_Grid_ctl03_lblsUniqueId'])[1]")
	private WebElement firstSentLetterConNum;

	//fIRST Inmate Name
	@FindBy(xpath = "(//*[@id='TransferHistory_Grid_ctl03_lblsRecipientName'])[1]")
	private WebElement firstInmateName;

	// Inmate Name
	@FindBy(xpath = "(//*[@id='uclSelectedInmateFromSession_SelectedInmateLabel'])[1]")
	private WebElement inmateName;

	// Inmate Id
	@FindBy(xpath = "(//*[@id='uclSelectedInmateFromSession_SelectedInmateIDLabel'])[1]")
	private WebElement inmateId;

	
	

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	/************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD***********************
	 ************************************************************************************************/

	public void clickInboxLink() {

		click(linkInbox);
	}

	public void clickComposeLink() {

		click(linkCompose);
	}

	public void clickSentLink() {

		click(linkSent);
		pause(5000);
	}

	public void clickBuyStampsLink() {

		click(linkBuyStamps);
	}

	public void clickTransferStampsLink() {

		click(linkTransferStamps);
	}

	public void clickTransactionHistoryLink() {

		click(linkTransactionHistory);
	}

	public void clickCancelButton() {

		click(cancelButton);
	}

	public void clickSendButton() {

		wait.until(ExpectedConditions.elementToBeClickable(sendButton));
		logging("Clicking on : " + sendButton.getAttribute("value"));
		sendButton.click();

	}

	public void clickBackButton() {

		wait.until(ExpectedConditions.elementToBeClickable(backButton));
		logging("Clicking on : " + backButton.getAttribute("value"));
		backButton.click();

	}

	public void clickAttachECard() {

		wait.until(ExpectedConditions.elementToBeClickable(attachECardButton));
		logging("Clicking on : " + attachECardButton.getAttribute("value"));
		attachECardButton.click();
	}

	public void clickAttachImage() {

		wait.until(ExpectedConditions.elementToBeClickable(attachImageButton));
		logging("Clicking on : " + attachImageButton.getAttribute("value"));
		attachImageButton.click();
	}

	public void clickPreviewButton() {

		logging("Clicking on : "+previewButton.getAttribute("value"));
		previewButton.click();
	}

	public void checkPrepaidBox() {

		if (!prepaidCheckbox.isSelected()) {
			pressSpace(prepaidCheckbox);
		}
		logging("Checking Prepaid checkbox.");
	}

	public void uncheckPrepaidBox() {

		if (prepaidCheckbox.isSelected()) {
			pressSpace(prepaidCheckbox);
		}
		logging("Unchecking Prepaid checkbox.");
	}
	
	public void verifyPrepaidCheckboxNotVisible(){
		
		logging("Prepaid Checkbox is not visible :: "+!isElementDisplayed(prepaidCheckbox));
		assertTrue(!isElementDisplayed(prepaidCheckbox));
	}
	
	public void verifyPrepaidCheckboxLabelMsgNotVisible(){
		
		logging("Prepaid Checkbox Message is not visible :: "+!isElementDisplayed(prepaidCheckboxMessage));
		assertTrue(!isElementDisplayed(prepaidCheckboxMessage));
	}
	
	public void verifyPrepaidCheckboxVisible(){
		
		logging("Prepaid Checkbox is visible :: "+isElementDisplayed(prepaidCheckbox));
		assertTrue(isElementDisplayed(prepaidCheckbox));
	}
	
	public void verifyPrepaidCheckboxLabelMsgVisible(){
		
		logging("Prepaid Checkbox Message is visible :: "+isElementDisplayed(prepaidCheckboxMessage));
		assertTrue(isElementDisplayed(prepaidCheckboxMessage));
	}
	
	public void enterEmailMessageBody(String msg) {

		setText(messageBody, msg);
	}

	public void enterEmailMessageBodyRan(String msg) {

		//String ranText = RandomStringUtils.randomAlphabetic(10).toLowerCase();
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("MM.dd.yyyy ' ' hh:mm:ss a");
		String email = msg + " @ " + ft.format(dNow);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='message']")));
		setText(messageBody, email);
	}
	
	public void enterEmailMessageBodyRand(String msg) {
		String ranText = RandomStringUtils.randomAlphabetic(10).toLowerCase();
		setText(messageBody, msg+ranText);
	}

	public void verifyEmailMessageBody(String msg) {

		assertionText("Email Message :: ", messageBody, msg);
	}
	
	public String getMessageText(){
		
		sendButton.click();
		backButton.click();
		return messageBody.getText();
	}
	
	public String getEmailMessageText(){
		
		return messageBody.getText();
	}

	public void prerequisiteSendEmail() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='message']")));
			if (!messageBody.getText().contentEquals("")) {

				sendButton.click();
				sendContinueButton.click();
				linkHome.click();
				linkEmail.click();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enterEmailMessageBodyEmojiRan(String msg) {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='message']")));
		//String ranText = RandomStringUtils.randomAlphabetic(10).toLowerCase();
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("MM.dd.yyyy ' ' hh:mm:ss a");
		String email = msg + " @ " + ft.format(dNow);
		logging("Entering Value : " + email);
		messageBody.click();
		pause(100);
		enterText(email);

	}

	public void enterEmailMessageBodyEmoji(String msg) {

		logging("Entering Value : " + msg);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='message']")));
		messageBody.click();
		pause(100);
		enterText(msg);

	}

	public void verifyEmailWarningMessage(String msg) {

		assertionText(warnMessage, msg);
	}

	public void clickSendContinueButton() {

		logging("Clicking on : " + sendContinueButton.getAttribute("value"));
		sendContinueButton.click();

	}

	public void verifyEmailSendConfirmMessage(String msg) {

		wait.until(ExpectedConditions.textToBePresentInElement(sendConfirmMsg, msg));
		assertionText(sendConfirmMsg, msg);
	}

	public String getConfirmationNumber() {

		String conNum = getDriver().findElement(By.xpath("//*[@id='lblConfirmation']/SPAN[1]")).getText();
		logging("Confirmation Number : " + conNum);
		return conNum;
	}

	public boolean isConfirmationNumberPresent() {

		try {
			String xpath = "//*[@id='lblConfirmation']/SPAN[1]";
			boolean displayed = getDriver().findElement(By.xpath(xpath)).isDisplayed();
			return displayed;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public void VerifyEmailConfirmationNumberVisible() {

		logging("Email Confirmation number is present : " + isConfirmationNumberPresent());
		assertBooleanTrue(isConfirmationNumberPresent());
	}

	public void verifyStampsUsed(String text) {

		assertionText("Stamps Used :: ",stampsUsed, text);
	}

	public void verifyEmailContentRequiredMsgBottom(String text) {

		assertionText(emailContentRequiredTextBottom, text);
	}

	public void verifyEmailContentRequiredMsgTop(String text) {

		assertionText(emailContentRequiredTextTop, text);
	}

	public void selectRandomEcardCatagory() {

		wait.until(ExpectedConditions.visibilityOfAllElements(ecardSelection));
		int size = ecardSelection.size();
		Random randomGenerator = new Random();
		int randomInt =randomGenerator.nextInt(size);
		if (randomInt==size) {
			randomInt=size-1;
		}
		Log.info(">>>><<<<<   " + randomInt);
		selectElementByIndex(selectEcard, randomInt);
		logging("Ecard Catagory Selected : " + ecardSelection.get(randomInt).getText());

		if (ecardList.size()==0) {
			int randomInt1 = randomGenerator.nextInt(size);
			if (randomInt1==size) {
				randomInt=size-1;
			}
			Log.info(">>>><<<<<   " + randomInt1);
			selectElementByIndex(selectEcard, randomInt1);
			logging("Ecard Catagory Re-selected(No ecard was to attach in the previously selected catagory) : "
					+ ecardSelection.get(randomInt1).getText());
		}
		

	}

	public void attachRandomEcard() {

		wait.until(ExpectedConditions.visibilityOfAllElements(ecardList));
		int size = ecardList.size();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(size);
		if (randomInt==0) {
			randomInt=1;
		}
		Log.info(">>>><<<<<   " + randomInt);
		WebElement element = getDriver().findElement(
				By.xpath("(//table[@id='ecardsTableId']//tbody//tr//td//a[contains(text(),'Attach')])[" + randomInt + "]"));
		click(element);

	}

	public void clickAttachEcardContinueButton() {

		wait.until(ExpectedConditions.elementToBeClickable(backButton));
		logging("Clicking on : " + backButton.getAttribute("value"));
		backButton.click();

	}

	public void clickRemoveLinkFromMainPage() {

		click(removeLinkMain);
		pause(1000);
	}

	public boolean isRemoveLinkPresentMainPage() {

		try {
			boolean displayed = removeLinkMain.isDisplayed();
			return displayed;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public void VerifyRemoveLinkIsNotVisibleMainPage() {

		logging("Remove Link is not present : " + !isRemoveLinkPresentMainPage());
		assertBooleanTrue(!isRemoveLinkPresentMainPage());
	}

	public void clickRemoveLinkFromAttachPage() {

		click(removeLinkAttach);
		pause(1000);
	}

	public boolean isRemoveLinkPresentAttachPage() {

		try {
			boolean displayed = removeLinkAttach.isDisplayed();
			return displayed;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public void VerifyRemoveLinkIsNotVisibleAttachPage() {

		logging("Remove Link is not present : " + !isRemoveLinkPresentAttachPage());
		assertBooleanTrue(!isRemoveLinkPresentAttachPage());
	}

	public void verifyAutosaveMessage() {

		
		String text= autosaveText.getText();
		String msg = "Mail autosaved at ";
		DateFormat requiredDateFormat = new SimpleDateFormat("h:mm a");
		String date = requiredDateFormat.format(new Date());
		String[]dateArray=date.split(":");
		String hr=dateArray[0];
		String expMin=dateArray[1].split(" ")[0];
		String expAmPm=dateArray[1].split(" ")[1];
		String actMin=text.split(" ")[3].split(":")[1];
		if (Integer.parseInt(expMin)-Integer.parseInt(actMin)==0) {
			
		} else {
			expMin=Integer.toString(Integer.parseInt(expMin)-1);
		}
		String date1 = hr.concat(":").concat(expMin).concat(" ").concat(expAmPm);
		String finalMsg = msg.concat(date1).concat(" EST");
		assertionText(autosaveText, finalMsg);
	}

	public void clickChooseFile() {

		logging("Clicking on : Choose File");
		
		click(chooseFileButton);
	}
	

	public void clickChooseFile(String filepath) {

		logging("Clicking on : Choose File");
		logging("File Uploaded : "+filepath);
		chooseFileButton.sendKeys(filepath);
	}

	public void clickAttachButton() {

		logging("Clicking on : Attach");
		attachButton.click();
	}

	public void verifyWrongFormatFileAttachErrorMsg(String text) {

		assertionText(attachWrongFileErrMsg, text);
	}

	public void clickNextLink() {

		click(nextLink);
	}

	public void clickFirstLink() {

		click(firstLink);
	}

	public void clickLastLink() {

		click(lastLink);
	}

	public void clickPrevLink() {

		click(prevLink);
	}

	public void clickFirstDiplayedNameLinkFromSent() {

		click(nameLinkSentPage1);
	}
	

	public void click2ndDiplayedNameLinkFromSent() {

		click(nameLinkSentPage2);
	}
	
	public void clickFirstDiplayedNameLinkFromInbox() {

		click(nameLinkInboxPageFirst);
	}

	public void click2ndDiplayedNameLinkFromInbox() {

		click(nameLinkInboxPage2nd);
	}
	
	public boolean isAttachmentLinkPresent(){
		try {
			WebElement element= getDriver().findElement(By.xpath(".//*[@id='dgAttachments_ctl02_lnkAttachments']"));
			return element.isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
		
	}
	
	public void verifyImgEcardAttachmentLinkPresent(){
		
		logging("Attachment Link is Present : "+isAttachmentLinkPresent());
		assertTrue(isAttachmentLinkPresent());
	}
	
	public boolean isInboxImgEcardAttachmentPresent(){
		try {
			WebElement element= getDriver().findElement(By.xpath("//*[@id='ShowImageAttachment']//img"));
			return element.isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
		
	}
	
	public void verifyInboxImgEcardAttachmentPresent(){
		
		logging("Attachment is Present : "+isInboxImgEcardAttachmentPresent());
		assertTrue(isInboxImgEcardAttachmentPresent());
	}
	
	public boolean isSentImgEcardAttachmentPresent(){
		try {

			WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='AttachmentPopupDiv']")));
			//WebElement element= getDriver().findElement(By.xpath(".//*[@id='AttachmentPopupDiv']"));
			return element.isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
		
	}
	
	public void verifySentImgEcardAttachmentPresent(){
		pause(500);
		logging("Attachment is Present : "+isSentImgEcardAttachmentPresent());
		assertTrue(isSentImgEcardAttachmentPresent());
	}
	
	public void clickImgEcardAttachmentLink1() {

		click(inmgEcardAttachmentLink1);
	}

	public void clickImgEcardAttachmentLink2() {

		click(inmgEcardAttachmentLink2);
	}
	
	public void clickCloseAttachmentButton() {

		wait.until(ExpectedConditions.elementToBeClickable(closeAttachmentButton));
		logging("Clicking on : "+closeAttachmentButton.getAttribute("value"));
		closeAttachmentButton.click();
	}
	
	public void clickDeleteReadPageButton() {

		logging("Clicking on : "+deleteButtonReadPage.getAttribute("value"));
		deleteButtonReadPage.click();
	}
	
	public void clickReplayReadPageButton() {

		logging("Clicking on : "+replayButtonReadPage.getAttribute("value"));
		replayButtonReadPage.click();
	
	}

	public void checkFirstEmailCheckBox() {

		if (!inboxEmailCheckBox.isSelected()) {
			
			pressSpace(inboxEmailCheckBox);
		}
	}
	
	public void clickDeleteInboxPageButton() {

		logging("Clicking on : "+deleteButtonInboxPage.getAttribute("value"));
		deleteButtonInboxPage.click();
	}
	
	public void clickComposeButton() {

		logging("Clicking on : "+composeButton.getAttribute("value"));
		composeButton.click();
	}
	
	public boolean isArchiveDateLetterPresent(){
		
		String actDate = sentDate.getText();
		
		String[]actDateArr=actDate.split("-");
		String actMonth=actDateArr[0];
		String actDay=actDateArr[1];
		String actYear=actDateArr[2];
		
		int actTotalDay= Integer.parseInt(actMonth)*30+Integer.parseInt(actDay)+Integer.parseInt(actYear)*365;
		
		SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String expDate = formatter.format(date);
		
		String[]expDateArr=expDate.split("-");
		String expMonth=expDateArr[0];
		String expDay=expDateArr[1];
		String expYear=expDateArr[2];
		
		int expTotalDay= Integer.parseInt(expMonth)*30+Integer.parseInt(expDay)+Integer.parseInt(expYear)*365;
		
		if (expTotalDay==actTotalDay||expTotalDay-actTotalDay==180||expTotalDay-actTotalDay>180) {
			
			return true;
		} 
		
		return false;
		
	}
	
	public void verifyArchiveDateLetterPresent(){
		
		logging("Archieve letter present : "+isArchiveDateLetterPresent());
		assertTrue(isArchiveDateLetterPresent());
	}
	
	public void verifyPrepaidFreeResponseText(String text){
		
		assertionText("Prepaid FreeResponse Text :: ", prepaidFreeResponseText, text);
	}
	
	public String getStamps(){
		
		String stamps="";
		String [] stampsArr=stampBalance.getText().split(" ");
		stamps = stampsArr[2].substring(1,stampsArr[2].length()-1);
		return stamps;
	}
	
	public String getUsedStamps(){
		
		String stamps="";
		String [] stampsArr=stampsUsed.getText().split(" ");
		stamps = stampsArr[0];
		return stamps;
	}
	
	public void verifyStampsCountAfterEmailSent(String stampsBeforeSend,String stampsUsed){
		
		String expStampsCount = Integer.toString(Integer.parseInt(stampsBeforeSend)-Integer.parseInt(stampsUsed));
		assertionText("Stamps Count :: ", getStamps(), expStampsCount);
	}
	
	public void verifyLessStampsSendEmailErrorMsg(String text){
		
		assertionText("LessStampsSendEmailErrorMsg :: ", lessStampsErrorMsg, text);
	}
	
	public void VerifyAttachEcardButtonNotVisible() {

		logging("Attach Ecard button is not displayed : " + !isElementDisplayed(attachECardButton));
		assertBooleanTrue(!isElementDisplayed(attachECardButton));
	}
	
	public void VerifyAttachImageButtonNotVisible() {

		logging("Attach Image button is not displayed : " + !isElementDisplayed(attachImageButton));
		assertBooleanTrue(!isElementDisplayed(attachImageButton));
	}
	
	public void VerifyAttachVideoButtonNotVisible() {

		logging("Attach Video button is not displayed : " + !isElementDisplayed(attachVideoButton));
		assertBooleanTrue(!isElementDisplayed(attachVideoButton));
	}
	
	public void VerifyAttachEcardButtonVisible() {

		logging("Attach Ecard button is displayed : " + isElementDisplayed(attachECardButton));
		assertBooleanTrue(isElementDisplayed(attachECardButton));
	}
	
	public void VerifyAttachImageButtonVisible() {

		logging("Attach Image button is displayed : " + isElementDisplayed(attachImageButton));
		assertBooleanTrue(isElementDisplayed(attachImageButton));
	}
	
	public void VerifyAttachVideoButtonVisible() {

		logging("Attach Video button is displayed : " + isElementDisplayed(attachVideoButton));
		assertBooleanTrue(isElementDisplayed(attachVideoButton));
	}
	
	public void verifyMaxAttachmentErrorMsg(String text){
		
		assertionText("MaxAttachmentErrorMsg :: ", lessStampsErrorMsg, text);
	}
	
	public void verifySentPageIstLetterStatus(String status){
		WebElement element=getDriver().findElement(By.xpath(".//*[@id='TransferHistory_Grid_ctl03_lblStatus']"));
		assertionText("Status :: ", element, status);
	}
	
	public void verifySentPage2ndLetterStatus(String status){
		WebElement element=getDriver().findElement(By.xpath(".//*[@id='TransferHistory_Grid_ctl04_lblStatus']"));
		assertionText("Status :: ", element, status);
	}
	
	public void clickTextSizeSmallFont(){
		
		logging("Clicking on Font size : "+smallTextFontSize.getAttribute("alt"));
		smallTextFontSize.click();
	}
	
	public void clickTextSizeMediumFont(){
		
		logging("Clicking on Font size : "+mediumTextFontSize.getAttribute("alt"));
		mediumTextFontSize.click();
		pause(1500);
	}
	
	public void clickTextSizeBigFont(){
		
		logging("Clicking on Font size : "+bigTextFontSize.getAttribute("alt"));
		bigTextFontSize.click();
		pause(1500);
	}
	
	public boolean isFontSizeExpected(String expFontText){
		
		String actFontSize = messageBody.getAttribute("style").split(";")[0];
		if (actFontSize.contains(expFontText)) {
			
			return true;
		}else
		return false;
		
	}
	
	public void verifyEmailFontSizeIsSmall(){
		pause(1000);
		String expFontSize="font-size: 8pt";
		logging("Message Font Size is Small : "+isFontSizeExpected(expFontSize));
		assertTrue(isFontSizeExpected(expFontSize));
	}
	
	public void verifyEmailFontSizeIsMedium(){
		pause(500);
		String expFontSize="font-size: 10pt";
		logging("Message Font Size is Medium : "+isFontSizeExpected(expFontSize));
		assertTrue(isFontSizeExpected(expFontSize));
	}
	
	public void verifyEmailFontSizeIsBig(){
		pause(500);
		String expFontSize="font-size: 12pt";
		logging("Message Font Size is Big : "+isFontSizeExpected(expFontSize));
		assertTrue(isFontSizeExpected(expFontSize));
	}
	
	public void verifyRestrictedInmateMessage(String msg){
		WebElement element=getDriver().findElement(By.xpath(".//*[@id='restrictedDialog']//p"));
		assertionText("Restricted Message :: ", element, msg);
	}
	
	public void clickRestrictedOkButton(){
		
		WebElement element=getDriver().findElement(By.xpath(".//*[@class='ui-dialog-buttonset']//button//span"));
		click(element);
	}
	
	public void verifyEmailRequiresStampMessage(String msg){
		
		assertionText("Email Requires Stamps Message :: ", emailRequiresStampMessage, msg);
	}
	
	public void verifyAttachmentRequiresStampMessage(String msg){
		
		assertionText("Attachment Requires Stamps Message :: ", attachmentRequiresStampMessage, msg);
	}
	
	public void verifyPrepaidCheckboxMessage(String msg){
		
		assertionText("Prepaid Checkbox Message :: ", prepaidCheckboxMessage, msg);
	}
	
	public void verifyInboxReadDeleteMessage(String msg){
		
		assertionText("Inbox Read-Delete Message :: ", inboxReadDeleteMessage, msg);
	}
	
	public void verifySentLetterHistoryMessage(String msg){
		
		assertionText("Sent Letter-History Message :: ", sentLetterHistoryMessage, msg);
	}
	
	public void verifySentMessageAppearMessage(String msg){
		
		assertionText("Sent Message-Appear Message :: ", sentMessageAppearMessage, msg);
	}
	
	public void verifyBuyStampsStampRemainingMessage(String stamps){
		/*String expText = "You have "+stamps+" stamps";
		assertionText("BuyStamps Stamp-Remaining Message :: ", buyStampsStampRemainingMessage, expText);*/
		boolean isTrue= buyStampsStampRemainingMessage.getText().contains(stamps);
		logging(buyStampsStampRemainingMessage.getText());
		assertTrue(isTrue);
	}
	
	public void verifyTransferStampsStampRemainingMessage(String stamps){
		String expText = "You have "+stamps+" stamps";
		boolean isTrue= buyStampsStampRemainingMessage.getText().contains(stamps);
		logging(buyStampsStampRemainingMessage.getText());
		assertTrue(isTrue);
		//assertionText("TransferStamps Stamp-Remaining Message :: ", buyStampsStampRemainingMessage, expText);
	}
	
	public void verifyTransactionHistoryStampRemainingMessage(String stamps){
		String expText = "You currently have "+stamps+" stamps.";
		boolean isTrue= transactionHistoryStampRemainingMessage.isDisplayed();
		logging("Text Displayed : "+transactionHistoryStampRemainingMessage.getText());
		assertTrue(isTrue);
		//assertionText("TransactionHistory Stamp-Remaining Message :: ", transactionHistoryStampRemainingMessage, expText);
	}
	
	public void verify48HourEmailConfirmMessage(String msg){
		assertionText("48-Hour Email Confirm Message :: ", hourEmailConfirmMessage, msg);
	}
	
	public void verifyThankYouEmailConfirmMessage(String msg){
		assertionText("ThankYou Email Confirm Message :: ", thankYouEmailConfirmMessage, msg);
	}
	
	public boolean isConNumPresentSentBox(String ConNum){
		
		try {
			return getDriver().findElement(By.xpath("//*[@id='TransferHistory_Grid']//tr//td//span[contains(text(),'"+ConNum+"')]")).isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public void letterConNumSentBoxPresent(String ConNum){
		
		logging("Letter Present in the sent box with confirm number - "+ConNum+" : "+isConNumPresentSentBox(ConNum));
		assertTrue(isConNumPresentSentBox(ConNum));
	}
	
	public void verifySentLetterConNum(String conNum){
		assertionText("Confirmation Number :: ", firstSentLetterConNum, conNum);
	}
	
	
	public void inmateNameSentBoxPresent(String inmate){
		
		logging("Inmate - "+inmate+" Present in the sent box  : "+isConNumPresentSentBox(inmate));
		assertTrue(isConNumPresentSentBox(inmate));
	}
	
	public void verifySentLetterInmateName(String inmate){
		assertionText("Inmate Name :: ", firstInmateName, inmate);
	}

	public String getInmateName() {

		String name = inmateName.getText();
		logging("Inmate Name : " + name);
		return name;
	}

	public String getInmateId() {

		String id = inmateId.getText().substring(1);
		logging("Inmate Name : " + id);
		return id;
	}
	
	public void verifyForbiddenInmatesMessagePresent(){
		
		WebElement element = getDriver().findElement(By.xpath("//div[@id='restrictedDialog']/p[1]"));
		logging("Forbidden Inmates Message is Present : "+isElementDisplayed(element));
		logging("Forbidden Inmates Message : "+element.getText());
		assertTrue(isElementDisplayed(element));
	}
	
	public void clickForbiddenInmatesMessageBoxOkButton(){
		
		WebElement element = getDriver().findElement(By.xpath("//div[@role='dialog'][1]/div[3]/div[1]/button[@role='button'][1]/span[1]"));
		click(element);
	}
	
	
	

}
