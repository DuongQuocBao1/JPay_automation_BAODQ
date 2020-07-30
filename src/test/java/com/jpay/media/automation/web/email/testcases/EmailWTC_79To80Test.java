package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC74To75 - (79.All buckets must works fine.
 *                           80.User shall be able to view in-out discarded material.)
 * Author :: shasan(Shahriar Hasan) , Date :: 07/15/2019
 * DataFile :: Email.xlsx , DataSheet :: WTC79To80
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_79To80Test extends BaseTestObject{
	

	private String username;
	private String pinCode;
	private String variation;
	private String password;
	private String inboundSupportText;
	private String requiresApprovalText;
	private String printReleaseText;
	private String printedText;
	private String releasedText;
	private String sentToSecurityText;
	private String censoredText;
	private String outboundSupportText;
	private String discardedHeaderText;
	private String pastMonth;
	private String recoverDeletedHeaderText;
	private String invalidLetterId;
	private String unsuccessMessage;
	private String validLetterId;
	


	/*********************************************************************************
	 * 
	 * Insert STATE name in search box,Insert inmate ID in search box and Click
	 * on next image button
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-79,80::Design Steps"
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
	 * Click on mail tab link,click on support Tickets Deleivery link,verify 
	 * inbound support text,click on inbound requires approval bucket,verify 
	 * title header text and click on back button,click on inbound ready to 
	 * print/release bucket,verify title header text and click on back button,
	 * click on inbound printed bucket,verify title header text and click on 
	 * back button,,click on inbound released bucket,verify title header text 
	 * and click on back button,click on inbound Sent to security bucket,verify 
	 * title header text and click on back button,click on inbound censored 
	 * bucket,verify title header text and click on back button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-79::Design Steps"
			+ "::6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26(Click on mail "
			+ "tab link,click on support Tickets Deleivery link,verify inbound support text,"
			+ "click on inbound requires approval bucket,verify title header text and click "
			+ "on back button,click on inbound ready to print/release bucket,verify title "
			+ "header text and click on back button,,click on inbound printed bucket,verify "
			+ "title header text and click on back button,,click on inbound released bucket,"
			+ "verify title header text and click on back button,click on inbound Sent to "
			+ "security bucket,verify title header text and click on back button,click on "
			+ "inbound censored bucket,verify title header text and click on back button.)")
	public void supportTicketsDeliveryInboundBucketForTC79AndVerify() {

		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSupportTicketsDeliveryLink();
		jpayFacility().facilityEmail().verifySTDInboundSupportText(inboundSupportText);
		
		jpayFacility().facilityEmail().clickSTDInboundRequiresApprovalLink();
		jpayFacility().facilityEmail().verifySTDInOutboundTitleHeaderText(requiresApprovalText);
		jpayFacility().facilityEmail().clickEmailBackButton();
		
		jpayFacility().facilityEmail().clickSTDInboundPrintReleaseLink();
		jpayFacility().facilityEmail().verifySTDInOutboundTitleHeaderText(printReleaseText);
		jpayFacility().facilityEmail().clickEmailBackButton();
		
		jpayFacility().facilityEmail().clickSTDInboundPrintedLink();
		jpayFacility().facilityEmail().verifySTDInOutboundTitleHeaderText(printedText);
		jpayFacility().facilityEmail().clickEmailBackButton();

		jpayFacility().facilityEmail().clickSTDInboundReleasedLink();
		jpayFacility().facilityEmail().verifySTDInOutboundTitleHeaderText(releasedText);
		jpayFacility().facilityEmail().clickEmailBackButton();
		
		jpayFacility().facilityEmail().clickSTDInboundSentToSecurityLink();
		jpayFacility().facilityEmail().verifySTDInOutboundTitleHeaderText(sentToSecurityText);
		jpayFacility().facilityEmail().clickEmailBackButton();
		
		jpayFacility().facilityEmail().clickSTDInboundCensoredLink();
		jpayFacility().facilityEmail().verifySTDInOutboundTitleHeaderText(censoredText);
		jpayFacility().facilityEmail().clickEmailBackButton();
		
	}

	/*********************************************************************************
	 * 
	 * Verify  outbound support text,click on outbound requires approval bucket,verify 
	 * title header text and click on back button,click on outbound ready to 
	 * print/release bucket,verify title header text and click on back button,
	 * click on outbound released bucket,verify title header text 
	 * and click on back button,click on outbound Sent to security bucket,verify 
	 * title header text and click on back button,click on outbound censored 
	 * bucket,verify title header text and click on back button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-79::Design Steps"
			+ "::27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42(Verify outbound support text,"
			+ "click on outbound requires approval bucket,verify title header text and click "
			+ "on back button,click on outbound ready to print/release bucket,verify title "
			+ "header text and click on back button,click on outbound released bucket,"
			+ "verify title header text and click on back button,click on outbound Sent to "
			+ "security bucket,verify title header text and click on back button,click on "
			+ "outbound censored bucket,verify title header text and click on back button.)")
	public void supportTicketsDeliveryOutboundBucketForTC79AndVerify() {

		jpayFacility().facilityEmail().verifySTDOutboundSupportText(outboundSupportText);
		
		jpayFacility().facilityEmail().clickSTDOutboundRequiresApprovalLink();
		jpayFacility().facilityEmail().verifySTDInOutboundTitleHeaderText(requiresApprovalText);
		jpayFacility().facilityEmail().clickEmailBackButton();
		
		jpayFacility().facilityEmail().clickSTDOutboundPrintReleaseLink();
		jpayFacility().facilityEmail().verifySTDInOutboundTitleHeaderText(printReleaseText);
		jpayFacility().facilityEmail().clickEmailBackButton();

		jpayFacility().facilityEmail().clickSTDOutboundReleasedLink();
		jpayFacility().facilityEmail().verifySTDInOutboundTitleHeaderText(releasedText);
		jpayFacility().facilityEmail().clickEmailBackButton();
		
		jpayFacility().facilityEmail().clickSTDOutboundSentToSecurityLink();
		jpayFacility().facilityEmail().verifySTDInOutboundTitleHeaderText(sentToSecurityText);
		jpayFacility().facilityEmail().clickEmailBackButton();
		
		jpayFacility().facilityEmail().clickSTDOutboundCensoredLink();
		jpayFacility().facilityEmail().verifySTDInOutboundTitleHeaderText(censoredText);
		jpayFacility().facilityEmail().clickEmailBackButton();
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on mail Tab link,click on inmail discarded material link,verify 
	 * title header text,select past months to show letter,verify total search 
	 * result present,click on view button,verify searched result present,
	 * click on view button and verify the letter id.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-80::Design Steps"
			+ "::6,7,8,9,10,11,12,13,14(Click on mail Tab link,click on inmail discarded "
			+ "material link,verify title header text,select past months to show letter,"
			+ "verify total search result present,click on view button,verify searched "
			+ "result present,click on view button and verify the letter id.)")
	public void inmailDiscardedMaterialForTC80AndVerify() {

		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickInMailDiscardedMaterialLink();
		jpayFacility().facilityEmail().verifyIOMDMTitleHeaderText(discardedHeaderText);
		jpayFacility().facilityEmail().selectIOMDMPastMonth(pastMonth);
		jpayFacility().facilityEmail().verifyIOMDMTotalSearchResultPresent();
		jpayFacility().facilityEmail().clickIOMDMTotalSearchedViewButton();
		jpayFacility().facilityEmail().verifyIOMDMSearchResultPresent();
		jpayFacility().facilityEmail().clickIOMDMSearchedViewButton();
		jpayFacility().facilityEmail().verifyIOMDMSearchedLetterIdPresent();
		
	}


	/*********************************************************************************
	 * 
	 * Click on mail Tab link,click on outmail discarded material link,verify 
	 * title header text,select past months to show letter,verify total search 
	 * result present,click on view button,verify searched result present,
	 * click on view button and verify the letter id.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-80::Design Steps"
			+ "::15,16,17,18,19,20,21,22,23(Click on mail Tab link,click on outmail discarded "
			+ "material link,verify title header text,select past months to show letter,"
			+ "verify total search result present,click on view button,verify searched "
			+ "result present,click on view button and verify the letter id.)")
	public void outmailDiscardedMaterialForTC80AndVerify() {

		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickOutMailDiscardedMaterialLink();
		jpayFacility().facilityEmail().verifyIOMDMTitleHeaderText(discardedHeaderText);
		jpayFacility().facilityEmail().selectIOMDMPastMonth(pastMonth);
		jpayFacility().facilityEmail().verifyIOMDMTotalSearchResultPresent();
		jpayFacility().facilityEmail().clickIOMDMTotalSearchedViewButton();
		jpayFacility().facilityEmail().verifyIOMDMSearchResultPresent();
		jpayFacility().facilityEmail().clickIOMDMSearchedViewButton();
		jpayFacility().facilityEmail().verifyIOMDMSearchedLetterIdPresent();
		
	}

	
	/*********************************************************************************
	 * 
	 * Click on mail Tab link,click on recover deleted letters link,verify title 
	 * header text,enter invalid letter id,click recover button,verify error message,
	 * enter valid letter id,click recover button,verify search result present,letter 
	 * id,account id and recover link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-80::Design Steps"
			+ "::24,25,26,27,28,29,30,31,32,33,34,35(Click on mail Tab link,click on "
			+ "recover deleted letters link,verify title header text,enter invalid "
			+ "letter id,click recover button,verify error message,enter valid letter "
			+ "id,click recover button,verify search result present,letter id,account "
			+ "id and recover link.)")
	public void recoverDeletedLettersForTC80AndVerify() {

		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickRecoverDeletedLettersLink();
		jpayFacility().facilityEmail().verifyRDLTitleHeaderText(recoverDeletedHeaderText);
		jpayFacility().facilityEmail().enterRDLLetterId(invalidLetterId);
		jpayFacility().facilityEmail().clickRDLRecoverLetterButton();
		jpayFacility().facilityEmail().verifyRDLUnsuccessSearchedMessage(unsuccessMessage);
		jpayFacility().facilityEmail().enterRDLLetterId(validLetterId);
		jpayFacility().facilityEmail().clickRDLRecoverLetterButton();
		jpayFacility().facilityEmail().verifyRDLSearchResultPresent();
		jpayFacility().facilityEmail().verifyRDLLetterId(validLetterId);
		jpayFacility().facilityEmail().verifyRDLAccountIdPresent();
		jpayFacility().facilityEmail().verifyRDLRecoverLinkPresent();
		
	}

	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-79,80:: Design "
			+ "Steps::(Click sign out button .)")
	public void testEnd() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_79To80Test(data) };
	}
	
	
	public EmailWTC_79To80Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		password = data.get("password");
		username = data.get("username");
		pinCode = data.get("pinCode");
		censoredText = data.get("censoredText");
		sentToSecurityText = data.get("sentToSecurityText");
		releasedText = data.get("releasedText");
		printedText = data.get("printedText");
		printReleaseText = data.get("printReleaseText");
		inboundSupportText = data.get("inboundSupportText");
		outboundSupportText = data.get("outboundSupportText");
		requiresApprovalText = data.get("requiresApprovalText");
		discardedHeaderText = data.get("discardedHeaderText");
		pastMonth = data.get("pastMonth");
		recoverDeletedHeaderText = data.get("recoverDeletedHeaderText");
		invalidLetterId = data.get("invalidLetterId");
		validLetterId = data.get("validLetterId");
		unsuccessMessage = data.get("unsuccessMessage");
		
		
		
		
	}

	


}
