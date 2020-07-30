package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC141To145 - (141.User shall be able perform these continuous transactions with 1 inmate in account
 *                            142.User shall be able buy stamps and send email with 1 inmate in account
 *                            143.User shall be able send eCard with 1 inmate in account
 *                            144.User shall be able send image with 1 inmate in account
 *                            145.User shall be able send eCard & image with 1 inmate in account)
 * Author :: shasan(Shahriar Hasan) , Date :: 
 * DataFile :: Email.xlsx , DataSheet :: WTC141To145
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_141To145Test extends BaseTestObject{
	


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
	private String buySuccMsg;
	private String filenamePng;
	private String stampsUsedFour;
	private String buySuccMsg2;

	
	private static String Inmate_Name;
	private static String Send_Money_JPayFee;
	private static String Music_JPayFee;
	private static String Inmate_Id;
	private static String Inmate_Location;
	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-141,142,143,144,145"
			+ "::DesignSteps::1,2(Click on login link and verify page title.)")
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

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-141,142,143,144,145"
			+ "::Design Steps::3,4,5,6(Enter username,password,click login button and "
			+ "verify title of the page.)")
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

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-141:: Design "
			+ "Steps::7(Click on send money link.)")
	public void clickSendMoneyLinkForTC141() {

		Inmate_Name = jpayEmail().home().getOneInmateName();
		Inmate_Id = jpayEmail().home().getOneInmateId();
		Inmate_Location = jpayEmail().home().getOneInmateFacility();
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

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-141:: Design Steps"
			+ "::8,9,1011,12,13,14,15,16,17,18,19,20,21,22,23,24,25(Select transfer "
			+ "category,click continue button,enter payment amount,click continue button,"
			+ "verify inmate name,id,location,amount,jpay fee and total charge,select "
			+ "random card from the file,enter validation code,check terms and condition "
			+ "button,click on submit button,verify payment success message and confirmation "
			+ "number.)")
	public void sendMoneyAndVerifyForTC141() {

		jpayEmail().sendMoney().selectRandomTransferCategory();
		jpayEmail().sendMoney().clickSendMoneyCategoryContinueButton();
		jpayEmail().sendMoney().enterSendMoneyAmount(amount1);
		jpayEmail().sendMoney().clickSendMoneyAmountContinueButton();
		jpayEmail().sendMoney().verifyInmateName(Inmate_Name);
		jpayEmail().sendMoney().verifyInmateId(Inmate_Id);
		jpayEmail().sendMoney().verifyInmateLocation(Inmate_Location);
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

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-141:: Design Steps"
			+ "::26,27,28,29,30,31(Verify freenote initial text,characters limit,enter "
			+ "plain freenote,check terms condition checkbox,click on send button and "
			+ "verify freenote send confirmation message.)")
	public void sendFreenoteAndVerifyForTC141() {

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

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-141:: DesignSteps::"
			+ "32,33(Click on home link,select random inmate and click on email link.)")
	public void clickEmailLinkForTC141() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		
	}

	/*********************************************************************************
	 * 
	 * Enter email message in the message body,click send button,verify 
	 * email warning message and check the used stamps.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-141:: DesignSteps"
			+ "::34,35,36,37(Enter email message in the message body,click send button,"
			+ "verify email warning message and check the used stamps.)")
	public void writeEmailAndVerifyForTC141() {

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

	@Test(enabled = true, priority = 8, description =  "TestCases::WTC-141::DesignSteps"
			+ "::38,39,40(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailAndVerifyForTC141() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on home link and click on music link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-141:: DesignSteps::"
			+ "41,42(Click on home link and click on music link.)")
	public void clickMusicLinkForTC141() {

		jpayEmail().headerNavigation().clickHomeLink();
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

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-141:: Design Steps"
			+ "::43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61(Enter media fund "
			+ "amount,click next button,click on continue button,click on continue button,"
			+ "verify inmate name,id,amount,jpay fee and total charge,select random card "
			+ "from the file,enter validation code,check terms and condition button,click "
			+ "on continue button,verify payment success message,confirmation number and "
			+ "payment status.)")
	public void sendMediaFundAndVerifyForTC141() {

		jpayEmail().music().enterMediaFund(amount2);
		jpayEmail().music().clickNextButton();
		jpayEmail().music().clickFirstContinueButton();
		jpayEmail().music().click2ndContinueButton();
		jpayEmail().music().verifyInmateName(Inmate_Name);
		jpayEmail().music().verifyInmateId(Inmate_Id);
		jpayEmail().music().verifyPaymentAmount(amount2);
		jpayEmail().music().verifyJpayFeePresent();
		Music_JPayFee=jpayEmail().music().getJpayFee();
		jpayEmail().music().verifyTotalCharge(amount2, Music_JPayFee);
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
	 * Click on home link and click on music link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-142:: DesignSteps::"
			+ "7,8(Click on home link and click on music link.)")
	public void clickEmailLink1ForTC142() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		
	}

	/*********************************************************************************
	 * 
	 * Click buy stamps link,select random money radio 
	 * button and click on continue button .
	 * 
	 **********************************************************************************/

	@Test(enabled = false, priority =13, description = "TestCases::WTC-142:: Design "
			+ "Steps::9,10,11(Click buy stamps link,select random money radio "
			+ "button and click on continue button.)")
	public void clickBuyStampsForTC142() {

		
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

	@Test(enabled = false, priority = 14, description = "TestCases::WTC-142:: Design "
			+ "Steps::12,13,14,15,16,17,18,19(Select random credit card from existing "
			+ "card list,enter validation code,accept terms and condition,click on "
			+ "buy stamps button,and verify purchase success message,purchase "
			+ "date and confirmation number.)")
	public void buyStampsAndVerifyForTC142() {

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
	 * Click on home link and click on music link.
	 * 
	 **********************************************************************************/

	@Test(enabled = false, priority = 15, description = "TestCases::WTC-142:: DesignSteps::"
			+ "20,21(Click on home link and click on music link.)")
	public void clickEmailLink2ForTC142() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		
	}

	/*********************************************************************************
	 * 
	 * Enter email message in the message body,click send button,verify 
	 * email warning message and check the used stamps.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 16, description = "TestCases::WTC-142:: DesignSteps"
			+ "::22,23,24,25(Enter email message in the message body,click send button,"
			+ "verify email warning message and check the used stamps.)")
	public void writeEmailAndVerifyForTC142() {

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

	@Test(enabled = true, priority = 17, description =  "TestCases::WTC-142::DesignSteps"
			+ "::26,27,28(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailAndVerifyForTC142() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on home link and click on music link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 18, description = "TestCases::WTC-143:: DesignSteps::"
			+ "7,8(Click on home link and click on music link.)")
	public void clickEmailLink2ForTC143() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		
	}

	/*********************************************************************************
	 * 
	 * Enter email message in the message body,click send button,verify 
	 * email warning message and check the used stamps.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 19, description = "TestCases::WTC-143:: DesignSteps"
			+ "::9,10,11,12,15,16,17,18(Enter email message in the message body,click on "
			+ "attach ecard,select random ecard catagory,attach one random ecard,click on "
			+ "continue button,click send button,verify email warning message and check "
			+ "the used stamps.)")
	public void writeEmailAndVerifyForTC143() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsg);
		jpayEmail().email().clickAttachECard();
		jpayEmail().email().selectRandomEcardCatagory();
		jpayEmail().email().attachRandomEcard();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_2);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 20, description =  "TestCases::WTC-143::DesignSteps"
			+ "::19,20,21(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailAndVerifyForTC143() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		
	}

	/*********************************************************************************
	 * 
	 * Click on home link and click on music link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 21, description = "TestCases::WTC-144:: DesignSteps::"
			+ "7,8(Click on home link and click on music link.)")
	public void clickEmailLinkForTC144() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		
	}
	
	/*********************************************************************************
	 * 
	 * Enter email message body,click on attach image,click on choose file,
	 * enter filepath in the file explorer,click on open,click on attach,
	 * click on continue button,click on  send button,verify 
	 * warning message and stamps used text,click on send continue 
	 * button and verify confirmation message and  confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 22, description = "TestCases::WTC-144:: Design "
			+ "Steps::9,10,11,12,13,14,15,16,17,18,19(Enter email message body,"
			+ "click on attach image,click on choose file,enter filepath in the file "
			+ "explorer,click on open,click on attach,click on continue button,click "
			+ "on send button,verify warning message and stamps used text.)")
	public void attachSingleImageAndVerifyForTC144() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsg);
		jpayEmail().email().clickAttachImage();
		jpayEmail().email().clickChooseFile(PageConstant.TEST_FILE_PATH+filenamePng);
		//jpayEmail().email().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenamePng);
		jpayEmail().email().clickAttachButton();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_2);
		
	}

	/*********************************************************************************
	 * 
	 * Click on send continue button and verify confirmation message 
	 * and confirmation number.Click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 23, description = "TestCases::WTC-144::DesignSteps"
			+ "::(Click on send continue button and verify confirmation message and "
			+ "confirmation number.)")
	public void sendEmailAndVerifyForTC144() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
	}

	/*********************************************************************************
	 * 
	 * Click on home link and click on music link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 24, description = "TestCases::WTC-145:: DesignSteps::"
			+ "7,8(Click on home link and click on music link.)")
	public void clickEmailLinkForTC145() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		
	}
	
	/*********************************************************************************
	 * 
	 * Enter email message body,click on attach image,click on choose file,
	 * enter filepath in the file explorer,click on open,click on attach,
	 * click on continue button,click on  send button,verify 
	 * warning message and stamps used text,click on send continue 
	 * button and verify confirmation message and  confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 25, description = "TestCases::WTC-145:: Design "
			+ "Steps::9,10,11,12,13,14,15,16,17,18,19,20,21,22(Enter email message body,"
			+ "check prepaid checkbox,click on attach image,click on choose file,enter "
			+ "filepath in the file explorer,click on open,click on attach,click on continue "
			+ "button,click on send button,verify warning message and stamps used text.)")
	public void attachSinglePrepaidEcardImageForTC27AndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsg);
		jpayEmail().email().checkPrepaidBox();
		jpayEmail().email().clickAttachECard();
		jpayEmail().email().selectRandomEcardCatagory();
		jpayEmail().email().attachRandomEcard();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickAttachImage();
		jpayEmail().email().clickChooseFile(PageConstant.TEST_FILE_PATH+filenamePng);
		//jpayEmail().email().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenamePng);
		jpayEmail().email().clickAttachButton();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(stampsUsedFour);
		
	}

	/*********************************************************************************
	 * 
	 * Click on send continue button and verify confirmation message 
	 * and confirmation number.Click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 26, description = "TestCases::WTC-145::DesignSteps"
			+ "23,24,25::(Click on send continue button and verify confirmation message "
			+ "and confirmation number.)")
	public void sendEmailVerifyAndClickEmailTab13() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
	}
	
	/*********************************************************************************
	 * 
	 * Click on home link,verify title of the page and click logout button
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 27, description = "TestCases::WTC-141,142,143,144,145"
			+ "::Design Steps::( Click on home link,verify title of the page and "
			+ "click logout button)")
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
		return new Object[] { new EmailWTC_141To145Test(data) };
	}
	
	
	public EmailWTC_141To145Test(Map<String, String> data) {
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
		buySuccMsg = data.get("buySuccMsg");
		filenamePng = data.get("filenamePng");
		stampsUsedFour = data.get("stampsUsedFour");
		
		
	}

	


}
