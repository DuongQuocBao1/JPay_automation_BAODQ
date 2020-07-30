package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC73 - (User shall be able to view all buckets without any issues.)
 * Author :: shasan(Shahriar Hasan) , Date :: 07/15/2019
 * DataFile :: Email.xlsx , DataSheet :: WTC73
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_73Test extends BaseTestObject{
	

	private String username;
	private String pinCode;
	private String variation;
	private String password;
	private String pageNum200;
	private String monthNumber;
	private String pageNum500;
	

	


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
	 * Click on mail tab link,select months to show letter delivery summary,
	 * click on inbound requires Approval,click view letter from all locations,
	 * select number of letter pages to show,click on go button,click on last 
	 * page and click on first page. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-73::Design Steps"
			+ "::6,7,8,9,10,11,12,13(Click on mail tab link,select months to show letter "
			+ "delivery summary,click on inbound requires Approval,click view letter from "
			+ "all locations,select number of letter pages to show,click on go button,click "
			+ "on last page and click on first page.)")
	public void inboundRequiresApproval() {

		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().selectLetterDeliveryMonths(monthNumber);//6
		jpayFacility().facilityEmail().clickInboundRequiresApprovalBucket();
		jpayFacility().facilityEmail().clickViewLetterFromAllLocationLink();
		jpayFacility().facilityEmail().selectNumberOfPagesOfLettersToShow1(pageNum200);//200
		jpayFacility().facilityEmail().clickNumberOfPagesOfLettersToShowGoButton();
		/*jpayFacility().facilityEmail().clickNumberOfPagesOfLettersToShowLastPageButton();
		jpayFacility().facilityEmail().clickNumberOfPagesOfLettersToShowFirstPageButton();*/
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on email main button,select months to show letter delivery summary,
	 * click on inbound photo Approval,click view letter from all locations,
	 * click on last page and click on first page. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-73::Design Steps"
			+ "::14,15,16,17,18,19(Click on email main button,select months to show "
			+ "letter delivery summary,click on inbound photo Approval,click view letter "
			+ "from all locations,click on last page and click on first page.)")
	public void inboundPhotoApproval() {

		jpayFacility().facilityEmail().clickEmailMainButton();
		jpayFacility().facilityEmail().selectLetterDeliveryMonths(monthNumber);//6
		jpayFacility().facilityEmail().clickInboundPhotoApprovalBucket();
		jpayFacility().facilityEmail().clickViewLetterFromAllLocationLink();
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on email main button,select months to show letter delivery summary,
	 * click on inbound requires Approval,click view letter from all locations,
	 * select number of letter pages to show and click on go button. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-73::Design Steps"
			+ "::20,21,22,23,24,25(Click on email main button,select months to show letter "
			+ "delivery summary,click on inbound Video Requires Approval,click view letter from "
			+ "all locations,select number of letter pages to show and click on go button.)")
	public void inboundVideoRequiresApproval() {

		jpayFacility().facilityEmail().clickEmailMainButton();
		jpayFacility().facilityEmail().selectLetterDeliveryMonths(monthNumber);//6
		jpayFacility().facilityEmail().clickInboundVideoRequiresApprovalBucket();
		jpayFacility().facilityEmail().clickViewLetterFromAllLocationLink();
		jpayFacility().facilityEmail().selectNumberOfPagesOfLettersToShow1(pageNum500);//500
		jpayFacility().facilityEmail().clickNumberOfPagesOfLettersToShowGoButton();
		
		
	}

	
	/*********************************************************************************
	 * 
	 * Click on email main button,select months to show letter delivery summary,
	 * click on inbound requires Approval,click view letter from all locations,
	 * select number of letter pages to show and click on go button. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-73::Design Steps"
			+ "::26,27,28,29,30,31(Click on email main button,select months to show letter "
			+ "delivery summary,click on inbound Ready to print Approval,click view letter from "
			+ "all locations,select number of letter pages to show and click on go button.)")
	public void inboundReadyToPrintOrRelease() {

		jpayFacility().facilityEmail().clickEmailMainButton();
		jpayFacility().facilityEmail().selectLetterDeliveryMonths(monthNumber);//6
		jpayFacility().facilityEmail().clickInboundReadyToPrintBucket();
		jpayFacility().facilityEmail().clickViewLetterFromAllLocationLink();
		jpayFacility().facilityEmail().selectNumberOfPagesOfLettersToShow2(pageNum500);//500
		jpayFacility().facilityEmail().clickNumberOfPagesOfLettersToShowGoButton();
		
		
	}

	
	/*********************************************************************************
	 * 
	 * Click on email main button,select months to show letter delivery summary,
	 * click on inbound requires Approval,click view letter from all locations,
	 * select number of letter pages to show and click on go button. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-73::Design Steps"
			+ "::32,33,34,35,36,37(Click on email main button,select months to show letter "
			+ "delivery summary,click on inbound Printed,click view letter from "
			+ "all locations,select number of letter pages to show and click on go button.)")
	public void inboundPrinted() {

		jpayFacility().facilityEmail().clickEmailMainButton();
		jpayFacility().facilityEmail().selectLetterDeliveryMonths(monthNumber);//6
		jpayFacility().facilityEmail().clickInboundPrintedBucket();
		jpayFacility().facilityEmail().clickViewLetterFromAllLocationLink();
		jpayFacility().facilityEmail().selectNumberOfPagesOfLettersToShow1(pageNum500);//500
		jpayFacility().facilityEmail().clickNumberOfPagesOfLettersToShowGoButton();
		
		
	}

	
	/*********************************************************************************
	 * 
	 * Click on email main button,select months to show letter delivery summary,
	 * click on inbound requires Approval,click view letter from all locations,
	 * select number of letter pages to show and click on go button. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-73::Design Steps"
			+ "::38,39,40,41,42,43,44,45(Click on email main button,select months to "
			+ "show letter delivery summary,click on inbound Printed,click view letter "
			+ "from all locations,select number of letter pages to show and click on go "
			+ "button,click on last page and click on first page.)")
	public void inboundReleased() {

		jpayFacility().facilityEmail().clickEmailMainButton();
		jpayFacility().facilityEmail().selectLetterDeliveryMonths(monthNumber);//6
		jpayFacility().facilityEmail().clickInboundReleasedBucket();
		jpayFacility().facilityEmail().clickViewLetterFromAllLocationLink();
		jpayFacility().facilityEmail().selectNumberOfPagesOfLettersToShow2(pageNum500);//500
		jpayFacility().facilityEmail().clickNumberOfPagesOfLettersToShowGoButton();
		/*jpayFacility().facilityEmail().clickNumberOfPagesOfLettersToShowLastPageButton();
		jpayFacility().facilityEmail().clickNumberOfPagesOfLettersToShowFirstPageButton();*/
		
	}

	
	/*********************************************************************************
	 * 
	 * Click on email main button,select months to show letter delivery summary,
	 * click on inbound requires Approval,click view letter from all locations,
	 * select number of letter pages to show and click on go button. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-73::Design Steps"
			+ "::46,47,48,49,50,51(Click on email main button,select months to show letter "
			+ "delivery summary,click on inbound Sent to security,click view letter from "
			+ "all locations,select number of letter pages to show and click on go button.)")
	public void inboundSentToSecurity() {

		jpayFacility().facilityEmail().clickEmailMainButton();
		jpayFacility().facilityEmail().selectLetterDeliveryMonths(monthNumber);//6
		jpayFacility().facilityEmail().clickInboundSentToSecurityBucket();
		jpayFacility().facilityEmail().clickViewLetterFromAllLocationLink();
		jpayFacility().facilityEmail().selectNumberOfPagesOfLettersToShow1(pageNum500);//500
		jpayFacility().facilityEmail().clickNumberOfPagesOfLettersToShowGoButton();
		
		
	}


	/*********************************************************************************
	 * 
	 * Click on email main button,select months to show letter delivery summary,
	 * click on inbound requires Approval,click view letter from all locations,
	 * select number of letter pages to show and click on go button. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-73::Design Steps"
			+ "::52,53,54,55,56,57(Click on email main button,select months to show letter "
			+ "delivery summary,click on inbound Returned to customers,click view letter from "
			+ "all locations,select number of letter pages to show and click on go button.)")
	public void inboundReturnedToCustomer() {

		jpayFacility().facilityEmail().clickEmailMainButton();
		jpayFacility().facilityEmail().selectLetterDeliveryMonths(monthNumber);//6
		jpayFacility().facilityEmail().clickInboundReturnedToCustomerBucket();
		jpayFacility().facilityEmail().clickViewLetterFromAllLocationLink();
		jpayFacility().facilityEmail().selectNumberOfPagesOfLettersToShow1(pageNum500);//500
		jpayFacility().facilityEmail().clickNumberOfPagesOfLettersToShowGoButton();
		
		
	}


	/*********************************************************************************
	 * 
	 * Click on email main button,select months to show letter delivery summary,
	 * click on inbound censored,click view letter from all locations,
	 * select number of letter pages to show and click on go button. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-73::Design Steps"
			+ "::58,59,60,61,62,63(Click on email main button,select months to show letter "
			+ "delivery summary,click on inbound Returned to customers,click view letter from "
			+ "all locations,select number of letter pages to show and click on go button.)")
	public void inboundCensored() {

		jpayFacility().facilityEmail().clickEmailMainButton();
		jpayFacility().facilityEmail().selectLetterDeliveryMonths(monthNumber);//6
		jpayFacility().facilityEmail().clickInboundCensoredBucket();
		jpayFacility().facilityEmail().clickViewLetterFromAllLocationLink();
		jpayFacility().facilityEmail().selectNumberOfPagesOfLettersToShow1(pageNum500);//500
		jpayFacility().facilityEmail().clickNumberOfPagesOfLettersToShowGoButton();
		
		
	}


	/*********************************************************************************
	 * 
	 * Click on email main button,select months to show letter delivery summary,
	 * click on inbound censored,click view letter from all locations,
	 * select number of letter pages to show and click on go button. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-73::Design Steps"
			+ "::64,65,67,68,69,70(Click on email main button,select months to show letter "
			+ "delivery summary,click on inbound Returned to customers,click view letter from "
			+ "all locations,select number of letter pages to show and click on go button.)")
	public void inboundReleasedVideo() {

		jpayFacility().facilityEmail().clickEmailMainButton();
		jpayFacility().facilityEmail().selectLetterDeliveryMonths(monthNumber);//6
		jpayFacility().facilityEmail().clickInboundReleasedVideoBucket();
		jpayFacility().facilityEmail().clickViewLetterFromAllLocationLink();
		jpayFacility().facilityEmail().selectNumberOfPagesOfLettersToShow2(pageNum500);//500
		jpayFacility().facilityEmail().clickNumberOfPagesOfLettersToShowGoButton();
		
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on mail tab link,select months to show letter delivery summary,
	 * click on inbound requires Approval,click view letter from all locations,
	 * select number of letter pages to show,click on go button,click on last 
	 * page and click on first page. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-73::Design Steps"
			+ "::71,72,73,74,75,76(Click on mail tab link,select months to show letter "
			+ "delivery summary,click on outbound requires Approval,click view letter from "
			+ "all locations,select number of letter pages to show,click on go button,click "
			+ "on last page and click on first page.)")
	public void outboundRequiresApproval() {

		jpayFacility().facilityEmail().clickEmailMainButton();
		jpayFacility().facilityEmail().selectLetterDeliveryMonths(monthNumber);//6
		jpayFacility().facilityEmail().clickOutboundRequiresApprovalBucket();
		jpayFacility().facilityEmail().clickViewLetterFromAllLocationLink();
		jpayFacility().facilityEmail().selectNumberOfPagesOfLettersToShow1(pageNum500);//200
		jpayFacility().facilityEmail().clickNumberOfPagesOfLettersToShowGoButton();
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on email main button,select months to show letter delivery summary,
	 * click on inbound photo Approval,click view letter from all locations,
	 * click on last page and click on first page. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "TestCases::WTC-73::Design Steps"
			+ "::77,78,79,80,81,82(Click on email main button,select months to show "
			+ "letter delivery summary,click on outbound photo Approval,click view letter "
			+ "from all locations,click on last page and click on first page.)")
	public void outboundPhotoApproval() {

		jpayFacility().facilityEmail().clickEmailMainButton();
		jpayFacility().facilityEmail().selectLetterDeliveryMonths(monthNumber);//6
		jpayFacility().facilityEmail().clickOutboundPhotoApprovalBucket();
		//jpayFacility().facilityEmail().clickViewLetterFromAllLocationLink();
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on email main button,select months to show letter delivery summary,
	 * click on inbound requires Approval,click view letter from all locations,
	 * select number of letter pages to show and click on go button. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 14, description = "TestCases::WTC-73::Design Steps"
			+ "::83,84,85,86,87,88(Click on email main button,select months to show letter "
			+ "delivery summary,click on Outbound Video Requires Approval,click view letter from "
			+ "all locations,select number of letter pages to show and click on go button.)")
	public void outboundVideoRequiresApproval() {

		jpayFacility().facilityEmail().clickEmailMainButton();
		jpayFacility().facilityEmail().selectLetterDeliveryMonths(monthNumber);//6
		jpayFacility().facilityEmail().clickOutboundVideoRequiresApprovalBucket();
		jpayFacility().facilityEmail().clickViewLetterFromAllLocationLink();
		jpayFacility().facilityEmail().selectNumberOfPagesOfLettersToShow1(pageNum500);//500
		jpayFacility().facilityEmail().clickNumberOfPagesOfLettersToShowGoButton();
		
		
	}

	
	/*********************************************************************************
	 * 
	 * Click on email main button,select months to show letter delivery summary,
	 * click on inbound requires Approval,click view letter from all locations,
	 * select number of letter pages to show and click on go button. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 15, description = "TestCases::WTC-73::Design Steps"
			+ "::89,90,91,92,93,94(Click on email main button,select months to show letter "
			+ "delivery summary,click on outbound Ready to print Approval,click view letter from "
			+ "all locations,select number of letter pages to show and click on go button.)")
	public void outboundReadyToPrintOrRelease() {

		jpayFacility().facilityEmail().clickEmailMainButton();
		jpayFacility().facilityEmail().selectLetterDeliveryMonths(monthNumber);//6
		jpayFacility().facilityEmail().clickOutboundReadyToPrintBucket();
		jpayFacility().facilityEmail().clickViewLetterFromAllLocationLink();
		jpayFacility().facilityEmail().selectNumberOfPagesOfLettersToShow2(pageNum500);//500
		jpayFacility().facilityEmail().clickNumberOfPagesOfLettersToShowGoButton();
		
		
	}

	
	/*********************************************************************************
	 * 
	 * Click on email main button,select months to show letter delivery summary,
	 * click on inbound requires Approval,click view letter from all locations,
	 * select number of letter pages to show and click on go button. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 16, description = "TestCases::WTC-73::Design Steps"
			+ "::95,96,97,98,99,100(Click on email main button,select months to show letter "
			+ "delivery summary,click on outbound Printed,click view letter from "
			+ "all locations,select number of letter pages to show and click on go button.)")
	public void outboundCensored() {

		jpayFacility().facilityEmail().clickEmailMainButton();
		jpayFacility().facilityEmail().selectLetterDeliveryMonths(monthNumber);//6
		jpayFacility().facilityEmail().clickOutboundCensoredBucket();
		jpayFacility().facilityEmail().clickViewLetterFromAllLocationLink();
		jpayFacility().facilityEmail().selectNumberOfPagesOfLettersToShow1(pageNum500);//500
		jpayFacility().facilityEmail().clickNumberOfPagesOfLettersToShowGoButton();
		
		
	}

	
	/*********************************************************************************
	 * 
	 * Click on email main button,select months to show letter delivery summary,
	 * click on inbound requires Approval,click view letter from all locations,
	 * select number of letter pages to show and click on go button. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 17, description = "TestCases::WTC-73::Design Steps"
			+ "::101,102,103,104,105,106(Click on email main button,select months to "
			+ "show letter delivery summary,click on inbound Printed,click view letter "
			+ "from all locations,select number of letter pages to show and click on go "
			+ "button,click on last page and click on first page.)")
	public void outboundReleased() {

		jpayFacility().facilityEmail().clickEmailMainButton();
		jpayFacility().facilityEmail().selectLetterDeliveryMonths(monthNumber);//6
		jpayFacility().facilityEmail().clickInboundReleasedBucket();
		jpayFacility().facilityEmail().clickViewLetterFromAllLocationLink();
		jpayFacility().facilityEmail().selectNumberOfPagesOfLettersToShow2(pageNum500);//500
		jpayFacility().facilityEmail().clickNumberOfPagesOfLettersToShowGoButton();
		
	}

	
	/*********************************************************************************
	 * 
	 * Click on email main button,select months to show letter delivery summary,
	 * click on inbound requires Approval,click view letter from all locations,
	 * select number of letter pages to show and click on go button. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 18, description = "TestCases::WTC-73::Design Steps"
			+ "::107,108,109,110,111,112(Click on email main button,select months to show letter "
			+ "delivery summary,click on outbound Sent to security,click view letter from "
			+ "all locations,select number of letter pages to show and click on go button.)")
	public void outboundSentToSecurity() {

		jpayFacility().facilityEmail().clickEmailMainButton();
		jpayFacility().facilityEmail().selectLetterDeliveryMonths(monthNumber);//6
		jpayFacility().facilityEmail().clickOutboundSentToSecurityBucket();
		jpayFacility().facilityEmail().clickViewLetterFromAllLocationLink();
		jpayFacility().facilityEmail().selectNumberOfPagesOfLettersToShow1(pageNum500);//500
		jpayFacility().facilityEmail().clickNumberOfPagesOfLettersToShowGoButton();
		
		
	}


	/*********************************************************************************
	 * 
	 * Click on email main button,select months to show letter delivery summary,
	 * click on inbound requires Approval,click view letter from all locations,
	 * select number of letter pages to show and click on go button. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 19, description = "TestCases::WTC-73::Design Steps"
			+ "::113,114,115,116,117,118(Click on email main button,select months to show letter "
			+ "delivery summary,click on inbound Returned to customers,click view letter from "
			+ "all locations,select number of letter pages to show and click on go button.)")
	public void outboundPendingPrintItems() {

		jpayFacility().facilityEmail().clickEmailMainButton();
		jpayFacility().facilityEmail().selectLetterDeliveryMonths(monthNumber);//6
		jpayFacility().facilityEmail().clickOutboundCPendingPrintingItemsBucket();
		jpayFacility().facilityEmail().clickViewLetterFromAllLocationLink();
		jpayFacility().facilityEmail().selectNumberOfPagesOfLettersToShow2(pageNum500);//500
		jpayFacility().facilityEmail().clickNumberOfPagesOfLettersToShowGoButton();
		
		
	}


	/*********************************************************************************
	 * 
	 * Click on email main button,select months to show letter delivery summary,
	 * click on inbound censored,click view letter from all locations,
	 * select number of letter pages to show and click on go button. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 20, description = "TestCases::WTC-73::Design Steps"
			+ "::119,120,121,122,123,124(Click on email main button,select months to show letter "
			+ "delivery summary,click on Outbound Printed Items,click view letter from "
			+ "all locations,select number of letter pages to show and click on go button.)")
	public void outboundPrintedItems() {

		jpayFacility().facilityEmail().clickEmailMainButton();
		jpayFacility().facilityEmail().selectLetterDeliveryMonths(monthNumber);//6
		jpayFacility().facilityEmail().clickOutboundPrintedItemsBucket();
		jpayFacility().facilityEmail().clickViewLetterFromAllLocationLink();
		jpayFacility().facilityEmail().selectNumberOfPagesOfLettersToShow2(pageNum500);//500
		jpayFacility().facilityEmail().clickNumberOfPagesOfLettersToShowGoButton();
		
		
	}


	/*********************************************************************************
	 * 
	 * Click on email main button,select months to show letter delivery summary,
	 * click on inbound censored,click view letter from all locations,
	 * select number of letter pages to show and click on go button. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 21, description = "TestCases::WTC-73::Design Steps"
			+ "::125,126,127,128,129,130(Click on email main button,select months to show letter "
			+ "delivery summary,click on Outbound Returned to customers,click view letter from "
			+ "all locations,select number of letter pages to show and click on go button.)")
	public void outboundReleasedVideo() {

		jpayFacility().facilityEmail().clickEmailMainButton();
		jpayFacility().facilityEmail().selectLetterDeliveryMonths(monthNumber);//6
		jpayFacility().facilityEmail().clickOutboundReleasedVideoBucket();
		jpayFacility().facilityEmail().clickViewLetterFromAllLocationLink();
		jpayFacility().facilityEmail().selectNumberOfPagesOfLettersToShow2(pageNum500);//500
		jpayFacility().facilityEmail().clickNumberOfPagesOfLettersToShowGoButton();
		
		
	}
	
	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 22, description = "TestCases::WTC-73:: Design "
			+ "Steps::131(Click sign out button .)")
	public void testEnd() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_73Test(data) };
	}
	
	
	public EmailWTC_73Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		password = data.get("password");
		username = data.get("username");
		pinCode = data.get("pinCode");
		monthNumber = data.get("monthNumber");
		pageNum200 = data.get("pageNum200");
		pageNum500 = data.get("pageNum500");
		
		
	}

	


}
