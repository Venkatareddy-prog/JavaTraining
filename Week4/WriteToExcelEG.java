package com.dbeg.week4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcelEG {
	// create work book
	// create a new sheet
	// create row
	// in above row create cell and set some value
	// write above excel to a file
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("firstexcel.xlsx");
		Workbook wbook = new XSSFWorkbook();
		Sheet s = wbook.createSheet();
		Row row = s.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Hello Worl");

		wbook.write(fos);
		wbook.close();
		fos.close();

	}

}