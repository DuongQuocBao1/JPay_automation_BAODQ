package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC192 - (Verify stamps purchased functionality without universal stamps.)
 * Author :: shasan(Shahriar Hasan) , Date :: 
 * DataFile :: Email.xlsx , DataSheet :: WTC192
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_192Test extends BaseTestObject{
	

	private String variation;
	private String username;
	private String password;
	private String inmateNameJpay;
	private String inmateIdJpay;
	private String facilityJpay;
	private String code;
	private String buySuccMsg;
	private String inmateNameOhio;
	private String inmateIdOhio;
	private String facilityOhio;
	private String facilityJpay1;
	private String facilityOhio1;
	
	
	private static String JPAY_STAMPS_COUNT;
	private static String JPAY_PURCHASED_STAMPS_COUNT;
	private static String OHIO_STAMPS_COUNT;
	private static String OHIO_PURCHASED_STAMPS_COUNT;
	
	

	/*********************************************************************************
	 * 
	 * Navigate to the url,click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC192::Design Steps::"
			+ "1,2,3(Navigate to the url,click on login link and verify page title.)")
	public void testStart() {

		jpayEmail().login().loadURL(envUrlJpay, variation);
		jpayEmail().login().clickLoginLink();
		jpayEmail().login().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
	}

	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC192 :: Design Steps::"
			+ "4,5,6,7(Enter username,password,click login button and verify title of the page.)")
	public void loginAndVerify1() {

		jpayEmail().login().enterUsername(username);
		jpayEmail().login().enterPassword(password);
		jpayEmail().login().clickLoginButton();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
	}
	
	/*********************************************************************************
	 * 
	 * Select inmate,click on email link and verify stamp balance bucket is present.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC192:: Design Steps::"
			+ "8,9,10(Select inmate,click on email link and verify stamp balance bucket "
			+ "is present.)")
	public void selectInmateAndClickEmailTab1() {

		jpayEmail().login().selectInmate(inmateNameJpay,inmateIdJpay,facilityJpay);
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().buyStamps().verifyStampBalanceBucketPresent();
	}
	
	/*********************************************************************************
	 * 
	 * Click stamp balance bucket and get stamps count and verify universal stamps absent.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC192::Design Steps::"
			+ "11,12,13,14(Click stamp balance bucket and get stamps count and verify "
			+ "universal stamps absent.)")
	public void clickStampBalanceBucketAndGetStampsCount1() {

		jpayEmail().buyStamps().clickStampBalanceBucket();
		JPAY_STAMPS_COUNT = jpayEmail().buyStamps().getStampsCountByFacility(facilityJpay1);
		OHIO_STAMPS_COUNT = jpayEmail().buyStamps().getStampsCountByFacility(facilityOhio1);
		jpayEmail().buyStamps().verifyUniversalStampsAbsent();
	}

	/*********************************************************************************
	 * 
	 * Click buy stamps link,verify inmate name,id,facility,stamp purchased and packages 
	 * message,click on continue button,enter validation code,accept terms and condition,
	 * click buy stamps button,verify success message,purchase date and confirmation 
	 * number and get purchased stamp count.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC192::Design Steps::15,16"
			+ "17,18,19,20,21,22,23,24,25,26,27,28(Click buy stamps link,verify inmate name,id,"
			+ "facility,stamp purchased and packages message,click on continue button,enter "
			+ "validation code,accept terms and condition,click buy stamps button,verify "
			+ "success message,purchase date and confirmation number and get purchased "
			+ "stamp count.)")
	public void buyStampsAndVerify1() {

		jpayEmail().email().clickBuyStampsLink();
		jpayEmail().buyStamps().verifyBuyStampInmateName(inmateNameJpay);
		jpayEmail().buyStamps().verifyBuyStampInmateId(inmateIdJpay);
		jpayEmail().buyStamps().verifyBuyStampInmateFacility(facilityJpay1);
		jpayEmail().buyStamps().verifyStampPurchasedFacilityMsg(facilityJpay1);
		jpayEmail().buyStamps().verifyStampPackagesFacilityMsg(facilityJpay1);
		jpayEmail().buyStamps().clickContinueButton();
		jpayEmail().buyStamps().enterCreditValCodeForExistingCard(code);
		jpayEmail().buyStamps().checkAcceptedTerms();
		jpayEmail().buyStamps().clickBuyStampsButton();
		jpayEmail().buyStamps().verifyBuyStampsSuccessMessage(buySuccMsg);
		jpayEmail().buyStamps().verifyPurchaseDate();
		jpayEmail().buyStamps().VerifyConfirmationNumberVisible();
		
		JPAY_PURCHASED_STAMPS_COUNT = jpayEmail().buyStamps().getPurchasedStamps();
	}
	
	/*********************************************************************************
	 * 
	 * Click stamp balance bucket and verify stamps count.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC192::Design Steps::"
			+ "29,30,31(Click stamp balance bucket and get stamps count.)")
	public void clickStampBalanceBucketAndVerifyStamps1() {

		jpayEmail().buyStamps().clickStampBalanceBucket();
		jpayEmail().buyStamps().verifyStampsBalance(JPAY_STAMPS_COUNT,JPAY_PURCHASED_STAMPS_COUNT);
		jpayEmail().buyStamps().verifyStampsByFacility(facilityJpay1, JPAY_STAMPS_COUNT, JPAY_PURCHASED_STAMPS_COUNT);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click home link,select inmate,click on email link and verify stamp 
	 * balance bucket is present.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC192 :: Design Steps::"
			+ "32,33,34,35(Click home link,select inmate,click on email link and verify "
			+ "stamp balance bucket is present.)")
	public void selectInmateAndClickEmailTab2() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectInmate(inmateNameOhio,inmateIdOhio,facilityOhio);
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().buyStamps().verifyStampBalanceBucketPresent();
	}

	/*********************************************************************************
	 * 
	 * Click buy stamps link,verify inmate name,id,facility,stamp purchased and packages 
	 * message,click on continue button,enter validation code,accept terms and condition,
	 * click buy stamps button,verify success message,purchase date and confirmation 
	 * number and get purchased stamp count.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC192 :: Design Steps::"
			+ "36,37,38,39,40,41,42,43,44,45,46,47,48,49(Click buy stamps link,verify inmate"
			+ " name,id,facility,stamp purchased and packages message,click on continue "
			+ "button,enter validation code,accept terms and condition,click buy stamps button,"
			+ "verify success message,purchase date and confirmation number and get purchased "
			+ "stamp count.)")
	public void buyStampsAndVerify2() {

		jpayEmail().email().clickBuyStampsLink();
		jpayEmail().buyStamps().verifyBuyStampInmateName(inmateNameOhio);
		jpayEmail().buyStamps().verifyBuyStampInmateId(inmateIdOhio);
		jpayEmail().buyStamps().verifyBuyStampInmateFacility(facilityOhio1);
		jpayEmail().buyStamps().verifyStampPurchasedFacilityMsg(facilityOhio1);
		jpayEmail().buyStamps().verifyStampPackagesFacilityMsg(facilityOhio1);
		jpayEmail().buyStamps().clickContinueButton();
		jpayEmail().buyStamps().enterCreditValCodeForExistingCard(code);
		jpayEmail().buyStamps().checkAcceptedTerms();
		jpayEmail().buyStamps().clickBuyStampsButton();
		jpayEmail().buyStamps().verifyBuyStampsSuccessMessage(buySuccMsg);
		jpayEmail().buyStamps().verifyPurchaseDate();
		jpayEmail().buyStamps().VerifyConfirmationNumberVisible();
		
		OHIO_PURCHASED_STAMPS_COUNT = jpayEmail().buyStamps().getPurchasedStamps();
	}
	
	/*********************************************************************************
	 * 
	 * Click stamp balance bucket and get stamps count.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC192 :: Design Steps::"
			+ "50,51,52(Click stamp balance bucket and get stamps count.)")
	public void clickStampBalanceBucketAndVerifyStamps2() {

		jpayEmail().buyStamps().clickStampBalanceBucket();
		jpayEmail().buyStamps().verifyStampsBalance(OHIO_STAMPS_COUNT,OHIO_PURCHASED_STAMPS_COUNT);
		jpayEmail().buyStamps().verifyStampsByFacility(facilityOhio1, OHIO_STAMPS_COUNT, OHIO_PURCHASED_STAMPS_COUNT);
		
	}

	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC192 :: Design Steps::"
			+ "53,54,55(Click on Home link,verify page title and click logout.)")
	public void testEnd() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
		jpayEmail().login().clickLogoutButton();
	}

	
	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_192Test(data) };
	}
	
	
	public EmailWTC_192Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		password = data.get("password");
		username = data.get("username");
		inmateNameJpay = data.get("inmateNameJpay");
		inmateIdJpay = data.get("inmateIdJpay");
		facilityJpay = data.get("facilityJpay");
		inmateNameOhio = data.get("inmateNameOhio");
		inmateIdOhio = data.get("inmateIdOhio");
		facilityOhio = data.get("facilityOhio");
		facilityJpay1 = data.get("facilityJpay1");
		facilityOhio1 = data.get("facilityOhio1");
		code = data.get("code");
		buySuccMsg = data.get("buySuccMsg");
		
		
		
		
		
	}

	


}
