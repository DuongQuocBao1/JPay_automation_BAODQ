package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC58 - (User shall be able to send money/Free note)
 * Author :: shasan(Shahriar Hasan) , Date :: 07/15/2019
 * DataFile :: Email.xlsx , DataSheet :: WTC58
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_58Test extends BaseTestObject{
	


	private String variation;
	public String password = "";
	private String username;
	private String amount;
	private String jpayFee;
	private String frameId;
	private String code;
	private String successMessage;
	private String freenoteText;
	private String freenoteCharLimit;
	private String freenotePlain;
	private String freenoteSendConMessage;
	private String freenoteFlaged;
	private String amount2;
	private String amount1;
	private String amount3;

	
	private static String Inmate_Name1;
	private static String Inmate_Name2;
	private static String Inmate_Name3;
	private static String Inmate_Id1;
	private static String Inmate_Id2;
	private static String Inmate_Id3;
	private static String Inmate_Location1;
	private static String Inmate_Location2;
	private static String Inmate_Location3;
	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-58 :: Design Steps::1,2(Click on login link and "
			+ "verify page title.)")
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

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-01,02,03,04,05,06,"
			+ "07,08,09,10,11,12,13 :: Design Steps::3,4,5,6(Enter username,password,"
			+ "click login button and verify title of the page.)")
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

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-58:: Design "
			+ "Steps::7(Select random inmate .)")
	public void selectInmateAndClickEmailTab1() {

		jpayEmail().home().selectRandomInmate();
		Inmate_Name1 = jpayEmail().home().getInmateName();
		Inmate_Id1 = jpayEmail().home().getInmateId();
		Inmate_Location1 = jpayEmail().home().getInmateFacility();
	}
	
	/*********************************************************************************
	 * 
	 * Click on send money link,select transfer category and click continue button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-58:: Design Steps"
			+ "::8,9,10(Click on send money link,select transfer category and click continue button.)")
	public void selectTransferCtaegory1() {

		jpayEmail().headerNavigation().clickSendMoneyLink();
		jpayEmail().sendMoney().selectRandomTransferCategory();
		jpayEmail().sendMoney().clickSendMoneyCategoryContinueButton();
	}
	
	/*********************************************************************************
	 * 
	 * Enter payment amount,click continue button,verify inmate name,id,location,
	 * amount,jpay fee and total charge,select random card from the file,enter 
	 * validation code,check terms and condition button,click on submit button,
	 * verify payment success message and confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-58:: Design Steps"
			+ "::11,12,13,14,15,16,17,18,19,20,21,22,23,24,25(Enter payment amount,click "
			+ "continue button,verify inmate name,id,location,amount,jpay fee and total "
			+ "charge,select random card from the file,enter validation code,check terms "
			+ "and condition button,click on submit button,verify payment success message "
			+ "and confirmation number.)")
	public void sendMoneyAndVerify1() {

		jpayEmail().sendMoney().enterSendMoneyAmount(amount1);
		jpayEmail().sendMoney().clickSendMoneyAmountContinueButton();
		jpayEmail().sendMoney().verifyInmateName(Inmate_Name1);
		jpayEmail().sendMoney().verifyInmateId(Inmate_Id1);
		jpayEmail().sendMoney().verifyInmateLocation(Inmate_Location1);
		jpayEmail().sendMoney().verifyPaymentAmount(amount1);
		jpayEmail().sendMoney().verifyJpayFee(jpayFee);
		jpayEmail().sendMoney().verifyTotalCharge(amount1, jpayFee);
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

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-58:: Design Steps"
			+ "::26,27,28,29,30,31(Verify freenote initial text,characters limit,enter "
			+ "plain freenote,check terms condition checkbox,click on send button and "
			+ "verify freenote send confirmation message.)")
	public void sendFreenoteAndVerify1() {

		jpayEmail().sendMoney().VerifyFreenoteInitialText(freenoteText);
		jpayEmail().sendMoney().VerifyFreenoteCharLimit(freenoteCharLimit);
		jpayEmail().sendMoney().enterFreeNotePlain(freenotePlain);
		jpayEmail().sendMoney().checkFreenoteCheckbox();
		jpayEmail().sendMoney().clickFreenoteSendButton();
		jpayEmail().sendMoney().VerifyFreenoteSendConMessage(freenoteSendConMessage);
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on home link and Select random inmate.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-58:: Design "
			+ "Steps::32,33(Click on home link and Select random inmate.)")
	public void selectInmateAndClickEmailTab2() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().home().selectRandomInmate();
		Inmate_Name2 = jpayEmail().home().getInmateName();
		Inmate_Id2 = jpayEmail().home().getInmateId();
		Inmate_Location2 = jpayEmail().home().getInmateFacility();
	}
	
	/*********************************************************************************
	 * 
	 * Click on send money link,select transfer category and click continue button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-58:: Design Steps"
			+ "::34,35,36(Click on send money link,select transfer category and click "
			+ "continue button.)")
	public void selectTransferCtaegory2() {

		jpayEmail().headerNavigation().clickSendMoneyLink();
		jpayEmail().sendMoney().selectRandomTransferCategory();
		jpayEmail().sendMoney().clickSendMoneyCategoryContinueButton();
	}
	
	/*********************************************************************************
	 * 
	 * Enter payment amount,click continue button,verify inmate name,id,location,
	 * amount,jpay fee and total charge,select random card from the file,enter 
	 * validation code,check terms and condition button,click on submit button,
	 * verify payment success message and confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-58:: Design Steps"
			+ "::37,38,39,40,41,42,43,44,45,46,47,48,49,50,51(Enter payment amount,click "
			+ "continue button,verify inmate name,id,location,amount,jpay fee and total "
			+ "charge,select random card from the file,enter validation code,check terms "
			+ "and condition button,click on submit button,verify payment success message "
			+ "and confirmation number.)")
	public void sendMoneyAndVerify2() {

		jpayEmail().sendMoney().enterSendMoneyAmount(amount2);
		jpayEmail().sendMoney().clickSendMoneyAmountContinueButton();
		jpayEmail().sendMoney().verifyInmateName(Inmate_Name2);
		jpayEmail().sendMoney().verifyInmateId(Inmate_Id2);
		jpayEmail().sendMoney().verifyInmateLocation(Inmate_Location2);
		jpayEmail().sendMoney().verifyPaymentAmount(amount2);
		jpayEmail().sendMoney().verifyJpayFee(jpayFee);
		jpayEmail().sendMoney().verifyTotalCharge(amount2, jpayFee);
		jpayEmail().sendMoney().switchToIframeById(frameId);
		jpayEmail().buyStamps().selectRandomCreditCardFromList();
		jpayEmail().buyStamps().enterCreditValCodeForExistingCard(code);
		jpayEmail().buyStamps().checkAcceptedTerms();
		jpayEmail().buyStamps().switchToParentWindow();
		jpayEmail().sendMoney().clickTransferMoneySubmitButton();
		jpayEmail().sendMoney().VerifyTransferPaymentSuccessMessage(successMessage);//Your payment has been processed.
		jpayEmail().sendMoney().VerifyTransferConfirmationNumberVisible();
		
	}
	

	/*********************************************************************************
	 * 
	 * Verify freenote initial text,characters limit,enter plain freenote,
	 * check terms condition checkbox,click on send button and verify 
	 * freenote send confirmation message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-58:: Design Steps"
			+ "::52,53,54,55,56,57(Verify freenote initial text,characters limit,enter "
			+ "plain freenote,check terms condition checkbox,click on send button and "
			+ "verify freenote send confirmation message.)")
	public void sendFreenoteAndVerify2() {

		jpayEmail().sendMoney().VerifyFreenoteInitialText(freenoteText);//Send a FREE note to your inmate with this payment?
		jpayEmail().sendMoney().VerifyFreenoteCharLimit(freenoteCharLimit);//200 characters left
		jpayEmail().sendMoney().enterFreeNote(freenoteFlaged);
		jpayEmail().sendMoney().checkFreenoteCheckbox();
		jpayEmail().sendMoney().clickFreenoteSendButton();
		jpayEmail().sendMoney().VerifyFreenoteSendConMessage(freenoteSendConMessage);//Your free note was sent!
		
	}

	/*********************************************************************************
	 * 
	 * Click on home link and Select random inmate.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-58:: Design "
			+ "Steps::58,59(Click on home link and Select random inmate.)")
	public void selectInmateAndClickEmailTab3() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().home().selectRandomInmate();
		Inmate_Name3 = jpayEmail().home().getInmateName();
		Inmate_Id3 = jpayEmail().home().getInmateId();
		Inmate_Location3 = jpayEmail().home().getInmateFacility();
	}
	
	/*********************************************************************************
	 * 
	 * Click on send money link,select transfer category and click continue button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-58:: Design Steps"
			+ "::60,61,62(Click on send money link,select transfer category and click continue button.)")
	public void selectTransferCtaegory3() {

		jpayEmail().headerNavigation().clickSendMoneyLink();
		jpayEmail().sendMoney().selectRandomTransferCategory();
		jpayEmail().sendMoney().clickSendMoneyCategoryContinueButton();
	}
	
	/*********************************************************************************
	 * 
	 * Enter payment amount,click continue button,verify inmate name,id,location,
	 * amount,jpay fee and total charge,select random card from the file,enter 
	 * validation code,check terms and condition button,click on submit button,
	 * verify payment success message and confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "TestCases::WTC-58:: Design Steps"
			+ "::63,64,65,66,67,68,69,70,71,72,73,74,75,76,77(Enter payment amount,click "
			+ "continue button,verify inmate name,id,location,amount,jpay fee and total "
			+ "charge,select random card from the file,enter validation code,check terms "
			+ "and condition button,click on submit button,verify payment success message "
			+ "and confirmation number.)")
	public void sendMoneyAndVerify3() {

		jpayEmail().sendMoney().enterSendMoneyAmount(amount3);
		jpayEmail().sendMoney().clickSendMoneyAmountContinueButton();
		jpayEmail().sendMoney().verifyInmateName(Inmate_Name3);
		jpayEmail().sendMoney().verifyInmateId(Inmate_Id3);
		jpayEmail().sendMoney().verifyInmateLocation(Inmate_Location3);
		jpayEmail().sendMoney().verifyPaymentAmount(amount3);
		jpayEmail().sendMoney().verifyJpayFee(jpayFee);
		jpayEmail().sendMoney().verifyTotalCharge(amount3, jpayFee);
		jpayEmail().sendMoney().switchToIframeById(frameId);
		jpayEmail().buyStamps().selectRandomCreditCardFromList();
		jpayEmail().buyStamps().enterCreditValCodeForExistingCard(code);
		jpayEmail().buyStamps().checkAcceptedTerms();
		jpayEmail().buyStamps().switchToParentWindow();
		jpayEmail().sendMoney().clickTransferMoneySubmitButton();
		jpayEmail().sendMoney().VerifyTransferPaymentSuccessMessage(successMessage);//Your payment has been processed.
		jpayEmail().sendMoney().VerifyTransferConfirmationNumberVisible();
		
	}
	


	/*********************************************************************************
	 * 
	 * Verify freenote initial text,characters limit,click no thanks button and 
	 * verify payment success message and confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 14, description = "TestCases::WTC-58:: Design Steps"
			+ "::78,79,80,81,82(Verify freenote initial text,characters limit,click no "
			+ "thanks button and verify payment success message and confirmation number.)")
	public void donotSendFreenoteAndVerify() {

		jpayEmail().sendMoney().VerifyFreenoteInitialText(freenoteText);//Send a FREE note to your inmate with this payment?
		jpayEmail().sendMoney().VerifyFreenoteCharLimit(freenoteCharLimit);//200 characters left
		jpayEmail().sendMoney().clickFreenoteNoThanksButton();
		jpayEmail().sendMoney().VerifyTransferPaymentSuccessMessage(successMessage);//Your payment has been processed.
		jpayEmail().sendMoney().VerifyTransferConfirmationNumberVisible();
		
	}
	/*********************************************************************************
	 * 
	 * Click on home link,verify title of the page and click logout button
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 15, description = "TestCases::WTC-58::Design Steps"
			+ "::83,84,85( Click on home link,verify title of the page and click logout button)")
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
		return new Object[] { new EmailWTC_58Test(data) };
	}
	
	
	public EmailWTC_58Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		password = data.get("password");
		username = data.get("username");
		amount1 = data.get("amount1");
		amount2 = data.get("amount2");
		amount3 = data.get("amount3");
		jpayFee = data.get("jpayFee");
		frameId = data.get("frameId");
		successMessage = data.get("successMessage");
		freenoteText = data.get("freenoteText");
		freenotePlain = data.get("freenotePlain");
		freenoteSendConMessage = data.get("freenoteSendConMessage");
		freenoteFlaged = data.get("freenoteFlaged");
		code = data.get("code");
		freenoteCharLimit = data.get("freenoteCharLimit");
		
		
	}

	


}
