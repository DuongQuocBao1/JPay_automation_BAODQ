package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC74To75 - (74.User shall be able to view an archived letter.
 *                           75.User shall be able to find letter.)
 * Author :: shasan(Shahriar Hasan) , Date :: 07/15/2019
 * DataFile :: Email.xlsx , DataSheet :: WTC74To75
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_76To77Test extends BaseTestObject{
	

	private String username;
	private String pinCode;
	private String variation;
	private String password;
	private String inmateId;
	private String inmateAccountStatus;
	private String actionsText;
	private String detailsText;
	private String announcementFillOutText;
	private String facilityStaffEmail;
	private String announcement;
	private String previewMessage;
	private String status;
	

	public static String Facility_Announcement_No;
	public static String Inmate_Announcement_No;


	/*********************************************************************************
	 * 
	 * Insert STATE name in search box,Insert inmate ID in search box and Click
	 * on next image button
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-76::Design Steps"
			+ "::1,2,3,4,5(Insert STATE name in search box,Insert inmate ID in search "
			+ "box and Click on next button)")
	public void testStart() {
		
		jpayFacility().facilityLogin().loadURL(envUrlFacility,variation);
		jpayFacility().facilityLogin().enterUsername(username);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(password);
		jpayFacility().facilityLogin().clickLoginButton();
		
		
	}

	/*********************************************************************************
	 * 
	 * Click on Handle inmate account,enter inmate id,click on view inmate 
	 * account details and verify search result is present,inmate id,
	 * account status,actions and details text,click edit button and 
	 * cancel button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-76::Design Steps"
			+ "::6,7,8,9,10,11,12,13,14,15(Click on Handle inmate account,enter inmate "
			+ "id,click on view inmate account details and verify search result is "
			+ "present,inmate id,account status,actions and details text,click edit"
			+ " button and cancel button.)")
	public void inmateAccountDetailsForTC76AndVerify() {

		jpayFacility().facilityAdmin().clickHandleInmateAccountLink();
		jpayFacility().facilityAdmin().enterHIAInsertInmateId(inmateId);
		jpayFacility().facilityAdmin().clickHIAViewInmateAccountDetailsButton();
		jpayFacility().facilityAdmin().verifyHIAInameIdSearchedResultPresent();
		jpayFacility().facilityAdmin().verifyHIAInameId(inmateId);
		jpayFacility().facilityAdmin().verifyHIAInameAccountStatus(inmateAccountStatus);
		jpayFacility().facilityAdmin().verifyHIAActionsText(actionsText);
		jpayFacility().facilityAdmin().verifyHIADetailsText(detailsText);
		jpayFacility().facilityAdmin().clickHIAEditButton();
		jpayFacility().facilityAdmin().clickHIACancelButton();
		
	}

	/*********************************************************************************
	 * 
	 * Click on Details Account History,verify the page verification text and click back button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-76::Design Steps"
			+ "::16,17,18(Click on Details Account History,verify the page verification "
			+ "text and click back button.)")
	public void clickAccountHistoryForTC76AndVerify() {

		jpayFacility().facilityAdmin().clickHIADetailsAccountHistoryButton();
		jpayFacility().facilityAdmin().verifyHIADetailsPageVerifyTextPresent();
		jpayFacility().facilityAdmin().clickHIADetailsBackButton();
		
	}

	/*********************************************************************************
	 * 
	 * Click on Details Letters Sent/Received History,verify the page 
	 * verification text and click back button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-76::Design Steps"
			+ "::19,20,21(Click on Details Letters Sent/Received History,verify the "
			+ "page verification text and click back button.)")
	public void clickSentReceivedHistoryForTC76AndVerify() {

		jpayFacility().facilityAdmin().clickHIADetailsLetterSentReceivedButton();
		jpayFacility().facilityAdmin().verifyHIADetailsPageVerifyTextPresent();
		jpayFacility().facilityAdmin().clickHIADetailsBackButton();
		
	}

	/*********************************************************************************
	 * 
	 * Click on Printed Items History,verify the page verification text and click back button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-76::Design Steps"
			+ "::22,23,24(Click on Printed Items History,verify the page verification "
			+ "text and click back button.)")
	public void clickPrintedItemsHistoryForTC76AndVerify() {

		jpayFacility().facilityAdmin().clickHIADetailsPrintedItemsHistoryButton();
		jpayFacility().facilityAdmin().verifyHIADetailsPageVerifyTextPresent();
		jpayFacility().facilityAdmin().clickHIADetailsBackButton();
		
	}

	/*********************************************************************************
	 * 
	 * Click on Purchases History,verify the page verification text and click back button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-76::Design Steps"
			+ "::25,26,27(Click on Purchases History,verify the page verification "
			+ "text and click back button.)")
	public void clickPurchasesHistoryForTC76AndVerify() {

		jpayFacility().facilityAdmin().clickHIADetailsPurchasesHistoryButton();
		jpayFacility().facilityAdmin().verifyHIADetailsPageVerifyTextPresent();
		jpayFacility().facilityAdmin().clickHIADetailsBackButton();
		
	}

	/*********************************************************************************
	 * 
	 * Click on Kiosk Session History,verify the page verification text,
	 * click on export to file button and click back button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-76::Design Steps"
			+ "::28,29,30,31(Click on Kiosk Session History,verify the page verification "
			+ "text,click on export to file button and click back button.)")
	public void clickKioskSessionHistoryForTC76AndVerify() {

		jpayFacility().facilityAdmin().clickHIADetailsKioskSessionHistoryButton();
		jpayFacility().facilityAdmin().verifyHIADetailsPageVerifyTextPresent();
		jpayFacility().facilityAdmin().clickHIAKioskSessionExportToFileButton();
		jpayFacility().facilityAdmin().clickHIADetailsBackButton();
		
	}

	/*********************************************************************************
	 * 
	 * Click on Invitations History,verify the page verification text,
	 * click on export to file button and click back button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-76::Design Steps"
			+ "::32,33,34(Click on Invitations History,verify the page verification "
			+ "text,click on export to file button and click back button.)")
	public void clickInvitationsHistoryForTC76AndVerify() {

		jpayFacility().facilityAdmin().clickHIADetailsInvitationsHistoryButton();
		jpayFacility().facilityAdmin().verifyHIADetailsPageVerifyTextPresent();
		jpayFacility().facilityAdmin().clickHIADetailsBackButton();
		
	}

	/*********************************************************************************
	 * 
	 * Click on Commissary Carts History History,verify the page verification 
	 * text,click on export to file button and click back button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-76::Design Steps"
			+ "::35,36(Click on Invitations History,verify the page verification "
			+ "text,click on export to file button and click back button.)")
	public void clickCommissaryCartsHistoryForTC76AndVerify() {

		jpayFacility().facilityAdmin().clickHIADetailsCommissaryCartsHistoryButton();
		jpayFacility().facilityAdmin().clickHIADetailsBackButton();
		
	}

	/*********************************************************************************
	 * 
	 * Click on admin link,click on inmate announcement,click on send an inmate 
	 * announcement button,verify text,check facility staff members checkbox,
	 * enter staff members email,click on source,write announcement,click on 
	 * add date and add inmate name,click on preview button,verify preview message,
	 * click on back button,click on preview button,verify preview message,click on 
	 * send announcement button and verify sent announcement success message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-77::Design Steps"
			+ "::6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22(Click on admin link,click "
			+ "on inmate announcement,click on send an inmate announcement button,verify "
			+ "text,check facility staff members checkbox,enter staff members email,click "
			+ "on source,write announcement,click on add date and add inmate name,click on "
			+ "preview button,verify preview message,click on back button,click on preview "
			+ "button,verify preview message,click on send announcement button and verify "
			+ "sent announcement success message.)")
	public void clickSendAnInmateAnnouncement1ForTC77AndVerify() {

		jpayFacility().facilityAdmin().clickAdminLink();
		jpayFacility().facilityAdmin().clickInmateAnnouncementLink();
		jpayFacility().facilityAdmin().clickIASendAnInmateAnnouncementLink();
		jpayFacility().facilityAdmin().verifyIASendInmateAnnFillOutVerifyText(announcementFillOutText);
		jpayFacility().facilityAdmin().checkIAFacilityStaffMembersCheckbox();
		jpayFacility().facilityAdmin().enterIAFacilityStaffMembersEmail(facilityStaffEmail);
		jpayFacility().facilityAdmin().clickIASourceLink();
		jpayFacility().facilityAdmin().writeIAInmateAnnouncement(announcement);
		jpayFacility().facilityAdmin().clickIAAddDateButton();
		jpayFacility().facilityAdmin().clickIAAddInmateNameButton();
		jpayFacility().facilityAdmin().clickIAPreviewButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementPreviewMessage(previewMessage);
		jpayFacility().facilityAdmin().clickIABackButton();
		jpayFacility().facilityAdmin().clickIAPreviewButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementPreviewMessage(previewMessage);
		jpayFacility().facilityAdmin().clickIASendAnnouncementButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementSentSuccessMessage();
		
		Facility_Announcement_No = jpayFacility().facilityAdmin().getAnnouncementRequestNo();
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on admin link,click on inmate announcement,click on send an inmate 
	 * announcement button,verify text,click on inmate radio button,enter inmate id,
	 * click check inmate button,verify inmate information,check facility staff members checkbox,
	 * enter staff members email,click on source,write announcement,click on 
	 * add date and add inmate name,click on preview button,verify preview message,
	 * click on back button,click on preview button,verify preview message,click on 
	 * send announcement button and verify sent announcement success message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-77::Design Steps"
			+ "::23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43(Click on "
			+ "admin link,click on inmate announcement,click on send an inmate announcement "
			+ "button,verify text,click on inmate radio button,enter inmate id,click check "
			+ "inmate button,verify inmate information,check facility staff members checkbox,"
			+ "enter staff members email,click on source,write announcement,click on add date "
			+ "and add inmate name,click on preview button,verify preview message,click on back "
			+ "button,click on preview button,verify preview message,click on send announcement "
			+ "button and verify sent announcement success message.)")
	public void clickSendAnInmateAnnouncement2ForTC77AndVerify() {

		jpayFacility().facilityAdmin().clickAdminLink();
		jpayFacility().facilityAdmin().clickInmateAnnouncementLink();
		jpayFacility().facilityAdmin().clickIASendAnInmateAnnouncementLink();
		jpayFacility().facilityAdmin().verifyIASendInmateAnnFillOutVerifyText(announcementFillOutText);
		jpayFacility().facilityAdmin().clickIAInmateRadioButton();
		jpayFacility().facilityAdmin().enterIAInsertInmateId(inmateId);
		jpayFacility().facilityAdmin().clickIACheckInmateButton();
		jpayFacility().facilityAdmin().verifyIAInmateInfoTextPresent();
		jpayFacility().facilityAdmin().checkIAFacilityStaffMembersCheckbox();
		jpayFacility().facilityAdmin().enterIAFacilityStaffMembersEmail(facilityStaffEmail);
		jpayFacility().facilityAdmin().clickIASourceLink();
		jpayFacility().facilityAdmin().writeIAInmateAnnouncement(announcement);
		jpayFacility().facilityAdmin().clickIAAddDateButton();
		jpayFacility().facilityAdmin().clickIAAddInmateNameButton();
		jpayFacility().facilityAdmin().clickIAPreviewButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementPreviewMessage(previewMessage);
		jpayFacility().facilityAdmin().clickIABackButton();
		jpayFacility().facilityAdmin().clickIAPreviewButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementPreviewMessage(previewMessage);
		jpayFacility().facilityAdmin().clickIASendAnnouncementButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementSentSuccessMessage();
		
		Inmate_Announcement_No = jpayFacility().facilityAdmin().getAnnouncementRequestNo();
		
	}

	/*********************************************************************************
	 * 
	 * Click on admin link,click on inmate announcement,click on view an 
	 * announcement button,enter from and check date,click on view button,
	 * verify the search results are present and status of the announcements.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-77::Design Steps"
			+ "::44,45,46,47,48,49,50,51,52(Click on admin link,click on inmate announcement,"
			+ "click on view an announcement button,enter from and check date,click on view "
			+ "button,verify the search results are present and status of the announcements.)")
	public void verifyAnnouncementStatus2ForTC77() {

		jpayFacility().facilityAdmin().clickAdminLink();
		jpayFacility().facilityAdmin().clickInmateAnnouncementLink();
		jpayFacility().facilityAdmin().pause(62000);
		jpayFacility().facilityAdmin().clickIAViewPreviousInmateAnnouncementLink();
		jpayFacility().facilityAdmin().enterIAAnnouncementStatusCheckFromToDate();
		jpayFacility().facilityAdmin().clickIAViewAnnouncementButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementStatusResultPresent(Facility_Announcement_No);
		jpayFacility().facilityAdmin().verifyIAAnnouncementStatusResultPresent(Inmate_Announcement_No);
		//jpayFacility().facilityAdmin().verifyIAAnnouncementStatus(Facility_Announcement_No, status);
		jpayFacility().facilityAdmin().verifyIAAnnouncementStatus(Inmate_Announcement_No, status);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-76,77:: Design "
			+ "Steps::(Click sign out button .)")
	public void testEnd() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_76To77Test(data) };
	}
	
	
	public EmailWTC_76To77Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		password = data.get("password");
		username = data.get("username");
		pinCode = data.get("pinCode");
		inmateId = data.get("inmateId");
		inmateAccountStatus = data.get("inmateAccountStatus");
		actionsText = data.get("actionsText");
		detailsText = data.get("detailsText");
		announcementFillOutText = data.get("announcementFillOutText");//
		facilityStaffEmail = data.get("facilityStaffEmail");
		announcement = data.get("announcement");
		previewMessage = data.get("previewMessage");//
		status = data.get("status");
		
		
	}

	


}
