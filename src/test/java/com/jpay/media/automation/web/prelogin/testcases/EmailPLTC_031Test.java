package com.jpay.media.automation.web.prelogin.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: PLTC03 - (User shall be able to verify California State Facilities and Permloc)
 * Author :: shasan(Shahriar Hasan) , Date :: 
 * DataFile :: Email.xlsx , DataSheet :: PLTC03(California)
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailPLTC_031Test extends BaseTestObject{
	


	private String variation;
	private String state;
	private String stateFacilityType;
	private String federalFacilitiesType;
	private String countyJailType;
	private String paroleProbationType;
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

	
	
	
	
	
	
	private String facilityTaftCorrectionalInistitution;
	private String facilityCaliforniaStatePrisonSystem;
	private String facilityMarinCountyJail;
	private String plTaftCorrectional;;
	private String plAvenalStatePrison;
	private String plCalCityCorrectionalCenter;
	private String plCalCityPsbp;
	private String plCalCorrectionalCenter;
	private String plCalCorrectionalInstitution;
	private String plCalHealthCareFacility;
	private String plCalInstitutionForMen;
	private String plCalInstitutionForWomen;
	private String plCalMedicalFacility;
	private String plCalMensColony;
	private String plCalRehabilitationCenter;
	private String plCalSubstanceAbuseCorcoran;
	private String plCalipatriaStatePrison;
	private String plCentinelaStatePrison;
	private String plCentralCalWomensFacility;
	private String plCentralOffice;
	private String plChuckawallaValleyStatePrison;
	private String plCorrectionalTrainingFacility;
	private String plCSPCorcoran;
	private String plCSPLosAngelesCounty;
	private String plCSPSacramento;
	private String plCSPSanQuentin;
	private String plCSPSolono;
	private String plDeuelVocationalInstitution;
	private String plFolsomStatePrison;
	private String plHighDesertStatePrison;
	private String plIronwoodStatePrison;
	private String plKernValleyStatePrison;
	private String plMuleCreekStatePrison;
	private String plNorthKernStatePrison;
	private String plPelicanBayStatePrison;
	private String plPleasantValleyStatePrison;
	private String plRJDonovanCorrectionalFacility;
	private String plSalinasValleyStatePrison;
	private String plSierraConservationCenter;
	private String plTestByFred;
	private String plValleyStatePrison;
	private String plWascoStatePrison;
	private String plMarinCountyJail;
	
	
	
	private String plTaftCorrectionalAdd;
	private String plTaftCorrectionalPhone;
	private String plAvenalStatePrisonAdd;
	private String plAvenalStatePrisonPhone;
	private String plCalCityCorrectionalCenterAdd;
	private String plCalCityCorrectionalCenterPhone;
	private String plCalCityPsbpAdd;
	private String plCalCityPsbpPhone;
	private String plCalCorrectionalCenterAdd;
	private String plCalCorrectionalCenterPhone;
	private String plCalCorrectionalInstitutionAdd;
	private String plCalCorrectionalInstitutionPhone;
	private String plCalHealthCareFacilityAdd;
	private String plCalHealthCareFacilityPhone;
	private String plCalInstitutionForMenAdd;
	private String plCalInstitutionForMenPhone;
	private String plCalInstitutionForWomenAdd;
	private String plCalInstitutionForWomenPhone;
	private String plCalMedicalFacilityAdd;
	private String plCalMedicalFacilityPhone;
	private String plCalMensColonyAdd;
	private String plCalMensColonyPhone;
	private String plCalRehabilitationCenterAdd;
	private String plCalRehabilitationCenterPhone;
	private String plCalSubstanceAbuseCorcoranAdd;
	private String plCalSubstanceAbuseCorcoranPhone;
	private String plCalipatriaStatePrisonAdd;
	private String plCalipatriaStatePrisonPhone;
	private String plCentinelaStatePrisonAdd;
	private String plCentinelaStatePrisonPhone;
	private String plCentralCalWomensFacilityAdd;
	private String plCentralCalWomensFacilityPhone;
	private String plCentralOfficeAdd;
	private String plCentralOfficePhone;
	private String plChuckawallaValleyStatePrisonAdd;
	private String plChuckawallaValleyStatePrisonPhone;
	private String plCorrectionalTrainingFacilityAdd;
	private String plCorrectionalTrainingFacilityPhone;
	private String plCSPCorcoranAdd;
	private String plCSPCorcoranPhone;
	private String plCSPLosAngelesCountyAdd;
	private String plCSPLosAngelesCountyPhone;
	private String plCSPSacramentoAdd;
	private String plCSPSacramentoPhone;
	private String plCSPSanQuentinAdd;
	private String plCSPSanQuentinPhone;
	private String plCSPSolonoAdd;
	private String plCSPSolonoPhone;
	private String plDeuelVocationalInstitutionAdd;
	private String plDeuelVocationalInstitutionPhone;
	private String plFolsomStatePrisonAdd;
	private String plFolsomStatePrisonPhone;
	private String plHighDesertStatePrisonAdd;
	private String plHighDesertStatePrisonPhone;
	private String plIronwoodStatePrisonAdd;
	private String plIronwoodStatePrisonPhone;
	private String plKernValleyStatePrisonAdd;
	private String plKernValleyStatePrisonPhone;
	private String plMuleCreekStatePrisonAdd;
	private String plMuleCreekStatePrisonPhone;
	private String plNorthKernStatePrisonAdd;
	private String plNorthKernStatePrisonPhone;
	private String plPelicanBayStatePrisonAdd;
	private String plPelicanBayStatePrisonCCTFPhone;
	private String plPleasantValleyStatePrisonAdd;
	private String plPleasantValleyStatePrisonPhone;
	private String plRJDonovanCorrectionalFacilityAdd;
	private String plRJDonovanCorrectionalFacilityPhone;
	private String plSalinasValleyStatePrisonAdd;
	private String plSalinasValleyStatePrisonPhone;
	private String plSierraConservationCenterAdd;
	private String plSierraConservationCenterPhone;
	private String plTestByFredAdd;
	private String plTestByFredPhone;
	private String plValleyStatePrisonAdd;
	private String plValleyStatePrisonPhone;
	private String plWascoStatePrisonAdd;
	private String plWascoStatePrisonPhone;
	private String plMarinCountyJailAdd;
	private String plMarinCountyJailPhone;
	
	
	
	

	


	/*********************************************************************************
	 * 
	 * Navigate to the url and verify the title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCase::PLTC03::Design Steps::"
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

	@Test(enabled = true, priority =2, description = "TestCase::PLTC03::Design Steps::"
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

	@Test(enabled = true, priority =3, description = "TestCase::PLTC03::Design Steps::"
			+ "5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,"
			+ "32,33,34,35,36,37,38,39,40,41,42,43,44(Click on Arizona State,verify state "
			+ "facilities are present,federal facilities are absent and county jails are "
			+ "absent,verify all the state facilities and their permlocs.)")
	public void clickArizonaStateAndVerify() {

		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().verifyFacilitiesTypePresent(state, stateFacilityType);
		jpayPrelogin().availabilityPricing().verifyFacilitiesTypePresent(state, federalFacilitiesType);
		jpayPrelogin().availabilityPricing().verifyFacilitiesTypePresent(state, countyJailType);
		jpayPrelogin().availabilityPricing().verifyFacilitiesTypeAbsent(state, paroleProbationType);
		jpayPrelogin().availabilityPricing().verifyStateFacilitiesPresent(facilityTaftCorrectionalInistitution);
		jpayPrelogin().availabilityPricing().verifyStateFacilitiesPresent(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyStateFacilitiesPresent(facilityMarinCountyJail);
		
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityTaftCorrectionalInistitution, plTaftCorrectional);
		
		
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plAvenalStatePrison);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plCalCityCorrectionalCenter);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plCalCityPsbp);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plCalCorrectionalCenter);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plCalCorrectionalInstitution);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plCalHealthCareFacility);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plCalInstitutionForMen);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plCalInstitutionForWomen);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plCalMedicalFacility);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plCalMensColony);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plCalRehabilitationCenter);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plCalSubstanceAbuseCorcoran);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plCalipatriaStatePrison);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plCentinelaStatePrison);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plCentralCalWomensFacility);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plCentralOffice);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plChuckawallaValleyStatePrison);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plCorrectionalTrainingFacility);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plCSPCorcoran);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plCSPLosAngelesCounty);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plCSPSacramento);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plCSPSanQuentin);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plCSPSolono);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plDeuelVocationalInstitution);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plFolsomStatePrison);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plHighDesertStatePrison);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plIronwoodStatePrison);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plKernValleyStatePrison);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plMuleCreekStatePrison);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plNorthKernStatePrison);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plPelicanBayStatePrison);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plPleasantValleyStatePrison);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plRJDonovanCorrectionalFacility);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plSalinasValleyStatePrison);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plSierraConservationCenter);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plTestByFred);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plValleyStatePrison);
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityCaliforniaStatePrisonSystem, plWascoStatePrison);
		
		
		jpayPrelogin().availabilityPricing().verifyFacilityPermlocPresent(facilityMarinCountyJail, plMarinCountyJail);
		
	}

	/*********************************************************************************
	 * 
	 * Click Taft Correctional Services facility and verify header text 
	 * and available and non-available service.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =4, description = "TestCase::PLTC03::Design Steps::"
			+ "45,46,47,48,49,50,51,52,53,54,55,56(Click Taft Correctional Services "
			+ "facility and verify header text and available and non-available service.)")
	public void clickTaftCorrectionalInstitutionFacilityAndVerify() {

		jpayPrelogin().availabilityPricing().clickFacilityLink(facilityTaftCorrectionalInistitution);
		jpayPrelogin().availabilityPricing().verifyFacilityName(facilityTaftCorrectionalInistitution);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyJpayServicesPresent(facilityTaftCorrectionalInistitution, serviceSendMoney);
		jpayPrelogin().availabilityPricing().verifyJpayServicesPresent(facilityTaftCorrectionalInistitution, serviceEmail);
		jpayPrelogin().availabilityPricing().verifyJpayServicesPresent(facilityTaftCorrectionalInistitution, serviceOutboundEmail);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityTaftCorrectionalInistitution, serviceInboundEmail);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityTaftCorrectionalInistitution, serviceVideoAttachments);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityTaftCorrectionalInistitution, serviceInboundVideograms);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityTaftCorrectionalInistitution, serviceOutboundVideograms);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityTaftCorrectionalInistitution, serviceVideoVisit);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityTaftCorrectionalInistitution, serviceMusic);
		
	}

	/*********************************************************************************
	 * 
	 * Click California State Prison System facility and verify header text 
	 * and available and non-available service.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =5, description = "TestCase::PLTC03::Design Steps::"
			+ "57,58,59,60,61,62,63,64,65,66,67,68,69,70(Click California State Prison System "
			+ "facility and verify header text and available and non-available service.)")
	public void clickCaliforniaStatePrisonSystemFacilityAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickFacilityLink(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyFacilityName(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyJpayServicesPresent(facilityCaliforniaStatePrisonSystem, serviceSendMoney);
		jpayPrelogin().availabilityPricing().verifyJpayServicesPresent(facilityCaliforniaStatePrisonSystem, serviceEmail);
		jpayPrelogin().availabilityPricing().verifyJpayServicesPresent(facilityCaliforniaStatePrisonSystem, serviceOutboundEmail);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityCaliforniaStatePrisonSystem, serviceInboundEmail);
		jpayPrelogin().availabilityPricing().verifyJpayServicesPresent(facilityCaliforniaStatePrisonSystem, serviceVideoAttachments);
		jpayPrelogin().availabilityPricing().verifyJpayServicesPresent(facilityCaliforniaStatePrisonSystem, serviceInboundVideograms);
		jpayPrelogin().availabilityPricing().verifyJpayServicesPresent(facilityCaliforniaStatePrisonSystem, serviceOutboundVideograms);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityCaliforniaStatePrisonSystem, serviceVideoVisit);
		jpayPrelogin().availabilityPricing().verifyJpayServicesPresent(facilityCaliforniaStatePrisonSystem, serviceMusic);
		
	}

	/*********************************************************************************
	 * 
	 * Click Marin County Jail facility and verify header text 
	 * and available and non-available service.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =6, description = "TestCase::PLTC03::Design Steps::"
			+ "71,72,73,74,75,76,77,78,79,80,81,82,83,84(Click Marin County Jail "
			+ "state facility and verify header text and available and non-available "
			+ "service.)")
	public void clickMarinCountyJailFacilityAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickFacilityLink(facilityMarinCountyJail);
		jpayPrelogin().availabilityPricing().verifyFacilityName(facilityMarinCountyJail);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyJpayServicesPresent(facilityMarinCountyJail, serviceSendMoney);
		jpayPrelogin().availabilityPricing().verifyJpayServicesPresent(facilityMarinCountyJail, serviceEmail);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityMarinCountyJail, serviceOutboundEmail);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityMarinCountyJail, serviceInboundEmail);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityMarinCountyJail, serviceVideoAttachments);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityMarinCountyJail, serviceInboundVideograms);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityMarinCountyJail, serviceOutboundVideograms);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityMarinCountyJail, serviceVideoVisit);
		jpayPrelogin().availabilityPricing().verifyJpayServicesAbsent(facilityMarinCountyJail, serviceMusic);
		
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Taft Correctional and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =7, description = "TestCase::PLTC03::Design Steps::"
			+ "85,86,87,88,89,90,91,92(Navigate to Taft Correctional and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplTaftCorrectionalAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plTaftCorrectional);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plTaftCorrectional);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityTaftCorrectionalInistitution);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plTaftCorrectionalAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plTaftCorrectionalPhone);
		
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Avenal State Prison and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =8, description = "TestCase::PLTC03::Design Steps::"
			+ "93,94,95,96,97,98,99,100(Navigate to Avenal State Prison and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplAvenalStatePrisonAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plAvenalStatePrison);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plAvenalStatePrison);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plAvenalStatePrisonAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plAvenalStatePrisonPhone);
		
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to California City Correctional Center and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =9, description = "TestCase::PLTC03::Design Steps::"
			+ "101,102,103,104,105,106,107,108(Navigate to California City Correctional Center and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplCaliforniaCityCorrectionalCenterAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plCalCityCorrectionalCenter);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plCalCityCorrectionalCenter);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plCalCityCorrectionalCenterAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plCalCityCorrectionalCenterPhone);
		
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to California City Psbp and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =10, description = "TestCase::PLTC03::Design Steps::"
			+ "109,110,111,112,113,114,115,116(Navigate to California City Psbp and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplCaliforniaCityPsbpAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plCalCityPsbp);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plCalCityPsbp);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plCalCityPsbpAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plCalCityPsbpPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to California Correctional Center and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =11, description = "TestCase::PLTC03::Design Steps::"
			+ "117,118,119,120,121,122,123,124(Navigate to California Correctional Center and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplCaliforniaCorrectionalCenterAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plCalCorrectionalCenter);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plCalCorrectionalCenter);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plCalCorrectionalCenterAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plCalCorrectionalCenterPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to California Correctional Institution and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =12, description = "TestCase::PLTC03::Design Steps::"
			+ "125,126,127,128,129,130,131,132(Navigate to California Correctional Institution and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplCalCorrectionalInstitutionAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plCalCorrectionalInstitution);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plCalCorrectionalInstitution);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plCalCorrectionalInstitutionAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plCalCorrectionalInstitutionPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to California Health Care Facility and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =13, description = "TestCase::PLTC03::Design Steps::"
			+ "133,134,135,136,137,138,139,140(Navigate to California Health Care Facility and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplCalHealthCareFacilityAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plCalHealthCareFacility);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plCalHealthCareFacility);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plCalHealthCareFacilityAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plCalHealthCareFacilityPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to California Institution for Men and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =14, description = "TestCase::PLTC03::Design Steps::"
			+ "141,142,143,144,145,146,147,148(Navigate to California Institution for Men and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplCalInstitutionForMenAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plCalInstitutionForMen);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plCalInstitutionForMen);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plCalInstitutionForMenAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plCalInstitutionForMenPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to California Institution for Women and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =15, description = "TestCase::PLTC03::Design Steps::"
			+ "149,150,151,152,153,154,155,156(Navigate to California Institution for Women and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplCalInstitutionForWomenAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plCalInstitutionForWomen);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plCalInstitutionForWomen);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plCalInstitutionForWomenAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plCalInstitutionForWomenPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to California Medical Facility and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =16, description = "TestCase::PLTC03::Design Steps::"
			+ "157,158,159,160,161,162,163,164(Navigate to California Medical Facility and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplCaliforniaMedicalFacilityAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plCalMedicalFacility);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plCalMedicalFacility);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plCalMedicalFacilityAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plCalMedicalFacilityPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to California Men's Colony and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =17, description = "TestCase::PLTC03::Design Steps::"
			+ "165,166,167,168,169,170,171,172(Navigate to California Men's Colony and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplCaliforniaMensColonyAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plCalMensColony);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plCalMensColony);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plCalMensColonyAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plCalMensColonyPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to California Rehabilitation Center and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =18, description = "TestCase::PLTC03::Design Steps::"
			+ "173,174,175,176,177,178,179,180(Navigate to California Rehabilitation Center and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplCaliforniaRehabilitationCenterAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plCalRehabilitationCenter);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plCalRehabilitationCenter);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plCalRehabilitationCenterAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plCalRehabilitationCenterPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to California Substance Abuse Treatment Facility at Corcoran and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =19, description = "TestCase::PLTC03::Design Steps::"
			+ "181,182,183,184,185,186,187,188(Navigate to California Substance Abuse Treatment Facility at Corcoran and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplCaliforniaSubstanceAbuseTreatmentFacilityCorcoranAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plCalSubstanceAbuseCorcoran);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plCalSubstanceAbuseCorcoran);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plCalSubstanceAbuseCorcoranAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plCalSubstanceAbuseCorcoranPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to CalipatriaStatePrison and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =20, description = "TestCase::PLTC03::Design Steps::"
			+ "189,190,191,192,193,194,195,196(Navigate to Calipatria State Prison and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplCalipatriaStatePrisonAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plCalipatriaStatePrison);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plCalipatriaStatePrison);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plCalipatriaStatePrisonAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plCalipatriaStatePrisonPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Centinela State Prison and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =21, description = "TestCase::PLTC03::Design Steps::"
			+ "197,198,199,200,201,202,203,204(Navigate to Centinela State Prison and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplCentinelaStatePrisonAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plCentinelaStatePrison);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plCentinelaStatePrison);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plCentinelaStatePrisonAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plCentinelaStatePrisonPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Central California Women's Prison and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =22, description = "TestCase::PLTC03::Design Steps::"
			+ "205,206,207,208,209,210,211,212(Navigate to Central California Women's Prison and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplCentralCaliforniaWomensFacilityAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plCentralCalWomensFacility);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plCentralCalWomensFacility);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plCentralCalWomensFacilityAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plCentralCalWomensFacilityPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Central Office and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =23, description = "TestCase::PLTC03::Design Steps::"
			+ "213,214,215,216,217,218,219,220(Navigate to Central Office and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplCentralOfficeAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plCentralOffice);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plCentralOffice);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plCentralOfficeAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plCentralOfficePhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Chuckawalla Valley State Prison and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =24, description = "TestCase::PLTC03::Design Steps::"
			+ "221,222,223,224,225,226,227,228(Navigate to Chuckawalla Valley State Prison and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplChuckawallaValleyStatePrisonAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plChuckawallaValleyStatePrison);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plChuckawallaValleyStatePrison);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plChuckawallaValleyStatePrisonAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plChuckawallaValleyStatePrisonPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Correctional Training Facility and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =25, description = "TestCase::PLTC03::Design Steps::"
			+ "229,230,231,232,233,234,235,236(Navigate to Correctional Training Facility and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplCorrectionalTrainingFacilityAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plCorrectionalTrainingFacility);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plCorrectionalTrainingFacility);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plCorrectionalTrainingFacilityAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plCorrectionalTrainingFacilityPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to CSP-Corcoran and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =26, description = "TestCase::PLTC03::Design Steps::"
			+ "237,238,239,240,241,242,243,244(Navigate to CSP-Corcoran and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplCSPCorcoranAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plCSPCorcoran);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plCSPCorcoran);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plCSPCorcoranAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plCSPCorcoranPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to CSP-Los Angeles County and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =27, description = "TestCase::PLTC03::Design Steps::"
			+ "245,246,247,248,249,250,251,252(Navigate to CSP-Los Angeles County and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplCSPLosAngelesCountyAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plCSPLosAngelesCounty);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plCSPLosAngelesCounty);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plCSPLosAngelesCountyAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plCSPLosAngelesCountyPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to CSP-Sacramento and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =28, description = "TestCase::PLTC03::Design Steps::"
			+ "245,246,247,248,249,250,251,252(Navigate to CSP-Sacramento and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplCSPSacramentoAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plCSPSacramento);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plCSPSacramento);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plCSPSacramentoAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plCSPSacramentoPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to CSP-San Quentin and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =29, description = "TestCase::PLTC03::Design Steps::"
			+ "253,254,255,256,257,258,259,260(Navigate to CSP-San Quentin and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplCSPSanQuentinAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plCSPSanQuentin);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plCSPSanQuentin);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plCSPSanQuentinAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plCSPSanQuentinPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to CSP-Solono and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =30, description = "TestCase::PLTC03::Design Steps::"
			+ "261,262,263,264,265,266,267,268(Navigate to CSP-Solono and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplCSPSolonoAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plCSPSolono);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plCSPSolono);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plCSPSolonoAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plCSPSolonoPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Deuel Vocational Institution and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =31, description = "TestCase::PLTC03::Design Steps::"
			+ "269,270,271,272,273,274,275,276(Navigate to Deuel Vocational Institution and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplDeuelVocationalInstitutionAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plDeuelVocationalInstitution);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plDeuelVocationalInstitution);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plDeuelVocationalInstitutionAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plDeuelVocationalInstitutionPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Folsom State Prison and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =32, description = "TestCase::PLTC03::Design Steps::"
			+ "277,278,279,280,281,282,283,284(Navigate to Folsom State Prison and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplFolsomStatePrisonAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plFolsomStatePrison);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plFolsomStatePrison);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plFolsomStatePrisonAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plFolsomStatePrisonPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to High Desert State Prison and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =33, description = "TestCase::PLTC03::Design Steps::"
			+ "285,286,287,288,289,290,291,292(Navigate to High Desert State Prison and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplHighDesertStatePrisonAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plHighDesertStatePrison);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plHighDesertStatePrison);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plHighDesertStatePrisonAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plHighDesertStatePrisonPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Ironwood State Prison and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =34, description = "TestCase::PLTC03::Design Steps::"
			+ "293,294,295,296,297,298,299,300(Navigate to Ironwood State Prison and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplIronwoodStatePrisonAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plIronwoodStatePrison);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plIronwoodStatePrison);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plIronwoodStatePrisonAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plIronwoodStatePrisonPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Kern Valley State Prison and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =35, description = "TestCase::PLTC03::Design Steps::"
			+ "301,302,303,304,305,306,307,308(Navigate to Kern Valley State Prison and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplKernValleyStatePrisonAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plKernValleyStatePrison);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plKernValleyStatePrison);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plKernValleyStatePrisonAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plKernValleyStatePrisonPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Mule Creek State Prison and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =36, description = "TestCase::PLTC03::Design Steps::"
			+ "309,310,311,312,313,314,315,316(Navigate to Mule Creek State Prison and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplMuleCreekStatePrisonAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plMuleCreekStatePrison);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plMuleCreekStatePrison);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plMuleCreekStatePrisonAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plMuleCreekStatePrisonPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to North Kern State Prison and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =37, description = "TestCase::PLTC03::Design Steps::"
			+ "317,318,319,320,321,322,323,324(Navigate to North Kern State Prison and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplNorthKernStatePrisonAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plNorthKernStatePrison);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plNorthKernStatePrison);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plNorthKernStatePrisonAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plNorthKernStatePrisonPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Pelican Bay State Prison and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =38, description = "TestCase::PLTC03::Design Steps::"
			+ "325,326,327,328,329,330,331,332(Navigate to Pelican Bay State Prison and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplPelicanBayStatePrisonAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plPelicanBayStatePrison);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plPelicanBayStatePrison);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plPelicanBayStatePrisonAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plPelicanBayStatePrisonCCTFPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Pleasant Valley State Prison and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =39, description = "TestCase::PLTC03::Design Steps::"
			+ "333,334,335,336,337,338,339,340(Navigate to Pleasant Valley State Prison and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplPleasantValleyStatePrisonAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plPleasantValleyStatePrison);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plPleasantValleyStatePrison);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plPleasantValleyStatePrisonAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plPleasantValleyStatePrisonPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to R.J. Donovan Correctional Facility and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =40, description = "TestCase::PLTC03::Design Steps::"
			+ "341,342,343,344,345,346,347,348(Navigate to R.J. Donovan Correctional Facility and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplRJDonovanCorrectionalFacilityAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plRJDonovanCorrectionalFacility);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plRJDonovanCorrectionalFacility);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plRJDonovanCorrectionalFacilityAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plRJDonovanCorrectionalFacilityPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Salinas Valley State Prison and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =41, description = "TestCase::PLTC03::Design Steps::"
			+ "349,350,351,352,353,354,355,356(Navigate to Salinas Valley State Prison and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplSalinasValleyStatePrisonAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plSalinasValleyStatePrison);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plSalinasValleyStatePrison);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plSalinasValleyStatePrisonAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plSalinasValleyStatePrisonPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Sierra Conservation Center and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =42, description = "TestCase::PLTC03::Design Steps::"
			+ "357,358,359,360,361,362,363,364(Navigate to Sierra Conservation Center and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplSierraConservationCenterAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plSierraConservationCenter);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plSierraConservationCenter);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plSierraConservationCenterAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plSierraConservationCenterPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Test By Fred and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =43, description = "TestCase::PLTC03::Design Steps::"
			+ "365,366,367,368,369,370,371,372(Navigate to Test By Fred and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplTestByFredAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plTestByFred);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plTestByFred);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plTestByFredAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plTestByFredPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Valley State Prison and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =44, description = "TestCase::PLTC03::Design Steps::"
			+ "373,374,375,376,377,378,379,380(Navigate to Valley State Prison and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplValleyStatePrisonAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plValleyStatePrison);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plValleyStatePrison);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plValleyStatePrisonAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plValleyStatePrisonPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Wasco State Prison and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =45, description = "TestCase::PLTC03::Design Steps::"
			+ "381,382,383,384,385,386,387,388(Navigate to Wasco State Prison and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplWascoStatePrisonAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plWascoStatePrison);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plWascoStatePrison);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityCaliforniaStatePrisonSystem);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plWascoStatePrisonAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plWascoStatePrisonPhone);
			
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Marin County Jail and verify Facility,permloc,available 
	 * services text,physical address and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =46, description = "TestCase::PLTC03::Design Steps::"
			+ "389,390,391,392,393,394,395,396(Navigate to Marin County Jail and verify "
			+ "Facility,permloc,available services text,physical address and phone number.)")
	public void clickplMarinCountyJailAndVerify() {

		jpayPrelogin().availabilityPricing().navigateBrowserBack();
		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(plMarinCountyJail);
		jpayPrelogin().availabilityPricing().verifyPermlocName(plMarinCountyJail);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facilityMarinCountyJail);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddress(plMarinCountyJailAdd);
		jpayPrelogin().availabilityPricing().verifyPhoneNumber(plMarinCountyJailPhone);
			
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on home link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 47, description = "TestCase::PLTC03::Design Steps::"
			+ "397( Click on home link.)")
	public void testEnd() {

		jpayEmail().headerNavigation().clickHomeLink();
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailPLTC_031Test(data) };
	}
	
	
	public EmailPLTC_031Test(Map<String, String> data) {
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
		
		facilityTaftCorrectionalInistitution = data.get("facilityTaftCorrectionalInistitution");
		plTaftCorrectional = data.get("plTaftCorrectional");
		plTaftCorrectionalAdd = data.get("plTaftCorrectionalAdd");
		plTaftCorrectionalPhone = data.get("plTaftCorrectionalPhone");
		
		
		facilityCaliforniaStatePrisonSystem = data.get("facilityCaliforniaStatePrisonSystem");
		plAvenalStatePrison = data.get("plAvenalStatePrison");
		plAvenalStatePrisonAdd= data.get("plAvenalStatePrisonAdd");
		plAvenalStatePrisonPhone = data.get("plAvenalStatePrisonPhone");
		plCalCityCorrectionalCenter= data.get("plCalCityCorrectionalCenter");
		plCalCityCorrectionalCenterAdd = data.get("plCalCityCorrectionalCenterAdd");
		plCalCityCorrectionalCenterPhone= data.get("plCalCityCorrectionalCenterPhone");
		plCalCityPsbp = data.get("plCalCityPsbp");
		plCalCityPsbpAdd= data.get("plCalCityPsbpAdd");
		plCalCityPsbpPhone = data.get("plCalCityPsbpPhone");
		plCalCorrectionalCenter= data.get("plCalCorrectionalCenter");
		plCalCorrectionalCenterAdd = data.get("plCalCorrectionalCenterAdd");
		plCalCorrectionalCenterPhone= data.get("plCalCorrectionalCenterPhone");
		plCalCorrectionalInstitution = data.get("plCalCorrectionalInstitution");
		plCalCorrectionalInstitutionAdd= data.get("plCalCorrectionalInstitutionAdd");
		plCalCorrectionalInstitutionPhone = data.get("plCalCorrectionalInstitutionPhone");
		plCalHealthCareFacility= data.get("plCalHealthCareFacility");
		plCalHealthCareFacilityAdd= data.get("plCalHealthCareFacilityAdd");
		plCalHealthCareFacilityPhone = data.get("plCalHealthCareFacilityPhone");
		plCalInstitutionForMen= data.get("plCalInstitutionForMen");
		plCalInstitutionForMenAdd = data.get("plCalInstitutionForMenAdd");
		plCalInstitutionForMenPhone= data.get("plCalInstitutionForMenPhone");
		plCalInstitutionForWomen = data.get("plCalInstitutionForWomen");
		plCalInstitutionForWomenAdd= data.get("plCalInstitutionForWomenAdd");
		plCalInstitutionForWomenPhone = data.get("plCalInstitutionForWomenPhone");
		plCalMedicalFacility= data.get("plCalMedicalFacility");
		plCalMedicalFacilityAdd = data.get("plCalMedicalFacilityAdd");
		plCalMedicalFacilityPhone= data.get("plCalMedicalFacilityPhone");
		plCalMensColony = data.get("plCalMensColony");
		plCalMensColonyAdd= data.get("plCalMensColonyAdd");
		plCalMensColonyPhone = data.get("plCalMensColonyPhone");
		plCalRehabilitationCenter= data.get("plCalRehabilitationCenter");
		plCalRehabilitationCenterAdd = data.get("plCalRehabilitationCenterAdd");
		plCalRehabilitationCenterPhone= data.get("plCalRehabilitationCenterPhone");
		plCalSubstanceAbuseCorcoran = data.get("plCalSubstanceAbuseCorcoran");
		plCalSubstanceAbuseCorcoranAdd= data.get("plCalSubstanceAbuseCorcoranAdd");
		plCalSubstanceAbuseCorcoranPhone = data.get("plCalSubstanceAbuseCorcoranPhone");
		plCalipatriaStatePrison= data.get("plCalipatriaStatePrison");
		plCalipatriaStatePrisonAdd = data.get("plCalipatriaStatePrisonAdd");
		plCalipatriaStatePrisonPhone= data.get("plCalipatriaStatePrisonPhone");
		plCentinelaStatePrison = data.get("plCentinelaStatePrison");
		plCentinelaStatePrisonAdd= data.get("plCentinelaStatePrisonAdd");
		plCentinelaStatePrisonPhone = data.get("plCentinelaStatePrisonPhone");
		plCentralCalWomensFacility= data.get("plCentralCalWomensFacility");
		plCentralCalWomensFacilityAdd = data.get("plCentralCalWomensFacilityAdd");
		plCentralCalWomensFacilityPhone = data.get("plCentralCalWomensFacilityPhone");
		plCentralOffice = data.get("plCentralOffice");
		plCentralOfficeAdd= data.get("plCentralOfficeAdd");
		plCentralOfficePhone = data.get("plCentralOfficePhone");
		plChuckawallaValleyStatePrison= data.get("plChuckawallaValleyStatePrison");
		plChuckawallaValleyStatePrisonAdd = data.get("plChuckawallaValleyStatePrisonAdd");
		plChuckawallaValleyStatePrisonPhone= data.get("plChuckawallaValleyStatePrisonPhone");
		plCorrectionalTrainingFacility = data.get("plCorrectionalTrainingFacility");
		plCorrectionalTrainingFacilityAdd= data.get("plCorrectionalTrainingFacilityAdd");
		plCorrectionalTrainingFacilityPhone = data.get("plCorrectionalTrainingFacilityPhone");
		plCSPCorcoran= data.get("plCSPCorcoran");
		plCSPCorcoranAdd = data.get("plCSPCorcoranAdd");
		plCSPCorcoranPhone= data.get("plCSPCorcoranPhone");
		plCSPLosAngelesCounty = data.get("plCSPLosAngelesCounty");
		plCSPLosAngelesCountyAdd= data.get("plCSPLosAngelesCountyAdd");
		plCSPLosAngelesCountyPhone = data.get("plCSPLosAngelesCountyPhone");
		plCSPSacramento= data.get("plCSPSacramento");
		plCSPSacramentoAdd = data.get("plCSPSacramentoAdd");
		plCSPSacramentoPhone = data.get("plCSPSacramentoPhone");
		plCSPSanQuentin = data.get("plCSPSanQuentin");
		plCSPSanQuentinAdd= data.get("plCSPSanQuentinAdd");
		plCSPSanQuentinPhone = data.get("plCSPSanQuentinPhone");
		plCSPSolono= data.get("plCSPSolono");
		plCSPSolonoAdd = data.get("plCSPSolonoAdd");
		plCSPSolonoPhone= data.get("plCSPSolonoPhone");
		plDeuelVocationalInstitution = data.get("plDeuelVocationalInstitution");
		plDeuelVocationalInstitutionAdd= data.get("plDeuelVocationalInstitutionAdd");
		plDeuelVocationalInstitutionPhone = data.get("plDeuelVocationalInstitutionPhone");
		plFolsomStatePrison= data.get("plFolsomStatePrison");
		plFolsomStatePrisonAdd = data.get("plFolsomStatePrisonAdd");
		plFolsomStatePrisonPhone= data.get("plFolsomStatePrisonPhone");
		plHighDesertStatePrison = data.get("plHighDesertStatePrison");
		plHighDesertStatePrisonAdd= data.get("plHighDesertStatePrisonAdd");
		plHighDesertStatePrisonPhone = data.get("plHighDesertStatePrisonPhone");
		plIronwoodStatePrison= data.get("plIronwoodStatePrison");
		plIronwoodStatePrisonAdd = data.get("plIronwoodStatePrisonAdd");
		plIronwoodStatePrisonPhone = data.get("plIronwoodStatePrisonPhone");
		plKernValleyStatePrison = data.get("plKernValleyStatePrison");
		plKernValleyStatePrisonAdd= data.get("plKernValleyStatePrisonAdd");
		plKernValleyStatePrisonPhone = data.get("plKernValleyStatePrisonPhone");
		plMuleCreekStatePrison= data.get("plMuleCreekStatePrison");
		plMuleCreekStatePrisonAdd = data.get("plMuleCreekStatePrisonAdd");
		plMuleCreekStatePrisonPhone= data.get("plMuleCreekStatePrisonPhone");
		plNorthKernStatePrison = data.get("plNorthKernStatePrison");
		plNorthKernStatePrisonAdd= data.get("plNorthKernStatePrisonAdd");
		plNorthKernStatePrisonPhone = data.get("plNorthKernStatePrisonPhone");
		plPelicanBayStatePrison= data.get("plPelicanBayStatePrison");
		plPelicanBayStatePrisonAdd = data.get("plPelicanBayStatePrisonAdd");
		plPelicanBayStatePrisonCCTFPhone= data.get("plPelicanBayStatePrisonCCTFPhone");
		plPleasantValleyStatePrison = data.get("plPleasantValleyStatePrison");
		plPleasantValleyStatePrisonAdd= data.get("plPleasantValleyStatePrisonAdd");
		plPleasantValleyStatePrisonPhone = data.get("plPleasantValleyStatePrisonPhone");
		plRJDonovanCorrectionalFacility= data.get("plRJDonovanCorrectionalFacility");
		plRJDonovanCorrectionalFacilityAdd = data.get("plRJDonovanCorrectionalFacilityAdd");
		plRJDonovanCorrectionalFacilityPhone= data.get("plRJDonovanCorrectionalFacilityPhone");
		plSalinasValleyStatePrison = data.get("plSalinasValleyStatePrison");
		plSalinasValleyStatePrisonAdd= data.get("plSalinasValleyStatePrisonAdd");
		plSalinasValleyStatePrisonPhone = data.get("plSalinasValleyStatePrisonPhone");
		plSierraConservationCenter= data.get("plSierraConservationCenter");
		plSierraConservationCenterAdd = data.get("plSierraConservationCenterAdd");
		plSierraConservationCenterPhone= data.get("plSierraConservationCenterPhone");
		plTestByFred = data.get("plTestByFred");
		plTestByFredAdd= data.get("plTestByFredAdd");
		plTestByFredPhone = data.get("plTestByFredPhone");
		plValleyStatePrison= data.get("plValleyStatePrison");
		plValleyStatePrisonAdd = data.get("plValleyStatePrisonAdd");
		plValleyStatePrisonPhone= data.get("plValleyStatePrisonPhone");
		plWascoStatePrison = data.get("plWascoStatePrison");
		plWascoStatePrisonAdd = data.get("plWascoStatePrisonAdd");
		plWascoStatePrisonPhone = data.get("plWascoStatePrisonPhone");
		
		
		
		facilityMarinCountyJail = data.get("facilityMarinCountyJail");
		plMarinCountyJail = data.get("plMarinCountyJail");
		plMarinCountyJailAdd = data.get("plMarinCountyJailAdd");
		plMarinCountyJailPhone = data.get("plMarinCountyJailPhone");
		
	}

	


}
