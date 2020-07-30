package com.jpay.media.automation.web.emailprelogin.pagesobjects;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.jpay.media.automation.web.baseobjects.BasePageObject;
import com.jpay.media.automation.web.utilities.Log;

public class PreloginHomeFooterPage extends BasePageObject{

	public PreloginHomeFooterPage(WebDriver driver) {
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


	// Footer Home link
	@FindBy(xpath = "//*[@id='footer_rptFooter_ctl01_rptFooterDetail_ctl00_FooterLink']")
	private WebElement footerHomeLink;

	// Footer About link
	@FindBy(xpath = "//*[@id='footer_rptFooter_ctl01_rptFooterDetail_ctl01_FooterLink']")
	private WebElement footerAboutLink;

	// Footer Inmate Search link
	@FindBy(xpath = "//*[@id='footer_rptFooter_ctl01_rptFooterDetail_ctl02_FooterLink']")
	private WebElement footerInmateSearchLink;

	// Footer Prison Search link
	@FindBy(xpath = "//*[@id='footer_rptFooter_ctl01_rptFooterDetail_ctl03_FooterLink']")
	private WebElement footerPrisonSearchLink;

	// Footer Contact Us link
	@FindBy(xpath = "//*[@id='footer_rptFooter_ctl01_rptFooterDetail_ctl04_FooterLink']")
	private WebElement footerContactUsLink;

	// Footer Help link
	@FindBy(xpath = "//*[@id='footer_rptFooter_ctl01_rptFooterDetail_ctl05_FooterLink']")
	private WebElement footerHelpLink;


	// Footer Money Transfer link
	@FindBy(xpath = "//*[@id='footer_rptFooter_ctl02_rptFooterDetail_ctl00_FooterLink']")
	private WebElement footerMoneyTransferLink;

	// Footer Email & Videogram link
	@FindBy(xpath = "//*[@id='footer_rptFooter_ctl02_rptFooterDetail_ctl01_FooterLink']")
	private WebElement footerEmailVideogramLink;

	// Footer Education link
	@FindBy(xpath = "//*[@id='footer_rptFooter_ctl02_rptFooterDetail_ctl02_FooterLink']")
	private WebElement footerEducationLink;

	// Footer Jpay Tablet link
	@FindBy(xpath = "//*[@id='footer_rptFooter_ctl02_rptFooterDetail_ctl03_FooterLink']")
	private WebElement footerJpayTabletLink;

	// Footer Video Visitation link
	@FindBy(xpath = "//*[@id='footer_rptFooter_ctl02_rptFooterDetail_ctl04_FooterLink']")
	private WebElement footerVideoVisitationLink;


	// Footer Restitution link
	@FindBy(xpath = "//*[@id='footer_rptFooter_ctl03_rptFooterDetail_ctl00_FooterLink']")
	private WebElement footerRestitutionLink;

	// Footer Supervision Fees link
	@FindBy(xpath = "//*[@id='footer_rptFooter_ctl03_rptFooterDetail_ctl01_FooterLink']")
	private WebElement footerSupervisionFeesLink;

	// Footer Court Fees link
	@FindBy(xpath = "//*[@id='footer_rptFooter_ctl03_rptFooterDetail_ctl02_FooterLink']")
	private WebElement footerCourtFeesLink;

	// Footer Self-Report Fees link
	@FindBy(xpath = "//*[@id='footer_rptFooter_ctl03_rptFooterDetail_ctl03_FooterLink']")
	private WebElement footerSelfReportFeesLink;

	// Footer Release Cards link
	@FindBy(xpath = "//*[@id='footer_rptFooter_ctl03_rptFooterDetail_ctl04_FooterLink']")
	private WebElement footerReleaseCardsLink;


	// Footer Devblog link
	@FindBy(xpath = "//*[@id='footer_rptFooter_ctl04_rptFooterDetail_ctl00_FooterLink']")
	private WebElement footerDevblogLink;

	// Footer Forum link
	@FindBy(xpath = "//*[@id='footer_rptFooter_ctl04_rptFooterDetail_ctl01_FooterLink']")
	private WebElement footerForumLink;

	// Footer Facebook link
	@FindBy(xpath = "//*[@id='footer_rptFooter_ctl04_rptFooterDetail_ctl02_FooterLink']")
	private WebElement footerFacebookLink;

	// Footer Twitter link
	@FindBy(xpath = "//*[@id='footer_rptFooter_ctl04_rptFooterDetail_ctl03_FooterLink']")
	private WebElement footerTwitterLink;

	// Footer Our Community link
	@FindBy(xpath = "//*[@id='footer_rptFooter_ctl04_rptFooterDetail_ctl04_FooterLink']")
	private WebElement footerOurCommunityLink;

	// Footer About Header Text
	@FindBy(xpath = "//*[@class='about_title_container']//h1")
	private WebElement aboutJpayHeaderText;

	// Footer About Content Text
	@FindBy(xpath = "//*[@class='about_content']")
	private WebElement aboutJpayContentText;

	// Footer Contact Us Content Text
	@FindBy(xpath = "//*[@class='description']")
	private WebElement contactUsContentText;

	// Money Transfer Inmate Search Box
	@FindBy(xpath = "//*[@class='moneyTransferLookupInmate']")
	private WebElement moneyTransferInmateSearchBox;

	// Money Transfer Inmate Search SMALL Box
	@FindBy(xpath = "//*[@class='moneyTransferLookupInmateSmall']")
	private WebElement moneyTransferInmateSearchSmallBox;

	// Email Us Form Header Text
	@FindBy(xpath = "(.//*[@id='ContactForm1_PanelContactForm']//div//div)[1]")
	private WebElement emailUsFormHeaderText;

	// Email Us Contact Form Firstname input
	@FindBy(xpath = ".//*[@id='ContactForm1_sFirstName']")
	private WebElement emailUsFormFirstnameInput;

	// Email Us Contact Form Lastname input
	@FindBy(xpath = ".//*[@id='ContactForm1_sLastName']")
	private WebElement emailUsFormLastnameInput;

	// Email Us Contact Form email input
	@FindBy(xpath = ".//*[@id='ContactForm1_sEmail']")
	private WebElement emailUsFormEmailInput;

	// Email Us Contact Form email input
	@FindBy(xpath = ".//*[@id='ContactForm1_sPhone']")
	private WebElement emailUsFormPhoneInput;

	// Email Us Contact Form message input
	@FindBy(xpath = ".//*[@id='ContactForm1_sMessage']")
	private WebElement emailUsFormMessageInput;

	// Email Us Contact Form submit button
	@FindBy(xpath = ".//*[@id='ContactForm1_Button1']")
	private WebElement emailUsFormSubmitButton;

	// Email Us Contact Form submit success msg
	@FindBy(xpath = ".//*[@id='ContactForm1_lblmsgSuccess']")
	private WebElement emailUsContactFormSubmitSuccessMsg;

	// Contact Sales Form Header Text
	@FindBy(xpath = "(.//*[@id='FContactForm1_PanelFContactForm']//div//div)[1]")
	private WebElement contactSalesFormHeaderText;

	// Contact Sales Contact Form Firstname input
	@FindBy(xpath = ".//*[@id='FContactForm1_sFirstName']")
	private WebElement contactSalesFirstnameInput;

	// Contact Sales Contact Form Lastname input
	@FindBy(xpath = ".//*[@id='FContactForm1_sLastName']")
	private WebElement contactSalesFormLastnameInput;

	// Contact Sales Contact Form email input
	@FindBy(xpath = ".//*[@id='FContactForm1_sEmail']")
	private WebElement contactSalesFormEmailInput;

	// Contact Sales Contact Form email input
	@FindBy(xpath = ".//*[@id='FContactForm1_sPhone']")
	private WebElement contactSalesFormPhoneInput;

	// Contact Sales Contact Form message input
	@FindBy(xpath = ".//*[@id='FContactForm1_sMessage']")
	private WebElement contactSalesFormMessageInput;

	// Contact Sales Contact Form submit button
	@FindBy(xpath = ".//*[@id='FContactForm1_Button1']")
	private WebElement contactSalesFormSubmitButton;

	// Contact Sales Contact Form submit success msg
	@FindBy(xpath = ".//*[@id='FContactForm1_lblmsgSuccess']")
	private WebElement contactSalesContactFormSubmitSuccessMsg;

	// Send Money Information Box
	@FindBy(xpath = ".//*[@id='newHeader_FbopSidebarMoney']")
	private WebElement jpaySendMoneyInformationBox;

	// Friends and Forum Box
	@FindBy(xpath = ".//*[@title='Friends and Family Forum']")
	private WebElement friendsAndFamilyForumBox;

	// Moneygram Box
	@FindBy(xpath = ".//*[@title='Moneygram']")
	private WebElement moneyGramBox;

	// Send Money Header Text
	@FindBy(xpath = ".//*[@class='inmate_service_title']//h1")
	private WebElement inmateServicesSectionTabHeaderText;

	// Send Money Content Text
	@FindBy(xpath = ".//div[@class='description']")
	private WebElement inmateServicesSectionTabContentText;

	// Get Started Link
	@FindBy(xpath = ".//a[contains(text(),'Get Started')]")
	private WebElement getStartedLink;

	// Videogram Box
	@FindBy(xpath = ".//*[@title='Send Videogram']")
	private WebElement videoGramBox;

	// Photo Box
	@FindBy(xpath = ".//*[@title='Attach Photos']")
	private WebElement photoBox;

	// Video Visitation Box
	@FindBy(xpath = ".//*[@title='Add a Webcam']")
	private WebElement videoVisitationBox;

	// Accredited Business Box
	@FindBy(xpath = ".//*[@class='BBB_link_footer']")
	private WebElement accreditedBusinessBox;

	// Accredited Business Link
	@FindBy(xpath = ".//*[@class='BBB_link_footer']//a[1]")
	private WebElement accreditedBusinessLink;

	// Accredited Business image
	@FindBy(xpath = ".//*[@class='BBB_link_footer']//img[1]")
	private WebElement accreditedBusinessImage;

	// Our Comminuty Header Text
	@FindBy(xpath = ".//*[@class='title-container']//h3")
	private WebElement communityHeaderText;

	// Our Comminuty Content Text
	@FindBy(xpath = ".//*[@class='text-block']")
	private WebElement communityContentText;

	// Accredited Business Link
	@FindBy(xpath = ".//a[contains(text(),'Are You a Corrections Agency?')]")
	private WebElement areYouACorrectionsAgencyLink;

	// Agency partnership header text
	@FindBy(xpath = ".//*[@class='pagency_title']//h1")
	private WebElement agencyPartnershipHeaderText;

	// Agency partnership content text
	@FindBy(xpath = ".//*[@class='pagency_content_text']")
	private WebElement agencyPartnershipContentText;

	// Agency contact form link
	@FindBy(xpath = ".//a[contains(text(),'Agency Contact Form')]")
	private WebElement agencyContactFormLink;

	// Legal Agreements link
	@FindBy(xpath = ".//a[contains(text(),'Legal Agreements')]")
	private WebElement legalAgreementsLink;

	// Consumer Protection link
	@FindBy(xpath = ".//a[contains(text(),'Consumer Protection')]")
	private WebElement consumerProtectionLink;

	// Privacy Policy link
	@FindBy(xpath = ".//a[contains(text(),'Privacy Policy')]")
	private WebElement privacyPolicyLink;

	// Legal Agreements Terms And Condition
	@FindBy(xpath = ".//*[@class='description']")
	private WebElement legalAgreementsTermsConditions;
	
	// Securus Technologies Company link
	@FindBy(xpath = ".//a[contains(text(),'A Securus Technologies Company')]")
	private WebElement securusTechnologiesCompanyLink;

	// Desclaimer Text
	@FindBy(xpath = ".//*[@class='nav-bottom-disclaimer']//span//span")
	private WebElement desclaimerText;

	// BOP Inmate locator link
	@FindBy(xpath = ".//a[@id='LinkButtonInmateLocator']")
	private WebElement bopInmateLocatorLink;

	// Send Money Rates link
	@FindBy(xpath = ".//*[@class='inmate_service_content_text']//font[contains(text(),'rates')]")
	private WebElement ratesLink;

	// Send Money Here link
	@FindBy(xpath = ".//*[@class='inmate_service_content_text']//font[contains(text(),'here')]")
	private WebElement hereLink;


	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	/************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD***********************
	 ************************************************************************************************/
	
	

	public void verifyFooterLinksHeaderText(String text) {

		WebElement element = getDriver().findElement(By.xpath(".//*[text()='"+text+"']"));
		logging("Link Header - "+text+" is present :: "+isElementDisplayed(element));
		assertTrue(isElementDisplayed(element));
	}

	public void verifyFooterHeaderIsALink(String text) {

		WebElement element = getDriver().findElement(By.xpath(".//*[text()='"+text+"']"));
		logging("Header - "+text+" is a link :: "+isElementaLink(getTagname(element)));
		assertTrue(isElementaLink(getTagname(element)));
	}

	public void verifyFooterHeaderIsNotALink(String text) {

		WebElement element = getDriver().findElement(By.xpath(".//*[text()='"+text+"']"));
		logging("Header - "+text+" is not a link :: "+!isElementaLink(getTagname(element)));
		assertTrue(!isElementaLink(getTagname(element)));
	}
	
	public void verifyFooterLink(String text1,String text2) {

		WebElement element = getDriver().findElement(By.xpath(".//*[text()='"+text1+"']//following::a[text()='"+text2+"']"));
		logging("Link - "+text2+" is present :: "+isElementDisplayed(element));
		assertTrue(isElementDisplayed(element));
	}
	
	public void clickFooterHomeLink(){
		
		click(footerHomeLink);
	}
	
	public void clickFooterAboutLink(){
		
		click(footerAboutLink);
	}
	
	public void clickFooterInmateSearchLink(){
		
		click(footerInmateSearchLink);
	}
	
	public void clickFooterPrisonSearchLink(){
		
		click(footerPrisonSearchLink);
	}
	
	public void clickFooterContactUsLink(){
		
		click(footerContactUsLink);
	}
	
	public void clickFooterMoneyTransferLink(){
		
		click(footerMoneyTransferLink);
	}
	
	public void clickFooterEmailVideogramLink(){
		
		click(footerEmailVideogramLink);
	}
	
	public void clickFooterEducationLink(){
		
		click(footerEducationLink);
	}
	
	public void clickFooterJpayTabletLink(){
		
		click(footerJpayTabletLink);
	}
	
	public void clickFooterVideoVisitationLink(){
		
		click(footerVideoVisitationLink);
	}
	
	public void clickFooterRestitutionLink(){
		
		click(footerRestitutionLink);
	}
	
	public void clickFooterSupervisionFeesLink(){
		
		click(footerSupervisionFeesLink);
	}
	
	public void clickFooterCourtFeesLink(){
		
		click(footerCourtFeesLink);
	}
	
	public void clickFooterSelfReportFeesLink(){
		
		click(footerSelfReportFeesLink);
	}
	
	public void clickFooterReleaseCardsLink(){
		
		click(footerReleaseCardsLink);
	}
	
	public void clickFooterDevblogLink(){
		
		click(footerDevblogLink);
	}
	
	public void clickFooterForumLink(){
		
		click(footerForumLink);
	}
	
	public void clickFooterFacebookLink(){
		
		click(footerFacebookLink);
	}
	
	public void clickFooterTwitterLink(){
		
		click(footerTwitterLink);
	}
	
	public void clickFooterOurCommunityLink(){
		
		click(footerOurCommunityLink);
	}
	
	public void verifyAboutJpayHeaderText(String text){
		
		assertionText("About Jpay Header Text :: ", aboutJpayHeaderText, text);
	}
	
	public void verifyAboutJpayContentText(String text){
		
		assertionText("About Jpay Content Text :: ", aboutJpayContentText, text);
	}
	
	public void verifyContactUsCallOrWriteUsInfo(String text){
		
		assertionText("Contact Us Content Text :: ", contactUsContentText, text);
	}
	
	public void verifyInmateSearchBoxSmallPresent(){
		
		logging("Inmate Search Box is present : "+isElementDisplayed(moneyTransferInmateSearchSmallBox));
		assertTrue(isElementDisplayed(moneyTransferInmateSearchSmallBox));
	}
	
	public void verifyInmateSearchBoxPresent(){
		
		logging("Inmate Search Box is present : "+isElementDisplayed(moneyTransferInmateSearchBox));
		assertTrue(isElementDisplayed(moneyTransferInmateSearchBox));
	}
	
	public void clickFooterLinksSectionTab(String sectionTabText){
		
		WebElement element = getDriver().findElement(By.xpath(".//*[text()='"+sectionTabText+"']"));
		click(element);
	}
	
	public void verifyFooterLinksSectionTab(String sectionTabText){
		
		WebElement element = getDriver().findElement(By.xpath(".//*[text()='"+sectionTabText+"']"));
		logging(sectionTabText+" is Present :: "+isElementDisplayed(element));
		assertTrue(isElementDisplayed(element));
	}
	
	public void verifyEmailUsContactFormHeaderText(String text){
		
		assertionText("Form Header Text :: ", emailUsFormHeaderText, text);
	}
	
	public void enterEmailUsFirstname(String text){
		
		setText(emailUsFormFirstnameInput, text);
	}
	
	public void enterEmailUsLastname(String text){
		
		setText(emailUsFormLastnameInput, text);
	}
	
	
	public void enterEmailUsEmailAdd(String text){
		
		setText(emailUsFormEmailInput, text);
	}
	
	public void enterEmailUsPhone(String text){
		
		setText(emailUsFormPhoneInput, text);
	}
	
	public void enterEmailUsMessage(String text){
		
		setText(emailUsFormMessageInput, text);
	}
	
	public void clickEmailUsFormSubmitButton(){
		
		logging("Clicking on :: "+emailUsFormSubmitButton.getAttribute("value"));
		emailUsFormSubmitButton.click();
	}
	
	public void fillOutEmailUsContactForm(String fName,String lName,String email,String phone,String msg){
		
		enterEmailUsFirstname(fName);
		enterEmailUsLastname(lName);
		enterEmailUsEmailAdd(email);
		enterEmailUsPhone(phone);
		enterEmailUsMessage(msg);
		clickEmailUsFormSubmitButton();
	}
	
	public void verifyEmailUsContactFormSubmitSuccessMsg(String msg){
		
		assertionText("ContactFormSubmitSuccessMsg :: ", emailUsContactFormSubmitSuccessMsg, msg);
	}
	
	public void verifyEmailUsFormSubmitButtonDisabled(){
		
		logging("Submit button is disabled :: "+!emailUsFormSubmitButton.isEnabled());
		assertTrue(!emailUsFormSubmitButton.isEnabled());
	}
	
	
	
	
	
	public void verifyContactSalesContactFormHeaderText(String text){
		
		assertionText("Form Header Text :: ", contactSalesFormHeaderText, text);
	}
	
	public void enterContactSalesFirstname(String text){
		
		setText(contactSalesFirstnameInput, text);
	}
	
	public void enterContactSalesLastname(String text){
		
		setText(contactSalesFormLastnameInput, text);
	}
	
	
	public void enterContactSalesEmailAdd(String text){
		
		setText(contactSalesFormEmailInput, text);
	}
	
	public void enterContactSalesPhone(String text){
		
		setText(contactSalesFormPhoneInput, text);
	}
	
	public void enterContactSalesMessage(String text){
		
		setText(contactSalesFormMessageInput, text);
	}
	
	public void clickContactSalesFormSubmitButton(){
		
		logging("Clicking on :: "+contactSalesFormSubmitButton.getAttribute("value"));
		contactSalesFormSubmitButton.click();
	}
	
	public void fillOutContactSalesContactForm(String fName,String lName,String email,String phone,String msg){
		
		enterContactSalesFirstname(fName);
		enterContactSalesLastname(lName);
		enterContactSalesEmailAdd(email);
		enterContactSalesPhone(phone);
		enterContactSalesMessage(msg);
		clickContactSalesFormSubmitButton();
	}
	
	public void verifyContactSalesContactFormSubmitSuccessMsg(String msg){
		
		assertionText("ContactFormSubmitSuccessMsg :: ", contactSalesContactFormSubmitSuccessMsg, msg);
	}
	
	public void verifyContactSalesFormSubmitButtonDisabled(){
		
		logging("Submit button is disabled :: "+!contactSalesFormSubmitButton.isEnabled());
		assertTrue(!contactSalesFormSubmitButton.isEnabled());
	}
	
	public void verifySelectedFooterLinksSectionTabTextColor(String sectionTabText,String colorCode){
		
		WebElement element = getDriver().findElement(By.xpath(".//*[text()='"+sectionTabText+"']"));
		assertionText(sectionTabText+" - Text Color :: ", getTextColor(element), colorCode);
	}
	
	public void verifyJpaySendMoneyInformationkBoxPresent(){
		
		logging("JPay Send Money Information Box is present : "+isElementDisplayed(jpaySendMoneyInformationBox));
		assertTrue(isElementDisplayed(jpaySendMoneyInformationBox));
	}
	
	public void verifyFriendsFamilyForumBox(){
		
		logging("FriendsFamilyForumBox is Present :: "+isElementDisplayed(friendsAndFamilyForumBox));
		assertTrue(isElementDisplayed(friendsAndFamilyForumBox));
	}
	
	public void verifyReleaseCardsFriendsFamilyForumBox(){
		
		WebElement element = getDriver().findElement(By.xpath(".//*[@id='newHeader_sidebarforum']"));
		logging("FriendsFamilyForumBox is Present :: "+isElementDisplayed(element));
		assertTrue(isElementDisplayed(element));
	}
	
	public void verifyReleaseCardsSectionTabHeaderText(String text){
		
		WebElement element = getDriver().findElement(By.xpath(".//*[@class='release_cards_title']//h1"));
		assertionText("Inmate Services Header Text :: ", element, text);
	}
	
	public void verifyVideoVisitationBox(){
		
		logging("Video Visitation Box is Present :: "+isElementDisplayed(videoVisitationBox));
		assertTrue(isElementDisplayed(videoVisitationBox));
	}
	
	public void verifySendmoneyMoneygramBox(){
		
		logging("Moneygram Box is Present :: "+isElementDisplayed(moneyGramBox));
		assertTrue(isElementDisplayed(moneyGramBox));
	}
	
	public void verifyInmateServicesSectionTabHeaderText(String text){
		
		assertionText("Inmate Services Header Text :: ", inmateServicesSectionTabHeaderText, text);
	}
	
	public void verifyInmateServicesSectionTabContentText(String text){
		
		assertionText("Inmate Services Content Text :: ", inmateServicesSectionTabContentText, text);
	}
	
	public void verifyInmateServicesBuyMediaContentText(String text){
		WebElement element = getDriver().findElement(By.xpath(".//*[@class='inmate_service_content']//div[1]"));
		assertionText("Buy Media Content Text :: ", element, text);
	}
	
	public void clickGetStartedLink(){
		
		click(getStartedLink);
	}
	
	public void clickBOPInmateLocatorLink(){
		
		click(bopInmateLocatorLink);
	}
	
	public void clickSendMoneyRatesLink(){
		
		click(ratesLink);
	}
	
	public void clickSendMoneyHereLink(){
		
		click(hereLink);
	}
	
	public void verifySendVideogramBox(){
		
		logging("Videogram Box is Present :: "+isElementDisplayed(videoGramBox));
		assertTrue(isElementDisplayed(videoGramBox));
	}
	
	public void verifySendPhotoBox(){
		
		logging("Photo Box is Present :: "+isElementDisplayed(photoBox));
		assertTrue(isElementDisplayed(photoBox));
	}
	
	public void clickVideoVisitationRatesLink(){
		
		WebElement element = getDriver().findElement(By.xpath(".//*[@class='inmate_service_content_text']//*[text()='rates']"));
		click(element);
	}
	
	public void verifyMakeAPaymentContentText(String text){
		WebElement element = getDriver().findElement(By.xpath(".//*[@class='inmate_service_content']"));
		assertionText("Make A Payment Content Text :: ", element, text);
	}
	
	public void verifyReleaseCardsContentText(String text){
		WebElement element = getDriver().findElement(By.xpath(".//*[@class='release_cards_content']"));
		assertionText("Release Cards Content Text :: ", element, text);
	}
	
	public void verifyFooterAccreditedBusinessBox(){
		
		logging("Accredited Business Box is Present :: "+isElementDisplayed(accreditedBusinessBox));
		assertTrue(isElementDisplayed(accreditedBusinessBox));
	}
	
	public void clickFooterAccreditedBussinessLink(){
		
		click(accreditedBusinessLink);
	}
	
	public boolean isFooterAccreditedBusinessLinkDisplayed(){
		
		try {
			return accreditedBusinessLink.isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public void verifyFooterAccreditedBusinessLinkAbsent(){
		
		logging("BBB LInk is Absent :: "+!isFooterAccreditedBusinessLinkDisplayed());
		assertTrue(!isFooterAccreditedBusinessLinkDisplayed());
	}
	
	public void verifyFooterAccreditedBusinessImage(String image){
		
		assertionText("Accredited Business Image name :: ", accreditedBusinessImage, image);
	}
	
	public void verifyOurCommunityHeaderText(String text){
		
		assertionText("Header Text :: ", communityHeaderText, text);
	}
	
	public void verifyOurCommunityContentText(String text){
		
		assertionText("Content Text :: ", communityContentText, text);
	}
	
	public void verifyOrganizationsPresentInOurCommunityPage(String organizations){
		
		String xpath = ".//*[contains(text(),'"+organizations+"')]";
		logging("Organization -'"+organizations+"' Present :: "+ isElementDisplayed(getDriver().findElement(By.xpath(xpath))));
		assertTrue(isElementDisplayed(getDriver().findElement(By.xpath(xpath))));
	}
	
	public void clickOurCommunityOrganization(String organizations){
		
		String xpath = ".//*[contains(text(),'"+organizations+"')]//preceding::a[1]//following::a[1]";
		WebElement element = getDriver().findElement(By.xpath(xpath));
		click(element);
	}
	
	public void clickAreYouACorrectionsAgencyLink(){
		
		click(areYouACorrectionsAgencyLink);
	}
	
	public void verifyAgencyPartnershipHeaderText(String text){
		
		assertionText("Header Text :: ", agencyPartnershipHeaderText, text);
	}
	
	public void verifyAgencyPartnershipContentText(String text){
		
		assertionText("Content Text :: ", agencyPartnershipContentText, text);
	}
	
	public void clickAgencyContactFormLink(){
		
		click(agencyContactFormLink);
	}
	
	public void clickLegalAgreementsLink(){
		
		click(legalAgreementsLink);
	}
	
	public void clickConsumerProtectionLink(){
		
		click(consumerProtectionLink);
	}
	
	public void clickPrivacyPolicyLink(){
		
		click(privacyPolicyLink);
	}
	
	public void clickSecurusTechnologiesCompanyLink(){
		
		click(securusTechnologiesCompanyLink);
	}
	
	public void verifyLegalAgreementsTermsAndConditions(String text){
		
		assertionText("Terms and Conditions :: ", legalAgreementsTermsConditions, text);
	}
	
	public void verifyDesclaimerText(String text){
		
		assertionText("Desclaimer Text :: ", desclaimerText, text);
	}
	
	
	
	
	
}
