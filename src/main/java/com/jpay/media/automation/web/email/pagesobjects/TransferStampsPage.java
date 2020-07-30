package com.jpay.media.automation.web.email.pagesobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.jpay.media.automation.web.baseobjects.BasePageObject;

public class TransferStampsPage extends BasePageObject {

	/************************************************************************************************
	 ******************************************* CONSTRUCTOR*****************************************
	 ************************************************************************************************/

	public TransferStampsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	/***********************************************
	 * CONSTRUCTOR****************************************
	 *************************************************************************************************
	 *************************************************************************************************/

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	// Buy stamps link
	@FindBy(xpath = ".//a[contains(text(),'Buy Stamps')]")
	private WebElement buyStamps;
	
	// Transfer Stamps link
	@FindBy(xpath = ".//a[contains(text(),'Transfer Stamps')]")
	private WebElement transferStamps;
	
	// Enter stamps input box
	@FindBy(xpath = ".//input[@id='TextBoxStamps']")
	private WebElement stampsInputBox;

	// Continue Button
	@FindBy(xpath = ".//input[@id='btnFakeContinue']")
	private WebElement continueButton;

	// Yes Button
	@FindBy(xpath = ".//button/span[contains(text(),'Yes')]")
	private WebElement yesButton;

	// No Button
	@FindBy(xpath = ".//button/span[contains(text(),'No')]")
	private WebElement noButton;
	
	// Ok Button
	@FindBy(xpath = ".//button/span[contains(text(),'Ok')]")
	private WebElement okButton;

	// Transfer Stamps Confirmation popup
	@FindBy(xpath = "//span[@id='ui-dialog-title-dialog-confirm']")
	private WebElement transStampsConPopup;
	
	// Transfer Stamps Confirmation popup alert message
	@FindBy(xpath = ".//span[@id='spanConfirmStampsTransferMessage']")
	private WebElement alertMessageConPopup;

	// Transfer Completed Status Text
	@FindBy(xpath = "//*[@id='MailIconChooser1_lblHeaderText']")
	private WebElement transStatus;
	
	// Transfer Completed message first
	@FindBy(xpath = "//*[@id='LabelTransferMesssage']")
	private WebElement firstTransferMsg;
	
	// Transfer Completed message last
	@FindBy(xpath = "//*[@id='LabelStampsBalance']")
	private WebElement lastTransferMsg;

	//Stamp Transfer CONFIRMATION NUMBER
	@FindBy(xpath = "//*[@id='LabelConfirmationId']")
	private WebElement stampTranferConNum;

	//fIRST Stamp Transfer CONFIRMATION NUMBER
	@FindBy(xpath = "(//*[@id='TransferHistory_Grid']//following::tr[1]//td[3])[1]")
	private WebElement firstStampTransferConNum;

	//Maximum Stamp Transfer error message
	@FindBy(xpath = "//*[@id='lblError']")
	private WebElement maxTransferErrorMsg;
	
	// Stamps Balance Bucket bucket
	@FindBy(xpath = ".//*[contains(text(),'Stamp Balance')]")
	private WebElement stampBalanceBucket;
	
	// Stamps Balance Bucket bucket
	@FindBy(xpath = ".//*[contains(text(),'Buy Stamps')]")
	private WebElement buyStampBucket;

	//Available stamp count message
	@FindBy(xpath = "//*[@id='lblNumOfStamps']")
	private WebElement availableStampCountMsg;

	//popup confirmation message
	@FindBy(xpath = "//*[@id='spanConfirmStampsTransferMessage']")
	private WebElement popupTransferConfirmationMsg;

	//StampsTransferInmateInfo
	@FindBy(xpath = "//*[@id='LabelInmateIdAndAgency']")
	private WebElement stampsTransferInmateInfo;

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	/************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD***********************
	 ************************************************************************************************/

	public void clickTransferStampsButton() {

		click(transferStamps);
	}
	
	public void enterStampsToTransfer(String stamps) {

		setText(stampsInputBox, stamps);
	}
	
	public void enterGreaterStampsToTransfer(String stamps) {

		String num=Integer.toString(Integer.parseInt(stamps)+100);
		setText(stampsInputBox, num);
	}

	public void clickTransferYesButton() {

		click(yesButton);
	}

	public void clickTransferNoButton() {

		click(noButton);
	}
	
	public void clickTransferOkButton() {

		click(okButton);
	}

	public void clickTransferStampsContinueButton() {
		logging("Clicking on : " + getTextByValue(continueButton));
		continueButton.click();

	}

	public void verifyTransferConfirmPopupMsg(String msg) {

		assertionText(transStampsConPopup, msg);
	}
	
	public void verifyZeroTransferAlertPopupMsg(String msg) {

		assertionText(alertMessageConPopup, msg);
	}
	
	public void verifyGreaterTransferAlertPopupMsg(String stamps) {

		String msg="You can transfer up to "+stamps+" stamps only.";
		assertionText(alertMessageConPopup, msg);
	}

	public void verifyTransferCompletionStatus(String msg) {

		assertionText(transStatus, msg);
	}

	public void verifyMaxStampsTransferErrorMsgPresent() {

		logging("Transfer Stamps Error Message is Present : " +isElementDisplayed(maxTransferErrorMsg));
		logging("Transfer Stamps Error Message : " +getText(maxTransferErrorMsg));
		assertTrue(isElementDisplayed(maxTransferErrorMsg));
	}
	
	public void verifyFirstTransCompletionMsg(String stamps,String inmate) {

		String text = ("You have transferred ("+stamps+") stamps to:");
		assertionText(firstTransferMsg, text);
	}
	
	public void verifyFirstTransCompletionMsg(String stamps) {

		String text = ("You have transferred ("+stamps+") stamps to:");
		assertionText(firstTransferMsg, text);
	}
	
	public void verifyStampsTransferInmateInfo(String inmateName,String inmateId,String faciity) {

		String text = inmateName.concat(", ").concat(inmateId).concat(", ").concat(faciity);
		assertionText(stampsTransferInmateInfo, text);
	}
	
	public void verifylastTransCompMsgWithStampCount(String StampsBeTrans,String stampsTrans) {

		int actStamps=Integer.parseInt(StampsBeTrans)-Integer.parseInt(stampsTrans);
		String text = ("Your new stamp balance is "+actStamps+" stamps.");
		assertionText(lastTransferMsg, text);
	}
	
	public void verifylastTransCompMsgWithStampCount(String universalStamps,String facilityStamps,String stampsTrans,String facility) {

		int actStamps=Integer.parseInt(universalStamps)+Integer.parseInt(facilityStamps)-Integer.parseInt(stampsTrans);
		String text = ("Your new stamp balance at "+facility+" is "+actStamps+" stamps.");
		assertionText(lastTransferMsg, text);
	}
	
	public void verifylastTransCompMsgWithStampCount(String facilityStamps,String stampsTrans,String facility) {

		int actStamps=Integer.parseInt(facilityStamps)-Integer.parseInt(stampsTrans);
		String text = ("Your new stamp balance at "+facility+" is "+Integer.toString(actStamps)+" stamps.");
		assertionText(lastTransferMsg, text);
	}

	public boolean isConfirmationMessagePresent() {

		try {
			String xpath = "//*[@id='LabelConfirmationId']";
			boolean displayed = getDriver().findElement(By.xpath(xpath)).isDisplayed();
			return displayed;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public void VerifyTransferConNumVisible() {

		logging("Confirmation Number visible : "+isConfirmationMessagePresent());
		assertBooleanTrue(isConfirmationMessagePresent());
	}
	
	public String getStamps(){
		
		String stamps="";
		String [] stampsArr=stampBalanceBucket.getText().split(" ");
		//String [] stampsArr=buyStampBucket.getText().split(" ");
		stamps = stampsArr[2].substring(1,stampsArr[2].length()-1);
		return stamps;
	}
	
	
	
	public String getStampTransferConNum() {

		String conNum = stampTranferConNum.getText().split(" ")[4].
				substring(0, stampTranferConNum.getText().split(" ")[4].length()-1);
		logging("Stamp Transfer Confirmation Number : " + conNum);
		return conNum;
	}
	
	public boolean isStampTransferConNumPresent(String ConNum){
		
		try {
			return getDriver().findElement(By.xpath("//*[@id='TransferHistory_Grid']//tr//td[contains(text(),'"+ConNum+"')]")).isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public void verifyStampTransferConNumPresent(String ConNum){
		
		logging("Stamp Transfer Confirmation Number - "+ConNum+" is Present : "+isStampTransferConNumPresent(ConNum));
		assertTrue(isStampTransferConNumPresent(ConNum));
	}
	
	public void verifyStampTransferConNum(String conNum){
		assertionText("Stamp Transfer Confirmation Number :: ", firstStampTransferConNum, conNum);
	}
	
	public void verifyTransferStampsLinkNotVisible(){
		
		logging("Transfer Stamps Link is not Visible : "+!isElementDisplayed(transferStamps));
		assertTrue(!isElementDisplayed(transferStamps));
	}
	
	public void verifyTransferStampsLinkVisible(){
		
		logging("Transfer Stamps Link is Visible : "+isElementDisplayed(transferStamps));
		assertTrue(isElementDisplayed(transferStamps));
	}
	
	public void verifyTransferStampsAvailableStampsMsg(String facilityStamps,String universalStamps,String facility){
		
		String stampCount = Integer.toString(Integer.parseInt(facilityStamps)+Integer.parseInt(universalStamps));
		String expText = "You have "+stampCount+" stamps. Stamps can only be transferred within "+facility+".";
		assertionText("Message", availableStampCountMsg, expText);
	}
	
	public void verifyTransferStampsAvailableStampsMsg(String facilityStamps,String facility){
		
		String expText = "You have "+facilityStamps+" stamps. Stamps can only be transferred within "+facility+".";
		assertionText("Message", availableStampCountMsg, expText);
	}
	
	public void verifyPopupTransferConfirmationMsgPresent(String stampsToTransfer,String inmateName,String universalStamps,String facilityStamps){
		
		String actText = popupTransferConfirmationMsg.getText();
		String expText1 = "You are about to transfer "+stampsToTransfer+" stamps to "+inmateName.toUpperCase()+".";
		String expText2 = "Your new stamp balance will be "+Integer.toString((Integer.parseInt(universalStamps)+Integer.parseInt(facilityStamps)-Integer.parseInt(stampsToTransfer)))+".";
		String expText3 = "This transaction is final. Do you wish to proceed?";
		boolean isTrue1=actText.contains(expText1);
		boolean isTrue2=actText.contains(expText2);
		boolean isTrue3=actText.contains(expText3);
		logging(expText1+" : "+isTrue1);
		assertTrue(isTrue1);
		logging(expText2+" : "+isTrue2);
		assertTrue(isTrue2);
		logging(expText3+" : "+isTrue3);
		assertTrue(isTrue3);
	}
	
	public void verifyPopupTransferConfirmationMsgPresent(String stampsToTransfer,String inmateName,String facilityStamps){
		
		String actText = popupTransferConfirmationMsg.getText();
		String expText1 = "You are about to transfer "+stampsToTransfer+" stamps to "+inmateName.toUpperCase()+".";
		String expText2 = "Your new stamp balance will be "+Integer.toString((Integer.parseInt(facilityStamps)-Integer.parseInt(stampsToTransfer)))+".";
		String expText3 = "This transaction is final. Do you wish to proceed?";
		boolean isTrue1=actText.contains(expText1);
		boolean isTrue2=actText.contains(expText2);
		boolean isTrue3=actText.contains(expText3);
		logging(expText1+" : "+isTrue1);
		assertTrue(isTrue1);
		logging(expText2+" : "+isTrue2);
		assertTrue(isTrue2);
		logging(expText3+" : "+isTrue3);
		assertTrue(isTrue3);
	}
	
	
	
	
	

	

}
