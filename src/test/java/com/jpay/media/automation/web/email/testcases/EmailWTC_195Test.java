package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC195 - (Verify stamps transfer functionality without universal stamps.)
 * Author :: shasan(Shahriar Hasan) , Date :: 
 * DataFile :: Email.xlsx , DataSheet :: WTC195
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_195Test extends BaseTestObject{
	

	private String variation;
	private String username;
	private String password;
	private String inmateNameJpay;
	private String inmateIdJpay;
	private String facilityJpay;
	private String inmateNameOhio;
	private String inmateIdOhio;
	private String facilityOhio;
	private String facilityJpay1;
	private String facilityOhio1;
	private String stampsToTransfer;
	private String popupConfirmation;
	private String transferStatus;
	
	
	private static String JPAY_STAMPS_COUNT;
	private static String OHIO_STAMPS_COUNT;
	
	

	/*********************************************************************************
	 * 
	 * Navigate to the url,click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC195::Design Steps::"
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

	@Test(enabled = true, priority = 2, description = "TestCases::WTC195 :: Design Steps::"
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

	@Test(enabled = true, priority = 3, description = "TestCases::WTC195:: Design Steps::"
			+ "8,9,10(Select inmate,click on email link and verify stamp balance bucket "
			+ "is present.)")
	public void selectInmateAndClickEmailTab1() {

		jpayEmail().login().selectInmate(inmateNameJpay,inmateIdJpay,facilityJpay);
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		jpayEmail().buyStamps().verifyStampBalanceBucketPresent();
	}
	
	/*********************************************************************************
	 * 
	 * Click stamp balance bucket and get stamps count.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC195::Design Steps::"
			+ "11,12,13,14(Click stamp balance bucket and get stamps count.)")
	public void clickStampBalanceBucketAndGetStampsCount1() {

		jpayEmail().buyStamps().clickStampBalanceBucket();
		JPAY_STAMPS_COUNT = jpayEmail().buyStamps().getStampsCountByFacility(facilityJpay1);
		OHIO_STAMPS_COUNT = jpayEmail().buyStamps().getStampsCountByFacility(facilityOhio1);
		jpayEmail().buyStamps().verifyUniversalStampsAbsent();
		
	}

	/*********************************************************************************
	 * 
	 * Click on transfer stamps,verify inmate name,id and facility info,verify 
	 * available stamps to transfer message,click on continue button,verify 
	 * popup messages,click on yes button and verify transfer status and messages.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC195::Design Steps::16,"
			+ "15,1617,18,19,20,21,22,23,24,25,26,27,28,29(Click on transfer stamps,verify "
			+ "inmate name,id and facility info,verify available stamps to transfer message,"
			+ "click on continue button,verify popup messages,click on yes button and verify "
			+ "transfer status and messages.)")
	public void transferStampsAndVerify1() {

		jpayEmail().transferStamps().clickTransferStampsButton();
		jpayEmail().buyStamps().verifyBuyStampInmateName(inmateNameJpay);
		jpayEmail().buyStamps().verifyBuyStampInmateId(inmateIdJpay);
		jpayEmail().buyStamps().verifyBuyStampInmateFacility(facilityJpay1);
		jpayEmail().transferStamps().verifyTransferStampsAvailableStampsMsg(
				JPAY_STAMPS_COUNT,facilityJpay1);
		jpayEmail().transferStamps().enterStampsToTransfer(stampsToTransfer);
		jpayEmail().transferStamps().clickTransferStampsContinueButton();
		jpayEmail().transferStamps().verifyTransferConfirmPopupMsg(popupConfirmation);
		jpayEmail().transferStamps().verifyPopupTransferConfirmationMsgPresent(
				stampsToTransfer,inmateNameJpay,JPAY_STAMPS_COUNT);
		jpayEmail().transferStamps().clickTransferYesButton();
		jpayEmail().transferStamps().verifyTransferCompletionStatus(transferStatus);
		jpayEmail().transferStamps().verifyFirstTransCompletionMsg(stampsToTransfer);
		jpayEmail().transferStamps().verifyStampsTransferInmateInfo(inmateNameJpay, inmateIdJpay, facilityJpay);
		jpayEmail().transferStamps().VerifyTransferConNumVisible();
		jpayEmail().transferStamps().verifylastTransCompMsgWithStampCount(JPAY_STAMPS_COUNT, stampsToTransfer,facilityJpay1);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click stamp balance bucket and verify stamps count.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC195::Design Steps::"
			+ "30,31,32(Click stamp balance bucket and get stamps count.)")
	public void clickStampBalanceBucketAndVerifyStamps1() {

		jpayEmail().buyStamps().clickStampBalanceBucket();
		jpayEmail().buyStamps().verifyStampsBalanceBucket(JPAY_STAMPS_COUNT,stampsToTransfer);
		jpayEmail().buyStamps().verifyStampsByFacilityWithoutUniversalStamps(facilityJpay1, JPAY_STAMPS_COUNT,stampsToTransfer);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click home link,select inmate,click on email link and verify stamp 
	 * balance bucket is present.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC195 :: Design Steps::"
			+ "33,34,35,36(Click home link,select inmate,click on email link and verify "
			+ "stamp balance bucket is present.)")
	public void selectInmateAndClickEmailTab2() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectInmate(inmateNameOhio,inmateIdOhio,facilityOhio);
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().buyStamps().verifyStampBalanceBucketPresent();
	}

	/*********************************************************************************
	 * 
	 * Click on transfer stamps,verify inmate name,id and facility info,verify available
	 *  stamps to transfer message,click on continue button,verify popup messages,click 
	 *  on yes button and verify transfer status and messages.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC195::Design Steps::37,"
			+ "38,39,40,41,42,43,44,45,46,47,48,49,50,51(Click on transfer stamps,verify "
			+ "inmate name,id and facility info,verify available stamps to transfer message,"
			+ "click on continue button,verify popup messages,click on yes button and "
			+ "verify transfer status and messages.)")
	public void transferStampsAndVerify2() {

		jpayEmail().transferStamps().clickTransferStampsButton();
		jpayEmail().buyStamps().verifyBuyStampInmateName(inmateNameOhio);
		jpayEmail().buyStamps().verifyBuyStampInmateId(inmateIdOhio);
		jpayEmail().buyStamps().verifyBuyStampInmateFacility(facilityOhio1);
		jpayEmail().transferStamps().verifyTransferStampsAvailableStampsMsg(
				OHIO_STAMPS_COUNT,facilityOhio1);
		jpayEmail().transferStamps().enterStampsToTransfer(stampsToTransfer);
		jpayEmail().transferStamps().clickTransferStampsContinueButton();
		jpayEmail().transferStamps().verifyTransferConfirmPopupMsg(popupConfirmation);
		jpayEmail().transferStamps().verifyPopupTransferConfirmationMsgPresent(
				stampsToTransfer, inmateNameOhio, OHIO_STAMPS_COUNT);
		jpayEmail().transferStamps().clickTransferYesButton();
		jpayEmail().transferStamps().verifyTransferCompletionStatus(transferStatus);
		jpayEmail().transferStamps().verifyFirstTransCompletionMsg(stampsToTransfer);
		jpayEmail().transferStamps().verifyStampsTransferInmateInfo(inmateNameOhio, inmateIdOhio, facilityOhio);
		jpayEmail().transferStamps().VerifyTransferConNumVisible();
		jpayEmail().transferStamps().verifylastTransCompMsgWithStampCount(OHIO_STAMPS_COUNT, stampsToTransfer,facilityOhio1);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click stamp balance bucket and get stamps count.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC195::Design Steps::"
			+ "52,53,54(Click stamp balance bucket and get stamps count.)")
	public void clickStampBalanceBucketAndVerifyStamps2() {

		jpayEmail().buyStamps().clickStampBalanceBucket();
		jpayEmail().buyStamps().verifyStampsBalanceBucket(OHIO_STAMPS_COUNT,stampsToTransfer);
		jpayEmail().buyStamps().verifyStampsByFacilityWithoutUniversalStamps(facilityOhio1, OHIO_STAMPS_COUNT,stampsToTransfer);
		
	}

	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC195::Design Steps::"
			+ "55,56,57(Click on Home link,verify page title and click logout.)")
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
		return new Object[] { new EmailWTC_195Test(data) };
	}
	
	
	public EmailWTC_195Test(Map<String, String> data) {
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
		popupConfirmation = data.get("popupConfirmation");
		stampsToTransfer = data.get("stampsToTransfer");
		transferStatus = data.get("transferStatus");
		
		
		
		
		
	}

	


}
