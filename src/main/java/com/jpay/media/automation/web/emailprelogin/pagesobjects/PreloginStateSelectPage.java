package com.jpay.media.automation.web.emailprelogin.pagesobjects;

import java.util.List;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.jpay.media.automation.web.baseobjects.BasePageObject;

public class PreloginStateSelectPage extends BasePageObject {

	/************************************************************************************************
	 ******************************************* CONSTRUCTOR*****************************************
	 ************************************************************************************************/

	public PreloginStateSelectPage(WebDriver driver) {
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

	// State Dropdown
	@FindBy(xpath = "//*[@id='StatesDropdown_txtautofromDB']")
	private WebElement selectStateDropDown1;

	// State Dropdown
	@FindBy(xpath = "//*[@id='uclLoginFirstTime_uclLookupInmate_StatesDropdownC_txtautofromDB']")
	private WebElement selectStateDropDown2;

	// State Dropdown
	@FindBy(xpath = "//*[@id='newHeader_uclLookupInmateBox_StatesDropdownA_txtautofromDB']")
	private WebElement selectStateDropDown3;


	// Enter InmateId
	@FindBy(xpath = "//*[@id='inmateIDTextBox']")
	private WebElement inmateId1;

	// Enter InmateId
	@FindBy(xpath = "//*[@id='uclLoginFirstTime_uclLookupInmate_tbSearchTextCombined']")
	private WebElement inmateId2;

	// Enter InmateId
	@FindBy(xpath = "//*[@id='newHeader_uclLookupInmateBox_tbSearchText']")
	private WebElement inmateId3;
	
	// Next Button
	@FindBy(xpath = "//*[@id='nextImageButton']")
	private WebElement buttonNext;
	
	// Find Button
	@FindBy(xpath = "//*[@id='uclLoginFirstTime_uclLookupInmate_btnSearchCombined']")
	private WebElement buttonFind1;
	
	// Find Button
	@FindBy(xpath = "//*[@id='newHeader_uclLookupInmateBox_btnSearch']")
	private WebElement buttonFind2;
	
	// Verify Selected State
	@FindBy(xpath = "//*[@id='uclInmateResultPanel_lblStateName']")
	private WebElement verifySelectedState;

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	/************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD***********************
	 ************************************************************************************************/

	public void selectInmateState1AndVerify(List<String> list) {

		for (String state : list) {

			logging("Clicking on : Select State...");
			setText(selectStateDropDown1, state);
			if (state.contentEquals("District of Columbia")) {

				state = "District Of Columbia";
			}
			String xpath = "//ul/li/a[contains(text(),'" + state + "')]";
			pause(500);
			wait.until(ExpectedConditions.elementToBeClickable(getDriver().findElement(By.xpath(xpath))));
			WebElement element = getDriver().findElement(By.xpath(xpath));
			click(element);
			setText(inmateId1, "000");
			click(buttonNext);
			wait.until(ExpectedConditions.visibilityOf(verifySelectedState));

			if (state.contentEquals("District Of Columbia")) {

				state = "District of Columbia";
			}
			assertionText("Seleceted State", verifySelectedState, state);
			navigateBrowserBack();

		}

	}
	
	public void verifyStateDropdownList1(List<String> list) {

		boolean isTrue = false;
		logging("Clicking on : Select State...");
		selectStateDropDown1.click();
		pause(500);
		for (String state : list) {

			if (state.contentEquals("District of Columbia")) {

				state = "District Of Columbia";
			}
			String xpath = "//ul/li/a[contains(text(),'" + state + "')]";
			
			try {
				 isTrue = getDriver().findElement(By.xpath(xpath)).isDisplayed();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			logging("State - ' "+state+" ' Displayed in the dropdown ::"+isTrue);
			assertTrue(isTrue);

		}
	
	}
	
	public void selectInmateState2AndVerify(List<String> list) {

		for (String state : list) {

			logging("Clicking on : Select State...");
			setText(selectStateDropDown2, state);
			if (state.contentEquals("District of Columbia")) {

				state = "District Of Columbia";
			}
			String xpath = "//ul/li/a[contains(text(),'" + state + "')]";
			pause(500);
			wait.until(ExpectedConditions.elementToBeClickable(getDriver().findElement(By.xpath(xpath))));
			WebElement element = getDriver().findElement(By.xpath(xpath));
			click(element);
			setText(inmateId2, "000");
			clickAndLogByValue(buttonFind1);
			wait.until(ExpectedConditions.visibilityOf(verifySelectedState));

			if (state.contentEquals("District Of Columbia")) {

				state = "District of Columbia";
			}
			assertionText("Seleceted State", verifySelectedState, state);
			navigateBrowserBack();

		}

	}
	
	public void verifyStateDropdownList2(List<String> list) {

		boolean isTrue = false;
		logging("Clicking on : Select State...");
		selectStateDropDown2.click();
		pause(500);
		for (String state : list) {

			if (state.contentEquals("District of Columbia")) {

				state = "District Of Columbia";
			}
			String xpath = "//ul/li/a[contains(text(),'" + state + "')]";
			
			try {
				 isTrue = getDriver().findElement(By.xpath(xpath)).isDisplayed();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			logging("State - ' "+state+" ' Displayed in the dropdown ::"+isTrue);
			assertTrue(isTrue);

		}
	
	}
	

	public void selectInmateState3AndVerify(List<String> list) {

		for (String state : list) {

			logging("Clicking on : Select State...");
			setText(selectStateDropDown3, state);
			if (state.contentEquals("District of Columbia")) {

				state = "District Of Columbia";
			}
			String xpath = "//ul/li/a[contains(text(),'" + state + "')]";
			pause(500);
			wait.until(ExpectedConditions.elementToBeClickable(getDriver().findElement(By.xpath(xpath))));
			WebElement element = getDriver().findElement(By.xpath(xpath));
			click(element);
			setText(inmateId3, "000");
			clickAndLogByValue(buttonFind2);
			wait.until(ExpectedConditions.visibilityOf(verifySelectedState));

			if (state.contentEquals("District Of Columbia")) {

				state = "District of Columbia";
			}
			assertionText("Seleceted State", verifySelectedState, state);
			navigateBrowserBack();

		}

	}
	
	
	public void verifyStateDropdownList3(List<String> list) {

		boolean isTrue = false;
		logging("Clicking on : Select State...");
		selectStateDropDown3.click();
		pause(500);
		for (String state : list) {

			if (state.contentEquals("District of Columbia")) {

				state = "District Of Columbia";
			}
			String xpath = "//ul/li/a[contains(text(),'" + state + "')]";
			
			try {
				 isTrue = getDriver().findElement(By.xpath(xpath)).isDisplayed();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			logging("State - ' "+state+" ' Displayed in the dropdown ::"+isTrue);
			assertTrue(isTrue);

		}
	
	}
	
	
	

}
