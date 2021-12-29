package com.epam.testNG.testcalculator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	public Object[][] DataForIspos() {
		Object[][] result = null;
		try {
			FileInputStream file = new FileInputStream(new File("C:\\Users\\Priyesh_Kumar\\Documents\\Book1.xlsx"));

			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();
			Integer rowCount = sheet.getPhysicalNumberOfRows();
			Integer colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			result = new Object[rowCount][colCount];
			Integer rowCounter = 0, colCounter = 0;
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				colCounter = 0;
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					result[rowCounter][colCounter] = (long) cell.getNumericCellValue();

					colCounter++;
				}
				rowCounter++;
			}
			return result;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return result;

	}

}
