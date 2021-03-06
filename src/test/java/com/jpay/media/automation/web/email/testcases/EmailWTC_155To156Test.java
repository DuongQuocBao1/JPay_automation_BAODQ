package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;

public class EmailWTC_155To156Test extends BaseTestObject {

	
	
	private String variation;
	private String personalDetails;
	private String adminSystem;
	private String username;
	private String password;
	private String facility;
	private String facilityManagementMainPagetext;
	private String permLoc;
	private String usernameJpay;
	private String passwordJpay;
	private String warnMsg;
	private String conMsg;
	private String popupConfirmation;
	private String transferStatus;
	private String emailMsg;
	private String inboundUpdateMessage;
	private String outboundUpdateMessage;
	private String stampsAmount;
	

	private static String Selected_Inmate;
	private static String Stamps_Before_Transfer;
	
	
	

	/************************************************************************************************
	 * 
	 * TestCase :: WTC155To156 - (155.OFF will disable transfer stamps and ON  will enable transfer stamps from ww
	 *                            156.OFF will disable prepaid response and ON  will enable prepaid response from ww)
	 * Author :: shasan(Shahriar Hasan) , 
	 * Date :: DataFile :: 
	 * Email.xlsx ,
	 * DataSheet :: WTC155To156      Status :: Completed
	 * 
	 **************************************************************************************************/

	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details, enter
	 * username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-155::Design Steps"
			+ "::1,2,3,4,5,6(Navigate to Staging website,verify personal and admin "
			+ "details,enter username,password and click Login button.)")
	public void testStart() {

		jpayStaging().stagingLogin().loadURL(envUrlStaging, variation);
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		jpayStaging().stagingLogin().verifyStagingAdminSystem(adminSystem);
		jpayStaging().stagingLogin().enterUsername(username);
		jpayStaging().stagingLogin().enterPassword(password);
		jpayStaging().stagingLogin().clickLoginButton();

	}

	/*********************************************************************************
	 * 
	 * Click on Administration link,click on facility management link,verify header 
	 * text,click manage inbound mail settings,click choose agency,select facility,
	 * click permloc,select permloc,uncheck transfer stamps enabled checkbox,click on 
	 * update button and verify the update message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-155::Design Steps"
			+ "::7,8,9,10,11,12,13,14,15,16,17(Click on Administration link,click "
			+ "on facility management link,verify header text,click manage inbound mail "
			+ "settings,click choose agency,select facility,click permloc,select permloc,"
			+ "uncheck transfer stamps enabled checkbox,click on update "
			+ "button and verify the update message.)")
	public void editInboundSettingsAndVerify1ForTC155() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickfacilitiesManagementLink();
		jpayStaging().stagingAdmin().verifyfacilityManagementMainPagetext(facilityManagementMainPagetext);
		jpayStaging().stagingAdmin().clickManageInboundSettingsLink();
		jpayStaging().stagingAdmin().clickMISChooseAgency();
		jpayStaging().stagingAdmin().selectMISFacility(facility,environment);
		jpayStaging().stagingAdmin().clickMISChoosePerm();
		jpayStaging().stagingAdmin().selectMISPermLoc(permLoc);
		jpayStaging().stagingAdmin().uncheckMISTransferStampsEnabled();
		jpayStaging().stagingAdmin().clickMISUpdateButton();
		jpayStaging().stagingAdmin().verifyMISUpdateMessage(inboundUpdateMessage);

	}

	/*********************************************************************************
	 * 
	 * Click on Administration link,click on sign out button and verify personal
	 * details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-155::Design Steps"
			+ "::18,19,20(Click on Administration link,click on sign out button and "
			+ "verify personal details.)")
	public void logoutFromStaging1ForTC155() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);

	}


	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details, enter
	 * username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-156::Design Steps"
			+ "::1,2,3,4,5,6(Navigate to Staging website,verify personal and admin "
			+ "details,enter username,password and click Login button.)")
	public void loginToStaging1ForTC156() {

		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		jpayStaging().stagingLogin().verifyStagingAdminSystem(adminSystem);
		jpayStaging().stagingLogin().enterUsername(username);
		jpayStaging().stagingLogin().enterPassword(password);
		jpayStaging().stagingLogin().clickLoginButton();

	}

	/*********************************************************************************
	 * 
	 * Click on Administration link,click on facility management link,verify header 
	 * text,click manage outbound mail settings,click choose agency,select facility,
	 * click permloc,select permloc,uncheck support prepaid response letters checkbox,
	 * click on update button and verify the update message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-156::Design Steps"
			+ "::7,8,9,10,11,12,13,14,15,16,17(Click on Administration link,click "
			+ "on facility management link,verify header text,click manage outbound mail "
			+ "settings,click choose agency,select facility,click permloc,select permloc,"
			+ "uncheck support prepaid response letters checkbox,click on update button "
			+ "and verify the update message.)")
	public void editOutboundSettingsAndVerify1ForTC156() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickfacilitiesManagementLink();
		jpayStaging().stagingAdmin().verifyfacilityManagementMainPagetext(facilityManagementMainPagetext);
		jpayStaging().stagingAdmin().clickManageOutboundSettingsLink();
		jpayStaging().stagingAdmin().clickChooseAgencyForOutboundSettings();
		jpayStaging().stagingAdmin().selectFacilityForOutboundSettings(facility,environment);
		jpayStaging().stagingAdmin().clickChoosePermlocForOutboundSettings();
		jpayStaging().stagingAdmin().selectPermLocForOutboundSettings(permLoc);
		jpayStaging().stagingAdmin().uncheckMOSSupportPrepaidResponseLetterCheckBox();
		jpayStaging().stagingAdmin().clickOutboundSettingsUpdateButton();
		jpayStaging().stagingAdmin().verifyOutboundSttingsUpdateMessage(outboundUpdateMessage);

	}

	/*********************************************************************************
	 * 
	 * Click on Administration link,click on sign out button and verify personal
	 * details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-156::Design Steps"
			+ "::18,19,20(Click on Administration link,click on sign out button and "
			+ "verify personal details.)")
	public void logoutFromStaging1ForTC156() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);

	}

	
	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-155,156:: DesignSteps"
			+ "::21,22,23,24,25,26,27(Enter username,password,click login button and "
			+ "verify title of the page.)")
	public void loginToJpayAndVerify1() {

		jpayEmail().login().loadURL(envUrlJpay,variation);
		jpayEmail().login().clickLoginLink();
		jpayEmail().login().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
		jpayEmail().login().enterUsername(usernameJpay);
		jpayEmail().login().enterPassword(passwordJpay);
		jpayEmail().login().clickLoginButton();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
	}
	
	/*********************************************************************************
	 * 
	 * Select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-155,156:: DesignSteps"
			+ "::28,29(Select random inmate and click on email link.)")
	public void selectInmateAndClickEmailTab1() {

		jpayEmail().login().selectRandomInmate();
		Selected_Inmate = jpayEmail().login().getInmateName();
		jpayEmail().headerNavigation().clickEmailLink();
		
	}
	
	/*********************************************************************************
	 * 
	 * Verify Transfer stamps link is not visible.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-155::DesignSteps::"
			+ "30(Verify Transfer stamps link is not visible.)")
	public void transferStampsAndVerify1ForTC155() {
		
		jpayEmail().transferStamps().verifyTransferStampsLinkNotVisible();
		/*Stamps_Before_Transfer = jpayEmail().transferStamps().getStamps();
		jpayEmail().transferStamps().clickTransferStampsButton();
		jpayEmail().transferStamps().enterStampsToTransfer(midStamps);//50
		jpayEmail().transferStamps().clickTransferStampsContinueButton();
		jpayEmail().transferStamps().verifyTransferConfirmPopupMsg(popupConfirmation);
		jpayEmail().transferStamps().clickTransferNoButton();
		jpayEmail().transferStamps().clickTransferStampsContinueButton();
		jpayEmail().transferStamps().verifyTransferConfirmPopupMsg(popupConfirmation);
		jpayEmail().transferStamps().clickTransferYesButton();
		jpayEmail().transferStamps().verifyTransferCompletionStatus(transferStatus);//Transfer Completed
		jpayEmail().transferStamps().verifyFirstTransCompletionMsg(midStamps,Selected_Inmate);
		jpayEmail().transferStamps().VerifyTransferConNumVisible();
		jpayEmail().transferStamps().verifylastTransCompMsgWithStampCount(Stamps_Before_Transfer, midStamps);
		jpayEmail().transferStamps().clickTransferStampsButton();
		jpayEmail().transferStamps().enterStampsToTransfer(maxLimitStamps);//500
		jpayEmail().transferStamps().clickTransferStampsContinueButton();
		jpayEmail().transferStamps().verifyTransferConfirmPopupMsg(popupConfirmation);
		jpayEmail().transferStamps().clickTransferYesButton();//
		jpayEmail().transferStamps().verifyMaxStampsTransferErrorMsg(stampsResLimitNumber,midStamps);*/
		
	}


	/*********************************************************************************
	 * 
	 * Click on email link,enter email message in the message body,verify 
	 * prepaid checkbox and label text is not visible,click on send button,
	 * verify email warning message and check used stamps.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-156::DesignSteps::"
			+ "30,31,32,33,34,35,36(Click on email link,enter email message in the message "
			+ "body,verify prepaid checkbox and label text is not visible,click on send "
			+ "button,verify email warning message and check used stamps.)")
	public void writeEmailAndVerify1ForTC156() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsg);
		jpayEmail().email().verifyPrepaidCheckboxLabelMsgNotVisible();
		jpayEmail().email().verifyPrepaidCheckboxNotVisible();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);

	}

	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-156::Design Steps::"
			+ "37,38,39(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailAndVerify1ForTC156() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
	}


	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-155,156::DesignSteps"
			+ "::(Click on Home link,verify page title and click logout.)")
	public void logoutFromJpay1() {
		
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
		jpayEmail().login().clickLogoutButton();
		
	}
	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details, enter
	 * username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "TestCases::WTC-133::Design Steps"
			+ "::34,35,36,37,38,39(Navigate to Staging website,verify personal and admin "
			+ "details,enter username,password and click Login button.)")
	public void loginToStaging1ForTC155() {

		jpayStaging().stagingLogin().loadURL(envUrlStaging, variation);
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		jpayStaging().stagingLogin().verifyStagingAdminSystem(adminSystem);
		jpayStaging().stagingLogin().enterUsername(username);
		jpayStaging().stagingLogin().enterPassword(password);
		jpayStaging().stagingLogin().clickLoginButton();

	}
	
	/*********************************************************************************
	 * 
	 * Click on Administration link,click on facility management link,verify header 
	 * text,click manage inbound mail settings,click choose agency,select facility,
	 * click permloc,select permloc,check transfer stamps enabled checkbox,click on 
	 * update button and verify the update message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 14, description = "TestCases::WTC-155::Design Steps"
			+ "::40,41,42,43,44,45,46,47,48,49,50(Click on Administration link,click "
			+ "on facility management link,verify header text,click manage inbound mail "
			+ "settings,click choose agency,select facility,click permloc,select permloc,"
			+ "check transfer stamps enabled checkbox,click on update "
			+ "button and verify the update message.)")
	public void editInboundSettingsAndVerify2ForTC155() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickfacilitiesManagementLink();
		jpayStaging().stagingAdmin().verifyfacilityManagementMainPagetext(facilityManagementMainPagetext);
		jpayStaging().stagingAdmin().clickManageInboundSettingsLink();
		jpayStaging().stagingAdmin().clickMISChooseAgency();
		jpayStaging().stagingAdmin().selectMISFacility(facility,environment);
		jpayStaging().stagingAdmin().clickMISChoosePerm();
		jpayStaging().stagingAdmin().selectMISPermLoc(permLoc);
		jpayStaging().stagingAdmin().checkMISTransferStampsEnabled();
		jpayStaging().stagingAdmin().clickMISUpdateButton();
		jpayStaging().stagingAdmin().verifyMISUpdateMessage(inboundUpdateMessage);

	}

	/*********************************************************************************
	 * 
	 * Click on Administration link,click on sign out button and verify personal
	 * details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 15, description = "TestCases::WTC-155::Design Steps"
			+ "::51,52,53(Click on Administration link,click on sign out button and "
			+ "verify personal details.)")
	public void logoutFromStaging2ForTC155() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);

	}


	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details, enter
	 * username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 16, description = "TestCases::WTC-156::Design Steps"
			+ "::43,44,45,46,47,48(Navigate to Staging website,verify personal and admin "
			+ "details,enter username,password and click Login button.)")
	public void loginToStaging2ForTC156() {

		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		jpayStaging().stagingLogin().verifyStagingAdminSystem(adminSystem);
		jpayStaging().stagingLogin().enterUsername(username);
		jpayStaging().stagingLogin().enterPassword(password);
		jpayStaging().stagingLogin().clickLoginButton();

	}

	/*********************************************************************************
	 * 
	 * Click on Administration link,click on facility management link,verify header 
	 * text,click manage outbound mail settings,click choose agency,select facility,
	 * click permloc,select permloc,check support prepaid response letters checkbox,
	 * click on update button and verify the update message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 17, description = "TestCases::WTC-156::Design Steps"
			+ "::49,50,51,52,53,54,55,56,57,58,59(Click on Administration link,click "
			+ "on facility management link,verify header text,click manage inbound mail "
			+ "settings,click choose agency,select facility,click permloc,select permloc,"
			+ "check support prepaid response letters checkbox,click on update button "
			+ "and verify the update message.)")
	public void editOutboundSettingsAndVerify2ForTC156() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickfacilitiesManagementLink();
		jpayStaging().stagingAdmin().verifyfacilityManagementMainPagetext(facilityManagementMainPagetext);
		jpayStaging().stagingAdmin().clickManageOutboundSettingsLink();
		jpayStaging().stagingAdmin().clickChooseAgencyForOutboundSettings();
		jpayStaging().stagingAdmin().selectFacilityForOutboundSettings(facility,environment);
		jpayStaging().stagingAdmin().clickChoosePermlocForOutboundSettings();
		jpayStaging().stagingAdmin().selectPermLocForOutboundSettings(permLoc);
		jpayStaging().stagingAdmin().checkMOSSupportPrepaidResponseLetterCheckBox();
		jpayStaging().stagingAdmin().clickOutboundSettingsUpdateButton();
		jpayStaging().stagingAdmin().verifyOutboundSttingsUpdateMessage(outboundUpdateMessage);

	}

	/*********************************************************************************
	 * 
	 * Click on Administration link,click on sign out button and verify personal
	 * details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 18, description = "TestCases::WTC-156::Design Steps"
			+ "::60,61,62(Click on Administration link,click on sign out button and "
			+ "verify personal details.)")
	public void logoutFromStaging2ForTC156() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);

	}
	
	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 19, description = "TestCases::WTC-155,156:: DesignSteps"
			+ "::63,64,65,66,67,68(Enter username,password,click login button and "
			+ "verify title of the page.)")
	public void loginToJpayAndVerify2() {

		jpayEmail().login().loadURL(envUrlJpay,variation);
		jpayEmail().login().clickLoginLink();
		jpayEmail().login().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
		jpayEmail().login().enterUsername(usernameJpay);
		jpayEmail().login().enterPassword(passwordJpay);
		jpayEmail().login().clickLoginButton();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
	}
	
	/*********************************************************************************
	 * 
	 * Select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 20, description = "TestCases::WTC-155,156:: DesignSteps"
			+ "::69,70(Select random inmate and click on email link.)")
	public void selectInmateAndClickEmailTab2() {

		jpayEmail().login().selectRandomInmate();
		Selected_Inmate = jpayEmail().login().getInmateName();
		jpayEmail().headerNavigation().clickEmailLink();
		
	}
	
	/*********************************************************************************
	 * 
	 * Verify Transfer stamps link is visible,click on transfer stamps link,
	 * enter stamps to transfer,click on continue button,verify popup message,
	 * click on yes button and verify transfer stamps status and messages.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 21, description = "TestCases::WTC-155::DesignSteps::"
			+ "60,61,62,63,64,65,66,67,68,69(Verify Transfer stamps link is visible,click "
			+ "on transfer stamps link,enter stamps to transfer,click on continue button,"
			+ "verify popup message,click on yes button and verify transfer stamps status "
			+ "and messages.)")
	public void transferStampsAndVerify2ForTC155() {
		
		jpayEmail().transferStamps().verifyTransferStampsLinkVisible();
		Stamps_Before_Transfer = jpayEmail().transferStamps().getStamps();
		jpayEmail().transferStamps().clickTransferStampsButton();
		jpayEmail().transferStamps().enterStampsToTransfer(stampsAmount);//50
		jpayEmail().transferStamps().clickTransferStampsContinueButton();
		jpayEmail().transferStamps().verifyTransferConfirmPopupMsg(popupConfirmation);
		jpayEmail().transferStamps().clickTransferYesButton();
		jpayEmail().transferStamps().verifyTransferCompletionStatus(transferStatus);//Transfer Completed
		jpayEmail().transferStamps().verifyFirstTransCompletionMsg(stampsAmount,Selected_Inmate);
		jpayEmail().transferStamps().VerifyTransferConNumVisible();
		//jpayEmail().transferStamps().verifylastTransCompMsgWithStampCount(Stamps_Before_Transfer, stampsAmount);
		
	}


	/*********************************************************************************
	 * 
	 * Click on email link,enter email message in the message body,verify 
	 * prepaid checkbox and label text is visible,check prepaid checkbox,
	 * click on send button,verify email warning message and check used stamps.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 22, description = "TestCases::WTC-156::DesignSteps::"
			+ "71,72,73,74,75,76,77,78(Click on email link,enter email message in the message "
			+ "body,verify prepaid checkbox and label text is visible,check prepaid checkbox,"
			+ "click on send button,verify email warning message and check used stamps.)")
	public void writeEmailAndVerify2ForTC156() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsg);
		jpayEmail().email().verifyPrepaidCheckboxLabelMsgVisible();
		jpayEmail().email().verifyPrepaidCheckboxVisible();
		jpayEmail().email().checkPrepaidBox();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_2);

	}

	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 23, description = "TestCases::WTC-156::Design Steps::"
			+ "79,80,81(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailAndVerify2ForTC156() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
	}


	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 24, description = "TestCases::WTC-155,156::DesignSteps"
			+ "::(Click on Home link,verify page title and click logout.)")
	public void testEnd(){
		
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
		jpayEmail().login().clickLogoutButton();
		
	}

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/

	@Factory(dataProvider = "getData", dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String> data) {
		return new Object[] { new EmailWTC_155To156Test(data) };
	}

	public EmailWTC_155To156Test(Map<String, String> data) {
		super(data);


		
		username = data.get("username");
		password = data.get("password");
		personalDetails = data.get("personalDetails");
		adminSystem = data.get("adminSystem");
		variation = data.get("variation");
		facilityManagementMainPagetext = data.get("facilityManagementMainPagetext");
		facility = data.get("facility");
		permLoc = data.get("permLoc");
		outboundUpdateMessage = data.get("outboundUpdateMessage");
		inboundUpdateMessage = data.get("inboundUpdateMessage");
		usernameJpay = data.get("usernameJpay");
		passwordJpay = data.get("passwordJpay");
		warnMsg = data.get("warnMsg");
		conMsg = data.get("conMsg");
		stampsAmount = data.get("stampsAmount");//
		popupConfirmation = data.get("popupConfirmation");
		transferStatus = data.get("transferStatus");
		emailMsg = data.get("emailMsg");
	 
		
		
	
	}

	
	
}
