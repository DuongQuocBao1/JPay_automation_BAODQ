package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.utilities.DataCollection;

public class EmailWTC_103To104Test extends BaseTestObject{

	private String variation="";
	private String personalDetails="";
	private String username="";
	private String password="";
	private String adminSystem="";
	private String facility="";
	private String inmateId;
	private String addRemoveStamps;
	private String reason;
	private String errorMsg1;
	private String errorMsg2;
	private String errorMsg3;
	private String invalidStamps;
	
	
	
	public static String Stamps;
	public static String Promo_Stamps;
	public static String Free_Stamps;
	
	/************************************************************************************************
	 * 
	 * TestCase :: WTC103To104 - (103.User shall be able to add & refund stamps from inmate Account in staging
	 *                             104.User shall NOT be able to add & refund stamps from inmate Account in staging)
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: WTC103To104
	 * Status :: Completed
	 * 
	 **************************************************************************************************/
	
	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details,
	 * enter username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-103,104::DesignSteps"
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
	 * Click on Administration link,click on inmate account management,select 
	 * facility,enter inmate id,click view inmate account details button,click 
	 * details purchase history button,verify stamps,promotional stamps,free 
	 * stamps,trust funds and prepaid funds present,click on details back button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-103::Design Steps"
			+ "::7,8,9,10,11,12,13,14,15,16,17,18(Click on Administration link,click on "
			+ "inmate account management,select facility,enter inmate id,click view inmate "
			+ "account details button,click details purchase history button,verify stamps,"
			+ "promotional stamps,free stamps,trust funds and prepaid funds present,"
			+ "click on details back button.)")
	public void clickPurchaseHistoryForTC103AndVerify1() {
		
		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickInmateAccountManagementLink();
		jpayStaging().stagingAdmin().clickIAMChooseFacility();
		jpayStaging().stagingAdmin().selectIAMFacility(facility,environment);
		jpayStaging().stagingAdmin().enterIAMInmateId(inmateId);
		jpayStaging().stagingAdmin().clickIAMViewInmateAccDetailsButton();
		jpayStaging().stagingAdmin().clickIAMDetailsPurchasesHistoryButton();
		jpayStaging().stagingAdmin().verifyIAMDetailsStampsPresent();
		jpayStaging().stagingAdmin().verifyIAMDetailsFreeStampsPresent();
		jpayStaging().stagingAdmin().verifyIAMDetailsPromotionalStampsPresent();
		jpayStaging().stagingAdmin().verifyIAMDetailsTrustFundsPresent();
		jpayStaging().stagingAdmin().verifyIAMDetailsPrepaidFundsPresent();
		Stamps=jpayStaging().stagingAdmin().getIAMDetailsStampsCount();
		Promo_Stamps=jpayStaging().stagingAdmin().getIAMDetailsPromotionalStampsCount();
		Free_Stamps=jpayStaging().stagingAdmin().getIAMDetailsFreeStampsCount();
		jpayStaging().stagingAdmin().clickIAMDetailsBackButton();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on inmate account management,click partial refund or add stamps 
	 * button,click on add radio button,enter stamps to add,click confirm 
	 * button,accept alert,verify update message,click on inmate account 
	 * management,click on purchase history,verify stamps,promotional stamps,
	 * free stamps,trust funds and prepaid funds present,verify stamps,promo 
	 * stamps and free stamps counts and click back button. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-103::Design Steps"
			+ "::19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36(Click on "
			+ "inmate account management,click partial refund or add stamps button,click "
			+ "on add radio button,enter stamps to add,click confirm button,accept alert,"
			+ "verify update message,click on inmate account management,click on purchase "
			+ "history,verify stamps,promotional stamps,free stamps,trust funds and prepaid "
			+ "funds present,verify stamps,promo stamps and free stamps counts and click "
			+ "back button.)")
	public void addStampsForTC103AndVerify1() {
		
		jpayStaging().stagingAdmin().clickIAMViewInmateAccDetailsButton();
		jpayStaging().stagingAdmin().clickIAMActionsPartialRefundOrAddStamps();
		jpayStaging().stagingAdmin().clickIAMActionsAddRadioButton();
		jpayStaging().stagingAdmin().enterIAMActionsAddReMoveStamps(addRemoveStamps);
		jpayStaging().stagingAdmin().clickIAMActionsAddRefundConfirmButton();
		jpayStaging().stagingAdmin().acceptAlert();
		jpayStaging().stagingAdmin().verifyIAMAddStampsUpdateMessage(addRemoveStamps, inmateId);

		jpayStaging().stagingAdmin().clickIAMViewInmateAccDetailsButton();
		jpayStaging().stagingAdmin().clickIAMDetailsPurchasesHistoryButton();
		jpayStaging().stagingAdmin().verifyIAMDetailsStampsPresent();
		jpayStaging().stagingAdmin().verifyIAMDetailsFreeStampsPresent();
		jpayStaging().stagingAdmin().verifyIAMDetailsPromotionalStampsPresent();
		jpayStaging().stagingAdmin().verifyIAMDetailsTrustFundsPresent();
		jpayStaging().stagingAdmin().verifyIAMDetailsPrepaidFundsPresent();
		jpayStaging().stagingAdmin().verifyIAMDetailsStamps(Stamps);
		jpayStaging().stagingAdmin().verifyIAMDetailsPromotionStamps(Promo_Stamps);
		jpayStaging().stagingAdmin().verifyIAMDetailsFreeStampsAfterAdd(Free_Stamps, addRemoveStamps);
		Free_Stamps=jpayStaging().stagingAdmin().getIAMDetailsFreeStampsCount();
		jpayStaging().stagingAdmin().clickIAMDetailsBackButton();
		
	}

	/*********************************************************************************
	 * 
	 * Click on inmate account management,click partial refund or add stamps 
	 * button,enter stamps to remove,click confirm 
	 * button,accept alert,verify update message,click on inmate account 
	 * management,click on purchase history,verify stamps,promotional stamps,
	 * free stamps,trust funds and prepaid funds present,verify stamps,promo 
	 * stamps and free stamps counts and click back button. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-103::Design Steps"
			+ "::37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54(Click on "
			+ "inmate account management,click partial refund or add stamps button,click "
			+ "on add radio button,enter stamps to remove,click confirm button,accept alert,"
			+ "verify update message,click on inmate account management,click on purchase "
			+ "history,verify stamps,promotional stamps,free stamps,trust funds and prepaid "
			+ "funds present,verify stamps,promo stamps and free stamps counts and click "
			+ "back button.)")
	public void refundRemoveStampsForTC103AndVerify1() {
		
		jpayStaging().stagingAdmin().clickIAMViewInmateAccDetailsButton();
		jpayStaging().stagingAdmin().clickIAMActionsPartialRefundOrAddStamps();
		jpayStaging().stagingAdmin().enterIAMActionsAddReMoveStamps(addRemoveStamps);
		jpayStaging().stagingAdmin().enterIAMActionsStampsReason(reason);
		jpayStaging().stagingAdmin().clickIAMActionsAddRefundConfirmButton();
		jpayStaging().stagingAdmin().acceptAlert();
		jpayStaging().stagingAdmin().verifyIAMRemoveStampsUpdateMessage(inmateId);

		jpayStaging().stagingAdmin().clickIAMViewInmateAccDetailsButton();
		jpayStaging().stagingAdmin().clickIAMDetailsPurchasesHistoryButton();
		jpayStaging().stagingAdmin().verifyIAMDetailsStampsPresent();
		jpayStaging().stagingAdmin().verifyIAMDetailsFreeStampsPresent();
		jpayStaging().stagingAdmin().verifyIAMDetailsPromotionalStampsPresent();
		jpayStaging().stagingAdmin().verifyIAMDetailsTrustFundsPresent();
		jpayStaging().stagingAdmin().verifyIAMDetailsPrepaidFundsPresent();
		jpayStaging().stagingAdmin().verifyIAMDetailsStamps(Stamps,addRemoveStamps);
		jpayStaging().stagingAdmin().verifyIAMDetailsPromotionStamps(Promo_Stamps);
		jpayStaging().stagingAdmin().verifyIAMDetailsFreeStamps(Free_Stamps);
		Stamps=jpayStaging().stagingAdmin().getIAMDetailsStampsCount();
		jpayStaging().stagingAdmin().clickIAMDetailsBackButton();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on inmate account management,click partial refund or add stamps 
	 * button,enter stamps to remove,click confirm 
	 * button,accept alert,verify update message,click on inmate account 
	 * management,click on purchase history,verify stamps,promotional stamps,
	 * free stamps,trust funds and prepaid funds present,verify stamps,promo 
	 * stamps and free stamps counts and click back button. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-103::Design Steps"
			+ "::55,56,57,58,59,60,61,62,63,64,65,67,68,69,70,71,72,73,74(Click on "
			+ "inmate account management,click partial refund or add stamps button,click "
			+ "on add radio button,enter free and promo stamps to remove,click confirm button,accept alert,"
			+ "verify update message,click on inmate account management,click on purchase "
			+ "history,verify stamps,promotional stamps,free stamps,trust funds and prepaid "
			+ "funds present,verify stamps,promo stamps and free stamps counts and click "
			+ "back button.)")
	public void refundRemoveFreePromoStampsForTC103AndVerify1() {
		
		jpayStaging().stagingAdmin().clickIAMViewInmateAccDetailsButton();
		jpayStaging().stagingAdmin().clickIAMActionsPartialRefundOrAddStamps();
		jpayStaging().stagingAdmin().enterIAMActionsRemoveFreeStamps(addRemoveStamps);
		jpayStaging().stagingAdmin().enterIAMActionsRemovePromoStamps(addRemoveStamps);
		jpayStaging().stagingAdmin().enterIAMActionsStampsReason(reason);
		jpayStaging().stagingAdmin().clickIAMActionsAddRefundConfirmButton();
		jpayStaging().stagingAdmin().acceptAlert();
		jpayStaging().stagingAdmin().verifyIAMRemoveFreePromoStampsUpdateMessage(inmateId);

		jpayStaging().stagingAdmin().clickIAMViewInmateAccDetailsButton();
		jpayStaging().stagingAdmin().clickIAMDetailsPurchasesHistoryButton();
		jpayStaging().stagingAdmin().verifyIAMDetailsStampsPresent();
		jpayStaging().stagingAdmin().verifyIAMDetailsFreeStampsPresent();
		jpayStaging().stagingAdmin().verifyIAMDetailsPromotionalStampsPresent();
		jpayStaging().stagingAdmin().verifyIAMDetailsTrustFundsPresent();
		jpayStaging().stagingAdmin().verifyIAMDetailsPrepaidFundsPresent();
		jpayStaging().stagingAdmin().verifyIAMDetailsStamps(Stamps);
		jpayStaging().stagingAdmin().verifyIAMDetailsPromotionStamps(Promo_Stamps,addRemoveStamps);
		jpayStaging().stagingAdmin().verifyIAMDetailsFreeStampsAfterRemove(Free_Stamps,addRemoveStamps);
		jpayStaging().stagingAdmin().clickIAMDetailsBackButton();
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on Administration link,click on inmate account management,select 
	 * facility,enter inmate id,click view inmate account details button,click 
	 * details purchase history button,verify stamps,promotional stamps,free 
	 * stamps,trust funds and prepaid funds present,click on details back button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-104::Design Steps"
			+ "::7,8,9,10,11,12,13,14,15,16,17,18(Click on Administration link,click on "
			+ "inmate account management,select facility,enter inmate id,click view inmate "
			+ "account details button,click details purchase history button,verify stamps,"
			+ "promotional stamps,free stamps,trust funds and prepaid funds present,"
			+ "click on details back button.)")
	public void clickPurchaseHistoryForTC104AndVerify1() {
		
		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickInmateAccountManagementLink();
		jpayStaging().stagingAdmin().clickIAMChooseFacility();
		jpayStaging().stagingAdmin().selectIAMFacility(facility,environment);
		jpayStaging().stagingAdmin().enterIAMInmateId(inmateId);
		jpayStaging().stagingAdmin().clickIAMViewInmateAccDetailsButton();
		jpayStaging().stagingAdmin().clickIAMDetailsPurchasesHistoryButton();
		jpayStaging().stagingAdmin().verifyIAMDetailsStampsPresent();
		jpayStaging().stagingAdmin().verifyIAMDetailsFreeStampsPresent();
		jpayStaging().stagingAdmin().verifyIAMDetailsPromotionalStampsPresent();
		jpayStaging().stagingAdmin().verifyIAMDetailsTrustFundsPresent();
		jpayStaging().stagingAdmin().verifyIAMDetailsPrepaidFundsPresent();
		Stamps=jpayStaging().stagingAdmin().getIAMDetailsStampsCount();
		Promo_Stamps=jpayStaging().stagingAdmin().getIAMDetailsPromotionalStampsCount();
		Free_Stamps=jpayStaging().stagingAdmin().getIAMDetailsFreeStampsCount();
		jpayStaging().stagingAdmin().clickIAMDetailsBackButton();
		
	}

	/*********************************************************************************
	 * 
	 * Click on view inmate account details button,click partial refund or 
	 * add stamps button,click on confirm button without entering stamps,
	 * accept alert and verify error messages.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-104::Design Steps"
			+ "::19,20,21,22,23,24(Click on view inmate account details button,click partial "
			+ "refund or add stamps button,click on confirm button without entering stamps,"
			+ "accept alert and verify error messages.)")
	public void addRefundStampsWithoutEnteringForTC104AndVerify1() {
		
		jpayStaging().stagingAdmin().clickIAMViewInmateAccDetailsButton();
		jpayStaging().stagingAdmin().clickIAMActionsPartialRefundOrAddStamps();
		jpayStaging().stagingAdmin().clickIAMActionsAddRefundConfirmButton();
		jpayStaging().stagingAdmin().acceptAlert();
		jpayStaging().stagingAdmin().verifyIAMPartRefundAddInmateAccStampsErrorMsg(errorMsg1);
		jpayStaging().stagingAdmin().verifyIAMPartRefundAddInmateAccReasonErrorMsg(errorMsg2);
		
	}

	/*********************************************************************************
	 * 
	 * Enter invalid stamps in free and promo stamps to remove,enter reason,
	 * click on confirm,accept alert and verify error message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-104::Design Steps"
			+ "::25,26,27,28,29,30(Enter invalid stamps in free and promo stamps to remove,"
			+ "enter reason,click on confirm,accept alert and verify error message.)")
	public void addRefundStampsWithInvalidAmountForTC104AndVerify1() {
		
		jpayStaging().stagingAdmin().enterIAMActionsRemoveFreeStamps(invalidStamps);
		jpayStaging().stagingAdmin().enterIAMActionsRemovePromoStamps(invalidStamps);
		jpayStaging().stagingAdmin().enterIAMActionsStampsReason(reason);
		jpayStaging().stagingAdmin().clickIAMActionsAddRefundConfirmButton();
		jpayStaging().stagingAdmin().acceptAlert();
		jpayStaging().stagingAdmin().verifyIAMPartRefundAddInmateAccStampsErrorMsg(errorMsg3);
		
	}

	/*********************************************************************************
	 * 
	 * Click on inmate account management,select facility,enter inmate id,click 
	 * view inmate account details button,click details purchase history button,
	 * verify stamps,promotional stamps,free stamps,trust funds and prepaid funds 
	 * present,verify stamps,promo and free stamps count,click on details back button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-104::Design Steps"
			+ "::31,32,33,34,35,36,37,38,39,40,41,42,43,44,45(Click on inmate account "
			+ "management,select facility,enter inmate id,click view inmate account "
			+ "details button,click details purchase history button,verify stamps,"
			+ "promotional stamps,free stamps,trust funds and prepaid funds present,"
			+ "verify stamps,promo and free stamps count,click on details back button.)")
	public void clickPurchaseHistoryForTC104AndVerify2() {
		
		jpayStaging().stagingAdmin().clickInmateAccountManagementLink();
		jpayStaging().stagingAdmin().clickIAMChooseFacility();
		jpayStaging().stagingAdmin().selectIAMFacility(facility,environment);
		jpayStaging().stagingAdmin().enterIAMInmateId(inmateId);
		jpayStaging().stagingAdmin().clickIAMViewInmateAccDetailsButton();
		jpayStaging().stagingAdmin().clickIAMDetailsPurchasesHistoryButton();
		jpayStaging().stagingAdmin().verifyIAMDetailsStampsPresent();
		jpayStaging().stagingAdmin().verifyIAMDetailsFreeStampsPresent();
		jpayStaging().stagingAdmin().verifyIAMDetailsPromotionalStampsPresent();
		jpayStaging().stagingAdmin().verifyIAMDetailsTrustFundsPresent();
		jpayStaging().stagingAdmin().verifyIAMDetailsPrepaidFundsPresent();
		jpayStaging().stagingAdmin().verifyIAMDetailsStamps(Stamps);
		jpayStaging().stagingAdmin().verifyIAMDetailsPromotionStamps(Promo_Stamps);
		jpayStaging().stagingAdmin().verifyIAMDetailsFreeStamps(Free_Stamps);
		jpayStaging().stagingAdmin().clickIAMDetailsBackButton();
		
	}

	
	/*********************************************************************************
	 * 
	 * Click administration link,click signout button and verify.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-103,104::DesignSteps"
			+ "::(Click administration link,click signout button and verify.)")
	public void endTest() {
		
		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		
	}
	
	
	
	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_103To104Test(data) };
	}
	
	
	
	public EmailWTC_103To104Test(Map<String, String> data) {
		super(data);
		
		
		
		variation = data.get("variation");
		personalDetails = data.get("personalDetails");
		username = data.get("username");
		password = data.get("password");
		adminSystem = data.get("adminSystem");
		facility = data.get("facility");
		inmateId = data.get("inmateId");
		addRemoveStamps = data.get("addRemoveStamps");
		reason = data.get("reason");
		errorMsg1 = data.get("errorMsg1");
		errorMsg2 = data.get("errorMsg2");
		errorMsg3 = data.get("errorMsg3");
		invalidStamps = data.get("invalidStamps");
		
		
		
	}

}
