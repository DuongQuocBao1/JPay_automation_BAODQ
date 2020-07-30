package com.jpay.media.automation.web.facility.pagesobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.jpay.media.automation.web.baseobjects.BasePageObject;

public class FacilityCommunicationsPage extends BasePageObject {

	/************************************************************************************************
	 ******************************************* CONSTRUCTOR*****************************************
	 ************************************************************************************************/

	public FacilityCommunicationsPage(WebDriver driver) {
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

    // Communications Tab Link
    @FindBy(xpath = "//*[contains(text(),'Communications')]")
    private WebElement linkCommunications;

    // Assign To Me link
    @FindBy(xpath = "//*[contains(text(),'Assigned To Me')]")
    private WebElement linkAssignToMe;

    // New link
    @FindBy(xpath = "//*[contains(text(),'New')]")
    private WebElement linkNew;

    // Urgent link
    @FindBy(xpath = "//*[contains(text(),'Urgent')]")
    private WebElement linkUrgent;

    // Pending link
    @FindBy(xpath = "//*[contains(text(),'Pending')]")
    private WebElement linkPending;

    // Awaiting Response link
    @FindBy(xpath = "//*[contains(text(),'Awaiting Response')]")
    private WebElement linkAwaitingResponse;

    // Appealed link
    @FindBy(xpath = "//*[contains(text(),'Appealed')]")
    private WebElement linkAppealed;

    // Closed link
    @FindBy(xpath = "//*[contains(text(),'Closed')]")
    private WebElement linkClosed;

    // Search link
    @FindBy(xpath = "//*[contains(text(),'Search')]")
    private WebElement linkSearch;

    // Create Communication link
    @FindBy(xpath = "//*[contains(text(),'Create Communication')]")
    private WebElement linkCreateCommunication;

    // Communications Submitted Report link
    @FindBy(xpath = "//*[contains(text(),'Communications Submitted Report')]")
    private WebElement linkCommunicationsSubmittedReport;

    // Communication Response Report link
    @FindBy(xpath = "//*[contains(text(),'Communication Response Report')]")
    private WebElement linkCommunicationResponseReport;

    // Print Communications link
    @FindBy(xpath = "//*[contains(text(),'Print Communications')]")
    private WebElement linkPrintCommunications;

    // Restrict Inmate Form Use link
    @FindBy(xpath = "//*[contains(text(),'Restrict Inmate Form Use')]")
    private WebElement linkRestrictInmateFormUse;

    // First Ref# No. link
    @FindBy(xpath = "//*[@id='ctl00_MainContent_ucGrievanceDisplay_ggv_ctl02_LinkButton1']")
    private WebElement linkRefNumber;

    // Attachments link
    @FindBy(xpath = "//*[@id='ctl00_MainContent_btnTabAttachments']")
    private WebElement linkAttachments;

    // Admin Notes link
    @FindBy(xpath = "//*[@id='ctl00_MainContent_btnTabAdminNotes']")
    private WebElement adminNotes;

    // Submit Notes Button
    @FindBy(xpath = "//*[@id='ctl00_MainContent_btnSubmitAdminNote']")
    private WebElement submitNotes;

    // No Admin Notes Text
    @FindBy(xpath = "//label[@id='ctl00_MainContent_lblNoDataAdminNote']")
    private WebElement noAdminNotesText;

    // Admin Notes Text area
    @FindBy(xpath = "//*[@id='ctl00_MainContent_txtBoxAdminNote']")
    private WebElement adminNotesTextArea;

    // Browse File Button
    @FindBy(xpath = "//*[@id='ctl00_MainContent_btnBrowse']")
    private WebElement browseFileButton;

    // Attach File Button
    @FindBy(xpath = "//*[@id='ctl00_MainContent_btnAttachFile']")
    private WebElement attachFileButton;

    // File Extension Error Message
    @FindBy(xpath = "//*[@id='ctl00_MainContent_showDialogMessage']")
    private WebElement fileExtensionErrorMsg;

    // Ok Button
    @FindBy(xpath = "//button[@id='ok']")
    private WebElement okButton;

    // Yes Button
    @FindBy(xpath = "//div[@class='ui-dialog-buttonset']/button[@id='yes']")
    private WebElement yesButton;

    // No Button
    @FindBy(xpath = "//div[@class='ui-dialog-buttonset']/button[@id='no']")
    private WebElement noButton;

    // Get Ref# No.
    @FindBy(xpath = "//*[@id='ctl00_MainContent_lblReferenceNumber']")
    private WebElement getRefNumber;

    // Search Box
    @FindBy(xpath = "//*[@id='ctl00_MainContent_txtBoxRefNum']")
    private WebElement searchBox;

    // Search Button
    @FindBy(xpath = "//*[@id='ctl00_MainContent_btnSearchGrievances']")
    private WebElement searchButton;

    // Remove Link
    @FindBy(xpath = "//*[@id='ctl00_MainContent_GridViewAttachFile_ctl02_lnkRemoveFile']")
    private WebElement removeLink;

    // View Link
    @FindBy(xpath = "//*[@id='ctl00_MainContent_GridViewAttachFile_ctl02_lnkViewFile']")
    private WebElement viewLink;

    // Insert Inmate ID
    @FindBy(xpath = "//*[@id='ctl00_MainContent_txtBoxInmateID']")
    private WebElement insertInmateId;

    // New Communication creation unable message
    @FindBy(xpath = "//*[@id='lblMessageOK']")
    private WebElement createCommunicationUnableMessage;

    // Close Button
    @FindBy(xpath = "//button[@id='btnOK']")
    private WebElement closeButton;
    
    // Edit Notes Link
    @FindBy(xpath = "//*[@id='ctl00_MainContent_repAdminNotes_ctl00_LnkBtnEditNote']")
    private WebElement editNotesLink;
    
    // Delete Notes Link
    @FindBy(xpath = "//*[@id='ctl00_MainContent_repAdminNotes_ctl00_lnkBtnDeleteNote']")
    private WebElement deleteNotesLink;
    
    // Edit Notes Header Con Label Text
    @FindBy(xpath = "//*[@id='ui-id-1']")
    private WebElement editNotesHeaderText;
    
    // Warning Header Text
    @FindBy(xpath = "//*[@id='lblTitleMessageOK']")
    private WebElement warningHeaderText;
    
    // Warning Text
    @FindBy(xpath = "//*[@id='lblMessageOK']")
    private WebElement warningText;
    
    // Enter Admin Notes Header Con Label Text
    @FindBy(xpath = "//*[@id='ctl00_MainContent_showDialogMessage']")
    private WebElement enterAdminNotesHeaderText;
    
    // Note Edited Text
    @FindBy(xpath = "//*[@id='ctl00_MainContent_lblIndAdminNote']")
    private WebElement noteEditedText;
    
    // Comment Edited Text
    @FindBy(xpath = "//*[@id='ctl00_MainContent_repAdminNotes_ctl00_lblEditDelInd']")
    private WebElement commentEditedText;

    /*************************************************************************************************
    *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
    *************************************************************************************************/

    /************************************************************************************************
    *********** METHOD***********************METHOD********************METHOD***********************
    ************************************************************************************************/

    public void clickCommunicationsLink() {

         click(linkCommunications);
    }

    public void clickAssignedToMeLink() {

         click(linkAssignToMe);
    }

    public void clickNewLink() {

         click(linkNew);
    }

    public void clickUrgentLink() {

         click(linkUrgent);
    }

    public void clickPendingLink() {

         click(linkPending);
    }

    public void clickAwaitingResponseLink() {

         click(linkAwaitingResponse);
    }

    public void clickAppealedLink() {

         click(linkAppealed);
    }

    public void clickClosedLink() {

         click(linkClosed);
    }

    public void clickSearchLink() {

         click(linkSearch);
    }

    public void clickCreateCommunicationsLink() {

         click(linkCreateCommunication);
    }

    public void clickCommunicationsSubmittedReportLink() {

         click(linkCommunicationsSubmittedReport);
    }

    public void clickPrintCommunicationsLink() {

         click(linkPrintCommunications);
    }

    public void clickRestrictInmateFromUseLink() {

         click(linkRestrictInmateFormUse);
    }

    public boolean isRefNumberVisible() {

         try {
             wait.until(ExpectedConditions.elementToBeClickable(linkRefNumber));
             boolean visible = linkRefNumber.isDisplayed();
             return visible;
         } catch (Exception e) {
             
         }
         return false;
    }

    public void verifyRefNumberPresent() {

         logging("Reference Number is Present :  " + isRefNumberVisible());
         assertTrue(isRefNumberVisible());
    }

    public void verifyRefNumberAbsaent() {

         logging("Reference Number is Absent :  " + !isRefNumberVisible());
         assertTrue(!isRefNumberVisible());
    }

    public void clickFirstRefNumber() {

        click(linkRefNumber);
    }

    public void clickAttachmentsLink() {

        wait.until(ExpectedConditions.elementToBeClickable(linkAttachments));
         linkAttachments.click();
         logging("Clicking on : Attachment Link");
    }

    public void clickAdminNotesLink() {

        wait.until(ExpectedConditions.elementToBeClickable(adminNotes));
         adminNotes.click();
         logging("Clicking on : Admin Notes Link");
    }

    public boolean isSubmitNotesVisible() {

         try {
             wait.until(ExpectedConditions.elementToBeClickable(submitNotes));
             boolean visible = submitNotes.isDisplayed();
             return visible;
         } catch (Exception e) {
             // TODO: handle exception
         }
         return false;
    }

    public void verifySubmitNotesPresent() {

         logging("Submit Notes button is Present :  " + isSubmitNotesVisible());
         assertTrue(isSubmitNotesVisible());
    }

    public void verifySubmitNotesAbsaent() {

         logging("Submit Notes button  is Absent :  " + !isSubmitNotesVisible());
         assertTrue(!isSubmitNotesVisible());
    }

    public void clickSubmitNotesButton() {
        wait.until(ExpectedConditions.elementToBeClickable(submitNotes));
         submitNotes.click();
         logging("Clicking on  :  " + "Submit Notes");
    }

    public void clickBrowseFileButton() {

         click(browseFileButton);
    }

    public void clickAttachFileButton() {

         click(attachFileButton);
    }

    public void verifyFileExtensionErrorMessage(String errorMsg) {

         assertionText(fileExtensionErrorMsg, errorMsg);
    }

    public void verifyFileUploadConfirmationMessage(String conMsg) {

         assertionText(fileExtensionErrorMsg, conMsg);
    }

    public void clickOkButton() {

         click(okButton);
    }

    public void clickYesButton() {

         click(yesButton);
    }

    public void clickNoButton() {

         click(noButton);
    }

    public boolean isFileAttached(String fileName) {

         try {
             pause(1000);
             WebElement element = getDriver().findElement(
                     By.xpath("(.//table[@id='ctl00_MainContent_GridViewAttachFile']//tr[1]/td[contains(text(),'"
                               + fileName + "')])[1]"));
             boolean visible = element.isDisplayed();
             return visible;
         } catch (Exception e) {
             // TODO: handle exception
         }
         return false;

    }

    public void verifyFileIsAttached(String fileName) {

         logging("File -" + fileName + " is Attached : " + isFileAttached(fileName));
         assertTrue(isFileAttached(fileName));
    }

    public void verifyFileIsNotAttached(String fileName) {

         logging("File -" + fileName + " is not Attached : " + !isFileAttached(fileName));
         assertTrue(!isFileAttached(fileName));
    }

    public String getRefNumber() {

         return getText(getRefNumber);
    }

    public void enterRefInSearchBox(String ref) {

         setText(searchBox, ref);
    }

    public void clickSearchButton() {

         click(searchButton);
    }

    public void verifyRefNoLink(String ref) {

         assertionText(linkRefNumber, ref);
    }

    public void verifyRefNoDetails(String ref) {

         assertionText(getRefNumber, ref);
    }

    public void clickRemoveLink() {

         click(removeLink);
    }

    public void clickRemoveLink(String filename) {

         WebElement element = getDriver()
                 .findElement(By.xpath("(.//table[@id='ctl00_MainContent_GridViewAttachFile']//td[contains(text(),'"
                          + filename + "')]/following-sibling::td[3]/a)[1]"));
         click(element);
    }

    public void clickViewLink() {

         click(viewLink);
    }

    public void clickViewLink(String filename) {

         WebElement element = getDriver()
                 .findElement(By.xpath("(.//table[@id='ctl00_MainContent_GridViewAttachFile']//td[contains(text(),'"
                          + filename + "')]/following-sibling::td[4]/a)[1]"));
         click(element);
    }

    public boolean isViewVisible(String filename) {

         try {

             WebElement element = getDriver()
                     .findElement(By.xpath("(.//table[@id='ctl00_MainContent_GridViewAttachFile']//"
                               + "td[contains(text(),'" + filename + "')]/following-sibling::td[4])[1]"));
             return element.isDisplayed();

         } catch (Exception e) {
             // TODO: handle exception
         }
         return false;
    }

    public void verifyViewLinkIsDisplayed(String filename) {

         logging(filename + " - is Displayed :  " + isViewVisible(filename));
         assertTrue(isViewVisible(filename));
    }

    public void verifyViewLinkIsNotDisplayed(String filename) {

         logging(filename + " - is not Displayed :  " + !isViewVisible(filename));
         assertTrue(!isViewVisible(filename));
    }

    public String getTxtContent() {
         return getDriver().findElement(By.xpath(".//body/pre")).getText().trim();
    }

    public void verifyTxtFileContent(String content) {

         assertionText(getTxtContent(), content);
    }

    public void verifyUnauthorizeErrorMessage(String errorMsg) {

         assertionText(fileExtensionErrorMsg, errorMsg);
    }

    public void verifyRemoveConfirmationMessage(String conMsg) {

         assertionText(fileExtensionErrorMsg, conMsg);
    }

    public void enterInmateId(String inmateId) {

         setText(insertInmateId, inmateId);
    }
    

    public void tabOutInsertInmateId() {

         logging("Pressing Tab Key.");
         pressTab(insertInmateId);
    }

    public void verifyCreateCommunicationErrorMessage(String failureMsg) {

         assertionText(createCommunicationUnableMessage, failureMsg);
    }

    public void clickCreateCommunicationCloseButton() {

         click(closeButton);
    }

    public boolean isCreateCommunicationErrorMsgVisible() {

         try {
             pause(1000);
             WebElement element = getDriver().findElement(By.xpath("//*[@id='lblMessageOK']"));
             return element.isDisplayed();
         } catch (Exception e) {
             // TODO: handle exception
         }
         return false;
    }

    public void verifyCreateCommunicationErrorMsgPresent() {
         logging("Create Communication Failure Message is Present : " + isCreateCommunicationErrorMsgVisible());
         assertTrue(isCreateCommunicationErrorMsgVisible());
    }

    public void verifyCreateCommunicationErrorMsgAbsent() {
         logging("Create Communication Failure Message is Absent : " + !isCreateCommunicationErrorMsgVisible());
         assertTrue(!isCreateCommunicationErrorMsgVisible());
    }

    public void enterAdminNotes(String notes) {

         setText(adminNotesTextArea, notes);
    }

    public void verifyAdminNotesInitialText(String initialNotes) {

        assertionText(adminNotesTextArea.getAttribute("placeholder"), initialNotes);
    }

    public void verifyNoAdminNotesText(String noAdminNotes) {

         assertionText(noAdminNotesText, noAdminNotes);
    }
    
    public boolean isEditNotesVisible() {

         try {
             wait.until(ExpectedConditions.elementToBeClickable(editNotesLink));
             boolean visible = editNotesLink.isDisplayed();
             return visible;
         } catch (Exception e) {
             // TODO: handle exception
         }
         return false;
    }

    public void verifyEditNotesPresent() {

         logging("Edit Notes button is Present :  " + isEditNotesVisible());
         assertTrue(isEditNotesVisible());
    }

    public void verifyEditNotesAbsaent() {

         logging("Edit Notes button  is Absent :  " + !isEditNotesVisible());
         assertTrue(!isEditNotesVisible());
    }

    public void clickEditNotesButton() {
         click(editNotesLink);
    }
    
    public boolean isDeleteNotesVisible() {

         try {
             wait.until(ExpectedConditions.elementToBeClickable(deleteNotesLink));
             boolean visible = deleteNotesLink.isDisplayed();
             return visible;
         } catch (Exception e) {
             // TODO: handle exception
         }
         return false;
    }

    public void verifyDeleteNotesPresent() {

         logging("Delete Notes button is Present :  " + isDeleteNotesVisible());
         assertTrue(isDeleteNotesVisible());
    }

    public void verifyDeleteNotesAbsaent() {

         logging("Delete Notes button  is Absent :  " + !isDeleteNotesVisible());
         assertTrue(!isDeleteNotesVisible());
    }

    public void clickDeleteNotesButton() {
         
         click(deleteNotesLink);
    }
    
    public void verifyEditNotesHeaderText(String text) {

         assertionText(editNotesHeaderText, text);
    }
    
    public void verifyEnterAdminNotesHeaderText(String text) {

         assertionText(enterAdminNotesHeaderText, text);
    }
    
    public boolean isNoButtonVisible() {

         try {
             wait.until(ExpectedConditions.elementToBeClickable(noButton));
             boolean visible = noButton.isDisplayed();
             return visible;
         } catch (Exception e) {
             // TODO: handle exception
         }
         return false;
    }

    public void verifyNoButtonPresent() {

         logging("No button is Present :  " + isNoButtonVisible());
         assertTrue(isNoButtonVisible());
    }

    public void verifyNoButtonAbsaent() {

         logging("No button  is Absent :  " + !isNoButtonVisible());
         assertTrue(!isNoButtonVisible());
    }

    public boolean isYesButtonVisible() {

         try {
             wait.until(ExpectedConditions.elementToBeClickable(yesButton));
             boolean visible = yesButton.isDisplayed();
             return visible;
         } catch (Exception e) {
             // TODO: handle exception
         }
         return false;
    }

    public void verifyYesButtonPresent() {

         logging("Yes button is Present :  " + isYesButtonVisible());
         assertTrue(isYesButtonVisible());
    }

    public void verifyYesButtonAbsaent() {

         logging("Yes button  is Absent :  " + !isYesButtonVisible());
         assertTrue(!isYesButtonVisible());
    }

    public void verifyNoteEditedText(String text) {

         assertionText(noteEditedText, text);
    }
    
    public void verifyCommentEditedText(String text) {

         assertionText(commentEditedText, text);
    }
    
    public void verifyDeleteNotesConfirmation(String text) {

         assertionText(editNotesHeaderText, text);
    }
    
    public void verifyDeleteNotesConfirmationText(String text) {

         assertionText(enterAdminNotesHeaderText, text);
    }
    
    public void verifyNoteDeletedText(String text) {

         assertionText(noteEditedText, text);
    }
    
    public boolean isWarningHeaderTextVisible() {

         try {
             wait.until(ExpectedConditions.elementToBeClickable(warningHeaderText));
             boolean visible = warningHeaderText.isDisplayed();
             return visible;
         } catch (Exception e) {
             // TODO: handle exception
         }
         return false;
    }

    public void verifyWarningHeaderTextPresent() {

         logging("Warning Header Text is Present :  " + isWarningHeaderTextVisible());
         assertTrue(isWarningHeaderTextVisible());
    }

    public void verifyWarningHeaderTextAbsaent() {

         logging("Warning Header Text  is Absent :  " + !isWarningHeaderTextVisible());
         assertTrue(!isWarningHeaderTextVisible());
    }

    public void verifyWarningHeaderText(String text) {

         assertionText(warningHeaderText, text);
    }
    
    public void verifyWarningText(String inmateId) {

         String expText ="You cannot create a new grievance for inmate ID # "+inmateId+". This is not a valid ID #.";
         assertionText(warningText, expText);
    }
    

}
