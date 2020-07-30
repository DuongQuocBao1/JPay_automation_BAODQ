package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC167 - (User shall not be able to Add an existing user to Sender Filter System)
 * Author :: shasan(Shahriar Hasan) , Date ::
 * DataFile :: Email.xlsx , DataSheet :: WTC167
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_167Test extends BaseTestObject{
	

	private String variation;
	private String passwordSuper;
	private String usernameSuper;
	private String pinCode;
	private String mailReason;
	private String moneyReason;
	private String emptySearchErrorMsg;
	private String searchById;
	private String accountRecordFoundText;
	private String activeText;
	private String sfsHeaderText;
	private String emptyAccountIdErrorMsg;
	private String emptyLastNameErrorMsg;
	private String accountId;
	private String lastName;
	private String existMessage;
	


	/*********************************************************************************
	 * 
	 * Navigate to facility,enter username,pincode,password and click on login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-167::DesignSteps"
			+ "::1,2,3,4,5(Navigate to facility,enter username,pincode,password and "
			+ "click on login button.)")
	public void testStart() {
		
		jpayFacility().facilityLogin().loadURL(envUrlFacility,variation);
		jpayFacility().facilityLogin().enterUsername(usernameSuper);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(passwordSuper);
		jpayFacility().facilityLogin().clickLoginButton();
		
	}

	/*********************************************************************************
	 * 
	 * Click on INTEL tab link,click on inmate filter link,verify header text,click 
	 * search link,click on go button and verify empty search error message,select 
	 * search by id,enter inmate id,click on go button and verify record found 
	 * message,inmate name,id,mail watch list status and money watch list status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-167::DesignSteps::"
			+ "6,7,8,9,10,11,12,13,14,15,16,17,18,19(Click on INTEL tab link,click "
			+ "on sender filter link,verify header text,click search link,click on go button "
			+ "and verify empty search error message,select search by id,enter account id,"
			+ "click on go button and verify record found message,last name,id,mail watch "
			+ "list status and money watch list status.)")
	public void searchFilteredSenderAndVerify() {

		jpayFacility().facilityIntel().clickIntelLink();
		jpayFacility().facilityIntel().clickSenderFilterSystemLink();
		jpayFacility().facilityIntel().verifySenderFilterSystemHeaderText(sfsHeaderText);
		jpayFacility().facilityIntel().clickSFSSearchLink();
		jpayFacility().facilityIntel().clickSFSSearchGoButton();
		jpayFacility().facilityIntel().verifySFSEmptySearchErrorMsg(emptySearchErrorMsg);
		jpayFacility().facilityIntel().selectSFSSearchBy(searchById);
		jpayFacility().facilityIntel().enterSFSSearchString(accountId);
		jpayFacility().facilityIntel().clickSFSSearchGoButton();
		jpayFacility().facilityIntel().verifySFSSearchRecordFoundText(accountRecordFoundText);
		jpayFacility().facilityIntel().verifySFSSearchLastName(lastName);
		jpayFacility().facilityIntel().verifySFSSearchAccountId(accountId);
		jpayFacility().facilityIntel().verifySFSSearchMailWatchListStatus(activeText);
		jpayFacility().facilityIntel().verifySFSSearchMoneyWatchListStatus(activeText);
		
	}
	/*********************************************************************************
	 * 
	 * Click on INTEL tab link,click on inmate filter link,verify header text,click 
	 * add link,click on add inmate button and verify empty inmate id and name error 
	 * message,enter inmate id,name,check mail watch list checkbox,enter mail watch 
	 * list reason,check money watch list checkbox,enter money watch list reason,
	 * click on add inmate button and verify update success message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-167::Design Steps"
			+ "::20,21,22,23,24,25,26,27,28,29,30,31(Click on INTEL tab link,click "
			+ "on inmate filter link,verify header text,click add link,click on add inmate "
			+ "button and verify empty inmate id and name error message,enter inmate id,name,"
			+ "check mail watch list checkbox,enter mail watch list reason,check money watch "
			+ "list checkbox,enter money watch list reason,click on add inmate button and "
			+ "verify update success message.)")
	public void addInmateToFilterAndVerify() {

		jpayFacility().facilityIntel().clickSFSAddLink();
		jpayFacility().facilityIntel().clickSFSAddCustomerButton();
		jpayFacility().facilityIntel().verifySFSEmptyAccountIdErrorMessage(emptyAccountIdErrorMsg);
		jpayFacility().facilityIntel().verifySFSEmptyLastNameErrorMessage(emptyLastNameErrorMsg);
		jpayFacility().facilityIntel().enterSFSAccountID(accountId);
		jpayFacility().facilityIntel().enterSFSLastName(lastName);
		jpayFacility().facilityIntel().checkSFSMailWatchListEnable();
		jpayFacility().facilityIntel().enterSFSMailWatchListReason(mailReason);
		jpayFacility().facilityIntel().checkSFSMoneyWatchListEnable();
		jpayFacility().facilityIntel().enterSFSMoneyWatchListReason(moneyReason);
		jpayFacility().facilityIntel().clickSFSAddCustomerButton();
		jpayFacility().facilityIntel().verifySFSAddSuccessMessage(existMessage);//
		
	}
	
	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-167:: Design "
			+ "Steps::102(Click sign out button .)")
	public void testEnd() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_167Test(data) };
	}
	
	
	public EmailWTC_167Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		passwordSuper = data.get("passwordSuper");
		usernameSuper = data.get("usernameSuper");
		pinCode = data.get("pinCode");
		mailReason = data.get("mailReason");
		moneyReason = data.get("moneyReason");
		accountRecordFoundText = data.get("accountRecordFoundText");
		sfsHeaderText = data.get("sfsHeaderText");
		emptyAccountIdErrorMsg = data.get("emptyAccountIdErrorMsg");
		emptyLastNameErrorMsg = data.get("emptyLastNameErrorMsg");
		accountId = data.get("accountId");
		lastName = data.get("lastName");
		existMessage = data.get("existMessage");
		emptySearchErrorMsg = data.get("emptySearchErrorMsg");
		searchById = data.get("searchById");
		activeText = data.get("activeText");
		
		
	
	}


}
