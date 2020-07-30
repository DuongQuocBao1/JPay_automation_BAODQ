package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;



public class EmailWTC_51Test extends BaseTestObject{
	
	
	public String username = "";
	public String password = "";
	private String frameId = "";
	private String code = "";
	private String buySuccMsg = "";
	private String variation;
	private String stampsToTransfer;
	private String popupConfirmation;
	private String transferStatus;
	
	
	private static String Selected_Inmate;
	private static String Stamps_Before_Transfer;
	
	
	/************************************************************************************************
	 * 
	 * TestCase :: WTC51 - (User shall be able to Transfer stamps)
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: WTC51
	 * Status :: Completed
	 * 
	 **************************************************************************************************/


	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-51 :: Design "
			+ "Steps::1,2(Click on login link and verify page title.)")
	public void testStart() {
		
		jpayEmail().login().loadURL(envUrlJpay,variation);
		jpayEmail().login().clickLoginLink();
		jpayEmail().login().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
	}

	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-51 :: Design "
			+ "Steps::3,4,5,6(Enter username,password,click login button and "
			+ "verify title of the page.)")
	public void loginAndVerify1() {

		jpayEmail().login().enterUsername(username);
		jpayEmail().login().enterPassword(password);
		jpayEmail().login().clickLoginButton();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
	}
	
	/*********************************************************************************
	 * 
	 * Select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-51 :: Design "
			+ "Steps::7,8(Select random inmate and "
			+ "click on email link.)")
	public void selectInmateAndClickEmailTab1() {

		jpayEmail().login().selectRandomInmate();
		Selected_Inmate = jpayEmail().login().getInmateName();
		jpayEmail().headerNavigation().clickEmailLink();
	}
	
	

	/*********************************************************************************
	 * 
	 * Click buy stamps link,select random money radio 
	 * button and click on continue button .
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =4, description = "TestCases::WTC-51 :: Design "
			+ "Steps::9,10,11(Click buy stamps link,select random money radio "
			+ "button and click on continue button.)")
	public void clickBuyStamps() {

		
		jpayEmail().email().clickBuyStampsLink();
		jpayEmail().buyStamps().selectRandomMoneyRadioButton();
		jpayEmail().buyStamps().clickContinueButton();
	}

	/*********************************************************************************
	 * 
	 * Select random credit card from existing card list,enter validation code,
	 * accept terms and condition,click on buy stamps button,and verify 
	 * purchase success message,purchase date and confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-51 :: Design "
			+ "Steps::12,13,14,15,16,17,18,19(Select random credit card from existing "
			+ "card list,enter validation code,accept terms and condition,click on "
			+ "buy stamps button,and verify purchase success message,purchase "
			+ "date and confirmation number.)")
	public void buyStampsAndVerify() {

		jpayEmail().buyStamps().switchToIframeById(frameId);
		jpayEmail().buyStamps().selectRandomCreditCardFromList();
		jpayEmail().buyStamps().enterCreditValCodeForExistingCard(code);
		jpayEmail().buyStamps().checkAcceptedTerms();
		jpayEmail().buyStamps().switchToParentWindow();
		jpayEmail().buyStamps().clickBuyStampsButton();
		jpayEmail().buyStamps().verifyBuyStampsSuccessMessage(buySuccMsg);
		jpayEmail().buyStamps().verifyPurchaseDate();
		jpayEmail().buyStamps().VerifyConfirmationNumberVisible();
	}
	
	/*********************************************************************************
	 * 
	 * Click on transfer stamps link,enter stamps to transfer,click continue 
	 * button,verify popup message,click no button,click continue button,
	 * verify popup message,click yes button,verify transfer status message,
	 * confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-51 :: Design "
			+ "Steps::20,21,22,23,24,25,26,27,28,29,30,31(Click on transfer stamps link,"
			+ "enter stamps to transfer,click continue button,verify popup message,click "
			+ "no button,click continue button,verify popup message,click yes button,"
			+ "verify transfer status message,confirmation message and number.)")
	public void transferStampsAndVerify() {
		
		Stamps_Before_Transfer = jpayEmail().transferStamps().getStamps();
		jpayEmail().transferStamps().clickTransferStampsButton();
		jpayEmail().transferStamps().enterStampsToTransfer(stampsToTransfer);
		jpayEmail().transferStamps().clickTransferStampsContinueButton();
		jpayEmail().transferStamps().verifyTransferConfirmPopupMsg(popupConfirmation);
		jpayEmail().transferStamps().clickTransferNoButton();
		jpayEmail().transferStamps().clickTransferStampsContinueButton();
		jpayEmail().transferStamps().verifyTransferConfirmPopupMsg(popupConfirmation);
		jpayEmail().transferStamps().clickTransferYesButton();
		jpayEmail().transferStamps().verifyTransferCompletionStatus(transferStatus);
		jpayEmail().transferStamps().verifyFirstTransCompletionMsg(stampsToTransfer,Selected_Inmate);
		jpayEmail().transferStamps().VerifyTransferConNumVisible();
	}

	
	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-51 :: Design "
			+ "Steps::32,33,34(Click on Home link,verify page title and click logout.)")
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
		return new Object[] { new EmailWTC_51Test(data) };
	}
	
	
	public EmailWTC_51Test(Map<String, String> data) {
		super(data);
		
		username = data.get("username");
		password =data.get("password");
		frameId = data.get("frameId");
		code = data.get("code");
		buySuccMsg = data.get("buySuccMsg");
		variation = data.get("variation");
		stampsToTransfer = data.get("stampsToTransfer");
		transferStatus = data.get("transferStatus");
		popupConfirmation = data.get("popupConfirmation");
		
		
		
	}

	


}
