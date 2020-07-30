package com.jpay.media.automation.web.email.pagesobjects;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.jpay.media.automation.web.baseobjects.BasePageObject;
import com.jpay.media.automation.web.utilities.Log;

public class HomePage extends BasePageObject{

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}


	
	/**********************************************
	 * CONSTRUCTOR****************************************
	 **************************************************************************************************
	 **************************************************************************************************/

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/


	// Email Link
	@FindBy(xpath = "(.//a[contains(text(),'Email')])[1]")
	private WebElement linkEmail;

	// Email and Videogram Link
	@FindBy(xpath = "//*[@id='nonpubfooter_rptFooter_ctl02_rptFooterDetail_ctl01_FooterLink']")
	private WebElement emailVideogramLink;
	
	// Chamge Link
	@FindBy(xpath = "//*[@id='newHeader_uclSelectedInmateFromSession_btnChangeInmate']")
	private WebElement changeLink;
	
	// Inmate select dropdown
	@FindBy(xpath = "//select[@id='inmatesDropDownList']")
	private WebElement selectInmate;

	// inmate selection dropdown
	@FindAll({ @FindBy(xpath = "//select[@id='inmatesDropDownList']/option") })
	private List<WebElement> inmateSelection;
	
	// Inmate select dropdown email videogram
	@FindBy(xpath = "//select[@id='newHeader_uclSelectedInmateFromSession_inmatesDropDownList']")
	private WebElement selectInmateEmailVideo;

	// inmate selection dropdown email videogram
	@FindAll({ @FindBy(xpath = "//select[@id='newHeader_uclSelectedInmateFromSession_inmatesDropDownList']/option") })
	private List<WebElement> inmateSelectionEmailVideo;
	
	// Email Link email-Videogram
	@FindBy(xpath = "//ul[@id='newHeader_WelcomeServiceList']//a[contains(text(),'Email')]")
	private WebElement emailLinkEmailVideo;
	
	// Inmate Search Link
	@FindBy(xpath = "(.//*[contains(text(),'Inmate Search')])[1]")
	private WebElement inmateSearchLink;
	
	// Delete Button
	@FindBy(xpath = "//*[@id='ViewInmatesMyDataGrid_ctl02_lnkRemove']")
	private WebElement deleteButton;
	
	// Enter Inmate state
	@FindBy(xpath = "//*[@id='pInmateSearch_StatesDropdownA_txtautofromDB']")
	private WebElement inmateState;
	
	// Enter Inmate id
	@FindBy(xpath = "//*[@id='pInmateSearch_txtInmateId']")
	private WebElement inmateId;
	
	// Search button
	@FindBy(xpath = "//*[@id='pInmateSearch_btnSearch']")
	private WebElement searchButton;
	
	// Inmate name link
	@FindBy(xpath = "//*[@id='InmateResultPanel_dgResults_ctl03_lnkInmateName']")
	private WebElement inmateNameLink;
	
	// select Relationship combobox
	@FindBy(xpath = "//select[@id='ucRelation_ddlRelation']")
	private WebElement selectRelation;
	
	//Add inmate continue button
	@FindBy(xpath = "//input[@id='ucRelation_btnRelation']")
	private WebElement addInmateContinueButton;
	
	//Inmate Search No Result Message
	@FindBy(xpath = "//span[@id='pInmateSearch_regexInmateMinLength']")
	private WebElement inmateSearchNoResultMsg;
	
	// No Result Page State select
	@FindBy(xpath = ".//*[@id='InmateResultPanel_uclSearchAgain_StatesDropdownB_txtautofromDB']")
	private WebElement selectStateNoResultPage;
	
	// No Result Page Inmate id
	@FindBy(xpath = ".//*[@id='InmateResultPanel_uclSearchAgain_tbSearchTextAgain_ResultsPanel']")
	private WebElement inmateIdNoResultPage;
	
	// No Result Page Search again button
	@FindBy(xpath = ".//*[@id='InmateResultPanel_uclSearchAgain_btnSearchAgain_ResultsPanel']")
	private WebElement searchAgainNoResultPage;
	
	// Invalid Inmate Search No Result Text
	@FindBy(xpath = "(.//*[@id='pInmateResult']//h1)[1]")
	private WebElement invalidInmateSearchNoResultText;

	// Invalid Schedule visit finally
	@FindBy(xpath = "//span[@id='lbl_msgstatus']")
	private WebElement invalidScheduleVisitFinally;

	// Invalid Video Visit Review on Schedule Visit
	@FindBy(xpath = "//span[@id='lblVisitTime']")
	private WebElement invalidVideoVisitReview;

	//Button add/edit
	@FindBy(xpath = "//a[@id='HyperLink2']")
	private WebElement buttonAddorEdit;

	//Button Next on "Schedule Visit"
	@FindBy(xpath = "//table[@id='cal_Schedule']/tbody/tr[1]/td/table/tbody/tr/td[3]/a")
	private WebElement buttonNextOnCalendar;

	//Select date on "Schedule Visit"
	@FindBy(xpath = "//table[@id='cal_Schedule']/tbody/tr[8]/td[1]/a")
	private WebElement selectDate;

	// Schedule Visit Link
	@FindBy(css = "#myheader_SidebarMenuTable>tbody>tr>td>div:nth-child(2)>a")
	private WebElement linkScheduleVisit;

	// Button continue btn_ContinueChooseInmate on "Schedule Visit"
	@FindBy(xpath = "//input[@id='btn_ContinueChooseInmate']")
	private WebElement buttonContinueChooseInmate;

	// Button continue btn_ContinueSelectDate on "Schedule Visit"
	@FindBy(xpath = "//input[@id='btn_ContinueSelectDate']")
	private WebElement buttonContinueSelectDate;

	// Button continue btn_ContinueSelectTime on "Schedule Visit"
	@FindBy(xpath = "//input[@id='btn_ContinueSelectTime']")
	private WebElement buttonContinueSelectTime;

	// Button continue btn_Initiate on "Schedule Visit"
	@FindBy(xpath = "//input[@id='btn_Initiate']")
	private WebElement buttonContinueVideoVisitReview;

	// Select Choose time on "Schedule Visit"
	@FindBy(xpath = "//select[@id='ddSelectTime']")
	private WebElement selectTimeOnScheduleVisit;

	// Choose time dropdown on "Schedule Visit"
	@FindAll({ @FindBy(xpath = "//select[@id='ddSelectTime']/option") })
	private List<WebElement> chooseTimeDropdown;
	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	/************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD***********************
	 ************************************************************************************************/
	public void selectRandomTimeOnScheduleVisit() {

		int size = chooseTimeDropdown.size();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(size);
		Log.info(">>>><<<<<   " + randomInt);
		selectElementByIndex(selectTimeOnScheduleVisit, randomInt);
		logging("Inmate Selected : " + chooseTimeDropdown.get(randomInt).getText());
	}
	public void clickButtonContinueVideoVisitReview(){

		click(buttonContinueVideoVisitReview);
	}

	public void clickButtonContinueSelectTime(){

		click(buttonContinueSelectTime);
	}

	public void clickButtonContinueChooseInmate(){

		click(buttonContinueChooseInmate);
	}

	public void clickButtonContinueSelectDate(){

		click(buttonContinueSelectDate);
	}

	public void clickScheduleVisitLink(){

		click(linkScheduleVisit);
	}

	public void selectDateOnCalendar() {
		click(buttonNextOnCalendar);
		click(selectDate);
	}

	public void clickButtonAddorEdit() {
		click(buttonAddorEdit);
	}

	public void selectRandomInmate() {

		int size = inmateSelection.size();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(size);
		Log.info(">>>><<<<<   " + randomInt);
		selectElementByIndex(selectInmate, randomInt);
		logging("Inmate Selected : " + inmateSelection.get(randomInt).getText());

	}
	
	public void selectRandomInmateFromEmailVideo() {
		
		List<WebElement>inmateSelectionEmailVideo=getDriver().findElements(By.xpath("//select[@id='newHeader_uclSelectedInmateFromSession_inmatesDropDownList']/option"));

		int size = inmateSelectionEmailVideo.size();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(size);
		Log.info(">>>><<<<<   " + randomInt);
		selectElementByIndex(selectInmateEmailVideo, randomInt);
		//logging("Inmate Selected : " + inmateSelectionEmailVideo.get(randomInt).getText());

	}

	public String setFacilityUsername() {

		String username = "";
		WebElement element = getDriver()
				.findElement(By.xpath(".//select[@id='inmatesDropDownList']/option[@selected='selected']"));
		String text = element.getText();
		String[] text1 = text.split(",");
		String facility = text1[2];
		System.out.println("<<<<>>>>>" + facility);
		if (facility.contentEquals(" Jpay")) {
			username = "jpay_jpay";
		} else if (facility.contentEquals(" Michigan Department Of Corrections")) {
			username = "jpay_midoc";
		} else if (facility.contentEquals(" Kansas Department Of Corrections")) {
			username = "jpay_ksdoc";
		} else if (facility.contentEquals(" Indiana Department Of Corrections")) {
			username = "jpay_indiana";
		} else if (facility.contentEquals(" Washington State Department Of Corrections")) {
			username = "jpay_wadoc";
		} else if (facility.contentEquals(" Louisiana Department Of Corrections")) {
			username = "jpay_Louisiana";
		} else if (facility.contentEquals(" Texas Department of Criminal Justice")) {
			username = "Jpay_TX";
		}
		logging("Facility username obtain  : " + username);
		return username;

	}

	public String getInmateName() {

		WebElement element = getDriver()
				.findElement(By.xpath(".//select[@id='inmatesDropDownList']/option[@selected='selected']"));
		return element.getText().split(",")[0];

	}
	
	public String getInmateId() {

		WebElement element = getDriver()
				.findElement(By.xpath(".//select[@id='inmatesDropDownList']/option[@selected='selected']"));
		String x= element.getText().split(",")[1];
		return x.substring(1, x.length());

	}
	
	public String getInmateFacility() {

		String y=null;
		WebElement element = getDriver()
				.findElement(By.xpath(".//select[@id='inmatesDropDownList']/option[@selected='selected']"));
		String x= element.getText().split(",")[2];
		if (x.substring(1, x.length()).equalsIgnoreCase("Jpay")) {
			y="JPAY";
		}else {
			y=x.substring(1, x.length());
		}
		return y;

	}

	public String getOneInmateName() {

		WebElement element = getDriver()
				.findElement(By.xpath("(.//*[@id='pagecontent']//table)[3]//label[2]"));
		return element.getText().split(",")[0];

	}
	
	public String getOneInmateId() {

		WebElement element = getDriver()
				.findElement(By.xpath("(.//*[@id='pagecontent']//table)[3]//label[2]"));
		String x= element.getText().split(",")[1];
		return x.substring(1, x.length());

	}
	
	public String getOneInmateFacility() {

		String y=null;
		WebElement element = getDriver()
				.findElement(By.xpath("(.//*[@id='pagecontent']//table)[3]//label[2]"));
		String x= element.getText().split(",")[2];
		if (x.substring(1, x.length()).equalsIgnoreCase("Jpay")) {
			y="JPAY";
		}else {
			y=x.substring(1, x.length());
		}
		return y;

	}
	
	public void clickEmailVideogramLink(){
		
		click(emailVideogramLink);
	}
	
	public void clickChangeLink(){
		
		click(changeLink);
	}
	
	public void clickEmailLinkEmailVideo(){
		
		click(emailLinkEmailVideo);
	}
	
	public void clickInmateSearch(){
		
		click(inmateSearchLink);
	}
	
	public void clickDeleteButton(){
		
		click(deleteButton);
	}
	
	public void enterInmateState(String state){
		
		inmateState.click();
		setText(inmateState, state);
		pressTab();
	}
	
	public void enterInmateId(String id){
		
		setText(inmateId, id);
	}
	
	public void clickSearchButton(){
		
		click(searchButton);
	}
	
	public void clickInmateNameLink(){
		
		click(inmateNameLink);
	}
	
	public void verifyInmateSearchNoResultMsg(String msg){
		
		assertionText("Message :: ", inmateSearchNoResultMsg, msg);
	}
	
	public void selectRelationWithInmate(String relation){
		
		logging("Relationship selected : "+relation);
		selectElementByVisibleText(selectRelation, relation);
	}
	
	public void clickAddInmateContinueButton(){
		
		logging("Clicking on : "+addInmateContinueButton.getAttribute("value"));
		addInmateContinueButton.click();
	}
	
	public boolean isInmateVisible(){
		
		try {
			return getDriver().findElement(By.xpath(".//table[@id='ViewInmatesMyDataGrid']//tr")).isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public void verifyInmateAdded(){
		
		logging("Inmate added : "+isInmateVisible());
		assertTrue(isInmateVisible());
	}
	
	public void verifyInmateDeleted(){
		
		logging("Inmate Deleted : "+!isInmateVisible());
		assertTrue(!isInmateVisible());
	}

    public void clickEmailLink(){
		
		click(linkEmail);
	}
	
	public void clickSelectStateNoResultPage() {
		
		selectStateNoResultPage.click();
		logging("Clicking on : Select State...");
		
	}

	public void selectInmateStateNoResultPage(String state) {
		
		pause(1000);
		setText(selectStateNoResultPage, state);
		pause(1000);
		selectStateNoResultPage.click();
		String xpath="//ul/li/a[contains(text(),'"+state+"')]";
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(getDriver().findElement(By.xpath(xpath))));
		click(element);

	}

	public void enterInmateIdNoResultPage(String id) {

		setText(inmateIdNoResultPage, id);
	}

	public void clickSearchAgainNoResultPage() {

		click(searchAgainNoResultPage);
	}
	
	public void verifyInvalidInmateSearchNoResultText(String text){
		
		assertionText("AlertText :: ",invalidInmateSearchNoResultText, text);
	}

	public void verifyScheduleVisitFinally(String text){

		assertionText("AlertText :: ",invalidScheduleVisitFinally, text);
	}

	public void verifyScheduleVisit(){
		int size = chooseTimeDropdown.size();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(size);
		String textOfRandomTime = chooseTimeDropdown.get(randomInt).getText();
		assertionText("AlertText :: ",invalidVideoVisitReview, textOfRandomTime);
	}
	
	
}
