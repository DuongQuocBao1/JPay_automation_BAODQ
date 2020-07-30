package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC59 - (User shall be able to change the password and retrieve password)
 * Author :: shasan(Shahriar Hasan) , Date :: 
 * DataFile :: Email.xlsx , DataSheet :: WTC59
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_59Test extends BaseTestObject{
	


	private String variation;
	private String username;
	private String invalidPassword;
	private String errorMessage;
	private String forgotPasswordText;
	private String instruction1;
	private String instruction2;
	private String instruction3;
	


	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-59 :: Design "
			+ "Steps::1,2(Click on login link and verify page title.)")
	public void testStart() {
		
		jpayEmail().login().loadURL(envUrlJpay,variation);
		jpayEmail().login().clickLoginLink();
		jpayEmail().login().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
	}

	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify error text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-59:: Design Steps"
			+ "::3,4,5,6(Enter username,password,click login button and verify error text.)")
	public void loginWithInvalidPasswordAndVerify() {

		jpayEmail().login().enterUsername(username);
		jpayEmail().login().enterPassword(invalidPassword);
		jpayEmail().login().clickLoginButton1();
		jpayEmail().login().verifyIdPasswordErrorMessage(errorMessage);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on forgot password link,verify forgot password text,
	 * enter username,click password reset buton and verify 
	 * password instruction texts are present.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-59:: Design Steps"
			+ "::7,8,9,10,11,12,13,14(Click on forgot password link,verify forgot "
			+ "password text,enter username,click password reset buton and verify "
			+ "password instruction texts are present.)")
	public void clickForgotPasswordAndVerify() {

		jpayEmail().login().clickForgotPasswordLink();
		jpayEmail().login().verifyForgotPasswordText(forgotPasswordText);
		jpayEmail().login().enterEmailAddress(username);
		jpayEmail().login().clickPasswordResetButton();
		jpayEmail().login().verifyInstructionPresent(instruction1);
		jpayEmail().login().verifyInstructionPresent(username);
		jpayEmail().login().verifyInstructionPresent(instruction2);
		jpayEmail().login().verifyInstructionPresent(instruction3);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on home link
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-58::Design Steps"
			+ "::15( Click on home link.)")
	public void testEnd() {

		jpayEmail().headerNavigation().clickHomeLink();
		
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_59Test(data) };
	}
	
	
	public EmailWTC_59Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		invalidPassword = data.get("invalidPassword");
		username = data.get("username");
		errorMessage = data.get("errorMessage");
		forgotPasswordText = data.get("forgotPasswordText");
		instruction1 = data.get("instruction1");
		instruction2 = data.get("instruction2");
		instruction3 = data.get("instruction3");
		
		
		
	}

	


}
