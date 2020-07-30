package com.jpay.media.automation.web.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {

	private XSSFWorkbook workBook;
	private XSSFSheet sheet;

	private InputStream excelFileInputStream = null;
	private FileOutputStream excelFileOutputStream = null;
	private String[] columns;

	public XSSFSheet getSheet() {

		return sheet;
	}

	public XSSFWorkbook getWorkBook() {
		return workBook;
	}

	public void setWorkBook(XSSFWorkbook workBook) {
		this.workBook = workBook;
	}

	public void setSheet(XSSFSheet sheet) {
		this.sheet = sheet;
	}

	public void openWorkbook(String filePath) {

		try {

			OPCPackage pkg = OPCPackage.open(new File(filePath));
			workBook = new XSSFWorkbook(pkg);

		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}

	}

	public void openWorkbook(File file) {

		try {

			OPCPackage pkg = OPCPackage.open(file);
			workBook = new XSSFWorkbook(pkg);

		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void closeWorkbook() {

		try {

			excelFileInputStream.close();
			workBook.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void writeWorkbook(File file) {

		try {

			String source = file.getPath();
			String destinationLocation = "";
			String[] flders = source.split("\\\\");

			for (int i = 0; i < flders.length - 1; i++) {

				destinationLocation = destinationLocation + "\\" + flders[i];

				File tempFolderLocation = new File(destinationLocation + "\\temp");
				File tempFileLocation = new File(tempFolderLocation.getPath() + "\\" + flders[(flders.length - 1)]);

				if (!tempFolderLocation.exists()) {

					tempFolderLocation.mkdir();
					excelFileOutputStream = new FileOutputStream(tempFileLocation);
					workBook.write(excelFileOutputStream);

					excelFileOutputStream.flush();
					excelFileOutputStream.close();
					tempFileLocation.renameTo(new File(destinationLocation + "\\" + flders[(flders.length - 1)]));

					tempFileLocation.delete();
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			e.getMessage();
			e.getCause();
		} catch (IOException e) {
			e.printStackTrace();
			e.getMessage();
			e.getCause();
		}

	}

	public void getSheet(int sheetNumber) {

		setSheet(this.getWorkBook().getSheetAt(sheetNumber));
	}

	public XSSFSheet getSheet(String sheetNumber) {

		return (this.getWorkBook().getSheet(sheetNumber));
	}

	public String readStringCell(String column, int row) {

		int numColumn = getColumnFromLetters(column);
		numColumn++;
		return readStringCell(numColumn, row);
	}

	public String readStringCell(int column, int row) {

		column--;
		row--;
		String cellValue = "";

		try {

			if (this.getSheet() == null) {

				this.setSheet(this.getWorkBook().getSheetAt(0));
			}

			XSSFRow sheetRow = this.getSheet().getRow(row);
			XSSFCell rowCell = sheetRow.getCell(column);
			cellValue = rowCell.toString();

		} catch (NullPointerException e) {

			cellValue = null;
		} catch (Exception e) {

			System.out.println("There was an error reading the cell " + column + "," + row + ":" + e);
		}
		return cellValue;

	}

	public int getColumnFromLetters(String column) {

		int count = 0;
		while (!column.equalsIgnoreCase(this.columns[count])) {

			count++;
		}

		return count;
	}

	public int getColumnNum(XSSFSheet sheet, int totalColumn, String columnName) {

		String temp = "";
		int i;
		for (i = 0; i < totalColumn; i++) {

			temp = sheet.getRow(0).getCell(i).getStringCellValue();
			if (temp.equalsIgnoreCase(columnName)) {
				break;
			}
		}

		return i--;
	}

	public int getColumnNum(String columnName) {

		int totalColumn = getNumberOfColumns(sheet);
		String temp = "";
		int i;
		for (i = 0; i < totalColumn; i++) {

			temp = sheet.getRow(0).getCell(i).getStringCellValue();
			if (temp.equalsIgnoreCase(columnName)) {
				break;
			}
		}

		return i--;
	}

	public void writeCell(XSSFSheet sheet, int rowNum, int colNum, String cellData) {

		XSSFCell cell;
		XSSFRow row;
		row = sheet.getRow(rowNum);
		cell = row.getCell(colNum);

		if (cell == null) {
			cell = row.createCell(colNum);
			cell.setCellValue(cellData);

		} else {
			cell.setCellValue(cellData);

		}

	}

	public void writeData(String dataFilePath, String workbook, String Sheet, int rowNum, Map<String, String> data) {

		File excelFile = new File(dataFilePath + workbook);

		try {

			openWorkbook(excelFile);
			XSSFSheet sheet = getSheet(Sheet);
			int totalSheetColumns = getNumberOfColumns(sheet);
			int colNum;
			String columnName = "";
			String cellData = "";

			for (Map.Entry<String, String> entry : data.entrySet()) {
				columnName = (String) entry.getKey();
				colNum = getColumnNum(sheet, totalSheetColumns, columnName);
				writeCell(sheet, rowNum, colNum, cellData);

			}

			writeWorkbook(excelFile);

		} catch (RuntimeException e) {

			System.out.println("writeCell() failed : " + e);
		}
	}

	public boolean writeStringCell(String column, int row, String cellData) {

		int numColumn = getColumnFromLetters(cellData);
		numColumn++;
		return writeStringCell(numColumn, row, cellData);
	}

	public boolean writeStringCell(int column, int row, String cellData) {

		column--;
		row--;
		boolean success = true;

		try {

			if (this.getSheet() == null) {
				this.setSheet(this.getWorkBook().getSheetAt(0));

			}
			XSSFRow sheetRow = getSheet().createRow(row);
			XSSFCell rowCell = sheetRow.createCell(column);
			rowCell.setCellValue(cellData);

		} catch (Exception e) {
			System.out.println("Error writing to the cell : " + e);
			success = false;
		}
		return success;
	}

	public String[] getSheetNames() {
		int totalsheets = 0;
		int i = 0;
		String[] sheetName = null;

		totalsheets = workBook.getNumberOfSheets();
		sheetName = new String[totalsheets];

		while (i < totalsheets) {
			sheetName[i] = workBook.getSheetName(i);
			i++;

		}
		closeWorkbook();
		return sheetName;
	}

	public int[] getSheetIndex() {
		int totalsheets = 0;
		int i = 0;
		int[] sheetIndex = null;
		String[] sheetName = getSheetNames();

		totalsheets = workBook.getNumberOfSheets();
		sheetIndex = new int[totalsheets];

		while (i < totalsheets) {
			sheetIndex[i] = workBook.getSheetIndex(sheetName[i]);
			i++;

		}
		closeWorkbook();
		return sheetIndex;
	}

	public int getNumberOfSheets() {

		int totalSheets = 0;
		totalSheets = workBook.getNumberOfSheets();
		closeWorkbook();
		return totalSheets;
	}

	public int getNumberOfColumns(int sheetIndex) {

		int colNum = 0;
		@SuppressWarnings("unused")
		XSSFCell cell = null;
		XSSFSheet sheet = null;
		sheet = workBook.getSheetAt(sheetIndex);
		Iterator<Row> row = sheet.rowIterator();
		XSSFRow firstRow = (XSSFRow) row.next();
		Iterator<Cell> cellIterator = firstRow.cellIterator();
		while (cellIterator.hasNext()) {
			cell = (XSSFCell) cellIterator.next();
			colNum++;
		}

		closeWorkbook();
		return colNum;
	}

	public int getNumberOfColumns(String sheetIndex) {

		int colNum = 0;
		@SuppressWarnings("unused")
		XSSFCell cell = null;
		XSSFSheet sheet = null;
		sheet = workBook.getSheet(sheetIndex);
		Iterator<Row> row = sheet.rowIterator();
		XSSFRow firstRow = (XSSFRow) row.next();
		Iterator<Cell> cellIterator = firstRow.cellIterator();
		while (cellIterator.hasNext()) {
			cell = (XSSFCell) cellIterator.next();
			colNum++;
		}

		closeWorkbook();
		return colNum;
	}

	public int getNumberOfColumns(XSSFSheet sheet) {

		int colNum = 0;
		@SuppressWarnings("unused")
		XSSFCell cell = null;
		Iterator<Row> row = sheet.rowIterator();
		XSSFRow firstRow = (XSSFRow) row.next();
		Iterator<Cell> cellIterator = firstRow.cellIterator();
		while (cellIterator.hasNext()) {
			cell = (XSSFCell) cellIterator.next();
			colNum++;
		}

		// closeWorkbook();
		return colNum;
	}

	public int getNumberOfRows(int sheetIndex) {

		int rowNum = 0;
		XSSFSheet sheet = null;
		sheet = workBook.getSheetAt(sheetIndex);
		rowNum = sheet.getLastRowNum();
		closeWorkbook();
		return rowNum;
	}

	public int getNumberOfRows(String sheetIndex) {

		int rowNum = 0;
		XSSFSheet sheet = null;
		sheet = workBook.getSheet(sheetIndex);
		rowNum = sheet.getLastRowNum();
		closeWorkbook();
		return rowNum;
	}

	public int getNumberOfRowsFromSheet(String sheetName) {
		int rowNum = 0;
		// XSSFSheet sheet = null;
		rowNum = workBook.getSheet(sheetName).getLastRowNum();
		// closeWorkbook();
		return rowNum;
	}

	public int getLastRowNum(String sheetName) {
		int rowNum = 0;
		// XSSFSheet sheet = null;
		rowNum = workBook.getSheet(sheetName).getLastRowNum();
		// closeWorkbook();
		return rowNum;
	}

	public int getLastRowNum(XSSFSheet sheet) {
		int rowNum = 0;
		// XSSFSheet sheet = null;
		rowNum = sheet.getLastRowNum();
		// closeWorkbook();
		return rowNum;
	}

	public ArrayList<String> getSheetData(int sheetIndex) {

		XSSFRow row = null;
		XSSFCell cell = null;
		XSSFSheet sheet = null;
		ArrayList<String> data = null;

		sheet = workBook.getSheetAt(sheetIndex);
		data = new ArrayList<String>();
		Iterator<Row> rowIter = sheet.rowIterator();
		while (rowIter.hasNext()) {
			row = (XSSFRow) rowIter.next();

			Iterator<Cell> cellIter = row.cellIterator();
			while (cellIter.hasNext()) {
				cell = (XSSFCell) cellIter.next();
				data.add(cellToString(cell));

			}
		}
		closeWorkbook();
		return data;
	}

	public ArrayList<String> getColumnData(int sheetIndex, int column) {

		XSSFSheet sheet = null;
		ArrayList<String> columnData = null;

		sheet = workBook.getSheetAt(sheetIndex);
		Iterator<Row> rowIter = sheet.rowIterator();
		columnData = new ArrayList<String>();

		while (rowIter.hasNext()) {
			Row row = rowIter.next();

			Iterator<Cell> cellIter = row.cellIterator();
			while (cellIter.hasNext()) {
				XSSFCell cell = (XSSFCell) cellIter.next();
				if (cell.getColumnIndex() == column) {
					columnData.add(cellToString(cell));
				}

			}
		}
		closeWorkbook();
		return columnData;
	}

	public ArrayList<String> getColumnData(String sheetIndex, int column) {

		XSSFSheet sheet = null;
		ArrayList<String> columnData = null;

		sheet = workBook.getSheet(sheetIndex);
		Iterator<Row> rowIter = sheet.rowIterator();
		columnData = new ArrayList<String>();

		while (rowIter.hasNext()) {
			Row row = rowIter.next();

			Iterator<Cell> cellIter = row.cellIterator();
			while (cellIter.hasNext()) {
				XSSFCell cell = (XSSFCell) cellIter.next();
				if (cell.getColumnIndex() == column) {
					columnData.add(cellToString(cell));
				}

			}
		}
		// closeWorkbook();
		return columnData;
	}

	public ArrayList<String> getRowData(int sheetIndex, int rowNum) {

		XSSFRow row = null;
		XSSFCell cell = null;
		XSSFSheet sheet = null;
		ArrayList<String> rowData = null;

		sheet = workBook.getSheetAt(sheetIndex);
		rowData = new ArrayList<String>();
		Iterator<Row> rowIter = sheet.rowIterator();
		while (rowIter.hasNext()) {
			row = (XSSFRow) rowIter.next();

			Iterator<Cell> cellIter = row.cellIterator();
			while (cellIter.hasNext()) {
				cell = (XSSFCell) cellIter.next();
				rowData.add(cellToString(cell));

			}
		}
		closeWorkbook();
		return rowData;
	}

	public String getCellData(String sheetIndex, int rowNum, int colNum) {

		XSSFCell cell = null;
		XSSFSheet sheet = null;
		String cellData = "";

		sheet = workBook.getSheet(sheetIndex);
		cell = sheet.getRow(rowNum).getCell(colNum, Row.CREATE_NULL_AS_BLANK);
		cellData = cellToString(cell);

		return cellData;
	}

	public String getCellData(XSSFSheet sheet, int rowNum, int colNum) {

		XSSFCell cell = null;
		String cellData = "";

		cell = sheet.getRow(rowNum).getCell(colNum, Row.CREATE_NULL_AS_BLANK);
		cellData = cellToString(cell);

		return cellData;
	}

	public String getCellData(int sheetIndex, int rowNum, int colNum) {

		XSSFCell cell = null;
		XSSFSheet sheet = null;
		String cellData = "";

		sheet = workBook.getSheetAt(sheetIndex);
		cell = sheet.getRow(rowNum).getCell(colNum, Row.CREATE_NULL_AS_BLANK);
		cellData = cellToString(cell);

		return cellData;
	}

	public String getCellData(String sheetIndex, String value) {

		XSSFCell cell = null;
		XSSFSheet sheet = null;
		XSSFRow row = null;
		String cellData = "";

		sheet = workBook.getSheet(sheetIndex);
		Iterator<?> rowIterator = sheet.iterator();
		while (rowIterator.hasNext()) {
			row = (XSSFRow) rowIterator.next();
			cell = (XSSFCell) row.cellIterator().next();
			String label = cell.getStringCellValue();

			if (label.equalsIgnoreCase(value)) {

				System.out.println("Label : " + label);
				int colIndex = cell.getColumnIndex() + 1;
				int rowIndex = cell.getRowIndex();
				cellData = getCellData(sheetIndex, rowIndex, colIndex);
				System.out.println("ID : " + cellData);

			}

		}

		return cellData;
	}

	public String cellToString(XSSFCell cell) {
		int type;
		Object result = null;
		type = cell.getCellType();

		switch (type) {
		case XSSFCell.CELL_TYPE_NUMERIC:
			result = cell.getNumericCellValue() + "";
			break;

		case XSSFCell.CELL_TYPE_STRING:
			result = cell.getStringCellValue();
			break;

		case XSSFCell.CELL_TYPE_BLANK:
			result = "";
			break;

		case XSSFCell.CELL_TYPE_FORMULA:
			result = cell.getCellFormula();
			break;

		}
		return result.toString();
	}

}
