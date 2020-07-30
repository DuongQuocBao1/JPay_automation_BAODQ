package com.jpay.media.automation.web.utilities;

import java.io.Serializable;

public class TestResult implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	private String testCaseID;
	private String suiteID;
	private String executionVatiant;
	private String testStartTime;
	private String testEndTime;
	private String testExecTime;
	private int testSteps;
	private int stepsPassed;
	private int stepsFailed;
	private int stepsSkipped;
	private double percentPassed;
	private String automationReportPath;
	private String rownum;
	public String getTestCaseID() {
		return testCaseID;
	}
	public void setTestCaseID(String testCaseID) {
		this.testCaseID = testCaseID;
	}
	public String getSuiteID() {
		return suiteID;
	}
	public void setSuiteID(String suiteID) {
		this.suiteID = suiteID;
	}
	public String getExecutionVatiant() {
		return executionVatiant;
	}
	public void setExecutionVatiant(String executionVatiant) {
		this.executionVatiant = executionVatiant;
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
	public String getTestExecTime() {
		return testExecTime;
	}
	public void setTestExecTime(String testExecTime) {
		this.testExecTime = testExecTime;
	}
	public int getTestSteps() {
		return testSteps;
	}
	public void setTestSteps(int testSteps) {
		this.testSteps = testSteps;
	}
	public int getStepsPassed() {
		return stepsPassed;
	}
	public void setStepsPassed(int stepsPassed) {
		this.stepsPassed = stepsPassed;
	}
	public int getStepsFailed() {
		return stepsFailed;
	}
	public void setStepsFailed(int stepsFailed) {
		this.stepsFailed = stepsFailed;
	}
	public int getStepsSkipped() {
		return stepsSkipped;
	}
	public void setStepsSkipped(int stepsSkipped) {
		this.stepsSkipped = stepsSkipped;
	}
	public double getPercentPassed() {
		return percentPassed;
	}
	public void setPercentPassed(double percentPassed) {
		this.percentPassed = percentPassed;
	}
	public String getAutomationReportPath() {
		return automationReportPath;
	}
	public void setAutomationReportPath(String automationReportPath) {
		this.automationReportPath = automationReportPath;
	}
	public String getRownum() {
		return rownum;
	}
	public void setRownum(String rownum) {
		this.rownum = rownum;
	}
	
}
