package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;



public class EmailWTC_117To118Test extends BaseTestObject{
	
	
	public String username = "";
	public String password = "";
	private String variation;
	private String pinCode;
	private String letterStatusSecurity;
	private String letterStatusCensored;
	private String letterStatusReturned;
	private String commentSecurity;
	private String commentCensored;
	private String commentReturned;
	private String letterStatusReleased;
	private String letterId;
	private String inmateName;
	private String inmateId;
	private String customerName;
	private String customerId;
	private String snapSendText;
	private String fileNamePDF;
	private String sentToSecurityUpdateMsg;
	private String returnToCustomerUpdateMsg;
	private String sentToCensoredUpdateMsg;
	

	public static String PDF_Content ="";
	
	
	/************************************************************************************************
	 * 
	 * TestCase :: WTC47 - (User shall be able to sent to security)
	 *             WTC48 - (User shall be able to sent to censored)
	 *             WTC49 - (User shall be able to return to customer)
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: WTC47To49
	 * Status :: Completed
	 * 
	 **************************************************************************************************/


	/*********************************************************************************
	 * 
	 * Navigate to url,enter username,pincode and password and click login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-117,118:: Design "
			+ "Steps::1,2,3,4,5(Navigate to url,enter username,pincode and password "
			+ "and click login button.)")
	public void testStart() {
		
		jpayFacility().facilityLogin().loadURL(envUrlFacility,variation);
		jpayFacility().facilityLogin().enterUsername(username);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(password);
		jpayFacility().facilityLogin().clickLoginButton();
	}
	
	/*********************************************************************************
	 * 
	 * Click on email link,click on search link,select search by letter id,
	 * wait for the status update,enter confirmation number,click on go 
	 * button,verify snap 'n send icon present,click on view link and verify 
	 * the letter status,inmate name.inmate id,customer name,customer id and 
	 * snap 'n send text,click on photo attachment and close the photo attachment.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-117:: Design Steps"
			+ "::6,7,8,9,10,11,12,13,14,15,16,17,18,19,20(Click on email link,click on search "
			+ "link,select search by letter id,wait for the status update,enter confirmation "
			+ "number,click on go button,verify snap 'n send icon present,click on view link and "
			+ "verify the letter statusinmate name.inmate id,customer name,customer id and "
			+ "snap 'n send text,click on photo attachment and close the photo attachment..)")
	public void mailSearchAndVerifyForTC117() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().enterSearchContent(letterId);
		jpayFacility().facilityEmail().checkShowOlderMessageCheckbox();
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().verifySnapNSendIconPresent();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusReleased);
		jpayFacility().facilityEmail().verifySearchInmateName(inmateName);
		jpayFacility().facilityEmail().verifySearchInmateId(inmateId);
		jpayFacility().facilityEmail().verifySearchCustomerName(customerName);
		jpayFacility().facilityEmail().verifySearchCustomerId(customerId);
		jpayFacility().facilityEmail().verifySearchSnapNSendText(snapSendText);
		jpayFacility().facilityEmail().click1stPhotoAttachment();
		jpayFacility().facilityEmail().clickPhotoAttachmentCloseButton();
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click letter print button,download pdf,verify pdf content,
	 * delete pdf and navigate browser back.
	 * 
	 **********************************************************************************/

	@Test(enabled = false, priority = 3, description = "TestCases::WTC-117 :: Design "
			+ "Steps::21,22,23,24,25,26,27,28,29,30(Click letter print button,"
			+ "download pdf,verify pdf content,delete pdf and navigate browser back.)")
	public void printLetterAndVerifyPdfForTC117() {
		
		jpayFacility().facilityEmail().clickLetterPrintButton();
		jpayFacility().facilityEmail().downloadPreviewPDF(fileNamePDF);
		PDF_Content=jpayFacility().facilityEmail().getPDFContent(PageConstant.TEST_FILE_PATH+fileNamePDF);
		jpayFacility().facilityEmail().verifyPdfContentPresent(PDF_Content, customerName);
		jpayFacility().facilityEmail().verifyPdfContentPresent(PDF_Content, customerId);
		jpayFacility().facilityEmail().verifyPdfContentPresent(PDF_Content, inmateName);
		jpayFacility().facilityEmail().verifyPdfContentPresent(PDF_Content, inmateId);
		jpayFacility().facilityEmail().navigateBrowserBack();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on email link,click on search link,select search by letter id,
	 * wait for the status update,enter confirmation number,click on go 
	 * button,verify snap 'n send icon present,click on view link and verify 
	 * the letter status,inmate name.inmate id,customer name,customer id and 
	 * snap 'n send text,click on photo attachment and close the photo attachment.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-118:: Design Steps"
			+ "::6,7,8,9,10,11,12,13,14,15,16,17,18(Click on email link,click on search "
			+ "link,select search by letter id,wait for the status update,enter confirmation "
			+ "number,click on go button,verify snap 'n send icon present,click on view link and "
			+ "verify the letter statusinmate name.inmate id,customer name,customer id and "
			+ "snap 'n send text.)")
	public void mailSearchAndVerifyForTC118() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().enterSearchContent(letterId);
		jpayFacility().facilityEmail().checkShowOlderMessageCheckbox();
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().verifySnapNSendIconPresent();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusReleased);
		jpayFacility().facilityEmail().verifySearchInmateName(inmateName);
		jpayFacility().facilityEmail().verifySearchInmateId(inmateId);
		jpayFacility().facilityEmail().verifySearchCustomerName(customerName);
		jpayFacility().facilityEmail().verifySearchCustomerId(customerId);
		jpayFacility().facilityEmail().verifySearchSnapNSendText(snapSendText);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on letter send to security,choose reason,enter comment and click 
	 * send to security,verify update message,click on mail tab link,click on 
	 * search,select search by letter id,enter letter id,click on go button,
	 * verify snap ,n send icon present,click on view and verify the letter status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-118 :: Design "
			+ "Steps::19,20,21,22,23,24,25,26,27,28,29,30,31(Click on letter send to "
			+ "security,choose reason,enter comment and click send to security,verify "
			+ "update message,click on mail tab link,click on search,select search by "
			+ "letter id,enter letter id,click on go button,verify snap ,n send icon "
			+ "present,click on view and verify the letter status.)")
	public void letterSendToSecurityAndVerifyForTC118() {
		
		jpayFacility().facilityEmail().clickLetterSendToSecurityButton();
		jpayFacility().facilityEmail().selectReason();
		jpayFacility().facilityEmail().enterComment(commentSecurity);
		jpayFacility().facilityEmail().clickSendToSecurityButton();
		jpayFacility().facilityEmail().verifyLetterStatusUpdateMsg(sentToSecurityUpdateMsg);
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().enterSearchContent(letterId);
		jpayFacility().facilityEmail().checkShowOlderMessageCheckbox();
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().verifySnapNSendIconPresent();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusSecurity);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on letter returned to customer,choose reason,enter comment and click 
	 * returned to customer,verify update message,click on mail tab link,click on 
	 * search,select search by letter id,enter letter id,click on go button,
	 * verify snap ,n send icon present,click on view and verify the letter status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-118 :: Design "
			+ "Steps::32,33,34,35,36,37,38,39,40,41,42,43,44(Click on letter returned "
			+ "to customer,choose reason,enter comment and click returned to customer,verify "
			+ "update message,click on mail tab link,click on search,select search by "
			+ "letter id,enter letter id,click on go button,verify snap ,n send icon "
			+ "present,click on view and verify the letter status.)")
	public void letterReturnedToCustomerAndVerifyForTC118() {
		
		jpayFacility().facilityEmail().clickLetterReturnToCustomerButton();
		jpayFacility().facilityEmail().selectReason();
		jpayFacility().facilityEmail().enterComment(commentReturned);
		jpayFacility().facilityEmail().clickReturnedToCustomerButton();
		jpayFacility().facilityEmail().verifyLetterStatusUpdateMsg(returnToCustomerUpdateMsg);
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().enterSearchContent(letterId);
		jpayFacility().facilityEmail().checkShowOlderMessageCheckbox();
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().verifySnapNSendIconPresent();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusReturned);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on letter send to censored,choose reason,enter comment and click 
	 * send to censored,verify update message,click on mail tab link,click on 
	 * search,select search by letter id,enter letter id,click on go button,
	 * verify snap ,n send icon present,click on view and verify the letter status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-118 :: Design "
			+ "Steps::45,465,47,48,49,50,51,52,53,54,55,56,57(Click on letter send to "
			+ "censored,choose reason,enter comment and click send to censored,verify "
			+ "update message,click on mail tab link,click on search,select search by "
			+ "letter id,enter letter id,click on go button,verify snap ,n send icon "
			+ "present,click on view and verify the letter status.)")
	public void letterSentToCensoredAndVerifyForTC118() {
		
		jpayFacility().facilityEmail().clickLetterSendToCensoredButton();
		jpayFacility().facilityEmail().selectReason();
		jpayFacility().facilityEmail().enterComment(commentCensored);
		jpayFacility().facilityEmail().clickSendToCensoredButton();
		jpayFacility().facilityEmail().verifyLetterStatusUpdateMsg(sentToCensoredUpdateMsg);
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().enterSearchContent(letterId);
		jpayFacility().facilityEmail().checkShowOlderMessageCheckbox();
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().verifySnapNSendIconPresent();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusCensored);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on approve,click on mail tab link,click on 
	 * search,select search by letter id,enter letter id,click on go button,
	 * verify snap ,n send icon present,click on view and verify the letter status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-118 :: Design "
			+ "Steps::58,59,60,61,62,63,64,65,66(Click on approve,click on mail tab "
			+ "link,click on search,select search by letter id,enter letter id,click "
			+ "on go button,verify snap ,n send icon present,click on view and "
			+ "verify the letter status.)")
	public void letterApproveAndVerifyForTC118() {
		
		jpayFacility().facilityEmail().clickLetterApproveButton();
		jpayFacility().facilityEmail().pause(60000);
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().enterSearchContent(letterId);
		jpayFacility().facilityEmail().checkShowOlderMessageCheckbox();
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().verifySnapNSendIconPresent();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusReleased);
		
	}
	

	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-117,118 :: Design "
			+ "Steps::(Click sign out button .)")
	public void testEnd() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}
	



	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_117To118Test(data) };
	}
	
	
	public EmailWTC_117To118Test(Map<String, String> data) {
		super(data);
		
		
		
		username = data.get("username");
		password =data.get("password");
		variation = data.get("variation");
		pinCode = data.get("pinCode");
		letterId = data.get("letterId");
		inmateName = data.get("inmateName");
		inmateId = data.get("inmateId");
		customerName = data.get("customerName");
		customerId = data.get("customerId");
		snapSendText = data.get("snapSendText");
		fileNamePDF = data.get("fileNamePDF");
		sentToSecurityUpdateMsg = data.get("sentToSecurityUpdateMsg");
		returnToCustomerUpdateMsg = data.get("returnToCustomerUpdateMsg");
		sentToCensoredUpdateMsg = data.get("sentToCensoredUpdateMsg");
		letterStatusSecurity = data.get("letterStatusSecurity");
		letterStatusCensored = data.get("letterStatusCensored");
		letterStatusReturned = data.get("letterStatusReturned");
		letterStatusReleased = data.get("letterStatusReleased");
		commentSecurity = data.get("commentSecurity");
		commentCensored = data.get("commentCensored");
		commentReturned = data.get("commentReturned");
		
		
		
		
	}

	


}
