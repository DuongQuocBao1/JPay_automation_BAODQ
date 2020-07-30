package com.jpay.media.automation.web.emailprelogin.pagesobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jpay.media.automation.web.baseobjects.BasePageObject;

public class PreloginAvailabilityPricingPage extends BasePageObject {

	public PreloginAvailabilityPricingPage(WebDriver driver) {
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

	// Arizona State Button
	@FindBy(xpath = ".//*[@id='AvailabilityAndPricing1_treeViewAll']//td[1]//a//following::td[1]//a[contains(text(),'Arizona')]")
	private WebElement arizonaStateButton;

	// Verify Physical Address
	@FindBy(xpath = ".//*[@id='FacilityInformation1_addressDiv']/div[2]/p//preceding::div[3]")
	private WebElement physicalAddressLine;

	// Verify Physical Address line1
	@FindBy(xpath = ".//*[@id='FacilityInformation1_addressDiv']/div[2]/p//preceding::div[2]")
	private WebElement physicalAddressLine1;

	// Verify Physical Address line2
	@FindBy(xpath = ".//*[@id='FacilityInformation1_addressDiv']/div[2]/p//preceding::div[1]")
	private WebElement physicalAddressLine2;

	// Verify Phone Number
	@FindBy(xpath = ".//*[@id='FacilityInformation1_addressDiv']/div[2]/p")
	private WebElement phoneNum;

	// Verify Facility name
	@FindBy(xpath = ".//*[@id='FacilityInformation1_hFacilityName']")
	private WebElement facilityName;

	// Verify Facility name from permloc page
	@FindBy(xpath = ".//*[@id='FacilityInformation1_hAgencyName']")
	private WebElement facilityNamePermlocPage;

	// Verify Permloc name
	@FindBy(xpath = ".//*[@id='FacilityInformation1_hFacilityName']")
	private WebElement permlocName;

	// Verify available jpay services text
	@FindBy(xpath = "//div[contains(text(),'Available JPay Services')]")
	private WebElement availableJpayServicesText;

	// (.//*[@id='ShowHideEmailRates']//tr//td[contains(text(),'10')]/following-sibling::td)[1]

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	/************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD***********************
	 ************************************************************************************************/

	public void clickArizonaStateButton() {

		click(arizonaStateButton);
	}

	public void clickStateButton(String state) {

		WebElement element = getDriver().findElement(By.xpath(".//*[@id='AvailabilityAndPricing1_treeViewAll']"
				+ "//td[1]//a//following::td[1]//a[contains(text(),'" + state + "')]"));
		jsScrollElementToView(element);
		click(element);
	}

	public boolean isFacilitiesTypePresent(String state, String facilityType) {
		try {

			String xpath = ".//*[@id='AvailabilityAndPricing1_treeViewAll']//td[1]//a//following::td[1]//a[contains(text(),'"
					+ state + "')]" + "//following::div[1]//following-sibling::table//td/a[contains(text(),'"
					+ facilityType + "')]";
			WebElement element = getDriver().findElement(By.xpath(xpath));
			return element.isDisplayed();

		} catch (Exception e) {

			e.printStackTrace();
		}
		return false;
	}

	public void verifyFacilitiesTypePresent(String state, String facilityType) {

		logging(state + " - state :: " + facilityType + " - is Present : "
				+ isFacilitiesTypePresent(state, facilityType));
		assertTrue(isFacilitiesTypePresent(state, facilityType));
	}

	public void verifyFacilitiesTypeAbsent(String state, String facilityType) {

		logging(state + " - state :: " + facilityType + " - is Absent : "
				+ !isFacilitiesTypePresent(state, facilityType));
		assertTrue(!isFacilitiesTypePresent(state, facilityType));
	}

	public boolean isPhisicalAddressMatches(String address) {

		WebElement element = getDriver().findElement(By.xpath(".//div[@class='facility-data']"));
		if (element.getText().contains(address)) {

			return true;
		} else {

			return false;
		}
	}

	public void verifyPhysicalAddress(String address) {

		assertionText("PhysicalAddress ", physicalAddressLine, address);
		/*
		 * assertTrue(isPhisicalAddressMatches(address));
		 * logging("Physical Address : "+address);
		 */
	}

	public void verifyPhysicalAddressOne(String address) {

		assertionText("PhysicalAddress ", physicalAddressLine1, address);
		/*
		 * assertTrue(isPhisicalAddressMatches(address));
		 * logging("Physical Address : "+address);
		 */
	}

	public void verifyPhysicalAddressTwo(String city, String stateCode, String zip) {

		String expText = (city + ", " + stateCode + ", " + zip);
		assertionText("City-State-Zip ", physicalAddressLine2, expText);
	}

	public void verifyPhoneNumber(String phNum) {

		assertionText("PhoneNumber ", phoneNum, phNum);
	}

	public void verifyFormatedPhoneNumber(String phNum) {
		String formatedPhone = ("(" + phNum.substring(0, 3) + ") " + phNum.substring(3, 6) + "-"
				+ phNum.substring(6, 10));
		assertionText("PhoneNumber ", phoneNum, formatedPhone);
	}

	public void verifyStateFacilitiesPresent(String facility) {

		String xpath = "(.//*[contains(text(),'" + facility + "')])[1]";
		logging("Facility : " + facility + " - is Present : "
				+ isElementDisplayed(getDriver().findElement(By.xpath(xpath))));
		assertTrue(isElementDisplayed(getDriver().findElement(By.xpath(xpath))));
	}

	public void verifyFacilityPermlocPresent(String facility, String permLoc) {

		if (permLoc.contains("'")) {

			permLoc = permLoc.split("'")[0];
		}
		String xpath = ".//*[contains(text(),'" + facility + "')]/following::a[contains(text(),'" + permLoc + "')]";
		logging(permLoc + " - is Present in Facility - " + facility + " : "
				+ isElementDisplayed(getDriver().findElement(By.xpath(xpath))));
		assertTrue(isElementDisplayed(getDriver().findElement(By.xpath(xpath))));
	}

	public boolean isJpayServicesAvailable(String facility, String service) {

		try {

			String xpath = ".//h1[contains(text(),'" + facility + "')]//following::div[@id='FacilityInformation1_"
					+ "facilityInfoAvailableServicesDiv']//a[contains(text(),'" + service + "')]";
			WebElement element = getDriver().findElement(By.xpath(xpath));
			return element.isDisplayed();

		} catch (Exception e) {

			e.printStackTrace();
		}
		return false;
	}

	public void verifyJpayServicesPresent(String facility, String service) {

		logging(facility + " - facility :: Service - " + service + " is Present : "
				+ isJpayServicesAvailable(facility, service));
		assertTrue(isJpayServicesAvailable(facility, service));
	}

	public void verifyJpayServicesAbsent(String facility, String service) {

		logging(facility + " - facility :: " + service + " - is Absent : "
				+ !isJpayServicesAvailable(facility, service));
		assertTrue(!isJpayServicesAvailable(facility, service));
	}

	public void clickFacilityLink(String facility) {

		WebElement element = getDriver().findElement(By.xpath("(.//a[contains(text(),'" + facility + "')])[1]"));
		click(element);
	}

	public void verifyFacilityName(String facility) {

		assertionText("Facility ", facilityName, facility);
	}

	public void verifyFacilityNamePermlocPage(String facility) {

		assertionText("Facility ", facilityNamePermlocPage, facility);
	}

	public void verifyPermlocName(String permloc) {

		if (permloc.contains("(")) {
			String[] a = permloc.split("\\(");
			String b = a[0];
			permloc = b.substring(0, b.length() - 1);
		}
		assertionText("Permloc ", permlocName, permloc);
	}

	public void verifyAvailableServicesText(String text) {

		assertionText(availableJpayServicesText, text);
	}

	public void clickPermlocLink(String permloc) {
		if (permloc.contains("'")) {
			permloc = permloc.split("'")[0];
		}
		WebElement element = getDriver().findElement(By.xpath("(.//a[contains(text(),'" + permloc + "')])[1]"));
		jsScrollElementToView(element);
		click(element);
		pause(1000);

		/*if (isAlertPresent()) {
			acceptAlert();
		}*/
	}

}
