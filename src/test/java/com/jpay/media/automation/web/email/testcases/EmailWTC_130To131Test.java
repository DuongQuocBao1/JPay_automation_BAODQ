package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;

public class EmailWTC_130To131Test extends BaseTestObject {

	
	
	private String variation;
	private String username;
	private String password;
	private String pinCode;
	private String monNum;
	private String newToOld;
	private String discardMessage;
	private String sentToMessage;
	
	
	

	/************************************************************************************************
	 * 
	 * TestCase :: WTC130To131 -(130.User shall be able to Discard a photo from photo approval (Outbound)
	 *                           129.User shall be able to Send to security from photo approval (Outbound))
	 * Author :: shasan(Shahriar Hasan) , 
	 * Date :: DataFile :: 
	 * Email.xlsx ,
	 * DataSheet :: WTC130To131      Status :: Completed
	 * 
	 **************************************************************************************************/


	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-130,131::DesignSteps"
			+ "::1,2,3,4,5(Enter username,password,click login button and verify title"
			+ " of the page.)")
	public void testStart() {

		jpayFacility().facilityLogin().loadURL(envUrlFacility,variation);
		jpayFacility().facilityLogin().enterUsername(username);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(password);
		jpayFacility().facilityLogin().clickLoginButton();
		
	}

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-130:: Design Steps"
			+ "::6,7,8,9,10,11,12,13,14,15,16,17(Click on email link,click on outbound photo "
			+ "approval bucket,click on view letters from all location link,select letter "
			+ "delivery months,select sort by newest to oldest,click on photo attachment,click "
			+ "on discard selected button,verify the popup message,click on cancel button,click "
			+ "on discard selected button,verify the poopup message and click on yes button.)")
	public void discardAttachmentAndVerifyForTC130() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().selectLetterDeliveryMonths(monNum);
		jpayFacility().facilityEmail().clickOutboundPhotoApprovalBucket();
		jpayFacility().facilityEmail().clickViewLetterFromAllLocationLink();
		jpayFacility().facilityEmail().selectSortBy(newToOld);
		jpayFacility().facilityEmail().click1StImageAttachmentLink();
		jpayFacility().facilityEmail().clickDiscardSelectedButton();
		jpayFacility().facilityEmail().verifyImageApproveDiscardSecurityPopupMsg(discardMessage);
		jpayFacility().facilityEmail().clickImageApproveDiscardSecurityPopupCancelButton();
		jpayFacility().facilityEmail().clickDiscardSelectedButton();
		jpayFacility().facilityEmail().verifyImageApproveDiscardSecurityPopupMsg(discardMessage);
		jpayFacility().facilityEmail().clickImageApproveDiscardSecurityPopupYesButton();
		
	}

	/*********************************************************************************
	 * 
	 * Click on email link,click on inbound photo approval bucket,click on view 
	 * letters from all location link,select letter delivery months,select sort 
	 * by newest to oldest,click on photo attachment,select reason for sent to 
	 * security,verify the popup message,click on cancel button,select reason 
	 * for sent to security,verify the poopup message and click on yes button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-129:: Design Steps"
			+ "::6,7,8,9,10,11,12,13,14,15,16,17(Click on email link,click on outbound photo "
			+ "approval bucket,click on view letters from all location link,select letter "
			+ "delivery months,select sort by newest to oldest,click on photo attachment,"
			+ "select reason for sent to security,verify the popup message,click on cancel "
			+ "button,select reason for sent to security,verify the poopup message and "
			+ "click on yes button.)")
	public void sentAttachmentToSecurityAndVerifyForTC131() {
		
		jpayFacility().facilityEmail().pause(2000);
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().selectLetterDeliveryMonths(monNum);
		jpayFacility().facilityEmail().clickOutboundPhotoApprovalBucket();
		jpayFacility().facilityEmail().clickViewLetterFromAllLocationLink();
		jpayFacility().facilityEmail().selectSortBy(newToOld);
		jpayFacility().facilityEmail().click1StImageAttachmentLink();
		jpayFacility().facilityEmail().selectRandomSentToSecurityReason();
		jpayFacility().facilityEmail().verifyImageApproveDiscardSecurityPopupMsg(sentToMessage);
		jpayFacility().facilityEmail().clickImageApproveDiscardSecurityPopupCancelButton();
		jpayFacility().facilityEmail().selectRandomSentToSecurityReason();
		jpayFacility().facilityEmail().verifyImageApproveDiscardSecurityPopupMsg(sentToMessage);
		jpayFacility().facilityEmail().clickImageApproveDiscardSecurityPopupYesButton();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-130,131:: Design "
			+ "Steps::18(Click sign out button .)")
	public void logoutFromFacility() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/

	@Factory(dataProvider = "getData", dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String> data) {
		return new Object[] { new EmailWTC_130To131Test(data) };
	}

	public EmailWTC_130To131Test(Map<String, String> data) {
		super(data);

		username = data.get("username");
		password = data.get("password");
		variation = data.get("variation");
		pinCode = data.get("pinCode");
		monNum = data.get("monNum");
		newToOld = data.get("newToOld");
		discardMessage = data.get("discardMessage");
		sentToMessage = data.get("sentToMessage");
		

	}

	
	
}
