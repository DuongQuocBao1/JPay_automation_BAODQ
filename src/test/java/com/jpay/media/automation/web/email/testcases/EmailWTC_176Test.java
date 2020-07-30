package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;

public class EmailWTC_176Test extends BaseTestObject{

	private String variation="";
	private String personalDetails="";
	private String username="";
	private String password="";
	private String adminSystem="";
	private String frameId;
	private String cardNum;
	private String code;
	private String byAccount;
	private String accountId;
	
	

	/************************************************************************************************
	 * 
	 * TestCase :: WTC55 - (User shall be able to Add new customer and buy stamps in staging)
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: WTC55
	 * Status :: Completed
	 * 
	 **************************************************************************************************/

	
	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details,
	 * enter username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-176::Design Steps"
			+ "::1,2,3,4,5,6(Navigate to Staging website,verify personal and admin "
			+ "details,enter username,password and click Login button.)")
	public void testStart() {
		
		jpayStaging().stagingLogin().loadURL(envUrlStaging,variation);
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		jpayStaging().stagingLogin().verifyStagingAdminSystem(adminSystem);
		jpayStaging().stagingLogin().enterUsername(username);
		jpayStaging().stagingLogin().enterPassword(password);
		jpayStaging().stagingLogin().clickLoginButton();
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on Transfers,click on lookup account,select filter by,enter filter by 
	 * string,click on search button,verify account id and click on account id link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-176::DesignSteps::"
			+ "7,8,9,10,11,12,13(Click on Transfers,click on lookup account,select filter "
			+ "by,enter filter by string,click on search button,verify account id and "
			+ "click on account id link.)")
	public void navigateToCustomerAccountAndVerify() {
		
		jpayStaging().stagingHome().clickTransfers();
		jpayStaging().stagingTransfers().clickLookupAccountLink();
		jpayStaging().stagingTransfers().selectLookupAccountFilterBy(byAccount);//
		jpayStaging().stagingTransfers().enterLookupAccountFilterBySearch(accountId);
		jpayStaging().stagingTransfers().clickLookupAccountSearchButton();
		jpayStaging().stagingTransfers().verifyLookupAccountAccountId(accountId);
		jpayStaging().stagingTransfers().clickLookupAccountAccountIdLink();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on mail link,click on purchase stamps continue button,click inmate 
	 * information continue button,click buy postage continue button,check new card 
	 * checkbox,click on copy user info button,enter card number,select card expiration 
	 * month,year,enter validation code,click buy stamps continue button and verify 
	 * purchase confirmation message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-176::DesignSteps::"
			+ "14,15,16,17,18,19,20,21,22,23,24,25,26,27(Click on mail link,click on purchase "
			+ "stamps continue button,click inmate information continue button,click buy postage"
			+ " continue button,check new card checkbox,click on copy user info button,enter card "
			+ "number,select card expiration month,year,enter validation code,click buy stamps "
			+ "continue button and verify purchase confirmation message.)")
	public void buyStampsWithNewCardAndVerify() {
		
		jpayStaging().stagingTransfers().clickMailLink();
		jpayStaging().stagingTransfers().clickPurchaseStampsContinueButton();
		jpayStaging().stagingTransfers().clickInmateInformationContinueButton();
		jpayStaging().stagingTransfers().clickBuyPostageContinueButton();
		jpayStaging().stagingTransfers().clicUseNewCardRadioButton();
		jpayStaging().stagingTransfers().clickCopyUserInfoButton();
		jpayStaging().stagingTransfers().switchToIframeById(frameId);
		jpayStaging().stagingTransfers().enterCardNumber(cardNum);
		jpayStaging().stagingTransfers().selectRandomMonth();
		jpayStaging().stagingTransfers().selectRandomExpiryYear();
		jpayStaging().stagingTransfers().enterValidationCode(code);
		jpayStaging().stagingTransfers().switchToParentWindow();
		jpayStaging().stagingTransfers().clickFinalBuyStampContinueButton();
		jpayStaging().stagingTransfers().verifyPurchaseConfirmMessagePresent();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on main details link,click on mail link,click on purchase stamps continue button,click inmate 
	 * information continue button,click buy postage continue button,check exsiting card 
	 * checkbox,click on copy user info button,enter card number,select card expiration 
	 * month,year,enter validation code,click buy stamps continue button and verify 
	 * purchase confirmation message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-176::DesignSteps::"
			+ "28,29,30,31,32,33,34,35,36,37,38(Click on main details link,click on mail "
			+ "link,click on purchase stamps continue button,click inmate information "
			+ "continue button,click buy postage continue button,check exsiting card "
			+ "checkbox,enter validation code,click buy stamps continue button and verify "
			+ "purchase confirmation message.)")
	public void buyStampsWithExistingCardAndVerify() {
		
		jpayStaging().stagingTransfers().clickMainDetailsLink();
		jpayStaging().stagingTransfers().clickMailLink();
		jpayStaging().stagingTransfers().clickPurchaseStampsContinueButton();
		jpayStaging().stagingTransfers().clickInmateInformationContinueButton();
		jpayStaging().stagingTransfers().clickBuyPostageContinueButton();
		jpayStaging().stagingTransfers().clicUseCardFromMyAccountRadioButton();
		jpayStaging().stagingTransfers().switchToIframeById(frameId);
		jpayStaging().stagingTransfers().enterValidationCodeExistingCard(code);
		jpayStaging().stagingTransfers().switchToParentWindow();
		jpayStaging().stagingTransfers().clickFinalBuyStampContinueButton();
		jpayStaging().stagingTransfers().verifyPurchaseConfirmMessagePresent();
		
		
	}
	

	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-176::DesignSteps"
			+ "::39,40(Click sign out button and verify Login details.)")
	public void endTest() {
		
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		
	}
	
	
	
	
	
	
	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_176Test(data) };
	}
	
	
	public EmailWTC_176Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		personalDetails = data.get("personalDetails");
		username = data.get("username");
		password = data.get("password");
		adminSystem = data.get("adminSystem");
		accountId = data.get("accountId");
		byAccount = data.get("byAccount");
		frameId = data.get("frameId");
		cardNum = data.get("cardNum");
		code = data.get("code");

		
		
	}

}
