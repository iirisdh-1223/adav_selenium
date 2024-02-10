package com.orange.generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datadriventesting {
	public static String ddt(String sheet, int r , int c)
	{
		FileInputStream fis;
		Workbook book=null;
		try {
			fis=new FileInputStream("");
			book=WorkbookFactory.create(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Sheet sh = book.getSheet(sheet);
		Row ro = sh.getRow(r);
		Cell cel = ro.getCell(c);
		String value = cel.toString();
		return value;
	}
}
