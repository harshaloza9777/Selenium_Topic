package Topics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class RedExcel {
	static XSSFRow row ;
	static XSSFCell cell;

	public static void main(String[] args) throws Exception {
		
		FileInputStream ip=new FileInputStream("C:\\Users\\srika\\.eclipse\\Selenium\\excel\\levitica.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(ip); 
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		row=sheet.getRow(0);
		 cell=row.getCell(0);
		System.out.println(sheet.getRow(0).getCell(0));
		
		row=sheet.getRow(1);
		cell=row.getCell(0);
		System.out.println(sheet.getRow(1).getCell(0));
	}

}
