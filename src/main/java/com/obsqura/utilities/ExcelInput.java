package com.obsqura.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import com.google.common.collect.Table.Cell;

public class ExcelInput {
	
	public static FileInputStream f1;
	public static XSSFWorkbook w1;
	public static XSSFSheet s1;
	
	public static String readStringData(int i,int j) throws IOException
	{
	f1=new FileInputStream("E:\\JavaTraining\\ExcelRead1.xlsx");
	w1=new XSSFWorkbook(f1);
	s1=w1.getSheet("Sheet1");
	Row r1=s1.getRow(i);
	Cell c1=r1.getCell(j);
    return c1.getStringCellValue();
	}
	public static String readIntegerData(int i,int j) throws IOException
	{
		f1=new FileInputStream("E:\\avaTraining\\ExcelRead1.xlsx");
		w1=new XSSFWorkbook(f1);
		s1=w1.getSheet("Sheet1");
		Row r1=s1.getRow(i);
		Cell c1=r1.getCell(j);
		return c1.getStringCellValue();
	}
	
	

}
