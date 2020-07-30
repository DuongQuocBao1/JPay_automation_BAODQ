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

public class LoginPage extends BasePageObject {

	/************************************************************************************************
	 ******************************************* CONSTRUCTOR*****************************************
	 ************************************************************************************************/

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	/***********************************************CONSTRUCTOR****************************************
	 **************************************************************************************************
	 **************************************************************************************************/

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	// LogIn Link
	@FindBy(xpath = "//*[@id='newHeader_TopRightNavButton_lnkLogin']/div")
	private WebElement linkLogin;

	// Username
	@FindBy(xpath = "//*[@id='uclLoginFirstTime_txtUserId']")
	private WebElement username;

	// password
	@FindBy(xpath = "//*[@id='uclLoginFirstTime_txtPassword']")
	private WebElement password;

	// LogIn Button
	@FindBy(xpath = "//*[@id='uclLoginFirstTime_btnContinue']/div")
	private WebElement buttonLogin;

	// Logout Button
	@FindBy(xpath = "//*[@id='myheader_TopRightNavButton_lnkLogout']/div")
	private WebElement buttonLogout;

	// Inmate select dropdown
	@FindBy(xpath = "//select[@id='inmatesDropDownList']")
	private WebElement selectInmate;

	// inmate selection dropdown
	@FindAll({ @FindBy(xpath = "//select[@id='inmatesDropDownList']/option") })
	private List<WebElement> inmateSelection;
	
	// Invalid id password Error message
	@FindBy(xpath = "//span[@id='uclLoginFirstTime_CustomValidator1']")
	private WebElement idPasswodErrorMessage;
	
	// Forgot password Link
	@FindBy(xpath = "//a[@id='uclLoginFirstTime_lbForgotPassword']")
	private WebElement forgotPasswordLink;
	
	// Enter email address input box
	@FindBy(xpath = "//input[@id='sEmail']")
	private WebElement enterEmailAddInput;
	
	//Password Reset link
	@FindBy(xpath = "//input[@id='btnSendResetLink']")
	private WebElement passwordResetLink;
	
	//Forgot Password Text
	@FindBy(xpath = ".//*[@class='forgot_title_container']//h1")
	private WebElement forgotPasswordText;
	
	//Reset Password Instruction Text
	@FindBy(xpath = ".//*[@id='pResetPasswordSent']")
	private WebElement resetPasswordInsText;

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	/************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD***********************
	 ************************************************************************************************/

	public void verifyLoginTitle(String title) {
		assertionText(getPageTitle(), title);
	}

	public void clickSelectState(String state) {

		WebElement element = getDriver().findElement(By.xpath("//ul/li/a[contains(text(),'" + state + "')]"));
		click(element);
	}

	public void enterUsername(String userId) {

		setText(username, userId);
	}

	public void enterPassword(String pass) {

		setText(password, pass);
	}

	public void clickLoginButton() {

		logging("Clicking on : Login");
		buttonLogin.click();
		wait.until(ExpectedConditions.elementToBeClickable(buttonLogout));
	}

	public void clickLoginButton1() {

		logging("Clicking on : Login");
		buttonLogin.click();
	}

	public void clickLogoutButton() {

		logging("Clicking on : Logout");
		buttonLogout.click();
	}

	public void selectRandomInmate() {

		try {
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inmatesDropDownList")));
			int size = inmateSelection.size();
			Random randomGenerator = new Random();
			pause(500);	
			int randomInt =randomGenerator.nextInt(size);
			if (randomInt==size) {
				randomInt=size-1;
			}
			Log.info(">>>><<<<<   " + randomInt);
			selectElementByIndex(selectInmate, randomInt);
			System.out.println(">>>--<<<   :" + inmateSelection.get(randomInt).getText());
			logging("Inmate Selected : " + inmateSelection.get(randomInt).getText());
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

	public void selectInmate(String inmate) {

		selectElementByVisibleText(selectInmate, inmate);
		logging("Inmate Selected : " + inmate);
	}

	public void selectInmate(String inmateName,String inmateId,String facility) {

		String visibleText = inmateName+", "+inmateId+", "+facility;
		selectElementByVisibleText(selectInmate, visibleText);
		logging("Inmate Selected : " + visibleText);
	}

	public String setFacilityUsername() {

		String username = "";
		WebElement element = getDriver()
				.findElement(By.xpath(".//select[@id='inmatesDropDownList']/option[@selected='selected']"));
		String text = element.getText();
		String[] text1 = text.split(",");
		String facility = text1[2];
		System.out.println("<<<<>>>>>" + facility);
		if (facility.contains("Jpay")) {
			username = "jpay_jpay";
		} else if (facility.contains("Michigan")) {
			username = "jpay_midoc";
		} else if (facility.contains("Kansas")) {
			username = "jpay_ksdoc";
		} else if (facility.contains("Indiana")) {
			username = "jpay_indiana";
		} else if (facility.contains("Washington")) {
			username = "jpay_wadoc";
		} else if (facility.contains("Louisiana")) {
			username = "jpay_Louisiana";
		} else if (facility.contains("Texas")) {
			username = "Jpay_TX";
		} else if (facility.contains("Ohio")) {
			username = "jpay_odrc";
		}else if (facility.contentEquals(" Jpay Vantiv (texas Department Of Criminal)")) {
			username = "jpay_TX";
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
		return element.getText().split(",")[1].substring(1);

	}

	public void clickLoginLink() {

		logging("Clicking on : Login");
		linkLogin.click();
	}
	
	public void verifyIdPasswordErrorMessage(String errorMessage){
		
		pause(1000);
		assertionText(idPasswodErrorMessage, errorMessage);
	}
	
	public void clickForgotPasswordLink(){
		
	click(forgotPasswordLink);
	}
	
	public void enterEmailAddress(String emailAddress) {

		setText(enterEmailAddInput, emailAddress);
	}
	
	public void clickPasswordResetButton() {

		logging("Clicking on : "+passwordResetLink.getAttribute("value"));
		passwordResetLink.click();
	}
	
	public boolean isInstructionPresent(String instruction){
		
		if (resetPasswordInsText.getText().contains(instruction)) {
			return true;
		}
		return false;
		
	}
	
	public void verifyInstructionPresent(String instruction){
		
		logging("Text - '"+instruction+"' is present : "+isInstructionPresent(instruction));
		assertBooleanTrue(isInstructionPresent(instruction));
	}
	
	public void verifyForgotPasswordText(String text){
		
		assertionText(forgotPasswordText, text);
	}


}
