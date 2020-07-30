package com.jpay.media.automation.web.grievancekiosk.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;

public class GrievanceTC_120Test extends BaseTestObject{

    private String variation="QA";
    private String loginDetails="";
    private String usernameFacility="";
    private String pinCode = "";
    private String passwordFacility="";
    private String facilitySystem = "";
    private String communicationLink = "";
    private String initialNotes="Leave an internal note to be viewed by STAFF only.";
    private String noAdminNotes="This communication do not have any admin note.";
    private String adminNotes;
    private String editNotesHeaderText="Editing Admin Note";
    private String enterNotesHeaderText="Enter Admin Note:";
    private String noteEditedText="*Note Edited.";
    private String commentEditedText="This comment has been edited";
    private String confirmation="Confirmation";
    private String deleteConText="Do you want to delete this admin note? ";
    private String noteDeletedText="*Note Deleted.";
    
    
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
     * Click on Communications,click on reference number,click on admin 
     * notes tab and verify submit notes button is present,no admin 
     * notes text and admin notes initial textarea text.
    * 
     **********************************************************************************/

    @Test(enabled = true, priority = 3, description = "Design Steps::9,10,11,12,13,14"
             + "(Click on Communications,click on reference number,click on admin notes "
             + "tab and verify submit notes button is present,no admin notes text and "
             + "admin notes initial textarea text.)")
    public void goToAdminNotesAndVerify() {
         
        jpayFacility().facilityCommunications().clickCommunicationsLink();
         jpayFacility().facilityCommunications().clickNewLink();
        jpayFacility().facilityCommunications().clickFirstRefNumber();
        jpayFacility().facilityCommunications().clickAdminNotesLink();
        jpayFacility().facilityCommunications().verifySubmitNotesPresent();
        jpayFacility().facilityCommunications().verifyNoAdminNotesText(noAdminNotes);
        jpayFacility().facilityCommunications().verifyAdminNotesInitialText(initialNotes);
         
         
    }
    
    /*********************************************************************************
    * 
     * Enter long admin notes,click on submit notes and verify edit and delete note is present.
    * 
     **********************************************************************************/

    @Test(enabled = true, priority = 4, description = "Design Steps::15,16,17,18(Enter "
             + "long admin notes,click on submit notes and verify edit and delete "
             + "note is present.)")
    public void enterSubmitNotesAndVerify() {
         
        jpayFacility().facilityCommunications().enterAdminNotes(adminNotes);
        jpayFacility().facilityCommunications().clickSubmitNotesButton();
        jpayFacility().facilityCommunications().verifyEditNotesPresent();
        jpayFacility().facilityCommunications().verifyDeleteNotesPresent();
         
    }
    
    /*********************************************************************************
    * 
     * Click on edit note button,verify edit notes and enter notes header text,verify yes and no button is present,click on button,Click on edit note button,verify edit notes and enter notes header text,verify yes and no button is present,click on yes button and verify note edited and comment edited text.
    * 
     **********************************************************************************/

    @Test(enabled = true, priority = 5, description = "Design Steps::19,20,21,22,23,24,"
             + "25,26,27,28,29,30,31,32(Click on edit note button,verify edit notes and "
             + "enter notes header text,verify yes and no button is present,click on "
             + "button,Click on edit note button,verify edit notes and enter notes "
             + "header text,verify yes and no button is present,click on yes button "
             + "and verify note edited and comment edited text.)")
    public void clickEditNotesAndVerify() {
         
        jpayFacility().facilityCommunications().clickEditNotesButton();
        jpayFacility().facilityCommunications().verifyEditNotesHeaderText(editNotesHeaderText);
        jpayFacility().facilityCommunications().verifyEnterAdminNotesHeaderText(enterNotesHeaderText);
        jpayFacility().facilityCommunications().verifyYesButtonPresent();
        jpayFacility().facilityCommunications().verifyNoButtonPresent();
        jpayFacility().facilityCommunications().clickNoButton();
        jpayFacility().facilityCommunications().clickEditNotesButton();
        jpayFacility().facilityCommunications().verifyEditNotesHeaderText(editNotesHeaderText);
        jpayFacility().facilityCommunications().verifyEnterAdminNotesHeaderText(enterNotesHeaderText);
        jpayFacility().facilityCommunications().verifyYesButtonPresent();
        jpayFacility().facilityCommunications().verifyNoButtonPresent();
        jpayFacility().facilityCommunications().clickYesButton();
        jpayFacility().facilityCommunications().verifyNoteEditedText(noteEditedText);
        jpayFacility().facilityCommunications().verifyCommentEditedText(commentEditedText);
         
         
         
    }
    
    /*********************************************************************************
    * 
     * Click on Delete note button,verify delete notes confirmation and confirmation text,verify yes and no button is present,click on button,Click on Delete note button,verify delete notes confirmation and confirmation text,click on yes button and verify note deleted text.
    * 
     **********************************************************************************/

    @Test(enabled = true, priority = 6, description = "Design Steps::33,34,35,36,37,38,"
             + "39,40,41,42,43,44,45(Click on Delete note button,verify delete notes "
             + "confirmation and confirmation text,verify yes and no button is present,"
             + "click on button,Click on Delete note button,verify delete notes "
             + "confirmation and confirmation text,click on yes button and verify "
             + "note deleted text.)")
    public void clickDeleteNotesAndVerify() {
         
        jpayFacility().facilityCommunications().clickDeleteNotesButton();
        jpayFacility().facilityCommunications().verifyDeleteNotesConfirmation(confirmation);
        jpayFacility().facilityCommunications().verifyDeleteNotesConfirmationText(deleteConText);
        jpayFacility().facilityCommunications().verifyYesButtonPresent();
        jpayFacility().facilityCommunications().verifyNoButtonPresent();
        jpayFacility().facilityCommunications().clickNoButton();
        jpayFacility().facilityCommunications().clickDeleteNotesButton();
        jpayFacility().facilityCommunications().verifyDeleteNotesConfirmation(confirmation);
        jpayFacility().facilityCommunications().verifyDeleteNotesConfirmationText(deleteConText);
        jpayFacility().facilityCommunications().verifyYesButtonPresent();
        jpayFacility().facilityCommunications().verifyNoButtonPresent();
        jpayFacility().facilityCommunications().clickYesButton();
        jpayFacility().facilityCommunications().verifyNoteDeletedText(noteDeletedText);
         
         
         
    }
    
    
    /*********************************************************************************
    * 
     * Click sign out button and verify Login details.
    * 
     **********************************************************************************/

    @Test(enabled = true, priority = 7, description = "Design Steps::46,47"
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
         return new Object[] { new GrievanceTC_120Test(data) };
    }
    
    
    public GrievanceTC_120Test(Map<String, String> data) {
         super(data);
         
         
         variation = data.get("variation");
         loginDetails = data.get("loginDetails");
         usernameFacility = data.get("usernameFacility");
        passwordFacility = data.get("passwordFacility");
         pinCode = data.get("pinCode");
         facilitySystem = data.get("facilitySystem");
         communicationLink = data.get("communicationLink");
         initialNotes = data.get("initialNotes");
         noAdminNotes = data.get("noAdminNotes");
         adminNotes = data.get("adminNotes");
         editNotesHeaderText = data.get("editNotesHeaderText");
         enterNotesHeaderText = data.get("enterNotesHeaderText");
         noteEditedText = data.get("noteEditedText");
         commentEditedText = data.get("commentEditedText");
         confirmation = data.get("confirmation");
         deleteConText = data.get("deleteConText");
         noteDeletedText = data.get("noteDeletedText");
         
    
         
    }


}
