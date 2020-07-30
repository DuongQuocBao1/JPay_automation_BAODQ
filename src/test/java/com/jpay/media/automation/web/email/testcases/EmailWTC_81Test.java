package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC81 - (User shall be able to Add & Delete inmate to Inmate/General list.)
 * Author :: shasan(Shahriar Hasan) , Date :: 07/15/2019
 * DataFile :: Email.xlsx , DataSheet :: WTC81
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_81Test extends BaseTestObject{
	

	private String username;
	private String pinCode;
	private String variation;
	private String password;
	private String inmateId;
	private String comment;
	private String email;
	private String blockUnblockSuccessMsg;
	private String blockSuccessMsg;
	private String blockExistErrorMsg;
	private String optoutHeaderText;
	


	public static String Customer_ID;
	public static String Customer_Name;
	
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
	 * Click on show inmate ACL link,enter inmate id,click on show inmate acl 
	 * list button,click on first add inmate forbidden list button,verify customer 
	 * name,inmate id,enter comment,click add button,verify add success message,
	 * verify account present in inmate forbidden list,click on delete button,
	 * verify account present in opt-in list.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-79::Design Steps"
			+ "::6,7,8,9,10,11,12,13,14,15,16,17,18(Click on show inmate ACL link,enter "
			+ "inmate id,click on show inmate acl list button,click on first add inmate "
			+ "forbidden list button,verify customer name,inmate id,enter comment,click "
			+ "add button,verify add success message,verify account present in inmate "
			+ "forbidden list,click on delete button,verify account present in opt-in list.)")
	public void addInmateForbiddenListForTC81AndVerify() {

		jpayFacility().facilityAdmin().clickShowInmateACLLink();
		jpayFacility().facilityAdmin().enterSIAInmateId(inmateId);
		jpayFacility().facilityAdmin().clickSIAShowInmateACLListButton();
		
		Customer_ID = jpayFacility().facilityAdmin().getSIAGetFirstCustomerId();
		Customer_Name = jpayFacility().facilityAdmin().getSIAGetFirstCustomerName();
		
		jpayFacility().facilityAdmin().clickSIAAddInmateForbiddenListButton();
		jpayFacility().facilityAdmin().verifySIACustomerName(Customer_Name);
		jpayFacility().facilityAdmin().verifySIAInmateId(inmateId);
		jpayFacility().facilityAdmin().enterSIAComment(comment);
		jpayFacility().facilityAdmin().clickSIAAddButton();
		jpayFacility().facilityAdmin().verifySIAAddAccountSuccessMessage(Customer_ID);
		jpayFacility().facilityAdmin().verifySIACustomerPresentInInmateForbiddenList(Customer_ID);
		jpayFacility().facilityAdmin().clickSIAInmateForbiddenDeleteButton(Customer_ID);
		jpayFacility().facilityAdmin().verifySIACustomerPresentInOptInList(Customer_ID);
		
		
	}

	/*********************************************************************************
	 * 
	 * Click on first add general forbidden list button,verify customer name,
	 * enter comment,click add button,verify add success message,verify 
	 * account present in general forbidden list,click opt-in forbidden list 
	 * and click on delete button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-79::Design Steps"
			+ "::19,20,21,22,23,24,25,26(Click on first add general forbidden list button,"
			+ "verify customer name,enter comment,click add button,verify add success message,"
			+ "verify account present in general forbidden list,click opt-in forbidden list "
			+ "and click on delete button.)")
	public void addGeneralForbiddenListForTC81AndVerify() {

		
		jpayFacility().facilityAdmin().clickSIAAddGeneralForbiddenListButton();
		jpayFacility().facilityAdmin().verifySIACustomerName(Customer_Name);
		jpayFacility().facilityAdmin().enterSIAComment(comment);
		jpayFacility().facilityAdmin().clickSIAAddButton();
		jpayFacility().facilityAdmin().verifySIAAddAccountSuccessMessage(Customer_ID);
		jpayFacility().facilityAdmin().verifySIACustomerPresentInGeneralForbiddenList(Customer_ID);
		jpayFacility().facilityAdmin().clickOptInForbiddenListLink();
		jpayFacility().facilityAdmin().verifyOIFLAccountId(Customer_ID);
		jpayFacility().facilityAdmin().clickOIFLDeleteButton(Customer_ID);
		
	}

	/*********************************************************************************
	 * 
	 * Click on first add general forbidden list button,verify customer name,
	 * enter comment,click add button,verify add success message,verify 
	 * account present in general forbidden list,click opt-in forbidden list 
	 * and click on delete button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-79::Design Steps"
			+ "::19,20,21,22,23,24,25,26(Click on first add general forbidden list button,"
			+ "verify customer name,enter comment,click add button,verify add success message,"
			+ "verify account present in general forbidden list,click opt-in forbidden list "
			+ "and click on delete button.)")
	public void blockUnblockOpyoutEmailsForTC81AndVerify() {

		
		jpayFacility().facilityAdmin().clickOptoutEmailsLink();
		jpayFacility().facilityAdmin().verifyOETitleHeaderText(optoutHeaderText);
		jpayFacility().facilityAdmin().enterOEEmailAddressToSearch(email);
		jpayFacility().facilityAdmin().clickOEGoButton();
		jpayFacility().facilityAdmin().clickOEBlockButton();
		jpayFacility().facilityAdmin().verifyOEBlockUnblockSuccessMessage(blockUnblockSuccessMsg);
		jpayFacility().facilityAdmin().clickOEUnblockButton();
		jpayFacility().facilityAdmin().verifyOEBlockUnblockSuccessMessage(blockUnblockSuccessMsg);
		jpayFacility().facilityAdmin().clickOEBlockEmailLink();
		jpayFacility().facilityAdmin().enterOEEmailAddressToBlock(email);
		jpayFacility().facilityAdmin().clickOEBlockEmailButton();
		jpayFacility().facilityAdmin().verifyOEBlockedSuccessMessage(blockSuccessMsg);
		jpayFacility().facilityAdmin().clickOEBlockEmailButton();
		jpayFacility().facilityAdmin().verifyOEBlockedExistErrorMessage(blockExistErrorMsg);
		jpayFacility().facilityAdmin().clickOESearchBlockedEmailLink();
		jpayFacility().facilityAdmin().enterOEEmailAddressToSearch(email);
		jpayFacility().facilityAdmin().clickOEGoButton();
		jpayFacility().facilityAdmin().clickOEUnblockButton();
		jpayFacility().facilityAdmin().verifyOEBlockUnblockSuccessMessage(blockUnblockSuccessMsg);
		
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
		return new Object[] { new EmailWTC_81Test(data) };
	}
	
	
	public EmailWTC_81Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		password = data.get("password");
		username = data.get("username");
		pinCode = data.get("pinCode");
		inmateId = data.get("inmateId");
		comment = data.get("comment");
		email = data.get("email");
		blockUnblockSuccessMsg = data.get("blockUnblockSuccessMsg");//
		blockSuccessMsg = data.get("blockSuccessMsg");//
		blockExistErrorMsg = data.get("blockExistErrorMsg");//
		optoutHeaderText = data.get("optoutHeaderText");
		
		
		
		
		
	}

	


}
