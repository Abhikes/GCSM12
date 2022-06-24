package com.framework.dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFetch {
	public String FetchExcelData(String sheetName,int row,int cell) throws Throwable
	{
		 FileInputStream fis = new FileInputStream("D:\\GCCA22\\Book1.xlsx");
		 Workbook book = WorkbookFactory.create(fis);
		 DataFormatter format = new DataFormatter();
		return format.formatCellValue(book.getSheet(sheetName).getRow(row).getCell(cell));
		 
	}

}
