package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;



public class EmailWTC_119To121Test extends BaseTestObject{
	
	
	
	public String username = "";
	public String password = "";
	private String variation;
	private String warnMsg;
	private String conMsg;
	private String pinCode;
	private String passwordFacility;
	private String emailMsgImage;
	private String filenamePng;
	private String letterStatusImage;
	private String letterStatusReleased;
	private String fileNamePDF;
	private String customerName;
	private String customerId;
	private String announcementFillOutText;
	private String inmateId;
	private String facilityStaffEmail;
	private String announcement;
	private String previewMessage;
	private String status;
	
	
	public static String Facility_Username ="";
	public static String Confirmation_Number_Image119 ="";
	public static String Confirmation_Number_Image120 ="";
	private static String PDF_Content ;
	private static String Inmate_Name;
	private static String Inmate_Id;
	private static String Facility_Announcement_No;
	private static String Inmate_Announcement_No;
	
	/************************************************************************************************
	 * 
	 * TestCase :: WTC119To121 - (119.Inmate & Sender info on preview PDF Page must be right
	 *                             120.Send letter and verify status with consolidate user in facility
	 *                              121.User shall be able to send Inmate Announcement by Facility/Inmate )
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: WTC119To121
	 * Status :: Completed
	 * 
	 **************************************************************************************************/


	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-119,120 :: Design "
			+ "Steps::1,2(Click on login link and verify page title.)")
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

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-119,120 :: Design "
			+ "Steps::3,4,5,6(Enter username,password,click login button and "
			+ "verify title of the page.)")
	public void loginAndVerify1() {

		jpayEmail().login().enterUsername(username);
		jpayEmail().login().enterPassword(password);
		jpayEmail().login().clickLoginButton();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
	}
	
	/*********************************************************************************
	 * 
	 * Select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-119,120 :: Design "
			+ "Steps::7,8(Select random inmate and click on email link.)")
	public void selectInmateAndClickEmailTab1() {

		jpayEmail().login().selectRandomInmate();
		Facility_Username = jpayEmail().login().setFacilityUsername();
		Inmate_Name =jpayEmail().login().getInmateName(); 
		Inmate_Id =jpayEmail().login().getInmateId();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		
	}
	

	/*********************************************************************************
	 * 
	 * Enter email message in the message body,click attach ecard,
	 * select random ecard category,click on continue button,click 
	 * send button,verify email warning message,click on continue 
	 * button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-119 :: Design "
			+ "Steps::9,10,11,12,13,14,15,16(Enter filter email message in the "
			+ "message body,attach image,click on continue button,"
			+ "click send button,verify email warning message,check the used stamps.)")
	public void writeEmailAndVerifyForTC119() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsgImage);
		jpayEmail().email().clickAttachImage();
		jpayEmail().email().clickChooseFile(PageConstant.TEST_FILE_PATH+filenamePng);
		//jpayEmail().email().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenamePng);
		jpayEmail().email().clickAttachButton();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_2);//1 stamp(s) to send this letter
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description =  "TestCases::WTC-119 ::DesignSteps"
			+ "::17,18,19(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailAndVerifyForTC119() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		Confirmation_Number_Image119 = jpayEmail().email().getConfirmationNumber();
		
	}


	/*********************************************************************************
	 * 
	 * Enter email message in the message body,click attach ecard,
	 * select random ecard category,click on continue button,click 
	 * send button,verify email warning message,click on continue 
	 * button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-120 :: Design "
			+ "Steps::9,10,11,12,13,14,15,16(Enter filter email message in the message body,"
			+ "attach image,click on continue button,"
			+ "click send button,verify email warning message,check the used stamps.)")
	public void writeEmailAndVerifyForTC120() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsgImage);
		jpayEmail().email().clickAttachImage();
		jpayEmail().email().clickChooseFile(PageConstant.TEST_FILE_PATH+filenamePng);
		//jpayEmail().email().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenamePng);
		jpayEmail().email().clickAttachButton();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_2);//1 stamp(s) to send this letter
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description =  "TestCases::WTC-120::DesignSteps"
			+ "::17,18,19(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailAndVerifyForTC120() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		Confirmation_Number_Image120 = jpayEmail().email().getConfirmationNumber();
		
	}



	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-119,120:: Design "
			+ "Steps::20,21,22(Click on Home link,verify page title and click logout.)")
	public void logoutFromWWW() {
		
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
		jpayEmail().login().clickLogoutButton();
		
	}
	
	/*********************************************************************************
	 * 
	 * Enter username,pincode,password,click login button and verify Facility 
	 * system and Communications tab is absent.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-119,120,121 :: Design "
			+ "Steps::23,24,25,26,27(Navigate to facility site,enter username,pincode,"
			+ "password and click on login button .)")
	public void loginToFacilityAndVerify() {
		
		jpayFacility().facilityLogin().loadURL(envUrlFacility);
		jpayFacility().facilityLogin().enterUsername(Facility_Username);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(passwordFacility);
		jpayFacility().facilityLogin().clickLoginButton();
		
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on email link,click on search link,select search by letter id,
	 * wait for the status update,enter confirmation number,click on go button,
	 * click on view link and verify the letter status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-119:: Design Steps"
			+ "::28,29,30,31,32,33,34,35(Click on email link,click on search link,select "
			+ "search by letter id,wait for the status update,enter confirmation number,"
			+ "click on go button,click on view link and verify the letter status.)")
	public void searchMailAndVerifyStatusForTC119() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().pause(180000);
		jpayFacility().facilityEmail().enterSearchContent(Confirmation_Number_Image119);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusImage);
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on approve,click on mail tab link,click on 
	 * search,select search by letter id,enter letter id,click on go button,
	 * verify snap ,n send icon present,click on view and verify the letter status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-119 :: Design "
			+ "Steps::36,37,38,39,40,41,42,43,44(Click on approve,click on mail tab "
			+ "link,click on search,select search by letter id,enter letter id,click "
			+ "on go button,verify snap ,n send icon present,click on view and "
			+ "verify the letter status.)")
	public void letterApproveAndVerifyForTC119() {
		
		jpayFacility().facilityEmail().clickLetterApproveButton();
		jpayFacility().facilityEmail().pause(60000);
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().enterSearchContent(Confirmation_Number_Image119);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusReleased);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click letter print button,download pdf,verify pdf content,
	 * delete pdf and navigate browser back.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =12, description = "TestCases::WTC-119 :: Design "
			+ "Steps::45,46,47,48,49,50,51,52,53,54(Click letter print button,"
			+ "download pdf,verify pdf content,delete pdf and navigate browser back.)")
	public void printLetterAndVerifyPdfForTC119() {
		
		jpayFacility().facilityEmail().clickLetterPrintButton();
		jpayFacility().facilityEmail().downloadPreviewPDF(fileNamePDF);
		PDF_Content=jpayFacility().facilityEmail().getPDFContent(PageConstant.TEST_FILE_PATH+fileNamePDF);
		jpayFacility().facilityEmail().verifyPdfContentPresent(PDF_Content, customerName);
		jpayFacility().facilityEmail().verifyPdfContentPresent(PDF_Content, customerId);
		jpayFacility().facilityEmail().verifyPdfContentPresentToUpperCase(PDF_Content, Inmate_Name);
		jpayFacility().facilityEmail().verifyPdfContentPresent(PDF_Content, Inmate_Id);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on email link,click on search link,select search by letter id,
	 * wait for the status update,enter confirmation number,click on go button,
	 * click on view link and verify the letter status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "TestCases::WTC-120:: Design Steps"
			+ "::28,29,30,31,32,33,34,35(Click on email link,click on search link,select "
			+ "search by letter id,wait for the status update,enter confirmation number,"
			+ "click on go button,click on view link and verify the letter status.)")
	public void searchMailAndVerifyStatusForTC120() {
		
		jpayFacility().facilityEmail().navigateBrowserBack();
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().enterSearchContent(Confirmation_Number_Image120);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusImage);
		
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

	@Test(enabled = true, priority = 14, description = "TestCases::WTC-121::Design Steps"
			+ "::6,7,8,9,10,11,12,13,14,15,16,17,18,19(Click on admin link,click "
			+ "on inmate announcement,click on send an inmate announcement button,verify "
			+ "text,check facility staff members checkbox,enter staff members email,click "
			+ "on source,write announcement,click on add date and add inmate name,click on "
			+ "preview button,verify preview message,click on send announcement button "
			+ "and verify sent announcement success message.)")
	public void sendAnnouncementByFacilityAndVerifyForTC121() {

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

	@Test(enabled = true, priority = 15, description = "TestCases::WTC-121::Design Steps"
			+ "::20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37(Click on "
			+ "admin link,click on inmate announcement,click on send an inmate announcement "
			+ "button,verify text,click on inmate radio button,enter inmate id,click check "
			+ "inmate button,verify inmate information,check facility staff members checkbox,"
			+ "enter staff members email,click on source,write announcement,click on add date "
			+ "and add inmate name,click on preview button,verify preview messageclick on "
			+ "send announcement button and verify sent announcement success message.)")
	public void sendAnnouncementByInmateAndVerifyForTC121() {

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

	@Test(enabled = true, priority = 16, description = "TestCases::WTC-121::Design Steps"
			+ "::38,39,40,41,42,43,44,45,46,47(Click on admin link,click on inmate announcement,"
			+ "click on view an announcement button,enter from and check date,click on view "
			+ "button,verify the search results are present and status of the announcements.)")
	public void verifyAnnouncementStatusForTC121() {

		jpayFacility().facilityAdmin().clickAdminLink();
		jpayFacility().facilityAdmin().clickInmateAnnouncementLink();
		jpayFacility().facilityAdmin().pause(60000);
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

	@Test(enabled = true, priority = 17, description = "TestCases::WTC-119,120,121:: Design "
			+ "Steps::(Click sign out button .)")
	public void testEnd() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}
	



	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_119To121Test(data) };
	}
	
	
	public EmailWTC_119To121Test(Map<String, String> data) {
		super(data);
		
		username = data.get("username");
		password =data.get("password");
		variation = data.get("variation");
		pinCode = data.get("pinCode");
		passwordFacility = data.get("passwordFacility");
		warnMsg = data.get("warnMsg");
		conMsg = data.get("conMsg");
		emailMsgImage = data.get("emailMsgImage");
		filenamePng = data.get("filenamePng");
		inmateId = data.get("inmateId");
		announcementFillOutText = data.get("announcementFillOutText");//
		facilityStaffEmail = data.get("facilityStaffEmail");
		announcement = data.get("announcement");
		previewMessage = data.get("previewMessage");//
		status = data.get("status");
		customerName = data.get("customerName");
		customerId = data.get("customerId");
		fileNamePDF = data.get("fileNamePDF");
		letterStatusReleased = data.get("letterStatusReleased");
		letterStatusImage = data.get("letterStatusImage");
		
	}

	


}
