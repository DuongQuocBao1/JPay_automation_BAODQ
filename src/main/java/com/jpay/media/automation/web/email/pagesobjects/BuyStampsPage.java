package com.jpay.media.automation.web.email.pagesobjects;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.jpay.media.automation.web.baseobjects.BasePageObject;
import com.jpay.media.automation.web.utilities.Log;

public class BuyStampsPage extends BasePageObject {

	/************************************************************************************************
	 ******************************************* CONSTRUCTOR*****************************************
	 ************************************************************************************************/

	public BuyStampsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	/*********************************************** CONSTRUCTOR****************************************
	 *************************************************************************************************
	 *************************************************************************************************/

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	// Money Select Radio Button
	@FindAll({@FindBy(xpath = ".//input[@name='rbl_Postage']")})
	private List<WebElement> MoneySelectRadioButton;

	// Cancel Button
	@FindBy(xpath = ".//input[@id='btnCancel']")
	private WebElement cancelButton;

	// Continue Button
	@FindBy(xpath = ".//input[@id='btnContinue']")
	private WebElement continueButton;

	// Use a new credit/debit card
	@FindBy(xpath = ".//input[@id='NewCardButton']")
	private WebElement newCreditDebitCardRadio;

	// Enter Credit Card Number
	@FindBy(xpath = ".//input[@id='CardholderData_CardNumber']")
	private WebElement creditCardNum;
	
	// Select Card Type
	@FindBy(xpath = ".//select[@id='CardholderData_CardTypeForCyberSource']")
	private WebElement cardType;
	
	// Select Credit Card 
	@FindBy(xpath = ".//select[@id='CardTokenData_CardListValueId']")
	private WebElement creditCard;
	
	// Select Credit Card from List
	@FindBy(xpath = "//select[@id='CardTokenData_CardListValueId']/option")
	private List<WebElement> cardSelection;
	
	// Select Month
	@FindBy(xpath = ".//select[@id='CardholderData_CardExpiryMonth']")
	private WebElement selectMonth;
	
	// Select Year
	@FindBy(xpath = ".//select[@id='CardholderData_CardExpiryYear']")
	private WebElement selectYear;
	
	// Credit Card validation Code for New Card
	@FindBy(xpath = "//*[@id='CardholderData_Cvv']")
	private WebElement creditValCodeNew;
	
	// Credit Card validation Code for Existing Card
	@FindBy(xpath = "//*[@id='CardTokenData_Cvv']")
	private WebElement creditValCodeExisting;
	
	// Accepted Product Terms Credit Card
	@FindBy(xpath = ".//td/input[@id='AcceptedProductTerms']")
	private WebElement acceptProductTerms;
	
	// Buy Stamps Button
	@FindBy(xpath = ".//input[@id='ContinueButton']")
	private WebElement buyStampsButton;
	
	// Buy Stamps Success Message
	@FindBy(xpath = "//*[@id='lblConfirmMessage']")
	private WebElement buyStampsSuccMsg;
	
	// Stamps Purchase Date
	@FindBy(xpath = "//*[@id='LabelDate']")
	private WebElement purchaseDate;

	//Stamp purchase CONFIRMATION NUMBER
	@FindBy(xpath = "//*[@id='MyDataListPaymentStatus_ctl00_LabelConfirmationNumber']")
	private WebElement stampPurConNum;

	//fIRST Stamp purchase CONFIRMATION NUMBER
	@FindBy(xpath = "(//*[@id='TransferHistory_Grid']//following::tr[1]//td[3])[1]")
	private WebElement firstStampPurchaseConNum;

	//Use A New Credit/Debit Card Checkbox
	@FindBy(xpath = ".//*[@id='NewCardButton']")
	private WebElement useANewCreditDebitCard;

	//SaveCardPaymentInformationTerms Checkbox
	@FindBy(xpath = ".//*[@id='CardholderData_SaveCardOnFile']")
	private WebElement saveCardPaymentInformationTerms;

	//CardOnFileTerms Checkbox
	@FindBy(xpath = ".//*[@id='CardholderData_AcceptedCardOnFileTerms']")
	private WebElement cardOnFileTerms;
	
	// Buy Stamps Back Button
	@FindBy(xpath = ".//input[@id='btnBack']")
	private WebElement buyStampsBackButton;
	
	// Stamps Balance Bucket bucket
	@FindBy(xpath = ".//*[contains(text(),'Stamp Balance')]")
	private WebElement stampBalanceBucket;
	
	// Inmate name label
	@FindBy(xpath = ".//span[@id='uclSelectedInmateFromSession_SelectedInmateLabel']")
	private WebElement inmateNameLabel;
	
	// Inmate id label
	@FindBy(xpath = ".//span[@id='uclSelectedInmateFromSession_SelectedInmateIDLabel']")
	private WebElement inmateIdLabel;
	
	// Inmate Facility label
	@FindBy(xpath = ".//span[@id='uclSelectedInmateFromSession_SelectedInmateFacilityLabel']")
	private WebElement inmateFacilityLabel;
	
	// Stamp purchased message
	@FindBy(xpath = ".//span[@id='alertStampPurchase']")
	private WebElement stampPurchasedFacilityMsg;
	
	// Stamp Packages message
	@FindBy(xpath = ".//*[@id='u382']")
	private WebElement stampPackagesFacilityMsg;

	// Purchased Stamp count
	@FindBy(xpath = ".//span[@id='MyDataListPaymentStatus_ctl00_lblPurchased']")
	private WebElement purchasedStampsCount;

	
	
	
	
	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	/************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD***********************
	 ************************************************************************************************/

	public void clickCancelButton() {

		click(cancelButton);
	}

	public void clickContinueButton() {
		logging("Clicking on : "+getTextByValue(continueButton));
		continueButton.click();
		
	}

	public void selectRandomMoneyRadioButton() {

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("rbl_Postage_0")));
		int size = MoneySelectRadioButton.size();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(size);
		if (randomInt==0) {
		 randomInt = randomInt+1;
		}
		String ranInt = Integer.toString(randomInt);
		Log.info(">>>>><<<<<<  "+ranInt);
		WebElement element = getDriver().findElement(By.xpath("(.//input[@name='rbl_Postage'])["+ranInt+"]"));
		click(element);
	}
	
	public void selectRandomCardType() {

		Random randomGenerator = new Random();
		int randomMonth = randomGenerator.nextInt(3);
		selectElementByIndex(cardType, randomMonth);
	}
	
	public void clickUseNewCreditCardRadioButton(){
		
		logging("Clicking on Use a new credit/debit card radio button");
		wait.until(ExpectedConditions.elementToBeClickable(newCreditDebitCardRadio));
	    newCreditDebitCardRadio.click();
	}
	
	public void selectCardType(String cardtype) {

		logging("Card Type selected : "+cardtype);
		selectElementByVisibleText(cardType, cardtype);
	}
	
	public void selectRandomCreditCardFromList() {
		
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[contains(text(),'Card Information')]"), "Card Information"));
		int size = cardSelection.size();
		System.out.println();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(size);
		if (randomInt==size) {
			randomInt=size-1;
		}
		Log.info(">>>>><<<<<<  "+randomInt);
		selectElementByIndex(creditCard, randomInt);
		logging("Credit Card Selected : "+cardSelection.get(randomInt).getText());
	}
	
	public void selectRandomMonth() {

		Random randomGenerator = new Random();
		int randomMonth = randomGenerator.nextInt(11);
		if (randomMonth==0) {
			randomMonth=1;
		}
		selectElementByIndex(selectMonth, randomMonth);
	}

	public void selectRandomExpiryYear() {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
		Date date = new Date();
		int year = Integer.parseInt(formatter.format(date));
		int randomYear = year + 5;
		String expiryYear = Integer.toString(randomYear);
		selectElementByValue(selectYear, expiryYear);
	}
	
	public void enterCreditCardNum(String num){
		
		setText(creditCardNum, num);
	}
	
	public void enterCreditValCodeForNewCard(String code){
		
		setText(creditValCodeNew, code);
	}
	
	public void enterCreditValCodeForExistingCard(String code){
		wait.until(ExpectedConditions.elementToBeClickable(creditValCodeExisting));
		setText(creditValCodeExisting, code);
	}
	
	public void checkSaveCardPaymentInformationTerms(){
		
		logging("Checking on SaveCardPaymentInformation terms-condition checkbox.");
		pressSpace(saveCardPaymentInformationTerms);
	}
	
	public void checkCardOnFileTerms(){
		
		logging("Checking on CardOnFile terms-condition checkbox.");
		pressSpace(cardOnFileTerms);
	}
	
	public void checkAcceptedTerms(){
		
		logging("Checking on credit card terms-condition checkbox.");
		pressSpace(acceptProductTerms);
	}
	
	public void checkUseANewCreditDebitCard(){
		
		logging("Checking on Use A New Credit/Debit Card checkbox.");
		pressSpace(useANewCreditDebitCard);
	}
	
	public void switchToIframeById(String id){
		
		//pause(5000);
		/*getDriver().switchTo().frame(id);
		pause(1000);*/
	}
	
	public void switchToParentWindow(){
		
		//getDriver().switchTo().defaultContent();	
	}
	
	public void clickBuyStampsButton() {

		logging("Clicking on : "+getTextByValue(buyStampsButton));
		buyStampsButton.click();
		
	}
	
	public void clickBuyStampsBackButton() {

		logging("Clicking on : "+getTextByValue(buyStampsBackButton));
		buyStampsBackButton.click();
		
	}
	
	public void verifyBuyStampsSuccessMessage(String msg){
		
		//pause(2000);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("(.//*[contains(text(),'Confirmation Number')])[1]"), "Confirmation Number"));
		assertionText(buyStampsSuccMsg, msg);
	}
	
	public void verifyPurchaseDate(){
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDateTime now = LocalDateTime.now();
		String expDate = dtf.format(now);
		assertionText(purchaseDate, expDate);
	}
	
	public boolean isConfirmationMessagePresent(){
		
		try {
			String xpath = "//*[@id='MyDataListPaymentStatus_ctl00_LabelConfirmationNumber']";
			boolean displayed = getDriver().findElement(By.xpath(xpath)).isDisplayed();
			return displayed;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public void VerifyConfirmationNumberVisible(){
		logging("Confirmation Number visible : "+isConfirmationMessagePresent());
		assertBooleanTrue(isConfirmationMessagePresent());
	}
	
	public boolean isExpiredCardPresent(){
		
		try {
			String xpath = ".//*[contains(text(),'Use a credit/debit card from My Account')]";
			boolean displayed = getDriver().findElement(By.xpath(xpath)).isDisplayed();
			return displayed;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public void VerifyExpiredCardNotVisible(){
		
		logging("Expired Card is not visible : "+!isExpiredCardPresent());
		assertBooleanTrue(!isExpiredCardPresent());
		
	}
	
	public String getStampPurchaseConNum() {

		String conNum = stampPurConNum.getText();
		logging("Stamp Purchase Confirmation Number : " + conNum);
		return conNum;
	}
	
	public boolean isStampPurchaseConNumPresent(String ConNum){
		
		try {
			return getDriver().findElement(By.xpath("//*[@id='TransferHistory_Grid']//tr//td[contains(text(),'"+ConNum+"')]")).isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public void verifyStampPurchaseConNumPresent(String ConNum){
		
		logging("Stamp Purchase Confirmation Number - "+ConNum+" is Present : "+isStampPurchaseConNumPresent(ConNum));
		assertTrue(isStampPurchaseConNumPresent(ConNum));
	}
	
	public void verifyStampPurchaseConNum(String conNum){
		assertionText("Stamp Purchase Confirmation Number :: ", firstStampPurchaseConNum, conNum);
	}
	
	public void clickStampBalanceBucket(){
		
		click(stampBalanceBucket);
	}
	
	public void verifyStampBalanceBucketPresent(){
		
		logging("Stamp Balance Bucket is Present : "+ isElementDisplayed(stampBalanceBucket));
		assertTrue(isElementDisplayed(stampBalanceBucket));
	}
	
	public void verifyBuyStampInmateName(String inmate){
		
		assertionText("Inmate Name", inmateNameLabel, inmate);
	}
	
	public void verifyBuyStampInmateId(String inmateId){
		
		String a=inmateIdLabel.getText();
		String actId=a.split("#")[1];
		System.out.println(actId);
		assertionText("Inmate Id", actId, inmateId);
	}
	
	public void verifyBuyStampInmateFacility(String facility){
		
		assertionText("Inmate Facility", inmateFacilityLabel, facility);
	}
	
	public void verifyStampPurchasedFacilityMsg(String facility){
		
		String text = "Stamps purchased for this contact can only be used within the "+facility;
		assertionText(stampPurchasedFacilityMsg, text);
	}
	
	public void verifyStampPackagesFacilityMsg(String facility){
		
		String text = "Stamp Packages for "+facility;
		assertionText(stampPackagesFacilityMsg, text);
	}
	
	public String getStampsCountByFacility(String facility){
		
		WebElement stampsCountByFacility= getDriver().findElement(By.xpath("(.//span[contains(text(),'"+facility+"')]//following::span)[1]"));
		String count = stampsCountByFacility.getText();
		logging("Facility Stamps Count : "+count);
		return count;
	}
	
	public String getStampsCountUniversal(){
		
		WebElement stampsCount= getDriver().findElement(By.xpath("(.//span[contains(text(),'Universal Stamps')]//following::span)[1]"));
		String count = stampsCount.getText();
		logging("Universal Stamps Count : "+count);
		return count;
	}
	
	public void verifyUniversalStampsCount(String stamps){
		
		WebElement element= getDriver().findElement(By.xpath("(.//span[contains(text(),'Universal Stamps')]//following::span)[1]"));
		assertionText("Universal Stamps", element, stamps);
	}
	
	public void verifyUniversalStampsCount(String stamps,String usedStamps){
		
		WebElement element= getDriver().findElement(By.xpath("(.//span[contains(text(),'Universal Stamps')]//following::span)[1]"));
		String expStamps = Integer.toString(Integer.parseInt(stamps)-Integer.parseInt(usedStamps.split(" ")[0]));
		assertionText("Universal Stamps", element, expStamps);
	}
	
	public boolean isUniversalStampsPresent(){
		
		try {
			return getDriver().findElement(By.xpath("(.//span[contains(text(),'Universal Stamps')]//following::span)[1]")).isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public void verifyUniversalStampsAbsent(){
		
		logging("Universal Stamps is Absent : "+ !isUniversalStampsPresent());
		assertTrue(!isUniversalStampsPresent());
	}
	
	public void verifyStampsBalance(String stamps){
		
		String actStamps = stampBalanceBucket.getText().split(" ")[2].substring(1,stampBalanceBucket.getText().split(" ")[2].length()-1);
		assertionText("Stamps Balance", actStamps, stamps);	
	}
	
	public void verifyStampsBalance(String uniStamps,String facilityStamps,String purchasedStamps){
		
		String actStamps = stampBalanceBucket.getText().split(" ")[2].substring(1,stampBalanceBucket.getText().split(" ")[2].length()-1);
		String expStamps = Integer.toString(Integer.parseInt(uniStamps)+Integer.parseInt(facilityStamps)+Integer.parseInt(purchasedStamps));
		assertionText("Stamps Balance", actStamps, expStamps);	
	}
	
	public void verifyStampsBalance(String facilityStamps,String purchasedStamps){
		
		String actStamps = stampBalanceBucket.getText().split(" ")[2].substring(1,stampBalanceBucket.getText().split(" ")[2].length()-1);
		String expStamps = Integer.toString(Integer.parseInt(facilityStamps)+Integer.parseInt(purchasedStamps));
		assertionText("Stamps Balance", actStamps, expStamps);	
	}
	
	public void verifyStampsBalanceBucket(String uniStamps,String facilityStamps,String usedStamps){
		
		String actStamps = stampBalanceBucket.getText().split(" ")[2].substring(1,stampBalanceBucket.getText().split(" ")[2].length()-1);
		String expStamps = Integer.toString(Integer.parseInt(uniStamps)+Integer.parseInt(facilityStamps)-Integer.parseInt(usedStamps.split(" ")[0]));
		assertionText("Stamps Balance", actStamps, expStamps);	
	}
	
	public void verifyStampsBalanceBucket(String facilityStamps,String usedStamps){
		
		String actStamps = stampBalanceBucket.getText().split(" ")[2].substring(1,stampBalanceBucket.getText().split(" ")[2].length()-1);
		String expStamps = Integer.toString(Integer.parseInt(facilityStamps)-Integer.parseInt(usedStamps.split(" ")[0]));
		assertionText("Stamps Balance", actStamps, expStamps);	
	}
	
	public String getPurchasedStamps(){
		
		String count = purchasedStampsCount.getText();
		logging("Purchased Stamps Count : "+count);
		return count;
	}
	
	public void verifyStampsByFacility(String facility,String stampsCountBeforePurchased,String purchasedStamps){
		
		WebElement stampsCountByFacility= getDriver().findElement(By.xpath("(.//span[contains(text(),'"+facility+"')]//following::span)[1]"));
		String expStamps = Integer.toString(Integer.parseInt(stampsCountBeforePurchased)+Integer.parseInt(purchasedStamps));
		assertionText("Stamps Balance for - "+facility, stampsCountByFacility, expStamps);	
	}
	
	public void verifyStampsByFacility(String facility,String stampsCountBeforePurchased){
		
		WebElement stampsCountByFacility= getDriver().findElement(By.xpath("(.//span[contains(text(),'"+facility+"')]//following::span)[1]"));
		assertionText("Stamps Balance for - "+facility, stampsCountByFacility, stampsCountBeforePurchased);	
	}

	public void verifyStampsByFacilityWithoutUniversalStamps(String facility,String stampsCountBeforePurchased,String usedStamps){
		
		WebElement stampsCountByFacility= getDriver().findElement(By.xpath("(.//span[contains(text(),'"+facility+"')]//following::span)[1]"));
		String expStamps = Integer.toString(Integer.parseInt(stampsCountBeforePurchased)-Integer.parseInt(usedStamps.split(" ")[0]));
		assertionText("Stamps Balance for - "+facility, stampsCountByFacility, expStamps);	
	}
	
	
	

}
