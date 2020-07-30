package com.jpay.media.automation.web.email.pagesobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.jpay.media.automation.web.baseobjects.BasePageObject;

public class VideoVisitationPage extends BasePageObject{

	public VideoVisitationPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

}
