package com.jpay.media.automation.web.emailprelogin.pagesobjects;

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

public class PreloginHomeMiddlePage extends BasePageObject{

	public PreloginHomeMiddlePage(WebDriver driver) {
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

	
	// Friends & Family Forum Box
	@FindBy(xpath = ".//h4[text()='Friends & Family Forum']//preceding::section[2]//following::section[3]")
	private WebElement friendsAndFamilyForumBox;
	
	// Parole & Probation Box
	@FindBy(xpath = ".//h4[text()='Parole & Probation']//preceding::section[2]//following::section[3]")
	private WebElement paroleAndProbationBox;
	
	// JPay Blog Box
	@FindBy(xpath = ".//img[@title='JPay Blog']//preceding::section[1]//following::section[1]//section")
	private WebElement jpayBlogBox;
	
	// JPay Send money Information Box
	@FindBy(xpath = ".//h3[text()='You can now send funds to your loved ones in Federal prison (BOP).']//preceding::section[1]//following::section[3]")
	private WebElement jpayInformationBox;
	
	// JPay download mobile app Box
	@FindBy(xpath = ".//*[@class='mobile-app-ad']")
	private WebElement jpayDownloadMobileAppBox;
	
	// JPay Friends & Family come and visit link
	@FindBy(xpath = ".//*[text()='Come and visit!']")
	private WebElement comeAndVisitLink;
	
	// JPay Parole and Probation Registration Box
	@FindBy(xpath = ".//section[@class='friends_fam_top_content']")
	private WebElement paroleandProbationRegistrationBox;
	
	// JPay Parole and Probation make payment header text
	@FindBy(xpath = ".//*[@class='friends_fam_content_title']")
	private WebElement makingPaymentHeaderText;
	
	// JPay Parole and Probation make payment content text
	@FindBy(xpath = ".//*[@class='friends_fam_content_text']")
	private WebElement makingPaymentContentText;		
	
	// JPay Parole and Probation make a payment link
	@FindBy(xpath = ".//*[@class='friends_fam_icon_link']")
	private WebElement makeAPaymentLink;		
	
	// JPay Parole and Probation release cards link
	@FindBy(xpath = ".//*[@class='friends_fam_icon_link']")
	private WebElement releaseCardsLink;
	
	// JPay Parole and probation get started link
	@FindBy(xpath = ".//*[text()='Get started']")
	private WebElement getStartedLink;
	
	// JPay Blog Image
	@FindBy(xpath = ".//img[@title='JPay Blog']")
	private WebElement jpayBlogImage;
	
	
	
	
	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	/************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD***********************
	 ************************************************************************************************/
	
	public void verifyFriendsFamilyForumBox(){
		
		logging("FriendsFamilyForumBox is Present :: "+isElementDisplayed(friendsAndFamilyForumBox));
		assertTrue(isElementDisplayed(friendsAndFamilyForumBox));
	}
	
	public void verifyParoleProbationBox(){
		
		logging("ParoleProbationBox is Present :: "+isElementDisplayed(paroleAndProbationBox));
		assertTrue(isElementDisplayed(paroleAndProbationBox));
	}
	
	public void verifyJPayBlogBox(){
		
		logging("JPayBlogBox is Present :: "+isElementDisplayed(jpayBlogBox));
		assertTrue(isElementDisplayed(jpayBlogBox));
	}
	
	public void clickJpayBlogLink(){
		
		logging("Clicking on JPay Blog Link");
		jpayBlogBox.click();
	}
	
	public void verifySendMoneyInformationBox(){
		
		logging("SendMoneyInformationBox is Present :: "+isElementDisplayed(jpayInformationBox));
		assertTrue(isElementDisplayed(jpayInformationBox));
	}
	
	public void verifyJPayMobileAppDownloadBox(){
		
		logging("JPayMobileAppDownloadBox is Present :: "+isElementDisplayed(jpayDownloadMobileAppBox));
		assertTrue(isElementDisplayed(jpayDownloadMobileAppBox));
	}
	
	public void clickFamilyForumComeAndVisitLink(){
		
		click(comeAndVisitLink);
	}
	
	public void clickParoleProbationGetStartedLink(){
		
		click(getStartedLink);
	}
	
	public void verifyTextIsPresent(String text){
		
		WebElement element = getDriver().findElement(By.xpath(".//*[text()='"+text+"']"));
		logging(text+" - is Present :: "+isElementDisplayed(element));
		assertTrue(isElementDisplayed(element));
	}
	
	public void verifyParoleProbationRegistrationBox(){
		
		logging("ParoleProbationRegistrationBox is Present :: "+isElementDisplayed(paroleandProbationRegistrationBox));
		assertTrue(isElementDisplayed(paroleandProbationRegistrationBox));
	}
	
	public void verifyMakingPaymentHeaderText(String text){
		
		assertionText(makingPaymentHeaderText, text);
	}
	
	public void verifyMakingPaymentContentText(String text){
		
		assertionText(makingPaymentContentText, text);
	}
	
	public void verifyMakeAPaymentIsALink(){
		
		logging("Make A Payment is Link :: "+isElementaLink(getTagname(makeAPaymentLink)));
		assertTrue(isElementaLink(getTagname(makeAPaymentLink)));
	}
	
	public void verifyReleaseCardsIsALink(){
		
		logging("Release Cards is Link :: "+isElementaLink(getTagname(releaseCardsLink)));
		assertTrue(isElementaLink(getTagname(releaseCardsLink)));
	}
	
	public void verifyJpayBlogImageName(String text){
		
		assertionText(getImageName(jpayBlogImage), text);
	}
	
	public void clickJpayBlogLink(String linkText){
		
		//WebElement element = getDriver().findElement(By.xpath(".//*[text()='"+linkText+"']//preceding::section[1]//following::a[1]"));
		WebElement element = getDriver().findElement(By.xpath(".//*[text()='"+linkText+"']"));
		click(element);
	}
	
	public void verifyJpayBlogLinkPageHeaderText(String text){
		
		WebElement element = getDriver().findElement(By.xpath(".//*[@class='post-title']//a"));
		assertionText("Header Text :: ", element, text);
	}
	
	public void verifyJpaySendMoneyInformationText(String text){
		
		assertionText("Jpay Information Text :: ", jpayInformationBox, text);
	}
	
	
	
	
	
}
