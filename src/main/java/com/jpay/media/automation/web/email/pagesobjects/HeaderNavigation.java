package com.jpay.media.automation.web.email.pagesobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jpay.media.automation.web.baseobjects.BasePageObject;

public class HeaderNavigation extends BasePageObject{

	/************************************************************************************************
	 ******************************************* CONSTRUCTOR*****************************************
	 ************************************************************************************************/

	public HeaderNavigation(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	/********************************************** CONSTRUCTOR****************************************
	 **************************************************************************************************
	 **************************************************************************************************/

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	// Home Link
	@FindBy(xpath = "(.//a[contains(text(),'Home')])[1]")
	private WebElement linkHome;

	// Send Money Link
	@FindBy(xpath = "(.//a[contains(text(),'Send Money')])[1]")
	private WebElement linkSendMoney;

	// Email Link
	@FindBy(xpath = "(.//a[@class='HeaderNavLinkInactive'][contains(text(),'Email')])[1]")
	private WebElement linkEmail;
	
	// Video Visitation Link
	@FindBy(xpath = "(.//a[contains(text(),'Video Visitation')])[1]")
	private WebElement linkVideoVisitation;
	
	// Music Link
	@FindBy(xpath = "(.//a[contains(text(),'Music')])[1]")
	private WebElement linkMusic;
	
	// My Account Link
	@FindBy(xpath = "(.//a[contains(text(),'My Account')])[1]")
	private WebElement linkMyAccount;

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	/************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD***********************
	 ************************************************************************************************/
	public void clickHomeLink(){

		click(linkHome);
	}

    public void clickEmailLink(){
		
		click(linkEmail);
	}
    
    public boolean isEmailLinkPresent(){
    	
    	try {
			WebElement element=getDriver().findElement(By.xpath("//*[@id='lnkEmail']"));
			return element.isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
    }
	
    public void verifyEmailTabAbsent(){
		
    	logging("Email Tab is Absent : "+!isEmailLinkPresent());
		assertTrue(!isEmailLinkPresent());
	}
	
    public void verifyEmailTabPresent(){
		
    	logging("Email Tab is Present : "+isEmailLinkPresent());
		assertTrue(isEmailLinkPresent());
	}

    public void clickSendMoneyLink(){
	
	    click(linkSendMoney);
    }

    public void clickMusicLink(){
	
	   click(linkMusic);
    }

    public void clickVideoVisitationLink(){
	
	  click(linkVideoVisitation);
    }
    
    public void clickMyAccountLink(){
    	
  	  click(linkMyAccount);
    }


   
}
