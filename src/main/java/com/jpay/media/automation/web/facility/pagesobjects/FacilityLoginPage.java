package com.jpay.media.automation.web.facility.pagesobjects;

import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.jpay.media.automation.web.baseobjects.BasePageObject;

public class FacilityLoginPage extends BasePageObject {

	/************************************************************************************************
	 ******************************************* CONSTRUCTOR*****************************************
	 ************************************************************************************************/

	public FacilityLoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	/***********************************************CONSTRUCTOR****************************************
	 **************************************************************************************************
	 **************************************************************************************************/

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	
	// Login Details Text
	@FindBy(xpath = ".//*[@id='ctl00_MainContent_pLogin']//b")
	private WebElement textLoginDetails;
	
	// Username
	@FindBy(xpath = "//*[@id='ctl00_MainContent_uUsername']")
	private WebElement username;

	// password
	@FindBy(xpath = "//*[@id='ctl00_MainContent_uPassword']")
	private WebElement password;
	
	// Pin Code
	@FindBy(xpath = "//*[@id='ctl00_MainContent_uPin']")
	private WebElement pincode;

	// LogIn Button
	@FindBy(xpath = "//*[@id='ctl00_MainContent_Button1']")
	private WebElement buttonLogin;
	

	

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	/************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD***********************
	 ************************************************************************************************/


	public void enterUsername(String userId) {

		setText(username, userId);
	}
	
	public void enterPincodee(String pinCode) {

		setText(pincode, pinCode);
	}

	public void enterPassword(String pass) {

		setText(password, pass);
	}

	public void clickLoginButton() {

		buttonLogin.click();
		logging("Clicking on : Login");
	}

	public void verifyLoginDetails(String text) {

		assertionText(textLoginDetails, text);
	}
	
	
	
}
