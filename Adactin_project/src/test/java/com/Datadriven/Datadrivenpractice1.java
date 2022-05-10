package com.Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadrivenpractice1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\DELL\\Documents\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook();
		Sheet mysheet = wb.createSheet("data1");

		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		Row row0 = mysheet.createRow(0);
		Cell cell1 = row0.createCell(0);
		Cell cell2 = row0.createCell(1);
		Cell cell3 = row0.createCell(2);

		cell1.setCellValue("studentname");
		wb.getSheet("data1").createRow(5).createCell(0).setCellValue(true);
		wb.getSheet("data1").createRow(6).createCell(0).setCellValue("doctor");
		wb.getSheet("data1").createRow(7).createCell(0).setCellValue(false);
		wb.getSheet("data1").createRow(8).createCell(0).setCellValue("lawyer");

		cell2.setCellValue("studentid");
		wb.getSheet("data1").createRow(1).createCell(1).setCellValue("id1");
		wb.getSheet("data1").createRow(2).createCell(1).setCellValue("id2");
		wb.getSheet("data1").createRow(3).createCell(1).setCellValue("id3");

		Row row01 = wb.getSheet("data1").getRow(0);
		Cell cell11 = row01.getCell(2);
		System.out.println(cell11);

		CellType celltype = cell11.getCellType();

		if (celltype.equals(celltype.STRING)) {
			String stringCellValue = cell11.getStringCellValue();
			System.out.println("string value" + stringCellValue);
		}

		else if (celltype.equals(celltype.NUMERIC)) {
			double numericCellValue = cell11.getNumericCellValue();
			System.out.println(numericCellValue);
		}

		int rowcount = mysheet.getPhysicalNumberOfRows();

		for (int i = 0; i < rowcount; i++) {
			Row row22 = mysheet.getRow(i);
			int cells = row22.getPhysicalNumberOfCells();
			for (int j = 0; j < cells; j++) {
				String cellvalue = row22.getCell(j).getStringCellValue();
				System.out.println(cellvalue);
			}
			System.out.println();
		}
	}
}