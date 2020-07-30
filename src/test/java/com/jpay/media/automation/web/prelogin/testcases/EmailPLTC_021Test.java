package com.jpay.media.automation.web.prelogin.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: PLTC02 - (User shall be able to verify Arizona State Facilities and Permloc)
 * Author :: shasan(Shahriar Hasan) , Date :: 
 * DataFile :: Email.xlsx , DataSheet :: PLTC02(Arizona)
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailPLTC_021Test extends BaseTestObject{
	


	private String variation;
	private String state;
	private String stateFacilityType;
	private String federalFacilitiesType;
	private String countyJailType;
	private String paroleProbationType;
	private String facilityAzCommSupervision;
	private String facilityAzDocInamteService;
	private String facilityAzVisitorBackground;
	private String availableJapyServicesText;
	private String serviceSendMoney;
	private String serviceEmail;
	private String serviceInboundEmail;
	private String serviceOutboundEmail;
	private String serviceVideoAttachments;
	private String serviceInboundVideograms;
	private String serviceOutboundVideograms;
	private String serviceVideoVisit;
	private String serviceMusic;
	private String plCentralRegionalParoleOffice;
	private String plCochiseRegionalParoleOffice;
	private String plElectronicMonitoringUnit;
	private String plFlagstaffParoleOffice;
	private String plKingmanParoleOffice;
	private String plMesaRegionalParoleOffice;
	private String plNortheasternMaricopaParoleOffice;
	private String plPinalRegionalParoleOffice;
	private String plPrescottValleyParoleOffice;
	private String plSaffordParoleOffice;
	private String plSnowflakeParoleOffice;
	private String plTucsonRegionalParoleOffice;
	private String plWesternRegionalParoleOffice;
	private String plYumaParoleOffice;
	private String plCentralRegionalParoleOfficeAdd;
	private String plCochiseRegionalParoleOfficeAdd;
	private String plElectronicMonitoringUnitAdd;
	private String plFlagstaffParoleOfficeAdd;
	private String plKingmanParoleOfficeAdd;
	private String plMesaRegionalParoleOfficeAdd;
	private String plNortheasternMaricopaParoleOfficeAdd;
	private String plPinalRegionalParoleOfficeAdd;
	private String plPrescottValleyParoleOfficeAdd;
	private String plSaffordParoleOfficeAdd;
	private String plSnowflakeParoleOfficeAdd;
	private String plTucsonRegionalParoleOfficeAdd;
	private String plWesternRegionalParoleOfficeAdd;
	private String plYumaParoleOfficeAdd;
	private String plCentralRegionalParoleOfficePhone;
	private String plCochiseRegionalParoleOfficePhone;
	private String plElectronicMonitoringUnitPhone;
	private String plFlagstaffParoleOfficePhone;
	private String plKingmanParoleOfficePhone;
	private String plMesaRegionalParoleOfficePhone;
	private String plNortheasternMaricopaParoleOfficePhone;
	private String plPinalRegionalParoleOfficePhone;
	private String plPrescottValleyParoleOfficePhone;
	private String plSaffordParoleOfficePhone;
	private String plSnowflakeParoleOfficePhone;
	private String plTucsonRegionalParoleOfficePhone;
	private String plWesternRegionalParoleOfficePhone;
	private String plYumaParoleOfficePhone;
	private String plA58;
	private String plA76;
	private String plASPKingman;
	private String plASPRedRockCorrectionalCenter;
	private String plASPCDouglas;
	private String plASPCEyman;
	private String plASPCFlorence;
	private String plASPCFlorenceWest;
	private String plASPCLewis;
	private String plASPCPerryville;
	private String plASPCPhoenix;
	private String plASPCSafford;
	private String plASPCTucson;
	private String plASPCWinslow;
	private String plASPCYuma;
	private String plCentralArizonaCorrectionalFacility;
	private String plEymanRestrictedHousing;
	private String plMaranaCCTF;
	private String plAZVisitorBackgroundFee;
	private String plA58Add;
	private String plA76Add;
	private String plASPKingmanAdd;
	private String plASPRedRockCorrectionalCenterAdd;
	private String plASPCEymanAdd;
	private String plASPCDouglasAdd;
	private String plASPCFlorenceAdd;
	private String plASPCFlorenceWestAdd;
	private String plASPCLewisAdd;
	private String plASPCPerryvilleAdd;
	private String plASPCPhoenixAdd;
	private String plASPCSaffordAdd;
	private String plASPCTucsonAdd;
	private String plASPCWinslowAdd;
	private String plASPCYumaAdd;
	private String plCentralArizonaCorrectionalFacilityAdd;
	private String plEymanRestrictedHousingAdd;
	private String plMaranaCCTFAdd;
	private String plA58Phone;
	private String plA76Phone;
	private String plASPKingmanPhone;
	private String plASPRedRockCorrectionalCenterPhone;
	private String plASPCDouglasPhone;
	private String plASPCEymanPhone;
	private String plASPCFlorencePhone;
	private String plASPCFlorenceWestPhone;
	private String plASPCLewisPhone;
	private String plASPCPerryvillePhone;
	private String plASPCPhoenixPhone;
	private String plASPCSaffordPhone;
	private String plASPCTucsonPhone;
	private String plASPCWinslowPhone;
	private String plASPCYumaPhone;
	private String plCentralArizonaCorrectionalFacilityPhone;
	private String plEymanRestrictedHousingPhone;
	private String plMaranaCCTFPhone;
	private String plAZVisitorBackgroundFeeAdd;
	private String plAZVisitorBackgroundFeePhone;
	

	


	/*********************************************************************************
	 * 
	 * Navigate to the url and verify the title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCase::PLTC02::Design Steps::"
			+ "1,2(Navigate to the url and verify the title of the page.)")
	public void testStart() {
		
		jpayPrelogin().homeHeader().loadURL(envUrlJpay,variation);
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.HOME_CORRECTION_SERVICES_TITLE);
	
	}

	/*********************************************************************************
	 * 
	 * Click prison search link and verify state list which are giving service.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =2, description = "TestCase::PLTC02::Design Steps::"
			+ "3,4(Click prison search link and verify state list which are giving service.)")
	public void clickPrisonSearchLinkAndVerify() {

		jpayPrelogin().homeHeader().clickHeaderPrisonSearchLink();
		jpayPrelogin().homeHeader().verifyStateList(PageConstant.STATE_LIST);
		
	}

	/*********************************************************************************
	 * 
	 * Click on Arizona State,verify state facilities are present,federal 
	 * facilities are absent and county jails are absent,verify all the 
	 * state facilities and their permlocs.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =3, description = "TestCase::PLTC02::Design Steps::"
			+ "5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,"
			+ "32,33,34,35,36,37,38,39,40,41,42,43,44(Click on Arizona State,verify state "
			+ "facilities are present,federal facilities are absent and county jails are "
			+ "absent,verify all the state facilities and their permlocs.)")
	public void clickArizonaStateAndVerify() {

		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().verifyFacilitiesTypePresent(state, stateFacilityType);
		jpayPrelogin().availabilityPricing().verifyFacilitiesTypeAbsent(state, federalFacilitiesType);
		jpayPrelogin().availabilityPricing().verifyFacilitiesTypeAbsent(state, countyJailType);
		jpayPrelogin().availabilityPricing().verifyFacilitiesTypeAbsent(state, paroleProbationType);
		jpayPrelogin().availabilityPricing().verifyStateFacilitiesPresent(facilityAzCommSupervision);
		jpayPrelogin().availabilityPricing().verifyStateFacilitiesPresent(facilityAzDocInamteService);
		jpayPrelogin().availabilityPricing().verifyStateFacilitiesPresent(facilityAzVisitorBackground);
		
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzCommSupervision, plCentralRegionalParoleOffice);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzCommSupervision, plCochiseRegionalParoleOffice);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzCommSupervision, plElectronicMonitoringUnit);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzCommSupervision, plFlagstaffParoleOffice);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzCommSupervision, plKingmanParoleOffice);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzCommSupervision, plMesaRegionalParoleOffice);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzCommSupervision, plNortheasternMaricopaParoleOffice);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzCommSupervision, plPinalRegionalParoleOffice);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzCommSupervision, plPrescottValleyParoleOffice);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzCommSupervision, plSaffordParoleOffice);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzCommSupervision, plSnowflakeParoleOffice);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzCommSupervision, plTucsonRegionalParoleOffice);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzCommSupervision, plWesternRegionalParoleOffice);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzCommSupervision, plYumaParoleOffice);
		
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzDocInamteService, plA58);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzDocInamteService, plA76);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzDocInamteService, plASPKingman);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzDocInamteService, plASPRedRockCorrectionalCenter);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzDocInamteService, plASPCDouglas);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzDocInamteService, plASPCEyman);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzDocInamteService, plASPCFlorence);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzDocInamteService, plASPCFlorenceWest);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzDocInamteService, plASPCLewis);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzDocInamteService, plASPCPerryville);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzDocInamteService, plASPCPhoenix);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzDocInamteService, plASPCSafford);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzDocInamteService, plASPCTucson);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzDocInamteService, plASPCWinslow);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzDocInamteService, plASPCYuma);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzDocInamteService, plCentralArizonaCorrectionalFacility);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzDocInamteService, plEymanRestrictedHousing);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzDocInamteService, plMaranaCCTF);
		
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityAzVisitorBackground, plAZVisitorBackgroundFee);
		
	}

	/*********************************************************************************
	 * 
	 * Click AZ Community Supervision state facility and verify header text 
	 * and available and non-available service.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =4, description = "TestCase::PLTC02::Design Steps::"
			+ "45,46,47,48,49,50,51,52,53,54,55,56(Click AZ Community Supervision state "
			+ "facility and verify header text and available and non-available service.)")
	public void clickAZCommunitySuperVisionFacilityAndVerify() {

		jpayPrelogin().availabilityPricing().clickFacilityLink(facilityAzCommSupervision);
		jpayPrelogin().availabilityPricing().verifyFacilityName(facilityAzCommSupervision);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyJpayServicesPresent(facilityAzCommSupervision, serviceSendMoney);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityAzCommSupervision, serviceEmail);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityAzCommSupervision, serviceOutboundEmail);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityAzCommSupervision, serviceInboundEmail);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityAzCommSupervision, serviceVideoAttachments);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityAzCommSupervision, serviceInboundVideograms);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityAzCommSupervision, serviceOutboundVideograms);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityAzCommSupervision, serviceVideoVisit);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityAzCommSupervision, serviceMusic);
		
	}

	/*********************************************************************************
	 * 
	 * Click AZ DOC Inmate Service state facility and verify header text 
	 * and available and non-available service.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =5, description = "TestCase::PLTC02::Design Steps::"
			+ "57,58,59,60,61,62,63,64,65,66,67,68,69,70(Click AZ DOC Inmate Service state "
			+ "facility and verify header text and available and non-available service.)")
	public void clickAZDocInmateServiceFacilityAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickFacilityLink(facilityAzDocInamteService);
		jpayPrelogin().availabilityPricing().verifyFacilityName(facilityAzDocInamteService);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyJpayServicesPresent(facilityAzDocInamteService, serviceSendMoney);
		jpayPrelogin().availabilityPricing().verifyJpayServicesPresent(facilityAzDocInamteService, serviceEmail);
		jpayPrelogin().availabilityPricing().verifyJpayServicesPresent(facilityAzDocInamteService, serviceOutboundEmail);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityAzDocInamteService, serviceInboundEmail);
		jpayPrelogin().availabilityPricing().verifyJpayServicesPresent(facilityAzDocInamteService, serviceVideoAttachments);
		jpayPrelogin().availabilityPricing().verifyJpayServicesPresent(facilityAzDocInamteService, serviceInboundVideograms);
		jpayPrelogin().availabilityPricing().verifyJpayServicesPresent(facilityAzDocInamteService, serviceOutboundVideograms);
		jpayPrelogin().availabilityPricing().verifyJpayServicesPresent(facilityAzDocInamteService, serviceVideoVisit);
		jpayPrelogin().availabilityPricing().verifyJpayServicesPresent(facilityAzDocInamteService, serviceMusic);
		
	}

	/*********************************************************************************
	 * 
	 * Click AZ Visitor Background state facility and verify header text 
	 * and available and non-available service.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =6, description = "TestCase::PLTC02::Design Steps::"
			+ "71,72,73,74,75,76,77,78,79,80,81,82,83,84(Click AZ Visitor Background "
			+ "state facility and verify header text and available and non-available "
			+ "service.)")
	public void clickAZVisitorBackgroundFacilityAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickFacilityLink(facilityAzVisitorBackground);
		jpayPrelogin().availabilityPricing().verifyFacilityName(facilityAzVisitorBackground);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyJpayServicesPresent(facilityAzVisitorBackground, serviceSendMoney);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityAzVisitorBackground, serviceEmail);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityAzVisitorBackground, serviceOutboundEmail);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityAzVisitorBackground, serviceInboundEmail);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityAzVisitorBackground, serviceVideoAttachments);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityAzVisitorBackground, serviceInboundVideograms);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityAzVisitorBackground, serviceOutboundVideograms);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityAzVisitorBackground, serviceVideoVisit);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityAzVisitorBackground, serviceMusic);
		
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Central Regional Parole and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =7, description = "TestCase::PLTC02::Design Steps::"
			+ "85,86,87,88,89,90,91,92(Navigate to Central Regional Parole and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplCentralRegionalParoleOfficeAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plCentralRegionalParoleOffice);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plCentralRegionalParoleOffice);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzCommSupervision);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plCentralRegionalParoleOfficeAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plCentralRegionalParoleOfficePhone);
		
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Cochise Regional Parole and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =8, description = "TestCase::PLTC02::Design Steps::"
			+ "93,94,95,96,97,98,99,100(Navigate to Cochise Regional Parole and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplCochiseRegionalParoleOfficeAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plCochiseRegionalParoleOffice);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plCochiseRegionalParoleOffice);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzCommSupervision);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plCochiseRegionalParoleOfficeAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plCochiseRegionalParoleOfficePhone);
		
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Electronic Monitoring Unit and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =9, description = "TestCase::PLTC02::Design Steps::"
			+ "101,102,103,104,105,106,107,108(Navigate to Electronic Monitoring Unit and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplElectronicMonitoringUnitAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plElectronicMonitoringUnit);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plElectronicMonitoringUnit);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzCommSupervision);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plElectronicMonitoringUnitAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plElectronicMonitoringUnitPhone);
		
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Flagstaff Parole Office and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =10, description = "TestCase::PLTC02::Design Steps::"
			+ "109,110,111,112,113,114,115,116(Navigate to Flagstaff Parole Office and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplFlagstaffParoleOfficeAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plFlagstaffParoleOffice);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plFlagstaffParoleOffice);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzCommSupervision);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plFlagstaffParoleOfficeAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plFlagstaffParoleOfficePhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Kingman Parole Office and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =11, description = "TestCase::PLTC02::Design Steps::"
			+ "117,118,119,120,121,122,123,124(Navigate to Kingman Parole Office and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplKingmanParoleOfficeAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plKingmanParoleOffice);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plKingmanParoleOffice);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzCommSupervision);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plKingmanParoleOfficeAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plKingmanParoleOfficePhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Mesa Regional Parole Office and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =12, description = "TestCase::PLTC02::Design Steps::"
			+ "125,126,127,128,129,130,131,132(Navigate to Mesa Regional Parole Office and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplMesaRegionalParoleOfficeAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plMesaRegionalParoleOffice);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plMesaRegionalParoleOffice);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzCommSupervision);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plMesaRegionalParoleOfficeAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plMesaRegionalParoleOfficePhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Northeastern Maricopa Parole Office and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =13, description = "TestCase::PLTC02::Design Steps::"
			+ "133,134,135,136,137,138,139,140(Navigate to Northeastern Maricopa Parole Office and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplNortheasternMaricopaParoleOfficeAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plNortheasternMaricopaParoleOffice);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plNortheasternMaricopaParoleOffice);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzCommSupervision);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plNortheasternMaricopaParoleOfficeAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plNortheasternMaricopaParoleOfficePhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Pinal Regional Parole Office and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =14, description = "TestCase::PLTC02::Design Steps::"
			+ "141,142,143,144,145,146,147,148(Navigate to Pinal Regional Parole Office and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplPinalRegionalParoleOfficeAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plPinalRegionalParoleOffice);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plPinalRegionalParoleOffice);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzCommSupervision);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plPinalRegionalParoleOfficeAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plPinalRegionalParoleOfficePhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Prescott Valley Parole Office and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =15, description = "TestCase::PLTC02::Design Steps::"
			+ "149,150,151,152,153,154,155,156(Navigate to Prescott Valley Parole Office and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplPrescottValleyParoleOfficeAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plPrescottValleyParoleOffice);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plPrescottValleyParoleOffice);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzCommSupervision);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plPrescottValleyParoleOfficeAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plPrescottValleyParoleOfficePhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Safford Parole Office and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =16, description = "TestCase::PLTC02::Design Steps::"
			+ "157,158,159,160,161,162,163,164(Navigate to Safford Parole Office and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplSaffordParoleOfficeAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plSaffordParoleOffice);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plSaffordParoleOffice);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzCommSupervision);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plSaffordParoleOfficeAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plSaffordParoleOfficePhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Snowflake Parole Office and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =17, description = "TestCase::PLTC02::Design Steps::"
			+ "165,166,167,168,169,170,171,172(Navigate to Snowflake Parole Office and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplSnowflakeParoleOfficeAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plSnowflakeParoleOffice);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plSnowflakeParoleOffice);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzCommSupervision);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plSnowflakeParoleOfficeAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plSnowflakeParoleOfficePhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Tucson Regional Parole Office and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =18, description = "TestCase::PLTC02::Design Steps::"
			+ "173,174,175,176,177,178,179,180(Navigate to Tucson Regional Parole Office and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplTucsonRegionalParoleOfficeAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plTucsonRegionalParoleOffice);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plTucsonRegionalParoleOffice);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzCommSupervision);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plTucsonRegionalParoleOfficeAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plTucsonRegionalParoleOfficePhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Western Regional Parole Office and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =19, description = "TestCase::PLTC02::Design Steps::"
			+ "181,182,183,184,185,186,187,188(Navigate to Western Regional Parole Office and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplWesternRegionalParoleOfficeAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plWesternRegionalParoleOffice);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plWesternRegionalParoleOffice);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzCommSupervision);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plWesternRegionalParoleOfficeAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plWesternRegionalParoleOfficePhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Yuma Parole Office and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =20, description = "TestCase::PLTC02::Design Steps::"
			+ "189,190,191,192,193,194,195,196(Navigate to Yuma Parole Office and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplYumaParoleOfficeAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plYumaParoleOffice);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plYumaParoleOffice);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzCommSupervision);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plYumaParoleOfficeAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plYumaParoleOfficePhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to A58 and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =21, description = "TestCase::PLTC02::Design Steps::"
			+ "197,198,199,200,201,202,203,204(Navigate to A58 and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplA58AndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plA58);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plA58);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzDocInamteService);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plA58Add);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plA58Phone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to A76 and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =22, description = "TestCase::PLTC02::Design Steps::"
			+ "205,206,207,208,209,210,211,212(Navigate to A76 and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplA76AndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plA76);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plA76);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzDocInamteService);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plA76Add);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plA76Phone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to ASP Kingman and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =23, description = "TestCase::PLTC02::Design Steps::"
			+ "213,214,215,216,217,218,219,220(Navigate to ASP Kingman and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplASPKingmanAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plASPKingman);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plASPKingman);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzDocInamteService);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plASPKingmanAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plASPKingmanPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to ASP Red Rock Correctional Center and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =24, description = "TestCase::PLTC02::Design Steps::"
			+ "221,222,223,224,225,226,227,228(Navigate to ASP Red Rock Correctional Center and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplASPRedRockCorrectionalCenterAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plASPRedRockCorrectionalCenter);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plASPRedRockCorrectionalCenter);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzDocInamteService);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plASPRedRockCorrectionalCenterAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plASPRedRockCorrectionalCenterPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to ASPC Douglas and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =25, description = "TestCase::PLTC02::Design Steps::"
			+ "229,230,231,232,233,234,235,236(Navigate to ASPC Douglas and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplASPCDouglasAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plASPCDouglas);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plASPCDouglas);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzDocInamteService);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plASPCDouglasAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plASPCDouglasPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to ASPC Eyman and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =26, description = "TestCase::PLTC02::Design Steps::"
			+ "237,238,239,240,241,242,243,244(Navigate to ASPC Eyman and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplASPCEymanAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plASPCEyman);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plASPCEyman);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzDocInamteService);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plASPCEymanAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plASPCEymanPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to ASPC Florence and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =27, description = "TestCase::PLTC02::Design Steps::"
			+ "245,246,247,248,249,250,251,252(Navigate to ASPC Florence and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplASPCFlorenceAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plASPCFlorence);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plASPCFlorence);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzDocInamteService);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plASPCFlorenceAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plASPCFlorencePhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to ASPC Florence West and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =28, description = "TestCase::PLTC02::Design Steps::"
			+ "245,246,247,248,249,250,251,252(Navigate to ASPC Florence West and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplASPCFlorenceWestAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plASPCFlorenceWest);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plASPCFlorenceWest);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzDocInamteService);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plASPCFlorenceWestAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plASPCFlorenceWestPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to ASPC Lewis and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =29, description = "TestCase::PLTC02::Design Steps::"
			+ "253,254,255,256,257,258,259,260(Navigate to ASPC Lewis and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplASPCLewisAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plASPCLewis);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plASPCLewis);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzDocInamteService);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plASPCLewisAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plASPCLewisPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to ASPC Perryville and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =30, description = "TestCase::PLTC02::Design Steps::"
			+ "261,262,263,264,265,266,267,268(Navigate to ASPC Perryville and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplASPCPerryvilleAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plASPCPerryville);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plASPCPerryville);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzDocInamteService);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plASPCPerryvilleAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plASPCPerryvillePhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to ASPC Phoenix and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =31, description = "TestCase::PLTC02::Design Steps::"
			+ "269,270,271,272,273,274,275,276(Navigate to ASPC Phoenix and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplASPCPhoenixAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plASPCPhoenix);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plASPCPhoenix);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzDocInamteService);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plASPCPhoenixAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plASPCPhoenixPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to ASPC Safford and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =32, description = "TestCase::PLTC02::Design Steps::"
			+ "277,278,279,280,281,282,283,284(Navigate to ASPC Safford and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplASPCSaffordAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plASPCSafford);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plASPCSafford);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzDocInamteService);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plASPCSaffordAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plASPCSaffordPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to ASPC Tucson and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =33, description = "TestCase::PLTC02::Design Steps::"
			+ "285,286,287,288,289,290,291,292(Navigate to ASPC Tucson and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplASPCTucsonAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plASPCTucson);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plASPCTucson);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzDocInamteService);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plASPCTucsonAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plASPCTucsonPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to ASPC Winslow and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =34, description = "TestCase::PLTC02::Design Steps::"
			+ "293,294,295,296,297,298,299,300(Navigate to ASPC Winslow and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplASPCWinslowAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plASPCWinslow);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plASPCWinslow);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzDocInamteService);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plASPCWinslowAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plASPCWinslowPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to ASPC Yuma and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =35, description = "TestCase::PLTC02::Design Steps::"
			+ "301,302,303,304,305,306,307,308(Navigate to ASPC Yuma and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplASPCYumaAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plASPCYuma);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plASPCYuma);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzDocInamteService);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plASPCYumaAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plASPCYumaPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Central Arizona Correctional Facility and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =36, description = "TestCase::PLTC02::Design Steps::"
			+ "309,310,311,312,313,314,315,316(Navigate to Central Arizona Correctional Facility and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplCentralArizonaCorrectionalFacilityAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plCentralArizonaCorrectionalFacility);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plCentralArizonaCorrectionalFacility);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzDocInamteService);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plCentralArizonaCorrectionalFacilityAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plCentralArizonaCorrectionalFacilityPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Eyman - Restricted Housing and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =37, description = "TestCase::PLTC02::Design Steps::"
			+ "317,318,319,320,321,322,323,324(Navigate to Eyman - Restricted Housing and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplEymanRestrictedHousingAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plEymanRestrictedHousing);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plEymanRestrictedHousing);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzDocInamteService);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plEymanRestrictedHousingAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plEymanRestrictedHousingPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Marana CCTF and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =38, description = "TestCase::PLTC02::Design Steps::"
			+ "325,326,327,328,329,330,331,332(Navigate to Marana CCTF and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplMaranaCCTFAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plMaranaCCTF);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plMaranaCCTF);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzDocInamteService);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plMaranaCCTFAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plMaranaCCTFPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to AZ Visitor Background Fee and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =39, description = "TestCase::PLTC02::Design Steps::"
			+ "333,334,335,336,337,338,339,340(Navigate to AZ Visitor Background Fee and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplAZVisitorBackgroundFeeAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plAZVisitorBackgroundFee);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plAZVisitorBackgroundFee);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityAzVisitorBackground);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plAZVisitorBackgroundFeeAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plAZVisitorBackgroundFeePhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Click on home link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 40, description = "TestCase::PLTC02::Design Steps::"
			+ "341( Click on home link.)")
	public void testEnd() {

		jpayEmail().headerNavigation().clickHomeLink();
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailPLTC_021Test(data) };
	}
	
	
	public EmailPLTC_021Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		state = data.get("state");
		stateFacilityType = data.get("stateFacilityType");
		federalFacilitiesType = data.get("federalFacilitiesType");
		countyJailType = data.get("countyJailType");
		paroleProbationType = data.get("paroleProbationType");
		
		availableJapyServicesText = data.get("availableJapyServicesText");
		serviceSendMoney = data.get("serviceSendMoney");
		serviceEmail = data.get("serviceEmail");
		serviceOutboundEmail = data.get("serviceOutboundEmail");
		serviceInboundEmail = data.get("serviceInboundEmail");
		serviceVideoAttachments = data.get("serviceVideoAttachments");
		serviceInboundVideograms = data.get("serviceInboundVideograms");
		serviceOutboundVideograms = data.get("serviceOutboundVideograms");
		serviceVideoVisit = data.get("serviceVideoVisit");
		serviceMusic = data.get("serviceMusic");
		
		facilityAzCommSupervision = data.get("facilityAzCommSupervision");
		plCentralRegionalParoleOffice = data.get("plCentralRegionalParoleOffice");
		plCochiseRegionalParoleOffice= data.get("plCochiseRegionalParoleOffice");
		plElectronicMonitoringUnit = data.get("plElectronicMonitoringUnit");
		plFlagstaffParoleOffice= data.get("plFlagstaffParoleOffice");
		plKingmanParoleOffice = data.get("plKingmanParoleOffice");
		plMesaRegionalParoleOffice= data.get("plMesaRegionalParoleOffice");
		plNortheasternMaricopaParoleOffice = data.get("plNortheasternMaricopaParoleOffice");
		plPinalRegionalParoleOffice= data.get("plPinalRegionalParoleOffice");
		plPrescottValleyParoleOffice = data.get("plPrescottValleyParoleOffice");
		plSaffordParoleOffice= data.get("plSaffordParoleOffice");
		plSnowflakeParoleOffice = data.get("plSnowflakeParoleOffice");
		plTucsonRegionalParoleOffice= data.get("plTucsonRegionalParoleOffice");
		plWesternRegionalParoleOffice = data.get("plWesternRegionalParoleOffice");
		plYumaParoleOffice= data.get("plYumaParoleOffice");
		
		plCentralRegionalParoleOfficeAdd = data.get("plCentralRegionalParoleOfficeAdd");
		plCochiseRegionalParoleOfficeAdd= data.get("plCochiseRegionalParoleOfficeAdd");
		plElectronicMonitoringUnitAdd = data.get("plElectronicMonitoringUnitAdd");
		plFlagstaffParoleOfficeAdd= data.get("plFlagstaffParoleOfficeAdd");
		plKingmanParoleOfficeAdd = data.get("plKingmanParoleOfficeAdd");
		plMesaRegionalParoleOfficeAdd= data.get("plMesaRegionalParoleOfficeAdd");
		plNortheasternMaricopaParoleOfficeAdd = data.get("plNortheasternMaricopaParoleOfficeAdd");
		plPinalRegionalParoleOfficeAdd= data.get("plPinalRegionalParoleOfficeAdd");
		plPrescottValleyParoleOfficeAdd = data.get("plPrescottValleyParoleOfficeAdd");
		plSaffordParoleOfficeAdd= data.get("plSaffordParoleOfficeAdd");
		plSnowflakeParoleOfficeAdd = data.get("plSnowflakeParoleOfficeAdd");
		plTucsonRegionalParoleOfficeAdd= data.get("plTucsonRegionalParoleOfficeAdd");
		plWesternRegionalParoleOfficeAdd = data.get("plWesternRegionalParoleOfficeAdd");
		plYumaParoleOfficeAdd= data.get("plYumaParoleOfficeAdd");
		
		plCentralRegionalParoleOfficePhone = data.get("plCentralRegionalParoleOfficePhone");
		plCochiseRegionalParoleOfficePhone= data.get("plCochiseRegionalParoleOfficePhone");
		plElectronicMonitoringUnitPhone = data.get("plElectronicMonitoringUnitPhone");
		plFlagstaffParoleOfficePhone= data.get("plFlagstaffParoleOfficePhone");
		plKingmanParoleOfficePhone = data.get("plKingmanParoleOfficePhone");
		plMesaRegionalParoleOfficePhone= data.get("plMesaRegionalParoleOfficePhone");
		plNortheasternMaricopaParoleOfficePhone = data.get("plNortheasternMaricopaParoleOfficePhone");
		plPinalRegionalParoleOfficePhone= data.get("plPinalRegionalParoleOfficePhone");
		plPrescottValleyParoleOfficePhone = data.get("plPrescottValleyParoleOfficePhone");
		plSaffordParoleOfficePhone= data.get("plSaffordParoleOfficePhone");
		plSnowflakeParoleOfficePhone = data.get("plSnowflakeParoleOfficePhone");
		plTucsonRegionalParoleOfficePhone= data.get("plTucsonRegionalParoleOfficePhone");
		plWesternRegionalParoleOfficePhone = data.get("plWesternRegionalParoleOfficePhone");
		plYumaParoleOfficePhone= data.get("plYumaParoleOfficePhone");
		
		facilityAzDocInamteService = data.get("facilityAzDocInamteService");
		plA58 = data.get("plA58");
		plA76 = data.get("plA76");
		plASPKingman= data.get("plASPKingman");
		plASPRedRockCorrectionalCenter = data.get("plASPRedRockCorrectionalCenter");
		plASPCDouglas= data.get("plASPCDouglas");
		plASPCEyman = data.get("plASPCEyman");
		plASPCFlorence= data.get("plASPCFlorence");
		plASPCFlorenceWest = data.get("plASPCFlorenceWest");
		plASPCLewis= data.get("plASPCLewis");
		plASPCPerryville = data.get("plASPCPerryville");
		plASPCPhoenix= data.get("plASPCPhoenix");
		plASPCSafford = data.get("plASPCSafford");
		plASPCTucson= data.get("plASPCTucson");
		plASPCWinslow = data.get("plASPCWinslow");
		plASPCYuma= data.get("plASPCYuma");
		plCentralArizonaCorrectionalFacility = data.get("plCentralArizonaCorrectionalFacility");
		plEymanRestrictedHousing= data.get("plEymanRestrictedHousing");
		plMaranaCCTF = data.get("plMaranaCCTF");
		plA58Add = data.get("plA58Add");
		plA76Add = data.get("plA76Add");
		plASPKingmanAdd= data.get("plASPKingmanAdd");
		plASPRedRockCorrectionalCenterAdd = data.get("plASPRedRockCorrectionalCenterAdd");
		plASPCDouglasAdd= data.get("plASPCDouglasAdd");
		plASPCEymanAdd = data.get("plASPCEymanAdd");
		plASPCFlorenceAdd= data.get("plASPCFlorenceAdd");
		plASPCFlorenceWestAdd = data.get("plASPCFlorenceWestAdd");
		plASPCLewisAdd= data.get("plASPCLewisAdd");
		plASPCPerryvilleAdd = data.get("plASPCPerryvilleAdd");
		plASPCPhoenixAdd= data.get("plASPCPhoenixAdd");
		plASPCSaffordAdd = data.get("plASPCSaffordAdd");
		plASPCTucsonAdd= data.get("plASPCTucsonAdd");
		plASPCWinslowAdd = data.get("plASPCWinslowAdd");
		plASPCYumaAdd= data.get("plASPCYumaAdd");
		plCentralArizonaCorrectionalFacilityAdd = data.get("plCentralArizonaCorrectionalFacilityAdd");
		plEymanRestrictedHousingAdd= data.get("plEymanRestrictedHousingAdd");
		plMaranaCCTFAdd = data.get("plMaranaCCTFAdd");
		plA58Phone = data.get("plA58Phone");
		plA76Phone = data.get("plA76Phone");
		plASPKingmanPhone= data.get("plASPKingmanPhone");
		plASPRedRockCorrectionalCenterPhone = data.get("plASPRedRockCorrectionalCenterPhone");
		plASPCDouglasPhone= data.get("plASPCDouglasPhone");
		plASPCEymanPhone = data.get("plASPCEymanPhone");
		plASPCFlorencePhone= data.get("plASPCFlorencePhone");
		plASPCFlorenceWestPhone = data.get("plASPCFlorenceWestPhone");
		plASPCLewisPhone= data.get("plASPCLewisPhone");
		plASPCPerryvillePhone = data.get("plASPCPerryvillePhone");
		plASPCPhoenixPhone= data.get("plASPCPhoenixPhone");
		plASPCSaffordPhone = data.get("plASPCSaffordPhone");
		plASPCTucsonPhone= data.get("plASPCTucsonPhone");
		plASPCWinslowPhone = data.get("plASPCWinslowPhone");
		plASPCYumaPhone= data.get("plASPCYumaPhone");
		plCentralArizonaCorrectionalFacilityPhone = data.get("plCentralArizonaCorrectionalFacilityPhone");
		plEymanRestrictedHousingPhone= data.get("plEymanRestrictedHousingPhone");
		plMaranaCCTFPhone = data.get("plMaranaCCTFPhone");
		
		facilityAzVisitorBackground = data.get("facilityAzVisitorBackground");
		plAZVisitorBackgroundFee = data.get("plAZVisitorBackgroundFee");
		plAZVisitorBackgroundFeeAdd = data.get("plAZVisitorBackgroundFeeAdd");
		plAZVisitorBackgroundFeePhone = data.get("plAZVisitorBackgroundFeePhone");
		
	}

	


}
