package com.jpay.media.automation.web.email.pagesobjects;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import org.apache.poi.ss.formula.eval.ConcatEval;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.jpay.media.automation.web.baseobjects.BasePageObject;
import com.jpay.media.automation.web.utilities.Log;

public class SendMoneyPage extends BasePageObject {

	/************************************************************************************************
	 ******************************************* CONSTRUCTOR*****************************************
	 ************************************************************************************************/

	public SendMoneyPage(WebDriver driver) {
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

	// List of All Transfer Category
	@FindBy(xpath = "//select[@id='uclSelectInmate_ddlTransferCategories']/option")
	private List<WebElement> transferCategoryList;

	// Select Transfer Category
	@FindBy(xpath = "//select[@id='uclSelectInmate_ddlTransferCategories']")
	private WebElement selectTransferCategory;

	// Send money Continue button
	@FindBy(xpath = "//input[@id='uclSelectInmate_btnContinue']")
	private WebElement sendMoneyCategoryContinueButton;

	// Enter Send money Amount
	@FindBy(xpath = "//input[@id='ed_Amount']")
	private WebElement sendMoneyAmountInput;

	// Enter Send money Continue Button
	@FindBy(xpath = "//input[@id='btnContinue']")
	private WebElement sendMoneyAmountContinueButton;

	// Payment verification Inmate name
	//@FindBy(xpath = "//span[@id='lblInmateName']")
	@FindBy(xpath = "//table[@class='PaymentVerification']//tr[2]//td[2]")
	private WebElement sendMoneyInmateName;

	// Payment verification Inmate Id
	//@FindBy(xpath = "//span[@id='lblInmateID']")
	@FindBy(xpath = "//table[@class='PaymentVerification']//tr[3]//td[2]")
	private WebElement sendMoneyInmateId;

	// Payment verification Inmate Location
	//@FindBy(xpath = "//span[@id='lblFacility']")
	@FindBy(xpath = "//table[@class='PaymentVerification']//tr[4]//td[2]")
	private WebElement sendMoneyInmateLoc;

	// Payment verification Payment Amount
	//@FindBy(xpath = "//span[@id='lblPrevAmount']")
	@FindBy(xpath = "//table[@class='PaymentVerification']//tr[5]//td[2]")
	private WebElement sendMoneyPaymentAmount;

	// Payment verification Jpay Amount
	//@FindBy(xpath = "//span[@id='lblPrevFee']")
	@FindBy(xpath = "//table[@class='PaymentVerification']//tr[6]//td[2]")
	private WebElement sendMoneyJpayAmount;

	// Payment verification Total Amount
	//@FindBy(xpath = "//span[@id='lblPrevTotAmount']")
	@FindBy(xpath = "//table[@class='PaymentVerification']//tr[7]//td[2]")
	private WebElement sendMoneyTotalAmount;

	// Submit Button
	@FindBy(xpath = ".//input[@id='ContinueButton']")
	private WebElement submitButton;

	// Payment Success Message
	@FindBy(xpath = ".//span[@id='MyDataListPaymentStatus_ctl00_lblPaymentStatus']")
	private WebElement paymentSuccessMsg;

	// Free note input box
	@FindBy(xpath = ".//*[@id='message']")
	private WebElement freeNoteInput;

	// Free note Check box
	@FindBy(xpath = ".//*[@id='cb_Agree']")
	private WebElement freeNoteCheckbox;

	// Free note No thanks button
	@FindBy(xpath = ".//*[@id='btnCancelPromo']")
	private WebElement freeNoteNoThanks;

	// Free note Send button
	@FindBy(xpath = ".//*[@id='btnSend']")
	private WebElement freeNoteSend;

	// Free note Send Confirmation message
	@FindBy(xpath = ".//*[@id='NoteConfirmationLabel']")
	private WebElement freeNoteSendConfirmMsg;
	
	// Free note text
	@FindBy(xpath = "//*[@id='lblMessagePromoLabel']")
	private WebElement freeNoteText;
	
	// Free note character Text
	@FindBy(xpath = "//*[@id='charText']")
	private WebElement freeNoteCharText;
	
	// Free note character Count
	@FindBy(xpath = "//*[@id='charCount']")
	private WebElement freeNoteCharCount;


	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	/************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD***********************
	 ************************************************************************************************/

	public void selectRandomTransferCategory() {

		wait.until(ExpectedConditions.textToBe(By.xpath(".//h1[contains(text(),'Send Money')]"), "Send Money"));
		int size = transferCategoryList.size()-1;
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(size);
		if (randomInt==0) {
			randomInt=randomInt+1;
		}
		Log.info(">>>>><<<<<<  " + randomInt);
		selectElementByIndex(selectTransferCategory, randomInt);
		logging("Transfer Category selected : " + getDriver()
				.findElement(
						By.xpath("//select[@id='uclSelectInmate_ddlTransferCategories']/option[@selected='selected']"))
				.getText());

	}

	public void clickSendMoneyCategoryContinueButton() {

		logging("Clicking on : " + getTextByValue(sendMoneyCategoryContinueButton));
		sendMoneyCategoryContinueButton.click();

	}

	public void enterSendMoneyAmount(String amount) {

		setText(sendMoneyAmountInput, amount);

	}

	public void clickSendMoneyAmountContinueButton() {

		logging("Clicking on : " + getTextByValue(sendMoneyAmountContinueButton));
		sendMoneyAmountContinueButton.click();

	}

	public void verifyInmateName(String name) {

		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[contains(text(),'Payment Verification')]"), "Payment Verification"));
		assertionText(sendMoneyInmateName, name);
	}

	public void verifyInmateId(String id) {

		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[contains(text(),'Payment Verification')]"), "Payment Verification"));
		assertionText(sendMoneyInmateId, id);
	}

	public void verifyInmateLocation(String location) {

		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[contains(text(),'Payment Verification')]"), "Payment Verification"));
		assertionText(sendMoneyInmateLoc.getText().toUpperCase(), location.toUpperCase());
	}

	public void verifyPaymentAmount(String amount) {

		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[contains(text(),'Payment Verification')]"), "Payment Verification"));
		//String text = "$"+amount+".00";
		Locale locale = new Locale("en", "US");
		 NumberFormat cFormat = NumberFormat.getCurrencyInstance(locale);
	     String currency = cFormat.format(Double.parseDouble(amount));
		assertionText(sendMoneyPaymentAmount, currency);
	}

	public void verifyJpayFee(String jpayFee) {

		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[contains(text(),'Payment Verification')]"), "Payment Verification"));
		assertionText(sendMoneyJpayAmount, jpayFee);
	}
	
	public void verifyJpayFeePresent() {

		logging("JPay Fee is present : "+isElementDisplayed(sendMoneyJpayAmount));
		logging("JPay Fee : "+sendMoneyJpayAmount.getText());
		assertTrue(isElementDisplayed(sendMoneyJpayAmount));
	}
	
	public String getJpayFee(){
		
		return sendMoneyJpayAmount.getText();
	}

	public void verifyTotalCharge(String amount, String jpayFee) {

		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[contains(text(),'Payment Verification')]"), "Payment Verification"));
		String jpayFee1=jpayFee.substring(1, jpayFee.length());
		Locale locale = new Locale("en", "US");
		NumberFormat cFormat = NumberFormat.getCurrencyInstance(locale);
	    String currency = cFormat.format(Double.parseDouble(amount) + Double.parseDouble(jpayFee1));
		//String expTotalCharge = "$"+Double.toString(Double.parseDouble(amount) + Double.parseDouble(jpayFee1));
		assertionText(sendMoneyTotalAmount, currency);
	}

	public void clickTransferMoneySubmitButton() {

		logging("Clicking on : " + getTextByValue(submitButton));
		submitButton.click();

	}

	public boolean isConfirmationMessagePresent() {

		try {
			String xpath = "//*[@id='MyDataListPaymentStatus_ctl00_lblTransferID']";
			boolean displayed = getDriver().findElement(By.xpath(xpath)).isDisplayed();
			return displayed;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public void VerifyTransferConfirmationNumberVisible() {
		logging("Transfer Payment Confirmation Number visible : " + isConfirmationMessagePresent());
		assertBooleanTrue(isConfirmationMessagePresent());
	}

	public void VerifyTransferPaymentSuccessMessage(String successMessage) {

		pause(3000);
		assertionText(paymentSuccessMsg, successMessage);
	}

	public void enterFreeNote(String freenote) {
		logging("Entering Value : " + freenote);
		freeNoteInput.click();
		pause(500);
		enterText(freenote);

	}

	public void enterFreeNotePlain(String freenote) {
		
		setText(freeNoteInput,freenote);
	}

	public void checkFreenoteCheckbox() {

		logging("Checking on Freenote checkbox.");
		pressSpace(freeNoteCheckbox);
	}

	public void clickFreenoteNoThanksButton() {

		logging("Clicking on : " + getTextByValue(freeNoteNoThanks));
		freeNoteNoThanks.click();

	}

	public void clickFreenoteSendButton() {

		logging("Clicking on : " + getTextByValue(freeNoteSend));
		freeNoteSend.click();

	}

	public void VerifyFreenoteSendConMessage(String freenoteSendConMessage) {

		wait.until(ExpectedConditions.elementToBeClickable(freeNoteSendConfirmMsg));
		assertionText(freeNoteSendConfirmMsg, freenoteSendConMessage);
	}
	
	public void VerifyFreenoteInitialText(String freenoteText) {

		assertionText(freeNoteText, freenoteText);
	}
	
	public void VerifyFreenoteCharLimit(String freenoteCharLimit) {

		assertionText(freeNoteCharText, freenoteCharLimit);
	}

}
