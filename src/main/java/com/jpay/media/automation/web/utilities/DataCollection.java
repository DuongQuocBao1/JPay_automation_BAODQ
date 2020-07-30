package com.jpay.media.automation.web.utilities;

import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.Properties;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import com.jpay.media.automation.web.constants.ApplicationConstants;


public class DataCollection {

	private static String dataFilePath;
	public static Properties propFile = null;

	@DataProvider(name = "getData")
	public static Object[][] getData(ITestContext context, Method method) {

		// Data return to the test
		Object[][] data = null;

		// get the method name from the test
		String methodName = method.getName();

		// get total number of counts from that sheet

		int totalSheetRows = 0;
		int methodNameRows = 0;
		int columnNameRows = 0;
		int dataStartRows = 0;
		int dataEndRows = 0;
		int totDataRows = 0;
		int totDataColumns = 0;

		String dataFileName = "";
		String dataSheetName = "";
		String execVariant = "";

		try {
			// propFile =
			// Utilities.getInstance().getPropertyFile(ApplicationConstants.PROJECT_NAME,
			// ApplicationConstants.CONFIGURATION_FILE_NAME);
			// dataFilePath = Utilities.getInstance().getCompletePropFilePath();
			// dataFilePath =
			// System.getenv(ApplicationConstants.EXCEL_FILE_PATH);
			String envName = context.getCurrentXmlTest().getParameter("EnvironmentName");
			String screenShotPath = propFile.getProperty(envName).concat(ApplicationConstants.SCREEN_SHOTS_FILE_PATH);
			Utilities.getInstance().setScreenShotPath(envName);

		} catch (Exception e) {
			// log.error("Did not fing the configuration file : "+e);
		}
		dataFilePath = Utilities.getCompleteFilePath(ApplicationConstants.PROJECT_NAME,
				ApplicationConstants.ROOT_EXCEL_FOLDER);
		dataFileName = context.getCurrentXmlTest().getParameter("dataFileName");
		dataSheetName = context.getCurrentXmlTest().getParameter("dataSheetName");
		// log.info("Data file name : "+dataFileName);
		// log.info("Data sheet name : "+dataSheetName);
		System.out.println("Data file name : " + dataFileName);
		System.out.println("Data sheet name : " + dataSheetName);

		ExcelUtilities excelUtilities = new ExcelUtilities();

		try {

			excelUtilities.openWorkbook(dataFilePath + dataFileName);
			XSSFSheet sheet = excelUtilities.getSheet(dataSheetName);
			totalSheetRows = excelUtilities.getNumberOfRowsFromSheet(sheet.getSheetName());

			for (int i = 0; i <= totalSheetRows; i++) {
				if ((excelUtilities.getCellData(sheet.getSheetName(), i, 1).equalsIgnoreCase((methodName.trim())))) {
					methodNameRows = i;
					break;
				}

				for (int j = methodNameRows + 1; j <= totalSheetRows; j++) {
					if (excelUtilities.getCellData(dataSheetName, j, 0)
							.equalsIgnoreCase(ApplicationConstants.INFO_DATAEXCEL_COLUMN_NAME)) {
						columnNameRows = j;
						break;
					}
				}

				for (int j = columnNameRows + 1; j <= totalSheetRows; j++) {
					if (excelUtilities.getCellData(dataSheetName, j, 0)
							.equalsIgnoreCase(ApplicationConstants.INFO_DATAEXCEL_DATASTART_COLUMN)) {
						dataStartRows = j;
						break;
					}
				}

				for (int j = dataStartRows + 1; j <= totalSheetRows; j++) {
					if (excelUtilities.getCellData(dataSheetName, j, 0)
							.equalsIgnoreCase(ApplicationConstants.INFO_DATAEXCEL_DATAEND_COLUMN)) {
						dataEndRows = j;
						break;
					}
				}

				totDataRows = (dataEndRows - dataStartRows);

				for (int j = columnNameRows; j <= dataEndRows; j++) {
					if (excelUtilities.getCellData(dataSheetName, j, 0)
							.equalsIgnoreCase(ApplicationConstants.INFO_DATAEXCEL_COLUMN_NAME)) {
						int x = 0;
						while ((excelUtilities.getCellData(dataSheetName, j, x).length() != 0)) {
							x = x + 1;
						}
						totDataColumns = x - 1;
						break;
					}
				}

				data = new Object[totDataRows][1];
				int rowIndex = 0;
				int rowNum = 1;

				for (int j = columnNameRows; j <= (columnNameRows + totDataRows - 1); j++) {
					Hashtable<String, String> datarowTable = new Hashtable<String, String>();

					for (int colNum = 0; colNum <= totDataColumns; colNum++) {
						datarowTable.put(excelUtilities.getCellData(dataSheetName, columnNameRows, colNum),
								excelUtilities.getCellData(dataSheetName, dataStartRows, colNum));
						execVariant = execVariant
								.concat(excelUtilities.getCellData(dataSheetName, dataStartRows, colNum));

					}

					datarowTable.put(ApplicationConstants.INFO_DATAEXCEL_ROW_ID, Integer.toString(rowNum));
					rowNum++;
					datarowTable.put(ApplicationConstants.INFO_DATAEXCEL_EXEC_VARIANT, execVariant);
					dataStartRows = dataStartRows + 1;
					data[rowIndex][0] = datarowTable;
					datarowTable = null;
					rowIndex++;

				}

			}
		} catch (RuntimeException e) {

			Log.error("Get data error : " + e);
		}
		return data;

	}

}