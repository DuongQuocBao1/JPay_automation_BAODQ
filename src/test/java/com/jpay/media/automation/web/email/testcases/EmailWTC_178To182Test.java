package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC178To182 - (178.User shall be able to update the existing email address
 *                            179.User shall be able to change the password from ww
 *                            180.User shall be NOT be able to change the password with invalid data
 *                            181.User shall be able to and delete the phone number from ww
 *                            182.User shall not be able to add invalid format phone number from ww)
 * Author :: shasan(Shahriar Hasan) , Date :: 
 * DataFile :: Email.xlsx , DataSheet :: WTC178To182
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_178To182Test extends BaseTestObject{
	


	private String variation;
	public String password = "";
	private String username;
	private String emailPreferencesUpdateMsg;
	private String passwordChange;
	private String passwordChangeUpdateMsg;
	private String changePasswordEmptyErrorMsg;
	private String passwordWrong1;
	private String passwordWrong2;
	private String passwordWrong3;
	private String passwordDoNotMatchErrorMsg;
	private String changePasswordCharLengthErrorMsg;
	private String changePasswordCharCaseErrorMsg;
	private String changePasswordSpecialCharErrorMsg;
	private String changePasswordUnrecognizedErrorMsg;
	private String passwordWrong4;
	private String changePasswordCharCaseUpperErrorMsg;
	private String changePasswordCharCaseLowerErrorMsg;
	private String passwordWrong5;
	private String passwordWrong6;
	private String phoneAddSuccessMsg;
	private String phoneDeleteSuccessMsg;
	private String addPhoneNumberEmptyErrorMsg;
	private String addPhoneMainNumberErrorMsg;
	private String wrongFormatPhone1;
	private String addPhoneFormatErrorMsg;
	private String wrongFormatPhone3;
	private String wrongFormatPhone2;
	private String passwordWrong7;
	

	

	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-178,179,180,181,182::"
			+ "DesignSteps::1,2(Click on login link and verify page title.)")
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

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-178,179,180,181,182::"
			+ "DesignSteps::3,4,5,6,7(Enter username,password,click login button and verify "
			+ "title of the page and click on my account link.)")
	public void loginAndVerify() {

		jpayEmail().login().enterUsername(username);
		jpayEmail().login().enterPassword(password);
		jpayEmail().login().clickLoginButton();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
		jpayEmail().headerNavigation().clickMyAccountLink();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on my account link,click on email preferences link,enter email address 
	 * in new email and confirm email field,click update button and verify update message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-178::DesignSteps::"
			+ "8,9,10,11,12(Click on email preferences link,enter email address in new "
			+ "email and confirm email field,click update button and verify update message.)")
	public void changeEmailAndVerify1ForTC178() {

		jpayEmail().myAccount().clickeMailPreferencesLink();
		jpayEmail().myAccount().enterRandomNewEmailAndConNewEmail();
		jpayEmail().myAccount().clickEmailPreferencesUpdateButton();
		jpayEmail().myAccount().verifyEmailPreferencesUpdateMsg(emailPreferencesUpdateMsg);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on my account link,click on email preferences link,click email address 
	 * in new email and confirm email field,click update button and verify update message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-178::DesignSteps::"
			+ "13,14,15,16(Enter email address in new email and confirm email field,"
			+ "click update button and verify update message.)")
	public void changeEmailAndVerify2ForTC178() {

		jpayEmail().myAccount().enterNewEmailAndConNewEmail(username);
		jpayEmail().myAccount().clickEmailPreferencesUpdateButton();
		jpayEmail().myAccount().verifyEmailPreferencesUpdateMsg(emailPreferencesUpdateMsg);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on change password link,enter current,new new again password field,
	 * click on change password button and verify update message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-179::DesignSteps::"
			+ "8,9,10,11,12,13(Click on change password link,enter current,new new again "
			+ "password field,click on change password button and verify update message.)")
	public void changePasswordAndVerify1ForTC179() {

		jpayEmail().myAccount().clickeChangePasswordLink();
		jpayEmail().myAccount().enterCurrentPassword(password);
		jpayEmail().myAccount().enterNewPassword(passwordChange);
		jpayEmail().myAccount().enterNewPasswordAgain(passwordChange);
		jpayEmail().myAccount().clickChangePasswordButton();
		jpayEmail().myAccount().verifyChangePasswordUpdateMsg(passwordChangeUpdateMsg);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on change password link,enter current,new new again password field,
	 * click on change password button and verify update message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-179::DesignSteps::"
			+ "14,15,16,17,18(Click on change password link,enter current,new new again "
			+ "password field,click on change password button and verify update message.)")
	public void changePasswordAndVerify2ForTC179() {

		jpayEmail().myAccount().enterCurrentPassword(passwordChange);
		jpayEmail().myAccount().enterNewPassword(password);
		jpayEmail().myAccount().enterNewPasswordAgain(password);
		jpayEmail().myAccount().clickChangePasswordButton();
		jpayEmail().myAccount().verifyChangePasswordUpdateMsg(passwordChangeUpdateMsg);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on change password button and verify empty error message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-180::DesignSteps::"
			+ "8,9(Click on change password button and verify empty error message.)")
	public void verifyChangePasswordEmptyErrorMsgForTC179() {

		jpayEmail().myAccount().clickeChangePasswordLink();
		jpayEmail().myAccount().clickChangePasswordButton();
		jpayEmail().myAccount().verifyEmptyChangePasswordErrorMsg(changePasswordEmptyErrorMsg);
		
	}
	
	/*********************************************************************************
	 * 
	 * Enter worng formated password in current,new new again password field,
	 * click on change password button and verify error messages.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-180::DesignSteps::"
			+ "10,11,12,13,14,15,16,17(Enter worng formated password in current,new again "
			+ "password field,click on change password button and verify error messages.)")
	public void enterPasswordAndVerifyErrors1ForTC180() {

		jpayEmail().myAccount().enterCurrentPassword(passwordWrong1);
		jpayEmail().myAccount().enterNewPassword(passwordWrong2);
		jpayEmail().myAccount().enterNewPasswordAgain(passwordWrong3);
		jpayEmail().myAccount().clickChangePasswordButton();
		jpayEmail().myAccount().verifyChangePasswordDoNotMatchMsg(passwordDoNotMatchErrorMsg);
		jpayEmail().myAccount().verifyChangePasswordRequiredMsg1(changePasswordCharLengthErrorMsg);
		jpayEmail().myAccount().verifyChangePasswordRequiredMsg2(changePasswordCharCaseUpperErrorMsg);
		jpayEmail().myAccount().verifyChangePasswordRequiredMsg3(changePasswordSpecialCharErrorMsg);
		
	}
	
	/*********************************************************************************
	 * 
	 * Enter worng formated password in current,good password in new and new again 
	 * password field,click on change password button and verify error messages.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-180::DesignSteps::"
			+ "18,19,20,21,22,23,24(Enter worng formated password in current,good password in "
			+ "new and new again password field,click on change password button and "
			+ "verify error messages.)")
	public void enterPasswordAndVerifyErrors2ForTC180() {

		jpayEmail().myAccount().enterCurrentPassword(password);
		jpayEmail().myAccount().enterNewPassword(passwordWrong1);
		jpayEmail().myAccount().enterNewPasswordAgain(passwordWrong1);
		jpayEmail().myAccount().clickChangePasswordButton();
		jpayEmail().myAccount().verifyChangePasswordRequiredMsg1(changePasswordCharLengthErrorMsg);
		jpayEmail().myAccount().verifyChangePasswordRequiredMsg2(changePasswordCharCaseUpperErrorMsg);
		jpayEmail().myAccount().verifyChangePasswordRequiredMsg3(changePasswordSpecialCharErrorMsg);
		
	}
	
	/*********************************************************************************
	 * 
	 * Enter current password in current,worng passowd in new and new again password field,
	 * click on change password button and verify error messages.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-180::DesignSteps::"
			+ "25,26,27,28,29(Enter current password in current,worng passowd in new "
			+ "and new again password field,click on change password button and verify "
			+ "error messages.)")
	public void enterPasswordAndVerifyErrors3ForTC180() {

		jpayEmail().myAccount().enterCurrentPassword(passwordWrong1);
		jpayEmail().myAccount().enterNewPassword(passwordWrong4);
		jpayEmail().myAccount().enterNewPasswordAgain(passwordWrong4);
		jpayEmail().myAccount().clickChangePasswordButton();
		jpayEmail().myAccount().verifyChangePasswordUnrecognizedErrorMsg(changePasswordUnrecognizedErrorMsg);
		
	}
	
	/*********************************************************************************
	 * 
	 * Enter current password in current,worng passowd in new and new again password field,
	 * click on change password button and verify error messages.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-180::DesignSteps::"
			+ "30,31,32,33,34,35(Enter current password in current,worng passowd in new "
			+ "and new again password field,click on change password button and verify "
			+ "error messages.)")
	public void enterPasswordAndVerifyErrors4ForTC180() {

		jpayEmail().myAccount().enterCurrentPassword(password);
		jpayEmail().myAccount().enterNewPassword(passwordWrong5);
		jpayEmail().myAccount().enterNewPasswordAgain(passwordWrong5);
		jpayEmail().myAccount().clickChangePasswordButton();
		jpayEmail().myAccount().verifyChangePasswordRequiredMsg1(changePasswordCharCaseUpperErrorMsg);
		jpayEmail().myAccount().verifyChangePasswordRequiredMsg2(changePasswordCharCaseLowerErrorMsg);
		
		
	}
	
	/*********************************************************************************
	 * 
	 * Enter current password in current,worng passowd in new and new again password field,
	 * click on change password button and verify error messages.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-180::DesignSteps::"
			+ "36,37,38,39,40(Enter current password in current,worng passowd in new "
			+ "and new again password field,click on change password button and verify "
			+ "error messages.)")
	public void enterPasswordAndVerifyErrors5ForTC180() {

		jpayEmail().myAccount().enterCurrentPassword(password);
		jpayEmail().myAccount().enterNewPassword(passwordWrong6);
		jpayEmail().myAccount().enterNewPasswordAgain(passwordWrong6);
		jpayEmail().myAccount().clickChangePasswordButton();
		jpayEmail().myAccount().verifyChangePasswordRequiredMsg1(changePasswordSpecialCharErrorMsg);
		
	}
	
	/*********************************************************************************
	 * 
	 * Enter current password in current,worng passowd in new and new again password field,
	 * click on change password button and verify error messages.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "TestCases::WTC-180::DesignSteps::"
			+ "41,42,43,44,45(Enter current password in current,worng passowd in new "
			+ "and new again password field,click on change password button and verify "
			+ "error messages.)")
	public void enterPasswordAndVerifyErrors6ForTC180() {

		jpayEmail().myAccount().enterCurrentPassword(password);
		jpayEmail().myAccount().enterNewPassword(passwordWrong7);
		jpayEmail().myAccount().enterNewPasswordAgain(passwordWrong7);
		jpayEmail().myAccount().clickChangePasswordButton();
		jpayEmail().myAccount().verifyChangePasswordRequiredMsg1(changePasswordCharLengthErrorMsg);
		
	}
	
	/*********************************************************************************
	 * 
	 * enter current,new new again password field,click on change password 
	 * button and verify update message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 14, description = "TestCases::WTC-180::DesignSteps::"
			+ "46,47,48,49,50(Enter current,new new again password field,click on change "
			+ "password button and verify update message.)")
	public void changePasswordAndVerify1ForTC180() {

		jpayEmail().myAccount().enterCurrentPassword(password);
		jpayEmail().myAccount().enterNewPassword(passwordChange);
		jpayEmail().myAccount().enterNewPasswordAgain(passwordChange);
		jpayEmail().myAccount().clickChangePasswordButton();
		jpayEmail().myAccount().verifyChangePasswordUpdateMsg(passwordChangeUpdateMsg);
		
	}
	
	/*********************************************************************************
	 * 
	 * Enter current,new new again password field,click on change password 
	 * button and verify update message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 15, description = "TestCases::WTC-180::DesignSteps::"
			+ "51,52,53,54,55(Enter current,new new again password field,click on change "
			+ "password button and verify update message.)")
	public void changePasswordAndVerify2ForTC180() {

		jpayEmail().myAccount().enterCurrentPassword(passwordChange);
		jpayEmail().myAccount().enterNewPassword(password);
		jpayEmail().myAccount().enterNewPasswordAgain(password);
		jpayEmail().myAccount().clickChangePasswordButton();
		jpayEmail().myAccount().verifyChangePasswordUpdateMsg(passwordChangeUpdateMsg);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on add phone number link,enter phone number,click on add 
	 * button and verify add update message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 16, description = "TestCases::WTC-181::DesignSteps::"
			+ "8,9,10,11(Click on add phone number link,enter phone number,click on add "
			+ "button and verify add update message.)")
	public void addPhoneNumberAndVerifyForTC181() {

		jpayEmail().myAccount().clickAddPhoneNumberLink();
		jpayEmail().myAccount().enterRandomPhoneNumber();
		jpayEmail().myAccount().clickAddPhoneNumberAddButton();
		jpayEmail().myAccount().verifyAddPhoneNumberSuccessMsg(phoneAddSuccessMsg);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on add phone number link,enter phone number,click on add 
	 * button and verify add update message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 17, description = "TestCases::WTC-181::DesignSteps::"
			+ "12,13(Click on add phone number link,enter phone number,click on add "
			+ "button and verify add update message.)")
	public void deletePhoneNumberAndVerifyForTC181() {

		jpayEmail().myAccount().clickAddPhoneNumberDeleteButton();
		jpayEmail().myAccount().verifyDeletePhoneNumberSuccessMsg(phoneDeleteSuccessMsg);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on add phone number link,click on add button and verify empty add error message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 18, description = "TestCases::WTC-182::DesignSteps::"
			+ "8,9,10(Click on add phone number link,click on add button and verify "
			+ "empty add error message.)")
	public void verifyAddPhoneNumberErrorMsg1ForTC182() {

		jpayEmail().myAccount().clickAddPhoneNumberLink();
		jpayEmail().myAccount().clickAddPhoneNumberAddButton();
		jpayEmail().myAccount().verifyAddPhoneNumberErrorMsg(addPhoneNumberEmptyErrorMsg);
		
	}
	
	/*********************************************************************************
	 * 
	 * Enter main phone number in phone field,click on add button and verify error message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 19, description = "TestCases::WTC-182::DesignSteps::"
			+ "11,12,13(Enter main phone number in phone field,click on add button and "
			+ "verify error message.)")
	public void verifyAddPhoneNumberErrorMsg2ForTC182() {

		String mainPhoneNum = jpayEmail().myAccount().getMainPhoneNumber();
		jpayEmail().myAccount().enterPhoneNumber(mainPhoneNum);
		jpayEmail().myAccount().clickAddPhoneNumberAddButton();
		jpayEmail().myAccount().verifyAddPhoneNumberErrorMsg(addPhoneMainNumberErrorMsg);
		
	}
	
	/*********************************************************************************
	 * 
	 * Enter main phone number in phone field,click on add button and verify error message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 20, description = "TestCases::WTC-182::DesignSteps::"
			+ "14,15,16(Enter main phone number in phone field,click on add button and "
			+ "verify error message.)")
	public void verifyAddPhoneNumberErrorMsg3ForTC182() {

		jpayEmail().myAccount().enterPhoneNumber(wrongFormatPhone1);
		jpayEmail().myAccount().clickAddPhoneNumberAddButton();
		jpayEmail().myAccount().verifyAddPhoneNumberErrorMsg(addPhoneFormatErrorMsg);
		
	}
	
	/*********************************************************************************
	 * 
	 * Enter main phone number in phone field,click on add button and verify error message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 21, description = "TestCases::WTC-182::DesignSteps::"
			+ "17,18,19(Enter main phone number in phone field,click on add button and "
			+ "verify error message.)")
	public void verifyAddPhoneNumberErrorMsg4ForTC182() {

		jpayEmail().myAccount().enterPhoneNumber(wrongFormatPhone2);
		jpayEmail().myAccount().clickAddPhoneNumberAddButton();
		jpayEmail().myAccount().verifyAddPhoneNumberErrorMsg(addPhoneFormatErrorMsg);
		
	}
	
	/*********************************************************************************
	 * 
	 * Enter main phone number in phone field,click on add button and verify error message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 22, description = "TestCases::WTC-182::DesignSteps::"
			+ "20,21,22(Enter main phone number in phone field,click on add button and "
			+ "verify error message.)")
	public void verifyAddPhoneNumberErrorMsg5ForTC182() {

		jpayEmail().myAccount().enterPhoneNumber(wrongFormatPhone3);
		jpayEmail().myAccount().clickAddPhoneNumberAddButton();
		jpayEmail().myAccount().verifyAddPhoneNumberErrorMsg(addPhoneFormatErrorMsg);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on home link,verify title of the page and click logout button
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 23, description = "TestCases::WTC-175::DesignSteps::"
			+ "( Click on home link,verify title of the page and click logout button)")
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
		return new Object[] { new EmailWTC_178To182Test(data) };
	}
	
	
	public EmailWTC_178To182Test(Map<String, String> data) {
		super(data);
		
	
		
		variation = data.get("variation");
		username = data.get("username");
		password = data.get("password");
		emailPreferencesUpdateMsg = data.get("emailPreferencesUpdateMsg");
		passwordChange = data.get("passwordChange");
		passwordChangeUpdateMsg = data.get("passwordChangeUpdateMsg");
		changePasswordEmptyErrorMsg = data.get("changePasswordEmptyErrorMsg");
		passwordWrong1 = data.get("passwordWrong1");
		passwordWrong2 = data.get("passwordWrong2");
		passwordWrong3 = data.get("passwordWrong3");
		passwordWrong4 = data.get("passwordWrong4");
		passwordWrong5 = data.get("passwordWrong5");
		passwordWrong6 = data.get("passwordWrong6");
		passwordWrong7 = data.get("passwordWrong7");
		passwordDoNotMatchErrorMsg = data.get("passwordDoNotMatchErrorMsg");
		changePasswordCharLengthErrorMsg = data.get("changePasswordCharLengthErrorMsg");
		changePasswordCharCaseUpperErrorMsg = data.get("changePasswordCharCaseUpperErrorMsg");
		changePasswordCharCaseLowerErrorMsg = data.get("changePasswordCharCaseLowerErrorMsg");
		changePasswordSpecialCharErrorMsg = data.get("changePasswordSpecialCharErrorMsg");
		changePasswordUnrecognizedErrorMsg = data.get("changePasswordUnrecognizedErrorMsg");
		phoneAddSuccessMsg = data.get("phoneAddSuccessMsg");
		phoneDeleteSuccessMsg = data.get("phoneDeleteSuccessMsg");
		addPhoneNumberEmptyErrorMsg = data.get("addPhoneNumberEmptyErrorMsg");
		addPhoneMainNumberErrorMsg = data.get("addPhoneMainNumberErrorMsg");
		wrongFormatPhone1 = data.get("wrongFormatPhone1");
		wrongFormatPhone2 = data.get("wrongFormatPhone2");
		wrongFormatPhone3 = data.get("wrongFormatPhone3");
		addPhoneFormatErrorMsg = data.get("addPhoneFormatErrorMsg");
		
		
		
	}


}
