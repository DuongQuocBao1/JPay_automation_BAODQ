package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC139 - (User shall be able perform these (money, email, send Jpay credits) continuous transactions)
 * Author :: shasan(Shahriar Hasan) , Date :: 07/15/2019
 * DataFile :: Email.xlsx , DataSheet :: WTC139
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_139Test extends BaseTestObject{
	


	private String variation;
	public String password = "";
	private String username;
	private String frameId;
	private String code;
	private String successMessage;
	private String freenoteText;
	private String freenoteCharLimit;
	private String freenotePlain;
	private String freenoteSendConMessage;
	private String amount2;
	private String amount1;
	private String emailMsg;
	private String warnMsg;
	private String conMsg;
	private String status;
	private String successMessageMusic;

	
	private static String Inmate_Name1;
	private static String Inmate_Name2;
	private static String Send_Money_JPayFee;
	private static String Music_JPayFee;
	private static String Inmate_Id1;
	private static String Inmate_Id2;
	private static String Inmate_Location1;
	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-139::DesignSteps"
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

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-139::Design Steps"
			+ "::3,4,5,6(Enter username,password,click login button and verify title of the page.)")
	public void loginAndVerify1() {

		jpayEmail().login().enterUsername(username);
		jpayEmail().login().enterPassword(password);
		jpayEmail().login().clickLoginButton();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
	}
	
	/*********************************************************************************
	 * 
	 * Select random inmate and click on send money link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-139:: Design "
			+ "Steps::7,8(Select random inmateand click on send money link.)")
	public void selectInmateAndClickSendMoneyForTC139() {

		jpayEmail().home().selectRandomInmate();
		Inmate_Name1 = jpayEmail().home().getInmateName();
		Inmate_Id1 = jpayEmail().home().getInmateId();
		Inmate_Location1 = jpayEmail().home().getInmateFacility();
		jpayEmail().headerNavigation().clickSendMoneyLink();
	}

	/*********************************************************************************
	 * 
	 * Select transfer category,click continue button,Enter payment amount,
	 * click continue button,verify inmate name,id,location,
	 * amount,jpay fee and total charge,select random card from the file,enter 
	 * validation code,check terms and condition button,click on submit button,
	 * verify payment success message and confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-139:: Design Steps"
			+ "::9,1011,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26(Select transfer "
			+ "category,click continue button,enter payment amount,click continue button,"
			+ "verify inmate name,id,location,amount,jpay fee and total charge,select "
			+ "random card from the file,enter validation code,check terms and condition "
			+ "button,click on submit button,verify payment success message and confirmation "
			+ "number.)")
	public void sendMoneyAndVerifyForTC139() {

		jpayEmail().sendMoney().selectRandomTransferCategory();
		jpayEmail().sendMoney().clickSendMoneyCategoryContinueButton();
		jpayEmail().sendMoney().enterSendMoneyAmount(amount1);
		jpayEmail().sendMoney().clickSendMoneyAmountContinueButton();
		jpayEmail().sendMoney().verifyInmateName(Inmate_Name1);
		jpayEmail().sendMoney().verifyInmateId(Inmate_Id1);
		jpayEmail().sendMoney().verifyInmateLocation(Inmate_Location1);
		jpayEmail().sendMoney().verifyPaymentAmount(amount1);
		jpayEmail().sendMoney().verifyJpayFeePresent();
		Send_Money_JPayFee=jpayEmail().sendMoney().getJpayFee();
		jpayEmail().sendMoney().verifyTotalCharge(amount1, Send_Money_JPayFee);
		jpayEmail().sendMoney().switchToIframeById(frameId);
		jpayEmail().buyStamps().selectRandomCreditCardFromList();
		jpayEmail().buyStamps().enterCreditValCodeForExistingCard(code);
		jpayEmail().buyStamps().checkAcceptedTerms();
		jpayEmail().buyStamps().switchToParentWindow();
		jpayEmail().sendMoney().clickTransferMoneySubmitButton();
		jpayEmail().sendMoney().VerifyTransferPaymentSuccessMessage(successMessage);
		jpayEmail().sendMoney().VerifyTransferConfirmationNumberVisible();
		
	}
	

	/*********************************************************************************
	 * 
	 * Verify freenote initial text,characters limit,enter plain freenote,
	 * check terms condition checkbox,click on send button and verify 
	 * freenote send confirmation message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-139:: Design Steps"
			+ "::27,28,29,30,31,32(Verify freenote initial text,characters limit,enter "
			+ "plain freenote,check terms condition checkbox,click on send button and "
			+ "verify freenote send confirmation message.)")
	public void sendFreenoteAndVerifyForTC139() {

		jpayEmail().sendMoney().VerifyFreenoteInitialText(freenoteText);
		jpayEmail().sendMoney().VerifyFreenoteCharLimit(freenoteCharLimit);
		jpayEmail().sendMoney().enterFreeNote(freenotePlain);
		jpayEmail().sendMoney().checkFreenoteCheckbox();
		jpayEmail().sendMoney().clickFreenoteSendButton();
		jpayEmail().sendMoney().VerifyFreenoteSendConMessage(freenoteSendConMessage);
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on home link,select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-139:: DesignSteps::"
			+ "33,34,35(Click on home link,select random inmate and click on email link.)")
	public void selectInmateAndClickEmailForTC139() {

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

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-139:: DesignSteps"
			+ "::36,37,38,39(Enter email message in the message body,click send button,"
			+ "verify email warning message and check the used stamps.)")
	public void writeEmailAndVerifyForTC139() {

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

	@Test(enabled = true, priority = 8, description =  "TestCases::WTC-139::DesignSteps"
			+ "::41,42,43(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailAndVerifyForTC139() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		
	}
	/*********************************************************************************
	 * 
	 * Click on home link,select random inmate and click on music link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-139:: DesignSteps::"
			+ "44,45,46(Click on home link,select random inmate and click on music link.)")
	public void selectInmateAndClickMusicForTC139() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().home().selectRandomInmate();
		Inmate_Name2 = jpayEmail().home().getInmateName();
		Inmate_Id2 = jpayEmail().home().getInmateId();
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

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-58:: Design Steps"
			+ "::47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65(Enter media fund "
			+ "amount,click next button,click on continue button,click on continue button,"
			+ "verify inmate name,id,amount,jpay fee and total charge,select random card "
			+ "from the file,enter validation code,check terms and condition button,click "
			+ "on continue button,verify payment success message,confirmation number and "
			+ "payment status.)")
	public void sendMediaFundAndVerifyForTC139() {

		jpayEmail().music().enterMediaFund(amount2);
		jpayEmail().music().clickNextButton();
		jpayEmail().music().clickFirstContinueButton();
		jpayEmail().music().click2ndContinueButton();
		jpayEmail().music().verifyInmateName(Inmate_Name2);
		jpayEmail().music().verifyInmateId(Inmate_Id2);
		jpayEmail().music().verifyPaymentAmount(amount2);
		jpayEmail().music().verifyJpayFeePresent();
		Music_JPayFee=jpayEmail().music().getJpayFee();
		jpayEmail().music().verifyTotalCharge(amount2, Music_JPayFee);
		jpayEmail().sendMoney().switchToIframeById(frameId);
		jpayEmail().buyStamps().selectRandomCreditCardFromList();
		jpayEmail().buyStamps().enterCreditValCodeForExistingCard(code);
		jpayEmail().buyStamps().checkAcceptedTerms();
		jpayEmail().buyStamps().switchToParentWindow();
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

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-139::Design Steps"
			+ "::66,67,68( Click on home link,verify title of the page and click logout button)")
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
		return new Object[] { new EmailWTC_139Test(data) };
	}
	
	
	public EmailWTC_139Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		password = data.get("password");
		username = data.get("username");
		amount1 = data.get("amount1");
		amount2 = data.get("amount2");
		emailMsg = data.get("emailMsg");
		warnMsg = data.get("warnMsg");
		frameId = data.get("frameId");
		successMessage = data.get("successMessage");
		freenoteText = data.get("freenoteText");
		freenotePlain = data.get("freenotePlain");
		freenoteSendConMessage = data.get("freenoteSendConMessage");
		code = data.get("code");
		freenoteCharLimit = data.get("freenoteCharLimit");
		conMsg = data.get("conMsg");
		status = data.get("status");
		successMessageMusic = data.get("successMessageMusic");
		
		
		
	}

	


}
