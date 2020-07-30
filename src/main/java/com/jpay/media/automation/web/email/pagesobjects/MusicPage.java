package com.jpay.media.automation.web.email.pagesobjects;

import java.text.NumberFormat;
import java.util.Locale;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.jpay.media.automation.web.baseobjects.BasePageObject;

public class MusicPage extends BasePageObject{

	/************************************************************************************************
	 ******************************************* CONSTRUCTOR*****************************************
	 ************************************************************************************************/

	public MusicPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	/***********************************************CONSTRUCTOR****************************************
	 **************************************************************************************************
	 **************************************************************************************************/

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	// Enter media fund input
	@FindBy(xpath = "//*[@id='TextBoxDollarAmount']")
	private WebElement mediaFundInput;

	// Next Button
	@FindBy(xpath = "//*[@id='ButtonNext']")
	private WebElement nextButton;

	// fIRST Continue Button
	@FindBy(xpath = "//*[@id='imgContinue']")
	private WebElement firstContinueButton;

	// Second Continue Button
	@FindBy(xpath = "//*[@id='btnContinue']")
	private WebElement secondContinueButton;

	// Payment verification Inmate name
	//@FindBy(xpath = "//span[@id='lblInmateName']")
	@FindBy(xpath = "//table[@class='PaymentVerification']//tr[2]//td[2]")
	private WebElement jpayCreditInmateName;

	// Payment verification Inmate Id
	//@FindBy(xpath = "//span[@id='lblInmateID']")
	@FindBy(xpath = "//table[@class='PaymentVerification']//tr[3]//td[2]")
	private WebElement jpayCreditInmateId;

	// Payment verification Payment Amount
	//@FindBy(xpath = "//span[@id='lblPrevAmount']")
	@FindBy(xpath = "//table[@class='PaymentVerification']//tr[4]//td[2]")
	private WebElement jpayCreditPaymentAmount;

	// Payment verification Jpay Amount
	//@FindBy(xpath = "//span[@id='lblPrevFee']")
	@FindBy(xpath = "//table[@class='PaymentVerification']//tr[5]//td[2]")
	private WebElement jpayCreditJpayFee;

	// Payment verification Total Amount
	//@FindBy(xpath = "//span[@id='lblPrevTotAmount']")
	@FindBy(xpath = "//table[@class='PaymentVerification']//tr[6]//td[2]")
	private WebElement jpayCreditTotalAmount;

	// Payment Status
	@FindBy(xpath = "//span[@id='lbl_paymentgateway']")
	private WebElement paymentStatus;

	// Payment Success Message
	@FindBy(xpath = "(//*[@id='pnlSuccess']//p)[1]")
	private WebElement paymentSuccMsg;//Thank you for funding media account.

	// Submit Button
	@FindBy(xpath = "//*[@id='ContinueButton']")
	private WebElement submitButton;

	
	
	

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	/************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD***********************
	 ************************************************************************************************/

	
	public void enterMediaFund(String amount) {
		setText(mediaFundInput, amount);
	}

	public void clickNextButton() {

		logging("Clicking on : "+nextButton.getAttribute("value"));
		nextButton.click();
	}

	public void clickFirstContinueButton() {

		logging("Clicking on : "+firstContinueButton.getAttribute("value"));
		firstContinueButton.click();
	}

	public void click2ndContinueButton() {

		logging("Clicking on : "+secondContinueButton.getAttribute("value"));
		secondContinueButton.click();
	}

	public void clickSubmitButton() {

		logging("Clicking on : "+submitButton.getAttribute("value"));
		submitButton.click();
	
	}
	


	public void verifyInmateName(String name) {

		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[contains(text(),'Payment Verification')]"), "Payment Verification"));
		String expName= name.split(" ")[0].concat(", ").concat(name.split(" ")[1]);
		assertionText(jpayCreditInmateName.getText().toUpperCase(), expName.toUpperCase());
	}

	public void verifyInmateId(String id) {

		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[contains(text(),'Payment Verification')]"), "Payment Verification"));
		assertionText(jpayCreditInmateId, id);
	}

	public void verifyPaymentAmount(String amount) {

		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[contains(text(),'Payment Verification')]"), "Payment Verification"));
		//String text = "$"+amount+".00";
		Locale locale = new Locale("en", "US");
		 NumberFormat cFormat = NumberFormat.getCurrencyInstance(locale);
	     String currency = cFormat.format(Double.parseDouble(amount));
		assertionText(jpayCreditPaymentAmount, currency);
	}

	public void verifyJpayFee(String jpayFee) {

		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[contains(text(),'Payment Verification')]"), "Payment Verification"));
		assertionText(jpayCreditJpayFee, jpayFee);
	}

	public void verifyTotalCharge(String amount, String jpayFee) {

		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[contains(text(),'Payment Verification')]"), "Payment Verification"));
		String jpayFee1=jpayFee.substring(1, jpayFee.length());
		Locale locale = new Locale("en", "US");
		NumberFormat cFormat = NumberFormat.getCurrencyInstance(locale);
	    String currency = cFormat.format(Double.parseDouble(amount) + Double.parseDouble(jpayFee1));
		//String expTotalCharge = "$"+Double.toString(Double.parseDouble(amount) + Double.parseDouble(jpayFee1));
		assertionText(jpayCreditTotalAmount, currency);
	}
	
	public boolean isConfirmationNumberPresent() {

		try {
			String xpath = "//*[@id='lbl_ConfirmationID']";
			boolean displayed = getDriver().findElement(By.xpath(xpath)).isDisplayed();
			return displayed;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public void VerifyTransferConfirmationNumberVisible() {
		
		logging("Jpay Credit Payment Confirmation Number Present : " + isConfirmationNumberPresent());
		logging("Jpay Credit Payment Confirmation Number  : " +getDriver().findElement(By.xpath("//*[@id='lbl_ConfirmationID']")).getText() );
		assertBooleanTrue(isConfirmationNumberPresent());
	}

	public void VerifyTransferPaymentSuccessMessage(String successMsg) {

		pause(2000);
		assertionText(paymentSuccMsg, successMsg);
	}
	public void VerifyTransferPaymentStatus(String status) {

		assertionText(paymentStatus, status);
	}
	
	public void verifyJpayFeePresent() {

		logging("JPay Fee is present : "+isElementDisplayed(jpayCreditJpayFee));
		logging("JPay Fee : "+jpayCreditJpayFee.getText());
		assertTrue(isElementDisplayed(jpayCreditJpayFee));
	}
	
	public String getJpayFee(){
		
		return jpayCreditJpayFee.getText();
	}



}
