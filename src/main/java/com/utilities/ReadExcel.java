package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	@SuppressWarnings("resource")
	public static String ExcelDataReadMethod(int SheetNumber, int RowNumber, int CellNumber)
			throws IOException {
		File src = new File("C:\\Users\\vsingh\\eclipse-workspace\\Selenium\\src\\main\\java\\com\\TestData\\ExcelData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook excelWorkbook = new XSSFWorkbook(fis);
		XSSFSheet SheetName = excelWorkbook.getSheetAt(SheetNumber);
		String dataAtCell = SheetName.getRow(RowNumber).getCell(CellNumber).getStringCellValue();
		return dataAtCell;
	}
}