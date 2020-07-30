package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC70 - (User shall be able to generate the reports)
 * Author :: shasan(Shahriar Hasan) , Date :: 07/15/2019
 * DataFile :: Email.xlsx , DataSheet :: WTC70
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_70Test extends BaseTestObject{
	

	private String username;
	private String pinCode;
	private String variation;
	private String password;
	private String mailAuditingNoActionsText;
	private String reportPrintingText;
	private String noLetterText;
	

	


	/*********************************************************************************
	 * 
	 * Insert STATE name in search box,Insert inmate ID in search box and Click
	 * on next image button
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-70::Design Steps"
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
	 * Click on mail tab link,click on mail auditing link,select mail type,
	 * enter search date,click on generate button,select pages to show,click 
	 * on go button and verify Number of Actions and Number of Actions text. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-70::Design Steps"
			+ "::6,7,8,9,10,11,12,13,14,15(Click on mail tab link,click on mail auditing "
			+ "link,select mail type,enter search date,click on generate button,select "
			+ "pages to show,click on go button and verify Number of Actions and "
			+ "Number of Actions text.)")
	public void mailAuditingReportAndVerify() {

		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickMailAuditingLink();
		jpayFacility().facilityEmail().selectMailAuditingMailType();
		jpayFacility().facilityEmail().searchMailAuditingMailFromToDate();
		jpayFacility().facilityEmail().clickMailAuditingGenerateButton();
		jpayFacility().facilityEmail().selectMailAuditingPageToShow();
		jpayFacility().facilityEmail().clickMailAuditingGoButton();
		jpayFacility().facilityEmail().verifyMailAuditingNoOfActionsText(mailAuditingNoActionsText);
		jpayFacility().facilityEmail().verifyMailAuditingTotalNumberOfActions();
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on mail graphical reports link,check include archived data,click 
	 * on show button,wait for report to generate and verify report printing text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-70::Design Steps"
			+ "::16,17,18,19,20(Click on mail graphical reports link,check include "
			+ "archived data,click on show button,wait for report to generate and "
			+ "verify report printing text.)")
	public void mailGraphicalReportsAndVerify() {

		jpayFacility().facilityEmail().clickMailGraphicalReportsLink();
		jpayFacility().facilityEmail().checkMailGraphicalReportIncludeArchivedData();
		jpayFacility().facilityEmail().clickMailGraphicalReportsShowButton();
		jpayFacility().facilityEmail().pause(30000);
		jpayFacility().facilityEmail().verifyMailGraphicalViewReportPrintingText(reportPrintingText);
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on inbound mail operational report link,enter search date,check 
	 * archived checkbox,click on view button,wait for report to generate,
	 * verify number of letters and number of letters text and click export 
	 * to file button to download file.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-70::Design Steps"
			+ "::21,22,23,24,25,26,27,28,29(Click on inbound mail operational report link,"
			+ "enter search date,check archived checkbox,click on view button,wait for "
			+ "report to generate,verify number of letters and number of letters text "
			+ "and click export to file button to download file.)")
	public void inboundMailOperationalReportAndVerify() {

		jpayFacility().facilityEmail().clickInboundMailOperationalReportLink();
		jpayFacility().facilityEmail().searchInboundMailOperationalReportFromToDate();
		jpayFacility().facilityEmail().checkInboundMailOperationalArchivedData();
		jpayFacility().facilityEmail().clickInboundMailOperationalViewButton();
		jpayFacility().facilityEmail().pause(30000);
		jpayFacility().facilityEmail().verifyInboundMailOperationalNoOfLettersText(noLetterText);
		jpayFacility().facilityEmail().verifyInboundMailOperationalTotalNumberOfLetters();
		jpayFacility().facilityEmail().clickInboundMailOperationalLetterExportFileButton();
		
	}


	/*********************************************************************************
	 * 
	 * Click on mail operational report link,enter search date,check  archived 
	 * checkbox,click on view button,wait for report to generate,verify and 
	 * click export to file button to download file.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-70::Design Steps"
			+ "::30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48(Click on mail "
			+ "operational report link,enter search date,check  archived checkbox,click "
			+ "on view button,wait for report to generate,verify and click export to "
			+ "file button to download file.)")
	public void mailOperationalReportAndVerify() {

		jpayFacility().facilityEmail().clickMailOperationalReportLink();
		jpayFacility().facilityEmail().searchMailOperationalReportFromToDate();
		jpayFacility().facilityEmail().checkMailOperationalArchivedData();
		jpayFacility().facilityEmail().clickMailOperationalViewButton();
		jpayFacility().facilityEmail().pause(30000);
		jpayFacility().facilityEmail().verifyMailOperationalInboundLettersValueText();
		jpayFacility().facilityEmail().verifyMailOperationalInboundLettersValue();
		jpayFacility().facilityEmail().verifyMailOperationalTotalInboundLettersText();
		jpayFacility().facilityEmail().verifyMailOperationalTotalInboundLetters();
		jpayFacility().facilityEmail().verifyMailOperationalTotalInboundPostageBoughtText();
		jpayFacility().facilityEmail().verifyMailOperationalTotalInboundPostageBought();
		jpayFacility().facilityEmail().verifyMailOperationalTotalOutboundLettersText();
		jpayFacility().facilityEmail().verifyMailOperationalTotalOutboundLetters();
		jpayFacility().facilityEmail().verifyMailOperationalOutboundLettersValueText();
		jpayFacility().facilityEmail().verifyMailOperationalOutboundLettersValue();
		jpayFacility().facilityEmail().verifyMailOperationalTotalOutboundPostageBoughtText();
		jpayFacility().facilityEmail().verifyMailOperationalTotalOutboundPostageBought();
		jpayFacility().facilityEmail().clickMailOperationalExportFileButton();
		
	}
	
	


	/*********************************************************************************
	 * 
	 * Click on stamps usage report link,enter search date,check archived 
	 * checkbox,click on view button,wait for report to generate and verify,
	 * click on 1st created date,wait for report to generate and verify.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-70::Design Steps"
			+ "::49,50,51,52,53,54,56,57,58,59,60,61,62,63,64,65,66,67(Click on stamps "
			+ "usage report link,enter search date,check archived checkbox,click on view "
			+ "button,wait for report to generate and verify,click on 1st created date,"
			+ "wait for report to generate and verify.)")
	public void stampUsageReportAndVerify() {

		jpayFacility().facilityEmail().clickStampUsageReportLink();
		jpayFacility().facilityEmail().searchStampUsageReportFromToDate();
		jpayFacility().facilityEmail().checkStampUsageReportArchivedData();
		jpayFacility().facilityEmail().clickStampUsageReportViewButton();
		jpayFacility().facilityEmail().pause(30000);
		jpayFacility().facilityEmail().verifyStampUsageNumOfTextPagesText();
		jpayFacility().facilityEmail().verifyStampUsageNumOfTextPages();
		jpayFacility().facilityEmail().verifyStampUsageNumOfAttachmentsText();
		jpayFacility().facilityEmail().verifyStampUsageNumOfAttachments();
		jpayFacility().facilityEmail().verifyStampUsageNumOfStampsText();
		jpayFacility().facilityEmail().verifyStampUsageNumOfStamps();
		jpayFacility().facilityEmail().clickStampUsageCreatedDateButton();
		jpayFacility().facilityEmail().pause(30000);
		jpayFacility().facilityEmail().verifyStampsUsageSenderNameText();
		jpayFacility().facilityEmail().verifyStampsUsageSenderName();
		jpayFacility().facilityEmail().verifyStampsUsageEmailText();
		jpayFacility().facilityEmail().verifyStampsUsageEmail();
		
	}


	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-70:: Design "
			+ "Steps::68(Click sign out button .)")
	public void testEnd() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_70Test(data) };
	}
	
	
	public EmailWTC_70Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		password = data.get("password");
		username = data.get("username");
		pinCode = data.get("pinCode");
		mailAuditingNoActionsText = data.get("mailAuditingNoActionsText");
		reportPrintingText = data.get("reportPrintingText");
		noLetterText = data.get("noLetterText");
		
		
	}

	


}
