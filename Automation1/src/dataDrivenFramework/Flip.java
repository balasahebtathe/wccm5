package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flip {

	public String readexcel(String Excelpath, String SheetName, int rowCount, int cellCount) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(Excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		Row row = sh.getRow(rowCount);
		Cell cell = row.getCell(cellCount);	
		String data = cell.getStringCellValue();
		return data;
		}
	//generic reusable method to get row count
	public int getRowCount(String Excelpath, String SheetName) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream(Excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(SheetName);
	int rc=sh.getLastRowNum();
	return rc;
	}
	////generic reusable method to perform write operation
	public void writeExcel(String excelpath, String SheetName,int rowCount,int cellCount, String data) throws EncryptedDocumentException, IOException
	{
	FileInputStream fis = new FileInputStream(excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(SheetName);
	     Row row=sh.getRow(rowCount);
	     
	     Cell cell = row.createCell(cellCount);
	     cell.setCellValue(data);
	     FileOutputStream fos=new  FileOutputStream(excelpath);
	     wb.write(fos);
	     wb.close();
	     
	}
	public String readPropertyData(String proppath,String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(proppath);

		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;

	}
}
