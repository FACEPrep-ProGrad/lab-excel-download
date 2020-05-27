package service;
//
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;

import model.Prograd;

//			Progression -1 
//Go to src/service. Open the ExcelGenerator and fill the logic inside the excelGenerate method.
//
//Stick to the instructions clearly. If you face any issue contact your mentor to get the guidance. 

public class ExcelGenerator {
	
	FileOutputStream out;
	public HSSFWorkbook excelGenerate(Prograd prograd, List<Prograd> list) throws IOException {
		String[] arr = {"Name","Id","Rate","Comment","Recommend"};
		HSSFWorkbook hwb = new HSSFWorkbook();
		org.apache.poi.ss.usermodel.Sheet sheet = hwb.createSheet("prograd");
		
			// Type your code here
				
				
				Row heading = sheet.createRow(0);
				for(int i=0;i<arr.length;i++) {
					Cell cell = heading.createCell(i);
					cell.setCellValue(arr[i]);
				}
				int rown=1;
				for(Prograd p :list) {
					Row row = sheet.createRow(rown++);
					row.createCell(0).setCellValue(p.getName());
					row.createCell(1).setCellValue(p.getId());
					row.createCell(2).setCellValue(p.getComment());
					row.createCell(3).setCellValue(p.getRecommend());
				}
		
			
			// Do not modify the lines given below
			 out = new FileOutputStream("prograd.xls");
			hwb.write(out);
		
			return hwb;
			
	
		
		
	}
}
