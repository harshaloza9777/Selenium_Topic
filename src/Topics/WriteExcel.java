package Topics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	 static XSSFFont font;
	 static XSSFCellStyle cs;
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub txt xlsx
		File file=new File("C:\\Users\\srika\\eclipse-workspace\\Selenium\\excel\\levitica.xlsx");
		 workbook=new XSSFWorkbook();
		 sheet=workbook.createSheet("Shree");
		
		 XSSFRow row;
		Cell cell;
		 
		row=sheet.createRow(0);
		cell=row.createCell(0);
		cell.setCellValue("S.NO");
		cell.setCellStyle(cs);
		
		
		
		cell=row.createCell(1);
		cell.setCellValue("Name");
		cell.setCellStyle(cs);
		
		cell=row.createCell(2);
		cell.setCellValue("marks");
		cell.setCellStyle(cs);
		
		row=sheet.createRow(1);
		cell=row.createCell(0);
		cell.setCellValue("001");
		
		cell=row.createCell(1);
		cell.setCellValue("Surendranath");
		
		
		cell=row.createCell(2);
		cell.setCellValue("10Mark");
		
		FileOutputStream ot=new FileOutputStream(file);
		workbook.write(ot);
		ot.flush();
		ot.close();
		
	
			}

}
