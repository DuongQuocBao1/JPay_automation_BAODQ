package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC140 - (User shall be able perform these (email, send Jpay credits) continuous transactions )
 * Author :: shasan(Shahriar Hasan) , Date :: 07/15/2019
 * DataFile :: Email.xlsx , DataSheet :: WTC140
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_140Test extends BaseTestObject{
	


	private String variation;
	public String password = "";
	private String username;
	private String frameId;
	private String code;
	private String amount;
	private String emailMsg;
	private String warnMsg;
	private String conMsg;
	private String status;
	private String successMessageMusic;

	
	private static String Inmate_Name;
	private static String Music_JPayFee;
	private static String Inmate_Id;
	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-140::DesignSteps"
			+ "::1,2(Click on login link and verify page title.)")
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

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-140::Design Steps"
			+ "::3,4,5,6(Enter username,password,click login button and verify title of the page.)")
	public void loginAndVerify1() {

		jpayEmail().login().enterUsername(username);
		jpayEmail().login().enterPassword(password);
		jpayEmail().login().clickLoginButton();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
	}

	/*********************************************************************************
	 * 
	 * Click on home link,select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-140:: DesignSteps::"
			+ "7,8,9(Click on home link,select random inmate and click on email link.)")
	public void selectInmateAndClickEmailForTC140() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().home().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		
	}

	/*********************************************************************************
	 * 
	 * Enter email message in the message body,click send button,verify email warning message and check the used stamps.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-140:: DesignSteps"
			+ "::10,11,12,13(Enter email message in the message body,click send button,"
			+ "verify email warning message and check the used stamps.)")
	public void writeEmailAndVerifyForTC140() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsg);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description =  "TestCases::WTC-140::DesignSteps"
			+ "::14,15,16(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailAndVerifyForTC140() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		
	}
	/*********************************************************************************
	 * 
	 * Click on home link,select random inmate and click on music link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-140:: DesignSteps::"
			+ "17,18,19(Click on home link,select random inmate and click on music link.)")
	public void selectInmateAndClickMusicForTC140() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().home().selectRandomInmate();
		Inmate_Name = jpayEmail().home().getInmateName();
		Inmate_Id = jpayEmail().home().getInmateId();
		jpayEmail().headerNavigation().clickMusicLink();
		
	}

	/*********************************************************************************
	 * 
	 * Enter media fund amount,click next button,click on continue button,
	 * click on continue button,verify inmate name,id,amount,jpay fee and 
	 * total charge,select random card from the file,enter validation code,
	 * check terms and condition button,click on continue button,verify 
	 * payment success message,confirmation number and payment status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-140:: Design Steps"
			+ "::20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38(Enter media fund "
			+ "amount,click next button,click on continue button,click on continue button,"
			+ "verify inmate name,id,amount,jpay fee and total charge,select random card "
			+ "from the file,enter validation code,check terms and condition button,click "
			+ "on continue button,verify payment success message,confirmation number and "
			+ "payment status.)")
	public void sendMediaFundAndVerifyForTC140() {

		jpayEmail().music().enterMediaFund(amount);
		jpayEmail().music().clickNextButton();
		jpayEmail().music().clickFirstContinueButton();
		jpayEmail().music().click2ndContinueButton();
		jpayEmail().music().verifyInmateName(Inmate_Name);
		jpayEmail().music().verifyInmateId(Inmate_Id);
		jpayEmail().music().verifyPaymentAmount(amount);
		jpayEmail().music().verifyJpayFeePresent();
		Music_JPayFee=jpayEmail().music().getJpayFee();
		jpayEmail().music().verifyTotalCharge(amount, Music_JPayFee);
		jpayEmail().music().switchToIframeById(frameId);
		jpayEmail().buyStamps().selectRandomCreditCardFromList();
		jpayEmail().buyStamps().enterCreditValCodeForExistingCard(code);
		jpayEmail().buyStamps().checkAcceptedTerms();
		jpayEmail().music().switchToParentWindow();
		jpayEmail().music().clickSubmitButton();
		jpayEmail().music().VerifyTransferPaymentSuccessMessage(successMessageMusic);//
		jpayEmail().music().VerifyTransferConfirmationNumberVisible();
		jpayEmail().music().VerifyTransferPaymentStatus(status);//Approved
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on home link,verify title of the page and click logout button
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-140::Design Steps"
			+ "::39,40,41( Click on home link,verify title of the page and click logout button)")
	public void testEnd() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().signup().verifyTitle(PageConstant.HOME_TITLE);
		jpayEmail().login().clickLogoutButton();
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_140Test(data) };
	}
	
	
	public EmailWTC_140Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		password = data.get("password");
		username = data.get("username");
		amount = data.get("amount");
		emailMsg = data.get("emailMsg");
		warnMsg = data.get("warnMsg");
		frameId = data.get("frameId");
		code = data.get("code");
		conMsg = data.get("conMsg");
		status = data.get("status");
		successMessageMusic = data.get("successMessageMusic");
		
		
		
	}

	


}
