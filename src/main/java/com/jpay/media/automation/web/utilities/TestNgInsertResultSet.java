package com.jpay.media.automation.web.utilities;

import org.testng.ITestNGMethod;

public class TestNgInsertResultSet {

	
	private String suiteID;
	private String testCaseID;
	private String execVariant;
	private String testStartTime;
	private String testEndTime;
	private String automationReportPath;
	private String stepName;
	private String stepStatus;
	private String stepStartTime;
	private String stepEndTime;
	private String actualValue;
	private String expectedValue;
	private String inputValue;
	private String screenShotPath;
	private String stepSequence;
	private String stepDescription;
	private String rownum;
	
	public String getRownum() {
		return rownum;
	}
	public void setRownum(String rownum) {
		this.rownum = rownum;
	}
	public ITestNGMethod[] getAllMethods() {
		return allMethods;
	}
	public void setAllMethods(ITestNGMethod[] allMethods) {
		this.allMethods = allMethods;
	}
	private ITestNGMethod[] allMethods;
	
	
	
	public String getSuiteID() {
		return suiteID;
	}
	public void setSuiteID(String suiteID) {
		this.suiteID = suiteID;
	}
	public String getTestCaseID() {
		return testCaseID;
	}
	public void setTestCaseID(String testCaseID) {
		this.testCaseID = testCaseID;
	}
	public String getExecVariant() {
		return execVariant;
	}
	public void setExecVariant(String execVariant) {
		this.execVariant = execVariant;
	}
	public String getTestStartTime() {
		return testStartTime;
	}
	public void setTestStartTime(String testStartTime) {
		this.testStartTime = testStartTime;
	}
	public String getTestEndTime() {
		return testEndTime;
	}
	public void setTestEndTime(String testEndTime) {
		this.testEndTime = testEndTime;
	}
	public String getAutomationReportPath() {
		return automationReportPath;
	}
	public void setAutomationReportPath(String automationReportPath) {
		this.automationReportPath = automationReportPath;
	}
	public String getStepName() {
		return stepName;
	}
	public void setStepName(String stepName) {
		this.stepName = stepName;
	}
	public String getStepStatus() {
		return stepStatus;
	}
	public void setStepStatus(String stepStatus) {
		this.stepStatus = stepStatus;
	}
	public String getStepStartTime() {
		return stepStartTime;
	}
	public void setStepStartTime(String stepStartTime) {
		this.stepStartTime = stepStartTime;
	}
	public String getStepEndTime() {
		return stepEndTime;
	}
	public void setStepEndTime(String stepEndTime) {
		this.stepEndTime = stepEndTime;
	}
	public String getActualValue() {
		return actualValue;
	}
	public void setActualValue(String actualValue) {
		this.actualValue = actualValue;
	}
	public String getExpectedValue() {
		return expectedValue;
	}
	public void setExpectedValue(String expectedValue) {
		this.expectedValue = expectedValue;
	}
	public String getInputValue() {
		return inputValue;
	}
	public void setInputValue(String inputValue) {
		this.inputValue = inputValue;
	}
	public String getScreenShotPath() {
		return screenShotPath;
	}
	public void setScreenShotPath(String screenShotPath) {
		this.screenShotPath = screenShotPath;
	}
	public String getStepSequence() {
		return stepSequence;
	}
	public void setStepSequence(String stepSequence) {
		this.stepSequence = stepSequence;
	}
	public String getStepDescription() {
		return stepDescription;
	}
	public void setStepDescription(String stepDescription) {
		this.stepDescription = stepDescription;
	}
	
	
}
