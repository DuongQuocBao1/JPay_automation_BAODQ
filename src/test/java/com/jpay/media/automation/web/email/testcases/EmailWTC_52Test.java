package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;



public class EmailWTC_52Test extends BaseTestObject{
	
	
	public String username = "";
	public String password = "";
	private String variation;
	private String popupConfirmation;
	private String zeroStamps;
	private String zeroTransferMsg;
	
	
	private static String Stamps_Before_Transfer;
	
	
	/************************************************************************************************
	 * 
	 * TestCase :: WTC52 - (User shall not be able to buy stamps with expire card, Transfer invalid stamps amount)
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: WTC52
	 * Status :: Completed
	 * 
	 **************************************************************************************************/


	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-52 :: Design "
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

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-52 :: Design "
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

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-52 :: Design "
			+ "Steps::7,8(Select random inmate and "
			+ "click on email link.)")
	public void selectInmateAndClickEmailTab1() {

		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
	}
	

	/*********************************************************************************
	 * 
	 * Click on buy stamps link,select random money radio button,click on 
	 * continue and verify expired card on the file is not visible.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-52 :: Design "
			+ "Steps::12,13,14,15(Click on buy stamps link,select random money radio "
			+ "button,click on continue and verify expired card on the file is not visible.)")
	public void buyStampsAndVerify() {

		jpayEmail().email().clickBuyStampsLink();
		jpayEmail().buyStamps().selectRandomMoneyRadioButton();
		jpayEmail().buyStamps().clickContinueButton();
		jpayEmail().buyStamps().VerifyExpiredCardNotVisible();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on transfer stamps link,enter zero stamps to transfer,click continue button,verify popup message,verify alert message,click ok button,click continue button,verify popup message,verify alert message,click ok button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-51 :: Design "
			+ "Steps::16,17,18,19,20,21,22,23,24,25,26(Click on transfer stamps "
			+ "link,enter zero stamps to transfer,click continue button,verify popup "
			+ "message,verify alert message,click ok button,click continue button,"
			+ "verify popup message,verify alert message,click ok button.)")
	public void transferStampsAndVerify() {

		jpayEmail().buyStamps().navigateBrowserBack();
		Stamps_Before_Transfer = jpayEmail().transferStamps().getStamps();
		jpayEmail().transferStamps().clickTransferStampsButton();
		jpayEmail().transferStamps().enterStampsToTransfer(zeroStamps);
		jpayEmail().transferStamps().clickTransferStampsContinueButton();
		jpayEmail().transferStamps().verifyTransferConfirmPopupMsg(popupConfirmation);
		jpayEmail().transferStamps().verifyZeroTransferAlertPopupMsg(zeroTransferMsg);//Number of Stamps must be greater than 0.
		jpayEmail().transferStamps().clickTransferOkButton();
		jpayEmail().transferStamps().enterGreaterStampsToTransfer(Stamps_Before_Transfer);
		jpayEmail().transferStamps().clickTransferStampsContinueButton();
		jpayEmail().transferStamps().verifyTransferConfirmPopupMsg(popupConfirmation);
		jpayEmail().transferStamps().verifyGreaterTransferAlertPopupMsg(Stamps_Before_Transfer);//Number of Stamps must be greater than 0.
		jpayEmail().transferStamps().clickTransferOkButton();
		
	}

	
	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-51 :: Design "
			+ "Steps::27,28,29(Click on Home link,verify page title and click logout.)")
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
		return new Object[] { new EmailWTC_52Test(data) };
	}
	
	
	public EmailWTC_52Test(Map<String, String> data) {
		super(data);
		
		username = data.get("username");
		password =data.get("password");
		variation = data.get("variation");
		zeroStamps = data.get("zeroStamps");
		zeroTransferMsg = data.get("zeroTransferMsg");
		popupConfirmation = data.get("popupConfirmation");
		
		
		
	}

	


}
