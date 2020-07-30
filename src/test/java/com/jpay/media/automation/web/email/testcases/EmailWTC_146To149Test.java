package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC146To149 - (146.User shall be able to Send Inmate Announcement with image by Facility
 *                            147.User shall be able to Send Inmate Announcement with image by Inmate
 *                            148.User shall be able to Send Inmate Announcement with 1 Facility (Consolidate/super user)
 *                            149.User has to provide expected value to Send Inmate Announcement)
 * Author :: shasan(Shahriar Hasan) , Date :: 
 * DataFile :: Email.xlsx , DataSheet :: WTC146To149
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_146To149Test extends BaseTestObject{
	

	private String usernameSuper;
	private String usernameConsolidate;
	private String pinCode;
	private String variation;
	private String password;
	private String inmateId;
	private String announcementFillOutText;
	private String facilityStaffEmail;
	private String announcementByFacilitySuperForTC146;
	private String announcementByFacilityConsolidateForTC146;
	private String announcementByInmateSuperForTC147;
	private String announcementByInmateConsolidateForTC147;
	private String previewMessage;
	private String status;
	private String facilitySuperUser;
	private String facilityConsolidateUser;
	private String announcementSingleFacilityForTC148;
	private String house;
	private String emptyLetterErrorMsg;
	private String emptyInmateIdErrorMsg;
	private String emptyStaffEmailErrorMsg;
	private String announcement1ForTC149;
	private String announcement2ForTC149;
	

	public static String Super_Announcement_146;
	public static String Consolidate_Announcement_146;
	public static String Super_Announcement_147;
	public static String Consolidate_Announcement_147;
	public static String Announcement_148;
	public static String Announcement1_149;
	public static String Announcement2_149;


	/*********************************************************************************
	 * 
	 * Navigate to facility website,enter username,pincode,password and click login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-146,147::Design Steps"
			+ "::1,2,3,4,5(Navigate to facility website,enter username,pincode,password "
			+ "and click login button.)")
	public void testStart() {
		
		jpayFacility().facilityLogin().loadURL(envUrlFacility,variation);
		jpayFacility().facilityLogin().enterUsername(usernameSuper);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(password);
		jpayFacility().facilityLogin().clickLoginButton();
		
		
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

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-146::Design Steps"
			+ "::6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22(Click on admin link,click "
			+ "on inmate announcement,click on send an inmate announcement button,verify "
			+ "text,check facility staff members checkbox,enter staff members email,click "
			+ "on source,write announcement,click on add date and add inmate name,click on "
			+ "preview button,verify preview message,click on back button,click on preview "
			+ "button,verify preview message,click on send announcement button and verify "
			+ "sent announcement success message.)")
	public void sendInmateAnnouncementSuperAndVerifyForTC146() {

		jpayFacility().facilityAdmin().clickInmateAnnouncementLink();
		jpayFacility().facilityAdmin().clickIASendAnInmateAnnouncementLink();
		jpayFacility().facilityAdmin().verifyIASendInmateAnnFillOutVerifyText(announcementFillOutText);
		jpayFacility().facilityAdmin().checkIAFacilityStaffMembersCheckbox();
		jpayFacility().facilityAdmin().enterIAFacilityStaffMembersEmail(facilityStaffEmail);
		jpayFacility().facilityAdmin().clickIASourceLink();
		jpayFacility().facilityAdmin().writeIAInmateAnnouncement(announcementByFacilitySuperForTC146);
		jpayFacility().facilityAdmin().clickIAAddDateButton();
		jpayFacility().facilityAdmin().clickIAAddInmateNameButton();
		jpayFacility().facilityAdmin().clickIAPreviewButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementPreviewMessage(previewMessage);
		jpayFacility().facilityAdmin().clickIABackButton();
		jpayFacility().facilityAdmin().clickIAPreviewButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementPreviewMessage(previewMessage);
		jpayFacility().facilityAdmin().verifyIAFacilitiesName(facilitySuperUser);
		jpayFacility().facilityAdmin().clickIASendAnnouncementButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementSentSuccessMessage();
		
		Super_Announcement_146 = jpayFacility().facilityAdmin().getAnnouncementRequestNo();
		
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

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-147::Design Steps"
			+ "::6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26(Click on "
			+ "admin link,click on inmate announcement,click on send an inmate announcement "
			+ "button,verify text,click on inmate radio button,enter inmate id,click check "
			+ "inmate button,verify inmate information,check facility staff members checkbox,"
			+ "enter staff members email,click on source,write announcement,click on add date "
			+ "and add inmate name,click on preview button,verify preview message,click on back "
			+ "button,click on preview button,verify preview message,click on send announcement "
			+ "button and verify sent announcement success message.)")
	public void sendInmateAnnouncementSuperAndVerifyForTC147() {

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
		jpayFacility().facilityAdmin().writeIAInmateAnnouncement(announcementByInmateSuperForTC147);
		jpayFacility().facilityAdmin().clickIAAddDateButton();
		jpayFacility().facilityAdmin().clickIAAddInmateNameButton();
		jpayFacility().facilityAdmin().clickIAPreviewButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementPreviewMessage(previewMessage);
		jpayFacility().facilityAdmin().clickIABackButton();
		jpayFacility().facilityAdmin().clickIAPreviewButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementPreviewMessage(previewMessage);
		jpayFacility().facilityAdmin().clickIASendAnnouncementButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementSentSuccessMessage();
		
		Super_Announcement_147 = jpayFacility().facilityAdmin().getAnnouncementRequestNo();
		
	}

	/*********************************************************************************
	 * 
	 * Click on admin link,click on inmate announcement,click on send an inmate 
	 * announcement button,verify text,click on preview button and verify empty 
	 * letter error message,click on inmate radio button,click on preview button 
	 * and verify empty inmate id error message,enter inmate id,click on check 
	 * imate id button,verify inmate info displays,check facility staff members 
	 * checkbox,click on preview button and verify empty staff members email 
	 * error message, enter staff members email,click on source,write announcement,
	 * click on add date and add inmate name,click on preview button,verify preview 
	 * message, click on back button,click on preview button,verify preview message,
	 * click on send announcement button and verify sent announcement success message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-146::Design Steps"
			+ "::6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,"
			+ "31,32(Click on admin link,click on inmate announcement,click on send an "
			+ "inmate announcement button,verify text,click on preview button and verify "
			+ "empty letter error message,click on inmate radio button,click on preview button "
			+ "and verify empty inmate id error message,enter inmate id,click on imate id button,"
			+ "verify inmate info displays,check facility staff members checkbox,click on preview "
			+ "button and verify empty staff members email error message,enter staff members email,"
			+ "click on source,write announcement,click on add date and add inmate name,click on "
			+ "preview button,verify preview message,click on back button,click on preview "
			+ "button,verify preview message,click on send announcement button and verify "
			+ "sent announcement success message.)")
	public void sendInmateAnnouncement1AndVerifyForTC149() {

		jpayFacility().facilityAdmin().clickAdminLink();
		jpayFacility().facilityAdmin().clickInmateAnnouncementLink();
		jpayFacility().facilityAdmin().clickIASendAnInmateAnnouncementLink();
		jpayFacility().facilityAdmin().verifyIASendInmateAnnFillOutVerifyText(announcementFillOutText);
		
		jpayFacility().facilityAdmin().clickIAPreviewButton();
		jpayFacility().facilityAdmin().verifyIAEmptyLetterErrorMsg(emptyLetterErrorMsg);
		
		jpayFacility().facilityAdmin().clickIAInmateRadioButton();
		jpayFacility().facilityAdmin().clickIAPreviewButton();
		jpayFacility().facilityAdmin().verifyIAEmptyInmateIdErrorMsg(emptyInmateIdErrorMsg);
		
		jpayFacility().facilityAdmin().enterIAInsertInmateId(inmateId);
		jpayFacility().facilityAdmin().clickIACheckInmateButton();
		jpayFacility().facilityAdmin().verifyIAInmateInfoTextPresent();
		jpayFacility().facilityAdmin().checkIAFacilityStaffMembersCheckbox();
		jpayFacility().facilityAdmin().clickIAPreviewButton();
		jpayFacility().facilityAdmin().verifyIAEmptyStaffEmailErrorMsg(emptyStaffEmailErrorMsg);
		
		jpayFacility().facilityAdmin().enterIAFacilityStaffMembersEmail(facilityStaffEmail);
		jpayFacility().facilityAdmin().clickIASourceLink();
		jpayFacility().facilityAdmin().writeIAInmateAnnouncement(announcement1ForTC149);
		jpayFacility().facilityAdmin().clickIAAddDateButton();
		jpayFacility().facilityAdmin().clickIAAddInmateNameButton();
		jpayFacility().facilityAdmin().clickIAPreviewButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementPreviewMessage(previewMessage);
		jpayFacility().facilityAdmin().clickIABackButton();
		jpayFacility().facilityAdmin().clickIAPreviewButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementPreviewMessage(previewMessage);
		jpayFacility().facilityAdmin().clickIASendAnnouncementButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementSentSuccessMessage();
		
		Announcement1_149 = jpayFacility().facilityAdmin().getAnnouncementRequestNo();
		
	}

	/*********************************************************************************
	 * 
	 * Click on admin link,click on inmate announcement,click on send an inmate 
	 * announcement button,verify text,check facility staff members checkbox,
	 * enter staff members email,click on source,write announcement,click on 
	 * add date and add inmate name,click on preview button,verify preview message,
	 * click on back button,click on preview button,verify preview message and facility name,click on 
	 * send announcement button and verify sent announcement success message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-149::DesignSteps"
			+ "::33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52(Click on "
			+ "admin link,click on inmate announcement,click on send an inmate announcement "
			+ "button,verify text,check facility staff members checkbox,click on preview "
			+ "button and verify empty staff members email error message,enter staff members "
			+ "email,click on source,write announcement,click on add date and add inmate name,"
			+ "click on preview button,verify preview message,click on back button,click on "
			+ "preview button,verify preview message and facility name,click on send "
			+ "announcement button and verify sent announcement success message.)")
	public void sendInmateAnnouncement2AndVerifyForTC149() {

		jpayFacility().facilityAdmin().clickAdminLink();
		jpayFacility().facilityAdmin().clickInmateAnnouncementLink();
		jpayFacility().facilityAdmin().clickIASendAnInmateAnnouncementLink();
		jpayFacility().facilityAdmin().verifyIASendInmateAnnFillOutVerifyText(announcementFillOutText);
		
		jpayFacility().facilityAdmin().checkIAFacilityStaffMembersCheckbox();
		jpayFacility().facilityAdmin().clickIAPreviewButton();
		jpayFacility().facilityAdmin().verifyIAEmptyStaffEmailErrorMsg(emptyStaffEmailErrorMsg);
		
		jpayFacility().facilityAdmin().enterIAFacilityStaffMembersEmail(facilityStaffEmail);
		jpayFacility().facilityAdmin().clickIASourceLink();
		jpayFacility().facilityAdmin().writeIAInmateAnnouncement(announcement2ForTC149);
		jpayFacility().facilityAdmin().clickIAAddDateButton();
		jpayFacility().facilityAdmin().clickIAAddInmateNameButton();
		jpayFacility().facilityAdmin().clickIAPreviewButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementPreviewMessage(previewMessage);
		jpayFacility().facilityAdmin().clickIABackButton();
		jpayFacility().facilityAdmin().clickIAPreviewButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementPreviewMessage(previewMessage);
		jpayFacility().facilityAdmin().verifyIAFacilitiesName(facilitySuperUser);
		jpayFacility().facilityAdmin().clickIASendAnnouncementButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementSentSuccessMessage();
		
		Announcement2_149 = jpayFacility().facilityAdmin().getAnnouncementRequestNo();
		
	}

	
	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-146,147:: Design "
			+ "Steps::(Click sign out button .)")
	public void logoutSuperUser() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}

	/*********************************************************************************
	 * 
	 * Enter username,pincode,password and click login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-146,147::Design Steps"
			+ "::24,25,26,27(Enter username,pincode,password and click login button.)")
	public void loginConsolidateUser() {
		
		jpayFacility().facilityLogin().enterUsername(usernameConsolidate);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(password);
		jpayFacility().facilityLogin().clickLoginButton();
		
		
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

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-146::DesignSteps::"
			+ "28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45(Click on admin link,click "
			+ "on inmate announcement,click on send an inmate announcement button,verify "
			+ "text,check facility staff members checkbox,enter staff members email,click "
			+ "on source,write announcement,click on add date and add inmate name,click on "
			+ "preview button,verify preview message,click on back button,click on preview "
			+ "button,verify preview message,click on send announcement button and verify "
			+ "sent announcement success message.)")
	public void sendInmateAnnouncementConsolidateAndVerifyForTC146() {

		jpayFacility().facilityAdmin().clickAdminLink();
		jpayFacility().facilityAdmin().clickInmateAnnouncementLink();
		jpayFacility().facilityAdmin().clickIASendAnInmateAnnouncementLink();
		jpayFacility().facilityAdmin().verifyIASendInmateAnnFillOutVerifyText(announcementFillOutText);
		jpayFacility().facilityAdmin().checkIAFacilityStaffMembersCheckbox();
		jpayFacility().facilityAdmin().enterIAFacilityStaffMembersEmail(facilityStaffEmail);
		jpayFacility().facilityAdmin().clickIASourceLink();
		jpayFacility().facilityAdmin().writeIAInmateAnnouncement(announcementByFacilityConsolidateForTC146);
		jpayFacility().facilityAdmin().clickIAAddDateButton();
		jpayFacility().facilityAdmin().clickIAAddInmateNameButton();
		jpayFacility().facilityAdmin().clickIAPreviewButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementPreviewMessage(previewMessage);
		jpayFacility().facilityAdmin().clickIABackButton();
		jpayFacility().facilityAdmin().clickIAPreviewButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementPreviewMessage(previewMessage);
		jpayFacility().facilityAdmin().verifyIAFacilitiesName(facilityConsolidateUser);
		jpayFacility().facilityAdmin().clickIASendAnnouncementButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementSentSuccessMessage();
		
		Consolidate_Announcement_146 = jpayFacility().facilityAdmin().getAnnouncementRequestNo();
		
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

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-147::Design Steps"
			+ "::31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51(Click on "
			+ "admin link,click on inmate announcement,click on send an inmate announcement "
			+ "button,verify text,click on inmate radio button,enter inmate id,click check "
			+ "inmate button,verify inmate information,check facility staff members checkbox,"
			+ "enter staff members email,click on source,write announcement,click on add date "
			+ "and add inmate name,click on preview button,verify preview message,click on back "
			+ "button,click on preview button,verify preview message,click on send announcement "
			+ "button and verify sent announcement success message.)")
	public void sendInmateAnnouncementConsolidateAndVerifyForTC147() {

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
		jpayFacility().facilityAdmin().writeIAInmateAnnouncement(announcementByInmateConsolidateForTC147);
		jpayFacility().facilityAdmin().clickIAAddDateButton();
		jpayFacility().facilityAdmin().clickIAAddInmateNameButton();
		jpayFacility().facilityAdmin().clickIAPreviewButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementPreviewMessage(previewMessage);
		jpayFacility().facilityAdmin().clickIABackButton();
		jpayFacility().facilityAdmin().clickIAPreviewButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementPreviewMessage(previewMessage);
		jpayFacility().facilityAdmin().clickIASendAnnouncementButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementSentSuccessMessage();
		
		Consolidate_Announcement_147 = jpayFacility().facilityAdmin().getAnnouncementRequestNo();
		
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

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-148::DesignSteps::"
			+ "6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25(Click on admin link,"
			+ "click on inmate announcement,click on send an inmate announcement button,verify "
			+ "text,enter house name,check facility staff members checkbox,enter staff members "
			+ "email,click on source,write announcement,click on add date and add inmate name,"
			+ "click on preview button,verify preview message,click on back button,click on "
			+ "preview button,verify preview message,facility name and housing name,click on "
			+ "send announcement button and verify sent announcement success message.)")
	public void sendInmateAnnouncementSingleFacilityAndVerifyForTC148() {

		jpayFacility().facilityAdmin().clickAdminLink();
		jpayFacility().facilityAdmin().clickInmateAnnouncementLink();
		jpayFacility().facilityAdmin().clickIASendAnInmateAnnouncementLink();
		jpayFacility().facilityAdmin().verifyIASendInmateAnnFillOutVerifyText(announcementFillOutText);
		jpayFacility().facilityAdmin().enterIAHousing(house);
		jpayFacility().facilityAdmin().checkIAFacilityStaffMembersCheckbox();
		jpayFacility().facilityAdmin().enterIAFacilityStaffMembersEmail(facilityStaffEmail);
		jpayFacility().facilityAdmin().clickIASourceLink();
		jpayFacility().facilityAdmin().writeIAInmateAnnouncement(announcementSingleFacilityForTC148);
		jpayFacility().facilityAdmin().clickIAAddDateButton();
		jpayFacility().facilityAdmin().clickIAAddInmateNameButton();
		jpayFacility().facilityAdmin().clickIAPreviewButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementPreviewMessage(previewMessage);
		jpayFacility().facilityAdmin().clickIABackButton();
		jpayFacility().facilityAdmin().clickIAPreviewButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementPreviewMessage(previewMessage);
		jpayFacility().facilityAdmin().verifyIAFacilitiesName(facilityConsolidateUser);
		jpayFacility().facilityAdmin().verifyIAHousingName(house);
		jpayFacility().facilityAdmin().clickIASendAnnouncementButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementSentSuccessMessage();
		
		Announcement_148 = jpayFacility().facilityAdmin().getAnnouncementRequestNo();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on admin link,click on inmate announcement,click on view an 
	 * announcement button,enter from and check date,click on view button,
	 * verify the search results are present and status of the announcements.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-146::Design Steps"
			+ "::46,47,48,49,50,51,52,53,54,55(Click on admin link,click on inmate announcement,"
			+ "click on view an announcement button,enter from and check date,click on view "
			+ "button,verify the search results are present and status of the announcements.)")
	public void verifyAnnouncementStatusForTC146() {

		jpayFacility().facilityAdmin().clickAdminLink();
		jpayFacility().facilityAdmin().clickInmateAnnouncementLink();
		jpayFacility().facilityAdmin().pause(65000);
		jpayFacility().facilityAdmin().clickIAViewPreviousInmateAnnouncementLink();
		jpayFacility().facilityAdmin().enterIAAnnouncementStatusCheckFromToDate();
		jpayFacility().facilityAdmin().clickIAViewAnnouncementButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementStatusResultPresent(Super_Announcement_146);
		jpayFacility().facilityAdmin().verifyIAAnnouncementStatusResultPresent(Consolidate_Announcement_146);
		/*jpayFacility().facilityAdmin().verifyIAAnnouncementStatus(Super_Announcement_146, status);
		jpayFacility().facilityAdmin().verifyIAAnnouncementStatus(Consolidate_Announcement_146, status);*/
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on admin link,click on inmate announcement,click on view an 
	 * announcement button,enter from and check date,click on view button,
	 * verify the search results are present and status of the announcements.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-147::Design Steps"
			+ "::52,53,54,55,56,57,58,59,60(Click on admin link,click on inmate announcement,"
			+ "click on view an announcement button,enter from and check date,click on view "
			+ "button,verify the search results are present and status of the announcements.)")
	public void verifyAnnouncementStatusForTC147() {

		jpayFacility().facilityAdmin().clickAdminLink();
		jpayFacility().facilityAdmin().clickInmateAnnouncementLink();
		jpayFacility().facilityAdmin().clickIAViewPreviousInmateAnnouncementLink();
		jpayFacility().facilityAdmin().enterIAAnnouncementStatusCheckFromToDate();
		jpayFacility().facilityAdmin().clickIAViewAnnouncementButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementStatusResultPresent(Super_Announcement_147);
		jpayFacility().facilityAdmin().verifyIAAnnouncementStatusResultPresent(Consolidate_Announcement_147);
		jpayFacility().facilityAdmin().verifyIAAnnouncementStatus(Super_Announcement_147, status);
		jpayFacility().facilityAdmin().verifyIAAnnouncementStatus(Consolidate_Announcement_147, status);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on admin link,click on inmate announcement,click on view an 
	 * announcement button,enter from and check date,click on view button,
	 * verify the search results are present and status of the announcements.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "TestCases::WTC-148::Design Steps"
			+ "::26,27,28,29,30,31,32(Click on admin link,click on inmate announcement,"
			+ "click on view an announcement button,enter from and check date,click on view "
			+ "button,verify the search result is present and status of the announcement.)")
	public void verifyAnnouncementStatusForTC148() {

		jpayFacility().facilityAdmin().clickAdminLink();
		jpayFacility().facilityAdmin().clickInmateAnnouncementLink();
		jpayFacility().facilityAdmin().clickIAViewPreviousInmateAnnouncementLink();
		jpayFacility().facilityAdmin().enterIAAnnouncementStatusCheckFromToDate();
		jpayFacility().facilityAdmin().clickIAViewAnnouncementButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementStatusResultPresent(Announcement_148);
		//jpayFacility().facilityAdmin().verifyIAAnnouncementStatus(Announcement_148, status);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on admin link,click on inmate announcement,click on view an 
	 * announcement button,enter from and check date,click on view button,
	 * verify the search results are present and status of the announcements.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 14, description = "TestCases::WTC-149::Design Steps"
			+ "::53,54,55,56,57,58,59,60,61(Click on admin link,click on inmate announcement,"
			+ "click on view an announcement button,enter from and check date,click on view "
			+ "button,verify the search results are present and status of the announcements.)")
	public void verifyAnnouncementStatusForTC149() {

		jpayFacility().facilityAdmin().clickAdminLink();
		jpayFacility().facilityAdmin().clickInmateAnnouncementLink();
		jpayFacility().facilityAdmin().clickIAViewPreviousInmateAnnouncementLink();
		jpayFacility().facilityAdmin().enterIAAnnouncementStatusCheckFromToDate();
		jpayFacility().facilityAdmin().clickIAViewAnnouncementButton();
		jpayFacility().facilityAdmin().verifyIAAnnouncementStatusResultPresent(Announcement1_149);
		jpayFacility().facilityAdmin().verifyIAAnnouncementStatusResultPresent(Announcement2_149);
		/*jpayFacility().facilityAdmin().verifyIAAnnouncementStatus(Announcement1_149, status);
		jpayFacility().facilityAdmin().verifyIAAnnouncementStatus(Announcement2_149, status);*/
		
	}

	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 15, description = "TestCases::WTC-146,147,148,149::"
			+ "Design Steps::(Click sign out button .)")
	public void testEnd() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_146To149Test(data) };
	}
	
	
	
	
	public EmailWTC_146To149Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		password = data.get("password");
		usernameSuper = data.get("usernameSuper");
		usernameConsolidate = data.get("usernameConsolidate");
		pinCode = data.get("pinCode");
		inmateId = data.get("inmateId");
		announcementFillOutText = data.get("announcementFillOutText");
		facilityStaffEmail = data.get("facilityStaffEmail");
		announcementByFacilitySuperForTC146 = data.get("announcementByFacilitySuperForTC146");
		announcementByFacilityConsolidateForTC146 = data.get("announcementByFacilityConsolidateForTC146");
		announcementByInmateSuperForTC147 = data.get("announcementByInmateSuperForTC147");
		announcementByInmateConsolidateForTC147 = data.get("announcementByInmateConsolidateForTC147");
		announcementSingleFacilityForTC148 = data.get("announcementSingleFacilityForTC148");
		facilityConsolidateUser = data.get("facilityConsolidateUser");
		facilitySuperUser = data.get("facilitySuperUser");
		previewMessage = data.get("previewMessage");//
		status = data.get("status");
		house = data.get("house");
		emptyLetterErrorMsg = data.get("emptyLetterErrorMsg");
		emptyInmateIdErrorMsg = data.get("emptyInmateIdErrorMsg");
		emptyStaffEmailErrorMsg = data.get("emptyStaffEmailErrorMsg");
		announcement1ForTC149 = data.get("announcement1ForTC149");
		announcement2ForTC149 = data.get("announcement2ForTC149");
		
		
		
	}




}
