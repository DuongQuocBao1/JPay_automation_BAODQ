package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.utilities.DataCollection;

public class EmailWTC_78Test extends BaseTestObject {

	private String variation;
	private String personalDetails;
	private String adminSystem;
	private String username;
	private String password;
	private String inmateAccManagementText;
	private String facility;
	private String inmateId;
	private String accHistoryText;
	private String accStatus;
	private String puchasesHistoryText;
	private String purchasesText;
	private String purchasesDollarText;
	private String purchasesJpayCreditText;
	private String purchasesEmailUsageText;
	private String purchasesAccountBalanceText;
	private String lettersSentReceivedText;
	private String printedItemsText;
	private String supportTicketsText;
	

	/************************************************************************************************
	 * 
	 * TestCase :: WTC78 - (Account, Purchase, Letter Sent/Received, Printed, Support Tickets history)
	 * Author :: shasan(Shahriar Hasan) , Date :: DataFile :: Email.xlsx ,
	 * DataSheet :: WTC78      Status :: Completed
	 * 
	 **************************************************************************************************/

	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details, enter
	 * username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-78 ::Design Steps"
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
	 * Click on Administration link,click on inmate account management link and 
	 * verify inmate account management header text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-78 ::Design Steps"
			+ "::7,8,9(Click on Administration link,click on inmate account management "
			+ "link and verify inmate account management header text.)")
	public void navigateToInmateAccountManagementAndVerify() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickInmateAccountManagementLink();
		jpayStaging().stagingAdmin().verifyInmateAccountManagementText(inmateAccManagementText);

	}

	/*********************************************************************************
	 * 
	 * Click on choose facility,select facility,enter inmate id,click on view 
	 * inmate details button and verify actions and details are present.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-62 ::Design Steps"
			+ "::10,11,12,13,14,15(Click on choose facility,select facility,enter inmate id,"
			+ "click on view inmate details button and verify actions and details are present.)")
	public void navigateToInmateAccountDetailsAndVerify() {

		jpayStaging().stagingAdmin().clickIAMChooseFacility();
		jpayStaging().stagingAdmin().selectIAMFacility(facility,environment);
		jpayStaging().stagingAdmin().enterIAMInmateId(inmateId);
		jpayStaging().stagingAdmin().clickIAMViewInmateAccDetailsButton();
		jpayStaging().stagingAdmin().verifyIAMActionsPresent();
		jpayStaging().stagingAdmin().verifyIAMDetailsPresent();

	}

	/*********************************************************************************
	 * 
	 * Click on account history link,verify inmate account history text and 
	 * account status,click on view inmate account details button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-78::Design Steps::"
			+ "16,17,18,19,20(Click on account history link,verify inmate account history "
			+ "text and account status,click on view inmate account details button.)")
	public void navigateToAccountHistoryAndVerify() {

		jpayStaging().stagingAdmin().clickIAMDetailsAccountHistoryButton();
		jpayStaging().stagingAdmin().verifyIAMDetailsAccountHistoryText(accHistoryText);
		jpayStaging().stagingAdmin().verifyIAMDetailsAccountHistoryStatus(accStatus);
		jpayStaging().stagingAdmin().clickIAMViewInmateAccDetailsButton();
		jpayStaging().stagingAdmin().verifyInmateAccountManagementText(inmateAccManagementText);

	}
	
	/*********************************************************************************
	 * 
	 * Click on purchases history link,verify purchases history header text,
	 * purchases text,jpay dollars,jpay credits,mail usage and account balance 
	 * text,click on back button and verify inmate account management header text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-78::Design Steps::"
			+ "21,22,23,24,25,26,27,28,29(Click on purchases history link,verify purchases "
			+ "history header text,purchases text,jpay dollars,jpay credits,mail usage and "
			+ "account balance text,click on back button and verify inmate account "
			+ "management header text.)")
	public void navigateToPurchasesHistoryAndVerify() {

		jpayStaging().stagingAdmin().clickIAMDetailsPurchasesHistoryButton();
		jpayStaging().stagingAdmin().verifyIAMDetailsPurchasesHistoryText(puchasesHistoryText);
		jpayStaging().stagingAdmin().verifyIAMDetailsPurchasesText(purchasesText);
		jpayStaging().stagingAdmin().verifyIAMDetailsPurchasesJpayDollarsText(purchasesDollarText);
		jpayStaging().stagingAdmin().verifyIAMDetailsPurchasesJpayCreditText(purchasesJpayCreditText);
		jpayStaging().stagingAdmin().verifyIAMDetailsPurchasesEmailUsageText(purchasesEmailUsageText);
		jpayStaging().stagingAdmin().verifyIAMDetailsPurchasesAccountBalanceText(purchasesAccountBalanceText);
		jpayStaging().stagingAdmin().clickIAMDetailsBackButton();
		jpayStaging().stagingAdmin().verifyInmateAccountManagementText(inmateAccManagementText);

	}
	
	/*********************************************************************************
	 * 
	 * Click on Letters sent/received link,verify the header text,click on show 
	 * older letter,click on show latest letter,click on back button 3 times and verify 
	 * inmate account management header text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-78::Design Steps::"
			+ "30,31,32,33,34,35,36,37(Click on Letters sent/received link,verify the "
			+ "header text,click on show older letter,click on show latest letter,click "
			+ "on back button 3 times and verify inmate account management header text.)")
	public void navigateToLetterSentReceivedHistoryAndVerify() {

		jpayStaging().stagingAdmin().clickIAMDetailsSentReceivedHistoryButton();
		jpayStaging().stagingAdmin().verifyIAMDetailsSentReceivedHistoryText(lettersSentReceivedText);
		jpayStaging().stagingAdmin().clickIAMDetailsSentReceivedShowOlderLetters();
		jpayStaging().stagingAdmin().clickIAMDetailsSentReceivedShowLatestLetters();
		jpayStaging().stagingAdmin().clickIAMDetailsBackButton();
		jpayStaging().stagingAdmin().clickIAMDetailsBackButton();
		jpayStaging().stagingAdmin().clickIAMDetailsBackButton();
		jpayStaging().stagingAdmin().verifyInmateAccountManagementText(inmateAccManagementText);

	}
	
	/*********************************************************************************
	 * 
	 * Click on printed items history,verify the header text,click on back button and verify inmate account management header text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-78::Design Steps::"
			+ "38,39,40,41(Click on printed items history,verify the header text,click "
			+ "on back button and verify inmate account management header text.)")
	public void navigateToPrintedItemsHistoryAndVerify() {

		jpayStaging().stagingAdmin().clickIAMDetailsPrintedItemsHistoryButton();
		jpayStaging().stagingAdmin().verifyIAMDetailsPrintedItemsHistoryText(printedItemsText);
		jpayStaging().stagingAdmin().clickIAMDetailsBackButton();
		jpayStaging().stagingAdmin().verifyInmateAccountManagementText(inmateAccManagementText);

	}
	
	/*********************************************************************************
	 * 
	 * Click on Support tickets history,verify the header text,click on back 
	 * button and verify inmate account management header text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-78::Design Steps::"
			+ "42,43,44,45(Click on Support tickets history,verify the header text,click "
			+ "on back button and verify inmate account management header text.)")
	public void navigateToSupportTicketsHistoryAndVerify() {

		jpayStaging().stagingAdmin().clickIAMDetailsSupportTicketsHistoryButton(); 
		jpayStaging().stagingAdmin().verifyIAMDetailsSupportTicketsHistoryText(supportTicketsText);
		jpayStaging().stagingAdmin().clickIAMDetailsBackButton();
		jpayStaging().stagingAdmin().verifyInmateAccountManagementText(inmateAccManagementText);

	}


	/*********************************************************************************
	 * 
	 * Click on Administration link,click on sign out button and verify personal
	 * details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-78::Design Steps"
			+ "::46,47,48(Click on Administration link,click on sign out button and "
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
		return new Object[] { new EmailWTC_78Test(data) };
	}

	public EmailWTC_78Test(Map<String, String> data) {
		super(data);

		username = data.get("username");
		password = data.get("password");
		personalDetails = data.get("personalDetails");
		adminSystem = data.get("adminSystem");
		variation = data.get("variation");
		inmateAccManagementText = data.get("inmateAccManagementText");
		facility = data.get("facility");
		inmateId = data.get("inmateId");
		accHistoryText = data.get("accHistoryText");
		accStatus = data.get("accStatus");
		puchasesHistoryText = data.get("puchasesHistoryText");
		purchasesText = data.get("purchasesText");//
		purchasesDollarText = data.get("purchasesDollarText");
		purchasesJpayCreditText = data.get("purchasesJpayCreditText");
		purchasesEmailUsageText = data.get("purchasesEmailUsageText");
		purchasesAccountBalanceText = data.get("purchasesAccountBalanceText");
		lettersSentReceivedText = data.get("lettersSentReceivedText");
		printedItemsText = data.get("printedItemsText");
		supportTicketsText = data.get("supportTicketsText");

	}

}
