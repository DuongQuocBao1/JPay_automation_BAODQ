package com.jpay.media.automation.web.grievancekiosk.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;

public class GrievanceTC_119Test extends BaseTestObject{

	private String variation="QA";
	private String loginDetails="";
	private String usernameFacility="";
	private String pinCode = "";
	private String passwordFacility="";
	private String facilitySystem = "";
	private String communicationLink = "";
	private String filenameBMP = "";
	private String fileExtErrMsg1="";
	private String filenameDocx="";
	private String filenamexlsx="";
	private String fileExtErrMsg2="";
	private String filenameLarge="";
	private String filenamePng="";
	private String fileUploadConMsg="";
	private String filenameJpg="";
	private String filenamePdf="";
	private String filenameTxt="";
	private String usernameFacility1;
	private String passwordFacility1;
	private String unauthoErrMsg;
	private String content;
	private String removeConfirmationMessage;
	public static String refNumber = "";
	
	
	/*********************************************************************************
	 * 
	 * Navigate to Facility website and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "Design Steps::1,2(Navigate "
			+ "to Facility website and verify Login details.)")
	public void testStart() {
		
		jpayFacility().facilityLogin().loadURL(envUrlFacility,variation);
		jpayFacility().facilityLogin().verifyLoginDetails(loginDetails);
		
	}
	
	/*********************************************************************************
	 * 
	 * Enter username,pincode,password,click login button and verify Facility 
	 * system and Communications tab is absent.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "Design Steps::3,4,5,6,7,8"
			+ "(Enter username,pincode,password,click login button and verify "
			+ "Facility system and Communications tab is present.)")
	public void loginAndVerify1() {
		
		jpayFacility().facilityLogin().enterUsername(usernameFacility);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(passwordFacility);
		jpayFacility().facilityLogin().clickLoginButton();
		jpayFacility().facilityHome().verifyFacilitySystem(facilitySystem);
		jpayFacility().facilityHome().verifyFacilityHeaderTabPresent(communicationLink );
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on Communications,click on new and verify reference is present.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "Design Steps::9,10,11"
			+ "(Click on Communications,click on new and verify reference is present.)")
	public void clickNewCommunicationsAndVerify() {
		
		jpayFacility().facilityCommunications().clickCommunicationsLink();
		jpayFacility().facilityCommunications().clickNewLink();
		jpayFacility().facilityCommunications().verifyRefNumberPresent();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on Reference number,click on attachment link,click on browse 
	 * file button,enter bmp file path to attach,click open to attach file 
	 * and verify file extension error message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "Design Steps::12,13,14,15,16,17"
			+ "(Click on Reference number,click on attachment link,click on browse file "
			+ "button,enter bmp file path to attach,click open to attach file and verify "
			+ "file extension error message.)")
	public void AttachBmpFileAndVerify() {
		
		jpayFacility().facilityCommunications().clickFirstRefNumber();
		jpayFacility().facilityCommunications().clickAttachmentsLink();
		jpayFacility().facilityCommunications().clickBrowseFileButton();
		jpayFacility().facilityCommunications().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenameBMP);
		jpayFacility().facilityCommunications().verifyFileExtensionErrorMessage(fileExtErrMsg1);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on ok button,click on browse file button,enter docx file 
	 * path to attach,click open to attach file  and verify 
	 * file extension error message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "Design Steps::18,19,20,21,22"
			+ "(Click on ok button,click on browse file button,enter docx file path to "
			+ "attach,click open to attach file and verify file extension error message.)")
	public void AttachDocxFileAndVerify() {
		
		jpayFacility().facilityCommunications().clickOkButton();
		jpayFacility().facilityCommunications().clickBrowseFileButton();
		jpayFacility().facilityCommunications().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenameDocx);
		jpayFacility().facilityCommunications().verifyFileExtensionErrorMessage(fileExtErrMsg1);
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on ok button,click on browse file button,enter xlsx file 
	 * path to attach,click open to attach file  and verify 
	 * file extension error message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "Design Steps::23,24,25,26,27"
			+ "(Click on ok button,click on browse file button,enter xlsx file path to "
			+ "attach,click open to attach file and verify file extension error message.)")
	public void AttachXlsxFileAndVerify() {
		
		jpayFacility().facilityCommunications().clickOkButton();
		jpayFacility().facilityCommunications().clickBrowseFileButton();
		jpayFacility().facilityCommunications().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenamexlsx);
		jpayFacility().facilityCommunications().verifyFileExtensionErrorMessage(fileExtErrMsg1);
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on ok button,click on browse file button,enter large file 
	 * path to attach,click open to attach file  and verify 
	 * maximum file upload error message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "Design Steps::28,29,30,31,32,33"
			+ "(Click on ok button,click on browse file button,enter large file path to "
			+ "attach,click open to attach file and verify maximum file upload error message.)")
	public void AttachLargeFileAndVerify() {
		
		jpayFacility().facilityCommunications().clickOkButton();
		jpayFacility().facilityCommunications().clickBrowseFileButton();
		jpayFacility().facilityCommunications().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenameLarge);
		jpayFacility().facilityCommunications().clickAttachFileButton();
		jpayFacility().facilityCommunications().verifyFileExtensionErrorMessage(fileExtErrMsg2);
		System.out.println();
		
	}
	

	
	/*********************************************************************************
	 * 
	 * Click on ok button,click on browse file button,enter png file 
	 * path to attach,click open to attach file  and verify 
	 * file upload confirmation message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "Design Steps::34,35,36,37,38,39"
			+ "(Click on ok button,click on browse file button,enter xlsx file path to "
			+ "attach,click open to attach file and verify file upload confirmation message.)")
	public void AttachPngFileAndVerify1() {
		
		jpayFacility().facilityCommunications().clickOkButton();
		jpayFacility().facilityCommunications().clickBrowseFileButton();
		jpayFacility().facilityCommunications().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenamePng);
		jpayFacility().facilityCommunications().clickAttachFileButton();
		jpayFacility().facilityCommunications().verifyFileUploadConfirmationMessage(fileUploadConMsg);
		
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on no button and verify file is not uploaded.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "Design Steps::40,41"
			+ "(Click on no button and verify file is not uploaded.)")
	public void clickNoAndVerify1() {

		jpayFacility().facilityCommunications().clickNoButton();
		jpayFacility().facilityCommunications().verifyFileIsNotAttached(filenamePng);
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on browse file button,enter png file 
	 * path to attach,click open to attach file  and verify 
	 * file upload confirmation message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "Design Steps::42,43,44,45,46"
			+ "(Click on browse file button,enter jpg file path to attach,click "
			+ "open to attach file and verify file upload confirmation message.)")
	public void AttachPngFileAndVerify2() {
		
		jpayFacility().facilityCommunications().clickBrowseFileButton();
		jpayFacility().facilityCommunications().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenamePng);
		jpayFacility().facilityCommunications().clickAttachFileButton();
		jpayFacility().facilityCommunications().verifyFileUploadConfirmationMessage(fileUploadConMsg);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on yes button and verify file is uploaded.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "Design Steps::47,48"
			+ "(Click on yes button and verify file is uploaded.)")
	public void clickYesAndVerify1() {

		jpayFacility().facilityCommunications().clickYesButton();
		jpayFacility().facilityCommunications().verifyFileIsAttached(filenamePng);
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on browse file button,enter jpg file 
	 * path to attach,click open to attach file  and verify 
	 * file upload confirmation message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "Design Steps::49,50,51,52,53"
			+ "(Click on browse file button,enter jpg file path to attach,click "
			+ "open to attach file and verify file upload confirmation message.)")
	public void AttachJpgFileAndVerify() {
		
		jpayFacility().facilityCommunications().clickBrowseFileButton();
		jpayFacility().facilityCommunications().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenameJpg);
		jpayFacility().facilityCommunications().clickAttachFileButton();
		jpayFacility().facilityCommunications().verifyFileUploadConfirmationMessage(fileUploadConMsg);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on yes button and verify file is uploaded.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "Design Steps::54,55"
			+ "(Click on yes button and verify file is uploaded.)")
	public void clickYesAndVerify2() {

		jpayFacility().facilityCommunications().clickYesButton();
		jpayFacility().facilityCommunications().verifyFileIsAttached(filenameJpg);
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on browse file button,enter Pdf file 
	 * path to attach,click open to attach file  and verify 
	 * file upload confirmation message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 14, description = "Design Steps::56,57,58,59,60"
			+ "(Click on browse file button,enter Pdf file path to attach,click "
			+ "open to attach file and verify file upload confirmation message.)")
	public void AttachPdfFileAndVerify() {
		
		jpayFacility().facilityCommunications().clickBrowseFileButton();
		jpayFacility().facilityCommunications().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenamePdf);
		jpayFacility().facilityCommunications().clickAttachFileButton();
		jpayFacility().facilityCommunications().verifyFileUploadConfirmationMessage(fileUploadConMsg);
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on yes button and verify file is uploaded.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 15, description = "Design Steps::61,62"
			+ "(Click on yes button and verify file is uploaded.)")
	public void clickYesAndVerify3() {

		jpayFacility().facilityCommunications().clickYesButton();
		jpayFacility().facilityCommunications().verifyFileIsAttached(filenamePdf);
		
	}
	

	
	/*********************************************************************************
	 * 
	 * Click on browse file button,enter Txt file 
	 * path to attach,click open to attach file  and verify 
	 * file upload confirmation message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 16, description = "Design Steps::63,64,64,65,66"
			+ "(Click on browse file button,enter Txt file path to attach,click "
			+ "open to attach file and verify file upload confirmation message.)")
	public void AttachTxtFileAndVerify() {
		
		jpayFacility().facilityCommunications().clickBrowseFileButton();
		jpayFacility().facilityCommunications().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenameTxt);
		jpayFacility().facilityCommunications().clickAttachFileButton();
		jpayFacility().facilityCommunications().verifyFileUploadConfirmationMessage(fileUploadConMsg);
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on yes button and verify file is uploaded.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 17, description = "Design Steps::67,68"
			+ "(Click on yes button and verify file is uploaded.)")
	public void clickYesAndVerify4() {

		jpayFacility().facilityCommunications().clickYesButton();
		jpayFacility().facilityCommunications().verifyFileIsAttached(filenameTxt);
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Get reference number from details,click on sign out button and verify login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 18, description = "Design Steps::69,70,71"
			+ "(Get reference number from details,Click sign out button "
			+ "and verify Login details.)")
	public void logoutAndVerify1() {
		
		refNumber = jpayFacility().facilityCommunications().getRefNumber();
		jpayFacility().facilityHome().clickSignOutButton();
		jpayFacility().facilityLogin().verifyLoginDetails(loginDetails);
		
	}
	
	
	
	/*********************************************************************************
	 * 
	 * Navigate to Facility website and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 19, description = "Design Steps::72,73(Navigate "
			+ "to Facility website and verify Login details.)")
	public void navigateToFacilitySiteAndVerify2() {
		
		jpayFacility().facilityLogin().loadURL(envUrlFacility);
		jpayFacility().facilityLogin().verifyLoginDetails(loginDetails);
		
	}
	
	/*********************************************************************************
	 * 
	 * Enter username,pincode,password,click login button and verify Facility 
	 * system and Communications tab is present.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 20, description = "Design Steps::74,75,76,77,78,79"
			+ "(Enter username,pincode,password,click login button and verify "
			+ "Facility system and Communications tab is present.)")
	public void loginAndVerify2() {
		
		jpayFacility().facilityLogin().enterUsername(usernameFacility1);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(passwordFacility1);
		jpayFacility().facilityLogin().clickLoginButton();
		jpayFacility().facilityHome().verifyFacilitySystem(facilitySystem);
		jpayFacility().facilityHome().verifyFacilityHeaderTabPresent(communicationLink );
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on Communications and Search link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 21, description = "Design Steps::80,81"
			+ "(Click on Communications and Search link.)")
	public void clickCommunicationsAndSearchLink1() {
		
		jpayFacility().facilityCommunications().clickCommunicationsLink();
		jpayFacility().facilityCommunications().clickSearchLink();
		
	}
	

	/*********************************************************************************
	 * 
	 * Enter reference number in search box,click search 
	 * button and verify reference number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 22, description = "Design Steps::82,83,84(Enter "
			+ "reference number in search box,click search button and verify reference number.)")
	public void enterRefNoAndVerify1() {
		
		jpayFacility().facilityCommunications().enterRefInSearchBox(refNumber);
		jpayFacility().facilityCommunications().clickSearchButton();
		jpayFacility().facilityCommunications().verifyRefNoLink(refNumber);
	
	}
	

	/*********************************************************************************
	 * 
	 * Click on reference number and verify reference number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 23, description = "Design Steps::85,86(Click "
			+ "on reference number and verify reference number.)")
	public void clickRefNoAndVerify1() {
		
		jpayFacility().facilityCommunications().clickFirstRefNumber();
		jpayFacility().facilityCommunications().verifyRefNoDetails(refNumber);

	}
	
	
	/*********************************************************************************
	 * 
	 * Click on Attachment link,click on remove link 
	 * and verify unathorize user error message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 24, description = "Design Steps::87,88,89(Click on "
			+ "Attachment link,click on remove link and verify unathorize user error message.)")
	public void clickAttachmentAndVerify() {
		
		jpayFacility().facilityCommunications().clickAttachmentsLink();
		jpayFacility().facilityCommunications().clickRemoveLink();
		jpayFacility().facilityCommunications().verifyUnauthorizeErrorMessage(unauthoErrMsg);

	}
	

	/*********************************************************************************
	 * 
	 * Click on button,verify files are attached and displayed,
	 * click on view of text file and verify the file content 
	 * and navigate browser back.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 25, description = "Design Steps::90,91,92,93,94,"
			+ "95,96,97(Click on button,verify files are attached and displayed,click "
			+ "on view of text file and verify the file content and navigate browser back.)")
	public void verifyFileAttachedAndContent() {
		
		jpayFacility().facilityCommunications().clickOkButton();
		jpayFacility().facilityCommunications().verifyViewLinkIsDisplayed(filenameTxt);
		jpayFacility().facilityCommunications().verifyViewLinkIsDisplayed(filenamePdf);
		jpayFacility().facilityCommunications().verifyViewLinkIsDisplayed(filenameJpg);
		jpayFacility().facilityCommunications().verifyViewLinkIsDisplayed(filenamePng);
		jpayFacility().facilityCommunications().clickViewLink(filenameTxt);
		jpayFacility().facilityCommunications().verifyTxtFileContent(content);
		jpayFacility().facilityCommunications().navigateBrowserBack();

	}
	

	/*********************************************************************************
	 * 
	 * Click on sign out button and verify login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 26, description = "Design Steps::98,99"
			+ "(Click sign out button and verify Login details.)")
	public void logoutAndVerify2() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		jpayFacility().facilityLogin().verifyLoginDetails(loginDetails);
		
	}
	

	/*********************************************************************************
	 * 
	 * Navigate to Facility website and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 27, description = "Design Steps::100,101(Navigate "
			+ "to Facility website and verify Login details.)")
	public void navigateToFacilitySiteAndVerify3() {
		
		jpayFacility().facilityLogin().loadURL(envUrlFacility);
		jpayFacility().facilityLogin().verifyLoginDetails(loginDetails);
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Enter username,pincode,password,click login button and verify Facility 
	 * system and Communications tab is present.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 28, description = "Design Steps::102,103,104,"
			+ "105,106,107(Enter username,pincode,password,click login button and "
			+ "verify Facility system and Communications tab is present.)")
	public void loginAndVerify3() {
		
		jpayFacility().facilityLogin().enterUsername(usernameFacility);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(passwordFacility);
		jpayFacility().facilityLogin().clickLoginButton();
		jpayFacility().facilityHome().verifyFacilitySystem(facilitySystem);
		jpayFacility().facilityHome().verifyFacilityHeaderTabPresent(communicationLink );
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on Communications and Search link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 29, description = "Design Steps::108,109"
			+ "(Click on Communications and Search link.)")
	public void clickCommunicationsAndSearchLink2() {
		
		jpayFacility().facilityCommunications().clickCommunicationsLink();
		jpayFacility().facilityCommunications().clickSearchLink();
		
	}
	

	/*********************************************************************************
	 * 
	 * Enter reference number in search box,click search 
	 * button and verify reference number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 30, description = "Design Steps::110,111,112(Enter "
			+ "reference number in search box,click search button and verify reference number.)")
	public void enterRefNoAndVerify() {
		
		jpayFacility().facilityCommunications().enterRefInSearchBox(refNumber);
		jpayFacility().facilityCommunications().clickSearchButton();
		jpayFacility().facilityCommunications().verifyRefNoLink(refNumber);
	
	}
	

	/*********************************************************************************
	 * 
	 * Click on reference number and verify reference number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 31, description = "Design Steps::113,114(Click "
			+ "on reference number and verify reference number.)")
	public void clickRefNoAndVerify() {
		
		jpayFacility().facilityCommunications().clickFirstRefNumber();
		jpayFacility().facilityCommunications().verifyRefNoDetails(refNumber);

	}
	
	/*********************************************************************************
	 * 
	 * Click on attachment,click on browse file button,enter Pdf file 
	 * path to attach,click open to attach file  and verify 
	 * file upload confirmation message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 32, description = "Design Steps::115,116,117,118,"
			+ "119,120(Click on attachment,click on browse file button,enter Pdf file "
			+ "path to attach,click open to attach file and verify file upload "
			+ "confirmation message.)")
	public void AttachPdfFileAgainAndVerify() {
		
		jpayFacility().facilityCommunications().clickAttachmentsLink();
		jpayFacility().facilityCommunications().clickBrowseFileButton();
		jpayFacility().facilityCommunications().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenamePdf);
		jpayFacility().facilityCommunications().clickAttachFileButton();
		jpayFacility().facilityCommunications().verifyFileUploadConfirmationMessage(fileUploadConMsg);
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on yes button and verify file is uploaded 
	 * and displayed,click view link,verify file displays 
	 * and navigate browser back.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 33, description = "Design Steps::121,122,123,124,125"
			+ "(Click on yes button and verify file is uploaded and displayed,click view "
			+ "link,verify file displays and navigate browser back.)")
	public void clickYesAndVerify5() {

		jpayFacility().facilityCommunications().clickYesButton();
		jpayFacility().facilityCommunications().verifyFileIsAttached(filenamePdf);
		jpayFacility().facilityCommunications().verifyViewLinkIsDisplayed(filenamePdf);
		jpayFacility().facilityCommunications().clickViewLink(filenamePdf);
		jpayFacility().facilityCommunications().navigateBrowserBack();
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on remove button of first pdf,verify remove confirmation message,
	 * click no button,click on remove button of first pdf,verify remove 
	 * confirmation message,click yes button,click on remove button of 
	 * second pdf,verify remove confirmation message,click yes button 
	 * and verify pdf files are not attached and displayed.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 34, description = "Design Steps::126,127,128,129,"
			+ "130,131,132,133,134,135,136(Click on remove button of first pdf,verify "
			+ "remove confirmation message,click no button,click on remove button "
			+ "of first pdf,verify remove confirmation message,click yes button,click "
			+ "on remove button of second pdf,verify remove confirmation message,click "
			+ "yes button and verify pdf files are not attached and displayed.)")
	public void removePdfsAndVerify() {

		jpayFacility().facilityCommunications().clickRemoveLink(filenamePdf);
		jpayFacility().facilityCommunications().verifyRemoveConfirmationMessage(removeConfirmationMessage);
		jpayFacility().facilityCommunications().clickNoButton();
		jpayFacility().facilityCommunications().clickRemoveLink(filenamePdf);
		jpayFacility().facilityCommunications().verifyRemoveConfirmationMessage(removeConfirmationMessage);
		jpayFacility().facilityCommunications().clickYesButton();
		jpayFacility().facilityCommunications().clickRemoveLink(filenamePdf);
		jpayFacility().facilityCommunications().verifyRemoveConfirmationMessage(removeConfirmationMessage);
		jpayFacility().facilityCommunications().clickYesButton();
		jpayFacility().facilityCommunications().verifyFileIsNotAttached(filenamePdf);
		jpayFacility().facilityCommunications().verifyViewLinkIsNotDisplayed(filenamePdf);
		
	}
	

	
	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 35, description = "Design Steps::137,138"
			+ "(Click sign out button and verify Login details.)")
	public void endTest() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		jpayFacility().facilityLogin().verifyLoginDetails(loginDetails);
		
	}
	
	
	
	
	
	
	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new GrievanceTC_119Test(data) };
	}
	
	
	public GrievanceTC_119Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		loginDetails = data.get("loginDetails");
		usernameFacility = data.get("usernameFacility");
	    passwordFacility = data.get("passwordFacility");
	    usernameFacility1 = data.get("usernameFacility1");
	    passwordFacility1 = data.get("passwordFacility1");
		pinCode = data.get("pinCode");
		facilitySystem = data.get("facilitySystem");
		communicationLink = data.get("communicationLink");
		filenameBMP = data.get("filenameBMP");
		fileExtErrMsg1 = data.get("fileExtErrMsg1");
		filenameDocx = data.get("filenameDocx");
		filenamexlsx = data.get("filenamexlsx");
		filenameLarge = data.get("filenameLarge");
		fileExtErrMsg2 = data.get("fileExtErrMsg2");
		filenamePng = data.get("filenamePng");
		fileUploadConMsg = data.get("fileUploadConMsg");
		filenameJpg = data.get("filenameJpg");
		filenamePdf = data.get("filenamePdf");
		filenameTxt = data.get("filenameTxt");
		unauthoErrMsg = data.get("unauthoErrMsg");
		content = data.get("content");
		removeConfirmationMessage = data.get("removeConfirmationMessage");
	}

}
