package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;

public class EmailWTC_57Test extends BaseTestObject{

	private String variation="";
	private String personalDetails="";
	private String username="";
	private String password="";
	private String adminSystem="";
	private String newSupportTicketText;
	private String inmateId;
	private String message1;
	private String successMessage;
	private String message2;
	private String message3;
	private String message4;
	private String facility1;
	private String mailAdminText;
	private String manageStampsPackagesText;
	private String facility2;
	private String packageName;
	private String packageType;
	private String packageDescription;
	private String numberOfLetter;
	private String promotionalStamps;
	private String expiraionDate;
	
	

	/************************************************************************************************
	 * 
	 * TestCase :: WTC57 - (User shall be able to Send support tickets/Add/Delete Stamps packages in staging)
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: WTC57
	 * Status :: Completed
	 * 
	 **************************************************************************************************/

	
	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details,
	 * enter username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-57 ::Design Steps"
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
	 * Click on Support outbound mail,click on new support ticket 
	 * and verify new support ticket text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-57 ::Design Steps"
			+ "::7,8,9(Click on Support outbound mail,click on new support ticket and "
			+ "verify new support ticket text.)")
	public void navigateToNewSupportTicket() {
		
		jpayStaging().stagingHome().clickSupportOutboundMail();
		jpayStaging().supportOutboundMail().clickNewSupportTicketLink();
		jpayStaging().supportOutboundMail().verifyNewSupportTicketText(newSupportTicketText);
		jpayStaging().supportOutboundMail().clickSuppTicketLocateInmateButton();
		
	}
	
	/*********************************************************************************
	 * 
	 * Select facility,enter inmateid and click lookat inmate button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-57 ::Design Steps"
			+ "::10,11,12(Select facility,enter inmateid and click lookat inmate button.)")
	public void lookatInmateByFacilityAndId() {
		
		
		jpayStaging().supportOutboundMail().selectSupportTicketsFacility(facility1);
		jpayStaging().supportOutboundMail().enterSupportTicketInmateId(inmateId);
		jpayStaging().supportOutboundMail().clickSuppTicketLocateInmateButton();
		
	}
	
	
	
	/*********************************************************************************
	 * 
	 * Enter support ticket message,check allow inmate to reply checkbox,
	 * click on send ticket button and verify success message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-57 ::Design Steps"
			+ "::13,14,15,16(Enter support ticket message,check allow inmate to reply "
			+ "checkbox,click on send ticket button and verify success message.)")
	public void sendSupportTicketAndVerify1() {
	
		jpayStaging().supportOutboundMail().enterSupportTicketMessage(message1);
		jpayStaging().supportOutboundMail().checkAllowInmateToReplybox();
		jpayStaging().supportOutboundMail().clickSendSupportTicketButton();
		jpayStaging().supportOutboundMail().verifySupportTicketSuccessMsg(successMessage);
	}
	

	/*********************************************************************************
	 * 
	 * Click on lookat inmate button,Enter support ticket message,
	 * check allow inmate to reply checkbox,click on send ticket 
	 * button and verify success message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-57 ::Design Steps"
			+ "::17,18,19,20,21(Click on lookat inmate button,Enter support ticket "
			+ "message,check allow inmate to reply checkbox,click on send ticket "
			+ "button and verify success message.)")
	public void sendSupportTicketAndVerify2() {
	
		jpayStaging().supportOutboundMail().clickSuppTicketLocateInmateButton();
		jpayStaging().supportOutboundMail().enterSupportTicketMessage(message2);
		jpayStaging().supportOutboundMail().checkAllowInmateToReplybox();
		jpayStaging().supportOutboundMail().clickSendSupportTicketButton();
		jpayStaging().supportOutboundMail().verifySupportTicketSuccessMsg(successMessage);
	}
	

	/*********************************************************************************
	 * 
	 * Click on lookat inmate button,Enter support ticket message,
	 * check allow inmate to reply checkbox,click on send ticket 
	 * button and verify success message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-57 ::Design Steps"
			+ "::22,23,24,25,26(Click on lookat inmate button,Enter support ticket "
			+ "message,check allow inmate to reply checkbox,click on send ticket "
			+ "button and verify success message.)")
	public void sendSupportTicketAndVerify3() {
	
		jpayStaging().supportOutboundMail().clickSuppTicketLocateInmateButton();
		jpayStaging().supportOutboundMail().enterSupportTicketMessage(message3);
		jpayStaging().supportOutboundMail().checkAllowInmateToReplybox();
		jpayStaging().supportOutboundMail().clickSendSupportTicketButton();
		jpayStaging().supportOutboundMail().verifySupportTicketSuccessMsg(successMessage);
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on lookat inmate button,Enter support ticket message,
	 * check allow inmate to reply checkbox,click on send ticket 
	 * button and verify success message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-57 ::Design Steps"
			+ "::27,28,29,30,31(Click on lookat inmate button,Enter support ticket "
			+ "message,check allow inmate to reply checkbox,click on send ticket "
			+ "button and verify success message.)")
	public void sendSupportTicketAndVerify4() {
	
		jpayStaging().supportOutboundMail().clickSuppTicketLocateInmateButton();
		jpayStaging().supportOutboundMail().enterSupportTicketMessage(message4);
		jpayStaging().supportOutboundMail().checkAllowInmateToReplybox();
		jpayStaging().supportOutboundMail().clickSendSupportTicketButton();
		jpayStaging().supportOutboundMail().verifySupportTicketSuccessMsg(successMessage);
	}
	
	
	
	/*********************************************************************************
	 * 
	 * Click on Administration link,click on inbound mail administration and verify mail administration text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-57 ::Design Steps"
			+ "::32,33,34(Click on Administration link,click on inbound mail "
			+ "administration and verify mail administration text.)")
	public void navigateToInboundMailAdministration() {
	
		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickInboundMailAdminstartionLink();
		jpayStaging().stagingAdmin().verifyMailAdministartionText(mailAdminText);
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on manage stamps pakages,verify manage stamps 
	 * packages text and select facility.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-57 ::Design Steps"
			+ "::37,38,39(Click on manage stamps pakages,verify manage stamps packages "
			+ "text and select facility.)")
	public void clickStampsPackagesAndSelectFacility() {
	
		jpayStaging().stagingAdmin().clickStampsPakagesLink();
		jpayStaging().stagingAdmin().verifyMangeStampsPackagesText(manageStampsPackagesText);
		jpayStaging().stagingAdmin().selectStampsMenageFacility(facility2);
	}
	

	/*********************************************************************************
	 * 
	 * Check delete checkbox of desired stamps package,click deleted 
	 * selected package and verify package deleted.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-57 ::Design Steps"
			+ "::40,41,42(Check delete checkbox of desired stamps package,click deleted "
			+ "selected package and verify package deleted.)")
	public void deleteStampsPackagesAndVerify() {
	
		jpayStaging().stagingAdmin().checkStampsPackagesDeleteBox(packageName);
		jpayStaging().stagingAdmin().clickDeleteSelectedPackages();
		jpayStaging().stagingAdmin().verifyDeletedStampsPackageAbsent(packageName);
	}

	/*********************************************************************************
	 * 
	 * Click add new packages,enter package name,type,description,no. of letters,
	 * promotional stamps,expiration date,click add button and verify new package added.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-57 ::Design Steps"
			+ "::43,44,45,46,47,48,49,50,51(Click add new packages,enter package name,"
			+ "type,description,no. of letters,promotional stamps,expiration date,"
			+ "click add button and verify new package added.)")
	public void addStampsPackagesAndVerify() {
	
		jpayStaging().stagingAdmin().clickAddNewPackages();
		jpayStaging().stagingAdmin().enterPackageName(packageName);
		jpayStaging().stagingAdmin().enterPackageType(packageType);
		jpayStaging().stagingAdmin().enterPackageDescription(packageDescription);
		jpayStaging().stagingAdmin().enterPackageNoLetters(numberOfLetter);
		jpayStaging().stagingAdmin().enterPackagePromotionalStamps(promotionalStamps);
		jpayStaging().stagingAdmin().enterPackageExpiration(expiraionDate);
		jpayStaging().stagingAdmin().clickPackagesAddButton();
		jpayStaging().stagingAdmin().verifyAddedStampsPackagePresent(packageName);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-57 ::Design Steps"
			+ "::52,53(Click sign out button and verify Login details.)")
	public void endTest() {
		
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		
	}
	
	
	
	
	
	
	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_57Test(data) };
	}
	
	
	public EmailWTC_57Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		personalDetails = data.get("personalDetails");
		username = data.get("username");
		password = data.get("password");
		adminSystem = data.get("adminSystem");
		newSupportTicketText = data.get("newSupportTicketText");
		facility1 = data.get("facility1");
		inmateId = data.get("inmateId");
		message1 = data.get("message1");
		message2 = data.get("message2");
		message3 = data.get("message3");
		message4 = data.get("message4");
		successMessage = data.get("successMessage");
		mailAdminText = data.get("mailAdminText");
		manageStampsPackagesText = data.get("manageStampsPackagesText");
		facility2 = data.get("facility2");
		packageName = data.get("packageName");
		packageType = data.get("packageType");
		packageDescription = data.get("packageDescription");
		numberOfLetter = data.get("numberOfLetter");
		promotionalStamps = data.get("promotionalStamps");
		expiraionDate = data.get("expiraionDate");
		
		
	}

}
