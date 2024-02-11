package com.testdatareader;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadXlsFile {
	
	
	
	
	public static List<List<Object>> readXlsFile(String xlsFileName,String subsheetName)
	{
		List<List<Object>> mainList=new ArrayList<List<Object>>();
		
		try {
			
			String path=System.getProperty("user.dir")+"\\testdata\\"+xlsFileName;
			FileInputStream file=new FileInputStream(path);
			Workbook book=WorkbookFactory.create(file);
			Sheet sheet=book.getSheet(subsheetName);
			Iterator<Row> rowitr=sheet.rowIterator();	
			
			while(rowitr.hasNext())
			{
				
				List<Object> list=new ArrayList<Object>();
				
				Row rowdata=rowitr.next();
				
				Iterator<Cell> cellitr=rowdata.cellIterator();
			
				
				while(cellitr.hasNext())
				{
					
					Cell cell=cellitr.next();
					
					switch (cell.getCellType()) {
					case STRING:
						list.add(cell.getStringCellValue());
						break;

					case NUMERIC:
						
						list.add(cell.getNumericCellValue());
						break;
						
					case BOOLEAN:
						list.add(cell.getBooleanCellValue());
						break;
						
					case FORMULA:
						list.add(cell.getCellFormula());
						break;
						
					case BLANK:
						list.add("");
						break;
						default:
							System.out.println("None Of Above!!");
							break;
					}
					
				}
				mainList.add(list);
				
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mainList;
		
	}

}
