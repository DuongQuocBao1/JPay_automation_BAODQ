package com.jpay.media.automation.web.constants;

public class Constant {

	// Database constants

	public static final String PROP_FILE_PATH = "SQA_TA_PROP_FILEPATH_ENV_VAR";
	public static final String RUN_PLATFROM = "SQA_TA_RUN_PLATFROM_ENV_VAR";
	public static final String PROPERTIES_FILE = "database.properties";

	public static final String PROPERTY_URL = "url";
	public static final String PROPERTY_DRIVER = "driver";
	public static final String PROPERTY_USERNAME = "username";
	public static final String PROPERTY_PASSWORD = "password";

	// Messages

	public static final String PROPERTIES_FILE_NOT_FOUND = "Database property file missing from the path";
	public static final String PROPERTIES_FILE_CANNOT_LOAD = "Can not load database property file";
	public static final String PROPERTIES_MISSING_FROM_PROPERTY_FILE = "Required property is missing";
	public static final String DATAMART_MESSAGE = "Test results are successfully inserted into DataMart..";

	public static final String ERR_SCREENSHOT_NOT_AVAILABLE = "Unable to generate a screenshot";
	public static final String ERR_INSERT_RESULT_TABLE = "Error in inserting Result Table";
	public static final String ERR_INSERT_RESULT_DETAIL_TABLE = "Error in inserting Result Detail Table";

	public static final String ERR_IN_LOADING_DRIVER = "Error in loading SQL server driver";


}
