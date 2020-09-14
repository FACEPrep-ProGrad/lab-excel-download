package service;

import java.io.FileOutputStream;
import java.io.IOException;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import model.Prograd;

//			Progression -1 
//Go to src/service. Open the ExcelGenerator and fill the logic inside the excelGenerate method.
//
//Stick to the instructions clearly. If you face any issue contact your mentor to get the guidance. 

public class ExcelGenerator {
	
	FileOutputStream out;
	public HSSFWorkbook excelGenerate(Prograd prograd, List<Prograd> list) throws IOException {
		try {


			
			// Type your code here
			HSSFWorkbook workbook = new HSSFWorkbook(); 

			HSSFSheet sheet = workbook.createSheet("Prograd Details");
			int rownum =0;
	        HSSFRow row = sheet.createRow(rownum++);
        	int cellnum = 0;
        	row.createCell(cellnum++).setCellValue("ID");
        	row.createCell(cellnum++).setCellValue("NAME");
        	row.createCell(cellnum++).setCellValue("RATINGS");
        	row.createCell(cellnum++).setCellValue("COMMENT");
        	row.createCell(cellnum++).setCellValue("RECOMMEND");
        	
        	
	        for(Prograd details: list) {
	        	
	        	row = sheet.createRow(rownum++);
	        	cellnum = 0;
	        	
	        	row.createCell(cellnum++).setCellValue((String)details.getId());
	        	row.createCell(cellnum++).setCellValue((String)details.getName());
	        	row.createCell(cellnum++).setCellValue((String)details.getRate());
	        	row.createCell(cellnum++).setCellValue((String)details.getComment());
	        	row.createCell(cellnum++).setCellValue((String)details.getRecommend());
		
			}
			// Do not modify the lines given below
			out = new FileOutputStream("D://ProgradDetails.xls");
			workbook.write(out);
			out.close();
			workbook.close();
			System.out.println("ProgradDetails.xls written successfully on disk.");
			return workbook;
		
			
			}
		catch (Exception e) {
				e.printStackTrace();
			}
		finally {
			out.close();
		}
		return null;
		
	}
}
