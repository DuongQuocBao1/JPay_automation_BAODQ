package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC177 - (User shall be able to add and delete Debit/Credit Card in ww)
 * Author :: shasan(Shahriar Hasan) , Date :: 
 * DataFile :: Email.xlsx , DataSheet :: WTC174
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_177Test extends BaseTestObject{
	


	private String variation;
	public String password = "";
	private String cardNum;
	private String frameId = "";
	private String code = "";
	private String buySuccMsg = "";
	private String username;
	private String deleteMessage;
	


	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-177::DesignSteps::"
			+ "1,2(Click on login link and verify page title.)")
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

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-177::DesignSteps::"
			+ "3,4,5,6(Enter username,password,click login button and verify title of the page.)")
	public void loginAndVerify1() {

		jpayEmail().login().enterUsername(username);
		jpayEmail().login().enterPassword(password);
		jpayEmail().login().clickLoginButton();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
	}
	
	/*********************************************************************************
	 * 
	 * Click email link,click on buy stamps,select random buy options,click on
	 * continue button,enter card no.,select card type,enter expiration month
	 * and year,enter validation code,accept terms-condition,click on buy stamps
	 * and verify purchase success message,purchase date and confirmation
	 * number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-177::DesignSteps::"
			+ "7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24(Click email link,click on buy "
			+ "stamps,select random buy options,click on continue button,enter card no.,"
			+ "select card type,enter expiration month and year,enter validation code,accept "
			+ "terms-condition,click on buy stamps and verify purchase success message,"
			+ "purchase date and confirmation number.)")
	public void addCreditCardToAccountAndVerify() {

		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().clickBuyStampsLink();
		jpayEmail().buyStamps().selectRandomMoneyRadioButton();
		jpayEmail().buyStamps().clickContinueButton();
		jpayEmail().buyStamps().switchToIframeById(frameId);
		jpayEmail().buyStamps().enterCreditCardNum(cardNum);
		jpayEmail().buyStamps().selectRandomCardType();
		jpayEmail().buyStamps().selectRandomMonth();
		jpayEmail().buyStamps().selectRandomExpiryYear();
		jpayEmail().buyStamps().enterCreditValCodeForNewCard(code);
		jpayEmail().buyStamps().checkSaveCardPaymentInformationTerms();
		jpayEmail().buyStamps().checkCardOnFileTerms();
		jpayEmail().buyStamps().checkAcceptedTerms();
		jpayEmail().buyStamps().switchToParentWindow();
		jpayEmail().buyStamps().clickBuyStampsButton();
		jpayEmail().buyStamps().verifyBuyStampsSuccessMessage(buySuccMsg);
		jpayEmail().buyStamps().verifyPurchaseDate();
		jpayEmail().buyStamps().VerifyConfirmationNumberVisible();
		
	}

	/*********************************************************************************
	 * 
	 * Click on my account link,click on payment methods link,click on delete 
	 * button,accept alert and verify credit card delete message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-177::DesignSteps::"
			+ "25,26,27,28,29(Click on my account link,click on payment methods link,click "
			+ "on delete button,accept alert and verify credit card delete message.)")
	public void deleteCardFromAccountAndVerify() {

		jpayEmail().headerNavigation().clickMyAccountLink();
		jpayEmail().myAccount().clickPaymentMethodsLink();
		jpayEmail().myAccount().clickPaymentMethodsDeleteButton();
		jpayEmail().myAccount().acceptAlert();
		jpayEmail().myAccount().verifyPaymentMethodsCardDeleteMsg(deleteMessage);
		
	}

	/*********************************************************************************
	 * 
	 * Click on home link,verify title of the page and click logout button
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-175::DesignSteps::"
			+ "30,31,32( Click on home link,verify title of the page and click logout button)")
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
		return new Object[] { new EmailWTC_177Test(data) };
	}
	
	
	public EmailWTC_177Test(Map<String, String> data) {
		super(data);
		
	
		
		variation = data.get("variation");
		username = data.get("username");
		password = data.get("password");
		cardNum = data.get("cardNum");
		frameId = data.get("frameId");
		code = data.get("code");
		buySuccMsg = data.get("buySuccessMsg");
		deleteMessage = data.get("deleteMessage");
		
		
		
		
	}


}
