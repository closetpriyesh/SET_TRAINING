package com.epam.testNG.testcalculator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class ReadFromCSV {

	Object[][] result;

	public Object[][] dataForPosdiv() {

		try {
			CSVReader csvReader = new CSVReader(new FileReader("C:\\Users\\Priyesh_Kumar\\Documents\\Book2.csv"));
			String rowData[];
			int rowCount = 0;
			int colCount = 0;
			result = new Object[getRowCount()][getColCount()];
			while ((rowData = csvReader.readNext()) != null) {
				rowData[0] = rowData[0].replace("ï»¿", "");
				for (String s : rowData) {
					result[rowCount][colCount] = Long.parseLong(s);
					colCount++;
				}
				rowCount++;
				colCount = 0;
			}

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CsvValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;

	}

	private int getRowCount() {
		int rowCount = 0;
		try {
			BufferedReader csvReader = new BufferedReader(
					new FileReader("C:\\Users\\Priyesh_Kumar\\Documents\\Book2.csv"));
			rowCount = 0;

			String row;
			rowCount = 0;
			while ((row = csvReader.readLine()) != null) {
				rowCount++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rowCount;
	}

	private int getColCount() {

		int colCount = 0;
		try {
			BufferedReader csvReader = new BufferedReader(
					new FileReader("C:\\Users\\Priyesh_Kumar\\Documents\\Book2.csv"));
			colCount = 0;

			String row = csvReader.readLine();
			colCount = 0;
			String[] data = row.split(",");
			for (String s : data) {
				colCount++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return colCount;

	}

}
