package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;

public class EmailWTC_55Test extends BaseTestObject{

	private String variation="";
	private String personalDetails="";
	private String username="";
	private String password="";
	private String adminSystem="";
	private String newCustText;
	private String facility;
	private String inmateId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String dateOfBirth;
	private String address;
	private String city;
	private String zip;
	private String state;
	private String country;
	private String email;
	private String frameId;
	private String cardNum;
	private String code;
	
	

	/************************************************************************************************
	 * 
	 * TestCase :: WTC55 - (User shall be able to Add new customer and buy stamps in staging)
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: WTC55
	 * Status :: Completed
	 * 
	 **************************************************************************************************/

	
	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details,
	 * enter username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-55 ::Design Steps"
			+ "::1,2,3,4,5,6(Navigate to Staging website,verify personal and admin "
			+ "details,enter username,password and click Login button.)")
	public void testStart() {
		
		jpayStaging().stagingLogin().loadURL(envUrlStaging,variation);
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		jpayStaging().stagingLogin().verifyStagingAdminSystem(adminSystem);
		jpayStaging().stagingLogin().enterUsername(username);
		jpayStaging().stagingLogin().enterPassword(password);
		jpayStaging().stagingLogin().clickLoginButton();
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on Transfers,click on new customer and verify new customer text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-55 ::Design Steps"
			+ "::7,8,9(Click on Transfers,click on new customer and verify new customer text.)")
	public void navigateToNewCustomer() {
		
		jpayStaging().stagingHome().clickTransfers();
		jpayStaging().stagingTransfers().clickNewCustomersLink();
		jpayStaging().stagingTransfers().verifyNewCustomerText(newCustText);
		
	}
	
	/*********************************************************************************
	 * 
	 * Select facility,enter inmateId and click lookup inmate first
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-55 ::Design Steps"
			+ "::10,11,12(Select facility,enter inmateId and click lookup inmate first.)")
	public void selectFacilityAndInmate() {
		
		jpayStaging().stagingTransfers().selectNewCustomerFacility(facility);
		jpayStaging().stagingTransfers().enterInmateId(inmateId);
		jpayStaging().stagingTransfers().clickLookupInmateButton();
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Fillout personal details form,check email receipt checkbox,enter 
	 * email address,click create account payment radio button and click 
	 * create account continue button and click on review account continue button..
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-55 ::Design Steps"
			+ "::13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29(Fillout personal details "
			+ "form,check email receipt checkbox,enter email address,click create account "
			+ "payment radio button,click create account continue button and click on "
			+ "review account continue button.)")
	public void filloutCustomerDetailsForm() {
		
		jpayStaging().stagingTransfers().filloutCustomerDetails(firstName, middleName, lastName, dateOfBirth, address,
				city, zip, state, country);
		jpayStaging().stagingTransfers().selectRelationship();
		jpayStaging().stagingTransfers().checkEmailReceiptCheckbox();
		jpayStaging().stagingTransfers().enterEmail(email);
		jpayStaging().stagingTransfers().clickCreateAccAndPaymentRadioButton();
		jpayStaging().stagingTransfers().clickCreateAccContinueButton();
		jpayStaging().stagingTransfers().clickReviewAccContinueButton();
		
	}
	

	
	/*********************************************************************************
	 * 
	 * Fillout personal details form,check email receipt checkbox,enter 
	 * email address,click create account payment radio button and click 
	 * create account continue button and click on review account continue button..
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-55 ::Design Steps"
			+ "::13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29(Fillout personal details "
			+ "form,check email receipt checkbox,enter email address,click create account "
			+ "payment radio button,click create account continue button and click on "
			+ "review account continue button.)")
	public void buyStampsAndVerify() {
		
		jpayStaging().stagingTransfers().clickMailLink();
		jpayStaging().stagingTransfers().clickPurchaseStampsRadioButton();
		jpayStaging().stagingTransfers().clickPurchaseStampsContinueButton();
		jpayStaging().stagingTransfers().clickBuyPostageContinueButton();
		jpayStaging().stagingTransfers().clicUseNewCardRadioButton();
		
		jpayStaging().stagingTransfers().clickCopyUserInfoButton();
		jpayStaging().stagingTransfers().switchToIframeById(frameId);
		jpayStaging().stagingTransfers().enterCardNumber(cardNum);
		jpayStaging().stagingTransfers().selectRandomMonth();
		jpayStaging().stagingTransfers().selectRandomExpiryYear();
		jpayStaging().stagingTransfers().enterValidationCode(code);
		jpayStaging().stagingTransfers().checkSaveCardCheckbox();
		jpayStaging().stagingTransfers().checkTermsConCheckbox();
		jpayStaging().stagingTransfers().switchToParentWindow();
		jpayStaging().stagingTransfers().clickFinalBuyStampContinueButton();
		jpayStaging().stagingTransfers().verifyPurchaseConfirmMessagePresent();
		
		
	}
	

	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "Design Steps::61,62"
			+ "(Click sign out button and verify Login details.)")
	public void endTest() {
		
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		
	}
	
	
	
	
	
	
	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_55Test(data) };
	}
	
	
	public EmailWTC_55Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		personalDetails = data.get("personalDetails");
		username = data.get("username");
		password = data.get("password");
		adminSystem = data.get("adminSystem");
		newCustText = data.get("newCustText");
		facility = data.get("facility");
		inmateId = data.get("inmateId");
		firstName = data.get("firstName");
		middleName = data.get("middleName");
		lastName = data.get("lastName");
		dateOfBirth = data.get("dateOfBirth");
		address = data.get("address");
		city = data.get("city");
		zip = data.get("zip");
		state = data.get("state");
		country = data.get("country");
		email = data.get("email");
		frameId = data.get("frameId");
		cardNum = data.get("cardNum");
		code = data.get("code");
		
	}

}
