package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;

public class EmailWTC_64Test extends BaseTestObject{

	private String variation="";
	private String personalDetails="";
	private String username="";
	private String password="";
	private String adminSystem="";
	private String replyMessage2;
	private String replyMessage1;
	private String facility;
	private String inmateId;
	
	
	public static String Inmate_Name;
	public static String Inmate_ID;
	public static String Letter_ID;
	public static String Letter_Content;
	

	/************************************************************************************************
	 * 
	 * TestCase :: WTC64 - (User shall be able Unhandled &  Handled Inmates Issues (Replay/Delete))
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: WTC64
	 * Status :: Completed
	 * 
	 **************************************************************************************************/

	
	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details,
	 * enter username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-64 ::Design Steps"
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
	 * Click on Support outbound mail,click unhandled inmate issue link,
	 * enter from an to date for search ticket and click go button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-64 ::Design Steps"
			+ "::7,8,9,10(Click on Support outbound mail,click unhandled inmate issue "
			+ "link,enter from an to date for search ticket and click go button.)")
	public void searchUnhandledIssuesAndGetInfo1() {
		
		jpayStaging().stagingHome().clickSupportOutboundMail();
		jpayStaging().supportOutboundMail().clickUnhandledInmatesIssuesLink();
		jpayStaging().supportOutboundMail().searchUnhandledIssuesByEnterFromToDate();
		jpayStaging().supportOutboundMail().clickSuppUnhandledIssuesGoButton();
		
		Inmate_Name=jpayStaging().supportOutboundMail().getInmateName();
		Inmate_ID=jpayStaging().supportOutboundMail().getInmateId();
		Letter_ID=jpayStaging().supportOutboundMail().getLetterId();
		Letter_Content=jpayStaging().supportOutboundMail().getLetterContent();
	}
	
	/*********************************************************************************
	 * 
	 * Click on reply button and verify inmate name,id,letter id and content.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-64 ::Design Steps"
			+ "::11,12,13,14,15(Click on reply button and verify inmate name,id,"
			+ "letter id and content.)")
	public void clickReplyUnhandledIssuesAndVerify1() {
		
		
		jpayStaging().supportOutboundMail().clickUnhandledInmatesIssuesReplyButton(Letter_ID);
		jpayStaging().supportOutboundMail().verifyUnhandledIssuesInmateName(Inmate_Name);
		jpayStaging().supportOutboundMail().verifyUnhandledIssuesInmateId(Inmate_ID);
		jpayStaging().supportOutboundMail().verifyUnhandledIssuesLetterId(Letter_ID);
		jpayStaging().supportOutboundMail().verifyUnhandledIssuesLetterContent(Letter_Content);
		
	}
	
	/*********************************************************************************
	 * 
	 * Enter reply message,click on back button and verify letter present in the unhandled inmate issues table.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-64 ::Design Steps"
			+ "::16,17,18(Enter reply message,click on back button and verify letter "
			+ "present in the unhandled inmate issues table.)")
	public void clickBackAndVerify1() {
		
		
		jpayStaging().supportOutboundMail().enterReplyUnhandledInmateIssue(replyMessage1);
		jpayStaging().supportOutboundMail().clickUnhandledIssuesBackButton();
		jpayStaging().supportOutboundMail().verifyUnhandledIssuesLetterPresent(Letter_ID);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on reply button and verify inmate name,id,letter id and content,
	 * enter reply message,click on send reply button,letter is absent in 
	 * the unhandled inmate issues table,click handled inmate issue link, 
	 * enter from an to date for search ticket,click go button and verify 
	 * letter present in the handled inmate issues table.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-64 ::Design Steps"
			+ "::19,20,21,23,24,25,26,27,28,29,30,31,32(Click on reply button and verify "
			+ "inmate name,id,letter id and content,enter reply message,click on send "
			+ "reply button,letter is absent in the unhandled inmate issues table,click "
			+ "handled inmate issue link, enter from an to date for search ticket,click "
			+ "go button and verify letter present in the handled inmate issues table.)")
	public void sendReplyAndVerify() {
		
		jpayStaging().supportOutboundMail().clickUnhandledInmatesIssuesReplyButton(Letter_ID);
		jpayStaging().supportOutboundMail().verifyUnhandledIssuesInmateName(Inmate_Name);
		jpayStaging().supportOutboundMail().verifyUnhandledIssuesInmateId(Inmate_ID);
		jpayStaging().supportOutboundMail().verifyUnhandledIssuesLetterId(Letter_ID);
		jpayStaging().supportOutboundMail().verifyUnhandledIssuesLetterContent(Letter_Content);
		jpayStaging().supportOutboundMail().enterReplyUnhandledInmateIssue(replyMessage1);
		jpayStaging().supportOutboundMail().clickUnhandledIssuesSendReplyButton();
		jpayStaging().supportOutboundMail().verifyUnhandledIssuesLetterAbsent(Letter_ID);
		/*jpayStaging().supportOutboundMail().clickHandledInmatesIssuesLink();
		jpayStaging().supportOutboundMail().searchUnhandledIssuesByEnterFromToDate();
		jpayStaging().supportOutboundMail().pause(90000);
		jpayStaging().supportOutboundMail().clickSuppUnhandledIssuesGoButton();
		jpayStaging().supportOutboundMail().verifyHandledIssuesLetterPresent(Letter_ID);*/
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click unhandled inmate issue link,
	 * enter from an to date for search ticket and click go button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-64 ::Design Steps"
			+ "::33,34,35(Click unhandled inmate issue "
			+ "link,enter from an to date for search ticket and click go button.)")
	public void searchUnhandledIssuesAndGetInfo2() {
		
		jpayStaging().supportOutboundMail().clickUnhandledInmatesIssuesLink();
		jpayStaging().supportOutboundMail().searchUnhandledIssuesByEnterFromToDate();
		jpayStaging().supportOutboundMail().clickSuppUnhandledIssuesGoButton();
		
		Letter_ID=jpayStaging().supportOutboundMail().getLetterId();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on delete button and verify letter is absent in the unhandled inmate issues table.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-57 ::Design Steps"
			+ "::36,37(Click on delete button and verify letter is absent in the "
			+ "unhandled inmate issues table.)")
	public void deleteUnhandledSupportTicketAndVerify() {
		
		jpayStaging().supportOutboundMail().clickUnhandledInmatesIssuesDeleteButton(Letter_ID);
		jpayStaging().supportOutboundMail().verifyUnhandledIssuesLetterAbsent(Letter_ID);
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Select search by inmate id,select agency,enter inmate id and click on go button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-64 ::Design Steps"
			+ "::38,39,40,41(Select search by inmate id,select agency,enter inmate id "
			+ "and click on go button.)")
	public void searchUnhandledIssuesAndGetInfoByInmateid() {
		
		jpayStaging().supportOutboundMail().selectSearchStartConversationByInmateid();
		jpayStaging().supportOutboundMail().selectUnhandledInmateIssuesAgency(facility);
		jpayStaging().supportOutboundMail().enterUnhandledIssuesInmateId(inmateId);
		jpayStaging().supportOutboundMail().clickSuppUnhandledIssuesGoButton();
		
		Inmate_Name=jpayStaging().supportOutboundMail().getInmateName();
		Letter_ID=jpayStaging().supportOutboundMail().getLetterId();
		Letter_Content=jpayStaging().supportOutboundMail().getLetterContent();
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on reply button and verify inmate name,id,letter id and content.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-64 ::Design Steps"
			+ "::42,43,44,45,46(Click on reply button and verify inmate name,id,"
			+ "letter id and content.)")
	public void clickReplyUnhandledIssuesAndVerify2() {
		
		
		jpayStaging().supportOutboundMail().clickUnhandledInmatesIssuesReplyButton(Letter_ID);
		jpayStaging().supportOutboundMail().verifyUnhandledIssuesInmateName(Inmate_Name);
		jpayStaging().supportOutboundMail().verifyUnhandledIssuesInmateId(inmateId);
		jpayStaging().supportOutboundMail().verifyUnhandledIssuesLetterId(Letter_ID);
		jpayStaging().supportOutboundMail().verifyUnhandledIssuesLetterContent(Letter_Content);
		
	}
	/*********************************************************************************
	 * 
	 * Enter reply message,click on back button and verify letter present in the unhandled inmate issues table.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-64 ::Design Steps"
			+ "::47,48,49(Enter reply message,click on back button and verify letter "
			+ "present in the unhandled inmate issues table.)")
	public void clickBackAndVerify2() {
		
		
		jpayStaging().supportOutboundMail().enterReplyUnhandledInmateIssue(replyMessage2);
		jpayStaging().supportOutboundMail().clickUnhandledIssuesBackButton();
		jpayStaging().supportOutboundMail().verifyUnhandledIssuesLetterPresent(Letter_ID);
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-64 ::Design Steps"
			+ "::50,51(Click sign out button and verify Login details.)")
	public void endTest() {
		
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		
	}
	
	
	
	
	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_64Test(data) };
	}
	
	
	public EmailWTC_64Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		personalDetails = data.get("personalDetails");
		username = data.get("username");
		password = data.get("password");
		adminSystem = data.get("adminSystem");
		replyMessage1 = data.get("replyMessage1");
		replyMessage2 = data.get("replyMessage2");
		facility = data.get("facility");
		inmateId = data.get("inmateId");
		
		
	}

}
