package com.jpay.media.automation.web.staging.pagesobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.jpay.media.automation.web.baseobjects.BasePageObject;

public class StagingLoginPage extends BasePageObject {

	/************************************************************************************************
	 ******************************************* CONSTRUCTOR*****************************************
	 ************************************************************************************************/

	public StagingLoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	/***********************************************CONSTRUCTOR****************************************
	 **************************************************************************************************
	 **************************************************************************************************/

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	
	// Admin System Text
	@FindBy(xpath = "(.//td[1]/b)[1]")
	private WebElement textAdminASystem;
	
	// Username
	@FindBy(xpath = "//*[@id='uUsername']")
	private WebElement username;

	// password
	@FindBy(xpath = "//*[@id='uPassword']")
	private WebElement password;

	// LogIn Button
	@FindBy(xpath = "//*[@id='Button1']")
	private WebElement buttonLogin;
	
	// Personal Details Text
	@FindBy(xpath = ".//*[contains(text(),'Personal Details')]")
	private WebElement textPersonalDetails;

	

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	/************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD***********************
	 ************************************************************************************************/


	public void enterUsername(String userId) {

		setText(username, userId);
		pressTab(username);
	}

	public void enterPassword(String pass) {

		setText(password, pass);
	}

	public void clickLoginButton() {

		logging("Clicking on : "+buttonLogin.getAttribute("value"));
		buttonLogin.click();
	}

	public void verifyStagingAdminSystem(String text) {

		assertionText(textAdminASystem.getText().trim(), text);
	}
	
	public void verifyPersonalDetails(String text) {

		assertionText(textPersonalDetails, text);
	}

	
}
