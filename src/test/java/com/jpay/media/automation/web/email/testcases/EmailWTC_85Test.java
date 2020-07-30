package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;

public class EmailWTC_85Test extends BaseTestObject {

	
	
	private String variation;
	private String personalDetails;
	private String adminSystem;
	private String username;
	private String password;
	private String facility;
	private String facilityManagementMainPagetext;
	private String permLoc;
	private String updateMessage;
	private String usernameJpay;
	private String passwordJpay;
	private String warnMsg;
	private String conMsg;
	private String cost10;
	private String cost5;
	private String emailMsg;
	private String filenamePng;
	private String cost1;
	
	
	

	/************************************************************************************************
	 * 
	 * TestCase :: WTC82 - (85.Stamps cost setting should work fine  in staging and www (Checking for image))
	 * Author :: shasan(Shahriar Hasan) , 
	 * Date :: DataFile :: 
	 * Email.xlsx ,
	 * DataSheet :: WTC85      Status :: Completed
	 * 
	 **************************************************************************************************/

	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details, enter
	 * username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-85 ::Design Steps"
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
	 * click permloc,select permloc,edit prepaid stamps cost and stamps per regular 
	 * attachment by entering new value,click on update button and verify the update message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-85 ::Design Steps"
			+ "::7,8,9,10,11,12,13,14,15,16,17,18(Click on Administration link,click "
			+ "on facility management link,verify header text,click manage inbound mail "
			+ "settings,click choose agency,select facility,click permloc,select permloc,"
			+ "edit prepaid stamps cost and stamps per regular attachment by entering "
			+ "new value,click on update button and verify the update message.)")
	public void editManageInboundSettingsOfStagingAndVerify1() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickfacilitiesManagementLink();
		jpayStaging().stagingAdmin().verifyfacilityManagementMainPagetext(facilityManagementMainPagetext);
		jpayStaging().stagingAdmin().clickManageInboundSettingsLink();
		jpayStaging().stagingAdmin().clickMISChooseAgency();
		jpayStaging().stagingAdmin().selectMISFacility(facility,environment);
		jpayStaging().stagingAdmin().clickMISChoosePerm();
		jpayStaging().stagingAdmin().selectMISPermLoc(permLoc);
		jpayStaging().stagingAdmin().enterMISPrepaidStampCost(cost10);
		jpayStaging().stagingAdmin().enterMISStampsCostPerRegularAttachments(cost5);
		jpayStaging().stagingAdmin().clickMISUpdateButton();
		jpayStaging().stagingAdmin().verifyMISUpdateMessage(updateMessage);

	}

	/*********************************************************************************
	 * 
	 * Click on Administration link,click on sign out button and verify personal
	 * details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-85::Design Steps"
			+ "::19,20,21(Click on Administration link,click on sign out button and "
			+ "verify personal details.)")
	public void logoutFromStaging() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);

	}

	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-85 :: Design "
			+ "Steps::22,23,24,25,26,27,28(Enter username,password,click login button and "
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

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-85 :: Design "
			+ "Steps::29,30(Select random inmate and click on email link.)")
	public void selectInmateAndClickEmailTab1() {

		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		
	}
	

	/*********************************************************************************
	 * 
	 * Click email link,enter email message in the message body,check 
	 * prepaid checkbox,attach image,click send button,verify email 
	 * warning message,click on continue button,verify 
	 * email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-85 :: Design "
			+ "Steps::31,32,33,34,35,36,37,38,39,40(Enter plain email message in the "
			+ "message body,check prepaid checkbox,attach image,click send button,verify "
			+ "email warning message,check the used stamps.)")
	public void writeEmailAndVerifyStampsCost() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsg);
		jpayEmail().email().checkPrepaidBox();
		jpayEmail().email().clickAttachImage();
		jpayEmail().email().clickChooseFile(PageConstant.TEST_FILE_PATH+filenamePng);
		//jpayEmail().email().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenamePng);
		jpayEmail().email().clickAttachButton();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_16);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description =  "TestCases::WTC-85 ::DesignSteps"
			+ "::41,42,43(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailAndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
	}


	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-85 :: Design "
			+ "Steps::44,45,46(Click on Home link,verify page title and click logout.)")
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

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-85 ::Design Steps"
			+ "::47,48,49,50,51,52(Navigate to Staging website,verify personal and admin "
			+ "details,enter username,password and click Login button.)")
	public void loginToStaging() {

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
	 * click permloc,select permloc,edit prepaid stamps cost and stamps per regular 
	 * attachment by entering new value,click on update button and verify the update message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-85 ::Design Steps"
			+ "::53,54,55,56,57,58,59,60,61,62,63,64(Click on Administration link,click "
			+ "on facility management link,verify header text,click manage inbound mail "
			+ "settings,click choose agency,select facility,click permloc,select permloc,"
			+ "edit prepaid stamps cost and stamps per regular attachment by entering "
			+ "new value,click on update button and verify the update message.)")
	public void editManageInboundSettingsOfStagingAndVerify2() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickfacilitiesManagementLink();
		jpayStaging().stagingAdmin().verifyfacilityManagementMainPagetext(facilityManagementMainPagetext);
		jpayStaging().stagingAdmin().clickManageInboundSettingsLink();
		jpayStaging().stagingAdmin().clickMISChooseAgency();
		jpayStaging().stagingAdmin().selectMISFacility(facility,environment);
		jpayStaging().stagingAdmin().clickMISChoosePerm();
		jpayStaging().stagingAdmin().selectMISPermLoc(permLoc);
		jpayStaging().stagingAdmin().enterMISStampsCostPerRegularAttachments(cost1);
		jpayStaging().stagingAdmin().enterMISPrepaidStampCost(cost1);
		jpayStaging().stagingAdmin().clickMISUpdateButton();
		jpayStaging().stagingAdmin().verifyMISUpdateMessage(updateMessage);

	}



	/*********************************************************************************
	 * 
	 * Click on Administration link,click on sign out button and verify personal
	 * details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-85::Design Steps"
			+ "::65,67,68(Click on Administration link,click on sign out button and "
			+ "verify personal details.)")
	public void testEnd() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);

	}

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/

	@Factory(dataProvider = "getData", dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String> data) {
		return new Object[] { new EmailWTC_85Test(data) };
	}

	public EmailWTC_85Test(Map<String, String> data) {
		super(data);

		username = data.get("username");
		password = data.get("password");
		personalDetails = data.get("personalDetails");
		adminSystem = data.get("adminSystem");
		variation = data.get("variation");
		facilityManagementMainPagetext = data.get("facilityManagementMainPagetext");
		facility = data.get("facility");
		permLoc = data.get("permLoc");
		updateMessage = data.get("updateMessage");
		usernameJpay = data.get("usernameJpay");
		passwordJpay = data.get("passwordJpay");
		warnMsg = data.get("warnMsg");
		conMsg = data.get("conMsg");
		cost10 = data.get("cost10");
		cost1 = data.get("cost1");
		cost5 = data.get("cost5");
		emailMsg = data.get("emailMsg");
		filenamePng = data.get("filenamePng");
		
		

	}

	
	
}
