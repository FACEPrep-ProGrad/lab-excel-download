package service;

import java.io.FileOutputStream;
import java.io.IOException;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import model.ProGrad;

public class ExcelGenerator {
	
	
	FileOutputStream out;
	public HSSFWorkbook excelGenerate(ProGrad prograd, List<ProGrad> list) throws IOException {
		try {
                  String filename="D:\\.xls";
                  HSSFWorkbook hwb=new HSSFWorkbook();
                  HSSFSheet sheet=hwb.createSheet("sheet");
                  HSSFRow rowhead=sheet.createRow((short)0);
                  rowhead.createCell((short)0).setCellValue("name");
                  rowhead.createCell((short)1).setCellValue("id");
                  rowhead.createCell((short)2).setCellValue("rate");
                  rowhead.createCell((short)3).setCellValue("comment");
                  rowhead.createCell((short)4).setCellValue("recommend");
                  int i=0;
                  
                  for(ProGrad st: list) {
                	  
                	  int j=i+1;
                	  HSSFRow row=sheet.createRow((short)j);
                	  row.createCell((short)0).setCellValue(st.getName());
                	  row.createCell((short)1).setCellValue(st.getId());
                	  row.createCell((short)2).setCellValue(st.getRate());
                	  row.createCell((short)3).setCellValue(st.getComment());
                	  row.createCell((short)4).setCellValue(st.getRecommend());
                	  
                	  
			}
			// Do not modify the lines given below
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
