package com.charm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel {
	
	public static FileInputStream fis;
	public static Workbook wb;
	static Properties prop = new Properties();
	
	public static String data;
	
	
	public static String getexcel(String sheetName,int rowNo , int colNo){  
		
			
			try {
				prop.load(new FileInputStream("./resources/conf/test.properties"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fis = new FileInputStream(prop.getProperty("Excel"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				wb=WorkbookFactory.create(fis);
			} catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvalidFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Sheet sh = wb.getSheet(sheetName);
			Row rw = sh.getRow(rowNo);
			 data = rw.getCell(colNo).getStringCellValue();
			
			
			
			
		
		return data;
	}
	
	

}
