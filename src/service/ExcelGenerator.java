package service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import model.Prograd;

//			Progression -1 
//Go to src/service. Open the ExcelGenerator and fill the logic inside the excelGenerate method.
//
//Stick to the instructions clearly. If you face any issue contact your mentor to get the guidance. 

public class ExcelGenerator {
	
	FileOutputStream out;
	String filename = "/home/academic/Desktop/newfile.xlsx";
	int rowcount = 0;
	FileWriter fw;
	public HSSFWorkbook excelGenerate(Prograd prograd, List<Prograd> list) throws IOException {
		try {

			HSSFWorkbook hwb = new HSSFWorkbook();
			 HSSFSheet sheet=hwb.createSheet("Feedback");	//fou
			//  HSSFSheet sheet=hwb.createSheet("Feedback");			
			//create a file
		//have file extension xlsx for the commented code
//			
//			 Row row = sheet.createRow(++rowcount);
//			 Cell cell = row.createCell(++columnCount);
//             cell.setCellValue("Test");
			for(Prograd listitem:list) {
				Row row = sheet.createRow(++rowcount);
				 int columnCount = 0;
		                	Cell cell1 = row.createCell(++columnCount);
		                    cell1.setCellValue(listitem.getName()); 
		                    Cell cell2 = row.createCell(++columnCount);
		                    cell2.setCellValue(listitem.getId());
		                    Cell cell3 = row.createCell(++columnCount);
		                    cell3.setCellValue(listitem.getRate());
		                    Cell cell4 = row.createCell(++columnCount);
		                    cell4.setCellValue(listitem.getComment());
		                    Cell cell5 = row.createCell(++columnCount);
		                    cell5.setCellValue(listitem.getRecommend());
		         
			}
//			fw = new FileWriter(filename);
//			fw.append("name,id,rate,comment,recommend\n");
//			for(Prograd listitem:list) {
//				fw.append(String.join(",", listitem.getName()));
//				fw.append(String.join(",", listitem.getId()));
//				fw.append(String.join(",", listitem.getRate()));
//				fw.append(String.join(",", listitem.getComment()));
//				fw.append(String.join(",", listitem.getRecommend()));
//				fw.append("\n");
//			}
			// Do not modify the lines given belo
			 out = new FileOutputStream(filename);
			hwb.write(out);
		
			return hwb;
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
