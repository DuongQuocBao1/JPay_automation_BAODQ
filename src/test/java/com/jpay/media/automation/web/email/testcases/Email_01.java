package com.jpay.media.automation.web.email.testcases;
import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;

public class Email_01 extends BaseTestObject{
    public String username = "";
    public String password = "";
    private String variation;

    @Test(enabled = true, priority = 1, description = "Go to login page")
    public void testStart() {
        jpayEmail().login().loadURL(envUrlJpay,variation);
        jpayEmail().login().clickLoginLink();
        jpayEmail().login().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
    }

    @Test(enabled = true, priority = 2, description = "Login")
    public void loginAndVerify() {
        jpayEmail().login().enterUsername(username);
        jpayEmail().login().enterPassword(password);
        jpayEmail().login().clickLoginButton();
        jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
    }

    @Test(enabled = false, priority = 3, description = "Test something")
    public void selectInmateAndClickAdd_orEdit() {
        jpayEmail().home().clickButtonAddorEdit();
        jpayEmail().home().enterInmateId("00");
        jpayEmail().home().clickSearchButton();
        jpayEmail().home().verifyInmateSearchNoResultMsg(PageConstant.INMATE_INFORMATION_MSG);
    }

    @Test(enabled = true, priority = 4, description = "Test something")
    public void testScheduleVisit() {
        jpayEmail().headerNavigation().clickVideoVisitationLink();
        jpayEmail().home().clickScheduleVisitLink();
        jpayEmail().home().clickButtonContinueChooseInmate();
        jpayEmail().home().selectDateOnCalendar();
        jpayEmail().home().clickButtonContinueSelectDate();
        jpayEmail().home().selectRandomTimeOnScheduleVisit();
        jpayEmail().home().clickButtonContinueSelectTime();
        jpayEmail().home().verifyScheduleVisit();
        jpayEmail().home().clickButtonContinueVideoVisitReview();
        jpayEmail().home().verifyScheduleVisitFinally(PageConstant.SCHEDULE_VISIT);
    }

    @Test(enabled = false, priority = 5, description = "Logout")
    public void testEnd() {
        jpayEmail().headerNavigation().clickHomeLink();
        jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
        jpayEmail().login().clickLogoutButton();
    }

    @Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
    public static Object[] createInstances(Map<String, String>data) {
        return new Object[] { new Email_01(data) };
    }
    public Email_01(Map<String, String> data) {
        super(data);
        username = data.get("username");
        password =data.get("password");
        variation = data.get("variation");
    }
}
