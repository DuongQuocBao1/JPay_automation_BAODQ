package com.jpay.media.automation.web.baseobjects;

import org.openqa.selenium.WebDriver;
import com.jpay.media.automation.web.email.pagesobjects.BuyStampsPage;
import com.jpay.media.automation.web.email.pagesobjects.EmailPage;
import com.jpay.media.automation.web.email.pagesobjects.HeaderNavigation;
import com.jpay.media.automation.web.email.pagesobjects.HomePage;
import com.jpay.media.automation.web.email.pagesobjects.LoginPage;
import com.jpay.media.automation.web.email.pagesobjects.MusicPage;
import com.jpay.media.automation.web.email.pagesobjects.MyAccountPage;
import com.jpay.media.automation.web.email.pagesobjects.PreloginHomeFooterPage;
import com.jpay.media.automation.web.email.pagesobjects.PreloginHomeHeaderPage;
import com.jpay.media.automation.web.email.pagesobjects.PreloginHomeMiddlePage;
import com.jpay.media.automation.web.email.pagesobjects.SendMoneyPage;
import com.jpay.media.automation.web.email.pagesobjects.SignupPage;
import com.jpay.media.automation.web.email.pagesobjects.TransferStampsPage;
import com.jpay.media.automation.web.email.pagesobjects.VideoVisitationPage;


public class ApplicationControllerEmail {

	public WebDriver driver;
	private HomePage homePage;
	private BuyStampsPage buyStamps;
	private TransferStampsPage transferStamps;
	private EmailPage email;
	private HeaderNavigation headerNavigation;
	private LoginPage login;
	private MusicPage music;
	private MyAccountPage myAccount;
	private SendMoneyPage sendMoney;
	private SignupPage signup;
	private VideoVisitationPage videoVisitation;
	
	
	
	public ApplicationControllerEmail(WebDriver driver) {
		this.driver=driver;
		
		
		homePage= new HomePage(getDriver());
		signup = new SignupPage(getDriver());
		buyStamps = new BuyStampsPage(getDriver());
		email = new EmailPage(getDriver());
		headerNavigation = new HeaderNavigation(getDriver());
		login = new LoginPage(getDriver());
		music = new MusicPage(getDriver());
		myAccount = new MyAccountPage(getDriver());
		sendMoney = new SendMoneyPage(getDriver());
		signup = new SignupPage(getDriver());
		videoVisitation = new VideoVisitationPage(getDriver());
		transferStamps = new TransferStampsPage(getDriver());
		
		
	}
	
	
	public HomePage home(){
		return homePage; 
	}
	
	public BuyStampsPage buyStamps() {

		return buyStamps;
	}
	
	public TransferStampsPage transferStamps() {

		return transferStamps;
	}

	public EmailPage email() {

		return email;
	}

	public HeaderNavigation headerNavigation() {

		return headerNavigation;
	}

		public LoginPage login() {

		return login;
	}

	public MusicPage music() {

		return music;
	}

	public MyAccountPage myAccount() {

		return myAccount;
	}

	public SendMoneyPage sendMoney() {

		return sendMoney;
	}

	public SignupPage signup() {

		return signup;
	}

	public VideoVisitationPage videoVisitation() {

		return videoVisitation;
	}
	
	public WebDriver getDriver(){
		return driver;
	}

}