package com.jpay.media.automation.web.utilities;

import java.io.Serializable;

public class TestResultDetail implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	private String testResultID;
	private String testStepName;
	private String testStepStatus;
	private String stepStartTime;
	private String stepEndTime;
	private String stepExecTime;
	private String inputValue;
	private String expectedValue;
	private String actualValue;
	private String screenShotPath;
	private String stepSequence;
	private String stepDescription;
	
	public String getTestResultID() {
		return testResultID;
	}
	public void setTestResultID(String testResultID) {
		this.testResultID = testResultID;
	}
	public String getTestStepName() {
		return testStepName;
	}
	public void setTestStepName(String testStepName) {
		this.testStepName = testStepName;
	}
	public String getTestStepStatus() {
		return testStepStatus;
	}
	public void setTestStepStatus(String testStepStatus) {
		this.testStepStatus = testStepStatus;
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
	public String getStepExecTime() {
		return stepExecTime;
	}
	public void setStepExecTime(String stepExecTime) {
		this.stepExecTime = stepExecTime;
	}
	public String getInputValue() {
		return inputValue;
	}
	public void setInputValue(String inputValue) {
		this.inputValue = inputValue;
	}
	public String getExpectedValue() {
		return expectedValue;
	}
	public void setExpectedValue(String expectedValue) {
		this.expectedValue = expectedValue;
	}
	public String getActualValue() {
		return actualValue;
	}
	public void setActualValue(String actualValue) {
		this.actualValue = actualValue;
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
